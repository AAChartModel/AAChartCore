package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AACrosshair {
    private Float width;
    private String color;
    private String dashStyle;

    public AACrosshair width(Float prop) {
        width = prop;
        return this;
    }

    public AACrosshair color(String prop) {
        color = prop;
        return this;
    }

    public AACrosshair dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }
}
