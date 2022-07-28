package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAColumnrange {
    public Number borderRadius;
    public Number borderWidth;
    public AADataLabels dataLabels;

    public AAColumnrange borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AAColumnrange borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AAColumnrange dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }
}
