package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAxisType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartFontWeightType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLayoutType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLineDashStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAColumnrange;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AACrosshair;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAHover;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAInactive;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAItemStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotBandsElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAResetZoomButton;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASelect;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeriesEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStates;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class JSFunctionChartOptionsComposer {

    public static AAOptions customAreaChartTooltipStyleWithSimpleFormatString() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)//图形类型
                .title("近三个月金价起伏周期图")//图表主标题
                .subtitle("金价(元/克)")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .categories(new String[]{
                        "10-01","10-02","10-03","10-04","10-05","10-06","10-07","10-08","10-09","10-10","10-11",
                        "10-12","10-13","10-14","10-15","10-16","10-17","10-18","10-19","10-20","10-21","10-22",
                        "10-23","10-024","10-25","10-26","10-27","10-28","10-29","10-30","10-31","11-01","11-02",
                        "11-03","11-04","11-05","11-06","11-07","11-08","11-09","11-10","11-11","11-12","11-13",
                        "11-14","11-15","11-16","11-17","11-18","11-19","11-20","11-21","11-22","11-23","11-024",
                        "11-25","11-26","11-27","11-28","11-29","11-30","12-01","12-02","12-03","12-04","12-05",
                        "12-06","12-07","12-08","12-09","12-10","12-11","12-12","12-13","12-14","12-15","12-16",
                        "12-17","12-18","12-19","12-20","12-21","12-22","12-23","12-024","12-25","12-26","12-27",
                        "12-28","12-29","12-30"})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("2020")
                                .lineWidth(3)
                                .color("#FFD700"/*纯金色*/)
                                .fillOpacity(0.5)
                                .data(new Object[]{
                                1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                                18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                                3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                                2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                                2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                                5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48})
                });
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter(" function () {\n" +
                        "        return ' 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔 <br/> '\n" +
                        "        + ' Support JavaScript Function Just Right Now !!! <br/> '\n" +
                        "        + ' The Gold Price For <b>2020 '\n" +
                        "        +  this.x\n" +
                        "        + ' </b> Is <b> '\n" +
                        "        +  this.y\n" +
                        "        + ' </b> Dollars ';\n" +
                        "        }")
                .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
                .backgroundColor("#000000")
                .borderColor("#000000")
                .style(new AAStyle()
                        .color("#FFD700")
                        .fontSize(12.)
                );
        aaOptions.tooltip(aaTooltip);

        aaOptions.chart
                .resetZoomButton(new AAResetZoomButton()
                        .theme((Map) new HashMap()
                                .put("display","none")) //隐藏图表缩放后的默认显示的缩放按钮
                );

        return aaOptions;
    }

    public static AAOptions customAreaChartTooltipStyleWithDifferentUnitSuffix() {
        AASeriesElement element1 = new AASeriesElement()
                .name("🐶狗子")
                .lineWidth(5)
                .fillOpacity(0.5)
                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36});
        AASeriesElement element2 = new AASeriesElement()
                .name("🌲树木")
                .lineWidth(5)
                .fillOpacity(0.5)
                .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67});

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)//图形类型
                .title("2014 ~ 2020 汪星人生存指数")//图表主标题
                .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new Object[]{"#ff0000","#0000ff"})
                .stacking(AAChartStackingType.Normal)
                .series(new AASeriesElement[]{element1, element2});


        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter("function () {\n" +
                        "        var s = '第' + '<b>' +  this.x + '</b>' + '年' + '<br/>';\n" +
                        "        let colorDot1 = '<span style=\\\"' + 'color:#1e90ff; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        let colorDot2 = '<span style=\\\"' + 'color:#ef476f; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        let s1 = colorDot1  + this.points[0].series.name + ': ' + this.points[0].y + '只' + '<br/>';\n" +
                        "        let s2 =  colorDot2 + this.points[1].series.name + ': ' + this.points[1].y + '棵';\n" +
                        "        s += s1 + s2;\n" +
                        "        return s;\n" +
                        "    }")
                ;
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip(aaTooltip);

        aaOptions.plotOptions.series.events = new AASeriesEvents()
                .legendItemClick("function() {\n" +
                        "             return false;\n" +
                        "         }");
        return aaOptions;
    }


    public static AAOptions customAreaChartTooltipStyleWithColorfulHtmlLabels() {
        AASeriesElement element1 = new AASeriesElement()
                .name("Predefined symbol")
                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36});

        AASeriesElement element2 = new AASeriesElement()
                .name("Image symbol")
                .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67});

        AASeriesElement element3 = new AASeriesElement()
                .name("Base64 symbol (*)")
                .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64});

        AASeriesElement element4 = new AASeriesElement()
                .name("Custom symbol")
                .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53});


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图形类型
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new Object[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(0)
                .series(new AASeriesElement[]{element1, element2, element3, element4});


        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter("function () {\n" +
                        "        let wholeContentStr ='<span style=\\\"' + 'color:lightGray; font-size:13px\\\"' + '>◉ Time: ' + this.x + ' year</span><br/>';\n" +
                        "        let length = this.points.length;\n" +
                        "        for (let i = 0; i < length; i++) {\n" +
                        "            let thisPoint = this.points[i];\n" +
                        "            let yValue = thisPoint.y;\n" +
                        "            if (yValue != 0) {\n" +
                        "                let spanStyleStartStr = '<span style=\\\"' + 'color:'+ thisPoint.color + '; font-size:13px\\\"' + '>◉ ';\n" +
                        "                let spanStyleEndStr = '</span> <br/>';\n" +
                        "                wholeContentStr += spanStyleStartStr + thisPoint.series.name + ': ' + thisPoint.y + '℃' + spanStyleEndStr;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return wholeContentStr;\n" +
                        "    }")
                .backgroundColor("#050505")
                .borderColor("#050505")
                ;
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }


    public static AAOptions customLineChartTooltipStyleWhenValueBeZeroDoNotShow() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)//图形类型
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .categories(new String[]{"临床一期","临床二期","临床三期"})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("上市")
                                .data(new Object[]{0, 0, 7}),
                        new AASeriesElement()
                                .name("中止")
                                .data(new Object[]{4, 5, 1}),
                        new AASeriesElement()
                                .name("无进展")
                                .data(new Object[]{2, 0, 1}),
                        new AASeriesElement()
                                .name("进行中")
                                .data(new Object[]{3, 5, 2}),

                });

        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter("function () {\n" +
                        "        let wholeContentStr = this.points[0].x + '<br/>';\n" +
                        "        let length = this.points.length;\n" +
                        "        for (let i = 0; i < length; i++) {\n" +
                        "            let thisPoint = this.points[i];\n" +
                        "            let yValue = thisPoint.y;\n" +
                        "            if (yValue != 0) {\n" +
                        "                let prefixStr = '<span style=\\\"' + 'color:'+ thisPoint.color + '; font-size:13px\\\"' + '>◉ ';\n" +
                        "                wholeContentStr += prefixStr + thisPoint.series.name + ': ' + yValue + '<br/>';\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return wholeContentStr;\n" +
                        "    }")
                ;
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    public static AAOptions customBoxplotTooltipContent() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Boxplot)
                .title("BOXPLOT CHART")
                .subtitle("virtual data")
                .yAxisTitle("℃")
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Observed Data")
                                .color("#ef476f")
                                .fillColor(AAGradientColor.DeepSea)
                                .data( new Object[][] {
                                {760, 801, 848, 895, 965},
                                {733, 853, 939, 980, 1080},
                                {714, 762, 817, 870, 918},
                                {724, 802, 806, 871, 950},
                                {834, 836, 864, 882, 910}
                        })
                        ,
                });

        String pointFormatStr =
                "◉</span> <b> {series.name}</b><br/>"
                        +  "最大值: {point.high}<br/>"
                        + "Q2: {point.q3}<br/>"
                        + "中位数: {point.median}<br/>"
                        +  "Q1: {point.q1}<br/>"
                        + "最小值: {point.low}<br/>";

        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .headerFormat("<em>实验号码： {point.key}</em><br/>")
                .pointFormat(pointFormatStr)
                .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
                .backgroundColor("#000000")
                .borderColor("#000000")
                .style(new AAStyle()
                        .color("#1e90ff")
                        .fontSize(12.)
                );
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

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

    public static AAOptions customStackedAndGroupedColumnChartTooltip() {
        AAChartModel aaChartModel = new AAChartModel()
                .title("Total fruit consumption, grouped by gender")
                .subtitle("stacked and grouped")
                .yAxisTitle("Number of fruits")
                .chartType(AAChartType.Column)
                .legendEnabled(false)//隐藏图例(底部可点按的小圆点)
                .stacking(AAChartStackingType.Normal)
                .categories(new String[]{"Apples", "Oranges", "Pears","Grapes","Bananas",})
                .dataLabelsEnabled(true)
                .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("John")
                                        .data(new Object[]{5,3,4,7,2,})
                                        .stack("male")
                                ,
                                new AASeriesElement()
                                        .name("Joe")
                                        .data(new Object[]{3,4,4,2,5,})
                                        .stack("male")
                                ,
                                new AASeriesElement()
                                        .name("Jane")
                                        .data(new Object[]{2,5,6,2,1,})
                                        .stack("female")
                                ,
                                new AASeriesElement()
                                        .name("Janet")
                                        .data(new Object[]{3,0,4, 4,3,})
                                        .stack("female")
                                ,
                        }
                );

        /*Custom Tooltip Style --- 自定义图表浮动提示框样式及内容*/
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.plotOptions.series.states = new AAStates()
                .inactive(new AAInactive()
                        .enabled(false));

        aaOptions.tooltip
                .shared(false)
                .formatter("function () {\n" +
                        "                return '<b>'\n" +
                        "                + this.x\n" +
                        "                + '</b><br/>'\n" +
                        "                + this.series.name\n" +
                        "                + ': '\n" +
                        "                + this.y\n" +
                        "                + '<br/>'\n" +
                        "                + 'Total: '\n" +
                        "                + this.point.stackTotal;\n" +
                        "     }");

        return aaOptions;
    }

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

    public static AAOptions customArearangeChartTooltip() {
        AAChartModel aaChartModel = new AAChartModel()
                .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
                .subtitle("virtual data")
                .chartType(AAChartType.Arearange)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(new Object[]{
                        new AASeriesElement()
                                .name("Range")
                                .color("#1E90FF")
                                .type(AAChartType.Arearange)
                                .lineWidth(0.)
                                .fillOpacity(0.3)
                                .data(new Object[][] {
                                        /* 2014-06-01 */
                                        {140158080, 5.1, 20.6},
                                        {140166720, 6.6, 24.6},
                                        {140175360, 9.7, 22.2},
                                        {140184000, 9.6, 21.6},
                                        {140192640, 13.0,20.0},
                                        {140201280, 12.9,18.2},
                                        {140209920, 8.5, 23.2},
                                        {140218560, 9.2, 21.4},
                                        {140227200, 10.5,22.0},
                                        {140235840, 7.3, 23.4},
                                        {140244480, 12.1,18.2},
                                        {140253120, 11.1,13.3},
                                        {140261760, 10.0,20.7},
                                        {140270400, 5.8, 23.4},
                                        {140279040, 7.4, 20.1},
                                        {140287680, 10.3,21.9},
                                        {140296320, 7.8, 16.8},
                                        {140304960, 11.6,19.7},
                                        {140313600, 9.8, 16.0},
                                        {140322240, 10.7,14.4},
                                        {140330880, 9.0, 15.5},
                                        {140339520, 5.1, 13.3},
                                        {140348160, 10.0,19.3},
                                        {140356800, 5.2, 22.1},
                                        {140365440, 6.3, 21.3},
                                        {140374080, 5.5, 21.1},
                                        {140382720, 8.4, 19.7},
                                        {140391360, 7.1, 23.3},
                                        {140400000, 6.1, 20.8},
                                        {140408640, 8.4, 22.6},
                                })
                                .zIndex(0)
                        ,
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip
                .useHTML(true)
                .formatter(" function () {\n" +
                        "            let myPointOptions = this.points[0].point.options;\n" +
                        "            let xValue = myPointOptions.x;\n" +
                        "            let lowValue = myPointOptions.low;\n" +
                        "            let highValue = myPointOptions.high;\n" +
                        "            let titleStr = '🦁 this is my custom tooltip description text content <br>';\n" +
                        "            let xValueStr = '🐯 this is x value  : ' + xValue + '<br>';\n" +
                        "            let lowValueStr = ' 🐶 this is low value  : ' + lowValue + '<br>';\n" +
                        "            let highValueStr = '🐱 this is high value : ' + highValue + '<br>';\n" +
                        "            let tooltipDescStr =  titleStr + xValueStr + lowValueStr + highValueStr;\n" +
                        "            return tooltipDescStr;\n" +
                        "        }")
                .backgroundColor("#000000")
                .borderColor("#000000")
                .style(new AAStyle()
                        .color("#FFD700")
                        .fontSize(12)
                );

        return aaOptions;
    }

    public static AAOptions customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter() {
        String[] categories = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String categoryJSArrStr = javaScriptArrayStringWithJavaArray(categories);
        String tooltipFormatter =
                "function () {\n" +
                        "        return  'The value for <b>' + categoryJSArrStr[this.x] +\n" +
                        "        '</b> is <b>' + this.y + '</b> ' + \"℃\";\n" +
                        "        }";

        String xAxisLabelsFormatter =
                "function () {\n" +
                        "        return categoryJSArrStr[this.value];\n" +
                        "        }";

        tooltipFormatter = tooltipFormatter.replace("categoryJSArrStr",categoryJSArrStr);
        xAxisLabelsFormatter = xAxisLabelsFormatter.replace("categoryJSArrStr",categoryJSArrStr);



        AASeriesElement element1 = new AASeriesElement()
                .name("Tokyo")
                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6});
        AASeriesElement element2 = new AASeriesElement()
                .name("NewYork")
                .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5});
        AASeriesElement element3 = new AASeriesElement()
                .name("London")
                .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0});
        AASeriesElement element4 = new AASeriesElement()
                .name("Berlin")
                .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8});

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)
                .title("THE HEAT OF PROGRAMMING LANGUAGE")
                .subtitle("Virtual Data")
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0)
                .touchEventEnabled(true)
                .series(new AASeriesElement[]{element1, element2, element3, element4});

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.tooltip
                .useHTML(true)
                .formatter(tooltipFormatter);

        aaOptions.xAxis.labels
                .formatter(xAxisLabelsFormatter);

        return aaOptions;
    }

    @SuppressWarnings("NonAsciiCharacters")
    public static AAOptions customTooltipWhichDataSourceComeFromOutSideRatherThanSeries() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)//图表类型
                .yAxisLineWidth(1)//Y轴轴线线宽为0即是隐藏Y轴轴线
                .yAxisGridLineWidth(1)//y轴横向分割线宽度为1(为0即是隐藏分割线)
                .xAxisGridLineWidth(1)//x轴横向分割线宽度为1(为0即是隐藏分割线)
                .colorsTheme(new String[]{"#FFD700"/*纯金色*/})
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .yAxisMax(110)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("2017")
                                .data(new Object[]{55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, }),
                });


        Object[] 看近时长数组 = new Object[]{70, 69, 95, 14, 18, 21, 25, 26, 23, 18, 13, 96};
        Object[] 看中时长数组 = new Object[]{20, 80, 57, 11, 17, 22, 24, 24, 20, 14, 86, 25};
        Object[] 看远时长数组 = new Object[]{90, 60, 35, 84, 13, 17, 18, 17, 14, 90, 39, 10};

        Object[] 总时长数组 = new Object[12];

        for (int i = 0; i < 12; i++) {
            float 单个总时长 =
                      Float.valueOf((Integer)看近时长数组[i])
                    + Float.valueOf((Integer)看中时长数组[i])
                    + Float.valueOf((Integer)看远时长数组[i]);

            总时长数组[i] = 单个总时长;
        }

        Object[] 有效时长数组 = new Object[]{39, 42, 57, 85, 19, 15, 17, 16, 14, 13, 66, 48};

        Object[] 切换次数数组 = new Object[]{
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
        };


        Object[] 停止次数数组 = new Object[]{
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
        };

        Object[] 干预次数数组 = new Object[]{
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(),
        };

        String 总时长JS数组 = javaScriptArrayStringWithJavaArray(总时长数组);
        String 有效时长JS数组 = javaScriptArrayStringWithJavaArray(有效时长数组);
        String 看近时长JS数组 = javaScriptArrayStringWithJavaArray(看近时长数组);
        String 看中时长JS数组 = javaScriptArrayStringWithJavaArray(看中时长数组);
        String 看远时长JS数组 = javaScriptArrayStringWithJavaArray(看远时长数组);
        String 切换次数JS数组 = javaScriptArrayStringWithJavaArray(切换次数数组);
        String 停止次数JS数组 = javaScriptArrayStringWithJavaArray(停止次数数组);
        String 干预次数JS数组 = javaScriptArrayStringWithJavaArray(干预次数数组);

        String jsFormatterStr =
                "function () {\n" +
                        "        let 总时长数组 = (总时长JS数组);\n" +
                        "        let 有效时长数组 = (有效时长JS数组);\n" +
                        "        let 看近时长数组 = (看近时长JS数组);\n" +
                        "        let 看中时长数组 = (看中时长JS数组);\n" +
                        "        let 看远时长数组 = (看远时长JS数组);\n" +
                        "        let 切换次数数组 = (切换次数JS数组);\n" +
                        "        let 停止次数数组 = (停止次数JS数组);\n" +
                        "        let 干预次数数组 = (干预次数JS数组);\n" +
                        "        let 时间单位后缀 = \"min<br/>\";\n" +
                        "        let 频率单位后缀 = \"次<br/>\";\n" +
                        "        \n" +
                        "        let 单个总时长字符串 = \"总时长: &nbsp &nbsp\" + 总时长数组[this.point.index] + 时间单位后缀;\n" +
                        "        let 单个有效时长字符串 = \"有效时长: &nbsp\" + 有效时长数组[this.point.index] + 时间单位后缀;\n" +
                        "        let 单个看近时长字符串 = \"看近时长: &nbsp\" + 看近时长数组[this.point.index] + 时间单位后缀;\n" +
                        "        let 单个看中时长字符串 = \"看中时长: &nbsp\" + 看中时长数组[this.point.index] + 时间单位后缀;\n" +
                        "        let 单个看远时长字符串 = \"看远时长: &nbsp\" + 看远时长数组[this.point.index] + 时间单位后缀;\n" +
                        "        let 单个切换次数字符串 = \"切换次数: &nbsp\" + 切换次数数组[this.point.index] + 频率单位后缀;\n" +
                        "        let 单个停止次数字符串 = \"停止次数: &nbsp\" + 停止次数数组[this.point.index] + 频率单位后缀;\n" +
                        "        let 单个干预次数字符串 = \"干预次数: &nbsp\" + 干预次数数组[this.point.index] + 频率单位后缀;\n" +
                        "        \n" +
                        "        let wholeContentString =  单个总时长字符串 + 单个有效时长字符串 + 单个看近时长字符串 + 单个看中时长字符串 + 单个看远时长字符串 + 单个切换次数字符串 + 单个停止次数字符串 + 单个干预次数字符串;\n" +
                        "        \n" +
                        "        return wholeContentString;\n" +
                        "        }";
        jsFormatterStr = jsFormatterStr.replace("(总时长JS数组)",总时长JS数组);
        jsFormatterStr = jsFormatterStr.replace("(有效时长JS数组)",有效时长JS数组);
        jsFormatterStr = jsFormatterStr.replace("(看近时长JS数组)",看近时长JS数组);
        jsFormatterStr = jsFormatterStr.replace("(看中时长JS数组)",看中时长JS数组);
        jsFormatterStr = jsFormatterStr.replace("(看远时长JS数组)",看远时长JS数组);
        jsFormatterStr = jsFormatterStr.replace("(切换次数JS数组)",切换次数JS数组);
        jsFormatterStr = jsFormatterStr.replace("(停止次数JS数组)",停止次数JS数组);
        jsFormatterStr = jsFormatterStr.replace("(干预次数JS数组)",干预次数JS数组);

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.tooltip
                //‼️以 this.point.index 这种方式获取选中的点的索引必须设置 tooltip 的 shared 为 false
                //‼️共享时是 this.points (由多个 point 组成的 points 数组)
                //‼️非共享时是 this.point 单个 point 对象
                .shared(false)
                .useHTML(true)
                .formatter(jsFormatterStr)
                .backgroundColor("#000000")//黑色背景色
                .borderColor("#FFD700")//边缘颜色纯金色
                .style(new AAStyle()
                        .color("#FFD700")//文字颜色纯金色
                        .fontSize(12)
                );

        return aaOptions;
    }




    private static int randomNumber() {
        int max = 38, min = 1;
        return (int) (Math.random() * (max - min) + min);
    }

    private static String javaScriptArrayStringWithJavaArray(Object[] javaArray) {
        StringBuilder originalJsArrStr = new StringBuilder();
        for (Object element : javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',");
        }

        return "[" + originalJsArrStr + "]";
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

        String xAxisLabelsFormatter = String.format("return %s", categoryJSArrStr);

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图表类型
                .title("健康体检表")//图表主标题
                .colorsTheme(new String[]{"#fe117c","#ffc069",})//设置主体颜色数组
                .yAxisLineWidth(0)
//                .yAxisGridLineStyle([AALineStyle styleWithWidth:0})
//    .yAxisTickPositions([0, 5, 10, 15, 20, 25, 30, 35})
    .markerRadius(5)
//                .markerSymbol(AAChartSymbolType.Circle)
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
//                .gridLineInterpolation(AAChartYAxisGridLineInterpolationType.Polygon)//设置蜘蛛网🕸图表的网线为多边形
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
//        String unitJSArrStr = {unitArr aa_toJSArray];
     String unitJSArrStr = javaScriptArrayStringWithJavaArray(unitArr);
//        String dataLabelsFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            return this.y + %[this.point.index];  //单组 serie 图表, 获取选中的点的索引是 this.point.index ,多组并且共享提示框,则是this.points[0].index
//        })),unitJSArrStr];
        String dataLabelsFormatter = "";

        AADataLabels aaDatalabels = aaOptions.plotOptions.series.dataLabels;
        aaDatalabels
//                .style(AAStyleColorSizeWeightOutline(AAColor.redColor, 10, AAChartFontWeightType.Bold, "1px 1px contrast"))
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
AAColor.rgbaColor(201, 36,  39, 1.f),
AAColor.rgbaColor(201, 36,  39, 1.f),
AAColor.rgbaColor(0,   82,  180, 1.f),
AAColor.rgbaColor(0,   0,   0, 1.f),
AAColor.rgbaColor(240, 240, 240, 1.f),
AAColor.rgbaColor(255, 217, 68, 1.f),
AAColor.rgbaColor(0,   82,  180, 1.f),
AAColor.rgbaColor(215, 0,   38, 1.f)
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
//        String xLabelsFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            let imageFlag = %[this.pos];
//            let imageLink = "
//            ";
//            return imageLink;
//        })),imageLinkFlagJSArrStr];
        String xLabelsFormatter = "";

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

        aaOptions.tooltip
                .shared(false)
                .useHTML(true)
                .formatter("tooltipFormatter");


        return aaOptions;
}

//https://bbs.hcharts.cn/article-109-1.html
//图表自带的图例点击事件是：
//点击某个显示/隐藏的图例，该图例对应的serie就隐藏/显示。
//个人觉得不合理，正常来说，有多条折线(或其他类型的图表)，点击某个图例是想只看该图例对应的数据；
//于是修改了图例点击事件。
//
//实现的效果是(以折线图为例)：
//1. 当某条折线隐藏时，点击该折线的图例 --> 该折线显示；
//2. 当全部折线都显示时，点击某个图例 --> 该图例对应的折线显示，其他折线均隐藏；
//3. 当只有一条折线显示时，点击该折线的图例 --> 全部折线均显示；
//4. 其他情况，按默认处理：
//显示 --> 隐藏；
//隐藏 --> 显示；
//Customized legengItemClick Event online: http://code.hcharts.cn/rencht/hhhhLv/share
        public static AAOptions customLegendItemClickEvent() {
            AAChartModel aaChartModel = new AAChartModel()
                    .chartType(AAChartType.Column)
                    .stacking(AAChartStackingType.Normal)
                    .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"})//设置主题颜色数组
                    .markerRadius(0)
                    .series(new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("2017")
                                    .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}),
                            new AASeriesElement()
                                    .name("2018")
                                    .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5}),
                            new AASeriesElement()
                                    .name("2019")
                                    .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0}),
                            new AASeriesElement()
                                    .name("2020")
                                    .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8}),
                    });


            AAOptions aaOptions = aaChartModel.aa_toAAOptions();

            aaOptions.legend
                    .enabled(true)
                    .align(AAChartAlignType.Right)//设置图例位于水平方向上的右侧
                    .layout(AAChartLayoutType.Vertical)//设置图例排列方式为垂直排布
                    .verticalAlign(AAChartVerticalAlignType.Top);//设置图例位于竖直方向上的顶部


            //自定义图例点击事件
            aaOptions.plotOptions.series.events = new AASeriesEvents()
                    .legendItemClick("function(event) {\n" +
                            "        function getVisibleMode(series, serieName) {\n" +
                            "            var allVisible = true;\n" +
                            "            var allHidden = true;\n" +
                            "            for (var i = 0; i < series.length; i++) {\n" +
                            "                if (series[i].name == serieName)\n" +
                            "                    continue;\n" +
                            "                allVisible &= series[i].visible;\n" +
                            "                allHidden &= (!series[i].visible);\n" +
                            "            }\n" +
                            "            if (allVisible && !allHidden)\n" +
                            "                return 'all-visible';\n" +
                            "            if (allHidden && !allVisible)\n" +
                            "                return 'all-hidden';\n" +
                            "            return 'other-cases';\n" +
                            "        }\n" +
                            "        \n" +
                            "        var series = this.chart.series;\n" +
                            "        var mode = getVisibleMode(series, this.name);\n" +
                            "        var enableDefault = false;\n" +
                            "        if (!this.visible) {\n" +
                            "            enableDefault = true;\n" +
                            "        }\n" +
                            "        else if (mode == 'all-visible') {\n" +
                            "            var seriesLength = series.length;\n" +
                            "            for (var i = 0; i < seriesLength; i++) {\n" +
                            "                var serie = series[i];\n" +
                            "                serie.hide();\n" +
                            "            }\n" +
                            "            this.show();\n" +
                            "        }\n" +
                            "        else if (mode == 'all-hidden') {\n" +
                            "            var seriesLength = series.length;\n" +
                            "            for (var i = 0; i < seriesLength; i++) {\n" +
                            "                var serie = series[i];\n" +
                            "                serie.show();\n" +
                            "            }\n" +
                            "        }\n" +
                            "        else {\n" +
                            "            enableDefault = true;\n" +
                            "        }\n" +
                            "        return enableDefault;\n" +
                            "    }");

            return aaOptions;
        }

    //https://github.com/AAChartModel/AAChartKit/issues/966
    public static AAOptions customTooltipPostionerFunction() {
        String[] categoriesArr = {
                "孤岛危机",
                "使命召唤",
                "荣誉勋章",
                "狙击精英",
                "神秘海域",
                "最后生还者",
                "巫师3狂猎",
                "对马之魂",
                "蝙蝠侠阿甘骑士",
                "地狱边境",
                "闪客",
                "忍者之印"
        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .categories(categoriesArr)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("单机大作")
                                .color(AAColor.Red)
                                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6})
                });


        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

//        aaOptions.tooltip
//                .positioner(AAJSFunc(function (labelWidth, labelHeight, point) {
//            let position = {};
//            position["x"] = point.plotX;
//            position["y"] = 20;
//            return position;
//        }));

        return aaOptions;
}

        public static AAOptions fixedTooltipPositionByCustomPositionerFunction() {
            AAOptions aaOptions = customTooltipPostionerFunction();
//            aaOptions.tooltip
//                    .positioner(AAJSFunc(function () {
//                let position = {};
//                position["x"] = 50;
//                position["y"] = 50;
//                return position;
//            }));

            return aaOptions;
}

//https://github.com/AAChartModel/AAChartKit/issues/1033
            public static AAOptions customPlotAreaOutsideComlicatedTooltipStyle() {
                String[] categoriesArr = {
                        "11 月 01 日",
                        "11 月 02 日",
                        "11 月 03 日",
                        "11 月 04 日",
                        "11 月 05 日",
                        "11 月 06 日",
                        "11 月 07 日",
                        "11 月 08 日",
                        "11 月 09 日",

                        "11 月 10 日",
                        "11 月 11 日",
                        "11 月 12 日",
                        "11 月 13 日",
                        "11 月 14 日",
                        "11 月 15 日",
                        "11 月 16 日",
                        "11 月 17 日",
                        "11 月 18 日",
                        "11 月 19 日",

                        "11 月 20 日",
                        "11 月 21 日",
                        "11 月 22 日",
                        "11 月 23 日",
                        "11 月 24 日",
                        "11 月 25 日",
                        "11 月 26 日",
                        "11 月 27 日",
                        "11 月 28 日",
                        "11 月 29 日",
                        "11 月 30 日",

                        "12 月 01 日",
                        "12 月 02 日",
                        "12 月 03 日",
                        "12 月 04 日",
                        "12 月 05 日",
                        "12 月 06 日",
                        "12 月 07 日",
                        "12 月 08 日",
                        "12 月 09 日",

                        "12 月 10 日",
                        "12 月 11 日",
                        "12 月 12 日",
                        "12 月 13 日",
                        "12 月 14 日",
                        "12 月 15 日",
                        "12 月 16 日",
                        "12 月 17 日",
                        "12 月 18 日",
                        "12 月 19 日",

                        "12 月 20 日",
                        "12 月 21 日",
                        "12 月 22 日",
                        "12 月 23 日",
                        "12 月 24 日",
                        "12 月 25 日",
                        "12 月 26 日",
                        "12 月 27 日",
                        "12 月 28 日",
                        "12 月 29 日",
                        "12 月 30 日",
                        "12 月 31 日",
                };

                AAChartModel aaChartModel = new AAChartModel()
                        .chartType(AAChartType.Column)
                        .categories(categoriesArr)
                        .series(new AASeriesElement[]{
                                new AASeriesElement()
                                        .name("个人徒步数据统计")
                                        .color(AAColor.rgbaColor(235, 88, 40, 1.0f))
                                        .borderRadiusTopLeft("50%")
                                        .borderRadiusTopRight("50%")
                                        .data(new Object[]{
                                        1300.988, 900.699,1000.089, 1100.965, 1000.534, 1400.523,
                                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                                        1300.988, 900.699,1000.089, 1100.965, 1000.534, 1400.523,
                                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                                        1300.988, 900.699,1000.089, 1100.965, 1000.534, 1400.523,
                                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                                        1300.988, 900.699,1000.089, 1100.965, 1000.534, 1400.523,
                                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                                        1300.988, 900.699,1000.089, 1100.965, 1000.534, 1400.523,
                                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                                })
                        });


                AAOptions aaOptions = aaChartModel.aa_toAAOptions();

                aaOptions.xAxis
                        .crosshair(new AACrosshair()
                                .color(AAColor.rgbaColor(209, 209, 209, 1.0f))
                                .dashStyle(AAChartLineDashStyleType.LongDash)
                                .width(3));


//                aaOptions.yAxis
//                        .top("30%")//https://api.highcharts.com/highcharts/yAxis.top
//                        .height("70%")//https://api.highcharts.com/highcharts/yAxis.height


//                CGFloat screenWidth = self.view.frame.size.width;
//
//                String positionerStr ={String stringWithFormat:AAJSFunc(function (labelWidth, labelHeight, point) {
//                    let xPosition = point.plotX;
//                    let maxXPosition = % - 268;
//                    if (xPosition >= maxXPosition) {
//                        xPosition = maxXPosition
//                    }
//                    let position = {};
//                    position["x"] = xPosition;
//                    position["y"] = 50;
//                    return position;
//                }), (screenWidth)];

                aaOptions.tooltip
                        .useHTML(true)
                        .headerFormat("总计 ")
                                        .pointFormat("{point.y}  步")
                                                        .footerFormat("2020 年 {point.x} ")
                                                        .valueDecimals(2)//设置取值精确到小数点后几位
                                                        .backgroundColor(AAColor.rgbaColor(242, 242, 242, 1.0f))
                                                        .borderWidth(0)
//                                                        .shape("square")
                                                        .style(AAStyle.style(AAColor.rgbaColor(132, 132, 132, 1.0f), 28))
                                                        .positioner("positionerStr");

                return aaOptions;
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

//                    AAPoint point = AAPoint.new
//                            .events(AAPointEvents.new
//                                    .click(AAJSFunc(function () {
//                        if (this.selected == true) {
//                            this.selected = false;
//                        }
//                        return;
//                    })));
//
//                    aaOptions.plotOptions.series
//                            .point("point");

                    return aaOptions;
                }

//https://github.com/AAChartModel/AAChartKit/issues/970
//通过自定义 div 的 css 样式来自定义复杂效果的 tooltip 浮动提示框
                public static AAOptions customAreasplineChartTooltipStyleByDivWithCSS() {
                    AAChartModel aaChartModel = new AAChartModel()
                            .chartType(AAChartType.Areaspline)//图表类型
                            .colorsTheme(new String[]{"#FFD700"/*(纯金色)*/,"#ffc069",})//设置主体颜色数组
                            .markerSymbol(AAChartSymbolType.Circle)
                            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                            .xAxisTickInterval(3)//x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容)
//                            .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
    .stacking(AAChartStackingType.Normal)
                        .categories(new String[]{
                        "10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07", "10-08", "10-09", "10-10", "10-11",
                        "10-12", "10-13", "10-14", "10-15", "10-16", "10-17", "10-18", "10-19", "10-20", "10-21", "10-22",
                        "10-23", "10-24", "10-25", "10-26", "10-27", "10-28", "10-29", "10-30", "10-31", "11-01", "11-02",
                        "11-03", "11-04", "11-05", "11-06", "11-07", "11-08", "11-09", "11-10", "11-11", "11-12", "11-13",
                        "11-14", "11-15", "11-16", "11-17", "11-18", "11-19", "11-20", "11-21", "11-22", "11-23", "11-24",
                        "11-25", "11-26", "11-27", "11-28", "11-29", "11-30", "12-01", "12-02", "12-03", "12-04", "12-05",
                        "12-06", "12-07", "12-08", "12-09", "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", "12-16",
                        "12-17", "12-18", "12-19", "12-20", "12-21", "12-22", "12-23", "12-24", "12-25", "12-26", "12-27",
                        "12-28", "12-29", "12-30"
    })
    .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .lineWidth(1.5)
                                .fillOpacity(0.4)
                                .name("黄金上涨")
                                .data(new Object[]{
                                1.51, 6.70, 0.94, 1.44, 1.60, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                                18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                                3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                                2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                                2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                                5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48
                        }),
                        new AASeriesElement()
                                .lineWidth(1.5)
                                .fillOpacity(0.4)
                                .name("房价下跌")
                                .data(new Object[]{
                                1.51, 6.70, 0.94, 1.44, 1.60, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                                18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                                3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                                2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                                2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                                5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48
                        }),
                });


                //https://zhidao.baidu.com/question/301691908.html
                //https://jshare.com.cn/highcharts/hhhhGc
                AAOptions aaOptions = aaChartModel.aa_toAAOptions();
                aaOptions.tooltip
                        .shared(true)
                        .useHTML(true)
                        .padding(0)
                        .borderWidth(0)
//                        .formatter(AAJSFunc(function () {
//                    var box1Text = "  2021-" + this.x + this.points[0].series.name + this.y;
//                    var box2Text = "  2021-" + this.x + this.points[1].series.name + this.y;
//
//                    return '\
//                    '
//                            +
//                            '' + box1Text + ''
//                            +
//                            '' + box2Text + ''
//                            +
//                            '';
//                }))
    ;

                //禁用图例点击事件
                aaOptions.plotOptions.series.events = new AASeriesEvents()
//                        .legendItemClick(AAJSFunc(function() {
//                    return false;
//                })
//    )
    ;

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
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color("DodgerBlue"))
//        .formatter(AAJSFunc(function () {
//        let yValue = this.value;
//        if (yValue >= 200) {
//        return "极佳";
//        } else if (yValue >= 150 && yValue < 200) {
//        return "非常棒";
//        } else if (yValue >= 100 && yValue < 150) {
//        return "相当棒";
//        } else if (yValue >= 50 && yValue < 100) {
//        return "还不错";
//        } else {
//        return "一般";
//        }
//        })))
        .gridLineWidth(0)
        .title(new AATitle()
        .text("中文")
        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
        .visible(true)
        .lineWidth(1)
        .tickPositions(new Object[]{0, 50, 100, 150, 200})
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color(AAColor.Red))
//        .formatter(AAJSFunc(function () {
//        let yValue = this.value;
//        if (yValue >= 200) {
//        return "Awesome";
//        } else if (yValue >= 150 && yValue < 200) {
//        return "Great";
//        } else if (yValue >= 100 && yValue < 150) {
//        return "Very Good";
//        } else if (yValue >= 50 && yValue < 100) {
//        return "Not Bad";
//        } else {
//        return "Just So So";
//        }
//        })))
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
//        .yAxis((id)[yAxis1,yAxis2})
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
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color("DodgerBlue"))
//        .formatter(AAJSFunc(
//        function () {
//        var yValue = this.value;
//        var formattedYValue = (yValue / 1000).toFixed(3) + '千';
//        return formattedYValue;
//        }
//        )))
        .gridLineWidth(0)
        .title(new AATitle()
        .text("以「千」为单位")
        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
        .visible(true)
        .lineWidth(1)
        .tickPositions(new Object[]{0, 50, 100, 150, 200})
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color(AAColor.Red))
//        .formatter(AAJSFunc(
//        function () {
//        var yValue = this.value;
//        var formattedYValue = (yValue / 10000).toFixed(4) + '万';
//        return formattedYValue;
//        }
//        )))
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
//        .yAxis((id)[yAxis1,yAxis2})
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
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color("DodgerBlue"))
//        .formatter(AAJSFunc(
//        function () {
//        var yValue = this.value;
//        var unitStr = "千";
//        if (yValue == 0) {
//        unitStr = "";
//        }
//        var formattedYValue = (yValue / 1000).toFixed(3) + unitStr;
//        return formattedYValue;
//        }
//        )))//Y轴文字数值为 0 的时候, 不显示单位
        .gridLineWidth(0)
        .title(new AATitle()
        .text("以「千」为单位")
        .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)));

        AAYAxis yAxis2 = new AAYAxis()
        .visible(true)
        .lineWidth(1)
        .tickPositions(new Object[]{0, 50, 100, 150, 200})
//        .labels(new AALabels()
//        .enabled(true)
//        .style(new AAStyle()
//        .color(AAColor.Red))
//        .formatter(AAJSFunc(
//        function () {
//        var yValue = this.value;
//        var unitStr = "万";
//        if (yValue == 0) {
//        unitStr = "";
//        }
//        var formattedYValue = (yValue / 10000).toFixed(4) + unitStr;
//        return formattedYValue;
//        }
//        )))//Y轴文字数值为 0 的时候, 不显示单位
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
//        .chart(aaChart)
//        .title(aaTitle)
        .plotOptions(aaPlotOptions)
//        .xAxis(aaXAxis)
//        .yAxis((id)[yAxis1,yAxis2})
        .tooltip(aaTooltip)
        .series(seriesArr);

        return aaOptions;
        }


//https://github.com/AAChartModel/AAChartKit/issues/1042
public static AAOptions makePieChartShow0Data() {
        return new AAOptions()
//        .title((id)NSNull.null)
        .chart(new AAChart()
        .type(AAChartType.Pie))
        .series(new AASeriesElement[]{
        new AASeriesElement()
        .name("ZeroDataPie")
        .data(new Object[]{
//        {"y":1, "isZero":true, "name": "One"  },
//        {"y":1, "isZero":true, "name": "Two"  },
//        {"y":1, "isZero":true, "name": "Three"}
        })
//        .tooltip(new AATooltip()
//        .shared(false)
//        .pointFormatter(AAJSFunc(
//        function() {
//        return " ◉ "
//        + this.series.name
//        + ": "
//        + (this.options.isZero ? 0 : this.y)
//        + "
//        ";
//        })))
        });

        };

//https://github.com/AAChartModel/AAChartKit/issues/1217
public static AAOptions customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters() {
        AAChartModel aaChartModel = new AAChartModel()
        .chartType(AAChartType.Bar)//图表类型
        .title("春江花月夜")//图表主标题
        .subtitle("张若虚")//图表副标题
//        .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
        .xAxisReversed(true)
//        .xAxisLabelsStyle(AAStyleColor(AAColor.blackColor))
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
//        aaOptions.xAxis.labels
//        .formatter(AAJSFunc(function () {
//        let xAxisCategory = this.value;
//        if (xAxisCategory.length > 4) {
//        return xAxisCategory.substr(0, 4);
//        } else {
//        return xAxisCategory;
//        }
//        }))
    ;


        return aaOptions;
        }

//https://github.com/AAChartModel/AAChartKit-Swift/issues/345
public static AAOptions setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart() {
        AAChartModel aaChartModel = new AAChartModel()
        .chartType(AAChartType.Areaspline)//图表类型
        .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
        .stacking(AAChartStackingType.Normal)
        .yAxisVisible(false)
        .markerRadius(0)
        .series(new AASeriesElement[]{
        new AASeriesElement()
        .name("Tokyo Hot")
        .lineWidth(5.0)
        .fillOpacity(0.4)
        .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36}),
        new AASeriesElement()
        .name("Berlin Hot")
        .lineWidth(5.0)
        .fillOpacity(0.4)
        .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67}),
        new AASeriesElement()
        .name("London Hot")
        .lineWidth(5.0)
        .fillOpacity(0.4)
        .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64}),
        new AASeriesElement()
        .name("NewYork Hot")
        .lineWidth(5.0)
        .fillOpacity(0.4)
        .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53}),
        });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.tooltip
        .style(AAStyle.style(AAColor.White))
        .backgroundColor("#050505")
        .borderColor("#050505");

        aaOptions.xAxis
        .crosshair(new AACrosshair()
        .color(AAColor.DarkGray)
        .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
        .width(2));

        //默认选中的位置索引
        int defaultSelectedIndex = 5;

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
//        aaOptions.chart
//        .events(AAChartEvents.new
//        .load([String stringWithFormat:AAJSFunc(function() {
//        let points ={];
//        let chart = this;
//        let series = chart.series;
//        let length = series.length;
//
//        for (let i = 0; i < length; i++) {
//        let pointElement = series[i].data[%ld];
//        points.push(pointElement);
//        }
//        chart.xAxis[0].drawCrosshair(null, points[0});
//        chart.tooltip.refresh(points);
//        }), defaultSelectedIndex}));


        return aaOptions;
        }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/365
//https://api.highcharts.com/highcharts/tooltip.formatter
//Callback function to format the text of the tooltip from scratch. In case of single or shared tooltips,
//a string should be returned. In case of split tooltips, it should return an array where the first item
//is the header, and subsequent items are mapped to the points. Return `false` to disable tooltip for a
//specific point on series.
    public static AAOptions customColumnChartBorderStyleAndStatesHoverColor() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(new String[]{AAColor.DarkGray, AAColor.LightGray})//Colors theme
                .categories(new String[]{
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
    })
            .series(new AASeriesElement[]{
        new AASeriesElement()
                .name("Berlin Hot")
                .borderColor(AAColor.White)
                .borderWidth(3)
                .borderRadius(10)
                .states(new AAStates()
                        .hover(new AAHover()
                                .color(AAColor.Red)))
                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}),

                new AASeriesElement()
                        .name("Beijing Hot")
                        .borderColor(AAColor.White)
                        .borderWidth(3)
                        .borderRadius(10)
                        .states(new AAStates()
                                .hover(new AAHover()
                                        .color("dodgerblue")))// Dodgerblue／道奇藍／#1e90ff十六进制颜色代码
                        .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5}),
    });

    AAOptions aaOptions = aaChartModel.aa_toAAOptions();
//    aaOptions.tooltip
//            .formatter(AAJSFunc(function () {
//        return false;
//    }));

    return aaOptions;
}

//    public static AAOptions generalDrawingChart() {
//        return new AAOptions()
//                .chart(new AAChart()
//                        .backgroundColor(AAColor.White)
//                        .events(AAChartEvents.new
//
//        }

    public static AAOptions advancedTimeLineChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .backgroundColor(AAColor.Red))
//
                .xAxis(new AAXAxis()
                        .type(AAChartAxisType.Datetime)
                        .minTickInterval(315360000)
                        .labels(new AALabels()
                                .align(AAChartAlignType.Left))
                        .plotBands(new AAPlotBandsElement[]{
                                new AAPlotBandsElement()
                                        .from(1259280000)
                                        .to(1291161600)
                                        .color("#EFFFFF")
                                        .label(new AALabel()
                                        .text("办事处:Torstein的地下室")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(180)),
                                new AAPlotBandsElement()
                                        .from(1291161600)
                                        .to(1380585600)
                                        .color("#FFFFEF")
                                        .label(new AALabel()
                                        .text("办事处:Tomtebu")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(30)),
                                new AAPlotBandsElement()
                                        .from(1380585600)
                                        .to(1417046400)
                                        .color("#FFEFFF")
                                        .label(new AALabel()
                                        .text("办事处:VikØrsta")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(30))
                        }))
                .title(new AATitle()
                        .text("Highsoft 公司发展历程"))
                .tooltip(new AATooltip()
                        .style(new AAStyle()
                                .width(250)))
                .yAxisArray(new AAYAxis[]{
                        new AAYAxis()
                                .max(100)
                                .labels(new AALabels()
                                        .enabled(false))
                                .title(new AATitle()
                                        .text(""))
                                .gridLineColor("rgba(0, 0, 0, 0.07)"),
                        new AAYAxis()
                                .allowDecimals(false)
                                .max(15)
                                .labels(new AALabels()
                                        .style(new AAStyle()
                                                .color("#90ed7d")))
                                .title(new AATitle()
                                        .text("雇员")
                                        .style(new AAStyle()
                                                .color("#90ed7d")))
                                .opposite(true)
                                .gridLineWidth(0)
                })
                .plotOptions(new AAPlotOptions()
                                .series(new AASeries()
                                                .marker(new AAMarker()
                                                        .enabled(false)
                                                        .symbol(AAChartSymbolType.Circle)
                                                        .radius(2))
//                .fillOpacity(0.5)
                                )
//            .flags(AAFlags.new
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %e, %Y")))
                )
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type(AAChartType.Line)
//                .id("google-trends")
                                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                                .name("Google search for highcharts")
                                .data(new AADataElement[]{
                                new AADataElement().x(1258322400)/* November 2009 */.y(0),
        new AADataElement().x(1260961200).y(5),
                new AADataElement().x(1263639600).y(7),
                new AADataElement().x(1266188400).y(5),
                new AADataElement().x(1268740800).y(6),
                new AADataElement().x(1271368800).y(8),
                new AADataElement().x(1274004000).y(11),
                new AADataElement().x(1276639200).y(9),
                new AADataElement().x(1279274400).y(12),
                new AADataElement().x(1281952800).y(13),
                new AADataElement().x(1284588000).y(17),
                new AADataElement().x(1287223200).y(17),
                new AADataElement().x(1289858400).y(18),
                new AADataElement().x(1292497200).y(20),
                new AADataElement().x(1295175600).y(20),
                new AADataElement().x(1297724400).y(27),
                new AADataElement().x(1300276800).y(32),
                new AADataElement().x(1302904800).y(29),
                new AADataElement().x(1305540000).y(34),
                new AADataElement().x(1308175200).y(34),
                new AADataElement().x(1310810400).y(36),
                new AADataElement().x(1313488800).y(43),
                new AADataElement().x(1316124000).y(44),
                new AADataElement().x(1318759200).y(42),
                new AADataElement().x(1321394400).y(47),
                new AADataElement().x(1324033200).y(46),
                new AADataElement().x(1326711600).y(50),
                new AADataElement().x(1329303600).y(57),
                new AADataElement().x(1331899200).y(54),
                new AADataElement().x(1334527200).y(59),
                new AADataElement().x(1337162400).y(62),
                new AADataElement().x(1339797600).y(66),
                new AADataElement().x(1342432800).y(61),
                new AADataElement().x(1345111200).y(68),
                new AADataElement().x(1347746400).y(67),
                new AADataElement().x(1350381600).y(73),
                new AADataElement().x(1353016800).y(63),
                new AADataElement().x(1355655600).y(54),
                new AADataElement().x(1358334000).y(67),
                new AADataElement().x(1360882800).y(74),
                new AADataElement().x(1363435200).y(81),
                new AADataElement().x(1366063200).y(89),
                new AADataElement().x(1368698400).y(83),
                new AADataElement().x(1371333600).y(88),
                new AADataElement().x(1373968800).y(86),
                new AADataElement().x(1376647200).y(81),
                new AADataElement().x(1379282400).y(83),
                new AADataElement().x(1381917600).y(95),
                new AADataElement().x(1384552800).y(86),
                new AADataElement().x(1387191600).y(83),
                new AADataElement().x(1389870000).y(89),
                new AADataElement().x(1392418800).y(90),
                new AADataElement().x(1394971200).y(94),
                new AADataElement().x(1397599200).y(00),
                new AADataElement().x(1400234400).y(00),
                new AADataElement().x(1402869600).y(99),
                new AADataElement().x(1405504800).y(99),
                new AADataElement().x(1408183200).y(93),
                new AADataElement().x(1410818400).y(97),
                new AADataElement().x(1413453600).y(9),
                        })
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
//                    .valueSuffix(" % of best month"))
                        ,
                        new AASeriesElement()
                                .name("收入")
//                .id("revenue")
                                .type(AAChartType.Area)
                                .data(new AADataElement[]{
        new AADataElement().x(1257033600).y( 2),
        new AADataElement().x(1259625600).y( 3),
        new AADataElement().x(1262304000).y( 2),
        new AADataElement().x(1264982400).y( 3),
        new AADataElement().x(1267401600).y( 4),
        new AADataElement().x(1270080000).y( 4),
        new AADataElement().x(1272672000).y( 4),
        new AADataElement().x(1275350400).y( 4),
        new AADataElement().x(1277942400).y( 5),
        new AADataElement().x(1280620800).y( 7),
        new AADataElement().x(1283299200).y( 6),
        new AADataElement().x(1285891200).y( 9),
        new AADataElement().x(1288569600).y(10),
        new AADataElement().x(1291161600).y( 8),
        new AADataElement().x(1293840000).y(10),
        new AADataElement().x(1296518400).y(13),
        new AADataElement().x(1298937600).y(15),
        new AADataElement().x(1301616000).y(14),
        new AADataElement().x(1304208000).y(15),
        new AADataElement().x(1306886400).y(16),
        new AADataElement().x(1309478400).y(22),
        new AADataElement().x(1312156800).y(19),
        new AADataElement().x(1314835200).y(20),
        new AADataElement().x(1317427200).y(32),
        new AADataElement().x(1320105600).y(34),
        new AADataElement().x(1322697600).y(36),
        new AADataElement().x(1325376000).y(34),
        new AADataElement().x(1328054400).y(40),
        new AADataElement().x(1330560000).y(37),
        new AADataElement().x(1333238400).y(35),
        new AADataElement().x(1335830400).y(40),
        new AADataElement().x(1338508800).y(38),
        new AADataElement().x(1341100800).y(39),
        new AADataElement().x(1343779200).y(43),
        new AADataElement().x(1346457600).y(49),
        new AADataElement().x(1349049600).y(43),
        new AADataElement().x(1351728000).y(54),
        new AADataElement().x(1354320000).y(44),
        new AADataElement().x(1356998400).y(43),
        new AADataElement().x(1359676800).y(43),
        new AADataElement().x(1362096000).y(52),
        new AADataElement().x(1364774400).y(52),
        new AADataElement().x(1367366400).y(56),
        new AADataElement().x(1370044800).y(62),
        new AADataElement().x(1372636800).y(66),
        new AADataElement().x(1375315200).y(62),
        new AADataElement().x(1377993600).y(63),
        new AADataElement().x(1380585600).y(60),
        new AADataElement().x(1383264000).y(60),
        new AADataElement().x(1385856000).y(58),
        new AADataElement().x(1388534400).y(65),
        new AADataElement().x(1391212800).y(52),
        new AADataElement().x(1393632000).y(72),
        new AADataElement().x(1396310400).y(57),
        new AADataElement().x(1398902400).y(70),
        new AADataElement().x(1401580800).y(63),
        new AADataElement().x(1404172800).y(65),
        new AADataElement().x(1406851200).y(65),
        new AADataElement().x(1409529600).y(89),
        new AADataElement().x(1412121600).y(00)
                                })
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
//                    .valueSuffix(" % of best month")
//            )
                        ,
                        new AASeriesElement()
                                .yAxis(1)
                                .name("Highsoft 员工")
//                .id("employees")
                                .type(AAChartType.Area)
                                .step("left")
                                .tooltip(new AATooltip()
                                        .headerFormat("{point.x:%B %e, %Y}")
                                        .pointFormat("{point.name}{point.y}")
                                        .valueSuffix(" employees"))
                                .data(new Object[]{
        new AADataElement().x(AADateUTC(2009, 10,  1)).y(1).name("Torstein 一个人工作"),
        new AADataElement().x(AADateUTC(2010, 10, 20)).y(2).name("Grethe 加入"),
        new AADataElement().x(AADateUTC(2011, 3,   1)).y(3).name("Erik 加入"),
        new AADataElement().x(AADateUTC(2011, 7,   1)).y(4).name("Gert 加入"),
        new AADataElement().x(AADateUTC(2011, 7,  15)).y(5).name("Hilde 加入"),
        new AADataElement().x(AADateUTC(2012, 5,   1)).y(6).name("Guro 加入"),
        new AADataElement().x(AADateUTC(2012, 8,   1)).y(5).name("Erik left"),
        new AADataElement().x(AADateUTC(2012, 8,  15)).y(6).name("Anne Jorunn"),
        new AADataElement().x(AADateUTC(2013, 0,   1)).y(7).name("Hilde T"),
        new AADataElement().x(AADateUTC(2013, 7,   1)).y(8).name("Jon Arild"),
        new AADataElement().x(AADateUTC(2013, 7,  20)).y(9).name("Øystein 加入"),
        new AADataElement().x(AADateUTC(2013, 9,   1)).y(1).name("Stephane 加入"),
        new AADataElement().x(AADateUTC(2014, 9,   1)).y(1).name("Anita 加入"),
        new AADataElement().x(AADateUTC(2014, 10, 27)).y(1).name(""),
                })});

    }

//   get UTC number from date
    private static long AADateUTC(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            date = sdf.parse(year + "-" + month + "-" + day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }


    }
