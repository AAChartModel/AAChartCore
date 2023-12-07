package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AALang {
    public String noData;
    public Integer numericSymbolMagnitude;
    public String[] numericSymbols;
    public String resetZoom;
    public String thousandsSep;

    public AALang noData(String prop) {
        noData = prop;
        return this;
    }

    public AALang numericSymbolMagnitude(Integer prop) {
        numericSymbolMagnitude = prop;
        return this;
    }

    public AALang numericSymbols(String[] prop) {
        numericSymbols = prop;
        return this;
    }

    public AALang resetZoom(String prop) {
        resetZoom = prop;
        return this;
    }

    public AALang thousandsSep(String prop) {
        thousandsSep = prop;
        return this;
    }
}
