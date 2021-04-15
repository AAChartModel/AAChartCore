/**
 //  AAOptionsConstructor.java
 //  AAChartCore
 //
 //  Created by AnAn on 2018/12/08.
 //  Copyright © 2018年 An An. All rights reserved.
 /**
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 */

/**

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
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AABar;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAColumn;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAColumnrange;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAItemStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALegend;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPie;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASubtitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;

public class AAOptionsConstructor
{
    public static AAOptions configureChartOptions (
            AAChartModel aaChartModel
    ) {
        AAChart aaChart = new AAChart()
                .type(aaChartModel.chartType) //绘图类型
                .inverted(aaChartModel.inverted) //设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
                .backgroundColor(aaChartModel.backgroundColor) //设置图表的背景色(包含透明度的设置)
                .pinchType(aaChartModel.zoomType) //设置手势缩放方向
                .panning(true) //设置手势缩放后是否可平移
                .polar(aaChartModel.polar) //是否极化图表(开启极坐标模式)
                .margin(aaChartModel.margin) //图表边距
                .scrollablePlotArea(aaChartModel.scrollablePlotArea)
                ;

        AATitle aaTitle = new AATitle()
                .text(aaChartModel.title) //标题文本内容
                .style(aaChartModel.titleStyle)
                ;

        AASubtitle aaSubtitle = new AASubtitle()
                .text(aaChartModel.subtitle) //副标题内容
                .align(aaChartModel.subtitleAlign) //图表副标题文本水平对齐方式。可选的值有 “left”，”center“和“right”。 默认是：center.
                .style(aaChartModel.subtitleStyle)
                ;

        AATooltip aaTooltip = new AATooltip()
                .enabled(aaChartModel.tooltipEnabled) //启用浮动提示框
                .shared(true) //多组数据共享一个浮动提示框
                .valueSuffix(aaChartModel.tooltipValueSuffix) //浮动提示框的单位名称后缀
                ;

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .stacking(aaChartModel.stacking) //设置是否百分比堆叠显示图形
                )
                ;

        if (!aaChartModel.animationType.equals(AAChartAnimationType.Linear)) {
            aaPlotOptions.series.animation((new AAAnimation()
                    .easing(aaChartModel.animationType)
                    .duration(aaChartModel.animationDuration)
            ));
        }

        configureAAPlotOptionsMarkerStyle(aaChartModel,aaPlotOptions);
        configureAAPlotOptionsDataLabels(aaPlotOptions,aaChartModel);

        AALegend aaLegend = new AALegend()
                .enabled(aaChartModel.legendEnabled) //是否显示 legend
                .itemStyle(new AAItemStyle()
                        .color(aaChartModel.axesTextColor))
                ;

        AAOptions aaOptions = new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .subtitle(aaSubtitle)
                .tooltip(aaTooltip)
                .plotOptions(aaPlotOptions)
                .legend(aaLegend)
                .series(aaChartModel.series)
                .colors(aaChartModel.colorsTheme) //设置颜色主题
                .touchEventEnabled(aaChartModel.touchEventEnabled) //是否支持点击事件
                ;

        configureAxisContentAndStyle(aaOptions,aaChartModel);

        return aaOptions;
    }

    private static void configureAAPlotOptionsMarkerStyle (
            AAChartModel aaChartModel,
            AAPlotOptions aaPlotOptions
    ) {
        String aaChartType = aaChartModel.chartType;
        //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图、散点图、折线范围填充图、曲线范围填充图、多边形图)才有数据点标记
        if (       aaChartType.equals(AAChartType.Area)
                || aaChartType.equals(AAChartType.Areaspline)
                || aaChartType.equals(AAChartType.Line)
                || aaChartType.equals(AAChartType.Spline)
                || aaChartType.equals(AAChartType.Scatter)
                || aaChartType.equals(AAChartType.Arearange)
                || aaChartType.equals(AAChartType.Areasplinerange)
                || aaChartType.equals(AAChartType.Polygon))
        {
            AAMarker aaMarker = new AAMarker()
                    .radius(aaChartModel.markerRadius) //曲线连接点半径，默认是4
                    .symbol(aaChartModel.markerSymbol); //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
            if (aaChartModel.markerSymbolStyle.equals(AAChartSymbolStyleType.InnerBlank)) {
                aaMarker.fillColor("#ffffff") //点的填充色(用来设置折线连接点的填充色)
                        .lineWidth(2f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                        .lineColor(""); //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
            } else if (aaChartModel.markerSymbolStyle.equals(AAChartSymbolStyleType.BorderBlank)) {
                aaMarker.lineWidth(2f)
                        .lineColor(aaChartModel.backgroundColor);
            }
            AASeries aaSeries = aaPlotOptions.series;
            aaSeries.marker(aaMarker);

        }
    }


    private static void configureAAPlotOptionsDataLabels (
            AAPlotOptions aaPlotOptions,
            AAChartModel aaChartModel
    ) {
        String aaChartType = aaChartModel.chartType;

        AADataLabels aaDataLabels = new AADataLabels()
                .enabled(aaChartModel.dataLabelsEnabled);
        if (aaChartModel.dataLabelsEnabled) {
            aaDataLabels
                    .style(aaChartModel.dataLabelsStyle);
        }

        switch (aaChartType) {
            case AAChartType.Column:
                AAColumn aaColumn = new AAColumn()
                        .borderWidth(0f)
                        .borderRadius(aaChartModel.borderRadius);
                if (aaChartModel.polar) {
                    aaColumn.pointPadding(0f)
                            .groupPadding(0.005f);
                }
                aaPlotOptions.column(aaColumn);
                break;
            case AAChartType.Bar:
                AABar aaBar = new AABar()
                        .borderWidth(0f)
                        .borderRadius(aaChartModel.borderRadius)
                        ;
                if (aaChartModel.polar) {
                    aaBar.pointPadding(0f)
                            .groupPadding(0.005f);
                }
                aaPlotOptions.bar(aaBar);
                break;
            case AAChartType.Pie:
                AAPie aaPie = new AAPie()
                        .allowPointSelect(true)
                        .cursor("pointer")
                        .showInLegend(true);
                if (aaChartModel.dataLabelsEnabled) {
                    aaDataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %");
                }
                aaPlotOptions.pie(aaPie);
                break;
            case AAChartType.Columnrange:
                AAColumnrange aaColumnrange = new AAColumnrange()
                        .borderRadius(0f) //The color of the border surrounding each column or bar
                        .borderWidth(0f) //The corner radius of the border surrounding each column or bar. default：0
                        ;
                aaPlotOptions.columnrange(aaColumnrange);
                break;
        }
        aaPlotOptions.series.dataLabels(aaDataLabels);

    }

    private static void configureAxisContentAndStyle (
            AAOptions aaOptions,
            AAChartModel aaChartModel
    ) {
        String aaChartType = aaChartModel.chartType;
        //x 轴和 Y 轴的相关配置,扇形图、金字塔图和漏斗图则不需要设置 X 轴和 Y 轴的相关内容
        if  (      aaChartType.equals(AAChartType.Column)
                || aaChartType.equals(AAChartType.Bar)
                || aaChartType.equals(AAChartType.Area)
                || aaChartType.equals(AAChartType.Areaspline)
                || aaChartType.equals(AAChartType.Line)
                || aaChartType.equals(AAChartType.Spline)
                || aaChartType.equals(AAChartType.Scatter)
                || aaChartType.equals(AAChartType.Bubble)
                || aaChartType.equals(AAChartType.Columnrange)
                || aaChartType.equals(AAChartType.Arearange)
                || aaChartType.equals(AAChartType.Areasplinerange)
                || aaChartType.equals(AAChartType.Boxplot)
                || aaChartType.equals(AAChartType.Waterfall)
                || aaChartType.equals(AAChartType.Polygon)
                || aaChartType.equals(AAChartType.Gauge)
        ) {
            if (!aaChartType.equals(AAChartType.Gauge)) {
                Boolean aaXAxisLabelsEnabled = aaChartModel.xAxisLabelsEnabled;
                AALabels aaXAxisLabels = new AALabels()
                        .enabled(aaXAxisLabelsEnabled);//设置 x 轴是否显示文字
                if (aaXAxisLabelsEnabled) {
                    aaXAxisLabels.style(new AAStyle()
                            .color(aaChartModel.axesTextColor));
                }

                AAXAxis aaXAxis = new AAXAxis()
                        .labels(aaXAxisLabels) //设置 x 轴是否显示文字
                        .reversed(aaChartModel.xAxisReversed)
                        .gridLineWidth(aaChartModel.xAxisGridLineWidth) //x轴网格线宽度
                        .categories(aaChartModel.categories)
                        .visible(aaChartModel.xAxisVisible) //x轴是否可见
                        .tickInterval(aaChartModel.xAxisTickInterval);//x轴坐标点间隔数

                aaOptions.xAxis(aaXAxis);
            }

            Boolean aaYAxisLabelsEnabled = aaChartModel.yAxisLabelsEnabled;
            AALabels aaYAxisLabels = new AALabels()
                    .enabled(aaChartModel.yAxisLabelsEnabled);
            if (aaYAxisLabelsEnabled) {
                aaYAxisLabels.style(new AAStyle()
                        .color(aaChartModel.axesTextColor));
            }

            AAYAxis aaYAxis = new AAYAxis()
                    .labels(aaYAxisLabels) //设置 y 轴是否显示数字
                    .min(aaChartModel.yAxisMin) //设置 y 轴最小值,最小值等于零就不能显示负值了
                    .max(aaChartModel.yAxisMax) //y轴最大值
                    .allowDecimals(aaChartModel.yAxisAllowDecimals) //是否允许显示小数
                    .reversed(aaChartModel.yAxisReversed)
                    .gridLineWidth(aaChartModel.yAxisGridLineWidth) //y轴网格线宽度
                    .title(new AATitle()
                            .text(aaChartModel.yAxisTitle)
                            .style(new AAStyle()
                                    .color(aaChartModel.axesTextColor)))
                    .lineWidth(aaChartModel.yAxisLineWidth) //设置 y轴轴线的宽度,为0即是隐藏 y轴轴线
                    .visible(aaChartModel.yAxisVisible)
                    ;

            aaOptions.yAxis(aaYAxis);
        }
    }


}
