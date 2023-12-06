package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAStyle {

    public String background;
    public String backgroundColor;
    public String border;
    public String borderRadius;
    public String color;
    public String cursor;
    public String fontFamily;
    public String fontSize;
    public String fontWeight;
    public Number height;
    public Number lineWidth;
    public Number opacity;
    public String padding;
    public String pointerEvents;
    public String position;
    public String textAlign;
    public String textDecoration;
    public String textOutline;
    public String textOverflow;
    public String top;
    public String transition;
    public String whiteSpace;
    public Number width;

    public AAStyle background(String prop) {
        background = prop;
        return this;
    }

    public AAStyle backgroundColor(String prop) {
        backgroundColor = prop;
        return this;
    }

    public AAStyle border(String prop) {
        border = prop;
        return this;
    }

    public AAStyle borderRadius(Number prop) {
        if (prop != null) {
            borderRadius = prop + "px";
        }
        return this;
    }

    public AAStyle color(String prop) {
        color = prop;
        return this;
    }

    public AAStyle cursor(String prop) {
        cursor = prop;
        return this;
    }

    public AAStyle fontFamily(String prop) {
        fontFamily = prop;
        return this;
    }

    public AAStyle fontSize(Number prop) {
        if (prop != null) {
            fontSize = prop + "px";
        }
        return this;
    }


    public AAStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }



    public AAStyle height(Number prop) {
        height = prop;
        return this;
    }

    public AAStyle lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AAStyle opacity(Number prop) {
        opacity = prop;
        return this;
    }

    public AAStyle padding(Number prop) {
        if (prop != null) {
            padding = prop + "px";
        }
        return this;
    }

    public AAStyle pointerEvents(String prop) {
        pointerEvents = prop;
        return this;
    }

    public AAStyle position(String prop) {
        position = prop;
        return this;
    }

    public AAStyle textAlign(String prop) {
        textAlign = prop;
        return this;
    }

    public AAStyle textDecoration(String prop) {
        textDecoration = prop;
        return this;
    }

    public AAStyle textOutline(String prop) {
        textOutline = prop;
        return this;
    }

    public AAStyle textOverflow(String prop) {
        textOverflow = prop;
        return this;
    }

    public AAStyle top(String prop) {
        top = prop;
        return this;
    }

    public AAStyle transition(String prop) {
        transition = prop;
        return this;
    }

    public AAStyle whiteSpace(String prop) {
        whiteSpace = prop;
        return this;
    }

    public AAStyle width(Number prop) {
        width = prop;
        return this;
    }





    public static AAStyle style(
            String color
    ) {
        return AAStyle.style(color,null);
    }

    public static AAStyle style(
            String color,
            Number fontSize
    ) {
        return AAStyle.style(color,fontSize,null);
    }

    public static AAStyle style(
            String color,
            Number fontSize,
            String fontWeight
    ) {
        return AAStyle.style(color,fontSize,fontWeight,null);
    }

    public static AAStyle style(
            String color,
            Number fontSize,
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
