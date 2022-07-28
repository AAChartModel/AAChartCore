package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPane {
    public AABackground background;
    public Object[] center;
    public Number endAngle;
    public Number size;
    public Number startAngle;

    public AAPane background(AABackground prop) {
        background = prop;
        return this;
    }

    public AAPane center(Object[] prop) {
        center = prop;
        return this;
    }

    public AAPane endAngle(Number prop) {
        endAngle = prop;
        return this;
    }

    public AAPane size(Number prop) {
        size = prop;
        return this;
    }

    public AAPane startAngle(Number prop) {
        startAngle = prop;
        return this;
    }
}
