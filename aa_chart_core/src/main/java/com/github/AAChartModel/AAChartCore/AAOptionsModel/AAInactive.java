package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAInactive {
    public Boolean enabled;
    public Number opacity;

    public AAInactive enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AAInactive opacity(Number prop) {
        opacity = prop;
        return this;
    }
}
