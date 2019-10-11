package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPie {
    public AADataLabels dataLabels;
    public Float size;
    public Boolean allowPointSelect;
    public String cursor;
    public Boolean showInLegend;
    public Float startAngle;
    public Float endAngle;
    public Float depth;
    public Float center;

    public AAPie dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AAPie size(Float prop) {
        size = prop;
        return this;
    }

    public AAPie allowPointSelect(Boolean prop) {
        allowPointSelect = prop;
        return this;
    }

    public AAPie cursor(String prop) {
        cursor = prop;
        return this;
    }

    public AAPie showInLegend(Boolean prop) {
        showInLegend = prop;
        return this;
    }

    public AAPie startAngle(Float prop) {
        startAngle = prop;
        return this;
    }

    public AAPie endAngle(Float prop) {
        endAngle = prop;
        return this;
    }

    public AAPie depth(Float prop) {
        depth = prop;
        return this;
    }

    public AAPie center(Float prop) {
        center = prop;
        return this;
    }

}
