package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AABar {
    public String name;
    public Object[] data;
    public String color;
    public Boolean grouping;//Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 默认是：true.
    public Float pointPadding;//Padding between each column or bar, in x axis units. 默认是：0.1.
    public Float pointPlacement;//Padding between each column or bar, in x axis units. 默认是：0.1.
    public Float groupPadding;//Padding between each value groups, in x axis units. 默认是：0.2.
    public Float borderWidth;
    public Boolean colorByPoint;//对每个不同的点设置颜色(当图表类型为 AABar 时,设置为 AABar 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    public AADataLabels dataLabels;
    public String stacking;
    public Float borderRadius;
    public Float yAxis;

    public AABar name(String prop) {
        name = prop;
        return this;
    }

    public AABar data(Object[] prop) {
        data = prop;
        return this;
    }

    public AABar color(String prop) {
        color = prop;
        return this;
    }

    public AABar grouping(Boolean prop) {
        grouping = prop;
        return this;
    }

    public AABar pointPadding(Float prop) {
        pointPadding = prop;
        return this;
    }

    public AABar pointPlacement(Float prop) {
        pointPlacement = prop;
        return this;
    }

    public AABar groupPadding(Float prop) {
        groupPadding = prop;
        return this;
    }

    public AABar borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AABar colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public AABar dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AABar stacking(String prop) {
        stacking = prop;
        return this;
    }

    public AABar borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AABar yAxis(Float prop) {
        yAxis = prop;
        return this;
    }
}
