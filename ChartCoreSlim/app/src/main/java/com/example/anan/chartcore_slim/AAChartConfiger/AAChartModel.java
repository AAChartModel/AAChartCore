//
//  AAChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2017/9/5.
//  Copyright © 2018年 An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/AAChartModel/ChartCore         ***
//*** https://github.com/AAChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


 /*

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.example.anan.chartcore_slim.AAChartConfiger;



/**
 * Created by AnAn on 2017/9/5.
 */

public class AAChartModel {

    public interface AnimationType {
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

    public interface Type {
        String Column          = "column";
        String Bar             = "bar";
        String Area            = "area";
        String Areaspline = "areaspline";
        String Line            = "line";
        String Spline          = "spline";
        String Scatter         = "scatter";
        String Pie             = "pie";
        String Bubble          = "bubble";
        String Pyramid         = "pyramid";
        String Funnel          = "funnel";
        String Columnrange     = "columnrange";
        String Arearange       = "arearange";
        String Areasplinerange = "areasplinerange";
        String Boxplot         = "boxplot";
        String Waterfall       = "waterfall";
    }

    public interface SubtitleAlignType {
        String Left   = "left";
        String Center = "center";
        String Right  = "right";
    }

    public interface ZoomType {
        String X  = "x";
        String Y  = "y";
        String XY = "xy";
    }

    public interface StackingType {
        String False   = "";
        String Normal  = "normal";
        String Percent = "percent";
    }

    public interface SymbolType {
        String Circle         = "circle";
        String Square         = "square";
        String Diamond        = "diamond";
        String Triangle       = "triangle";
        String Triangle_down  = "triangle-down";
    }

    public interface SymbolStyleType {
        String Normal       = "normal";
        String InnerBlank   = "innerBlank";
        String BorderBlank  = "borderBlank";
    }

    public interface LegendlLayoutType {
        String Horizontal  = "horizontal";
        String Vertical    = "vertical";
    }

    public interface LegendAlignType {
        String Left     = "left";
        String Center   = "center";
        String Right    = "right";
    }

    public interface LegendVerticalAlignType {
        String Top     = "top";
        String Middle  = "middle";
        String Bottom  = "bottom";
    }

    public interface LineDashSyleType {
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


    public String  animationType;         //动画类型
    public Integer animationDuration;     //动画时间
    public String  title;                 //标题内容
    public String  subtitle;              //副标题内容
    public String  chartType;             //图表类型
    public String  stacking;              //堆积样式
    public String  symbol;                //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    public String  symbolStyle;
    public String  zoomType;              //缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
    public Boolean pointHollow;           //折线或者曲线的连接点是否为空心的
    public Boolean inverted;              //x 轴是否翻转(垂直)
    public Boolean xAxisReversed;         //x 轴翻转
    public Boolean yAxisReversed;         //y 轴翻转
    public Boolean tooltipEnabled;        //是否显示浮动提示框(默认显示)
    public String  tooltipValueSuffix;    //浮动提示框单位后缀
    public Boolean tooltipCrosshairs;     //是否显示准星线(默认显示)
    public Boolean gradientColorEnable;   //是否要为渐变色
    public Boolean polar;                 //是否极化图形(变为雷达图)
    public Float   marginLeft;
    public Float   marginRight;
    public Boolean dataLabelEnabled;      //是否显示数据
    public Boolean xAxisLabelsEnabled;    //x轴是否显示数据
    public String[]categories;            //x轴是否显示数据
    public Integer xAxisGridLineWidth;    //x轴网格线的宽度
    public Boolean xAxisVisible;          //x 轴是否显示
    public Boolean yAxisVisible;          //y 轴是否显示
    public Boolean yAxisLabelsEnabled;    //y轴是否显示数据
    public String  yAxisTitle;            //y轴标题
    public Float   yAxisLineWidth;        //y 轴轴线的宽度

    public Integer yAxisGridLineWidth;    //y轴网格线的宽度
    public Object[]colorsTheme;           //图表主题颜色数组
    public Boolean legendEnabled;         //是否显示图例
    public String  legendLayout;          //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    public String  legendAlign;           //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    public String  legendVerticalAlign;   //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    public String  backgroundColor;       //图表背景色
    public Boolean options3dEnable;       //是否3D化图形(仅对条形图,柱状图有效)
    public Integer options3dAlphaInt;
    public Integer options3dBetaInt;
    public Integer options3dDepth;        //3D图形深度
    public Integer borderRadius;          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    public Integer markerRadius;          //折线连接点的半径长度
    public AASeriesElement[] series;
    public String  titleColor;            //标题颜色
    public String  subTitleColor;         //副标题颜色
    public String  axisColor;             //x 轴和 y 轴文字颜色



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

    public AAChartModel symbolStyle(String symbolStyle) {
        this.symbolStyle = symbolStyle;
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

    public AAChartModel tooltipEnabled(Boolean tooltipEnabled) {
        this.tooltipEnabled = tooltipEnabled;
        return this;
    }

    public AAChartModel tooltipCrosshairs(Boolean tooltipCrosshairs) {
        this.tooltipCrosshairs = tooltipCrosshairs;
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

    public AAChartModel colorsTheme(Object[] colorsTheme) {
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

    public AAChartModel series(AASeriesElement[] series) {
        this.series = series;
        return this;
    }


    // 构造函数(亦即是初始化函数)
    public AAChartModel() {
        this.animationType = AnimationType.EaseInBack;
        this.animationDuration = 500;//以毫秒为单位
        this.pointHollow = false;
        this.inverted = false;
        this.stacking = StackingType.False;
        this.xAxisReversed = false;
        this.yAxisReversed = false;
        this.zoomType = "x";
//        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
        this.colorsTheme = new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"};//默认的颜色数组(必须要添加默认数组,否则就会出错)

        this.tooltipCrosshairs = true;

        this.gradientColorEnable = false;
        this.polar = false;
        this.options3dEnable = false;
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









