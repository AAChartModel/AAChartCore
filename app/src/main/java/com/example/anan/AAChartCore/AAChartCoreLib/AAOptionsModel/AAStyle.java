package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAStyle {

    private String color;
    private String fontSize;
    private String fontWeight;
    private String textOutLine;

    public AAStyle color(String prop) {
        color = prop;
        return this;
    }

    public AAStyle fontSize(Float prop) {
        fontSize = prop + "px";
        return this;
    }

    public AAStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }

    public AAStyle textOutline(String prop) {
        textOutLine = prop;
        return this;
    }

}
