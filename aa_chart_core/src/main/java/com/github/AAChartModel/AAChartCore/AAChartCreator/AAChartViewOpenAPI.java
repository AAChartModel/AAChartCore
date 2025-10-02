/**
//  AAChartViewOpenAPI.java
//  AAChartCore
//
//  Created by AnAn on 2025/10/3.
//  Copyright © 2025年 An An. All rights reserved.

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

package com.github.AAChartModel.AAChartCore.AAChartCreator;

import android.webkit.WebView;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AATools.AAJSStringPurer;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public abstract class AAChartViewOpenAPI extends WebView {

    public AAChartViewOpenAPI(android.content.Context context) {
        super(context);
    }

    public AAChartViewOpenAPI(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public AAChartViewOpenAPI(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected abstract void safeEvaluateJavaScriptString(String javaScriptString);

    public void aa_drawChartWithChartModel(final AAChartModel chartModel) {
        AAOptions aaOptions = chartModel.aa_toAAOptions();
        this.aa_drawChartWithChartOptions(aaOptions);
    }

    public void aa_refreshChartWithChartModel(AAChartModel chartModel) {
        AAOptions aaOptions = chartModel.aa_toAAOptions();
        this.aa_refreshChartWithChartOptions(aaOptions);
    }

    public void aa_drawChartWithChartOptions(final AAOptions chartOptions) {
        String optionsJson = getOptionsJson();
        if (optionsJson != null) {
            this.aa_refreshChartWithChartOptions(chartOptions);
        } else {
            loadLocalFilesAndDrawChart(chartOptions);
            showJavaScriptAlertView();
        }
    }

    public void aa_refreshChartWithChartOptions(AAOptions chartOptions) {
        configureChartOptionsAndDrawChart(chartOptions);
    }

    public void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
            AASeriesElement[] seriesElementsArr
    ) {
        aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr,true);
    }

    public void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
            AASeriesElement[] seriesElementsArr,
            Boolean animation
    ) {
        String seriesArr = new Gson().toJson(seriesElementsArr);
        String javaScriptStr = "onlyRefreshTheChartDataWithSeries('"
                + seriesArr + "','" + animation + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public  void aa_updateChartWithOptions(
            Object options,
            Boolean redraw
    ) {
        boolean isAAOptionsClass = options instanceof AAOptions;
        String finalOptionsMapStr;

        if (isAAOptionsClass) {
            String aaOptionsMapStr = new Gson().toJson(options);
            finalOptionsMapStr = aaOptionsMapStr;
        } else {
            String classNameStr = options.getClass().getSimpleName();
            classNameStr = classNameStr.replace("AA","");

            //convert fist character to be lowercase string
            String firstChar = classNameStr.substring(0,1);
            String lowercaseFirstStr = firstChar.toLowerCase();
            classNameStr = classNameStr.substring(1);
            String finalClassName = lowercaseFirstStr + classNameStr;

            Map<String, Object> finalOptionsMap = new HashMap();
            finalOptionsMap.put(finalClassName,options);

            String optionsStr = new Gson().toJson(finalOptionsMap);
            finalOptionsMapStr = optionsStr;
        }

        String javaScriptStr = "updateChart('" + finalOptionsMapStr + "','" + redraw + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options
    ) {
        aa_addPointToChartSeriesElement(
                elementIndex,
                options,
                true);
    }
    
    public void aa_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options,
            Boolean shift
    ) {
        aa_addPointToChartSeriesElement(
                elementIndex,
                options,
                true,
                shift,
                true);
    }

    public void aa_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options,
            Boolean redraw,
            Boolean shift,
            Boolean animation
    ) {
        String optionsStr;
        if (       options instanceof Integer
                || options instanceof Float
                || options instanceof Double) {
            optionsStr = String.valueOf(options);
        } else {
            optionsStr = new Gson().toJson(options);
        }

        String javaScriptStr = "addPointToChartSeries('"
                + elementIndex + "','"
                + optionsStr + "','"
                + redraw + "','"
                + shift + "','"
                + animation + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_showTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "showTheSeriesElementContentWithIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_hideTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "hideTheSeriesElementContentWithIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_addElementToChartSeries(AASeriesElement aaSeriesElement) {
        String pureElementJsonStr = new Gson().toJson(aaSeriesElement);
        String javaScriptStr = "addElementToChartSeriesWithElement('"
                + pureElementJsonStr + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_removeElementFromChartSeries(Integer elementIndex) {
        String javaScriptStr = "removeElementFromChartSeriesWithElementIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void aa_evaluateTheJavaScriptStringFunction(String jsFunctionStr) {
        String pureJSFunctionStr = AAJSStringPurer.pureJavaScriptFunctionString(jsFunctionStr);

        String jsFunctionNameStr = "evaluateTheJavaScriptStringFunction('"
                + pureJSFunctionStr + "')";
        safeEvaluateJavaScriptString(jsFunctionNameStr);
    }

    // 需要子类实现的抽象方法
    protected abstract String getOptionsJson();
    protected abstract void loadLocalFilesAndDrawChart(final AAOptions aaOptions);
    protected abstract void showJavaScriptAlertView();
    protected abstract void configureChartOptionsAndDrawChart(AAOptions aaOptions);
}
