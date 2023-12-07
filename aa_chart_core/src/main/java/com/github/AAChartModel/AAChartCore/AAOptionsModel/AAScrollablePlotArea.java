package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAScrollablePlotArea {
    public Number minHeight;
    public Number minWidth;
    public Float opacity;
    public Number scrollPositionX;
    public Number scrollPositionY;

    public AAScrollablePlotArea minHeight(Number prop) {
        minHeight = prop;
        return this;
    }

    public AAScrollablePlotArea minWidth(Number prop) {
        minWidth = prop;
        return this;
    }

    public AAScrollablePlotArea opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public AAScrollablePlotArea scrollPositionX(Number prop) {
        scrollPositionX = prop;
        return this;
    }

    public AAScrollablePlotArea scrollPositionY(Number prop) {
        scrollPositionY = prop;
        return this;
    }
}
