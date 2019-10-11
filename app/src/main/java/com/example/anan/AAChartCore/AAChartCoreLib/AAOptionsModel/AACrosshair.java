package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AACrosshair {
    public Float width;
    public String color;
    public String dashStyle;

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
