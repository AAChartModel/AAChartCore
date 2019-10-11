package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AADataElement {
    public String name;
    public Float y;
    public Object color;
    public AADataLabels dataLabels;
    public AAMarker marker;

    public AADataElement name(String prop) {
        name = prop;
        return this;
    }

    public AADataElement y(Float prop) {
        y = prop;
        return this;
    }

    public AADataElement color(Object prop) {
        color = prop;
        return this;
    }

    public AADataElement dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AADataElement marker(AAMarker prop) {
        marker = prop;
        return this;
    }
}
