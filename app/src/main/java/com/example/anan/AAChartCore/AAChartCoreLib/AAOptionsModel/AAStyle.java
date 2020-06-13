package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAStyle {

    public String color;
    public String fontSize;
    public String fontWeight;
    public String textOutline;

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
        textOutline = prop;
        return this;
    }

}
