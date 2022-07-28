package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAScrollablePlotArea {
    public Integer minHeight;
    public Integer minWidth;
    public Float opacity;
    public Number scrollPositionX;
    public Number scrollPositionY;

    public AAScrollablePlotArea minHeight(Integer prop) {
        minHeight = prop;
        return this;
    }

    public AAScrollablePlotArea minWidth(Integer prop) {
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
