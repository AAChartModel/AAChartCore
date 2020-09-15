package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AAResetZoomButton {
    public AAPosition position;
    public String relativeTo;
    public Map theme;

    public AAResetZoomButton position(AAPosition prop) {
        this.position = prop;
        return this;
    }

    public AAResetZoomButton relativeTo(String prop) {
        this.relativeTo = prop;
        return this;
    }

    public AAResetZoomButton theme(Map prop) {
        this.theme = prop;
        return this;
    }


}
