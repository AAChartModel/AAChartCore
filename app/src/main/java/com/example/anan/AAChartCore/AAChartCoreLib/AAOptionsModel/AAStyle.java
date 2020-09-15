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

    public static AAStyle style(
            String color
    ) {
        return AAStyle.style(color,null);
    }

    public static AAStyle style(
            String color,
            Float fontSize) {
        return AAStyle.style(color,fontSize,null);
    }

    public static AAStyle style(
            String color,
            Float fontSize,
            String fontWeight
    ) {
        return AAStyle.style(color,fontSize,fontWeight,null);
    }

    public static AAStyle style(
            String color,
            Float fontSize,
            String fontWeight,
            String textOutline
    ) {
        AAStyle aaStyle = new AAStyle()
                .color(color)
                .fontSize(fontSize)
                .fontWeight(fontWeight)
                .textOutline(textOutline);
        return aaStyle;
    }

}
