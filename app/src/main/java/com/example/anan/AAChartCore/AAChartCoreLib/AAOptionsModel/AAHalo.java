package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AAHalo {
    public Map<String, Object> attributes;
    public Number opacity;
    public Number size;

    public AAHalo attributes(AASVGAttributes prop) {
        attributes = prop.toDic();
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
