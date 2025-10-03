/**
 * AAChartViewPluginLoader.java
 * AAChartCore
 *
 * Created by AnAn on 2025/10/3.
 * Copyright © 2025年 An An. All rights reserved.
 *
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCor            @Override
            public void onReceiveValue(String value) {
                if (error != null) {
                    Log.w("AAChartView", "☠️☠️💀☠️☠️ [PluginLoader] JS WARNING: " + error);
                }
            }in     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 *
 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------
 */

package com.github.AAChartModel.AAChartCore.AAChartCreator;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// MARK: - Plugin Loader Protocol

/**
 * Protocol defining the plugin loader responsibilities
 */
interface AAChartViewPluginLoaderProtocol {
    /**
     * Configures the loader with options to determine required plugins and scripts.
     */
    void configure(AAOptions options);

    /**
     * Loads necessary plugins if they haven't been loaded yet.
     */
    void loadPluginsIfNeeded(
        WebView webView,
        Set<String> userPlugins,
        Map<String, String> dependencies,
        Runnable completion
    );

    /**
     * Executes the pre-draw JavaScript script.
     */
    void executeBeforeDrawScript(WebView webView);

    /**
     * Executes the post-draw JavaScript script.
     */
    void executeAfterDrawScript(WebView webView);
}

// MARK: - Default Plugin Loader

/**
 * Default loader for standard version (does nothing)
 */
class AAChartViewDefaultPluginLoader implements AAChartViewPluginLoaderProtocol {
    public AAChartViewDefaultPluginLoader() {}

    @Override
    public void configure(AAOptions options) {
        // No configuration needed for default
    }

    @Override
    public void loadPluginsIfNeeded(
        WebView webView,
        Set<String> userPlugins,
        Map<String, String> dependencies,
        Runnable completion
    ) {
        Log.i("AAChartView", "ℹ️ DefaultPluginLoader: No plugins to load.");
        completion.run(); // Immediately complete
    }

    @Override
    public void executeBeforeDrawScript(WebView webView) {
        // No pre-draw script for default
    }

    @Override
    public void executeAfterDrawScript(WebView webView) {
        // No post-draw script for default
    }
}

// MARK: - Standard Plugin Loader

/**
 * Loader for standard version, handling plugin loading and scripts
 */
public class AAChartViewPluginLoader implements AAChartViewPluginLoaderProtocol {
    private final AAChartViewPluginProviderProtocol pluginProvider;
    private final Context context;
    private static final LruCache<String, String> scriptCache = new LruCache<>(64);
    private final ExecutorService pluginIOExecutor = Executors.newSingleThreadExecutor();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    
    private Set<String> requiredPluginPaths = new HashSet<>();
    private Set<String> loadedPluginPaths = new HashSet<>();
    private String beforeDrawScript;
    private String afterDrawScript;

    public AAChartViewPluginLoader(Context context, AAChartViewPluginProviderProtocol provider) {
        this.context = context;
        this.pluginProvider = provider;
    }

    @Override
    public void configure(AAOptions options) {
        requiredPluginPaths = pluginProvider.getRequiredPluginPaths(options);
        
        List<String> pluginNames = new ArrayList<>();
        for (String path : requiredPluginPaths) {
            String[] parts = path.split("/");
            pluginNames.add(parts[parts.length - 1]);
        }
        debugLog("🔌 [PluginLoader] Determined requiredPluginPaths: " + pluginNames);

        beforeDrawScript = options.beforeDrawChartJavaScript;
        options.beforeDrawChartJavaScript = null;

        afterDrawScript = options.afterDrawChartJavaScript;
        options.afterDrawChartJavaScript = null;
    }

    @Override
    public void loadPluginsIfNeeded(
        final WebView webView,
        Set<String> userPlugins,
        Map<String, String> dependencies,
        final Runnable completion
    ) {
        Set<String> totalRequiredPluginsSet = new HashSet<>(requiredPluginPaths);
        totalRequiredPluginsSet.addAll(userPlugins);
        
        final Set<String> pluginsToLoad = new HashSet<>(totalRequiredPluginsSet);
        pluginsToLoad.removeAll(loadedPluginPaths);

        if (pluginsToLoad.isEmpty()) {
            if (totalRequiredPluginsSet.isEmpty()) {
                debugLog("ℹ️ [PluginLoader] No additional plugins needed.");
            } else {
                debugLog("ℹ️ [PluginLoader] All required plugins (count: " + totalRequiredPluginsSet.size() + ") already loaded.");
            }
            completion.run();
            return;
        }

        debugLog("ℹ️ [PluginLoader] Preparing to load " + pluginsToLoad.size() + " new plugin scripts...");
        
        loadAndEvaluateCombinedPluginScript(
            webView,
            pluginsToLoad,
            dependencies,
            new PluginLoadCallback() {
                @Override
                public void onComplete(Set<String> successfullyLoadedPlugins) {
                    loadedPluginPaths.addAll(successfullyLoadedPlugins);

                    if (successfullyLoadedPlugins.size() < pluginsToLoad.size()) {
                        Log.w("AAChartView", "⚠️ [PluginLoader] One or more plugin script files could not be read, or the combined script evaluation failed.");
                    } else if (!successfullyLoadedPlugins.isEmpty()) {
                        Log.i("AAChartView", "✅ [PluginLoader] " + successfullyLoadedPlugins.size() + " new plugin scripts loaded and evaluated successfully.");
                    }
                    Log.i("AAChartView", "ℹ️ [PluginLoader] Total loaded plugins count: " + loadedPluginPaths.size());
                    completion.run();
                }
            }
        );
    }

    @Override
    public void executeBeforeDrawScript(WebView webView) {
        if (beforeDrawScript == null) {
            return;
        }

        debugLog("📝 [PluginLoader] Executing BeforeDrawScript...");
        safeEvaluateJavaScriptString(webView, beforeDrawScript);
        beforeDrawScript = null; // Execute only once
    }

    @Override
    public void executeAfterDrawScript(WebView webView) {
        if (afterDrawScript == null) {
            return;
        }

        debugLog("📝 [PluginLoader] Executing AfterDrawScript...");
        safeEvaluateJavaScriptString(webView, afterDrawScript);
        afterDrawScript = null; // Execute only once
    }

    // MARK: - Helper Methods

    /**
     * Basic plugin dependencies for standard version
     * Maps plugin filename to its dependency filename
     */
    private static final Map<String, String> pluginDependencies = new HashMap<>();
    
    /**
     * Priority plugins that should be loaded first (standard version)
     */
    private static final List<String> priorityPlugins = Arrays.asList(
        "AAFunnel.js",
        "AAHighcharts-More.js"
    );

    /**
     * Helper function to sort plugin paths based on known dependencies
     */
    private List<String> sortPluginPaths(Set<String> paths, Map<String, String> externalDependencies) {
        List<String> sortedPaths = new ArrayList<>(paths);
        
        // Use internal dependencies (empty for standard version, but kept for structure)
        final Map<String, String> dependencies = new HashMap<>(pluginDependencies);
        
        // Merge external dependencies if provided
        if (externalDependencies != null) {
            dependencies.putAll(externalDependencies);
        }

        Collections.sort(sortedPaths, new Comparator<String>() {
            @Override
            public int compare(String path1, String path2) {
                String file1 = getFileName(path1);
                String file2 = getFileName(path2);

                // Check explicit dependencies
                String dep2 = dependencies.get(file2);
                if (dep2 != null && dep2.equals(file1)) {
                    return -1;
                }
                String dep1 = dependencies.get(file1);
                if (dep1 != null && dep1.equals(file2)) {
                    return 1;
                }
                
                // Check priority plugins
                for (String priorityFileName : priorityPlugins) {
                    if (file1.equals(priorityFileName) && !file2.equals(priorityFileName)) {
                        return -1;
                    }
                    if (file2.equals(priorityFileName) && !file1.equals(priorityFileName)) {
                        return 1;
                    }
                }

                return path1.compareTo(path2);
            }
        });

        if (paths.size() > 1) {
            List<String> initialNames = new ArrayList<>();
            for (String path : paths) {
                initialNames.add(getFileName(path));
            }
            Collections.sort(initialNames);
            
            List<String> sortedNames = new ArrayList<>();
            for (String path : sortedPaths) {
                sortedNames.add(getFileName(path));
            }
            
            if (!initialNames.equals(sortedNames)) {
                debugLog("🔩 [PluginLoader] Sorted plugin load order: " + sortedNames);
            }
        }

        return sortedPaths;
    }

    /**
     * Function to load and evaluate scripts as a single combined batch
     */
    private void loadAndEvaluateCombinedPluginScript(
        final WebView webView,
        Set<String> scriptsToLoad,
        Map<String, String> dependencies,
        final PluginLoadCallback completion
    ) {
        if (scriptsToLoad.isEmpty()) {
            completeOnMainThread(new HashSet<String>(), completion);
            return;
        }

        final List<String> sortedScriptPaths = sortPluginPaths(scriptsToLoad, dependencies);

        pluginIOExecutor.execute(new Runnable() {
            @Override
            public void run() {
                if (webView == null) {
                    debugLog("⚠️ [PluginLoader] WebView was deallocated before evaluating plugin scripts. Skipping.");
                    completeOnMainThread(new HashSet<String>(), completion);
                    return;
                }

                StringBuilder combinedJSString = new StringBuilder();
                final Set<String> successfullyReadPaths = new HashSet<>();

                for (String path : sortedScriptPaths) {
                    String scriptName = getFileName(path);
                    String scriptBody = readPluginScript(path, scriptName);
                    
                    if (scriptBody == null) {
                        continue;
                    }

                    combinedJSString.append("// --- Start: ").append(scriptName).append(" ---\n");
                    combinedJSString.append(scriptBody);
                    combinedJSString.append("\n// --- End: ").append(scriptName).append(" ---\n\n");
                    successfullyReadPaths.add(path);
                }

                if (combinedJSString.length() == 0) {
                    debugLog("⚠️ [PluginLoader] No plugin script content could be read. Nothing to evaluate.");
                    completeOnMainThread(new HashSet<String>(), completion);
                    return;
                }

                debugLog("ℹ️ [PluginLoader] Evaluating combined plugin scripts (" + successfullyReadPaths.size() + " files)...");

                final String finalScript = combinedJSString.toString();
                evaluateOnMainThread(webView, finalScript, new EvaluationCallback() {
                    @Override
                    public void onComplete(String error) {
                        if (error != null) {
                            debugLog("❌ [PluginLoader] Error evaluating combined plugin scripts:\n" +
                                    "--------------------------------------------------\n" +
                                    "Error: " + error + "\n" +
                                    "--------------------------------------------------");
                            completeOnMainThread(new HashSet<String>(), completion);
                        } else {
                            completeOnMainThread(successfullyReadPaths, completion);
                        }
                    }
                });
            }
        });
    }

    /**
     * Safe evaluate JavaScript string
     */
    private void safeEvaluateJavaScriptString(final WebView webView, final String jsString) {
        evaluateOnMainThread(webView, jsString, new EvaluationCallback() {
            @Override
            public void onComplete(String error) {
                if (error != null) {
                    Log.w("AAChartView", "☠️☠️💀☠️☠️ [PluginLoader] JS WARNING: " + error);
                }
            }
        });
    }

    /**
     * Debug log helper
     */
    private void debugLog(String message) {
        Log.d("AAChartView", message);
    }

    /**
     * Evaluate on main thread
     */
    private void evaluateOnMainThread(final WebView webView, final String javaScript, final EvaluationCallback callback) {
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    // API 19+: Use evaluateJavascript with callback support
                    webView.evaluateJavascript(javaScript, new ValueCallback<String>() {
                        @Override
                        public void onReceiveValue(String value) {
                            callback.onComplete(null);
                        }
                    });
                } else {
                    // API < 19: Use loadUrl (no return value support)
                    webView.loadUrl("javascript:" + javaScript);
                    // Complete immediately since loadUrl doesn't provide callback
                    callback.onComplete(null);
                }
            }
        });
    }

    /**
     * Read plugin script from assets
     */
    private String readPluginScript(String path, String scriptName) {
        String cachedScript = scriptCache.get(path);
        if (cachedScript != null) {
            return cachedScript;
        }

        try {
            InputStream inputStream = context.getAssets().open(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder jsString = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                jsString.append(line).append("\n");
            }
            
            reader.close();
            inputStream.close();
            
            String scriptContent = jsString.toString();
            scriptCache.put(path, scriptContent);
            return scriptContent;
        } catch (Exception e) {
            debugLog("❌ [PluginLoader] Failed to read plugin script file '" + scriptName + "': " + e.getMessage() + ". Skipping.");
            return null;
        }
    }

    /**
     * Complete on main thread
     */
    private void completeOnMainThread(final Set<String> result, final PluginLoadCallback completion) {
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                completion.onComplete(result);
            }
        });
    }

    /**
     * Get file name from path
     */
    private String getFileName(String path) {
        String[] parts = path.split("/");
        return parts[parts.length - 1];
    }

    // MARK: - Callback Interfaces

    interface PluginLoadCallback {
        void onComplete(Set<String> successfullyLoadedPlugins);
    }

    interface EvaluationCallback {
        void onComplete(String error);
    }
}
