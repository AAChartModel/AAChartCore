package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAJSStringPurer;


public class AADataLabels {
    public Boolean enabled;
    public String align;
    public Boolean inside;
    public AAStyle style;
    public String format;
    public String formatter;
    public Number rotation;
    public Boolean allowOverlap;
    public Boolean useHTML;
    public Number distance;
    public String verticalAlign;
    public Number x;
    public Number y;
    public String color;
    public String backgroundColor;
    public String borderColor;
    public Number borderRadius;
    public Number borderWidth;
    public String shape;
    public Boolean crop;
    public String overflow;
    public Boolean softConnector;
    public Object textPath;
    public Object filter;

    public AADataLabels enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AADataLabels align(String prop) {
        align = prop;
        return this;
    }

    public AADataLabels inside(Boolean prop) {
        inside = prop;
        return this;
    }


    public AADataLabels style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AADataLabels format(String prop) {
        format = prop;
        return this;
    }

    public AADataLabels formatter(String prop) {
        String pureJSFunctionStr = "(" + prop + ")";
        pureJSFunctionStr = AAJSStringPurer.pureJavaScriptFunctionString(pureJSFunctionStr);
        formatter = pureJSFunctionStr;
        return this;
    }

    public AADataLabels rotation(Number prop) {
        rotation = prop;
        return this;
    }

    public AADataLabels allowOverlap(Boolean prop) {
        allowOverlap = prop;
        return this;
    }

    public AADataLabels useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public AADataLabels distance(Number prop) {
        distance = prop;
        return this;
    }

    public AADataLabels verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public AADataLabels x(Number prop) {
        x = prop;
        return this;
    }

    public AADataLabels y(Number prop) {
        y = prop;
        return this;
    }

    public AADataLabels color(String prop) {
        color = prop;
        return this;
    }

    public AADataLabels backgroundColor(String prop) {
        backgroundColor = prop;
        return this;
    }

    public AADataLabels borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AADataLabels borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AADataLabels borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AADataLabels shape(String prop) {
        shape = prop;
        return this;
    }

    public AADataLabels crop(Boolean prop) {
        crop = prop;
        return this;
    }

    public AADataLabels overflow(String prop) {
        overflow = prop;
        return this;
    }

    public AADataLabels softConnector(Boolean prop) {
        softConnector = prop;
        return this;
    }

    public AADataLabels textPath(Object prop) {
        textPath = prop;
        return this;
    }

    public AADataLabels filter(Object prop) {
        filter = prop;
        return this;
    }
}
