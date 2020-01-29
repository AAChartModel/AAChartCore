package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AAHalo {
    public Map attributes;
    public Float opacity;
    public Float size;

    public AAHalo attributes(Map prop) {
        attributes = prop;
        return this;
    }

    public AAHalo opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public AAHalo size(Float prop) {
        size = prop;
        return this;
    }
}
