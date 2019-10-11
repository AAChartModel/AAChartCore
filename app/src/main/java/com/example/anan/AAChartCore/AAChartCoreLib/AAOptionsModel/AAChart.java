package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAChart {
    public String type;
    public Object backgroundColor;
    public String plotBackgroundImage;
    public String pinchType;
    public Boolean panning;
    public String panKey;
    public Boolean polar;
    public AAAnimation animation;
    public Boolean inverted;
    public Float marginLeft;
    public Float marginRight;

    public AAChart type(String prop) {
        type = prop;
        return this;
    }

    public AAChart backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }

    public AAChart plotBackgroundImage(String prop) {
        plotBackgroundImage = prop;
        return this;
    }

    public AAChart pinchType(String prop) {
        pinchType = prop;
        return this;
    }

    public AAChart panning(Boolean prop) {
        panning = prop;
        return this;
    }

    public AAChart panKey(String prop) {
        panKey = prop;
        return this;
    }

    public AAChart polar(Boolean prop) {
        polar = prop;
        return this;
    }

    public AAChart animation(AAAnimation prop) {
        animation = prop;
        return this;
    }

    public AAChart inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public AAChart marginLeft(Float prop) {
        marginLeft = prop;
        return this;
    }

    public AAChart marginRight(Float prop) {
        marginRight = prop;
        return this;
    }

}
