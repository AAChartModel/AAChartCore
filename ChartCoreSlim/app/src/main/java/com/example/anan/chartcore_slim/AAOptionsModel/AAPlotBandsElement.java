package com.example.anan.chartcore_slim.AAOptionsModel;

public class AAPlotBandsElement {

    private Float from;
    private Float to;
    private Object color;

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


}
