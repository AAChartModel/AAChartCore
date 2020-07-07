/**
//  AAChartModel.java
//  AAChartCore
//
//  Created by AnAn on 2017/9/5.
//  Copyright © 2018年 An An. All rights reserved.

 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉


 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartZoomType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAScrollablePlotArea;

public class AAChartModel {

    public String  animationType;         //动画类型
    public Integer animationDuration;     //动画时间
    public String  title;                 //标题内容
    public String  titleFontColor;        //标题字体颜色
    public Float   titleFontSize;         //标题字体大小
    public String  titleFontWeight;       //标题字体粗细
    public String  subtitle;              //副标题内容
    public String  subtitleAlign;
    public String  subtitleFontColor;     //副标题字体颜色
    public Float   subtitleFontSize;      //副标题字体大小
    public String  subtitleFontWeight;    //副标题字体粗细
    public String  axesTextColor;         //x 轴和 y 轴文字颜色
    public String  chartType;             //图表类型
    public String  stacking;              //堆积样式
    public String  markerSymbol;          //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    public String  markerSymbolStyle;
    public String  zoomType;              //缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
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
    public Boolean dataLabelsEnabled;      //是否显示数据
    public String  dataLabelsFontColor;
    public Float   dataLabelsFontSize;
    public String  dataLabelsFontWeight;
    public Boolean xAxisLabelsEnabled;    //x轴是否显示数据
    public Integer xAxisTickInterval;
    public String[]categories;            //x轴是否显示数据
    public Float   xAxisGridLineWidth;    //x轴网格线的宽度
    public Boolean xAxisVisible;          //x 轴是否显示
    public Boolean yAxisVisible;          //y 轴是否显示
    public Boolean yAxisLabelsEnabled;    //y轴是否显示数据
    public String  yAxisTitle;            //y轴标题
    public Float   yAxisLineWidth;        //y 轴轴线的宽度
    public Float   yAxisMin;
    public Float   yAxisMax;
    public Boolean yAxisAllowDecimals;
    public Float   yAxisGridLineWidth;    //y轴网格线的宽度
    public Object[]colorsTheme;           //图表主题颜色数组
    public Boolean legendEnabled;         //是否显示图例
    public Object  backgroundColor;       //图表背景色
    public Float   borderRadius;          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    public Float   markerRadius;          //折线连接点的半径长度
    public Object[] series;
    public Boolean touchEventEnabled;     //是否支持用户触摸事件
    public AAScrollablePlotArea scrollablePlotArea;



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

    public AAChartModel titleFontColor(String prop) {
        titleFontColor = prop;
        return this;
    }

    public AAChartModel titleFontSize(Float prop) {
        titleFontSize = prop;
        return this;
    }

    public AAChartModel titleFontWeight(String prop) {
        titleFontWeight = prop;
        return this;
    }

    public AAChartModel subtitle(String prop) {
        subtitle = prop;
        return this;
    }

    public AAChartModel subtitleAlign(String prop) {
        subtitleAlign = prop;
        return this;
    }

    public AAChartModel subtitleFontColor(String prop) {
        subtitleFontColor = prop;
        return this;
    }

    public AAChartModel subtitleFontSize(Float prop) {
        subtitleFontSize = prop;
        return this;
    }

    public AAChartModel subtitleFontWeight(String prop) {
        subtitleFontWeight = prop;
        return this;
    }

    public AAChartModel axesTextColor(String prop) {
        axesTextColor = prop;
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

    public AAChartModel tooltipValueSuffix(String prop) {
        tooltipValueSuffix = prop;
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

    public AAChartModel marginRight(Float prop) {
        marginRight = prop;
        return this;
    }

    public AAChartModel dataLabelsEnabled(Boolean prop) {
        dataLabelsEnabled = prop;
        return this;
    }

    public AAChartModel dataLabelsFontColor(String prop) {
        dataLabelsFontColor = prop;
        return this;
    }

    public AAChartModel dataLabelsFontSize(Float prop) {
        dataLabelsFontSize = prop;
        return this;
    }

    public AAChartModel dataLabelsFontWeight(String prop) {
        dataLabelsFontWeight = prop;
        return this;
    }

    public AAChartModel xAxisLabelsEnabled(Boolean prop) {
        xAxisLabelsEnabled = prop;
        return this;
    }

    public AAChartModel xAxisTickInterval(Integer prop) {
        xAxisTickInterval = prop;
        return this;
    }

    public AAChartModel categories(String[] prop) {
        categories = prop;
        return this;
    }

    public AAChartModel xAxisGridLineWidth(Float prop) {
        xAxisGridLineWidth = prop;
        return this;
    }

    public AAChartModel yAxisGridLineWidth(Float prop) {
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

    public AAChartModel yAxisMin(Float prop) {
        yAxisMin = prop;
        return this;
    }

    public AAChartModel yAxisMax(Float prop) {
        yAxisMax = prop;
        return this;
    }

    public AAChartModel yAxisAllowDecimals(Boolean prop) {
        yAxisAllowDecimals = prop;
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

    public AAChartModel backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }


    public AAChartModel borderRadius(Float prop) {
        borderRadius = prop;
        return this;
    }

    public AAChartModel markerRadius(Float prop) {
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

    public AAChartModel scrollablePlotArea(AAScrollablePlotArea prop) {
        scrollablePlotArea = prop;
        return this;
    }

    public AAChartModel() {
        chartType             = AAChartType.Line;
        animationDuration     = 500;//以毫秒为单位
        animationType         = AAChartAnimationType.Linear;
        inverted              = false;
        stacking              = AAChartStackingType.False;
        xAxisReversed         = false;
        yAxisReversed         = false;
        zoomType              = AAChartZoomType.None;
        dataLabelsEnabled     = false;
        markerSymbolStyle     = AAChartSymbolStyleType.Normal;
        colorsTheme           = new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"};//默认的颜色数组(必须要添加默认数组,否则就会出错)
        tooltipCrosshairs     = true;
        gradientColorEnable   = false;
        polar                 = false;
        xAxisLabelsEnabled    = true;
        xAxisGridLineWidth    = 0f;
        yAxisLabelsEnabled    = true;
        yAxisGridLineWidth    = 1f;
        legendEnabled         = true;
        backgroundColor       = "#ffffff";
        borderRadius          = 0f;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        markerRadius          = 6f;//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了
        titleFontColor        = "#000000";//标题字体颜色为黑色
        titleFontWeight       = "regular";//常规字体
        titleFontSize         = 11f;
        subtitleFontColor     = "#000000";//副标题字体颜色为黑色
        subtitleFontWeight    = "regular";//常规字体
        subtitleFontSize      = 9f;
        dataLabelsFontColor   = "#000000";//数据标签默认颜色为黑色
        dataLabelsFontWeight  = "bold";//图表的数据字体为粗体
        dataLabelsFontSize    = 10f;

    }





}









