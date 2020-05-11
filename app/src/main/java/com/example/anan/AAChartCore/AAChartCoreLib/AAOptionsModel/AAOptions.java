package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAOptions {
    public AAChart chart;
    public AATitle title;
    public AASubtitle subtitle;
    public AAXAxis xAxis;
    public AAYAxis yAxis;
    public AAXAxis[] xAxisArray;
    public AAYAxis[] yAxisArray;
    public AATooltip tooltip;
    public AAPlotOptions plotOptions;
    public Object[] series;
    public AALegend legend;
    public AAPane pane;
    public Object[] colors;
    public Boolean touchEventEnabled;

    public AAOptions chart(AAChart prop) {
        chart = prop;
        return this;
    }

    public AAOptions title(AATitle prop) {
        title = prop;
        return this;
    }

    public AAOptions subtitle(AASubtitle prop) {
        subtitle = prop;
        return this;
    }

    public AAOptions xAxis(AAXAxis prop) {
        xAxis = prop;
        return this;
    }

    public AAOptions yAxis(AAYAxis prop) {
        yAxis = prop;
        return this;
    }

    public AAOptions xAxisArray(AAXAxis[] prop) {
        xAxisArray = prop;
        return this;
    }

    public AAOptions yAxisArray(AAYAxis[] prop) {
        yAxisArray = prop;
        return this;
    }

    public AAOptions tooltip(AATooltip prop) {
        tooltip = prop;
        return this;
    }

    public AAOptions plotOptions(AAPlotOptions prop) {
        plotOptions = prop;
        return this;
    }

    public AAOptions series(Object[] prop) {
        series = prop;
        return this;
    }

    public AAOptions legend(AALegend prop) {
        legend = prop;
        return this;
    }

    public AAOptions pane(AAPane prop) {
        pane = prop;
        return this;
    }

    public AAOptions colors(Object[] prop) {
        colors = prop;
        return this;
    }

    public AAOptions touchEventEnabled(Boolean prop) {
        touchEventEnabled = prop;
        return this;
    }

}
