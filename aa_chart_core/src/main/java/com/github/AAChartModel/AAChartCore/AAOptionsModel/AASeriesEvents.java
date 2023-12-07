package com.github.AAChartModel.AAChartCore.AAOptionsModel;

import com.github.AAChartModel.AAChartCore.AATools.AAJSStringPurer;

public class AASeriesEvents {
    public String legendItemClick;

    public AASeriesEvents legendItemClick(String prop) {
        legendItemClick = AAJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

}
