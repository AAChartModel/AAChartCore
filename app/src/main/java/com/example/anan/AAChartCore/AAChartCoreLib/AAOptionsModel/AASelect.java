package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AASelect {
    public String borderColor;
    public String color;
    public AAHalo halo;

    public AASelect borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AASelect color(String prop) {
        color = prop;
        return this;
    }

    public  AASelect halo(AAHalo prop) {
        halo = prop;
        return this;
    }
}
