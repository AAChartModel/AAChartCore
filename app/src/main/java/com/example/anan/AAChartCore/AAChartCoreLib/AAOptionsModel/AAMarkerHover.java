package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAMarkerHover {

    public Boolean enabled;
    public String fillColor;
    public String lineColor;
    public Number lineWidth;
    public Number lineWidthPlus;
    public Number radius;
    public Number radiusPlus;

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

    public AAMarkerHover lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AAMarkerHover lineWidthPlus(Number prop) {
        lineWidthPlus = prop;
        return this;
    }

    public AAMarkerHover radius(Number prop) {
        radius = prop;
        return this;
    }

    public AAMarkerHover radiusPlus(Number prop) {
        radiusPlus = prop;
        return this;
    }

}
