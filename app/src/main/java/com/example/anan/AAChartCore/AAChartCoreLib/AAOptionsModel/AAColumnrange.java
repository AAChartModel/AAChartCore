package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAColumnrange {
    public Float borderRadius;
    public Float borderWidth;
    public AADataLabels dataLabels;

    public AAColumnrange borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AAColumnrange borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AAColumnrange dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }
}
