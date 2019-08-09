package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.google.gson.Gson;

import java.util.HashMap;

public class AADataLabels {
    private Boolean enabled;
    private String style;
    private String format;
    private Float rotation;
    private Boolean allowOverlap;
    private Boolean useHTML;
    private Float distance;
    private String verticalAlign;
    private Float x;
    private Float y;
    private String color;
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private String shape;


    public AADataLabels enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AADataLabels style(AAStyle prop) {
        Gson gson = new Gson();
        style = gson.toJson(prop);
        return this;
    }

    public AADataLabels format(String prop) {
        format = prop;
        return this;
    }

    public AADataLabels rotation(Float prop) {
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

    public AADataLabels distance(Float prop) {
        distance = prop;
        return this;
    }

    public AADataLabels verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public AADataLabels x(Float prop) {
        x = prop;
        return this;
    }

    public AADataLabels y(Float prop) {
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

    public AADataLabels borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AADataLabels borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AADataLabels shape(String prop) {
        shape = prop;
        return this;
    }
}
