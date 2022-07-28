package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AAHalo {
    public Map attributes;
    public Number opacity;
    public Number size;

    public AAHalo attributes(Map prop) {
        attributes = prop;
        return this;
    }

    public AAHalo opacity(Number prop) {
        opacity = prop;
        return this;
    }

    public AAHalo size(Number prop) {
        size = prop;
        return this;
    }
}
