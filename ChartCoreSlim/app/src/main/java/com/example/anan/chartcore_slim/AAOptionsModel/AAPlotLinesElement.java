package com.example.anan.chartcore_slim.AAOptionsModel;

import java.util.Map;

public class AAPlotLinesElement {

    private Object color;
    private String dashStyle;
    private Float width;
    private Float value;
    private Integer zIndex;
    private AALabel label;

    public AAPlotLinesElement color(Object prop) {
        this.color = prop;
        return this;
    }

    public AAPlotLinesElement dashStyle(String prop) {
        this.dashStyle = prop;
        return this;
    }

    public AAPlotLinesElement width(Float prop) {
        this.width = prop;
        return this;
    }

    public AAPlotLinesElement value(Float prop) {
        this.value = prop;
        return this;
    }

    public AAPlotLinesElement zIndex(Integer prop) {
        this.zIndex = prop;
        return this;
    }

    public AAPlotLinesElement label(AALabel prop) {
        this.label = prop;
        return this;
    }



}






