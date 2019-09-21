/**
//  AAChartModel.java
//  AAChartCore
//
//  Created by AnAn on 2017/9/8..
//  Copyright © 2018年 An An. All rights reserved.

 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉


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

package com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AAChartView extends WebView {

    public interface AAChartViewCallBack {
        void chartViewDidFinishedLoad(AAChartView aaChartView);
        void chartViewMoveOverEventMessage(AAChartView aaChartView,AAMoveOverEventMessageModel messageModel);
    }

    public Float contentWidth;
    public Float contentHeight;
    public Boolean chartSeriesHidden;
    public AAChartViewCallBack callBack;

    public void setContentWidth(Float contentWidth) {
        this.contentWidth = contentWidth;
        String jsStr = "setTheChartViewContentWidth('" + this.contentWidth + "')";
        safeEvaluateJavaScriptString(jsStr);
    }

    public void setContentHeight(Float contentHeight) {
        this.contentHeight = contentHeight;
        String jsStr = "setTheChartViewContentHeight('" + this.contentHeight + "')";
        safeEvaluateJavaScriptString(jsStr);
    }


    public void setChartSeriesHidden(Boolean chartSeriesHidden) {
        this.chartSeriesHidden = chartSeriesHidden;
        String jsStr = "setChartSeriesHidden('" + this.chartSeriesHidden + "')";
        safeEvaluateJavaScriptString(jsStr);
    }


    private String optionsJson;

    public AAChartView(Context context) {
        super(context);
        sharedConstructor();
    }

    public AAChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
        sharedConstructor();
    }

    public AAChartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        sharedConstructor();
    }

    private void sharedConstructor() {
        // Do some initialize work.
        this.contentWidth = 320.f;
        this.contentHeight = 350.f;
        this.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.setWebContentsDebuggingEnabled(true);
        }
        //把当前对象作为androidObject别名传递给js
        //js通过window.androidObject.androidMethod()就可以直接调用安卓的androidMethod方法
        this.addJavascriptInterface(this, "androidObject");
    }


    //js调用安卓，必须加@JavascriptInterface注释的方法才可以被js调用
    @JavascriptInterface
    public String androidMethod(String message) {
        Gson gson = new Gson();
        Map messageBody = new HashMap<String, Object>();
        messageBody = gson.fromJson(message, messageBody.getClass());
        AAMoveOverEventMessageModel eventMessageModel = getEventMessageModel(messageBody);
        if (callBack != null) {
            callBack.chartViewMoveOverEventMessage(this,eventMessageModel);
        }
        System.out.println("显示总共调用了几次");

        return "";
    }

    AAMoveOverEventMessageModel getEventMessageModel(Map messageBody) {
        AAMoveOverEventMessageModel eventMessageModel =  new AAMoveOverEventMessageModel();
        eventMessageModel.name = messageBody.get("name").toString();
        eventMessageModel.x = (Double) messageBody.get("x");
        eventMessageModel.y = (Double) messageBody.get("y");
        eventMessageModel.category = messageBody.get("category").toString();
        eventMessageModel.offset = (LinkedTreeMap) messageBody.get("offset");
        eventMessageModel.index = (Double) messageBody.get("index");
        return eventMessageModel;
    }

    public void aa_drawChartWithChartModel(final AAChartModel chartModel) {
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(chartModel);
        this.aa_drawChartWithChartOptions(aaOptions);
    }

    public void aa_onlyRefreshTheChartDataWithChartModelSeriesArray(AASeriesElement[] seriesElementsArr){
        this.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr);
    }

    public void aa_refreshChartWithChartModel(AAChartModel chartModel) {
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(chartModel);
        this.aa_refreshChartWithChartOptions(aaOptions);
    }

    public void aa_drawChartWithChartOptions(final AAOptions chartOptions) {
        if (this.optionsJson != null) {
            this.aa_refreshChartWithChartOptions(chartOptions);
        } else {
            this.loadUrl("file:///android_asset/AAChartView.html");
            this.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageFinished(WebView view,String url) {
                    System.out.println("图表加载完成!!!!!!!! ");
                    if (callBack != null) {
                        callBack.chartViewDidFinishedLoad(AAChartView.this);
                    }
                    configureChartOptionsAndDrawChart(chartOptions);
                }

                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    super.shouldOverrideUrlLoading(view, request);
                    String urlStr = request.getUrl().toString();
                    String jsBridgeName = "AAChartViewBridge".toLowerCase();
                    if (urlStr.startsWith(jsBridgeName)) {
                        String message = urlStr.replace(jsBridgeName +"://?","");
                        Gson gson = new Gson();
                        Map messageBody = new HashMap<String, Object>();
                        messageBody = gson.fromJson(message, messageBody.getClass());
                    }

                    return false;
                }
            });


            this.setWebChromeClient(new WebChromeClient() {
                @Override
                public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
                    super.onJsAlert(view, url, message, result);

//                    String jsResultStr = new Gson().toJson(result);
                    String urlStr = "url --->" + url + "\n\n\n";
                    String messageStr = "message --->" + message + "\n\n\n";
                    String resultStr = "result --->" + result;

                    String alertMessageStr = urlStr + messageStr + resultStr;

                    new AlertDialog.Builder(getContext()).setTitle("JavaScript alert Information")//设置对话框标题
                            .setMessage(alertMessageStr)
                            .setPositiveButton("sure", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .show();

                    return true;
                }
            });
        }
    }

    public void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] seriesElementsArr) {
        // 将对象编译成json
        Gson gson = new Gson();
        String seriesArr = gson.toJson(seriesElementsArr);
        String javaScriptStr = "onlyRefreshTheChartDataWithSeries('" + seriesArr + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_refreshChartWithChartOptions(AAOptions chartOptions) {
        // 将对象编译成json
        Gson gson = new Gson();
        String aaOptionsJsonStr = gson.toJson(chartOptions);
        String javaScriptStr = "loadTheHighChartView('" + aaOptionsJsonStr + "','" + contentWidth + "','" + contentHeight + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public  void aa_updateChartWithOptions(Object options, Boolean redraw) {
        String classNameStr = options.getClass().getSimpleName();
        classNameStr = classNameStr.replace("AA","");

        //convert fist character to be lowercase string
        String firstChar = classNameStr.substring(0,1);
        String lowercaseFirstStr = firstChar.toLowerCase();
        classNameStr = classNameStr.substring(1);
        String finalClassName = lowercaseFirstStr + classNameStr;

        Map finalOptionsMap = new HashMap();
        finalOptionsMap.put(finalClassName,options);

        String optionsStr = new Gson().toJson(finalOptionsMap);
        String javaScriptStr = "updateChart('" + optionsStr + "','" + redraw + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_addPointToChartSeriesElement(Integer elementIndex, Object options) {
        aa_addPointToChartSeriesElement(elementIndex, options,true);
    }

    public void aa_addPointToChartSeriesElement(Integer elementIndex, Object options, Boolean shift) {
        aa_addPointToChartSeriesElement(elementIndex, options,true, shift,true);
    }


    public void aa_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options,
            Boolean redraw,
            Boolean shift,
            Boolean animation) {
        String optionsStr;
        if (options instanceof Integer || options instanceof Float || options instanceof Double) {
            optionsStr = String.valueOf(options);
        } else if (options instanceof Array || options instanceof List) {
            optionsStr = new Gson().toJson(options);
        } else  {
            optionsStr = new Gson().toJson(options);
        }

        String javaScriptStr = "addPointToChartSeries('" + elementIndex + "','" + optionsStr + "','" + redraw + "','" + shift + "','" + animation + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

        public void aa_showTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "showTheSeriesElementContentWithIndex('" + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_hideTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "hideTheSeriesElementContentWithIndex('" + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    private void configureChartOptionsAndDrawChart(AAOptions chartOptions) {
        // 将对象编译成json
        Gson gson = new Gson();
        String aaOptionsJsonStr = gson.toJson(chartOptions);
        String javaScriptStr = "loadTheHighChartView('" + aaOptionsJsonStr + "','" + 420 + "','" + 580 + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    private void safeEvaluateJavaScriptString(String javaScriptString) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.evaluateJavascript("javascript:"+javaScriptString, new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String s) {
                    Log.i("回调信息","输出打印查看回调的结果"+s);
                }

            });
        } else {
            this.loadUrl("javascript:"+javaScriptString);
        }
    }




}
