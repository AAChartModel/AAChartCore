package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAShadow {
    public String color;
    public Float offsetX;
    public Float offsetY;
    public Float opacity;
    public Float width;

    public AAShadow color(String prop) {
        color = prop;
        return this;
    }

    public AAShadow offsetX(Float prop) {
        offsetX = prop;
        return this;
    }

    public AAShadow offsetY(Float prop) {
        offsetY = prop;
        return this;
    }

    public AAShadow opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public AAShadow width(Float prop) {
        width = prop;
        return this;
    }

}
