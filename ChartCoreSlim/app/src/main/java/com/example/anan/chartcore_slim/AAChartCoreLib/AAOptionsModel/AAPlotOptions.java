package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAPlotOptions {
    public AAColumn column;
    public AALine line;
    public AAPie pie;
    public AABar bar;
    public AASpline spline;
    public AAArea area;
    public AAAreaspline areaspline;
    public Object columnrange;
    public Object arearange;
    public AASeries series;


    public AAPlotOptions column(AAColumn prop) {
        column = prop;
        return this;
    }

    public AAPlotOptions line(AALine prop) {
        line = prop;
        return this;
    }

    public AAPlotOptions pie(AAPie prop) {
        pie = prop;
        return this;
    }

    public AAPlotOptions bar(AABar prop) {
        bar = prop;
        return this;
    }

    public AAPlotOptions spline(AASpline prop) {
        spline = prop;
        return this;
    }

    public AAPlotOptions area(AAArea prop) {
        area = prop;
        return this;
    }

    public AAPlotOptions areaspline(AAAreaspline prop) {
        areaspline = prop;
        return this;
    }

    public AAPlotOptions columnrange(Object prop) {
        columnrange = prop;
        return this;
    }

    public AAPlotOptions arearange(Object prop) {
        arearange = prop;
        return this;
    }

    public AAPlotOptions series(AASeries prop) {
        series = prop;
        return this;
    }

}
