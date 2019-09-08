package com.example.anan.chartcore_slim.ChartsDemo.AdditionalContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartLineDashStyleType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AACrosshair;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AADataLabels;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAItemStyle;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AALabel;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAPlotBandsElement;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAPlotLinesElement;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.chartcore_slim.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.chartcore_slim.AAChartCoreLib.AATools.AAColor;
import com.example.anan.chartcore_slim.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.chartcore_slim.AAChartCoreLib.AATools.AALinearGradientDirection;
import com.example.anan.chartcore_slim.R;

import java.util.HashMap;
import java.util.Map;

public class DrawChartWithAAOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_chart_with_aaoptions);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        AAOptions aaOptions = configureTheChartOptions(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);

    }

    AAOptions configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "configureAAPlotBandsForChart": return  configureAAPlotBandsForChart();
            case "configureAAPlotLinesForChart": return configureAAPlotLinesForChart();
            case "customAATooltipWithJSFuntion": return customAATooltipWithJSFuntion();
            case "customXAxisCrosshairStyle": return customXAxisCrosshairStyle();
            case "configureXAxisLabelsFontColorWithHTMLString": return configureXAxisLabelsFontColorWithHTMLString();
            case "configureXAxisLabelsFontColorAndFontSizeWithHTMLString": return configureXAxisLabelsFontColorAndFontSizeWithHTMLString();
            case "configure_DataLabels_XAXis_YAxis_Legend_Style": return configure_DataLabels_XAXis_YAxis_Legend_Style();
            case "configureXAxisPlotBand": return configureXAxisPlotBand();
        }
        return configureAAPlotBandsForChart();
    }

    AAOptions configureAAPlotBandsForChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Spline)//图形类型
                .dataLabelsEnabled(false)
                .markerRadius(0f)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .color(AAColor.whiteColor())
                                .lineWidth(10.0f),
                });

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AAPlotBandsElement[] aaPlotBandsElementArr = new AAPlotBandsElement[]{
                new AAPlotBandsElement()
                        .from(0.f)
                        .to(5.f)
                        .color("#BC2B44")
                ,
                new AAPlotBandsElement()
                        .from(5.f)
                        .to(10.f)
                        .color("#EC6444")
                ,
                new AAPlotBandsElement()
                        .from(10.f)
                        .to(15.f)
                        .color("#f19742")
                ,
                new AAPlotBandsElement()
                        .from(15.f)
                        .to(20.f)
                        .color("#f3da60")
                ,
                new AAPlotBandsElement()
                        .from(20.f)
                        .to(25.f)
                        .color("#9bd040")
                ,
                new AAPlotBandsElement()
                        .from(25.f)
                        .to(50.f)
                        .color("#acf08f")
                ,
        };

        AAYAxis aaYAxis = aaOptions.yAxis;
        aaYAxis.plotBands(aaPlotBandsElementArr);
        return aaOptions;
    }

    AAOptions configureAAPlotLinesForChart() {
        Map map1 = new HashMap();
        map1.put("value",12);
        map1.put("color","#1e90ff");
        Map map2 = new HashMap();
        map2.put("value",24);
        map2.put("color","#ef476f");
        Map map3 = new HashMap();
        map3.put("value",36);
        map3.put("color","#04d69f");
        Map map4 = new HashMap();
        map4.put("color","#ffd066");
        Map[] zonesArr = new Map[]{map1,map2,map3,map4};

        AAChartModel aaChartModel = new  AAChartModel()
                .chartType(AAChartType.Areaspline)//图形类型
                .dataLabelsEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] {7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .fillOpacity(0.5f)
                                .lineWidth(10f)
                                .zones(zonesArr)
                });

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AAPlotLinesElement[] aaPlotLinesElementsArr = new AAPlotLinesElement[] {
                new AAPlotLinesElement()
                        .color("#1e90ff")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDashDotDot)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1f)) //标示线粗细
                        .value((12f)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .text("PLOT LINES ONE")
                        .style(new AAStyle()
                                .color("#1e90ff")
                                .fontWeight("bold")
                        )
                )
                ,
                new AAPlotLinesElement()
                        .color("#ef476f")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDashDot)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1f)) //标示线粗细
                        .value((24f)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .text("PLOT LINES TWO")
                        .style(new AAStyle()
                                .color("#ef476f")
                                .fontWeight("bold")
                        )
                )
                ,
                new AAPlotLinesElement()
                        .color("#1e90ff")//颜色值(16进制)
                        .dashStyle(AAChartLineDashStyleType.LongDash)//样式：Dash,Dot,Solid等,默认Solid
                        .width((1f)) //标示线粗细
                        .value((36f)) //所在位置
                        .zIndex((1)) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                        .label(new AALabel()
                        .text("PLOT LINES THREE")
                        .style(new AAStyle()
                                .color("#04d69f")
                                .fontWeight("bold")
                        )
                )
                ,
        };

        AAYAxis aaYAxis =  aaOptions.yAxis;
        aaYAxis.plotLines(aaPlotLinesElementsArr);
        return aaOptions;
    }

    AAOptions customAATooltipWithJSFuntion() {
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

    AAOptions customXAxisCrosshairStyle() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Line)//图表类型
                .series(new AASeriesElement[]{
                                new AASeriesElement()
                                        .name("2020")
                                        .color(AAGradientColor.deepSeaColor())
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
                        }
                );

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AACrosshair aaCrosshair = new AACrosshair()
                .color(AAColor.redColor())
                .width(1f)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot);
        AAXAxis aaXAxis =  aaOptions.xAxis;
        aaXAxis.crosshair(aaCrosshair);
        return aaOptions;
    }

    AAOptions configureXAxisLabelsFontColorWithHTMLString() {
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
                .title("")
                .subtitle("")
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0f)
                .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("Berlin Hot")
                                        .color(AAGradientColor.mysticMauveColor())
                                        .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                ,
                        }
                );

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.xAxis.labels.useHTML(true);
        return aaOptions;
    }

    AAOptions configureXAxisLabelsFontColorAndFontSizeWithHTMLString() {
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
                .title("")
                .subtitle("")
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0f)
                .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("Berlin Hot")
                                        .color(AAGradientColor.deepSeaColor())
                                        .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                ,
                        }
                );

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.xAxis.labels.useHTML(true);

        return aaOptions;
    }

    AAOptions configure_DataLabels_XAXis_YAxis_Legend_Style() {
        Map backgroundColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#4F00BC",
                "#29ABE2"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map fillColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "rgba(256,256,256,0.3)",
                "rgba(256,256,256,1.0)"//颜色字符串设置支持十六进制类型和 rgba 类型
        );


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .backgroundColor(backgroundColorGradientColor)
                .yAxisVisible(true)
                .yAxisTitle("")
                .categories(new String[] {"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .markerRadius(0f)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Berlin Hot")
                                .color(AAColor.whiteColor())
                                .lineWidth(7.f)
                                .fillColor(fillColorGradientColor)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                });
        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.plotOptions.areaspline
                .dataLabels(new AADataLabels()
                .enabled(true)
                .style(new AAStyle()
                        .color(AAColor.whiteColor())
                        .fontSize(14.f)
                        .fontWeight("thin")
                        .textOutline("0px 0px contrast")//文字轮廓描边
                ));


        AACrosshair aaCrosshair = new AACrosshair()
                .dashStyle(AAChartLineDashStyleType.LongDashDot)
                .color(AAColor.whiteColor())
                .width(1.f);

        AALabels aaLabels = new AALabels()
                .useHTML(true)
                .style(new AAStyle()
                        .fontSize(10.f)
                        .fontWeight("bold")
                        .color(AAColor.whiteColor())//轴文字颜色
                );

        aaOptions.yAxis
                .opposite(true)
                .tickWidth(2.f)
                .lineWidth(1.5f)//Y轴轴线颜色
                .lineColor(AAColor.whiteColor())//Y轴轴线颜色
                .gridLineWidth(0.f)//Y轴网格线宽度
                .crosshair(aaCrosshair)
                .labels(aaLabels
        );

        aaOptions.xAxis
                .tickWidth(2.f)//X轴刻度线宽度
                .lineWidth(1.5f)//X轴轴线宽度
                .lineColor(AAColor.whiteColor())//X轴轴线颜色
                .crosshair(aaCrosshair)
                .labels(aaLabels
        );


        //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
        /*默认是：{
         "color": "#333333",
         "cursor": "pointer",
         "fontSize": "12px",
         "fontWeight": "bold"
         }
         */

        aaOptions.legend
                .itemStyle( new AAItemStyle()
                        .color(AAColor.whiteColor())//字体颜色
                        .fontSize(13.f)//字体大小
                        .fontWeight("thin")//字体为细体字

        );

        return aaOptions;
    }


    AAOptions configureXAxisPlotBand() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .categories(new String[] {"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .yAxisTitle("")
                .yAxisGridLineWidth(0f)
                .markerRadius(8f)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(new AASeriesElement[] {
                        new AASeriesElement()
                                .name("New York Hot")
                                .lineWidth(5.0f)
                                .color("rgba(220,20,60,1)")////猩红色, alpha 透明度 1
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                        new AASeriesElement()
                                .type(AAChartType.Column)
                                .name("Berlin Hot")
                                .color("#25547c")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                });


        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AAPlotBandsElement[] aaPlotBandsElementArr = new AAPlotBandsElement[]{
                new AAPlotBandsElement()
                        .from(-0.25f)//值域颜色带X轴起始值
                        .to(4.75f)//值域颜色带X轴结束值
                        .color("#06caf4")//值域颜色带填充色
                        .zIndex(0)//层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                ,
                new AAPlotBandsElement()
                        .from(4.75f)
                        .to(8.25f)
                        .color("#ffd066")
                        .zIndex(0)
                ,
                new AAPlotBandsElement()
                        .from(8.25f)
                        .to(11.25f)
                        .color("#04d69f")
                        .zIndex(0)
                ,
        };

        AAXAxis aaXAxis =  aaOptions.xAxis;
        aaXAxis.plotBands(aaPlotBandsElementArr);

        return aaOptions;
    }
}
