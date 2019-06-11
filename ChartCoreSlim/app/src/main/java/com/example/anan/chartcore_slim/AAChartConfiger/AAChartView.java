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

package com.example.anan.chartcore_slim.AAChartConfiger;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by AnAn on 2017/9/8.
 */

class AAMoveOverEventMessageModel {
    public String name;
    public Float x;
    public Float y;
    public String category;
    public HashMap offset;
    public Integer index;
}

public class AAChartView extends WebView {

    public Float contentWidth;
    public Float contentHeight;
    public Boolean chartSeriesHidden;
    public String testTheAutoGenerateGetMethod;

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

        String myMessage = message;
//        Gson gson = new Gson();
//        Map<String, Object> map = new HashMap<String, Object>();
//        map = gson.fromJson(message, map.getClass());
//        AAMoveOverEventMessageModel messageModel = getEventMessageModel(map);
        return "";
    }

    AAMoveOverEventMessageModel getEventMessageModel(Map messageBody) {
        AAMoveOverEventMessageModel eventMessageModel =  new AAMoveOverEventMessageModel();
        eventMessageModel.name = (String) messageBody.get("name");
        eventMessageModel.x = (Float) messageBody.get("x");
        eventMessageModel.y = (Float) messageBody.get("y");
        eventMessageModel.category = (String) messageBody.get("category");
        eventMessageModel.offset = (HashMap) messageBody.get("offset");
        eventMessageModel.index = (Integer) messageBody.get("index");
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
        this.loadUrl("file:///android_asset/AAChartView.html");//神奇了,这个fdsa方法写在aa_drawChartWithChartModel方法里面就不行,难道是因为不能在还未加载成功的时候就直接调用 JS 方法?(跟 OC 一样)必须在加载完成后的代理里面调用 JS 方法

        this.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageFinished(WebView view,String url)
            {
                System.out.println("图表加载完成!!!!!!!! ");
                configureChartOptionsAndDrawChart(chartOptions);
            }
        });
    }

    public void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] seriesElementsArr) {
        // 将对象编译成json
        Gson gson = new Gson();
        String seriesArr = gson.toJson(seriesElementsArr);
//        this.loadUrl("javascript:onlyRefreshTheChartDataWithSeries('" + seriesArr + "')");
        String javaScriptStr = "onlyRefreshTheChartDataWithSeries('" + seriesArr + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_refreshChartWithChartOptions(HashMap chartOptions) {
        // 将对象编译成json
        Gson gson = new Gson();
        String aaOptionsJsonStr = gson.toJson(chartOptions);
//        this.loadUrl("javascript:loadTheHighChartView('" + aaOptionsJsonStr + "','" + contentWidth + "','" + contentHeight + "')");
        String javaScriptStr = "loadTheHighChartView('" + aaOptionsJsonStr + "','" + contentWidth + "','" + contentHeight + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_showTheSeriesElementContent(Integer elementIndex) {
//        NSString *javaScriptStr = [NSString stringWithFormat:@"showTheSeriesElementContentWithIndex(%ld)",(long)elementIndex];
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
//        this.loadUrl("javascript:loadTheHighChartView('" + aaOptionsJsonStr + "','" + 420 + "','" + 580 + "')");
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
