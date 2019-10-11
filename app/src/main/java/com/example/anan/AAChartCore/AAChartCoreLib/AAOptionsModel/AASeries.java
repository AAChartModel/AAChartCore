package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import java.util.Map;

public class AASeries {
    public Float borderRadius;
    public AAMarker marker;
    public String stacking;
    public AAAnimation animation;
    public String[] keys;
    public Boolean colorByPoint;//决定了图表是否给每个数据列或每个点分配一个颜色，默认值是 false， 即默认是给每个数据类分配颜色，
    public Boolean connectNulls;//设置折线是否断点重连
    public Map events;
    public AAShadow shadow;

    public AASeries borderRadius(Float prop) {
        borderRadius = prop;
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

    public AASeries events(Map prop) {
        events = prop;
        return this;
    }

    public AASeries shadow(AAShadow prop) {
        shadow = prop;
        return this;
    }

}
