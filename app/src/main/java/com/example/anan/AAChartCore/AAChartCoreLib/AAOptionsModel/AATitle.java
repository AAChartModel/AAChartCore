package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;

public class AATitle {
    public String text;
    public AAStyle style;
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;
    public Boolean userHTML;

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

    public AATitle x(Number prop) {
        x = prop;
        return this;
    }

    public AATitle y(Number prop) {
        y = prop;
        return this;
    }

    public AATitle userHTML(Boolean prop) {
        userHTML = prop;
        return this;
    }
}
