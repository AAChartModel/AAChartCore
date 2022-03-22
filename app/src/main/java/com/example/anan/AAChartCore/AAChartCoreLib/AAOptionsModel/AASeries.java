package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AASeries {
    public String borderColor;
    public Float  borderWidth;
    public Float  borderRadius;
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


    public AASeries borderColor(String prop) {
        borderColor = prop;
        return this;
    }
    
    public AASeries borderWidth(Float prop) {
        borderWidth = prop;
        return this;
    }

    public AASeries borderRadius(Float prop) {
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

}
