package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

import com.example.anan.chartcore_slim.AAChartCoreLib.AATools.AAEasyTool;

public class AATooltip {
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private AAStyle style;
    private Boolean enabled;
    private Boolean useHTML;
    private String formatter;
    private String headerFormat;
    private String pointFormat;
    private String footerFormat;
    private Integer valueDecimals;
    private Boolean shared;
    private Boolean crosshairs;
    private String valueSuffix;

    public AATooltip backgroundColor(String prop) {
        backgroundColor = prop;
        return this;
    }

    public AATooltip borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AATooltip borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AATooltip borderWidth(Float prop) {
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
        String pureJSFunctionStr = "(" + prop + ")";
        pureJSFunctionStr = AAEasyTool.pureJavaScriptFunctionString(pureJSFunctionStr);
        formatter = pureJSFunctionStr;
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

    public AATooltip crosshairs(Boolean prop) {
        crosshairs = prop;
        return this;
    }

    public AATooltip valueSuffix(String prop) {
        valueSuffix = prop;
        return this;
    }

    public AATooltip() {
        enabled = true;
        shared = true;
        crosshairs = true;
    }


    
  
}
