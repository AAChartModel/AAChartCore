package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAHover {
    public Boolean enabled;
    public String borderColor;
    public Number brightness;
    public String color;
    public AAHalo halo;
    public Number lineWidth;
    public Number lineWidthPlus;

    public AAHover enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AAHover borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AAHover brightness(Number prop) {
        brightness = prop;
        return this;
    }

    public AAHover color(String prop) {
        color = prop;
        return this;
    }

    public AAHover halo(AAHalo prop) {
        halo = prop;
        return this;
    }

    public AAHover lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AAHover lineWidthPlus(Number prop) {
        lineWidthPlus = prop;
        return this;
    }
}
