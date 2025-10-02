package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAAxisTitle {
    public String align;
    public String margin;
    public Number offset;
    public Number rotation;
    public AAStyle style;
    public String text;
    public String textAlign;
    public Boolean useHTML;
    public Number x;
    public Number y;

    public AAAxisTitle align(String prop) {
        align = prop;
        return this;
    }

    public AAAxisTitle margin(String prop) {
        margin = prop;
        return this;
    }

    public AAAxisTitle offset(Number prop) {
        offset = prop;
        return this;
    }

    public AAAxisTitle rotation(Number prop) {
        rotation = prop;
        return this;
    }

    public AAAxisTitle style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AAAxisTitle text(String prop) {
        text = prop;
        return this;
    }

    public AAAxisTitle textAlign(String prop) {
        textAlign = prop;
        return this;
    }

    public AAAxisTitle useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public AAAxisTitle x(Number prop) {
        x = prop;
        return this;
    }

    public AAAxisTitle y(Number prop) {
        y = prop;
        return this;
    }
}