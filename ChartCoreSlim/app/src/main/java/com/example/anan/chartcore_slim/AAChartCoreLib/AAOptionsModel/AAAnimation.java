package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartAnimationType;

public class AAAnimation {
    private Integer duration;
    private String easing;

    public AAAnimation duration(Integer prop) {
        duration = prop;
        return this;
    }

    public AAAnimation easing(String prop) {
        easing = prop;
        return this;
    }
}
