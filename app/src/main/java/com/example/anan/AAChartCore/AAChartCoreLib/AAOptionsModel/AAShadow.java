package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAShadow {
    private String color;
    private Float offsetX;
    private Float offsetY;
    private Float opacity;
    private Float width;

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
