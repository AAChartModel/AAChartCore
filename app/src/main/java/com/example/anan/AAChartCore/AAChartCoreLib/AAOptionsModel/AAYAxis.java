package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAYAxis {
    public AATitle title;
    public AAPlotBandsElement[] plotBands;
    public AAPlotLinesElement[] plotLines;
    public String[] categories;
    public Boolean reversed;
    public Float gridLineWidth;// y 轴网格线宽度
    public String gridLineColor;  // y 轴网格线颜色
    public String gridLineDashStyle; //网格线线条样式，所有可用的线条样式参考：Highcharts线条样式
    public String alternateGridColor;  //backcolor of every other grid line area
    public String gridLineInterpolation; //Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either circle or polygon. 默认是：null.
    public AALabels labels;//用于设置 y 轴文字相关的
    public Float lineWidth; // y 轴线宽度
    public String lineColor; // y 轴线颜色
    public Float off; // y 轴线水平偏移
    public Boolean allowDecimals; //y轴是否允许显示小数
    public Float max; //y轴最大值
    public Float min; //y轴最小值（设置为0就不会有负数）
    //private var minPadding:   //Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. 默认是：0.05.
    public Object[] tickPositions; //自定义Y轴坐标（如：[0, 25, 50, 75 , 100]）
    public Boolean visible; //y轴是否允许显示
    public Boolean opposite;//是否将坐标轴显示在对立面，默认情况下 x 轴是在图表的下方显示，y 轴是在左方，坐标轴显示在对立面后，x 轴是在上方显示，y 轴是在右方显示（即坐标轴会显示在对立面）。该配置一般是用于多坐标轴区分展示，另外在 Highstock 中，y 轴默认是在对立面显示的。 默认是：false.
    public Integer tickInterval;
    public AACrosshair crosshair;  //准星线样式设置
    public String stackLabels;
    public Float tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    public Float tickLength;//坐标轴刻度线的长度。 默认是：10.
    public String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.


    public AAYAxis title(AATitle prop) {
        title = prop;
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

    public AAYAxis alternateGridColor(String prop) {
        alternateGridColor = prop;
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
