package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPlotBandsElement {
    public Float from;
    public Float to;
    public Object color;
    public String borderColor;
    public Float borderWidth;
    public String className;
    public AALabel label;
    public Integer zIndex;

    public AAPlotBandsElement from(Float prop) {
        from = prop;
        return this;
    }

    public AAPlotBandsElement to(Float prop) {
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

    public AAPlotBandsElement borderWidth(Float prop) {
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
