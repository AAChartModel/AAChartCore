package com.github.AAChartModel.AAChartCore.AAOptionsModel;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartEvents;

public class AAChart {
    public String type;
    public Object backgroundColor;
    public String plotBackgroundImage;
    public String pinchType;
    public Boolean panning;
    public String panKey;
    public Boolean polar;
    public Object animation; //AAAnimation | Boolean
    public Boolean inverted;
    /*图表外边缘和绘图区域之间的边距。 数组中的数字分别表示顶部，右侧，底部和左侧 ([👆,👉,👇,👈])。
    也可以使用 marginTop，marginRight，marginBottom 和 marginLeft 来设置某一个方向的边距*/
    public Number[] margin;
    public Number marginTop; //👆
    public Number marginRight; //👉
    public Number marginBottom; //👇
    public Number marginLeft; //👈
    public AAScrollablePlotArea scrollablePlotArea;
    public AAResetZoomButton resetZoomButton;
    public String zoomType;
    public AAChartEvents events;
    public Number height;

    public AAChart type(String prop) {
        type = prop;
        return this;
    }

    public AAChart backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }

    public AAChart plotBackgroundImage(String prop) {
        plotBackgroundImage = prop;
        return this;
    }

    public AAChart pinchType(String prop) {
        pinchType = prop;
        return this;
    }

    public AAChart panning(Boolean prop) {
        panning = prop;
        return this;
    }

    public AAChart panKey(String prop) {
        panKey = prop;
        return this;
    }

    public AAChart polar(Boolean prop) {
        polar = prop;
        return this;
    }

    public AAChart animation(Object prop) {
        animation = prop;
        return this;
    }

    public AAChart inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public AAChart margin(Number[] prop) {
        margin = prop;
        return this;
    }

    public AAChart marginTop(Number prop) {
        marginTop = prop;
        return this;
    }

    public AAChart marginRight(Number prop) {
        marginRight = prop;
        return this;
    }

    public AAChart marginBottom(Number prop) {
        marginBottom = prop;
        return this;
    }

    public AAChart marginLeft(Number prop) {
        marginLeft = prop;
        return this;
    }

    public AAChart scrollablePlotArea(AAScrollablePlotArea prop) {
        scrollablePlotArea = prop;
        return this;
    }

    public AAChart resetZoomButton(AAResetZoomButton prop) {
        resetZoomButton = prop;
        return this;
    }

    public AAChart zoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public AAChart events(AAChartEvents events) {
        this.events = events;
        return this;
    }

    public AAChart height(Number height) {
        this.height = height;
        return this;
    }

}
