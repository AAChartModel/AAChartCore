package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPie;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStyle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATitle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATooltip;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;

public class PieChartOptionsComposer {

    public static AAOptions basicPieChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("pie"))
                .title(new AATitle()
                        .text("2018年1月浏览器市场份额"))
                .tooltip(new AATooltip()
                        .pointFormat("{series.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .allowPointSelect(true)
                                .cursor("pointer")
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .format("<b>{point.name}</b>: {point.percentage:.1f} %")
                                        .style(new AAStyle()
                                                .color(AAColor.Black)))))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Brands")
                                .colorByPoint(true)
                                .data(new Object[][]{
                                        {"Chrome", 61.41},
                                        {"Internet Explorer", 11.84},
                                        {"Firefox", 10.85},
                                        {"Edge", 4.67},
                                        {"Safari", 4.18},
                                        {"Sogou Explorer", 1.64},
                                        {"Opera", 1.6},
                                        {"QQ", 1.2},
                                        {"Other", 2.61}
                                })
                });
    }

    public static AAOptions basicPieChartWithLegend() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("pie"))
                .title(new AATitle()
                        .text("2018年1月浏览器市场份额"))
                .tooltip(new AATooltip()
                        .pointFormat("{series.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .allowPointSelect(true)
                                .cursor("pointer")
                                .dataLabels(new AADataLabels()
                                        .enabled(false))
                                .showInLegend(true)))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Brands")
                                .colorByPoint(true)
                                .data(new Object[][]{
                                        {"Chrome", 61.41},
                                        {"Internet Explorer", 11.84},
                                        {"Firefox", 10.85},
                                        {"Edge", 4.67},
                                        {"Safari", 4.18},
                                        {"Other", 7.05}
                                })
                });
    }

    public static AAOptions basicPieChartWithGradientColor() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("pie"))
                .title(new AATitle()
                        .text("浏览器<br>占比"))
                .tooltip(new AATooltip()
                        .headerFormat("{series.name}<br>")
                        .pointFormat("{point.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .distance(-50)
                                        .style(new AAStyle()
                                                .fontWeight("bold")
                                                .color(AAColor.White)))
                                .startAngle(-90)
                                .endAngle(90)
                                .center(new String[]{"50%", "75%"})))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("浏览器占比")
                                .innerSize("50%")
                                .data(new Object[]{
                                        new Object[]{"Firefox", 45.0},
                                        new Object[]{"IE", 26.8},
                                        new Object[]{"Chrome", 12.8},
                                        new Object[]{"Safari", 8.5},
                                        new Object[]{"Opera", 6.2},
                                        new Object[]{"其他", 0.7}
                                })
                });
    }

    public static AAOptions basicPieChartWithGradientColor2() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("pie"))
                .title(new AATitle()
                        .text("2014年某网站各浏览器的访问量占比"))
                .tooltip(new AATooltip()
                        .pointFormat("{series.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .allowPointSelect(true)
                                .cursor("pointer")
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .format("<b>{point.name}</b>: {point.percentage:.1f} %")
                                        .style(new AAStyle()
                                                .color(AAColor.White)))))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("浏览器占比")
                                .data(new Object[]{
                                        new Object[]{"Firefox", 45.0},
                                        new Object[]{"IE", 26.8},
                                        new Object[]{"Chrome", 12.8},
                                        new Object[]{"Safari", 8.5},
                                        new Object[]{"Opera", 6.2},
                                        new Object[]{"其他", 0.7}
                                })
                });
    }

    public static AAOptions basicPieChartWithMonochromeColor() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("pie"))
                .title(new AATitle()
                        .text("2014年某网站各浏览器的访问量占比"))
                .tooltip(new AATooltip()
                        .pointFormat("{series.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .allowPointSelect(true)
                                .cursor("pointer")
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .format("<b>{point.name}</b>: {point.percentage:.1f} %")
                                        .style(new AAStyle()
                                                .color(AAColor.White)))))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("浏览器占比")
                                .data(new Object[]{
                                        new Object[]{"Firefox", 45.0},
                                        new Object[]{"IE", 26.8},
                                        new Object[]{"Chrome", 12.8},
                                        new Object[]{"Safari", 8.5},
                                        new Object[]{"Opera", 6.2},
                                        new Object[]{"其他", 0.7}
                                })
                });
    }

    public static AAOptions customPieChartTitlePosition() {
        return new AAOptions()
                .chart(new AAChart())
                .title(new AATitle()
                        .text("圆心显示的标题"))
                .tooltip(new AATooltip()
                        .pointFormat("{series.name}: <b>{point.percentage:.1f}%</b>"))
                .plotOptions(new AAPlotOptions()
                        .pie(new AAPie()
                                .allowPointSelect(true)
                                .cursor("pointer")
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .format("<b>{point.name}</b>: {point.percentage:.1f} %")
                                        .style(new AAStyle()
                                                .color(AAColor.White)))))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type("pie")
                                .innerSize("80%")
                                .name("市场份额")
                                .data(new Object[]{
                                        new Object[]{"Firefox", 45.0, "http://bbs.hcharts.cn"},
                                        new Object[]{"IE", 26.8},
                                        new Object[]{"Chrome", 12.8, "http://www.hcharts.cn"},
                                        new Object[]{"Safari", 8.5},
                                        new Object[]{"Opera", 6.2},
                                        new Object[]{"其他", 0.7}
                                })
                });
    }
}