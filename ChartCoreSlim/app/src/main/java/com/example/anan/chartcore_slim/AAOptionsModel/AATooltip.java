package com.example.anan.chartcore_slim.AAOptionsModel;

import com.example.anan.chartcore_slim.AATools.AAEasyTool;

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

    public AATooltip backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public AATooltip borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public AATooltip borderRadius(Float borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public AATooltip borderWidth(Float borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public AATooltip style(AAStyle style) {
        this.style = style;
        return this;
    }

    public AATooltip enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AATooltip useHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public AATooltip formatter(String formatter) {
        String pureJSFunctionStr = "(" + formatter + ")";
        pureJSFunctionStr = AAEasyTool.pureJavaScriptFunctionString(pureJSFunctionStr);
        this.formatter = pureJSFunctionStr;
        return this;
    }

    public AATooltip headerFormat(String headerFormat) {
        this.headerFormat = headerFormat;
        return this;
    }

    public AATooltip pointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
        return this;
    }

    public AATooltip footerFormat(String footerFormat) {
        this.footerFormat = footerFormat;
        return this;
    }

    public AATooltip valueDecimals(Integer valueDecimals) {
        this.valueDecimals = valueDecimals;
        return this;
    }

    public AATooltip shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    public AATooltip crosshairs(Boolean crosshairs) {
        this.crosshairs = crosshairs;
        return this;
    }

    public AATooltip valueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
        return this;
    }


    
  
}
