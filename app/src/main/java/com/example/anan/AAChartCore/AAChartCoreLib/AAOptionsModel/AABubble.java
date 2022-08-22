package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AABubble {
    public Object minSize;
    public Object maxSize;
    public Number zMin;
    public Number zMax;
    public AADataLabels dataLabels;

    public AABubble minSize(Object prop) {
        minSize = prop;
        return this;
    }

    public AABubble maxSize(Object prop) {
        maxSize = prop;
        return this;
    }

    public AABubble zMin(Number prop) {
        zMin = prop;
        return this;
    }

    public AABubble zMax(Number prop) {
        zMax = prop;
        return this;
    }

    public AABubble dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

}
