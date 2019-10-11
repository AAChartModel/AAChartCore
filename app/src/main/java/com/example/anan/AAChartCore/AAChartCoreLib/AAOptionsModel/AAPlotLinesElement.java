package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPlotLinesElement {

    public Object color;
    public String dashStyle;
    public Float width;
    public Float value;
    public Integer zIndex;
    public AALabel label;

    public AAPlotLinesElement color(Object prop) {
        color = prop;
        return this;
    }

    public AAPlotLinesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public AAPlotLinesElement width(Float prop) {
        width = prop;
        return this;
    }

    public AAPlotLinesElement value(Float prop) {
        value = prop;
        return this;
    }

    public AAPlotLinesElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

    public AAPlotLinesElement label(AALabel prop) {
        label = prop;
        return this;
    }



}






