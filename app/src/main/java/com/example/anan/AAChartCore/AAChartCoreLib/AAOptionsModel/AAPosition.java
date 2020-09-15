package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPosition {
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;

    public AAPosition align(String prop) {
        this.align = prop;
        return this;
    }

    public AAPosition verticalAlign(String prop) {
        this.verticalAlign = prop;
        return this;
    }

    public AAPosition align(Number prop) {
        this.x = prop;
        return this;
    }

    public AAPosition y(Number prop) {
        this.y = prop;
        return this;
    }

}
