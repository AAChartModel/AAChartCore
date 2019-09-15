package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAItemStyle {
    private String color;
    private String cursor;
    private String pointer;
    private String fontSize;
    private String fontWeight;


    public AAItemStyle color(String prop) {
        color = prop;
        return this;
    }

    public AAItemStyle cursor(String prop) {
        cursor = prop;
        return this;
    }

    public AAItemStyle pointer(String prop) {
        pointer = prop;
        return this;
    }

    public AAItemStyle fontSize(Float prop) {
        fontSize = prop + "px";
        return this;
    }

    public AAItemStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }
}
