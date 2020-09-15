package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AAResetZoomButton {
    public AAPosition position;
    public String relativeTo;
    public Map theme;

    public AAResetZoomButton position(AAPosition prop) {
        position = prop;
        return this;
    }

    public AAResetZoomButton relativeTo(String prop) {
        relativeTo = prop;
        return this;
    }

    public AAResetZoomButton theme(Map prop) {
        theme = prop;
        return this;
    }


}
