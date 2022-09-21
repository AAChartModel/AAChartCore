package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AASeries {
    public String borderColor;
    public Number  borderWidth;
    public Number  borderRadius;
    public Object borderRadiusTopLeft;
    public Object borderRadiusTopRight;
    public Object borderRadiusBottomLeft;
    public Object borderRadiusBottomRight;
    public AAMarker marker;
    public String stacking;
    public AAAnimation animation;
    public String[] keys;
    public Boolean colorByPoint;//决定了图表是否给每个数据列或每个点分配一个颜色，默认值是 false， 即默认是给每个数据类分配颜色，
    public Boolean connectNulls;//设置折线是否断点重连
    public AASeriesEvents events;
    public AAShadow shadow;
    public AADataLabels dataLabels;
    public AAStates states;
    public AAPoint point;
    public Integer pointInterval;
    public String pointIntervalUnit;
    public Object pointPlacement;
    public Number pointStart;
    public Number pointWidth; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的宽度
    public Number maxPointWidth; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的最大宽度
    public Number minPointLength; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的最小高度




    public AASeries borderColor(String prop) {
        borderColor = prop;
        return this;
    }
    
    public AASeries borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AASeries borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AASeries borderRadiusTopLeft(Object prop) {
        borderRadiusTopLeft = prop;
        return this;
    }

    public AASeries borderRadiusTopRight(Object prop) {
        borderRadiusTopRight = prop;
        return this;
    }

    public AASeries borderRadiusBottomLeft(Object prop) {
        borderRadiusBottomLeft = prop;
        return this;
    }

    public AASeries borderRadiusBottomRight(Object prop) {
        borderRadiusBottomRight = prop;
        return this;
    }

    public AASeries marker(AAMarker prop) {
        marker = prop;
        return this;
    }

    public AASeries stacking(String prop) {
        stacking = prop;
        return this;
    }

    public AASeries animation(AAAnimation prop) {
        animation = prop;
        return this;
    }

    public AASeries keys(String[] prop) {
        keys = prop;
        return this;
    }

    public AASeries colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public AASeries connectNulls(Boolean prop) {
        connectNulls = prop;
        return this;
    }

    public AASeries events(AASeriesEvents prop) {
        events = prop;
        return this;
    }

    public AASeries shadow(AAShadow prop) {
        shadow = prop;
        return this;
    }

    public AASeries dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AASeries states(AAStates prop) {
        states = prop;
        return this;
    }

    public AASeries point(AAPoint prop) {
        point = prop;
        return this;
    }

    public AASeries pointInterval(Integer prop) {
        pointInterval = prop;
        return this;
    }

    public AASeries pointIntervalUnit(String prop) {
        pointIntervalUnit = prop;
        return this;
    }

    public AASeries pointPlacement(Object prop) {
        pointPlacement = prop;
        return this;
    }

    public AASeries pointStart(Number prop) {
        pointStart = prop;
        return this;
    }

    public AASeries pointWidth(Number prop) {
        pointWidth = prop;
        return this;
    }

    public AASeries maxPointWidth(Number prop) {
        maxPointWidth = prop;
        return this;
    }

    public AASeries minPointLength(Number prop) {
        minPointLength = prop;
        return this;
    }

}
