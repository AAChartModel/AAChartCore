package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AABackground {
    public Object backgroundColor;
    public String borderColor;
    public Float borderWidth;
    public String className;
    public Float innerRadius;
    public Float outerRadius;
    public String shape;

    public AABackground backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }
    public AABackground borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AABackground borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AABackground className(String prop) {
        className = prop;
        return this;
    }

    public AABackground innerRadius(Float prop) {
        innerRadius = prop;
        return this;
    }

    public AABackground outerRadius(Float prop) {
        outerRadius = prop;
        return this;
    }

    public AABackground shape(String prop) {
        shape = prop;
        return this;
    }

}
