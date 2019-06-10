package com.example.anan.chartcore_slim.AAOptionsModel;

public class AALabel {
    private String text;
    private Object style;

    public AALabel text(String prop) {
        text = prop;
        return this;
    }

    public AALabel style(Object prop) {
        style = prop;
        return this;
    }
}