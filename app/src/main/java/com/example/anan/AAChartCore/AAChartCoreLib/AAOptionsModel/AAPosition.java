package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPosition {
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;

    public AAPosition align(String prop) {
        align = prop;
        return this;
    }

    public AAPosition verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public AAPosition x(Number prop) {
        x = prop;
        return this;
    }

    public AAPosition y(Number prop) {
        y = prop;
        return this;
    }

}
