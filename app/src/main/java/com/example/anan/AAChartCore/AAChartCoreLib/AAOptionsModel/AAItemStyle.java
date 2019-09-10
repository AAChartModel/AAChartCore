package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAItemStyle {
    private String color;
    private String cursor;
    private String pointer;
    private String fontSize;
    private String fontWeight;


    public AAItemStyle color(String prop) {
        this.color = prop;
        return this;
    }

    public AAItemStyle cursor(String prop) {
        this.cursor = prop;
        return this;
    }

    public AAItemStyle pointer(String prop) {
        this.pointer = prop;
        return this;
    }

    public AAItemStyle fontSize(Float prop) {
        this.fontSize = prop + "px";
        return this;
    }

    public AAItemStyle fontWeight(String prop) {
        this.fontWeight = prop;
        return this;
    }
}
