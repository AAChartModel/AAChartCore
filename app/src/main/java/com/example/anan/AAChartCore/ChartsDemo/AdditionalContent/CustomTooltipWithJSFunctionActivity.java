package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartFontWeightType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
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
import com.example.anan.AAChartCore.R;

import java.util.Map;

public class CustomTooltipWithJSFunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction);
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        AAOptions aaOptions = configureTheChartOptions(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);

    }

    AAOptions configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "formatterFunction1": return customAreaChartTooltipStyleWithFormatterFunction1();
            case "formatterFunction2": return customAreaChartTooltipStyleWithFormatterFunction2();
            case "formatterFunction3": return customAreaChartTooltipStyleWithFormatterFunction3();
            case "formatterFunction4": return customAreaChartTooltipStyleWithFormatterFunction4();
            case "formatterFunction5": return customBoxplotTooltipContent();
            case "customYAxisLabels": return customYAxisLabels();
            case "customYAxisLabels2": return customYAxisLabels2();
            case "customStackedAndGroupedColumnChartTooltip": return customStackedAndGroupedColumnChartTooltip();
            case "customDoubleXAxesChart": return customDoubleXAxesChart();

        }
        return customAreaChartTooltipStyleWithFormatterFunction1();
    }

    private AAOptions customAreaChartTooltipStyleWithFormatterFunction1() {
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
                                .lineWidth(3f)
                                .color("#FFD700"/*纯金色*/)
                                .fillOpacity(0.5f)
                                .data(new Object[]{
                                1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                                4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                                18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                                3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                                2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                                2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                                5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48})
                });

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
                        .fontSize(12.f)
                );
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    private AAOptions customAreaChartTooltipStyleWithFormatterFunction2() {
        AASeriesElement element1 = new AASeriesElement()
                .name("🐶狗子")
                .lineWidth(5f)
                .fillOpacity(0.5f)
                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36});
        AASeriesElement element2 = new AASeriesElement()
                .name("🌲树木")
                .lineWidth(5f)
                .fillOpacity(0.5f)
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
                        "        var colorDot1 = '<span style=\\\"' + 'color:red; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var colorDot2 = '<span style=\\\"' + 'color:blue; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var s1 = colorDot1  + this.points[0].series.name + ': ' + this.points[0].y + '只' + '<br/>';\n" +
                        "        var s2 =  colorDot2 + this.points[1].series.name + ': ' + this.points[1].y + '棵';\n" +
                        "        s += s1 + s2;\n" +
                        "        return s;\n" +
                        "    }")
                ;
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    private AAOptions customAreaChartTooltipStyleWithFormatterFunction3() {
        AASeriesElement[] seriesElements = {
                new AASeriesElement()
                        .name("上市")
                        .data(new Object[]{0,0,7}),
                new AASeriesElement()
                        .name("中止")
                        .data(new Object[]{4,5,1}),
                new AASeriesElement()
                        .name("无进展")
                        .data(new Object[]{2,0,1}),
                new AASeriesElement()
                        .name("进行中")
                        .data(new Object[]{3,5,2}),

        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)//图形类型
                .title("2014 ~ 2020 汪星人生存指数")//图表主标题
                .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .categories(new String[]{"临床一期","临床二期","临床三期"})
                .series(seriesElements);

        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter("function () {\n" +
                        "        var colorDot0 = '<span style=\\\"' + 'color:red; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var colorDot1 = '<span style=\\\"' + 'color:mediumspringgreen; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var colorDot2 = '<span style=\\\"' + 'color:deepskyblue; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var colorDot3 = '<span style=\\\"' + 'color:sandybrown; font-size:13px\\\"' + '>◉</span> ';\n" +
                        "        var colorDotArr = [];\n" +
                        "        colorDotArr.push(colorDot0);\n" +
                        "        colorDotArr.push(colorDot1);\n" +
                        "        colorDotArr.push(colorDot2);\n" +
                        "        colorDotArr.push(colorDot3);\n" +
                        "        var wholeContentString = this.points[0].x + '<br/>';\n" +
                        "        for (var i = 0;i < 4;i++) {\n" +
                        "            var yValue = this.points[i].y;\n" +
                        "            if (yValue != 0) {\n" +
                        "                var prefixStr = colorDotArr[i];\n" +
                        "                wholeContentString += prefixStr + this.points[i].series.name + ': ' + this.points[i].y + '<br/>';\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return wholeContentString;\n" +
                        "    }")
                ;
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    private AAOptions customAreaChartTooltipStyleWithFormatterFunction4() {
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
                .title("")//图表主标题
                .subtitle("")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new Object[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(0f)
                .series(new AASeriesElement[]{element1, element2, element3, element4});


        AATooltip aaTooltip = new AATooltip()
                .useHTML(true)
                .formatter("function () {\n" +
                        "        var colorsArr = [];\n" +
                        "        colorsArr.push(\"mediumspringgreen\");\n" +
                        "        colorsArr.push(\"deepskyblue\");\n" +
                        "        colorsArr.push(\"red\");\n" +
                        "        colorsArr.push(\"sandybrown\");\n" +
                        "        var wholeContentString ='<span style=\\\"' + 'color:lightGray; font-size:13px\\\"' + '>◉ Time: ' + this.x + ' year</span><br/>';\n" +
                        "        for (var i = 0;i < 4;i++) {\n" +
                        "            var thisPoint = this.points[i];\n" +
                        "            var yValue = thisPoint.y;\n" +
                        "            if (yValue != 0) {\n" +
                        "                var spanStyleStartStr = '<span style=\\\"' + 'color:'+ colorsArr[i] + '; font-size:13px\\\"' + '>◉ ';\n" +
                        "                var spanStyleEndStr = '</span> <br/>';\n" +
                        "                wholeContentString += spanStyleStartStr + thisPoint.series.name + ': ' + thisPoint.y + '℃' + spanStyleEndStr;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return wholeContentString;\n" +
                        "    }")
                .backgroundColor("#050505")
                .borderColor("#050505")
                ;
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    private AAOptions customBoxplotTooltipContent() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Boxplot)
                .title("BOXPLOT CHART")
                .subtitle("virtual data")
                .yAxisTitle("℃")
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Observed Data")
                                .color("#ef476f")
                                .fillColor(AAGradientColor.deepSeaColor())
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
                        .fontSize(12.f)
                );
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.tooltip(aaTooltip);
        return aaOptions;
    }

    private AAOptions customYAxisLabels() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图形类型
                .title("")//图表主标题
                .subtitle("")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(8f)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0f)
                                .fillOpacity(0.4f)
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

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.yAxis.labels(aaYAxisLabels);

        return aaOptions;
    }

    private AAOptions customYAxisLabels2() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图形类型
                .title("")//图表主标题
                .subtitle("")//图表副标题
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelsEnabled(false)
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(8f)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0f)
                                .fillOpacity(0.4f)
                                .data(new Object[]{229.9, 771.5, 1106.4, 1129.2, 6644.0, 1176.0, 8835.6, 148.5, 8816.4, 6694.1, 7795.6, 9954.4})
                        ,
                });

        AALabels aaYAxisLabels = new AALabels()
                .style(new AAStyle()
                        .fontSize(10f)
                        .fontWeight(AAChartFontWeightType.Bold)
                        .color(AAColor.grayColor())
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

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.yAxis
                .opposite(true)
                .tickWidth(2f)
                .lineWidth(1.5f)//Y轴轴线颜色
                .lineColor(AAColor.lightGrayColor())//Y轴轴线颜色
                .gridLineWidth(0f)//Y轴网格线宽度
                .tickPositions(new Object[]{0,2500,5000,7500,10000})
                .labels(aaYAxisLabels);

        return aaOptions;
    }

    private AAOptions customStackedAndGroupedColumnChartTooltip() {
        AAChartModel aaChartModel = new AAChartModel()
                .title("Total fruit consumtion, grouped by gender")
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
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
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

    private AAOptions customDoubleXAxesChart() {
        Map gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#7052f4",
                "#00b0ff"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map gradientColorDic2 = AAGradientColor.linearGradient(
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
                        .fontSize(12.0f));

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
                .gridLineWidth(0f)// Y 轴网格线宽度
                .title(new AATitle()
                        .text(""))//Y 轴标题
                .labels(new AALabels()
                        .formatter("function () {\n" +
                                "    return (Math.abs(this.value) / 1000000) + 'M';\n" +
                                "}"))
                .min(-4000000f)
                .max(4000000f);

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

        AAOptions aaOptions = new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxisArray(new AAXAxis[]{aaXAxis1,aaXAxis2})
                .yAxis(aaYAxis)
                .plotOptions(aaPlotOptions)
                .tooltip(aaTooltip)
                .series(new Object[]{aaSeriesElement1,aaSeriesElement2});

        return aaOptions;
    }

}
