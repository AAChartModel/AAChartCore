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
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartZoomType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAColumn;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AACrosshair;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADateTimeLabelFormats;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAItemStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALang;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALegend;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPane;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotBandsElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotLinesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAResetZoomButton;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeriesEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASubtitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAZonesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class ChartOptionsComposer {

    public static AAOptions customChartLegendStyle() {
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
                .chartType(AAChartType.Areaspline)
                .title("CUSTOM LEGEND STYLE")
                .subtitle("LEGEND ON THE TOP_RIGHT SIDE WITH VERTICAL STYLE")
                .subtitleAlign(AAChartAlignType.Left)
                .markerRadius(0)
                .backgroundColor(AAColor.White)
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0)
                .yAxisTitle("percent values")
                .zoomType(AAChartZoomType.X)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(new String[]{"mediumspringgreen", "deepskyblue", "red", "sandybrown"})
                .series(new AASeriesElement[]{element1, element2, element3, element4});

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.chart.animation = false;// disable animation
        aaOptions.tooltip
                .backgroundColor(AAGradientColor.Firebrick)
                .style(AAStyle.style(AAColor.White));

        aaOptions.xAxis.tickWidth = 1f;
        aaOptions.yAxis.labels.format = "{value} %";//给y轴添加单位

        //https://github.com/AAChartModel/AAChartKit-Swift/issues/306
        aaOptions.xAxis
                .gridLineColor(AAColor.DarkGray)
                .gridLineWidth(1)
                .minorGridLineColor(AAColor.LightGray)
                .minorGridLineWidth(0.5)
                .minorTickInterval("auto");

        aaOptions.yAxis
                .gridLineColor(AAColor.DarkGray)
                .gridLineWidth(1)
                .minorGridLineColor(AAColor.LightGray)
                .minorGridLineWidth(0.5)
                .minorTickInterval("auto");

        aaOptions.legend
                .enabled(true)
                .verticalAlign(AAChartVerticalAlignType.Top)
                .layout(AAChartLayoutType.Vertical)
                .align(AAChartAlignType.Right)
        ;


        aaOptions.defaultOptions = new AALang()
                .resetZoom("重置缩放比例")
                .thousandsSep(",");

        return aaOptions;
    }

    public static AAOptions configureAAPlotBandsForChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Spline)//图形类型
                .dataLabelsEnabled(false)
                .markerRadius(0)
                .yAxisMax(40)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .color(AAColor.White)
                                .lineWidth(10),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        AAPlotBandsElement[] aaPlotBandsElementArr = {
                new AAPlotBandsElement()
                        .from(0)
                        .to(5)
                        .color("#BC2B44")
                ,
                new AAPlotBandsElement()
                        .from(5)
                        .to(10)
                        .color("#EC6444")
                ,
                new AAPlotBandsElement()
                        .from(10)
                        .to(15)
                        .color("#f19742")
                ,
                new AAPlotBandsElement()
                        .from(15)
                        .to(20)
                        .color("#f3da60")
                ,
                new AAPlotBandsElement()
                        .from(20)
                        .to(25)
                        .color("#9bd040")
                ,
                new AAPlotBandsElement()
                        .from(25)
                        .to(50)
                        .color("#acf08f")
                ,
        };

        AAYAxis aaYAxis = aaOptions.yAxis;
        aaYAxis.plotBands(aaPlotBandsElementArr);
        return aaOptions;
    }

    public static AAOptions configureAAPlotLinesForChart() {
        AAChartModel aaChartModel = new  AAChartModel()
                .chartType(AAChartType.Areaspline)//图形类型
                .dataLabelsEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] {7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .fillOpacity(0.5)
                                .lineWidth(10)
                                .zones(new AAZonesElement[]{
                                new AAZonesElement()
                                        .value(12)
                                        .color("#1e90ff"),
                                new AAZonesElement()
                                        .value(24)
                                        .color("#ef476f"),
                                new AAZonesElement()
                                        .value(36)
                                        .color("#04d69f"),
                                new AAZonesElement()
                                        .color("#ffd066"),
                        })
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        AAStyle aaStyle = new AAStyle()
                .color("#FFD700")//#FFD700(纯金色)
                .backgroundColor(AAColor.Black)
                .borderRadius(5)
                .border("6px solid #000000")
                .opacity(1.0)
                .fontWeight(AAChartFontWeightType.Bold);

        AAStyle aaStyle1 = new AAStyle()
                .color(AAColor.Red)//#FFD700(纯金色)
                .backgroundColor(AAColor.Black)
                .borderRadius(5)
                .border("2px solid red")
                .opacity(1.0)
                .fontWeight(AAChartFontWeightType.Bold)
                .padding(6)
                .fontSize(16);


        AAPlotLinesElement[] aaPlotLinesElementsArr = {
                new AAPlotLinesElement()
                        .color("#1e90ff")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDashDotDot)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1)) //标示线粗细
                        .value((12)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .useHTML(true)
                        .text("PLOT LINES 000001")
                        .style(aaStyle1))
                ,
                new AAPlotLinesElement()
                        .color("#ef476f")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDashDot)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1)) //标示线粗细
                        .value((24)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .useHTML(true)
                        .text("PLOT LINES 000002")
                        .style(aaStyle))
                ,
                new AAPlotLinesElement()
                        .color("#1e90ff")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDash)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1)) //标示线粗细
                        .value((36)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .useHTML(true)
                        .text("PLOT LINES 000003")
                        .style(aaStyle))
                ,
        };

        AAYAxis aaYAxis =  aaOptions.yAxis;
        aaYAxis.plotLines(aaPlotLinesElementsArr);
        return aaOptions;
    }

    public static AAOptions customAATooltipWithJSFunction() {
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
                        .fontSize(12)
                );
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip(aaTooltip);

        aaOptions.chart
                .resetZoomButton(new AAResetZoomButton()
                        .theme((Map)new HashMap()
                                .put("display","none")//隐藏图表缩放后的默认显示的缩放按钮
                        ));
        return aaOptions;
    }

    public static AAOptions customXAxisCrosshairStyle() {
        AASeriesElement[] aaSeriesElementsArr = {
                new AASeriesElement()
                        .name("2020")
                        .color(AAGradientColor.DeepSea)
                        .data(new Object[][]{
                        {12464064, 21.5},
                        {12464928, 22.1},
                        {12465792, 23.2},
                        {12466656, 23.8},
                        {12467520, 21.4},
                        {12468384, 21.3},
                        {12469248, 18.3},
                        {12470112, 15.4},
                        {12470976, 16.4},
                        {12471840, 17.7},
                        {12472704, 17.5},
                        {12473568, 17.6},
                        {12474432, 17.7},
                        {12475296, 16.8},
                        {12476160, 17.7},
                        {12477024, 16.3},
                        {12477888, 17.8},
                        {12478752, 18.1},
                        {12479616, 17.2},
                        {12480480, 14.4},
                        {12481344, 13.7},
                        {12482208, 15.7},
                        {12483072, 14.6},
                        {12483936, 15.3},
                        {12484800, 15.3},
                        {12485664, 15.8},
                        {12486528, 15.2},
                        {12487392, 14.8},
                        {12488256, 14.4},
                        {12489120, 15.5},
                        {12489984, 13.6}
                })
        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图表类型
                .series(aaSeriesElementsArr);

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        AACrosshair aaCrosshair = new AACrosshair()
                .color(AAColor.Red)
                .width(1)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot);
        AAXAxis aaXAxis =  aaOptions.xAxis;
        aaXAxis.crosshair(aaCrosshair);
        return aaOptions;
    }

    public static AAOptions configureXAxisLabelsFontColorWithHTMLString() {
        String[] categories = new String[]{
                "<font color=\\\"#CC0066\\\">孤岛危机<\\/font>",
                "<font color=\\\"#CC0033\\\">使命召唤<\\/font>",
                "<font color=\\\"#FF0066\\\">荣誉勋章<\\/font>",
                "<font color=\\\"##66FF99\\\">狙击精英<\\/font>",
                "<font color=\\\"#00FF00\\\">神秘海域<\\/font>",
                "<font color=\\\"#00CC00\\\">美国末日<\\/font>",
                "<font color=\\\"#666FF\\\">巫师狂猎<\\/font>",
                "<font color=\\\"#000CC\\\">死亡搁浅<\\/font>",
                "<font color=\\\"#9933CC\\\">地狱边境<\\/font>",
                "<font color=\\\"##FFCC99\\\">忍者之印<\\/font>",
                "<font color=\\\"#FFCC00\\\">合金装备<\\/font>",
                "<font color=\\\"#CC99090\\\">全战三国<\\/font>",
        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0)
                .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("Berlin Hot")
                                        .color(AAGradientColor.MysticMauve)
                                        .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                ,
                        }
                );

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.xAxis.labels.useHTML(true);
        return aaOptions;
    }

    public static AAOptions configureXAxisLabelsFontColorAndFontSizeWithHTMLString() {
        String[] categories = new String[]{
                "<span style=\\\"color:#CC0066;font-weight:bold;font-size:10px\\\">使命召唤</span>",
                "<span style=\\\"color:#CC0033;font-weight:bold;font-size:11px\\\">荣誉勋章</span>",
                "<span style=\\\"color:#FF0066;font-weight:bold;font-size:12px\\\">狙击精英</span>",
                "<span style=\\\"color:#66FF99;font-weight:bold;font-size:13px\\\">神秘海域</span>",
                "<span style=\\\"color:#00FF00;font-weight:bold;font-size:14px\\\">美国末日</span>",
                "<span style=\\\"color:#00CC00;font-weight:bold;font-size:15px\\\">巫师狂猎</span>",
                "<span style=\\\"color:#666FF;font-weight:bold;font-size:15px\\\">孤岛危机</span>",
                "<span style=\\\"color:#000CC;font-weight:bold;font-size:14px\\\">地狱边境</span>",
                "<span style=\\\"color:#9933CC;font-weight:bold;font-size:13px\\\">忍者之印</span>",
                "<span style=\\\"color:#FFCC99;font-weight:bold;font-size:12px\\\">合金装备</span>",
                "<span style=\\\"color:#FFCC00;font-weight:bold;font-size:11px\\\">全战三国</span>",
                "<span style=\\\"color:#CC99090;font-weight:bold;font-size:10px\\\">死亡搁浅</span>",
        };

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0)
                .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("Berlin Hot")
                                        .color(AAGradientColor.DeepSea)
                                        .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                ,
                        }
                );

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.xAxis.labels.useHTML(true);

        return aaOptions;
    }

    public static AAOptions configure_DataLabels_XAXis_YAxis_Legend_Style() {
        Map<String, Object> backgroundColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#4F00BC",
                "#29ABE2"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map<String, Object> fillColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "rgba(256,256,256,0.3)",
                "rgba(256,256,256,1.0)"//颜色字符串设置支持十六进制类型和 rgba 类型
        );


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .backgroundColor(backgroundColorGradientColor)
                .yAxisVisible(true)
                .categories(new String[] {"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Berlin Hot")
                                .color(AAColor.White)
                                .lineWidth(7)
                                .fillColor(fillColorGradientColor)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                });
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.plotOptions.areaspline
                .dataLabels(new AADataLabels()
                        .enabled(true)
                        .style(new AAStyle()
                                .color(AAColor.Black)
                                .fontSize(14)
                                .fontWeight(AAChartFontWeightType.Thin)
                                .textOutline("0px 0px contrast")//文字轮廓描边
                        ));


        AACrosshair aaCrosshair = new AACrosshair()
                .dashStyle(AAChartLineDashStyleType.LongDashDot)
                .color(AAColor.White)
                .width(1);

        AALabels aaLabels = new AALabels()
                .useHTML(true)
                .style(new AAStyle()
                        .fontSize(10)
                        .fontWeight(AAChartFontWeightType.Bold)
                        .color(AAColor.White)//轴文字颜色
                );

        aaOptions.yAxis
                .opposite(true)
                .tickWidth(2)
                .lineWidth(1.5)//Y轴轴线颜色
                .lineColor(AAColor.White)//Y轴轴线颜色
                .gridLineWidth(0)//Y轴网格线宽度
                .crosshair(aaCrosshair)
                .labels(aaLabels);

        aaOptions.xAxis
                .tickWidth(2)//X轴刻度线宽度
                .lineWidth(1.5)//X轴轴线宽度
                .lineColor(AAColor.White)//X轴轴线颜色
                .crosshair(aaCrosshair)
                .labels(aaLabels);


        //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
        /*默认是：{
         "color": "#333333",
         "cursor": "pointer",
         "fontSize": "12px",
         "fontWeight": "bold"
         }
         */

        aaOptions.legend
                .itemStyle(new AAItemStyle()
                        .color(AAColor.White)//字体颜色
                        .fontSize(13)//字体大小
                        .fontWeight(AAChartFontWeightType.Thin)//字体为细体字

                );

        return aaOptions;
    }


    public static AAOptions configureXAxisPlotBand() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .categories(new String[] {
                        "一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"
                })
                .yAxisGridLineWidth(0)
                .markerRadius(8)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(new AASeriesElement[] {
                        new AASeriesElement()
                                .name("New York Hot")
                                .lineWidth(5)
                                .color("rgba(220,20,60,1)")////猩红色, alpha 透明度 1
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                        new AASeriesElement()
                                .type(AAChartType.Column)
                                .name("Berlin Hot")
                                .color("#25547c")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                });


        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        AAPlotBandsElement[] aaPlotBandsElementArr = {
                new AAPlotBandsElement()
                        .from(-0.25)//值域颜色带X轴起始值
                        .to(4.75)//值域颜色带X轴结束值
                        .color("#06caf4")//值域颜色带填充色
                        .zIndex(0)//层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                ,
                new AAPlotBandsElement()
                        .from(4.75)
                        .to(8.25)
                        .color("#ffd066")
                        .zIndex(0)
                ,
                new AAPlotBandsElement()
                        .from(8.25)
                        .to(11.25)
                        .color("#04d69f")
                        .zIndex(0)
                ,
        };

        AAXAxis aaXAxis =  aaOptions.xAxis;
        aaXAxis.plotBands(aaPlotBandsElementArr);

        return aaOptions;
    }

    public static AAOptions configureTheMirrorColumnChart() {
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

        AAYAxis aaYAxis1 = new AAYAxis()
                .visible(true)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value:.,0f}$")//让y轴的值完整显示 而不是100000显示为100k,同时单位后缀为°C
                        .style(new AAStyle()
                                .color("#ff0000")//yAxis Label font color
                                .fontSize(15)//yAxis Label font size
                                .fontWeight(AAChartFontWeightType.Bold)//yAxis Label font weight
                        ))
                .gridLineWidth(0)// Y 轴网格线宽度
                .title(new AATitle()
                        .text("收入"));//Y 轴标题

        AAYAxis aaYAxis2 = new AAYAxis()
                .visible(true)
                .opposite(true)
                .title(new AATitle()
                        .text("支出"));

        return new AAOptions()
                .chart(new AAChart()
                        .type(AAChartType.Column))
                .title(new AATitle()
                        .text("正负镜像柱形图")
                        .style(new AAStyle()
                                .color(AAColor.White)
                                .fontSize(18)))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                                "七月", "八月", "九月", "十月", "十一月", "十二月"}))
                .yAxisArray(new AAYAxis[]{aaYAxis1,aaYAxis2})
                .plotOptions(new AAPlotOptions()
                        .series(new AASeries()
                                .animation(new AAAnimation()
                                        .duration(800)
                                        .easing(AAChartAnimationType.EaseInCirc)))
                        .column(new AAColumn()
                                .grouping(false)
                                .borderWidth(0)
                                .borderRadius(5)))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("收入")
                                .color(gradientColorDic1)
                                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9,7.0, 6.9, 9.5, 14.5,}),
                        new AASeriesElement()
                                .name("支出")
                                .color(gradientColorDic2)
                                .data(new Object[]{-20.1, -14.1, -8.6, -2.5, -0.8, -5.7, -11.3, -17.0, -22.0, -24.8, -24.1, -20.1, -14.1, -8.6, -2.5})

                });

    }

    public static AAOptions configureDoubleYAxisChartOptions()  {
        AATitle aaTitle = new AATitle()
                .text("");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .min(0)
                .categories(new String[]{
                        "Java", "Swift", "Python", "Ruby", "PHP", "Go","C",
                        "C#", "C++", "Perl", "R", "MATLAB", "SQL"
                });

        AAStyle aaYAxisTitleStyle = new AAStyle()
                .color("#1e90ff")//Title font color
                .fontSize(14)//Title font size
                .fontWeight(AAChartFontWeightType.Bold)//Title font weight
                .textOutline("0px 0px contrast");

        AALabels aaYAxisLabels = new AALabels()
                .enabled(true)//设置 y 轴是否显示数字
                .format("{value:.,0f}mm")//让y轴的值完整显示 而不是100000显示为100k,同时单位后缀为°C
                .style(new AAStyle()
                        .color("#ff0000")//yAxis Label font color
                        .fontSize(15)//yAxis Label font size
                        .fontWeight(AAChartFontWeightType.Bold)//yAxis Label font weight
                );

        AAYAxis yAxisOne = new AAYAxis()
                .visible(true)
                .labels(aaYAxisLabels)
                .title(new AATitle()
                        .text("冬季降雨量")
                        .style(aaYAxisTitleStyle))
                .opposite(true);


        AAYAxis yAxisTwo = new AAYAxis()
                .visible(true)
                .labels(aaYAxisLabels)
                .title(new AATitle()
                        .text("夏季降雨量")
                        .style(aaYAxisTitleStyle));

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#f54ea2",
                "#ff7676"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map<String, Object> gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#17ead9",
                "#6078ea"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        AAMarker aaMarker = new AAMarker()
                .radius(7)//曲线连接点半径，默认是4
                .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                .fillColor("#ffffff")//点的填充色(用来设置折线连接点的填充色)
                .lineWidth(3)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                .lineColor("");//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)

        AASeriesElement element1 = new AASeriesElement()
                .name("2017")
                .type(AAChartType.Areaspline)
                //          .borderRadius(4)
                .color(gradientColorDic1)
                .marker(aaMarker)
                .yAxis(1)
                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6});

        AASeriesElement element2 = new AASeriesElement()
                .name("2018")
                .type(AAChartType.Column)
                .color(gradientColorDic2)
                .yAxis(0)
                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6});

        return new AAOptions()
                .title(aaTitle)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxisOne,yAxisTwo})
                .tooltip(aaTooltip)
                .series(new AASeriesElement[]{element1,element2});
    }

    public static AAOptions configureTripleYAxesMixedChart()  {
        String[] colorsThemeArr = new String[]{"red","mediumspringgreen","deepskyblue",};

        AATitle aaTitle = new AATitle()
                .text("东京月平均天气数据");

        AASubtitle aaSubtitle = new AASubtitle()
                .text("数据来源: WorldClimate.com");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .min(0)
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"});

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .gridLineWidth(0)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°C")
                        .style(new AAStyle()
                                .color(colorsThemeArr[2])//yAxis Label font color
                        ))
                .title(new AATitle()
                        .text("温度")
                        .style(new AAStyle()
                                .color(colorsThemeArr[2])))
                .opposite(true);

        AAYAxis yAxis2 = new AAYAxis()
                .visible(true)
                .gridLineWidth(0)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°mm")
                        .style(new AAStyle()
                                .color(colorsThemeArr[0])//yAxis Label font color
                        ))
                .title(new AATitle()
                        .text("降雨量")
                        .style(new AAStyle()
                                .color(colorsThemeArr[0])));

        AAYAxis yAxis3 = new AAYAxis()
                .visible(true)
                .gridLineWidth(0)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°mb")
                        .style(new AAStyle()
                                .color(colorsThemeArr[1])//yAxis Label font color
                        ))
                .title(new AATitle()
                        .text("海平面气压")
                        .style(new AAStyle()
                                .color(colorsThemeArr[1])))
                .opposite(true);


        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        AALegend aaLegend = new AALegend()
                .enabled(true)
                .floating(true)
                .layout(AAChartLayoutType.Vertical)
                .align(AAChartAlignType.Left)
                .x(80)
                .verticalAlign(AAChartVerticalAlignType.Top)
                .y(55);

        AASeriesElement element1 = new AASeriesElement()
                .name("降雨量")
                .type(AAChartType.Column)
                .yAxis(1)
                .data(new Object[]{49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4})
                .tooltip(new AATooltip()
                        .valueSuffix(" mm"));

        AASeriesElement element2 = new AASeriesElement()
                .name("海平面气压")
                .type(AAChartType.Line)
                .yAxis(2)
                .data(new Object[]{1016, 1016, 1015.9, 1015.5, 1012.3, 1009.5, 1009.6, 1010.2, 1013.1, 1016.9, 1018.2, 1016.7})
                .dashStyle(AAChartLineDashStyleType.ShortDot)
                .tooltip(new AATooltip()
                        .valueSuffix(" mb"));

        AASeriesElement element3 = new AASeriesElement()
                .name("温度")
                .type(AAChartType.Line)
                .yAxis(0)
                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6})
                .tooltip(new AATooltip()
                        .valueSuffix(" ℃"));

        return new AAOptions()
                .title(aaTitle)
                .subtitle(aaSubtitle)
                .colors(colorsThemeArr)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1,yAxis2,yAxis3})
                .tooltip(aaTooltip)
                .legend(aaLegend)
                .series(new AASeriesElement[]{element1,element2,element3,});
    }

    public static AAOptions customLineChartDataLabelsFormat() {
        AAChartModel aaChartModel = new AAChartModel()
                //选择图表类型
                .chartType(AAChartType.Line)
                .colorsTheme(new String[]{"#465DBC"})
                //title标题
                .title("最近三十分钟数据展示")
                .titleStyle(AAStyle.style("#0F0F0F", 20))
                //坐标轴字体颜色
                .axesTextColor("#0F0F0F")
                //背景颜色
                .zoomType("xy")
                .backgroundColor("#FFFFFF")
                //数据是否显示
                .dataLabelsEnabled(true)
                //x轴是否显示数据
                .xAxisLabelsEnabled(true)
                //x轴显示的数据间隔
                .xAxisTickInterval(5)
                //y轴是否显示数据
                .yAxisLabelsEnabled(true)
                //y轴标题
                .yAxisTitle("湿度%")
                //y轴最大值
                .yAxisMax(100)
                //y轴最小值
                .yAxisMin(0)
                .yAxisAllowDecimals(true)
                //y轴数据
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("湿度")
                                .data(new Object[]{44.0999, 44.8880, 44.7770, 43.0066, 43.6660, 43.5550, }),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.plotOptions.line.dataLabels.format = "{point.y:.4f} ℃"; //保留 Y 轴值的小数点后 4 位
        return aaOptions;
    }

    public static AAOptions configureDoubleYAxesAndColumnLineMixedChart() {
        Object[][] stopsArr = new Object[][] {
                {0.0, "rgba(156,107,211,0.5)"},//颜色字符串设置支持十六进制类型和 rgba 类型
                {0.2, "rgba(156,107,211,0.3)"},
                {1.0, "rgba(156,107,211,0)"}
        };

        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                stopsArr);

        Map<String, Object> gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#956FD4",
                "#3EACE5"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        String[] category = new String[]{
                "市区", "万州", "江北", "南岸", "北碚", "綦南", "长寿", "永川", "璧山", "江津",
                "城口", "大足", "垫江", "丰都", "奉节", "合川", "江津区", "开州", "南川", "彭水",
                "黔江", "石柱", "铜梁", "潼南", "巫山", "巫溪", "武隆", "秀山", "酉阳", "云阳",
                "忠县", "川东", "检修"
        };

        Object[] goalValuesArr = new Object[]{
                18092, 20728, 24045, 28348, 32808
                , 36097, 39867, 44715, 48444, 50415
                , 56061, 62677, 59521, 67560, 18092, 20728, 24045, 28348, 32808
                , 36097, 39867, 44715, 48444, 50415, 36097, 39867, 44715, 48444, 50415
                , 50061, 32677, 49521, 32808
        };

        Object[] realValuesArr = new Object[] {
                4600, 5000, 5500, 6500, 7500
                , 8500, 9900, 12500, 14000, 21500
                , 23200, 24450, 25250, 33300, 4600, 5000, 5500, 6500, 7500
                , 8500, 9900, 22500, 14000, 21500, 8500, 9900, 12500, 14000, 21500
                , 23200, 24450, 25250, 7500
        };

        Object[] rateValuesArr = new Object[33];

        for (int i = 0; i < 33; i++) {
            Float goalValue = Float.valueOf((Integer) goalValuesArr[i]);
            Float realValue = Float.valueOf((Integer) realValuesArr[i]);
            float rateValue = realValue / goalValue;
            rateValuesArr[i] = rateValue;
        }

        AAChart aaChart = new AAChart()
                .backgroundColor("#191E40");

        AATitle aaTitle = new AATitle()
                .text("");

        AALabels aaLabels = new AALabels()
                .enabled(true)
                .style(new AAStyle()
                        .color(AAColor.LightGray));

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .labels(aaLabels)
                .min(0)
                .categories(category);

        AAStyle aaYAxisTitleStyle = new AAStyle()
                .color("#1e90ff")//Title font color
                .fontSize(14)//Title font size
                .fontWeight(AAChartFontWeightType.Bold)//Title font weight
                .textOutline("0px 0px contrast");

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .labels(aaLabels)
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("已贯通 / 计划贯通")
                        .style(aaYAxisTitleStyle));

        AAYAxis yAxis2 = new AAYAxis()
                .visible(true)
                .labels(aaLabels)
                .gridLineWidth(0)
                .title(new AATitle()
                        .text("贯通率")
                        .style(aaYAxisTitleStyle))
                .opposite(true);

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(true);

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .animation(new AAAnimation()
                                .easing(AAChartAnimationType.EaseTo)
                                .duration(1000)))
                .column(new AAColumn()
                        .grouping(false)
                        .pointPadding(0f)
                        .pointPlacement(0f)
                );

        AALegend aaLegend = new AALegend()
                .enabled(true)
                .itemStyle(new AAItemStyle()
                        .color(AAColor.LightGray))
                .floating(true)
                .layout(AAChartLayoutType.Horizontal)
                .align(AAChartAlignType.Left)
                .x(30)
                .verticalAlign(AAChartVerticalAlignType.Top)
                .y(10);

        AASeriesElement goalValuesElement = new AASeriesElement()
                .name("计划贯通")
                .type(AAChartType.Column)
                .borderWidth(0)
                .color(gradientColorDic1)
                .yAxis(0)
                .data(goalValuesArr);

        AASeriesElement realValuesElement = new AASeriesElement()
                .name("已贯通")
                .type(AAChartType.Column)
                .borderWidth(0)
                .color(gradientColorDic2)
                .yAxis(0)
                .data(realValuesArr);

        AASeriesElement rateValuesElement = new AASeriesElement()
                .name("贯通率")
                .type(AAChartType.Line)
                .marker(new AAMarker()
                        .radius(7)//曲线连接点半径，默认是4
                        .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                        .fillColor("#ffffff")//点的填充色(用来设置折线连接点的填充色)
                        .lineWidth(3)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                        .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                )
                .color("#F02FC2")
                .yAxis(1)
                .data(rateValuesArr);

        return new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1,yAxis2})
                .tooltip(aaTooltip)
                .plotOptions(aaPlotOptions)
                .legend(aaLegend)
                .series(new Object[]{
                        goalValuesElement,
                        realValuesElement,
                        rateValuesElement});
    }

    public static AAOptions configureDoubleYAxesMarketDepthChart() {
        AAChart aaChart = new AAChart()
                .type(AAChartType.Area);

        AATitle aaTitle = new AATitle()
                .text("ETH-BTC 市场深度图");

        AASubtitle aaSubtitle = new AASubtitle()
                .text("数据来源: https://github.com/AAChartModel");

        AAXAxis aaXAxis = new AAXAxis()
                .visible(true)
                .plotLines(new AAPlotLinesElement[]{
                        new AAPlotLinesElement()
                                .color(AAColor.Red)
                                .value(0.1523)
                                .width(1.5)
                                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                                .label(new AALabel()
                                        .text("实际价格")
                                        .rotation(90))
                })
                ;

        AAYAxis yAxis1 = new AAYAxis()
                .visible(true)
                .lineWidth(1)
                .title(new AATitle()
                        .text(""))
                .tickWidth(1)
                .tickLength(5)
                .tickPosition("inside")
                .gridLineWidth(1)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .align(AAChartAlignType.Left)
                        .x(8)
                );

        AAYAxis yAxis2 = new AAYAxis()
                .opposite(true)
                .visible(true)
                .lineWidth(1)
                .title(new AATitle()
                        .text(""))
                .tickWidth(1)
                .tickLength(5)
                .tickPosition("inside")
                .gridLineWidth(0)
                .labels(new AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .align(AAChartAlignType.Right)
                        .x(-8)
                );

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .headerFormat("<span style=\\\"font-size=10px;\\\">Price: {point.key}</span><br/>")
                .valueDecimals(2)
                ;

        AALegend aaLegend = new AALegend()
                .enabled(false);

        AASeriesElement element1 = new AASeriesElement()
                .name("Bids")
                .color("#04d69f")
                .step(true)
                .data(new Object[][]{
                        {0.1524, 0.948665},
                        {0.1539, 35.510715},
                        {0.154,  39.883437},
                        {0.1541, 40.499661},
                        {0.1545, 43.262994000000006},
                        {0.1547, 60.14799400000001},
                        {0.1553, 60.30799400000001},
                        {0.1558, 60.55018100000001},
                        {0.1564, 68.381696},
                        {0.1567, 69.46518400000001},
                        {0.1569, 69.621464},
                        {0.157,  70.398015},
                        {0.1574, 70.400197},
                        {0.1575, 73.199217},
                        {0.158,  77.700017},
                        {0.1583, 79.449017},
                        {0.1588, 79.584064},
                        {0.159,  80.584064},
                        {0.16,   81.58156},
                        {0.1608, 83.38156}
                });

        AASeriesElement element2 = new AASeriesElement()
                .name("Asks")
                .color("#1e90ff")
                .step(true)
                .data(new Object[][]{
                        {0.1435, 242.521842},
                        {0.1436, 206.49862099999999},
                        {0.1437, 205.823735},
                        {0.1438, 197.33275},
                        {0.1439, 153.677454},
                        {0.144,  146.007722},
                        {0.1442, 82.55212900000001},
                        {0.1443, 59.152814000000006},
                        {0.1444, 57.942260000000005},
                        {0.1445, 57.483850000000004},
                        {0.1446, 52.39210800000001},
                        {0.1447, 51.867208000000005},
                        {0.1448, 44.104697},
                        {0.1449, 40.131217},
                        {0.145,  31.878217},
                        {0.1451, 22.794916999999998},
                        {0.1453, 12.345828999999998},
                        {0.1454, 10.035642},
                        {0.148,  9.326642},
                        {0.1522, 3.76317}
                });

        return new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .subtitle(aaSubtitle)
                .xAxis(aaXAxis)
                .yAxisArray(new AAYAxis[]{yAxis1,yAxis2})
                .tooltip(aaTooltip)
                .legend(aaLegend)
                .series(new AASeriesElement[]{element1,element2});
    }

    public static AAOptions customAreaChartTooltipStyleLikeHTMLTable() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .yAxisVisible(false)
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("TokyoHot")
                                .lineWidth(5)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36}),
                        new AASeriesElement()
                                .name("BerlinHot")
                                .lineWidth(5)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67}),
                        new AASeriesElement()
                                .name("LondonHot")
                                .lineWidth(5)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64}),
                        new AASeriesElement()
                                .name("NewYorkHot")
                                .lineWidth(5)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip
                .shared(true)
                .useHTML(true)
                .headerFormat("<small>{point.key} 摄氏度</small><table>")
                .pointFormat("<tr><td style=\\\"color: {series.color}\\\">{series.name}: </td>"
                        + "<td style=\\\"text-align: right\\\"><b>{point.y}EUR</b></td></tr>")
                .footerFormat("</table>")
                .valueDecimals(2)
        ;
        return aaOptions;
    }

    public static AAOptions simpleGaugeChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .type(AAChartType.Gauge))
                .pane(new AAPane()
                        .startAngle(-150)
                        .endAngle(150))
                .yAxis(new AAYAxis()
                        .min(0)
                        .max(100)
                        .plotBands(new AAPlotBandsElement[]{
                                new AAPlotBandsElement()
                                        .from(0)
                                        .to(60)
                                        .color("#FF0000")
                        }))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{80})
                });
    }

   public static AAOptions gaugeChartWithPlotBand() {
       return new AAOptions()
               .chart(new AAChart()
                       .type(AAChartType.Gauge))
               .title(new AATitle()
                       .text("速度仪"))
               .pane(new AAPane()
                       .startAngle(-150)
                       .endAngle(150))
               .yAxis(new AAYAxis()
                       .min(0)
                       .max(200)
                       .title(new AATitle()
                               .text("km/h"))
                       .plotBands(new AAPlotBandsElement[]{
                               new AAPlotBandsElement()
                                       .from(0)
                                       .to(120)
                                       .color("#ffc069"),
                               new AAPlotBandsElement()
                                       .from(120)
                                       .to(160)
                                       .color("#fe117c"),
                               new AAPlotBandsElement()
                                       .from(160)
                                       .to(200)
                                       .color("#06caf4"),
                       })
               )
               .series(new AASeriesElement[]{
                       new AASeriesElement()
                               .data(new Object[]{80})
               });
    }

    //Issue: https://github.com/AAChartModel/AAChartKit/issues/888
    public static AAOptions doubleLayerHalfPieChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Pie)
                .title("浏览器市场占比历史对比")
                .subtitle("无任何可靠依据的虚拟数据")
                .dataLabelsEnabled(false)//是否直接显示扇形图数据
                .yAxisTitle("摄氏度")
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Past")
                                .size("40%")//尺寸大小
                                .innerSize("30%")//内部圆环半径大小占比
                                .borderWidth(0)//描边的宽度
                                .allowPointSelect(false)//是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                                .data(new Object[][]{
                                {"Firefox Past",   3336.2},
                                {"Chrome Past",      26.8},
                                {"Safari Past",      88.5},
                                {"Opera Past",       46.0},
                                {"Others Past",     223.0},
                        }),

                        new AASeriesElement()
                                .name("Now")
                                .size("80%")//尺寸大小
                                .innerSize("70%")//内部圆环半径大小占比
                                .borderWidth(0)//描边的宽度
                                .allowPointSelect(false)//是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                                .data(new Object[][]{
                                {"Firefox Now",    336.2},
                                {"Chrome Now",    6926.8},
                                {"Safari Now",     388.5},
                                {"Opera Now",      446.0},
                                {"Others Now",     223.0},
                        })
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.plotOptions.pie
                .startAngle(-90)
                .endAngle(90);

        return aaOptions;
    }

    public static AAOptions customAreasplineChartTooltipContentWithHeaderFormat() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .colorsTheme(new String[]{"#04d69f", "#1e90ff", "#ef476f", "#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .markerRadius(0)
                .categories(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                        "31"})
                .yAxisVisible(false)
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("客流")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{
                                26, 27, 53, 41, 35, 55, 33, 42, 33, 63,
                                40, 43, 36, 0, 0, 0, 0, 0, 0, 0,
                                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                0
                        })
                });

        String title = "<span style=\"color:red;font-size:17px;font-weight:bold;\">客流</span><br>";
        String week = "周一";
        String time = "时间: 8.{point.x}" + " (" + week + ")<br>";
        String headerFormat = title + time;

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip
                .useHTML(true)
                .headerFormat(headerFormat)
                .style(new AAStyle()
                        .color(AAColor.White)
                        .fontSize(14))
                .backgroundColor("#050505")
                .borderColor("#050505");

        //禁用图例点击事件
        aaOptions.plotOptions.series.events = new AASeriesEvents()
                .legendItemClick("function() {\n" +
                        "            return false;\n" +
                        "        }");

        return aaOptions;
    }

//    //https://github.com/AAChartModel/AAChartKit/issues/1125
//    private func customAreaChartTooltipStyleWithTotalValueHeader() -> AAOptions {
//        let goldStopsArr = [
//            [0.0, AARgba(255, 215, 0, 1.0)],//颜色字符串设置支持十六进制类型和 rgba 类型
//            [0.6, AARgba(255, 215, 0, 0.2)],
//            [1.0, AARgba(255, 215, 0, 0.0)]
//        ]
//        let gradientGoldColorDic = AAGradientColor.linearGradient(
//                direction: .toBottom,
//                stops: goldStopsArr
//        )
//
//        let greenStopsArr = [
//            [0.0, AARgba(50, 205, 50, 1.0)],//颜色字符串设置支持十六进制类型和 rgba 类型
//            [0.6, AARgba(50, 205, 50, 0.2)],
//            [1.0, AARgba(50, 205, 50, 0.0)]
//        ]
//        let gradientGreenColorDic = AAGradientColor.linearGradient(
//                direction: .toBottom,
//                stops: greenStopsArr
//        )
//
//        let aaChartModel = AAChartModel()
//                .chartType(.area)//图表类型
//            .title("2021 年 10 月上海市猫与狗生存调查")//图表主标题
//                .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
//                .colorsTheme([
//                AARgba(255, 215, 0, 1.0),
//                AARgba(50, 205, 50, 1.0),
//            ])
//            .markerSymbolStyle(.innerBlank)//折线连接点样式为内部白色
//            .stacking(.normal)
//            .categories(["10-01","10-02","10-03","10-04","10-05","10-06","10-07","10-08",])
//            .series([
//                AASeriesElement()
//                        .lineWidth(6)
//                        .fillColor(gradientGoldColorDic)
//                        .name("🐶狗")
//                        .data([43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175]),
//        AASeriesElement()
//                .lineWidth(6)
//                .fillColor(gradientGreenColorDic)
//                .name("🐱猫")
//                .data([24916, 24064, 29742, 29851, 32490, 30282, 38121, 40434]),
//            ])
//
//        let aaOptions = aaChartModel.aa_toAAOptions()
//        aaOptions.tooltip?
//            .useHTML(true)
//                .headerFormat("狗和猫的总数为:{point.total}<br/>")
//
//
//        return aaOptions
//    }

    public static AAOptions customAreaChartTooltipStyleWithTotalValueHeader() {
        Object[][] goldStopsArr = new Object[][]{
                new Object[]{0.0, AAColor.rgbaColor(255, 215, 0, 1.0f)},//颜色字符串设置支持十六进制类型和 rgba 类型
                new Object[]{0.6, AAColor.rgbaColor(255, 215, 0, 0.2f)},
                new Object[]{1.0, AAColor.rgbaColor(255, 215, 0, 0.0f)}
        };
        Map<String, Object> gradientGoldColorDic = AAGradientColor.linearGradient(AALinearGradientDirection.ToBottom, goldStopsArr);

        Object[][] greenStopsArr = new Object[][]{
                new Object[]{0.0, AAColor.rgbaColor(50, 205, 50, 1.0f)},//颜色字符串设置支持十六进制类型和 rgba 类型
                new Object[]{0.6, AAColor.rgbaColor(50, 205, 50, 0.2f)},
                new Object[]{1.0, AAColor.rgbaColor(50, 205, 50, 0.0f)}
        };
        Map<String, Object> gradientGreenColorDic = AAGradientColor.linearGradient(AALinearGradientDirection.ToBottom, greenStopsArr);

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Area)//图表类型
                .title("2021 年 10 月上海市猫与狗生存调查")//图表主标题
                .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
                .colorsTheme(new Object[]{
                        AAColor.rgbaColor(255, 215, 0, 1.0f),
                        AAColor.rgbaColor(50, 205, 50, 1.0f)
                })
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//折线连接点样式为内部白色
                .stacking(AAChartStackingType.Normal)
                .categories(new String[]{"10-01","10-02","10-03","10-04","10-05","10-06","10-07","10-08",})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .lineWidth(6)
                                .fillColor(gradientGoldColorDic)
                                .name("🐶狗")
                                .data(new Object[]{43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175}),
                        new AASeriesElement()
                                .lineWidth(6)
                                .fillColor(gradientGreenColorDic)
                                .name("🐱猫")
                                .data(new Object[]{24916, 24064, 29742, 29851, 32490, 30282, 38121, 40434}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.tooltip
                .useHTML(true)
                .headerFormat("狗和猫的总数为:{point.total}<br/>");

        return aaOptions;
    }


    private static AAOptions configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart() {
        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
               "#FC354C",
                "#0ABFBC"
        );

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .title("Numeric symbols magnitude")//图表主标题
                .subtitle("Chinese and Japanese uses ten thousands (万) as numeric symbol")//图表副标题
                .categories(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Spe", "Oct", "Nov", "Dec"})
                .markerRadius(8.0)//marker点半径为8个像素
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//marker点为空心效果
                .markerSymbol(AAChartSymbolType.Circle)//marker点为圆形点○
                .yAxisLineWidth(0)
                .legendEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(7.0)
                                .color(AAColor.Red)//猩红色, alpha 透明度 1
                                .fillColor(gradientColorDic1)
                                .data(new Object[]{70000.0, 60000.9, 20000.5, 140000.5, 180000.2, 210000.5, 50000.2, 260000.5, 230000.3, 450000.3, 130000.9, 90000.6}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.defaultOptions = new AALang()
                .numericSymbolMagnitude(10000) //国际单位符基数
                .numericSymbols(new String[]{"万","億"}) //国际单位符
        ;

        return aaOptions;
    }

// get UTC number from date
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



    //X 轴时间不连续的折线图
    public static AAOptions timeDataWithIrregularIntervalsChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图形类型
                .title("Snow depth at Vikjafjellet, Norway")//图形标题
                .subtitle("Irregular time data in AAChartKit")//图形副标题
                .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4",})
                .dataLabelsEnabled(false)//是否显示数字
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//折线连接点样式
                .markerRadius(7)//折线连接点半径长度,为0时相当于没有折线连接点
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Winter 2014-2015")
                                .data(new Object[][]{
                                {AADateUTC(1970, 10, 25),    0},
                                {AADateUTC(1970, 11,  6), 0.25},
                                {AADateUTC(1970, 11, 20), 1.41},
                                {AADateUTC(1970, 11, 25), 1.64},
                                {AADateUTC(1971, 0,  4),   1.6},
                                {AADateUTC(1971, 0, 17),  2.55},
                                {AADateUTC(1971, 0, 24),  2.62},
                                {AADateUTC(1971, 1,  4),   2.5},
                                {AADateUTC(1971, 1, 14),  2.42},
                                {AADateUTC(1971, 2,  6),  2.74},
                                {AADateUTC(1971, 2, 14),  2.62},
                                {AADateUTC(1971, 2, 24),   2.6},
                                {AADateUTC(1971, 3,  1),  2.81},
                                {AADateUTC(1971, 3, 11),  2.63},
                                {AADateUTC(1971, 3, 27),  2.77},
                                {AADateUTC(1971, 4,  4),  2.68},
                                {AADateUTC(1971, 4,  9),  2.56},
                                {AADateUTC(1971, 4, 14),  2.39},
                                {AADateUTC(1971, 4, 19),   2.3},
                                {AADateUTC(1971, 5,  4),     2},
                                {AADateUTC(1971, 5,  9),  1.85},
                                {AADateUTC(1971, 5, 14),  1.49},
                                {AADateUTC(1971, 5, 19),  1.27},
                                {AADateUTC(1971, 5, 24),  0.99},
                                {AADateUTC(1971, 5, 29),  0.67},
                                {AADateUTC(1971, 6,  3),  0.18},
                                {AADateUTC(1971, 6,  4),     0}
                        }),
                        new AASeriesElement()
                                .name("Winter 2015-2016")
                                .data(new Object[][]{
                                {AADateUTC(1970, 10,  9),    0},
                                {AADateUTC(1970, 10, 15), 0.23},
                                {AADateUTC(1970, 10, 20), 0.25},
                                {AADateUTC(1970, 10, 25), 0.23},
                                {AADateUTC(1970, 10, 30), 0.39},
                                {AADateUTC(1970, 11,  5), 0.41},
                                {AADateUTC(1970, 11, 10), 0.59},
                                {AADateUTC(1970, 11, 15), 0.73},
                                {AADateUTC(1970, 11, 20), 0.41},
                                {AADateUTC(1970, 11, 25), 1.07},
                                {AADateUTC(1970, 11, 30), 0.88},
                                {AADateUTC(1971, 0,  5),  0.85},
                                {AADateUTC(1971, 0, 11),  0.89},
                                {AADateUTC(1971, 0, 17),  1.04},
                                {AADateUTC(1971, 0, 20),  1.02},
                                {AADateUTC(1971, 0, 25),  1.03},
                                {AADateUTC(1971, 0, 30),  1.39},
                                {AADateUTC(1971, 1,  5),  1.77},
                                {AADateUTC(1971, 1, 26),  2.12},
                                {AADateUTC(1971, 3, 19),   2.1},
                                {AADateUTC(1971, 4,  9),   1.7},
                                {AADateUTC(1971, 4, 29),  0.85},
                                {AADateUTC(1971, 5,  7),     0}
                        }),
                        new AASeriesElement()
                                .name("Winter 2016-2017")
                                .data(new Object[][]{
                                {AADateUTC(1970, 9, 15),     0},
                                {AADateUTC(1970, 9, 31),  0.09},
                                {AADateUTC(1970, 10,  7), 0.17},
                                {AADateUTC(1970, 10, 10),  0.1},
                                {AADateUTC(1970, 11, 10),  0.1},
                                {AADateUTC(1970, 11, 13),  0.1},
                                {AADateUTC(1970, 11, 16), 0.11},
                                {AADateUTC(1970, 11, 19), 0.11},
                                {AADateUTC(1970, 11, 22), 0.08},
                                {AADateUTC(1970, 11, 25), 0.23},
                                {AADateUTC(1970, 11, 28), 0.37},
                                {AADateUTC(1971, 0, 16),  0.68},
                                {AADateUTC(1971, 0, 19),  0.55},
                                {AADateUTC(1971, 0, 22),   0.4},
                                {AADateUTC(1971, 0, 25),   0.4},
                                {AADateUTC(1971, 0, 28),  0.37},
                                {AADateUTC(1971, 0, 31),  0.43},
                                {AADateUTC(1971, 1,  4),  0.42},
                                {AADateUTC(1971, 1,  7),  0.39},
                                {AADateUTC(1971, 1, 10),  0.39},
                                {AADateUTC(1971, 1, 13),  0.39},
                                {AADateUTC(1971, 1, 16),  0.39},
                                {AADateUTC(1971, 1, 19),  0.35},
                                {AADateUTC(1971, 1, 22),  0.45},
                                {AADateUTC(1971, 1, 25),  0.62},
                                {AADateUTC(1971, 1, 28),  0.68},
                                {AADateUTC(1971, 2,  4),  0.68},
                                {AADateUTC(1971, 2,  7),  0.65},
                                {AADateUTC(1971, 2, 10),  0.65},
                                {AADateUTC(1971, 2, 13),  0.75},
                                {AADateUTC(1971, 2, 16),  0.86},
                                {AADateUTC(1971, 2, 19),  1.14},
                                {AADateUTC(1971, 2, 22),   1.2},
                                {AADateUTC(1971, 2, 25),  1.27},
                                {AADateUTC(1971, 2, 27),  1.12},
                                {AADateUTC(1971, 2, 30),  0.98},
                                {AADateUTC(1971, 3,  3),  0.85},
                                {AADateUTC(1971, 3,  6),  1.04},
                                {AADateUTC(1971, 3,  9),  0.92},
                                {AADateUTC(1971, 3, 12),  0.96},
                                {AADateUTC(1971, 3, 15),  0.94},
                                {AADateUTC(1971, 3, 18),  0.99},
                                {AADateUTC(1971, 3, 21),  0.96},
                                {AADateUTC(1971, 3, 24),  1.15},
                                {AADateUTC(1971, 3, 27),  1.18},
                                {AADateUTC(1971, 3, 30),  1.12},
                                {AADateUTC(1971, 4,  3),  1.06},
                                {AADateUTC(1971, 4,  6),  0.96},
                                {AADateUTC(1971, 4,  9),  0.87},
                                {AADateUTC(1971, 4, 12),  0.88},
                                {AADateUTC(1971, 4, 15),  0.79},
                                {AADateUTC(1971, 4, 18),  0.54},
                                {AADateUTC(1971, 4, 21),  0.34},
                                {AADateUTC(1971, 4, 25),     0}
                        }),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.xAxis
                .type(AAChartAxisType.Datetime)
                .dateTimeLabelFormats(new AADateTimeLabelFormats()
                        .month("%e. %b")
                        .year("%b")
                );

        return aaOptions;
    }

    public static AAOptions logarithmicAxisLineChart() {
        return new AAOptions()
                .title(new AATitle()
                        .text("Logarithmic Axis Chart"))
                .chart(new AAChart()
                        .type(AAChartType.Line))
                .xAxis(new AAXAxis()
                        .type(AAChartAxisType.Logarithmic)
                        .gridLineWidth(0.6))
                .yAxis(new AAYAxis()
                        .type(AAChartAxisType.Logarithmic)
                        .minorTickInterval(0.1))
                .tooltip(new AATooltip()
                        .enabled(true)
                        .headerFormat("{series.name}")
                        .pointFormat("x = {point.x}, y = {point.y}"))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .data(new Object[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512})
                });
    }

    public static AAOptions logarithmicAxisScatterChart() {
        AAMarker aaMarker = new AAMarker()
                .radius(8)
                .symbol(AAChartSymbolType.Circle)
                .fillColor(AAColor.White)
                .lineWidth(3)
                .lineColor(AAColor.Red);

        Object[][] scatterData = new Object[][] {
                {550, 870},{738, 362},{719, 711},{547, 665},{595, 197},{332, 144},
                {581, 555},{196, 862},{6,   837},{400, 924},{888, 148},{785, 730},
                {374, 358},{440,  69},{704, 318},{646, 506},{238, 662},{233,  56},
                {622, 572},{563, 903},{744, 672},{904, 646},{390, 325},{536, 491},
                {676, 186},{467, 145},{790, 114},{437, 793},{853, 243},{947, 196},
                {395, 728},{527, 148},{516, 675},{632, 562},{52,  552},{605, 580},
                {790, 865},{156, 87}, {584, 290},{339, 921},{383, 633},{106, 373},
                {762, 863},{424, 149},{608, 959},{574, 711},{468, 664},{268,  77},
                {894, 850},{171, 102},{203, 565},{592, 549},{86,  486},{526, 244},
                {323, 575},{488, 842},{401, 618},{148,  43},{828, 314},{554, 711},
                {685, 868},{387, 435},{469, 828},{623, 506},{436, 184},{450, 156},
                {805, 517},{465, 997},{728, 802},{231, 438},{935, 438},{519, 856},
                {378, 579},{73,  765},{223, 219},{359, 317},{686, 742},{17,  790},
                {20,   35},{410, 644},{984, 325},{503, 882},{900, 187},{578, 968},
                {27,  718},{355, 704},{395, 332},{641, 548},{964, 374},{215, 472},
                {323,  66},{882, 542},{671, 327},{650, 193},{828, 632},{760, 929},
                {607, 335},{928, 826},{462, 598},{631, 411}
        };

        return new AAOptions()
                .title(new AATitle()
                        .text("Logarithmic Axis Scatter Chart"))
                .chart(new AAChart()
                        .type(AAChartType.Scatter))
                .xAxis(new AAXAxis()
                        .type(AAChartAxisType.Logarithmic)
                        .min(1)
                        .max(1000)
//                            .endOnTick(true)
                        .tickInterval(1)
                        .minorTickInterval(0.1)
                        .gridLineWidth(1))
                .yAxis(new AAYAxis()
                        .type(AAChartAxisType.Logarithmic)
                        .min(1)
                        .max(1000)
                        .tickInterval(1)
                        .minorTickInterval(0.1)
                        .gridLineWidth(1)
                        .title(null))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .marker(aaMarker)
                                .data(scatterData)
                });
    }


    }

