package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AABoxplot {
    public String boxDashStyle;
    public Object fillColor;
    public Number lineWidth;
    public String medianColor;
    public String medianDashStyle;
    public Number medianWidth;
    public String stemColor;
    public String stemDashStyle;
    public Number stemWidth;
    public String whiskerColor;
    public String whiskerDashStyle;
    public String whiskerLength;
    public Number whiskerWidth;

    public AABoxplot boxDashStyle(String prop) {
        boxDashStyle = prop;
        return this;
    }

    public AABoxplot fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public AABoxplot lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AABoxplot medianColor(String prop) {
        medianColor = prop;
        return this;
    }

    public AABoxplot medianDashStyle(String prop) {
        medianDashStyle = prop;
        return this;
    }

    public AABoxplot medianWidth(Number prop) {
        medianWidth = prop;
        return this;
    }

    public AABoxplot stemColor(String prop) {
        stemColor = prop;
        return this;
    }

    public AABoxplot stemDashStyle(String prop) {
        stemDashStyle = prop;
        return this;
    }

    public AABoxplot stemWidth(Number prop) {
        stemWidth = prop;
        return this;
    }

    public AABoxplot whiskerColor(String prop) {
        whiskerColor = prop;
        return this;
    }

    public AABoxplot whiskerDashStyle(String prop) {
        whiskerDashStyle = prop;
        return this;
    }

    public AABoxplot whiskerLength(String prop) {
        whiskerLength = prop;
        return this;
    }

    public AABoxplot whiskerWidth(Number prop) {
        whiskerWidth = prop;
        return this;
    }
}
