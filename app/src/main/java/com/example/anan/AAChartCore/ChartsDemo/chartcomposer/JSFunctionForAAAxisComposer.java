package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import static com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor.AARgba;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartFontWeightType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLayoutType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLineDashStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAItemStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;

import java.util.Map;

public class JSFunctionForAAAxisComposer {
    public static AAOptions customYAxisLabels() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图形类型
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(8)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4})
                        ,
                });

        AALabels aaYAxisLabels = new AALabels()
                .formatter("function () {\n" +
                        "        let yValue = this.value;\n" +
                        "        if (yValue >= 200) {\n" +
                        "            return \"极佳\";\n" +
                        "        } else if (yValue >= 150 && yValue < 200) {\n" +
                        "            return \"非常棒\";\n" +
                        "        } else if (yValue >= 100 && yValue < 150) {\n" +
                        "            return \"相当棒\";\n" +
                        "        } else if (yValue >= 50 && yValue < 100) {\n" +
                        "            return \"还不错\";\n" +
                        "        } else {\n" +
                        "            return \"一般\";\n" +
                        "        }\n" +
                        "    }");

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.yAxis.labels(aaYAxisLabels);

        return aaOptions;
    }

    public static AAOptions customYAxisLabels2() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图形类型
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(8)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{229.9, 771.5, 1106.4, 1129.2, 6644.0, 1176.0, 8835.6, 148.5, 8816.4, 6694.1, 7795.6, 9954.4})
                        ,
                });

        AALabels aaYAxisLabels = new AALabels()
                .style(new AAStyle()
                        .fontSize(10)
                        .fontWeight(AAChartFontWeightType.Bold)
                        .color(AAColor.Gray)
                )
                .formatter("function () {\n" +
                        "        let yValue = this.value;\n" +
                        "        if (yValue == 0) {\n" +
                        "            return \"0\";\n" +
                        "        } else if (yValue == 2500) {\n" +
                        "            return \"25%\";\n" +
                        "        } else if (yValue == 5000) {\n" +
                        "            return \"50%\";\n" +
                        "        } else if (yValue == 7500) {\n" +
                        "            return \"75%\";\n" +
                        "        } else if (yValue == 10000) {\n" +
                        "            return \"100%\";\n" +
                        "        }\n" +
                        "    }");

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.yAxis
                .opposite(true)
                .tickWidth(2)
                .lineWidth(1.5)//Y轴轴线颜色
                .lineColor(AAColor.LightGray)//Y轴轴线颜色
                .gridLineWidth(0)//Y轴网格线宽度
                .tickPositions(new Object[]{0,2500,5000,7500,10000})
                .labels(aaYAxisLabels);

        return aaOptions;
    }

    //Stupid method
    public static AAOptions customAreaChartXAxisLabelsTextUnitSuffix1() {
        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#7052f4",
                "#00b0ff"
        );

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)
                .title("Custom X Axis Labels Text")
                .subtitle("By Using JavaScript Formatter Function")
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
                .yAxisGridLineWidth(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .lineWidth(1.5)
                                .color("#00b0ff")
                                .fillColor(gradientColorDic1)
                                .name("2018")
                                .data(new Object[]{
                                        1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                                        18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                                        3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                                        2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3, 3.32, 3.07, 3.92, 3.05,
                                        2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                                        5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48,
                                })
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.xAxis.labels
                .formatter(
                        "function () {" +
                                "const xValue = this.value;" +
                                "if (xValue%10 == 0) {" +
                                "return xValue + \" sec\";" +
                                "} else {" +
                                "return \"\";" +
                                "}" +
                                "}"
                );

        return aaOptions;
    }

    //Smart method
    public static AAOptions customAreaChartXAxisLabelsTextUnitSuffix2() {
        AAOptions aaOptions = customAreaChartXAxisLabelsTextUnitSuffix1();
        aaOptions.xAxis.labels
                .step(10)
                .format("{value} sec");

        return aaOptions;
    }



    //https://github.com/AAChartModel/AAChartKit/issues/901
//https://github.com/AAChartModel/AAChartKit/issues/952
    public static AAOptions configureTheAxesLabelsFormattersOfDoubleYAxesChart() {
        AAChart aaChart = new AAChart()
                .backgroundColor(AAColor.White);

        AATitle aaTitle = new AATitle()
                .text("");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .min(0)
                .categories(new String[]{
                        "Java", "Swift", "Python", "Ruby", "PHP", "Go","C",
                        "C#", "C++", "Perl", "R", "MATLAB", "SQL"
                });

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .marker(new AAMarker()
                                .radius(7)//曲线连接点半径，默认是4
                                .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                                .fillColor(AAColor.White)//点的填充色(用来设置折线连接点的填充色)
                                .lineWidth(3)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                                .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                        ));

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color("DodgerBlue"))
                        .formatter("function () {\n" +
                                "        let yValue = this.value;\n" +
                                "        if (yValue >= 200) {\n" +
                                "            return \"极佳\";\n" +
                                "        } else if (yValue >= 150 && yValue < 200) {\n" +
                                "            return \"非常棒\";\n" +
                                "        } else if (yValue >= 100 && yValue < 150) {\n" +
                                "            return \"相当棒\";\n" +
                                "        } else if (yValue >= 50 && yValue < 100) {\n" +
                                "            return \"还不错\";\n" +
                                "        } else {\n" +
                                "            return \"一般\";\n" +
                                "        }\n" +
                                "    }"))
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("中文")
                        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color(AAColor.Red))
                        .formatter("function () {\n" +
                                "        let yValue = this.value;\n" +
                                "        if (yValue >= 200) {\n" +
                                "            return \"Awesome\";\n" +
                                "        } else if (yValue >= 150 && yValue < 200) {\n" +
                                "            return \"Great\";\n" +
                                "        } else if (yValue >= 100 && yValue < 150) {\n" +
                                "            return \"Very Good\";\n" +
                                "        } else if (yValue >= 50 && yValue < 100) {\n" +
                                "            return \"Not Bad\";\n" +
                                "        } else {\n" +
                                "            return \"Just So So\";\n" +
                                "        }\n" +
                                "    }"))
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("ENGLISH")
                        .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
                .opposite(true);

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        AASeriesElement[] seriesArr = {
                new AASeriesElement()
                        .name("2020")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.DeepSea)
                        .borderRadius(4)
                        .yAxis(1)
                        .data(new Object[]{
                        0, 71.5, 106.4, 129.2, 144.0, 176.0,
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4
                }),
                new AASeriesElement()
                        .name("2021")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.Sanguine)
                        .yAxis(0)
                        .data(new Object[]{
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                        0, 71.5, 106.4, 129.2, 144.0, 176.0
                })
        };

        AAOptions aaOptions = new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .plotOptions(aaPlotOptions)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1, yAxis2})
                .tooltip(aaTooltip)
                .series(seriesArr);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
    public static AAOptions configureTheAxesLabelsFormattersOfDoubleYAxesChart2() {
        AAChart aaChart = new AAChart()
                .backgroundColor(AAColor.White);

        AATitle aaTitle = new AATitle()
                .text("");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .min(0)
                .categories(new String[]{
                        "Java", "Swift", "Python", "Ruby", "PHP", "Go","C",
                        "C#", "C++", "Perl", "R", "MATLAB", "SQL"
                });

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .marker(new AAMarker()
                                .radius(7)//曲线连接点半径，默认是4
                                .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                                .fillColor(AAColor.White)//点的填充色(用来设置折线连接点的填充色)
                                .lineWidth(3)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                                .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                        ));

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color("DodgerBlue"))
                        .formatter("function () {\n" +
                                "       var yValue = this.value;\n" +
                                "       var formattedYValue = (yValue / 1000).toFixed(3) + '千';\n" +
                                "       return formattedYValue;\n" +
                                "   }"))
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("以「千」为单位")
                        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color(AAColor.Red))
                        .formatter("function () {\n" +
                                "       var yValue = this.value;\n" +
                                "       var formattedYValue = (yValue / 10000).toFixed(4) + '万';\n" +
                                "       return formattedYValue;\n" +
                                "   }"))
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("以『万』为单位")
                        .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
                .opposite(true);

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        AASeriesElement[] seriesArr = {
                new AASeriesElement()
                        .name("2020")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.DeepSea)
                        .borderRadius(4)
                        .yAxis(1)
                        .data(new Object[]{
                        0, 71.5, 106.4, 129.2, 144.0, 176.0,
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4
                }),
                new AASeriesElement()
                        .name("2021")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.Sanguine)
                        .yAxis(0)
                        .data(new Object[]{
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                        0, 71.5, 106.4, 129.2, 144.0, 176.0
                })
        };

        AAOptions aaOptions = new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .plotOptions(aaPlotOptions)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1, yAxis2})
                .tooltip(aaTooltip)
                .series(seriesArr);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
//https://github.com/AAChartModel/AAChartKit/issues/1330
    public static AAOptions configureTheAxesLabelsFormattersOfDoubleYAxesChart3() {
        AAChart aaChart = new AAChart()
                .backgroundColor(AAColor.White);

        AATitle aaTitle = new AATitle()
                .text("");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .min(0)
                .categories(new String[]{
                        "Java", "Swift", "Python", "Ruby", "PHP", "Go","C",
                        "C#", "C++", "Perl", "R", "MATLAB", "SQL"
                });

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .marker(new AAMarker()
                                .radius(7)//曲线连接点半径，默认是4
                                .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                                .fillColor(AAColor.White)//点的填充色(用来设置折线连接点的填充色)
                                .lineWidth(3)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                                .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                        ));

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color("DodgerBlue"))
                        .formatter("function () {\n" +
                                "       var yValue = this.value;\n" +
                                "       var unitStr = \"千\";\n" +
                                "       if (yValue == 0) {\n" +
                                "           unitStr = \"\";\n" +
                                "       }\n" +
                                "       var formattedYValue = (yValue / 1000).toFixed(3) + unitStr;\n" +
                                "       return formattedYValue;\n" +
                                "   }"))//Y轴文字数值为 0 的时候, 不显示单位
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("以「千」为单位")
                        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .tickPositions(new Object[]{0, 50, 100, 150, 200})
                .labels(new AALabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color(AAColor.Red))
                        .formatter("function () {\n" +
                                "       var yValue = this.value;\n" +
                                "       var unitStr = \"万\";\n" +
                                "       if (yValue == 0) {\n" +
                                "           unitStr = \"\";\n" +
                                "       }\n" +
                                "       var formattedYValue = (yValue / 10000).toFixed(4) + unitStr;\n" +
                                "       return formattedYValue;\n" +
                                "   }"))//Y轴文字数值为 0 的时候, 不显示单位
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("以『万』为单位")
                        .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
                .opposite(true)
                ;

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        AASeriesElement[] seriesArr = {
                new AASeriesElement()
                        .name("2020")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.DeepSea)
                        .borderRadius(4)
                        .yAxis(1)
                        .data(new Object[]{
                        0, 71.5, 106.4, 129.2, 144.0, 176.0,
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4
                }),
                new AASeriesElement()
                        .name("2021")
                        .type(AAChartType.Spline)
                        .lineWidth(7)
                        .color(AAGradientColor.Sanguine)
                        .yAxis(0)
                        .data(new Object[]{
                        135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                        0, 71.5, 106.4, 129.2, 144.0, 176.0
                })
        };

        AAOptions aaOptions = new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .plotOptions(aaPlotOptions)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1, yAxis2})
                .tooltip(aaTooltip)
                .series(seriesArr);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1217
    public static AAOptions customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Bar)//图表类型
                .title("春江花月夜")//图表主标题
                .subtitle("张若虚")//图表副标题
//        .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
                .xAxisReversed(true)
//        .xAxisLabelsStyle(AAStyle.style(AAColor.Black))
                .legendEnabled(false)
                .categories(new String[]{
                        "春江潮水连海平", "海上明月共潮生",
                        "滟滟随波千万里", "何处春江无月明",
                        "江流宛转绕芳甸", "月照花林皆似霰",
                        "空里流霜不觉飞", "汀上白沙看不见",
                        "江天一色无纤尘", "皎皎空中孤月轮",
                        "江畔何人初见月", "江月何年初照人",
                        "人生代代无穷已", "江月年年望相似",
                        "不知江月待何人", "但见长江送流水",
                        "白云一片去悠悠", "青枫浦上不胜愁",
                        "谁家今夜扁舟子", "何处相思明月楼",
                        "可怜楼上月裴回", "应照离人妆镜台",
                        "玉户帘中卷不去", "捣衣砧上拂还来",
                        "此时相望不相闻", "愿逐月华流照君",
                        "鸿雁长飞光不度", "鱼龙潜跃水成文",
                        "昨夜闲潭梦落花", "可怜春半不还家",
                        "江水流春去欲尽", "江潭落月复西斜",
                        "斜月沉沉藏海雾", "碣石潇湘无限路",
                        "不知乘月几人归", "落月摇情满江树",
                })
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .lineWidth(1.5)
                                .color(AAGradientColor.DeepSea)
                                .name("2018")
                                .data(new Object[]{
                                1.51, 3.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28,1.51, 2.7, 0.94, 1.44,
                                3.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90,
                        })
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.xAxis.labels
                .formatter("function () {\n" +
                        "        let xAxisCategory = this.value;\n" +
                        "        if (xAxisCategory.length > 4) {\n" +
                        "            return xAxisCategory.substr(0, 4);\n" +
                        "        } else {\n" +
                        "            return xAxisCategory;\n" +
                        "        }\n" +
                        "    }");
        ;


        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit/issues/852 自定义蜘蛛🕷图样式
    public static AAOptions customSpiderChartStyle() {
        String[] categoryArr = {
                "周转天数(天)",
                "订单满足率",
                "订单履约时效",
                "动销率",
                "畅销商品缺货率",
                "高库存金额占比",
                "不动销金额占比",
                "停采金额占比",
        };

//        String categoryJSArrStr = {categoryArr aa_toJSArray];

//
//        String xAxisLabelsFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            return %[this.value];
//        })),categoryJSArrStr];

        String categoryJSArrStr = javaScriptArrayStringWithJavaArray(categoryArr);

        String xAxisLabelsFormatter = String.format("function () {\n" +
                "        return %s[this.value];\n" +
                "    }", categoryJSArrStr);

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图表类型
                .title("健康体检表")//图表主标题
                .colorsTheme(new String[]{"#fe117c","#ffc069",})//设置主体颜色数组
                .yAxisLineWidth(0)
//                .yAxisGridLineStyle([AALineStyle styleWithWidth:0})
//    .yAxisTickPositions([0, 5, 10, 15, 20, 25, 30, 35})
                .markerRadius(5)
                .markerSymbol(AAChartSymbolType.Circle)
                .polar(true)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("本月得分")
                                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5,}),
                        new AASeriesElement()
                                .name("上月得分")
                                .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, }),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.chart
                .marginLeft(80)
                .marginRight(80);

        aaOptions.xAxis
                .lineWidth(0)//避免多边形外环之外有额外套了一层无用的外环
                .labels.style(AAStyle.style(AAColor.Black))
                .formatter(xAxisLabelsFormatter);

        aaOptions.yAxis
                .gridLineInterpolation("polygon")//设置蜘蛛网🕸图表的网线为多边形
                .labels.style(AAStyle.style(AAColor.Black));


        //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
//                /默认是：{
//            "color": "#333333",
//                    "cursor": "pointer",
//                    "fontSize": "12px",
//                    "fontWeight": "bold"
//        }
//     /
        AAItemStyle aaItemStyle = new AAItemStyle()
                .color(AAColor.Gray)//字体颜色
                .cursor("pointer")//(在移动端这个属性没什么意义,其实不用设置)指定鼠标滑过数据列时鼠标的形状。当绑定了数据列点击事件时，可以将此参数设置为 "pointer"，用来提醒用户改数据列是可以点击的。
                .fontSize(14)//字体大小
                .fontWeight(AAChartFontWeightType.Thin);//字体为细体字

        aaOptions.legend
                .enabled(true)
                .align(AAChartAlignType.Center)//设置图例位于水平方向上的右侧
                .layout(AAChartLayoutType.Horizontal)//设置图例排列方式为垂直排布
                .verticalAlign(AAChartVerticalAlignType.Top)//设置图例位于竖直方向上的顶部
                .itemStyle(aaItemStyle);

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

    // Refer to GitHub issue: https://github.com/AAChartModel/AAChartKit/issues/938
    // Refer to online chart sample: https://www.highcharts.com/demo/column-comparison
    public static AAOptions customXAxisLabelsBeImages() {
        String[] nameArr = {
                "South Korea",
                "Japan",
                "Australia",
                "Germany",
                "Russia",
                "China",
                "Great Britain",
                "United States"
        };

        String[] colorArr = {
                AARgba(201, 36,  39, 1.f),
                AARgba(201, 36,  39, 1.f),
                AARgba(0,   82,  180, 1.f),
                AARgba(0,   0,   0, 1.f),
                AARgba(240, 240, 240, 1.f),
                AARgba(255, 217, 68, 1.f),
                AARgba(0,   82,  180, 1.f),
                AARgba(215, 0,   38, 1.f)
        };


        String[] imageLinkFlagArr = {
                "197582",
                "197604",
                "197507",
                "197571",
                "197408",
                "197375",
                "197374",
                "197484"
        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .title("Custom X Axis Labels Be Images")
                .subtitle("use HTML")
                .categories(nameArr)
                .colorsTheme(colorArr)
                .borderRadius(5)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("AD 2020")
                                .data(new Object[]{9.0, 9.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5})
                                .colorByPoint(true)
                                .borderRadiusTopLeft("50%")
                                .borderRadiusTopRight("50%")
                });

        String imageLinkFlagJSArrStr = javaScriptArrayStringWithJavaArray(imageLinkFlagArr);
        String xLabelsFormatter = String.format("function () {\n" +
                "        let imageFlag = %s[this.pos];\n" +
                "        let imageLink = \"\";\n" +
                "        return imageLink;\n" +
                "    }", imageLinkFlagJSArrStr);

        //    https://api.highcharts.com.cn/highcharts#xAxis.labels.formatter
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.xAxis.labels
                .useHTML(true)
                .formatter(xLabelsFormatter);


        aaOptions.plotOptions.column.groupPadding(0.005f);

//    /Custom tooltip style/
//                String tooltipFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            let imageFlag = %[this.point.index];
//            let imageLink = "
//            ";
//            return imageLink
//                    + " 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔
//            "
//                    + " Support JavaScript Function Just Right Now !!!
//            "
//                    + " The Gold Price For 2020 "
//                    +  this.x
//                    + "  Is  "
//                    +  this.y
//                    + "  Dollars ";
//        })),imageLinkFlagJSArrStr];

        String tooltipFormatter = String.format("function () {\n" +
                "        let imageFlag = %s[this.point.index];\n" +
                "        let imageLink = \"<span><img src=\\\"https://image.flaticon.com/icons/svg/197/\" + imageFlag + \".svg\\\" style=\\\"width: 30px; height: 30px;\\\"/><br></span>\";\n" +
                "        return imageLink\n" +
                "        + \" \uD83C\uDF15 \uD83C\uDF16 \uD83C\uDF17 \uD83C\uDF18 \uD83C\uDF11 \uD83C\uDF12 \uD83C\uDF13 \uD83C\uDF14 <br/> \"\n" +
                "        + \" Support JavaScript Function Just Right Now !!! <br/> \"\n" +
                "        + \" The Gold Price For <b>2020 \"\n" +
                "        +  this.x\n" +
                "        + \" </b> Is <b> \"\n" +
                "        +  this.y\n" +
                "        + \" </b> Dollars \";\n" +
                "    }", imageLinkFlagJSArrStr);

        aaOptions.tooltip
                .shared(false)
                .useHTML(true)
                .formatter(tooltipFormatter);


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
