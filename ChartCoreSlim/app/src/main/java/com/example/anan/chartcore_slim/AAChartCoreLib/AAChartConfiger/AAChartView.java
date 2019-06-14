//
//  AAChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2017/9/8..
//  Copyright © 2018年 An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/AAChartModel/ChartCore         ***
//*** https://github.com/AAChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


/*

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.HashMap;
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
        String jsStr = "setChartSeriesHidden('" + this.contentHeight + "')";
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
//        //设置WebView支持JavaScript(这一句是十分关键的一句)
        this.getSettings().setJavaScriptEnabled(true);
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
        HashMap aaOptions = AAOptionsConstructor.configureChartOptions(chartModel);
        this.aa_drawChartWithChartOptions(aaOptions);
    }

    public void aa_onlyRefreshTheChartDataWithChartModelSeriesArray(AASeriesElement[] seriesElementsArr){
        this.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr);
    }

    public void aa_refreshChartWithChartModel(AAChartModel chartModel) {
        HashMap aaOptions = AAOptionsConstructor.configureChartOptions(chartModel);
        this.aa_refreshChartWithChartOptions(aaOptions);
    }

    public void aa_drawChartWithChartOptions(final HashMap chartOptions) {
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

                return true;
            }
        });
    }

    public void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] seriesElementsArr) {
        // 将对象编译成json
        Gson gson = new Gson();
        String seriesArr = gson.toJson(seriesElementsArr);
        String javaScriptStr = "onlyRefreshTheChartDataWithSeries('" + seriesArr + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_refreshChartWithChartOptions(HashMap chartOptions) {
        // 将对象编译成json
        Gson gson = new Gson();
        String aaOptionsJsonStr = gson.toJson(chartOptions);
        String javaScriptStr = "loadTheHighChartView('" + aaOptionsJsonStr + "','" + contentWidth + "','" + contentHeight + "')";
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

    private void configureChartOptionsAndDrawChart(HashMap chartOptions) {
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
