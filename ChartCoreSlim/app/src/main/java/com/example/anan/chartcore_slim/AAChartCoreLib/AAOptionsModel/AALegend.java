package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartLegendAlignType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartLegendVerticalAlignType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartLegendlLayoutType;

public class AALegend {
    private AAChartLegendlLayoutType layout; //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    private AAChartLegendAlignType align; //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    private AAChartLegendVerticalAlignType verticalAlign; //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    private Boolean enabled;
    private String borderColor;
    private Float borderWidth;
    private Float itemMarginTop; //图例的每一项的顶部外边距，单位px。 默认是：0.
    private String itemStyle;
    private Float x;
    private Float y;

    public AALegend layout(AAChartLegendlLayoutType prop) {
        this.layout = prop;
        return this;
    }

    public AALegend align(AAChartLegendAlignType prop) {
        this.align = prop;
        return this;
    }

    public AALegend verticalAlign(AAChartLegendVerticalAlignType prop) {
        this.verticalAlign = prop;
        return this;
    }

    public AALegend enabled(Boolean prop) {
        this.enabled = prop;
        return this;
    }

    public AALegend borderColor(String prop) {
        this.borderColor = prop;
        return this;
    }

    public AALegend BorderWidth(Float prop) {
        this.borderWidth = prop;
        return this;
    }

    public AALegend itemMarginTop(Float prop) {
        this.itemMarginTop = prop;
        return this;
    }

    public AALegend itemStyle(AAItemStyle prop) {
        this.itemStyle = prop.toString();
        return this;
    }

    public AALegend x(Float prop) {
        this.x = prop;
        return this;
    }

    public AALegend y(Float prop) {
        this.y = prop;
        return this;
    }

}
