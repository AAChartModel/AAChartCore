package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAWaterfallChart {
    public String upColor;
    public String color;
    public Float borderWidth;
    public Object[] data;

    public AAWaterfallChart upColor(String prop) {
        upColor = prop;
        return this;
    }

    public AAWaterfallChart color(String prop) {
        color = prop;
        return this;
    }

    public AAWaterfallChart borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AAWaterfallChart data(Object[] prop) {
        data = prop;
        return this;
    }
}
