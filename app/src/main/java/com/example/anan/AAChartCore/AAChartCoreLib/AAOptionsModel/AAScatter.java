package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAScatter {
    public Number lineWidth;
    public String lineColor;
    public String dashStyle;
    public Object enableMouseTracking;
    public String linkedTo;
    public AAStates states;
    public AAMarker marker;

    public AAScatter lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AAScatter lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAScatter dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public AAScatter enableMouseTracking(Object prop) {
        enableMouseTracking = prop;
        return this;
    }

    public AAScatter linkedTo(String prop) {
        linkedTo = prop;
        return this;
    }

    public AAScatter states(AAStates prop) {
        states = prop;
        return this;
    }

    public AAScatter marker(AAMarker prop) {
        marker = prop;
        return this;
    }
}
