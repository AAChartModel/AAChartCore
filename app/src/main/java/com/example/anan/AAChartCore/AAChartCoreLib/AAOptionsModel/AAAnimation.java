package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAAnimation {
    public Integer duration;
    public String easing;

    public AAAnimation duration(Integer prop) {
        duration = prop;
        return this;
    }

    public AAAnimation easing(String prop) {
        easing = prop;
        return this;
    }
}
