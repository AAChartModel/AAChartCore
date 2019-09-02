package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAColumnrange {
    private Float borderRadius;
    private Float borderWidth;
    private AADataLabels dataLabels;

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
