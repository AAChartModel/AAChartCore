package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAColumn {
    private String name;
    private Object[] data;
    private String color;
    private Boolean grouping;//Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 默认是：true.
    private Float pointPadding;//Padding between each column or bar, in x axis units. 默认是：0.1.
    private Float pointPlacement;//Padding between each column or bar, in x axis units. 默认是：0.1.
    private Float groupPadding;//Padding between each value groups, in x axis units. 默认是：0.2.
    private Float borderWidth;
    private Boolean colorByPoint;//对每个不同的点设置颜色(当图表类型为 AAColumn 时,设置为 AAColumn 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    private AADataLabels dataLabels;
    private String stacking;
    private Float borderRadius;
    private Float yAxis;

    public AAColumn name(String prop) {
        name = prop;
        return this;
    }

    public AAColumn data(Object[] prop) {
        data = prop;
        return this;
    }

    public AAColumn color(String prop) {
        color = prop;
        return this;
    }

    public AAColumn grouping(Boolean prop) {
        grouping = prop;
        return this;
    }

    public AAColumn pointPadding(Float prop) {
        pointPadding = prop;
        return this;
    }

    public AAColumn pointPlacement(Float prop) {
        pointPlacement = prop;
        return this;
    }

    public AAColumn groupPadding(Float prop) {
        groupPadding = prop;
        return this;
    }

    public AAColumn borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AAColumn colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public AAColumn dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AAColumn stacking(String prop) {
        stacking = prop;
        return this;
    }

    public AAColumn borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AAColumn yAxis(Float prop) {
        yAxis = prop;
        return this;
    }

}
