package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAChart {
    public String type;
    public Object backgroundColor;
    public String plotBackgroundImage;
    public String pinchType;
    public Boolean panning;
    public String panKey;
    public Boolean polar;
    public AAAnimation animation;
    public Boolean inverted;
    /*图表外边缘和绘图区域之间的边距。 数组中的数字分别表示顶部，右侧，底部和左侧 ([👆,👉,👇,👈])。
    也可以使用 marginTop，marginRight，marginBottom 和 marginLeft 来设置某一个方向的边距*/
    public Float[] margin;
    public Float marginTop; //👆
    public Float marginRight; //👉
    public Float marginBottom; //👇
    public Float marginLeft; //👈
    public AAScrollablePlotArea scrollablePlotArea;

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

    public AAChart animation(AAAnimation prop) {
        animation = prop;
        return this;
    }

    public AAChart inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public AAChart margin(Float[] prop) {
        margin = prop;
        return this;
    }

    public AAChart marginTop(Float prop) {
        marginTop = prop;
        return this;
    }

    public AAChart marginRight(Float prop) {
        marginRight = prop;
        return this;
    }

    public AAChart marginBottom(Float prop) {
        marginBottom = prop;
        return this;
    }

    public AAChart marginLeft(Float prop) {
        marginLeft = prop;
        return this;
    }

    public AAChart scrollablePlotArea(AAScrollablePlotArea prop) {
        scrollablePlotArea = prop;
        return this;
    }



}
