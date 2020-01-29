package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAHover {
    public String borderColor;
    public Float brightness;
    public String color;
    public AAHalo halo;

    public AAHover borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AAHover brightness(Float prop) {
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
}
