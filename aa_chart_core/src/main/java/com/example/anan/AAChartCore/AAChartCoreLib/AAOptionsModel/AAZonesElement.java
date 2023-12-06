package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAZonesElement {
    public Number value;
    public Object color;
    public Object fillColor;
    public String dashStyle;

    public AAZonesElement value(Number prop) {
        value = prop;
        return this;
    }

    public AAZonesElement color(Object prop) {
        color = prop;
        return this;
    }

    public AAZonesElement fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public AAZonesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }
}
