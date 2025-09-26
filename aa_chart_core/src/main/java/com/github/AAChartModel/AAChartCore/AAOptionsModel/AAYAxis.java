package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAYAxis extends AAAxis {
    public Object stackLabels;
    public String tooltipValueFormat; ////Parallel coordinates only. https://api.highcharts.com.cn/highcharts/yAxis.tooltipValueFormat.html
    public Object width;
    public AAYAxis stackLabels(String prop) {
        stackLabels = prop;
        return this;
    }

    public AAYAxis tooltipValueFormat(String prop) {
        tooltipValueFormat = prop;
        return this;
    }

    public AAYAxis width(Object prop) {
        width = prop;
        return this;
    }

    ///////////////////////////////////////////

    public AAYAxis allowDecimals(Boolean prop) {
        allowDecimals = prop;
        return this;
    }

    public AAYAxis alternateGridColor(Object prop) {
        alternateGridColor = prop;
        return this;
    }

    public AAYAxis crosshair(AACrosshair prop) {
        crosshair = prop;
        return this;
    }

    public AAYAxis title(AAAxisTitle prop) {
        title = prop;
        return this;
    }

    // 为了保持向后兼容性，添加对 AATitle 的支持
    // 同时添加方法废弃警告⚠️, 提示用户使用新的 AAAxisTitle 类型
    @Deprecated
    public AAYAxis title(AATitle prop) {
        if (prop != null) {
            AAAxisTitle axisTitle = new AAAxisTitle()
                    .text(prop.text)
                    .style(prop.style)
                    .x(prop.x)
                    .y(prop.y)
                    .useHTML(prop.useHTML);
            title = axisTitle;
        } else {
            title = null;
        }
        return this;
    }

    public AAYAxis type(String prop) {
        type = prop;
        return this;
    }

    public AAYAxis dateTimeLabelFormats(AADateTimeLabelFormats prop) {
        dateTimeLabelFormats = prop;
        return this;
    }

    public AAYAxis plotBands(AAPlotBandsElement[] prop) {
        plotBands = prop;
        return this;
    }

    public AAYAxis plotLines(AAPlotLinesElement[] prop) {
        plotLines = prop;
        return this;
    }

    public AAYAxis categories(String[] prop) {
        categories = prop;
        return this;
    }

    public AAYAxis linkedTo(Integer prop) {
        linkedTo = prop;
        return this;
    }

    public AAYAxis reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public AAYAxis opposite(Boolean prop) {
        opposite = prop;
        return this;
    }

    public AAYAxis lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AAYAxis lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAYAxis max(Number prop) {
        max = prop;
        return this;
    }

    public AAYAxis min(Number prop) {
        min = prop;
        return this;
    }

    public AAYAxis maxPadding(Number prop) {
        maxPadding = prop;
        return this;
    }

    public AAYAxis minPadding(Number prop) {
        minPadding = prop;
        return this;
    }

    public AAYAxis minRange(Integer prop) {
        minRange = prop;
        return this;
    }

    public AAYAxis minTickInterval(Integer prop) {
        minTickInterval = prop;
        return this;
    }

    public AAYAxis minorTicks(Boolean prop) {
        minorTicks = prop;
        return this;
    }

    public AAYAxis minorGridLineColor(String prop) {
        minorGridLineColor = prop;
        return this;
    }

    public AAYAxis minorGridLineDashStyle(String prop) {
        minorGridLineDashStyle = prop;
        return this;
    }

    public AAYAxis minorGridLineWidth(Number prop) {
        minorGridLineWidth = prop;
        return this;
    }

    public AAYAxis minorTickColor(String prop) {
        minorTickColor = prop;
        return this;
    }

    public AAYAxis minorTickInterval(Object prop) {
        minorTickInterval = prop;
        return this;
    }

    public AAYAxis minorTickLength(Number prop) {
        minorTickLength = prop;
        return this;
    }

    public AAYAxis minorTickPosition(String prop) {
        minorTickPosition = prop;
        return this;
    }

    public AAYAxis minorTickWidth(Number prop) {
        minorTickWidth = prop;
        return this;
    }

    public AAYAxis gridLineWidth(Number prop) {
        gridLineWidth = prop;
        return this;
    }

    public AAYAxis gridLineColor(String prop) {
        gridLineColor = prop;
        return this;
    }

    public AAYAxis gridLineDashStyle(String prop) {
        gridLineDashStyle = prop;
        return this;
    }

    public AAYAxis gridLineInterpolation(String prop) {
        gridLineInterpolation = prop;
        return this;
    }

    public AAYAxis offset(Number prop) {
        offset = prop;
        return this;
    }

    public AAYAxis labels(AALabels prop) {
        labels = prop;
        return this;
    }

    public AAYAxis visible(Boolean prop) {
        visible = prop;
        return this;
    }

    public AAYAxis startOnTick(Boolean prop) {
        startOnTick = prop;
        return this;
    }

    public AAYAxis endOnTick(Boolean prop) {
        endOnTick = prop;
        return this;
    }

    public AAYAxis tickColor(String prop) {
        tickColor = prop;
        return this;
    }

    public AAYAxis tickAmount(Integer prop) {
        tickAmount = prop;
        return this;
    }

    public AAYAxis tickInterval(Number prop) {
        tickInterval = prop;
        return this;
    }

    public AAYAxis tickmarkPlacement(String prop) {
        tickmarkPlacement = prop;
        return this;
    }

    public AAYAxis tickWidth(Number prop) {
        tickWidth = prop;
        return this;
    }

    public AAYAxis tickLength(Number prop) {
        tickLength = prop;
        return this;
    }

    public AAYAxis tickPosition(String prop) {
        tickPosition = prop;
        return this;
    }

    public AAYAxis tickPositions(Object[] prop) {
        tickPositions = prop;
        return this;
    }

    public AAYAxis left(Object prop) {
        left = prop;
        return this;
    }

}
