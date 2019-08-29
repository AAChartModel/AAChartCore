package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAChart {
    private String type;
    private Object backgroundColor;
    private String plotBackgroundImage;
    private String pinchType;
    private Boolean panning;
    private String panKey;
    private Boolean polar;
    private AAAnimation animation;
    private Boolean inverted;
    private Float marginLeft;
    private Float marginRight;

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
