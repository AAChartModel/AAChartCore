package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.github.AAChartModel.AAChartCore.AAOptionsModel.AABar;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAColumn;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAColumnrange;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AALegend;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASeries;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStyle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASubtitle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATitle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATooltip;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AALabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAXAxis;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAYAxis;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;

public class BarOrColumnChartOptionsComposer {

    public static AAOptions basicBarChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("bar"))
                .title(new AATitle()
                        .text("各洲不同时间的人口条形图"))
                .subtitle(new AASubtitle()
                        .text("数据来源: Wikipedia.org"))
                .tooltip(new AATooltip()
                        .valueSuffix(" 百万"))
                .plotOptions(new AAPlotOptions()
                        .bar(new AABar()
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .allowOverlap(true))))
                .legend(new AALegend()
                        .layout("vertical")
                        .align("right")
                        .verticalAlign("top")
                        .x(-40)
                        .y(100)
                        .floating(true))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("1800 年")
                                .data(new Object[]{107, 31, 635, 203, 2}),
                        new AASeriesElement()
                                .name("1900 年")
                                .data(new Object[]{133, 156, 947, 408, 6}),
                        new AASeriesElement()
                                .name("2008 年")
                                .data(new Object[]{973, 914, 4054, 732, 34})
                });
    }

    public static AAOptions stackingBarChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("bar"))
                .title(new AATitle()
                        .text("堆叠条形图"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"苹果", "橘子", "梨", "葡萄", "香蕉"}))
                .yAxis(new AAYAxis()
                        .min(0)
                        .title(new AATitle()
                                .text("水果消费总量")))
                .legend(new AALegend()
                        .reversed(true))
                .plotOptions(new AAPlotOptions()
                        .series(new AASeries()
                                .stacking("normal")))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("小张")
                                .data(new Object[]{5, 3, 4, 7, 2}),
                        new AASeriesElement()
                                .name("小彭")
                                .data(new Object[]{2, 2, 3, 2, 1}),
                        new AASeriesElement()
                                .name("小潘")
                                .data(new Object[]{3, 4, 4, 2, 5})
                });
    }

    public static AAOptions populationPyramidChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("bar"))
                .title(new AATitle()
                        .text("2015 年德国人口金字塔"))
                .subtitle(new AASubtitle()
                        .text("数据来源: 1950 ~ 2100 年世界人口金字塔"))
                .xAxisArray(new AAXAxis[]{
                        new AAXAxis()
                                .categories(new String[]{"0-4", "5-9", "10-14", "15-19",
                                        "20-24", "25-29", "30-34", "35-39", "40-44",
                                        "45-49", "50-54", "55-59", "60-64", "65-69",
                                        "70-74", "75-79", "80-84", "85-89", "90-94",
                                        "95-99", "100 + "})
                                .reversed(false)
                                .labels(new AALabels()
                                        .step(1)),
                        new AAXAxis()
                                .opposite(true)
                                .reversed(false)
                                .categories(new String[]{"0-4", "5-9", "10-14", "15-19",
                                        "20-24", "25-29", "30-34", "35-39", "40-44",
                                        "45-49", "50-54", "55-59", "60-64", "65-69",
                                        "70-74", "75-79", "80-84", "85-89", "90-94",
                                        "95-99", "100 + "})
                                .linkedTo(0)
                                .labels(new AALabels()
                                        .step(1))
                })
                .yAxis(new AAYAxis()
                        .title(new AATitle()
                                .text(null))
                        .labels(new AALabels()
                                .formatter("function () {\n" +
                                        "return (Math.abs(this.value) / 1000000) + 'M';\n" +
                                        "}"))
                        .min(-4000000)
                        .max(4000000))
                .plotOptions(new AAPlotOptions()
                        .series(new AASeries()
                                .stacking("normal")))
                .tooltip(new AATooltip()
                        .formatter("function () {\n" +
                                "return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +\n" +
                                "    '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);\n" +
                                "}"))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("男")
                                .data(new Object[]{-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
                                        -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768,
                                        -2176300, -1329968, -836804, -354784, -90569, -28367, -3878}),
                        new AASeriesElement()
                                .name("女")
                                .data(new Object[]{1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
                                        3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638,
                                        1447162, 1005011, 330870, 130632, 21208})
                });
    }

    public static AAOptions basicColumnChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("月平均降雨量"))
                .subtitle(new AASubtitle()
                        .text("数据来源: WorldClimate.com"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"}))
                .yAxis(new AAYAxis()
                        .min(0)
                        .title(new AATitle()
                                .text("降雨量 (mm)")))
                .tooltip(new AATooltip()
                        .headerFormat("<span style=\"font-size:10px\">{point.key}</span><table>")
                        .pointFormat("<tr><td style=\"color:{series.color};padding:0\">{series.name}: </td>" +
                                "<td style=\"padding:0\"><b>{point.y:.1f} mm</b></td></tr>")
                        .footerFormat("</table>")
                        .shared(true)
                        .useHTML(true))
                .plotOptions(new AAPlotOptions()
                        .column(new AAColumn()
                                .borderWidth(0)))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("东京")
                                .data(new Object[]{49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4}),
                        new AASeriesElement()
                                .name("纽约")
                                .data(new Object[]{83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3}),
                        new AASeriesElement()
                                .name("伦敦")
                                .data(new Object[]{48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2}),
                        new AASeriesElement()
                                .name("柏林")
                                .data(new Object[]{42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1})
                });
    }

    public static AAOptions basicColumnChartWithNegativeValue() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("包含负值的柱形图"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"苹果", "橘子", "梨", "葡萄", "香蕉"}))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("小张")
                                .data(new Object[]{5, 3, 4, 7, 2}),
                        new AASeriesElement()
                                .name("小彭")
                                .data(new Object[]{2, -2, -3, 2, 1}),
                        new AASeriesElement()
                                .name("小潘")
                                .data(new Object[]{3, 4, 4, -2, 5})
                });
    }

    public static AAOptions basicColumnChartWithStackedDataLabels() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("堆叠柱形图"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"苹果", "橘子", "梨", "葡萄", "香蕉"}))
                .yAxis(new AAYAxis()
                        .min(0)
                        .title(new AATitle()
                                .text("水果消费总量")))
                .legend(new AALegend()
                        .align("right")
                        .x(-30)
                        .verticalAlign("top")
                        .y(25)
                        .floating(true))
                .tooltip(new AATooltip()
                        .formatter("function () {\n" +
                                "return '<b>' + this.x + '</b><br/>' +\n" +
                                "this.series.name + ': ' + this.y + '<br/>' +\n" +
                                "'总量: ' + this.point.stackTotal;\n" +
                                "}"))
                .plotOptions(new AAPlotOptions()
                        .column(new AAColumn()
                                .stacking("normal")
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .color(AAColor.White)
                                        .style(new AAStyle()
                                                .textOutline("1px 1px black")))))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("小张")
                                .data(new Object[]{5, 3, 4, 7, 2}),
                        new AASeriesElement()
                                .name("小彭")
                                .data(new Object[]{2, 2, 3, 2, 1}),
                        new AASeriesElement()
                                .name("小潘")
                                .data(new Object[]{3, 4, 4, 2, 5})
                });
    }

    public static AAOptions basicColumnChartWithStackedDataLabels2() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("按性别划分的水果消费总量"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"苹果", "橘子", "梨", "葡萄", "香蕉"}))
                .yAxis(new AAYAxis()
                        .allowDecimals(false)
                        .min(0)
                        .title(new AATitle()
                                .text("水果数量")))
                .tooltip(new AATooltip()
                        .formatter("function () {\n" +
                                "return '<b>' + this.x + '</b><br/>' +\n" +
                                "this.series.name + ': ' + this.y + '<br/>' +\n" +
                                "'总量: ' + this.point.stackTotal;\n" +
                                "}"))
                .plotOptions(new AAPlotOptions()
                        .column(new AAColumn()
                                .stacking("normal")))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("小张")
                                .data(new Object[]{5, 3, 4, 7, 2})
                                .stack("male"),
                        new AASeriesElement()
                                .name("小潘")
                                .data(new Object[]{3, 4, 4, 2, 5})
                                .stack("male"),
                        new AASeriesElement()
                                .name("小彭")
                                .data(new Object[]{2, 5, 6, 2, 1})
                                .stack("female"),
                        new AASeriesElement()
                                .name("小王")
                                .data(new Object[]{3, 0, 4, 4, 3})
                                .stack("female")
                });
    }

    public static AAOptions percentStackedColumnChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("百分比堆叠柱形图"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"苹果", "橘子", "梨", "葡萄", "香蕉"}))
                .yAxis(new AAYAxis()
                        .min(0)
                        .title(new AATitle()
                                .text("水果消费总量")))
                .tooltip(new AATooltip()
                        .pointFormat("<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}</b>({point.percentage:.0f}%)<br/>")
                        .shared(true))
                .plotOptions(new AAPlotOptions()
                        .column(new AAColumn()
                                .stacking("percent")))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("小张")
                                .data(new Object[]{5, 3, 4, 7, 2}),
                        new AASeriesElement()
                                .name("小彭")
                                .data(new Object[]{2, 2, 3, 2, 1}),
                        new AASeriesElement()
                                .name("小潘")
                                .data(new Object[]{3, 4, 4, 2, 5})
                });
    }

    public static AAOptions columnChartWithRotatedLabels() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("全球各大城市人口排行"))
                .subtitle(new AASubtitle()
                        .text("数据截止 2017-03，来源: Wikipedia"))
                .xAxis(new AAXAxis()
                        .type("category")
                        .labels(new AALabels()
                                .rotation(-45)))
                .yAxis(new AAYAxis()
                        .min(0)
                        .title(new AATitle()
                                .text("人口 (百万)")))
                .legend(new AALegend()
                        .enabled(false))
                .tooltip(new AATooltip()
                        .pointFormat("人口总量: <b>{point.y:.1f} 百万</b>"))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("总人口")
                                .data(new Object[][]{
                                        {"上海", 24.25},
                                        {"卡拉奇", 23.50},
                                        {"北京", 21.51},
                                        {"德里", 16.78},
                                        {"拉各斯", 16.06},
                                        {"天津", 15.20},
                                        {"伊斯坦布尔", 14.16},
                                        {"东京", 13.51},
                                        {"广州", 13.08},
                                        {"孟买", 12.44},
                                        {"莫斯科", 12.19},
                                        {"圣保罗", 12.03},
                                        {"深圳", 10.46},
                                        {"雅加达", 10.07},
                                        {"拉合尔", 10.05},
                                        {"首尔", 9.99},
                                        {"武汉", 9.78},
                                        {"金沙萨", 9.73},
                                        {"开罗", 9.27},
                                        {"墨西哥", 8.87}
                                })
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .rotation(-90)
                                        .color(AAColor.White)
                                        .align("right")
                                        .format("{point.y:.1f}")
                                        .y(10))
                });
    }

    public static AAOptions columnChartWithNestedColumn() {
        AAColumn[] arr = new AAColumn[]{
                new AAColumn()
                        .name("雇员")
                        .color("rgba(165,170,217,1)")
                        .data(new Object[]{150, 73, 20})
                        .pointPadding(0.3f)
                        .pointPlacement(-0.2f),
                new AAColumn()
                        .name("优化的员工")
                        .color("rgba(126,86,134,.9)")
                        .data(new Object[]{140, 90, 40})
                        .pointPadding(0.4f)
                        .pointPlacement(-0.2f),
                new AAColumn()
                        .name("利润")
                        .color("rgba(248,161,63,1)")
                        .data(new Object[]{183.6, 178.8, 198.5})
                        .pointPadding(0.3f)
                        .pointPlacement(0.2f)
                        .yAxis(1),
                new AAColumn()
                        .name("优化的利润")
                        .color("rgba(186,60,61,.9)")
                        .data(new Object[]{203.6, 198.8, 208.5})
                        .pointPadding(0.4f)
                        .pointPlacement(0.2f)
                        .yAxis(1)
        };

        return new AAOptions()
                .chart(new AAChart()
                        .type("column"))
                .title(new AATitle()
                        .text("分公司效率优化嵌套图"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{
                                "杭州总部",
                                "上海分部",
                                "北京分部"
                        }))
                .yAxisArray(new AAYAxis[]{
                        new AAYAxis()
                                .min(0)
                                .title(new AATitle()
                                        .text("雇员")),
                        new AAYAxis()
                                .title(new AATitle()
                                        .text("利润 (millions)"))
                                .opposite(true)
                })
                .legend(new AALegend())
                .tooltip(new AATooltip()
                        .shared(true))
                .plotOptions(new AAPlotOptions()
                        .column(new AAColumn()
                                .grouping(false)
                                .borderWidth(0)))
                .series(arr);
    }

    public static AAOptions columnRangeChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type("columnrange"))
                .title(new AATitle()
                        .text("每月温度变化范围"))
                .subtitle(new AASubtitle()
                        .text("2009 挪威某地"))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"}))
                .yAxis(new AAYAxis()
                        .title(new AATitle()
                                .text("温度 ( °C )")))
                .tooltip(new AATooltip()
                        .valueSuffix("°C"))
                .plotOptions(new AAPlotOptions()
                        .columnrange(new AAColumnrange()
                                .dataLabels(new AADataLabels()
                                        .enabled(true)
                                        .formatter("function () {\n" +
                                                "return this.y + '°C';\n" +
                                                "}"))))
                .legend(new AALegend()
                        .enabled(false))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("温度")
                                .data(new Object[][]{
                                        {-9.7, 9.4},
                                        {-8.7, 6.5},
                                        {-3.5, 9.4},
                                        {-1.4, 19.9},
                                        {0.0, 22.6},
                                        {2.9, 29.5},
                                        {9.2, 30.7},
                                        {7.3, 26.5},
                                        {4.4, 18.0},
                                        {-3.1, 11.4},
                                        {-5.2, 10.4},
                                        {-13.5, 9.8}
                                })
                });
    }
}