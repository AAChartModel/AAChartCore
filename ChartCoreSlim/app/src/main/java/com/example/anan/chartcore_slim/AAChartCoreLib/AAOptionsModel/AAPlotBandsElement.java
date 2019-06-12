package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAPlotBandsElement {
    private Float from;
    private Float to;
    private Object color;
    private String borderColor;
    private Float borderWidth;
    private String className;
    private AALabel label;
    private Integer index;

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

    public AAPlotBandsElement index(Integer prop) {
        index = prop;
        return this;
    }

}
