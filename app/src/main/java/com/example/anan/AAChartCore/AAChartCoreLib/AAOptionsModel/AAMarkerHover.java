package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAMarkerHover {

    public Boolean enabled;
    public String fillColor;
    public String lineColor;
    public Float lineWidth;
    public Float lineWidthPlus;
    public Float radius;
    public Float radiusPlus;

    public AAMarkerHover enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AAMarkerHover fillColor(String prop) {
        fillColor = prop;
        return this;
    }

    public AAMarkerHover lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAMarkerHover lineWidth(Float prop) {
        lineWidth = prop;
        return this;
    }

    public AAMarkerHover lineWidthPlus(Float prop) {
        lineWidthPlus = prop;
        return this;
    }

    public AAMarkerHover radius(Float prop) {
        radius = prop;
        return this;
    }

    public AAMarkerHover radiusPlus(Float prop) {
        radiusPlus = prop;
        return this;
    }

}
