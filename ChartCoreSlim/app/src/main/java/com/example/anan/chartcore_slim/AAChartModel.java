package com.example.anan.chartcore_slim;


/**
 * Created by AnAn on 2017/9/5.
 */

public class AAChartModel {

    public interface AAChartAnimationType {
        String EaseInQuad     = "easeInQuad";
        String EaseOutQuad    = "easeOutQuad";
        String EaseInOutQuad  = "easeInOutQuad";
        String EaseInCubic    = "easeInCubic";
        String EaseOutCubic   = "easeOutCubic";
        String EaseInOutCubic = "easeInOutCubic";
        String EaseInQuart    = "easeInQuart";
        String EaseOutQuart   = "easeOutQuart";
        String EaseInOutQuart = "easeInOutQuart";
        String EaseInQuint    = "easeInQuint";
        String EaseOutQuint   = "easeOutQuint";
        String EaseInOutQuint = "easeInOutQuint";
        String EaseInSine     = "easeInSine";
        String EaseOutSine    = "easeOutSine";
        String EaseInOutSine  = "easeInOutSine";
        String EaseInExpo     = "easeInExpo";
        String EaseOutExpo    = "easeOutExpo";
        String EaseInOutExpo  = "easeInOutExpo";
        String EaseInCirc     = "easeInCirc";
        String EaseOutCirc    = "easeOutCirc";
        String EaseInOutCirc  = "easeInOutCirc";
        String EaseOutBounce  = "easeOutBounce";
        String EaseInBack     = "easeInBack";
        String EaseOutBack    = "easeOutBack";
        String EaseInOutBack  = "easeInOutBack";
        String Elastic        = "elastic";
        String SwingFromTo    = "swingFromTo";
        String SwingFrom      = "swingFrom";
        String SwingTo        = "swingTo";
        String Bounce         = "bounce";
        String BouncePast     = "bouncePast";
        String EaseFromTo     = "easeFromTo";
        String EaseFrom       = "easeFrom";
        String EaseTo         = "easeTo";
    }

    public interface AAChartType {
        String Column      = "column";
        String Bar         = "bar";
        String Area        = "area";
        String AreaSpline  = "areaspline";
        String Line        = "line";
        String Spline      = "spline";
        String Scatter     = "scatter";
        String Pie         = "pie";
        String Bubble      = "bubble";
        String Pyramid     = "pyramid";
        String Funnel      = "funnel";
        String Columnrange = "columnrange";
        String Arearange   = "arearange";
    }

    public interface AAChartSubtitleAlignType {
        String Left   = "left";
        String Center = "center";
        String Right  = "right";
    }

    public interface AAChartZoomType {
        String X  = "x";
        String Y  = "y";
        String XY = "xy";
    }

    public interface AAChartStackingType {
        String False   = "";
        String Normal  = "normal";
        String Percent = "percent";
    }

    public interface AAChartSymbolType {
        String Circle         = "circle";
        String Square         = "square";
        String Diamond        = "diamond";
        String Triangle       = "triangle";
        String Triangle_down  = "triangle-down";
    }

    public interface AAchartLegendlLayoutType {
        String Horizontal  = "horizontal";
        String Vertical    = "vertical";
    }

    public interface AAChartLegendAlignType {
        String Left     = "left";
        String Center   = "center";
        String Right    = "right";
    }

    public interface AAChartLegendVerticalAlignType {
        String Top     = "top";
        String Middle  = "middle";
        String Bottom  = "bottom";
    }

    public interface AALineDashSyleType {
        String Solid           = "Solid";
        String ShortDash       = "ShortDash";
        String ShortDot        = "ShortDot";
        String ShortDashDot    = "ShortDashDot";
        String ShortDashDotDot = "ShortDashDotDot";
        String Dot             = "Dot";
        String Dash            = "Dash";
        String LongDash        = "LongDash";
        String DashDot         = "DashDot";
        String LongDashDot     = "LongDashDot";
        String LongDashDotDot  = "LongDashDotDot";
    }


    private String  animationType;         //动画类型
    private Integer animationDuration;     //动画时间
    private String  title;                 //标题内容
    private String  subtitle;              //副标题内容
    private String  chartType;             //图表类型
    private String  stacking;              //堆积样式
    private String  symbol;                //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    private String  zoomType;              //缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
    private Boolean pointHollow;           //折线或者曲线的连接点是否为空心的
    private Boolean inverted;              //x 轴是否翻转(垂直)
    private Boolean xAxisReversed;         //x 轴翻转
    private Boolean yAxisReversed;         //y 轴翻转
    private Boolean crosshairs;            //是否显示准星线(默认显示)
    private Boolean gradientColorEnable;   //是否要为渐变色
    private Boolean polar;                 //是否极化图形(变为雷达图)
    private Boolean dataLabelEnabled;      //是否显示数据
    private Boolean xAxisLabelsEnabled;    //x轴是否显示数据
    private String[]categories;            //x轴是否显示数据
    private Integer xAxisGridLineWidth;    //x轴网格线的宽度
    private Boolean yAxisLabelsEnabled;    //y轴是否显示数据
    private String  yAxisTitle;            //y轴标题
    private Integer yAxisGridLineWidth;    //y轴网格线的宽度
    private String[]colorsTheme;           //图表主题颜色数组
    private Boolean legendEnabled;         //是否显示图例
    private String  legendLayout;          //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    private String  legendAlign;           //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    private String  legendVerticalAlign;   //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    private String  backgroundColor;       //图表背景色
    private Boolean options3dEnable;       //是否3D化图形(仅对条形图,柱状图有效)
    private Integer options3dAlphaInt;
    private Integer options3dBetaInt;
    private Integer options3dDepth;        //3D图形深度
    private Integer borderRadius;          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    private Integer markerRadius;          //折线连接点的半径长度
    private AASeries[] series;


    public AAChartModel animationType(String animationType) {
        this.animationType = animationType;
        return this;
    }

    public AAChartModel animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public AAChartModel title(String title) {
        this.title = title;
        return this;
    }

    public AAChartModel subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public AAChartModel chartType(String chartType) {
        this.chartType = chartType;
        return this;
    }

    public AAChartModel stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public AAChartModel symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public AAChartModel zoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public AAChartModel pointHollow(Boolean pointHollow) {
        this.pointHollow = pointHollow;
        return this;
    }

    public AAChartModel inverted(Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    public AAChartModel xAxisReversed(Boolean xAxisReversed) {
        this.xAxisReversed = xAxisReversed;
        return this;
    }

    public AAChartModel yAxisReversed(Boolean yAxisReversed) {
        this.yAxisReversed = yAxisReversed;
        return this;
    }

    public AAChartModel crosshairs(Boolean crosshairs) {
        this.crosshairs = crosshairs;
        return this;
    }

    public AAChartModel gradientColorEnable(Boolean gradientColorEnable) {
        this.gradientColorEnable = gradientColorEnable;
        return this;
    }

    public AAChartModel polar(Boolean polar) {
        this.polar = polar;
        return this;
    }

    public AAChartModel dataLabelEnabled(Boolean dataLabelEnabled) {
        this.dataLabelEnabled = dataLabelEnabled;
        return this;
    }

    public AAChartModel xAxisLabelsEnabled(Boolean xAxisLabelsEnabled) {
        this.xAxisLabelsEnabled = xAxisLabelsEnabled;
        return this;
    }

    public AAChartModel categories(String[] categories) {
        this.categories = categories;
        return this;
    }

    public AAChartModel xAxisGridLineWidth(Integer xAxisGridLineWidth) {
        this.xAxisGridLineWidth = xAxisGridLineWidth;
        return this;
    }

    public AAChartModel yAxisGridLineWidth(Integer yAxisGridLineWidth) {
        this.yAxisGridLineWidth = yAxisGridLineWidth;
        return this;
    }

    public AAChartModel yAxisLabelsEnabled(Boolean yAxisLabelsEnabled) {
        this.yAxisLabelsEnabled = yAxisLabelsEnabled;
        return this;
    }

    public AAChartModel yAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
        return this;
    }

    public AAChartModel colorsTheme(String[] colorsTheme) {
        this.colorsTheme = colorsTheme;
        return this;
    }

    public AAChartModel legendEnabled(Boolean legendEnabled) {
        this.legendEnabled = legendEnabled;
        return this;
    }

    public AAChartModel legendLayout(String legendLayout) {
        this.legendLayout = legendLayout;

        return this;
    }

    public AAChartModel legendAlign(String legendAlign) {
        this.legendAlign = legendAlign;
        return this;
    }

    public AAChartModel legendVerticalAlign(String legendVerticalAlign) {
        this.legendVerticalAlign = legendVerticalAlign;
        return this;
    }

    public AAChartModel backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public AAChartModel options3dEnable(Boolean options3dEnable) {
        this.options3dEnable = options3dEnable;
        return this;
    }

    public AAChartModel options3dAlphaInt(Integer options3dAlphaInt) {
        this.options3dAlphaInt = options3dAlphaInt;
        return this;
    }

    public AAChartModel options3dBetaInt(Integer options3dBetaInt) {
        this.options3dBetaInt = options3dBetaInt;
        return this;
    }

    public AAChartModel options3dDepth(Integer options3dDepth) {
        this.options3dDepth = options3dDepth;
        return this;
    }

    public AAChartModel borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public AAChartModel markerRadius(Integer markerRadius) {
        this.markerRadius = markerRadius;
        return this;
    }

    public AAChartModel series(AASeries[] series) {
        this.series = series;
        return this;
    }


    // 构造函数(亦即是初始化函数)
    public AAChartModel() {

//        this.animationType = AAChartAnimationType.EaseInBack;
//        this.animationDuration = 800;//以毫秒为单位
//        this.chartType = AAChartType.Column;
//        this.inverted = false;
//        this.stacking = AAChartStackingType.False;
//        //this.symbol = AAChartSymbolType.Square.rawValue//默认的折线连接点类型
//        this.xAxisReversed = false;
//        this.yAxisReversed = false;
//        this.zoomType = AAChartZoomType.X;
//        this.pointHollow = false;//默认折线或者曲线的连接点不为空
//        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
//        this.gradientColorEnable = false;
//        this.polar = false;
//        this.dataLabelEnabled = true;
//        this.options3dEnable = false;
//        this.crosshairs = true;
//        this.xAxisLabelsEnabled = true;
//        this.xAxisGridLineWidth = 0;
//        this.yAxisLabelsEnabled = true;
//        this.yAxisGridLineWidth = 1;
//        this.legendEnabled = true;
//        this.legendLayout = AAchartLegendlLayoutType.Horizontal;
//        this.legendAlign = AAChartLegendAlignType.Center;
//        this.legendVerticalAlign = AAChartLegendVerticalAlignType.Bottom;
//        this.borderRadius = 0;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
//        this.markerRadius = 5;//折线连接点的半径长度,设置默认值为0,这样就相当于不显示了

        this.animationType = AAChartAnimationType.EaseInBack;
        this.animationDuration = 800;//以毫秒为单位
        this.pointHollow = false;
        this.inverted = false;
        this.stacking = AAChartStackingType.False;
        this.xAxisReversed = false;
        this.yAxisReversed = false;
        this.yAxisTitle = "y轴副标题";
        this.zoomType = "x";
//        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
//        this.colorsTheme = new String[]{"#fb2180","#eb6100","#0066ff","#51ff00","#1bb7ce",};//默认的颜色数组

        this.gradientColorEnable = false;
        this.polar = false;
        this.options3dEnable = false;
        this.crosshairs = true;
        this.xAxisLabelsEnabled = true;
        this.xAxisGridLineWidth = 0;
        this.yAxisLabelsEnabled = true;
        this.yAxisGridLineWidth = 1;
        this.legendEnabled = true;
        this.legendLayout = "horizontal";
        this.legendAlign = "center";
        this.legendVerticalAlign = "bottom";
        this.backgroundColor = "#ffffff";
        this.borderRadius = 0;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        this.markerRadius = 6;//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了

    }

}







