package com.example.anan.chartcore_slim.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.AAChartConfiger.AAChartView;
import com.example.anan.chartcore_slim.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.chartcore_slim.AAChartConfiger.AASeriesElement;
import com.example.anan.chartcore_slim.AAOptionsModel.AACrosshair;
import com.example.anan.chartcore_slim.AAOptionsModel.AALabel;
import com.example.anan.chartcore_slim.AAOptionsModel.AAPlotBandsElement;
import com.example.anan.chartcore_slim.AAOptionsModel.AAPlotLinesElement;
import com.example.anan.chartcore_slim.AAOptionsModel.AAStyle;
import com.example.anan.chartcore_slim.AAOptionsModel.AATooltip;
import com.example.anan.chartcore_slim.AATools.AAColor;
import com.example.anan.chartcore_slim.AATools.AAGradientColor;
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

        HashMap aaOptions = configureTheChartOptions(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);
    }

    HashMap configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "configureAAPlotBandsForChart": return  configureAAPlotBandsForChart();
            case "configureAAPlotLinesForChart": return configureAAPlotLinesForChart();
            case "customAATooltipWithJSFuntion": return customAATooltipWithJSFuntion();
            case "customXAxisCrosshairStyle": return customXAxisCrosshairStyle();
        }
        return configureAAPlotBandsForChart();
    }

    HashMap<String,Object> configureAAPlotBandsForChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartModel.Type.Spline)//图形类型
                .dataLabelEnabled(false)
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .color(AAColor.whiteColor())
                                .lineWidth(10.0f),
                });

        HashMap<String,Object> aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
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

        HashMap<String,Object> aaYAxis = (HashMap<String, Object>) aaOptions.get("yAxis");
        aaYAxis.put("plotBands",aaPlotBandsElementArr);
        return aaOptions;
    }

    HashMap<String,Object> configureAAPlotLinesForChart() {
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
                .chartType(AAChartModel.Type.Areaspline)//图形类型
                .dataLabelEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] {7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .fillOpacity(0.5f)
                                .lineWidth(10f)
                .zones(zonesArr)
                });

        HashMap<String,Object> aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AAPlotLinesElement[] aaPlotLinesElementsArr = new AAPlotLinesElement[] {
               new AAPlotLinesElement()
                        .color("#1e90ff")//颜色值(16进制)
                        .dashStyle(AAChartModel.LineDashSyleType.LongDashDotDot)//样式：Dash,Dot,Solid等,默认Solid
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
                        .dashStyle(AAChartModel.LineDashSyleType.LongDashDot)//样式：Dash,Dot,Solid等,默认Solid
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
                        .dashStyle(AAChartModel.LineDashSyleType.LongDash)//样式：Dash,Dot,Solid等,默认Solid
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

        HashMap<String,Object> aaYAxis = (HashMap<String, Object>) aaOptions.get("yAxis");
        aaYAxis.put("plotLines",aaPlotLinesElementsArr);
        return aaOptions;
    }

    HashMap customAATooltipWithJSFuntion() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartModel.Type.Area)//图形类型
                .title("近三个月金价起伏周期图")//图表主标题
                .subtitle("金价(元/克)")//图表副标题
                .symbolStyle(AAChartModel.SymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
                .dataLabelEnabled(false)
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
                        .fontSize("12 px")
                );
        HashMap<String,Object> aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        aaOptions.put("tooltip",aaTooltip);
        return aaOptions;
    }

    HashMap customXAxisCrosshairStyle() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartModel.Type.Line)//图表类型
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

        HashMap<String,Object> aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        AACrosshair aaCrosshair = new AACrosshair()
                .color(AAColor.redColor())
                .width(1f)
                .dashStyle(AAChartModel.LineDashSyleType.LongDashDotDot);
        HashMap aaXAxis = (HashMap) aaOptions.get("xAxis");
        aaXAxis.put("crosshair",aaCrosshair);
        return aaOptions;
    }
}
