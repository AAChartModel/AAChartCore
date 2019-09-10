package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;

public class AASubtitle {
    private String text;
    private AAStyle style;
    private String align;
    private String verticalAlign;
    private Float x;
    private Float y;
    private Boolean userHTML;

    public AASubtitle text(String prop) {
        text = prop;
        return this;
    }

    public AASubtitle style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AASubtitle align(String prop) {
        align = prop;
        return this;
    }

    public AASubtitle verticalAlign(AAChartVerticalAlignType prop) {
        verticalAlign = prop.toString();
        return this;
    }

    public AASubtitle x(Float prop) {
        x = prop;
        return this;
    }

    public AASubtitle y(Float prop) {
        y = prop;
        return this;
    }

    public AASubtitle userHTML(Boolean prop) {
        userHTML = prop;
        return this;
    }
}
