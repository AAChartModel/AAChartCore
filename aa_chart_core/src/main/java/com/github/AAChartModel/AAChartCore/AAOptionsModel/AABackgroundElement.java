package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AABackgroundElement {
    public Object backgroundColor;
    public String borderColor;
    public Number borderWidth;
    public String className;
    public Number innerRadius;
    public Number outerRadius;
    public String shape;

    public AABackgroundElement backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }
    public AABackgroundElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AABackgroundElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AABackgroundElement className(String prop) {
        className = prop;
        return this;
    }

    public AABackgroundElement innerRadius(Number prop) {
        innerRadius = prop;
        return this;
    }

    public AABackgroundElement outerRadius(Number prop) {
        outerRadius = prop;
        return this;
    }

    public AABackgroundElement shape(String prop) {
        shape = prop;
        return this;
    }

}
