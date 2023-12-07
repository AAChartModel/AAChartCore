package com.github.AAChartModel.AAChartCore.AAOptionsModel;

public class AAAxis {
    public Boolean allowDecimals;
    public Object alternateGridColor;
    public AACrosshair crosshair; //准星线样式设置
    public AATitle title;
    public String type;
    public AADateTimeLabelFormats dateTimeLabelFormats;
    public AAPlotBandsElement[] plotBands;
    public AAPlotLinesElement[] plotLines;
    public String[] categories;
    public Integer linkedTo;
    public Boolean reversed;
    public Boolean opposite;
    public Number lineWidth; //坐标轴轴线宽度
    public String lineColor; //坐标轴轴线线颜色
    public Number max; //坐标轴最大值
    public Number min;//坐标轴最小值（设置为0就不会有负数）
    public Number maxPadding;
    public Number minPadding;
    public Integer minRange;
    public Integer minTickInterval; //The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    public Boolean minorTicks; //是否显示次刻度线
    public String minorGridLineColor; //Color of the minor, secondary grid lines.
    public String minorGridLineDashStyle; //The dash or dot style of the minor grid lines.
    public Number minorGridLineWidth; //Width of the minor, secondary grid lines.
    public String minorTickColor; //Color for the minor tick marks.
    public Object minorTickInterval; /*Specific tick interval in axis units for the minor ticks. On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval. If null or undefined, minor ticks are not shown.
     On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc.
    If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.*/
    public Number minorTickLength; //The pixel length of the minor tick marks.
    public String minorTickPosition; //The position of the minor tick marks relative to the axis line. Can be one of inside and outside. Defaults to outside.
    public Number minorTickWidth; //The pixel width of the minor tick mark.

    public Number gridLineWidth; //坐标轴网格线宽度
    public String gridLineColor; //坐标轴网格线颜色
    public String gridLineDashStyle; //坐标轴网格线样式
    public String gridLineInterpolation;
    public Number offset;//坐标轴垂直偏移
    public AALabels labels; //用于设置坐标轴文字相关的
    public Boolean visible; //用于设置坐标轴以及坐标轴文字是否显示
    public Boolean startOnTick; // Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis start. The default is false.
    public Boolean endOnTick; // Whether to force the axis to end on a tick. Use this option with the minPadding option to control the axis end. The default is false.
    public String tickColor; //坐标轴轴线下方刻度线颜色
    public Integer tickAmount;
    public Number tickInterval;//坐标轴刻度点间隔数(设置每隔几个点显示一个 坐标轴的内容:
    public String tickmarkPlacement; //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    public Number tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    public Number tickLength;//坐标轴刻度线的长度。 默认是：10.
    public String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.
    public Object[] tickPositions; // Custom chart axis coordinates
    public Object left;

}
