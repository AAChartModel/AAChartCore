package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartFontWeightType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLineDashStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAHover;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPoint;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPointEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASelect;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStates;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;

import java.util.Map;

public class JSFunctionForAAOptionsComposer {

    //https://github.com/AAChartModel/AAChartKit/issues/780
    public static AAOptions customDoubleXAxesChart() {
        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#7052f4",
                "#00b0ff"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map<String, Object> gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#EF71FF",
                "#4740C8"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        AAChart aaChart = new AAChart()
                .type(AAChartType.Bar);

        AATitle aaTitle = new AATitle()
                .text("2015 年德国人口金字塔")
                .style(new AAStyle()
                        .color("#000000")
                        .fontSize(12.0));

        String[] aaCategories = new String[]{"0-4", "5-9", "10-14", "15-19",
                "20-24", "25-29", "30-34", "35-39", "40-44",
                "45-49", "50-54", "55-59", "60-64", "65-69",
                "70-74", "75-79", "80-84", "85-89", "90-94",
                "95-99", "100 + "};

        AAXAxis aaXAxis1 = new AAXAxis()
                .reversed(true)
                .categories(aaCategories)
                .labels(new AALabels()
                        .step(1))
                ;

        AAXAxis aaXAxis2 = new AAXAxis()
                .reversed(true)
                .opposite(true)
                .categories(aaCategories)
                .linkedTo(0)
                .labels(new AALabels()
                        .step(1));

        AAYAxis aaYAxis = new AAYAxis()
                .gridLineWidth(0)// Y 轴网格线宽度
                .title(new AATitle()
                        .text(""))//Y 轴标题
                .labels(new AALabels()
                        .formatter("function () {\n" +
                                "    return (Math.abs(this.value) / 1000000) + 'M';\n" +
                                "}"))
                .min(-4000000)
                .max(4000000);

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .animation(new AAAnimation()
                                .duration(800)
                                .easing(AAChartAnimationType.Bounce)
                        )
                        .stacking(AAChartStackingType.Normal));

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(false)
                .formatter("function () {\n" +
                        "    return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +\n" +
                        "        '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);\n" +
                        "}");

        AASeriesElement aaSeriesElement1 = new AASeriesElement()
                .name("Men")
                .color(gradientColorDic1)
                .data(new Object[]{-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
                        -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768,
                        -2176300, -1329968, -836804, -354784, -90569, -28367, -3878});

        AASeriesElement aaSeriesElement2 = new AASeriesElement()
                .name("Women")
                .color(gradientColorDic2)
                .data(new Object[]{1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
                        3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638,
                        1447162, 1005011, 330870, 130632, 21208});

        return new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxisArray(new AAXAxis[]{aaXAxis1,aaXAxis2})
                .yAxis(aaYAxis)
                .plotOptions(aaPlotOptions)
                .tooltip(aaTooltip)
                .series(new Object[]{aaSeriesElement1,aaSeriesElement2});
    }

    //https://github.com/AAChartModel/AAChartKit/issues/967
    public static AAOptions disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Bar)
                .title("Custom Bar Chart select color")
                .yAxisReversed(true)
                .xAxisReversed(true)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("ElementOne")
                                .data(new Object[]{211,183,157,133,111,91,73,57,43,31,21,13,7,3})
                                .allowPointSelect(true)
                                .states(new AAStates()
                                .hover(new AAHover()
                                        .color(AAColor.Yellow))
                                .select(new AASelect()
                                        .color(AAColor.Red))
                        )
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        AAPoint aaPoint = new AAPoint()
                .events(new AAPointEvents()
                        .click("function () {\n" +
                                "         if (this.selected == true) {\n" +
                                "             this.selected = false;\n" +
                                "         }\n" +
                                "         return;\n" +
                                "     }"));

        aaOptions.plotOptions.series
                .point(aaPoint);

        return aaOptions;
    }

    // Refer to the issue https://github.com/AAChartModel/AAChartKit/issues/589
    public static AAOptions customizeEveryDataLabelSinglelyByDataLabelsFormatter() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .dataLabelsEnabled(true)
                .tooltipEnabled(false)
                .colorsTheme(new Object[]{AAGradientColor.FizzyPeach})
                .markerRadius(0)
                .legendEnabled(false)
                .categories(new String[]{"美国🇺🇸","欧洲🇪🇺","中国🇨🇳","日本🇯🇵","韩国🇰🇷","越南🇻🇳","中国香港🇭🇰",})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.yAxis.gridLineDashStyle = AAChartLineDashStyleType.LongDash;//设置Y轴的网格线样式为 AAChartLineDashStyleType.LongDash

        String[] unitArr ={"美元", "欧元", "人民币", "日元", "韩元", "越南盾", "港币", };
        String unitJSArrStr = javaScriptArrayStringWithJavaArray(unitArr);
        String dataLabelsFormatter = String.format("function () {\n" +
                "        return this.y + %s[this.point.index];  \n" +  //单组 series 图表, 获取选中的点的索引是 this.point.index ,多组并且共享提示框,则是this.points[0].index
                "    }", unitJSArrStr);

        AADataLabels aaDatalabels = aaOptions.plotOptions.series.dataLabels;
        aaDatalabels
                .style(AAStyle.style(AAColor.Red, 10, AAChartFontWeightType.Bold, "1px 1px contrast"))
                .formatter(dataLabelsFormatter)
                .backgroundColor(AAColor.White)// white color
                .borderColor(AAColor.Red)// red color
                .borderRadius(1.5)
                .borderWidth(1.3)
                .x(3).y(-20)
                .verticalAlign(AAChartVerticalAlignType.Middle);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/404
    public static AAOptions configureColorfulDataLabelsForPieChart() {
        AAOptions aaOptions = new AAOptions()
                .title(new AATitle()
                        .text("Colorful DataLabels For Pie Chart"))
                .colors(new Object[]{
                        "#0c9674", "#7dffc0", "#ff3333", "#facd32", "#ffffa0",
                        "#EA007B", "#fe117c", "#ffc069", "#06caf4", "#7dffc0"
                })
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type(AAChartType.Pie)
                                .name("语言热度值")
                                .innerSize("20%")//内部圆环半径大小占比
                                .borderWidth(0)//描边的宽度
                                .allowPointSelect(true)//是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                                .states(new AAStates()
                                        .hover(new AAHover()
                                                .enabled(false)))//禁用点击区块之后出现的半透明遮罩层
                                .dataLabels(new AADataLabels()
                                        .allowOverlap(true)//允许字符重叠
                                        .useHTML(true)
                                        .formatter("function () {\n" +
                                                "       const point = this.point;\n" +
                                                "       return '<span style=\\\"color: ' + point.color + '\\\">' +\n" +
                                                "           point.name + ': ' + point.y + '%</span>';\n" +
                                                "   }"))
                                .data(new Object[][]{
                                        {"Firefox", 3336.2},
                                        {"IE", 26.8},
                                        {"Chrome", 666.8},
                                        {"Safari", 88.5},
                                        {"Opera", 46.0},
                                        {"Others", 223.0},
                                        {"Firefox", 3336.2},
                                        {"IE", 26.8},
                                        {"Chrome", 666.8},
                                        {"Safari", 88.5},
                                        {"Opera", 46.0},
                                        {"Others", 223.0},
                                })
                });

        return aaOptions;
    }


        private static String javaScriptArrayStringWithJavaArray(Object[] javaArray) {
        StringBuilder originalJsArrStr = new StringBuilder();
        for (Object element : javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',");
        }

        return "[" + originalJsArrStr + "]";
    }

}
