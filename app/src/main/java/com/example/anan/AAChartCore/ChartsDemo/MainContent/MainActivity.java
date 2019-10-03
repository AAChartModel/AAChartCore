package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.CustomTooltipWithJSFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DrawChartWithAAOptionsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.EvaluateJSStringFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.HideOrShowChartSeriesActivity;
import com.example.anan.AAChartCore.R;

public class MainActivity extends AppCompatActivity {
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
            "/*使用AAOptions绘制图表*/drawChartWithOptionsOne-----------------",
            "AAPlotLinesForChart",
            "customAATooltipWithJSFuntion",
            "customXAxisCrosshairStyle",
            "XAxisLabelsFontColorWithHTMLString",
            "XAxisLabelsFontColorAndFontSizeWithHTMLString",
            "_DataLabels_XAXis_YAxis_Legend_Style",
            "XAxisPlotBand",
            "configureTheMirrorColumnChart",
            /*隐藏或显示内容*/
            "/*隐藏或显示内容*/Column Chart---柱形图--------------",
            "Bar Chart---条形图",
            "Area Chart---折线填充图",
            "Areaspline Chart---曲线填充图",
            "Step Area Chart--- 直方折线填充图",
            "Step Line Chart--- 直方折线图",
            "Line Chart---折线图",
            "Spline Chart---曲线图",
            "简单字符串拼接",
            "自定义不同单位后缀",
            "值为0时,在tooltip中不显示",
            "自定义多彩颜色文字",
            "自定义箱线图的浮动提示框头部内容",
            /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
            "eval JS function 1--------------------",
            "eval JS function 2",
            "eval JS function 3"

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
            "AAPlotBandsForChart",
            "AAPlotLinesForChart",
            "customAATooltipWithJSFuntion",
            "customXAxisCrosshairStyle",
            "XAxisLabelsFontColorWithHTMLString",
            "XAxisLabelsFontColorAndFontSizeWithHTMLString",
            "_DataLabels_XAXis_YAxis_Legend_Style",
            "XAxisPlotBand",
            "configureTheMirrorColumnChart",
            /*隐藏或显示内容*/
            AAChartType.Column,
            AAChartType.Bar,
            AAChartType.Area,
            AAChartType.Areaspline,
            AAChartType.Area,
            AAChartType.Line,
            AAChartType.Line,
            AAChartType.Spline,
            "formatterFunction1",
            "formatterFunction2",
            "formatterFunction3",
            "formatterFunction4",
            "formatterFunction5",
            "evalJSFunction1",
            "evalJSFunction2",
            "evalJSFunction3"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position,
                                    long id) {
                System.out.println(position);
                if (position <= 7 ) {/*基础类型图表*/
                    goToCommonChartActivity(position);
                } else if (position > 7 && position <= 19 ) {/*特殊类型图表*/
                    goToSpecialChartActivity(position);
                } else if (position > 19 && position <= 28 ) { /*Mixed Chart---混合图*/
                    goToMixedChartActivity(position);
                } else if (position > 28 && position <= 46 )  {/*自定义样式图表*/
                    goToCustomStyleChartActivity(position);
                } else if (position > 46 && position <= 55){/*使用AAOptions绘制图表*/
                    goToDrawChartWithAAOptionsActivity(position);
                } else if (position > 55 && position <= 62 ) { /*隐藏或显示内容*/
                    goToHideOrShowChartSeriesActivity(position);
                } else if (position > 62 && position <= 65) {/*formatter js function*/
                    goToCustomTooltipWithJSFunctionActivity(position);
                } else if (position > 65) { /*eval JS Function*/
                    goToEvaluateJSStringFunctionActivity(position);
                }
            }

        });
    }

    void goToCommonChartActivity(int position) {
        Intent intent = new Intent(this, CommonChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);
        intent.putExtra("position",position);

        startActivity(intent);
    }

    void goToSpecialChartActivity(int position) {
        Intent intent = new Intent(this, SpecialChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToCustomStyleChartActivity(int position) {
        Intent intent = new Intent(this, CustomStyleChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToMixedChartActivity(int position) {
        Intent intent = new Intent(this, MixedChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToDrawChartWithAAOptionsActivity(int position) {
        Intent intent = new Intent(this, DrawChartWithAAOptionsActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToHideOrShowChartSeriesActivity(int position) {
        Intent intent = new Intent(this, HideOrShowChartSeriesActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToCustomTooltipWithJSFunctionActivity(int position) {
        Intent intent = new Intent(this, CustomTooltipWithJSFunctionActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToEvaluateJSStringFunctionActivity(int position) {
        Intent intent = new Intent(this, EvaluateJSStringFunctionActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }



    }



