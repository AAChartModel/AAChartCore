package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAYAxis {
    public Object alternateGridColor;//backcolor of every other grid line area
    public AATitle title;
    public String type;
    public AADateTimeLabelFormats dateTimeLabelFormats;
    public AAPlotBandsElement[] plotBands;
    public AAPlotLinesElement[] plotLines;
    public String[] categories;
    public Boolean reversed;
    public Float gridLineWidth;// y 轴网格线宽度
    public String gridLineColor;  // y 轴网格线颜色
    public String gridLineDashStyle; //网格线线条样式，所有可用的线条样式参考：Highcharts线条样式
    public String gridLineInterpolation; //Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either circle or polygon. 默认是：null.
    public AALabels labels;//用于设置 y 轴文字相关的
    public Float lineWidth; // y 轴线宽度
    public String lineColor; // y 轴线颜色
    public Float off; // y 轴线水平偏移
    public Boolean allowDecimals; //y轴是否允许显示小数
    public Float max; //y轴最大值
    public Float min; //y轴最小值（设置为0就不会有负数）
    //private var minPadding:   //Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. 默认是：0.05.
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

    public Object[] tickPositions; //自定义Y轴坐标（如：[0, 25, 50, 75 , 100]）
    public Boolean visible; //y轴是否允许显示
    public Boolean opposite;//是否将坐标轴显示在对立面，默认情况下 x 轴是在图表的下方显示，y 轴是在左方，坐标轴显示在对立面后，x 轴是在上方显示，y 轴是在右方显示（即坐标轴会显示在对立面）。该配置一般是用于多坐标轴区分展示，另外在 Highstock 中，y 轴默认是在对立面显示的。 默认是：false.
    public Integer tickInterval;
    public AACrosshair crosshair;  //准星线样式设置
    public String stackLabels;
    public Float tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    public Float tickLength;//坐标轴刻度线的长度。 默认是：10.
    public String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.

    public AAYAxis alternateGridColor(Object prop) {
        alternateGridColor = prop;
        return this;
    }

    public AAYAxis title(AATitle prop) {
        title = prop;
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

    public AAYAxis reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public AAYAxis gridLineWidth(Float prop) {
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

    public AAYAxis labels(AALabels prop) {
        labels = prop;
        return this;
    }

    public AAYAxis lineWidth(Float prop) {
        lineWidth = prop;
        return this;
    }

    public AAYAxis lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public AAYAxis off(Float prop) {
        off = prop;
        return this;
    }

    public AAYAxis allowDecimals(Boolean prop) {
        allowDecimals = prop;
        return this;
    }

    public AAYAxis max(Float prop) {
        max = prop;
        return this;
    }

    public AAYAxis min(Float prop) {
        min = prop;
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

    public AAYAxis minorGridLineColor(String prop) {
        minorGridLineColor = prop;
        return this;
    }

    public AAYAxis minorGridLineDashStyle(String prop) {
        minorGridLineDashStyle = prop;
        return this;
    }

    public AAYAxis minorGridLineWidth(Float prop) {
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

    public AAYAxis minorTickLength(Float prop) {
        minorTickLength = prop;
        return this;
    }

    public AAYAxis minorTickPosition(String prop) {
        minorTickPosition = prop;
        return this;
    }

    public AAYAxis minorTickWidth(Float prop) {
        minorTickWidth = prop;
        return this;
    }

    public AAYAxis tickPositions(Object[] prop) {
        tickPositions = prop;
        return this;
    }

    public AAYAxis visible(Boolean prop) {
        visible = prop;
        return this;
    }

    public AAYAxis opposite(Boolean prop) {
        opposite = prop;
        return this;
    }

    public AAYAxis tickInterval(Integer prop) {
        tickInterval = prop;
        return this;
    }

    public AAYAxis crosshair(AACrosshair prop) {
        crosshair = prop;
        return this;
    }

    public AAYAxis stackLabels(String prop) {
        stackLabels = prop;
        return this;
    }

    public AAYAxis tickWidth(Float prop) {
        tickWidth = prop;
        return this;
    }

    public AAYAxis tickLength(Float prop) {
        tickLength = prop;
        return this;
    }

    public AAYAxis tickPosition(String prop) {
        tickPosition = prop;
        return this;
    }

}
