package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLayoutType;

public class AALegend {
    private AAChartLayoutType layout; //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    private AAChartAlignType align; //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    private AAChartVerticalAlignType verticalAlign; //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    private Boolean enabled;
    private String borderColor;
    private Float borderWidth;
    private Float itemMarginTop; //图例的每一项的顶部外边距，单位px。 默认是：0.
    private AAItemStyle itemStyle;
    private Float x;
    private Float y;

    public AALegend layout(AAChartLayoutType prop) {
        layout = prop;
        return this;
    }

    public AALegend align(AAChartAlignType prop) {
        align = prop;
        return this;
    }

    public AALegend verticalAlign(AAChartVerticalAlignType prop) {
        verticalAlign = prop;
        return this;
    }

    public AALegend enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AALegend borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AALegend BorderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AALegend itemMarginTop(Float prop) {
        itemMarginTop = prop;
        return this;
    }

    public AALegend itemStyle(AAItemStyle prop) {
        itemStyle = prop;
        return this;
    }

    public AALegend x(Float prop) {
        x = prop;
        return this;
    }

    public AALegend y(Float prop) {
        y = prop;
        return this;
    }

}
