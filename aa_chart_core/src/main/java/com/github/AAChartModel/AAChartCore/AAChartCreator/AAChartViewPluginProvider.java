/**
 * AAChartViewPluginProvider.java
 * AAChartCore
 *
 * Created by AnAn on 2025/10/3.
 * Copyright © 2025年 An An. All rights reserved.
 *
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
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
import android.util.Log;

import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// MARK: - Shared Plugin Script Definition (Standard Version)

/**
 * Enum representing available plugin scripts for standard version
 */
enum AAChartPluginScriptType {
    FUNNEL("AAFunnel"),
    HIGHCHARTS_MORE("AAHighcharts-More");

    private final String rawValue;

    AAChartPluginScriptType(String rawValue) {
        this.rawValue = rawValue;
    }

    public String getRawValue() {
        return rawValue;
    }

    /**
     * Returns the complete JavaScript file name with .js extension
     */
    public String getFileName() {
        return rawValue + ".js";
    }
}

// MARK: - Plugin Provider Protocol

/**
 * Protocol defining the responsibility for providing required plugin paths
 */
interface AAChartViewPluginProviderProtocol {
    Set<String> getRequiredPluginPaths(AAOptions options);
}

// MARK: - Default Plugin Provider

/**
 * Default provider (can be used for the standard version or as a base)
 */
class AAChartViewDefaultPluginProvider implements AAChartViewPluginProviderProtocol {
    public AAChartViewDefaultPluginProvider() {}

    @Override
    public Set<String> getRequiredPluginPaths(AAOptions options) {
        return new HashSet<>();
    }
}

// MARK: - Plugin Provider for Standard Version

/**
 * Provider for the standard version, handling specific chart type plugins
 */
public class AAChartViewPluginProvider implements AAChartViewPluginProviderProtocol {
    private final AAChartBundlePathLoadingProtocol bundlePathLoader;

    public AAChartViewPluginProvider(Context context) {
        this.bundlePathLoader = new BundlePathLoader(context);
    }

    public AAChartViewPluginProvider(AAChartBundlePathLoadingProtocol bundlePathLoader) {
        this.bundlePathLoader = bundlePathLoader;
    }

    /**
     * Plugin configuration structure
     */
    private static class AAChartPluginConfiguration {
        final Set<String> types;
        final List<AAChartPluginScriptType> scripts;

        AAChartPluginConfiguration(String[] types, AAChartPluginScriptType[] scripts) {
            this.types = new HashSet<>(Arrays.asList(types));
            this.scripts = Arrays.asList(scripts);
        }
    }

    /**
     * Plugin configurations for standard version chart types
     */
    private static final List<AAChartPluginConfiguration> pluginConfigurations = Arrays.asList(
        // --- Funnel & Pyramid Charts ---
        new AAChartPluginConfiguration(
            new String[] { AAChartType.Funnel, AAChartType.Pyramid },
            new AAChartPluginScriptType[] { AAChartPluginScriptType.FUNNEL }
        ),
        
        // --- Advanced Charts requiring Highcharts-More ---
        new AAChartPluginConfiguration(
            new String[] {
                AAChartType.Columnpyramid,
                AAChartType.Bubble,
                AAChartType.Packedbubble,
                AAChartType.Arearange,
                AAChartType.Areasplinerange,
                AAChartType.Columnrange,
                AAChartType.Gauge,
                AAChartType.Boxplot,
                AAChartType.Errorbar,
                AAChartType.Waterfall,
                AAChartType.Polygon
            },
            new AAChartPluginScriptType[] { AAChartPluginScriptType.HIGHCHARTS_MORE }
        )
    );

    @Override
    public Set<String> getRequiredPluginPaths(AAOptions options) {
        Set<String> requiredPaths = new HashSet<>();

        // Check for plugins based on AAOptions properties
        addChartPluginScripts(options, requiredPaths);

        // Check for plugins based on the main chart type
        if (options.chart != null && options.chart.type != null) {
            addChartPluginScripts(options.chart.type, requiredPaths);
        }

        // Check for plugins based on individual series types
        if (options.series != null) {
            for (Object seriesElement : options.series) {
                if (seriesElement instanceof AASeriesElement) {
                    AASeriesElement element = (AASeriesElement) seriesElement;
                    String seriesType = element.type;
                    if (seriesType != null) {
                        addChartPluginScripts(seriesType, requiredPaths);
                    }
                }
            }
        }

        return requiredPaths;
    }

    /**
     * Helper to add scripts based on chart type string
     */
    private void addChartPluginScripts(String chartType, Set<String> requiredPaths) {
        if (chartType == null) {
            return;
        }

        Set<AAChartPluginScriptType> scripts = new HashSet<>();
        for (AAChartPluginConfiguration configuration : pluginConfigurations) {
            if (configuration.types.contains(chartType)) {
                scripts.addAll(configuration.scripts);
            }
        }

        for (AAChartPluginScriptType script : scripts) {
            String scriptPath = generateScriptPath(script);
            if (scriptPath != null) {
                requiredPaths.add(scriptPath);
            }
        }
    }

    /**
     * Helper to add scripts based on specific AAOptions properties
     */
    private void addChartPluginScripts(AAOptions options, Set<String> requiredPaths) {
        // For polar charts, Highcharts-More is required
        if (options.chart != null && Boolean.TRUE.equals(options.chart.polar)) {
            String scriptPath = generateScriptPath(AAChartPluginScriptType.HIGHCHARTS_MORE);
            if (scriptPath != null) {
                requiredPaths.add(scriptPath);
            }
        }
    }

    /**
     * Generates the full path for a given script name
     */
    private String generateScriptPath(AAChartPluginScriptType script) {
        String scriptName = script.getRawValue();
        String fullScriptName = script.getFileName();
        // Plugin files are directly in assets folder, not in a subdirectory
        String path = bundlePathLoader.path(scriptName, "js", null, null);
        
        if (path == null) {
            Log.w("AAChartView", "⚠️ Warning: Could not find path for script '" + fullScriptName + "'");
            return null;
        }
        
        return path;
    }
}

// MARK: - Bundle Path Loader Abstraction

/**
 * Protocol for loading bundle paths
 */
interface AAChartBundlePathLoadingProtocol {
    String path(String name, String type, String inDirectory, String forLocalization);
}

/**
 * Default implementation of bundle path loader
 */
class BundlePathLoader implements AAChartBundlePathLoadingProtocol {
    private final Context context;

    public BundlePathLoader(Context context) {
        this.context = context;
    }

    @Override
    public String path(String name, String type, String inDirectory, String forLocalization) {
        try {
            // Build the asset path
            String assetPath;
            if (inDirectory != null && !inDirectory.isEmpty()) {
                assetPath = inDirectory + "/" + name + "." + type;
            } else {
                assetPath = name + "." + type;
            }
            
            // Check if the file exists in assets
            InputStream inputStream = context.getAssets().open(assetPath);
            inputStream.close();
            
            // Return the asset path that can be used later
            return assetPath;
        } catch (Exception e) {
            return null;
        }
    }
}
