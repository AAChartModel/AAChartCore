package com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel;

public class AAYAxis {
    private String title;
    private String[] plotBands;
    private String[] plotLines;
    private String[] categories;
    private Boolean reversed;
    private Float gridLineWidth;// y 轴网格线宽度
    private String gridLineColor;  // y 轴网格线颜色
    private String gridLineDashStyle; //网格线线条样式，所有可用的线条样式参考：Highcharts线条样式
    private String alternateGridColor;  //backcolor of every other grid line area
    private String gridLineInterpolation; //Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either circle or polygon. 默认是：null.
    private String labels;//用于设置 y 轴文字相关的
    private Float lineWidth; // y 轴线宽度
    private String lineColor; // y 轴线颜色
    private Float off; // y 轴线水平偏移
    private Boolean allowDecimals; //y轴是否允许显示小数
    private Float max; //y轴最大值
    private Float min; //y轴最小值（设置为0就不会有负数）
    //private var minPadding:   //Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. 默认是：0.05.
    private Object[] tickPositions; //自定义Y轴坐标（如：[@(0: , @(25: , @(50: , @(75:  , (100: ]）
    private Boolean visible; //y轴是否允许显示
    private Boolean opposite;//是否将坐标轴显示在对立面，默认情况下 x 轴是在图表的下方显示，y 轴是在左方，坐标轴显示在对立面后，x 轴是在上方显示，y 轴是在右方显示（即坐标轴会显示在对立面）。该配置一般是用于多坐标轴区分展示，另外在 Highstock 中，y 轴默认是在对立面显示的。 默认是：false.
    private Integer tickInterval;
    private String crosshair;  //准星线样式设置
    private String stackLabels;
    private Float tickWidth;//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    private Float tickLength;//坐标轴刻度线的长度。 默认是：10.
    private String tickPosition; //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.


    public AAYAxis title(String prop) {
        this.title = prop;
        return this;
    }

    public AAYAxis plotBands(String[] prop) {
        this.plotBands = prop;
        return this;
    }

    public AAYAxis plotLines(String[] prop) {
        this.plotLines = prop;
        return this;
    }

    public AAYAxis categories(String[] prop) {
        this.categories = prop;
        return this;
    }

    public AAYAxis reversed(Boolean prop) {
        this.reversed = prop;
        return this;
    }

    public AAYAxis gridLineWidth(Float prop) {
        this.gridLineWidth = prop;
        return this;
    }

    public AAYAxis gridLineColor(String prop) {
        this.gridLineColor = prop;
        return this;
    }

    public AAYAxis gridLineDashStyle(String prop) {
        this.gridLineDashStyle = prop;
        return this;
    }

    public AAYAxis alternateGridColor(String prop) {
        this.alternateGridColor = prop;
        return this;
    }

    public AAYAxis gridLineInterpolation(String prop) {
        this.gridLineInterpolation = prop;
        return this;
    }

    public AAYAxis labels(AALabels prop) {
        this.labels = prop.toString();
        return this;
    }

    public AAYAxis lineWidth(Float prop) {
        this.lineWidth = prop;
        return this;
    }

    public AAYAxis lineColor(String prop) {
        this.lineColor = prop;
        return this;
    }

    public AAYAxis off(Float prop) {
        this.off = prop;
        return this;
    }

    public AAYAxis allowDecimals(Boolean prop) {
        this.allowDecimals = prop;
        return this;
    }

    public AAYAxis max(Float prop) {
        this.max = max;
        return this;
    }

    public AAYAxis min(Float prop) {
        this.min = min;
        return this;
    }

    public AAYAxis tickPositions(Object[] prop) {
        this.tickPositions = prop;
        return this;
    }

    public AAYAxis visible(Boolean prop) {
        this.visible = prop;
        return this;
    }

    public AAYAxis opposite(Boolean prop) {
        this.opposite = prop;
        return this;
    }

    public AAYAxis tickInterval(Integer prop) {
        this.tickInterval = prop;
        return this;
    }

    public AAYAxis crosshair(AACrosshair prop) {
        this.crosshair = prop.toString();
        return this;
    }

    public AAYAxis stackLabels(String prop) {
        this.stackLabels = prop;
        return this;
    }

    public AAYAxis tickWidth(Float prop) {
        this.tickWidth = prop;
        return this;
    }

    public AAYAxis tickLength(Float prop) {
        this.tickLength = prop;
        return this;
    }

    public AAYAxis tickPosition(String prop) {
        this.tickPosition = prop;
        return this;
    }

}
