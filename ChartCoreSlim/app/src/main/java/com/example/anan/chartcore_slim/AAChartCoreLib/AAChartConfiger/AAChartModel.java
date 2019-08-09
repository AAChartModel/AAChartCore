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

package com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger;

import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartType;

public class AAChartModel {

    public String  animationType;         //动画类型
    public Integer animationDuration;     //动画时间
    public String  title;                 //标题内容
    public String  subtitle;              //副标题内容
    public String  chartType;             //图表类型
    public String  stacking;              //堆积样式
    public String  markerSymbol;          //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    public String  markerSymbolStyle;
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
    public Object  backgroundColor;       //图表背景色
    public Integer borderRadius;          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    public Integer markerRadius;          //折线连接点的半径长度
    public Object[] series;
    public String  titleColor;            //标题颜色
    public String  subTitleColor;         //副标题颜色
    public String  axisColor;             //x 轴和 y 轴文字颜色
    public Boolean touchEventEnabled;     //是否支持用户触摸事件



    public AAChartModel animationType(String prop) {
        animationType = prop;
        return this;
    }

    public AAChartModel animationDuration(Integer prop) {
        animationDuration = prop;
        return this;
    }

    public AAChartModel title(String prop) {
        title = prop;
        return this;
    }

    public AAChartModel subtitle(String prop) {
        subtitle = prop;
        return this;
    }

    public AAChartModel chartType(String prop) {
        chartType = prop;
        return this;
    }

    public AAChartModel stacking(String prop) {
        stacking = prop;
        return this;
    }

    public AAChartModel markerSymbol(String prop) {
        markerSymbol = prop;
        return this;
    }

    public AAChartModel markerSymbolStyle(String prop) {
        markerSymbolStyle = prop;
        return this;
    }

    public AAChartModel zoomType(String prop) {
        zoomType = prop;
        return this;
    }

    public AAChartModel pointHollow(Boolean prop) {
        pointHollow = prop;
        return this;
    }

    public AAChartModel inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public AAChartModel xAxisReversed(Boolean prop) {
        xAxisReversed = prop;
        return this;
    }

    public AAChartModel yAxisReversed(Boolean prop) {
        yAxisReversed = prop;
        return this;
    }

    public AAChartModel tooltipEnabled(Boolean prop) {
        tooltipEnabled = prop;
        return this;
    }

    public AAChartModel tooltipCrosshairs(Boolean prop) {
        tooltipCrosshairs = prop;
        return this;
    }

    public AAChartModel gradientColorEnable(Boolean prop) {
        gradientColorEnable = prop;
        return this;
    }

    public AAChartModel polar(Boolean prop) {
        polar = prop;
        return this;
    }

    public AAChartModel marginLeft(Float prop) {
        marginLeft = prop;
        return this;
    }

    public AAChartModel marginright(Float prop) {
        marginRight = prop;
        return this;
    }

    public AAChartModel dataLabelEnabled(Boolean prop) {
        dataLabelEnabled = prop;
        return this;
    }

    public AAChartModel xAxisLabelsEnabled(Boolean prop) {
        xAxisLabelsEnabled = prop;
        return this;
    }

    public AAChartModel categories(String[] prop) {
        categories = prop;
        return this;
    }

    public AAChartModel xAxisGridLineWidth(Integer prop) {
        xAxisGridLineWidth = prop;
        return this;
    }

    public AAChartModel yAxisGridLineWidth(Integer prop) {
        yAxisGridLineWidth = prop;
        return this;
    }

    public AAChartModel xAxisVisible(Boolean prop) {
        xAxisVisible = prop;
        return this;
    }

    public AAChartModel yAxisVisible(Boolean prop) {
        yAxisVisible = prop;
        return this;
    }

    public AAChartModel yAxisLabelsEnabled(Boolean prop) {
        yAxisLabelsEnabled = prop;
        return this;
    }

    public AAChartModel yAxisTitle(String prop) {
        yAxisTitle = prop;
        return this;
    }

    public AAChartModel yAxisLineWidth(Float prop) {
        yAxisLineWidth = prop;
        return this;
    }


    public AAChartModel colorsTheme(Object[] prop) {
        colorsTheme = prop;
        return this;
    }

    public AAChartModel legendEnabled(Boolean prop) {
        legendEnabled = prop;
        return this;
    }

    public AAChartModel legendLayout(String prop) {
        legendLayout = prop;

        return this;
    }

    public AAChartModel legendAlign(String prop) {
        legendAlign = prop;
        return this;
    }

    public AAChartModel legendVerticalAlign(String prop) {
        legendVerticalAlign = prop;
        return this;
    }

    public AAChartModel backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }


    public AAChartModel borderRadius(Integer prop) {
        borderRadius = prop;
        return this;
    }

    public AAChartModel markerRadius(Integer prop) {
        markerRadius = prop;
        return this;
    }

    public AAChartModel series(Object[] prop) {
        series = prop;
        return this;
    }

    public AAChartModel touchEventEnabled(Boolean prop) {
        touchEventEnabled = prop;
        return this;
    }

    public AAChartModel() {
        chartType = AAChartType.Line;
        animationType = AAChartAnimationType.EaseInBack;
        animationDuration = 500;//以毫秒为单位
        pointHollow = false;
        inverted = false;
        stacking = AAChartStackingType.False;
        xAxisReversed = false;
        yAxisReversed = false;
        zoomType = "x";
//        colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
        colorsTheme = new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"};//默认的颜色数组(必须要添加默认数组,否则就会出错)
        tooltipCrosshairs = true;
        gradientColorEnable = false;
        polar = false;
        xAxisLabelsEnabled = true;
        xAxisGridLineWidth = 0;
        yAxisLabelsEnabled = true;
        yAxisGridLineWidth = 1;
        legendEnabled = true;
        legendLayout = "horizontal";
        legendAlign = "center";
        legendVerticalAlign = "bottom";
        backgroundColor = "#ffffff";
        borderRadius = 0;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        markerRadius = 6;//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了
        touchEventEnabled = true;

    }

}









