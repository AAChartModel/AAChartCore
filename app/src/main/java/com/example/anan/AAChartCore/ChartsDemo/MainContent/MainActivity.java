package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DoubleChartsLinkedWorkActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFormatterFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DrawChartWithAAOptionsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.EvaluateJSStringFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.HideOrShowChartSeriesActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.OnlyRefreshChartDataActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.ScrollableChartActivity;
import com.example.anan.AAChartCore.R;


public class MainActivity extends AppCompatActivity {
    private static final String  kChartTypeKey = "chartType";

    private String[] data = {
            /*基础类型图表*/
            "/*基础类型图表*/Column Chart---柱形图--------------",
            "Bar Chart---条形图",
            "Area Chart---折线填充图",
            "Areaspline Chart---曲线填充图",
            "Step Area Chart--- 直方折线填充图",
            "Step Line Chart--- 直方折线图",
            "Line Chart---折线图",
            "Spline Chart---曲线图",
            /*特殊类型图表*/
            "/*特殊类型图表*/Polar Chart---极地图图-------------",
            "Pie Chart---扇形图",
            "Bubble Chart---气泡图",
            "Scatter Chart---散点图",
            "Arearange Chart---区域范围图",
            "Columnrange Chart--- 柱形范围图",
            "Step Line Chart--- 直方折线图",
            "Step Area Chart--- 直方折线填充图",
            "Boxplot Chart--- 箱线图",
            "Waterfall Chart--- 瀑布图",
            "Pyramid Chart---金字塔图",
            "Funnel Chart---漏斗图",
            "Errorbar Chart---误差图",
            /*Mixed Chart---混合图*/
            "/*Mixed Chart---混合图*/arearangeMixedLine-----------------",
            "columnrangeMixedLine",
            "stackingColumnMixedLine",
            "dashStyleTypeMixed",
            "negativeColorMixed",
            "scatterMixedLine",
            "negativeColorMixedBubble",
            "polygonMixedScatter",
            "polarChartMixed",
            /*自定义样式图表*/
            "/*自定义样式图表*/colorfulChart-----------------",
            "gradientColorfulChart",
            "discontinuousDataChart",
            "colorfulColumnChart",
            "nightingaleRoseChart",
            "chartWithShadowStyle",
            "colorfulGradientAreaChart",
            "colorfulGradientSplineChart",
            "gradientColorAreasplineChart",
            "SpecialStyleMarkerOfSingleDataElementChart",
            "SpecialStyleColumnOfSingleDataElementChart",
            "AreaChartThreshold",
            "customScatterChartMarkerSymbolContent",
            "customLineChartMarkerSymbolContent",
            "TriangleRadarChart",
            "QuadrangleRadarChart",
            "PentagonRadarChart",
            "HexagonRadarChart",
            /*使用AAOptions绘制图表*/
            "/*使用AAOptions绘制图表*/customLegendStyle-----------------",
            "drawChartWithOptionsOne",
            "AAPlotLinesForChart",
            "customAATooltipWithJSFunction",
            "customXAxisCrosshairStyle",
            "XAxisLabelsFontColorWithHTMLString",
            "XAxisLabelsFontColorAndFontSizeWithHTMLString",
            "_DataLabels_XAXis_YAxis_Legend_Style",
            "XAxisPlotBand",
            "configureTheMirrorColumnChart",
            "configureDoubleYAxisChartOptions",
            "configureTripleYAxesMixedChart",
            "customLineChartDataLabelsFormat",
            "configureDoubleYAxesAndColumnLineMixedChart",
            "configureDoubleYAxesMarketDepthChart",
            "customAreaChartTooltipStyleLikeHTMLTable",
            "simpleGaugeChart",
            "gaugeChartWithPlotBand",
            /*即时刷新📈📊图表数据*/
            "/*即时刷新📈📊图表数据*/Column Chart---柱形图--------------",
            "Bar Chart---条形图",
            "Area Chart---折线填充图",
            "Areaspline Chart---曲线填充图",
            "Step Area Chart--- 直方折线填充图",
            "Step Line Chart--- 直方折线图",
            "Line Chart---折线图",
            "Spline Chart---曲线图",
            "Scatter Chart---散点图",
            /*自定义 formatter 函数*/
            "/*自定义 formatter 函数*/简单字符串拼接-----------------",
            "自定义不同单位后缀",
            "值为0时,在tooltip中不显示",
            "自定义多彩颜色文字",
            "自定义箱线图的浮动提示框头部内容",
            "自定义Y轴文字",
            "自定义Y轴文字2",
            "自定义分组堆积柱状图tooltip内容",
            "双 X 轴镜像图表",
            "customArearangeChartTooltip---自定义折线范围图的tooltip",
            "调整折线图的 X 轴左边距",
            "通过来自外部的数据源来自定义 tooltip (而非常规的来自图表的 series)",
            /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
            "执行 js function 函数eval JS function 1--------------------",
            "eval JS function 2",
            "eval JS function 3",
            /*Double Charts Linked Work---双表联动*/
            "doubleChartsLinkedWork----------------------------",
            /*Scrollable Chart---可滚动图表*/
            "/*Scrollable Chart---可滚动图表*/Column Chart---柱形图--------------",
            "Bar Chart---条形图",
            "Area Chart---折线填充图",
            "Areaspline Chart---曲线填充图",
            "Step Area Chart--- 直方折线填充图",
            "Step Line Chart--- 直方折线图",
            "Line Chart---折线图",
            "Spline Chart---曲线图",
    };

    String[] chartTypeArr = {
            /*基础类型图表*/
            AAChartType.Column,
            AAChartType.Bar,
            AAChartType.Area,
            AAChartType.Areaspline,
            AAChartType.Area,
            AAChartType.Line,
            AAChartType.Line,
            AAChartType.Spline,
            /*特殊类型图表*/
            AAChartType.Column,
            AAChartType.Pie,
            AAChartType.Bubble,
            AAChartType.Scatter,
            AAChartType.Arearange,
            AAChartType.Columnrange,
            AAChartType.Line,
            AAChartType.Area,
            AAChartType.Boxplot,
            AAChartType.Waterfall,
            AAChartType.Pyramid,
            AAChartType.Funnel,
            AAChartType.Errorbar,
            /*Mixed Chart---混合图*/
            "arearangeMixedLine",
            "columnrangeMixedLine",
            "stackingColumnMixedLine",
            "dashStyleTypeMixed",
            "negativeColorMixed",
            "scatterMixedLine",
            "negativeColorMixedBubble",
            "polygonMixedScatter",
            "polarChartMixed",
            /*自定义样式图表*/
            "colorfulChart",
            "gradientColorfulChart",
            "discontinuousDataChart",
            "colorfulColumnChart",
            "nightingaleRoseChart",
            "chartWithShadowStyle",
            "colorfulGradientAreaChart",
            "colorfulGradientSplineChart",
            "gradientColorAreasplineChart",
            "SpecialStyleMarkerOfSingleDataElementChart",
            "SpecialStyleColumnOfSingleDataElementChart",
            "AreaChartThreshold",
            "customScatterChartMarkerSymbolContent",
            "customLineChartMarkerSymbolContent",
            "TriangleRadarChart",
            "QuadrangleRadarChart",
            "PentagonRadarChart",
            "HexagonRadarChart",
            /*使用AAOptions绘制图表*/
            "customLegendStyle",
            "AAPlotBandsForChart",
            "AAPlotLinesForChart",
            "customAATooltipWithJSFunction",
            "customXAxisCrosshairStyle",
            "XAxisLabelsFontColorWithHTMLString",
            "XAxisLabelsFontColorAndFontSizeWithHTMLString",
            "_DataLabels_XAXis_YAxis_Legend_Style",
            "XAxisPlotBand",
            "configureTheMirrorColumnChart",
            "configureDoubleYAxisChartOptions",
            "configureTripleYAxesMixedChart",
            "customLineChartDataLabelsFormat",
            "configureDoubleYAxesAndColumnLineMixedChart",
            "configureDoubleYAxesMarketDepthChart",
            "customAreaChartTooltipStyleLikeHTMLTable",
            "simpleGaugeChart",
            "gaugeChartWithPlotBand",
            /*即时刷新📈📊图表数据*/
            AAChartType.Column,
            AAChartType.Bar,
            AAChartType.Area,
            AAChartType.Areaspline,
            "stepArea",
            "stepLine",
            AAChartType.Line,
            AAChartType.Spline,
            AAChartType.Scatter,
            /*自定义 formatter 函数*/
            "formatterFunction1",
            "formatterFunction2",
            "formatterFunction3",
            "formatterFunction4",
            "formatterFunction5",
            "customYAxisLabels",
            "customYAxisLabels2",
            "customStackedAndGroupedColumnChartTooltip",
            "customDoubleXAxesChart",
            "customArearangeChartTooltip",
            "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter",
            "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries",
            /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
            "evalJSFunction1",
            "evalJSFunction2",
            "evalJSFunction3",
            /*Double Charts Linked Work---双表联动*/
            "doubleChartsLinkedWork",
            /*Scrollable Chart---可滚动图表*/
            AAChartType.Column,
            AAChartType.Bar,
            AAChartType.Area,
            AAChartType.Areaspline,
            AAChartType.Area,
            AAChartType.Line,
            AAChartType.Line,
            AAChartType.Spline,


    };
    private String chartType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position,
                                    long id) {
                System.out.println(position);
                if (position <= 7 ) {/*基础类型图表*/
                    goToCommonChartActivity(position);
                } else if (position <= 20) {/*特殊类型图表*/
                    goToSpecialChartActivity(position);
                } else if (position <= 29) { /*Mixed Chart---混合图*/
                    goToMixedChartActivity(position);
                } else if (position <= 47)  {/*自定义样式图表*/
                    goToCustomStyleChartActivity(position);
                } else if (position <= 65){/*使用AAOptions绘制图表*/
                    goToDrawChartWithAAOptionsActivity(position);
                } else if (position <= 74 ) { /*即时刷新📈📊图表数据*/
                    goToOnlyRefreshChartDataActivity(position);
                } else if (position <= 87) {/*formatter js function*/
                    goToCustomTooltipWithJSFunctionActivity(position);
                } else if (position <= 89)  { /*eval JS Function*/
                    goToEvaluateJSStringFunctionActivity(position);
                } else if (position <= 91){ /*Double Charts Linked Work*/
                    goToDoubleChartsLinkedWorkActivity(position);
                } else if (position <= 98) {/*Scrollable Chart---可滚动图表*/
                    gotoScrollableChartActivity(position);
                }
            }

        });
    }

    void goToCommonChartActivity(int position) {
        Intent intent = new Intent(this, BasicChartActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);
        intent.putExtra("position",position);

        startActivity(intent);
    }

    void goToSpecialChartActivity(int position) {
        Intent intent = new Intent(this, SpecialChartActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToCustomStyleChartActivity(int position) {
        Intent intent = new Intent(this, CustomStyleChartActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToMixedChartActivity(int position) {
        Intent intent = new Intent(this, MixedChartActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToDrawChartWithAAOptionsActivity(int position) {
        Intent intent = new Intent(this, DrawChartWithAAOptionsActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToOnlyRefreshChartDataActivity(int position) {
        Intent intent = new Intent(this, OnlyRefreshChartDataActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToCustomTooltipWithJSFunctionActivity(int position) {
        Intent intent = new Intent(this, JSFormatterFunctionActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToEvaluateJSStringFunctionActivity(int position) {
        Intent intent = new Intent(this, EvaluateJSStringFunctionActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToHideOrShowChartSeriesActivity(int position) {
        Intent intent = new Intent(this, HideOrShowChartSeriesActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void goToDoubleChartsLinkedWorkActivity(int position) {
        Intent intent = new Intent(this, DoubleChartsLinkedWorkActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);

        startActivity(intent);
    }

    void gotoScrollableChartActivity(int position) {
        Intent intent = new Intent(this, ScrollableChartActivity.class);
        intent.putExtra(kChartTypeKey, chartTypeArr[position]);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    }



