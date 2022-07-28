package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPlotBandsElement {
    public Number from;
    public Number to;
    public Object color;
    public String borderColor;
    public Number borderWidth;
    public String className;
    public AALabel label;
    public Integer zIndex;

    public AAPlotBandsElement from(Number prop) {
        from = prop;
        return this;
    }

    public AAPlotBandsElement to(Number prop) {
        to = prop;
        return this;
    }

    public AAPlotBandsElement color(Object prop) {
        color = prop;
        return this;
    }

    public AAPlotBandsElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AAPlotBandsElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AAPlotBandsElement className(String prop) {
        className = prop;
        return this;
    }

    public AAPlotBandsElement label(AALabel prop) {
        label = prop;
        return this;
    }

    public AAPlotBandsElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

}
