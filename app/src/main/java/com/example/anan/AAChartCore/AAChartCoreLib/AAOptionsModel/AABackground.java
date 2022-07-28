package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AABackground {
    public Object backgroundColor;
    public String borderColor;
    public Number borderWidth;
    public String className;
    public Number innerRadius;
    public Number outerRadius;
    public String shape;

    public AABackground backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }
    public AABackground borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AABackground borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AABackground className(String prop) {
        className = prop;
        return this;
    }

    public AABackground innerRadius(Number prop) {
        innerRadius = prop;
        return this;
    }

    public AABackground outerRadius(Number prop) {
        outerRadius = prop;
        return this;
    }

    public AABackground shape(String prop) {
        shape = prop;
        return this;
    }

}
