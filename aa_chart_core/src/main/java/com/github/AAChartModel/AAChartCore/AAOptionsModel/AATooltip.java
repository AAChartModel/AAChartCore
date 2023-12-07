package com.github.AAChartModel.AAChartCore.AAOptionsModel;

import com.github.AAChartModel.AAChartCore.AATools.AAJSStringPurer;

public class AATooltip {
    public Object backgroundColor;
    public String borderColor;
    public Number borderRadius;
    public Number borderWidth;
    public AAStyle style;
    public Boolean enabled;
    public Boolean useHTML;
    public String formatter;
    public String headerFormat;
    public String pointFormat;
    public String footerFormat;
    public Integer valueDecimals;
    public Boolean shared;
    public String valueSuffix;
    public Boolean followTouchMove;//https://api.highcharts.com.cn/highcharts#chart.panning
    public Boolean shadow;
    public Number padding;
    public String pointFormatter;
    public String positioner;
    public AADateTimeLabelFormats dateTimeLabelFormats;
    public String shape;

    public AATooltip backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }

    public AATooltip borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AATooltip borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AATooltip borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AATooltip style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AATooltip enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public AATooltip useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public AATooltip formatter(String prop) {
        formatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public AATooltip headerFormat(String prop) {
        headerFormat = prop;
        return this;
    }

    public AATooltip pointFormat(String prop) {
        pointFormat = prop;
        return this;
    }

    public AATooltip footerFormat(String prop) {
        footerFormat = prop;
        return this;
    }

    public AATooltip valueDecimals(Integer prop) {
        valueDecimals = prop;
        return this;
    }

    public AATooltip shared(Boolean prop) {
        shared = prop;
        return this;
    }

    public AATooltip valueSuffix(String prop) {
        valueSuffix = prop;
        return this;
    }

    public AATooltip followTouchMove(Boolean prop) {
        followTouchMove = prop;
        return this;
    }

    public AATooltip shadow(Boolean prop) {
        shadow = prop;
        return this;
    }

    public AATooltip padding(Number prop) {
        padding = prop;
        return this;
    }

    public AATooltip pointFormatter(String prop) {
        pointFormatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public AATooltip positioner(String prop) {
        positioner = AAJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public AATooltip dateTimeLabelFormats(AADateTimeLabelFormats prop) {
        dateTimeLabelFormats = prop;
        return this;
    }

    public AATooltip shape(String prop) {
        shape = prop;
        return this;
    }

    public AATooltip() {
        enabled = true;
        shared = true;
    }


    
  
}
