package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPie {
    public String type;
    public String name;
    public Object[] data;
    public AADataLabels dataLabels;
    public Number size;
    public String innerSize;
    public Boolean allowPointSelect;
    public String cursor;
    public Boolean showInLegend;
    public Number startAngle;
    public Number endAngle;
    public Number depth;
    public Object center;

    public AAPie type(String prop) {
        type = prop;
        return this;
    }

    public AAPie name(String prop) {
        name = prop;
        return this;
    }

    public AAPie data(Object[] prop) {
        data = prop;
        return this;
    }

    public AAPie dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AAPie size(Number prop) {
        size = prop;
        return this;
    }

    public AAPie innerSize(String prop) {
        innerSize = prop;
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

    public AAPie startAngle(Number prop) {
        startAngle = prop;
        return this;
    }

    public AAPie endAngle(Number prop) {
        endAngle = prop;
        return this;
    }

    public AAPie depth(Number prop) {
        depth = prop;
        return this;
    }

    public AAPie center(Object prop) {
        center = prop;
        return this;
    }

}
