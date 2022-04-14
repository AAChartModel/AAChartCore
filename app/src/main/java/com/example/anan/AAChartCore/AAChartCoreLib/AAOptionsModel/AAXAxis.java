package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAXAxis {
    public String type;
    public AADateTimeLabelFormats dateTimeLabelFormats;
    public AAPlotBandsElement[] plotBands;
    public AAPlotLinesElement[] plotLines;
    public String[] categories;
    public Integer linkedTo;
    public Boolean reversed;
    public Boolean opposite;
    public Float lineWidth; //x轴轴线宽度
    public String lineColor; //x轴轴线线颜色
    public Float max; //x轴最大值
    public Float min;//x轴最小值（设置为0就不会有负数）
    public Integer minRange;
    public Integer minTickInterval; //The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    public String minorGridLineColor; //Color of the minor, secondary grid lines.
    public String minorGridLineDashStyle; //The dash or dot style of the minor grid lines.
    public Float minorGridLineWidth; //Width of the minor, secondary grid lines.
    public String minorTickColor; //Color for the minor tick marks.
    public Object minorTickInterval; /*Specific tick interval in axis units for the minor ticks. On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval. If null or undefined, minor ticks are not shown.
     On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc.
    If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.*/
    public Float minorTickLength; //The pixel length of the minor tick marks.
    public String minorTickPosition; //The position of the minor tick marks relative to the axis line. Can be one of inside and outside. Defaults to outside.
    public Float minorTickWidth; //The pixel width of the minor tick mark.

    public String tickColor; //x轴轴线下方刻度线颜色
    public Float gridLineWidth; //x轴网格线宽度
    public String gridLineColor; //x轴网格线颜色
    public String gridLineDashStyle; //x轴网格线样式
    public Float off;//x轴垂直偏移
    public AALabels labels; //用于设置 x 轴文字相关的
    public Boolean visible; //用于设置 x 轴以及 x 轴文字是否显示
    public Boolean startOnTick; //Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis start. 默认是：false.
    public Integer tickInterval;//x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容:
    public AACrosshair crosshair; //准星线样式设置
    public String tickmarkPlacement; //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    public Float tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    public Float tickLength;//坐标轴刻度线的长度。 默认是：10.
    public String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.
    public Object[] tickPositions; // Custom x-axis coordinates


    public AAXAxis type(String prop) {
        type = prop;
        return this;
    }

    public AAXAxis dateTimeLabelFormats(AADateTimeLabelFormats prop) {
        dateTimeLabelFormats = prop;
        return this;
    }

    public AAXAxis plotBands(AAPlotBandsElement[] prop) {
        plotBands = prop;
        return this;
    }

    public AAXAxis plotLines(AAPlotLinesElement[] prop) {
        plotLines = prop;
        return this;
    }

    public AAXAxis categories(String[] prop) {
        categories = prop;
        return this;
    }

    public AAXAxis linkedTo(Integer prop) {
        linkedTo = prop;
        return this;
    }

    public AAXAxis reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public AAXAxis opposite(Boolean prop) {
        opposite = prop;
        return this;
    }

    public AAXAxis lineWidth(Float prop) {
        lineWidth = prop;
        return this;
    }

    public AAXAxis lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAXAxis max(Float prop) {
        max = prop;
        return this;
    }

    public AAXAxis min(Float prop) {
        min = prop;
        return this;
    }

    public AAXAxis minRange(Integer prop) {
        minRange = prop;
        return this;
    }

    public AAXAxis minTickInterval(Integer prop) {
        minTickInterval = prop;
        return this;
    }

    public AAXAxis minorGridLineColor(String prop) {
        minorGridLineColor = prop;
        return this;
    }

    public AAXAxis minorGridLineDashStyle(String prop) {
        minorGridLineDashStyle = prop;
        return this;
    }

    public AAXAxis minorGridLineWidth(Float prop) {
        minorGridLineWidth = prop;
        return this;
    }

    public AAXAxis minorTickColor(String prop) {
        minorTickColor = prop;
        return this;
    }

    public AAXAxis minorTickInterval(Object prop) {
        minorTickInterval = prop;
        return this;
    }

    public AAXAxis minorTickLength(Float prop) {
        minorTickLength = prop;
        return this;
    }

    public AAXAxis minorTickPosition(String prop) {
        minorTickPosition = prop;
        return this;
    }

    public AAXAxis minorTickWidth(Float prop) {
        minorTickWidth = prop;
        return this;
    }

    public AAXAxis tickColor(String prop) {
        tickColor = prop;
        return this;
    }

    public AAXAxis gridLineWidth(Float prop) {
        gridLineWidth = prop;
        return this;
    }

    public AAXAxis gridLineColor(String prop) {
        gridLineColor = prop;
        return this;
    }

    public AAXAxis gridLineDashStyle(String prop) {
        gridLineDashStyle = prop;
        return this;
    }

    public AAXAxis off(Float prop) {
        off = prop;
        return this;
    }

    public AAXAxis labels(AALabels prop) {
        labels = prop;
        return this;
    }

    public AAXAxis visible(Boolean prop) {
        visible = prop;
        return this;
    }

    public AAXAxis startOnTick(Boolean prop) {
        startOnTick = prop;
        return this;
    }

    public AAXAxis tickInterval(Integer prop) {
        tickInterval = prop;
        return this;
    }

    public AAXAxis crosshair(AACrosshair prop) {
        crosshair = prop;
        return this;
    }

    public AAXAxis tickmarkPlacement(String prop) {
        tickmarkPlacement = prop;
        return this;
    }

    public AAXAxis tickWidth(Float prop) {
        tickWidth = prop;
        return this;
    }

    public AAXAxis tickLength(Float prop) {
        tickLength = prop;
        return this;
    }

    public AAXAxis tickPosition(String prop) {
        tickPosition = prop;
        return this;
    }

    public AAXAxis tickPositions(Object[] prop) {
        tickPositions = prop;
        return this;
    }
}
