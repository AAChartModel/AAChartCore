package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAStyle {

    private String color;
    private String fontSize;
    private String fontWeight;
    private String textOutLine;

    public AAStyle color(String prop) {
        color = prop;
        return this;
    }

    public AAStyle fontSize(String prop) {
        fontSize = prop;
        return this;
    }

    public AAStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }

    public AAStyle textOutLine(String prop) {
        textOutLine = prop;
        return this;
    }

}
