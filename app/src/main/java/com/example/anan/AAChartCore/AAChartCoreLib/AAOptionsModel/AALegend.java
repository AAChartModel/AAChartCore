package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AALegend {
    public String layout; //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    public String align; //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    public String verticalAlign; //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    public Boolean enabled;
    public String borderColor;
    public Float borderWidth;
    public Float itemMarginTop; //图例的每一项的顶部外边距，单位px。 默认是：0.
    public AAItemStyle itemStyle;
    public Float x;
    public Float y;
    public Boolean floating;

    public AALegend layout(String prop) {
        layout = prop;
        return this;
    }

    public AALegend align(String prop) {
        align = prop;
        return this;
    }

    public AALegend verticalAlign(String prop) {
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

    public AALegend floating(Boolean prop) {
        floating = prop;
        return this;
    }



}
