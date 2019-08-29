package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAAnimation {
    private Float duration;
    private Integer easing;

    public AAAnimation duration(Float prop) {
        duration = prop;
        return this;
    }

    public AAAnimation easing(Integer prop) {
        easing = prop;
        return this;
    }
}
