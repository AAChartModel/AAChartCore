package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAScrollablePlotArea;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASubtitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAJSStringPurer;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;
import com.example.anan.AAChartCore.R;

import java.util.Map;

public class ScrollableChartActivity extends AppCompatActivity {
    private AAChartView aaChartView1;
    private AAChartModel aaChartModel;
    private AAOptions aaOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scollable_chart);

        aaChartView1 = findViewById(R.id.AAChartView1);

        AAChartModel aaChartModel = configureChartModel();
        if (aaOptions == null) {
            aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        }

        aaChartView1.aa_drawChartWithChartOptions(aaOptions);
    }


    private AAChartModel configureChartModel() {
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");
        int position = intent.getIntExtra("position",0);

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(chartType)
                .title("")
                .yAxisTitle("")
                .legendEnabled(false)
                .yAxisGridLineWidth(0f)
                .scrollablePlotArea(
                        new AAScrollablePlotArea()
                                .minWidth(3000)
                                .scrollPositionX(1f)
                )
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(configureSeriesDataArray())

                });
        this.aaChartModel = aaChartModel;

        configureTheStyleForDifferentTypeChart(chartType,position);
        return aaChartModel;
    }


    void configureTheStyleForDifferentTypeChart(String chartType,int position) {
        if ((chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Line))
                && (position == 93 || position == 94)) {
            configureStepAreaChartAndStepLineChart();
        } else if (chartType.equals(AAChartType.Column) || chartType.equals(AAChartType.Bar)) {
            configureColumnChartAndBarChartStyle();
        } else if (chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Areaspline)) {
            configureAreaChartAndAreasplineChartStyle(chartType);
        } else if (chartType.equals(AAChartType.Line) || chartType.equals(AAChartType.Spline)) {
            configureLineChartAndSplineChartStyle(chartType);
        }

    }

    private void configureStepAreaChartAndStepLineChart() {
        AASeriesElement element1 = new AASeriesElement()
                .name("Tokyo")
                .step(true)
                .data(new Object[]{149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4});

        AASeriesElement element2 = new AASeriesElement()
                .name("NewYork")
                .step(true)
                .data(new Object[]{83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3});

        AASeriesElement element3 = new AASeriesElement()
                .name("London")
                .step(true)
                .data(new Object[]{48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2});

        aaChartModel.series(new AASeriesElement[]{element1, element2, element3});
    }

    private void configureColumnChartAndBarChartStyle() {
        if (aaChartModel.chartType.equals(AAChartType.Bar) ) {
            String pureJSStr = AAJSStringPurer.pureJavaScriptFunctionString(
                    "Source: <a href=\"https://highcharts.uservoice.com/forums/55896-highcharts-javascript-api\">UserVoice</a>");

            AASeriesElement element = new AASeriesElement()
                    .data(new Object[][]{
                            {"Gantt chart", 1000},
                            {"Autocalculation and plotting of trend lines", 575},
                            {"Allow navigator to have multiple data series", 523},
                            {"Implement dynamic font size", 427},
                            {"Multiple axis alignment control", 399},
                            {"Stacked area (spline etc) in irregular datetime series", 309},
                            {"Adapt chart height to legend height", 278},
                            {"Export charts in excel sheet", 239},
                            {"Toggle legend box", 235},
                            {"Venn Diagram", 203},
                            {"Add ability to change Rangeselector position", 182},
                            {"Draggable legend box", 157},
                            {"Sankey Diagram", 149},
                            {"Add Navigation bar for Y-Axis in Highstock", 144},
                            {"Grouped x-axis", 143},
                            {"ReactJS plugin", 137},
                            {"3D surface charts", 134},
                            {"Draw lines over a stock chart, for analysis purpose", 118},
                            {"Data module for database tables", 118},
                            {"Draggable points", 117}
                    });

            AAOptions aaOptions = new AAOptions()
                    .chart(new AAChart()
                            .type(AAChartType.Bar)
                            .scrollablePlotArea(
                                    new AAScrollablePlotArea()
                                            .minHeight(900)
                            ))
                    .title(new AATitle()
                            .text("Most popular ideas by April 2016"))
                    .subtitle(new AASubtitle()
                            .text(pureJSStr))
                    .xAxis(new AAXAxis()
                                    .type("category"))
                    .series(new AASeriesElement[]{element});
            this.aaOptions = aaOptions;
        } else {
            aaChartModel
                    .categories(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"})
                    .legendEnabled(true)
                    .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"})
                    .animationType(AAChartAnimationType.EaseOutCubic)
                    .animationDuration(1200);
        }
    }

    private void configureAreaChartAndAreasplineChartStyle(String chartType) {
        aaChartModel
                .animationType(AAChartAnimationType.EaseOutQuart)
                .legendEnabled(true)
                .markerRadius(5f)
                .markerSymbol(AAChartSymbolType.Circle)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank);

        if (chartType.equals(AAChartType.Areaspline)) {
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

            aaChartModel
                    .animationType(AAChartAnimationType.EaseFrom)//设置图表渲染动画类型为 EaseFrom
                    .series(new AASeriesElement[]{element1, element2, element3, element4});
        }
    }

    private void configureLineChartAndSplineChartStyle(String chartType) {
        aaChartModel
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//设置折线连接点样式为:边缘白色
                .markerRadius(6f);
        if (chartType.equals(AAChartType.Line)) {
            AASeriesElement element1 = new AASeriesElement()
                    .name("Hestavollane")
                    .data(new Object[]{0.2, 0.8, 0.8, 0.8, 1, 1.3, 1.5, 2.9, 1.9, 2.6, 1.6, 3, 4, 3.6,
                            5.5, 6.2, 5.5, 4.5, 4, 3.1, 2.7, 4, 2.7, 2.3, 2.3, 4.1, 7.7, 7.1,
                            5.6, 6.1, 5.8, 8.6, 7.2, 9, 10.9, 11.5, 11.6, 11.1, 12, 12.3, 10.7,
                            9.4, 9.8, 9.6, 9.8, 9.5, 8.5, 7.4, 7.6});

            AASeriesElement element2 = new AASeriesElement()
                    .name("Vik")
                    .data(new Object[]{0, 0, 0.6, 0.9, 0.8, 0.2, 0, 0, 0, 0.1, 0.6, 0.7, 0.8, 0.6, 0.2,
                            0, 0.1, 0.3, 0.3, 0, 0.1, 0, 0, 0, 0.2, 0.1, 0, 0.3, 0, 0.1, 0.2,
                            0.1, 0.3, 0.3, 0, 3.1, 3.1, 2.5, 1.5, 1.9, 2.1, 1, 2.3, 1.9, 1.2,
                            0.7, 1.3, 0.4, 0.3});

            aaChartModel
                    .series(new AASeriesElement[]{element1,element2});

        } else if (chartType.equals(AAChartType.Spline)) {
            AASeriesElement element1 = new AASeriesElement()
                    .name("Tokyo")
                    .lineWidth(7f)
                    .data(new Object[]{50, 320, 230, 370, 230, 400,});

            AASeriesElement element2 = new AASeriesElement()
                    .name("Berlin")
                    .lineWidth(7f)
                    .data(new Object[]{80, 390, 210, 340, 240, 350,});

            AASeriesElement element3 = new AASeriesElement()
                    .name("New York")
                    .lineWidth(7f)
                    .data(new Object[]{100, 370, 180, 280, 260, 300,});

            AASeriesElement element4 = new AASeriesElement()
                    .name("London")
                    .lineWidth(7f)
                    .data(new Object[]{130, 350, 160, 310, 250, 268,});

            aaChartModel
                    .animationType(AAChartAnimationType.SwingFromTo)
                    .series(new AASeriesElement[]{element1, element2, element3, element4});

        }
    }


    private AADataElement[] configureSeriesDataArray() {
        int maxRange = 388;
        AADataElement[] numberArr1 = new AADataElement[maxRange];

        double y1;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01;
            AADataElement aaDataElement = new AADataElement()
                    .y((float) y1);

            numberArr1[i] = aaDataElement;
        }

        return numberArr1;
    }

}
