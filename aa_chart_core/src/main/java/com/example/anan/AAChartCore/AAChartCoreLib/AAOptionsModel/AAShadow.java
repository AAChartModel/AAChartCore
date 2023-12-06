package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAShadow {
    public String color;
    public Number offsetX;
    public Number offsetY;
    public Float opacity;
    public Number width;

    public AAShadow color(String prop) {
        color = prop;
        return this;
    }

    public AAShadow offsetX(Number prop) {
        offsetX = prop;
        return this;
    }

    public AAShadow offsetY(Number prop) {
        offsetY = prop;
        return this;
    }

    public AAShadow opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public AAShadow width(Number prop) {
        width = prop;
        return this;
    }

}
