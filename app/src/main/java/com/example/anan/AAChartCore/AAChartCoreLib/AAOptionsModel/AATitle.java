package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;

public class AATitle {
    private String text;
    private AAStyle style;
    private String align;
    private String verticalAlign;
    private Float x;
    private Float y;
    private Boolean userHTML;

    public AATitle text(String prop) {
        text = prop;
        return this;
    }

    public AATitle style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AATitle align(AAChartAlignType prop) {
        align = prop.toString();
        return this;
    }

    public AATitle verticalAlign(AAChartVerticalAlignType prop) {
        verticalAlign = prop.toString();
        return this;
    }

    public AATitle x(Float prop) {
        x = prop;
        return this;
    }

    public AATitle y(Float prop) {
        y = prop;
        return this;
    }

    public AATitle userHTML(Boolean prop) {
        userHTML = prop;
        return this;
    }
}
