package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAJSStringPurer;

public class AASeriesEvents {
    public String legendItemClick;

    public AASeriesEvents legendItemClick(String prop) {
        String pureJSFunctionStr = "(" + prop + ")";
        pureJSFunctionStr = AAJSStringPurer.pureJavaScriptFunctionString(pureJSFunctionStr);
        legendItemClick = pureJSFunctionStr;
        return this;
    }

}
