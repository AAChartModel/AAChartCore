package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.AdvancedUpdatingFeatureActivity;
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

    private String[][] chartTypeNameArr = {
            /*基础类型图表*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",},
            /*特殊类型图表*/
            {
                    "Polar Chart---极地图图",
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
                    "Errorbar Chart---误差图",},
            /*Mixed Chart---混合图*/
            {
                    "arearangeMixedLine",
                    "columnrangeMixedLine",
                    "stackingColumnMixedLine",
                    "dashStyleTypeMixed",
                    "negativeColorMixed",
                    "scatterMixedLine",
                    "negativeColorMixedBubble",
                    "polygonMixedScatter",
                    "polarChartMixed",},
            /*自定义样式图表*/
            {
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
                    "adjustYAxisMaxAndMinValues---调整 X 轴和 Y 轴最大值",
                    "custom Special Style DataLabel Of Single Data Element Chart---指定单个数据元素的 DataLabel 为特殊样式",
                    "custom Bar Chart Hover Color and Select Colorc---自定义条形图手指滑动颜色和单个长条被选中颜色",
                    "custom Line Chart Chart Hover And Select Halo Style---自定义直线图手指略过和选中的 Halo 样式",
                    "custom Spline Chart Marker States Hover Style---自定义曲线图手指略过时的 Marker 样式",
                    "customNormalStackingChartDataLabelsContentAndStyle---自定义堆积柱状图 DataLabels 的内容及样式",
                    "upsideDownPyramidChart---倒立的金字塔图",
                    "doubleLayerPieChart---双层嵌套扇形图",
                    "disableSomeOfLinesMouseTrackingEffect---针对部分数据列关闭鼠标或手指跟踪行为",
                    "configureColorfulShadowChart---彩色阴影效果的曲线图",
                    "configureColorfulDataLabelsStepLineChart---彩色 DataLabels 的直方折线图",
                    "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart---彩色渐变效果且彩色 DataLabels 的直方折线填充图",
                    "disableSplineChartMarkerHoverEffect---禁用曲线图的手指滑动 marker 点的光圈变化放大的效果",
                    "configureMaxAndMinDataLabelsForChart---为图表最大值最小值添加 DataLabels 标记",
                    "customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag---通过 HTML 的换行标签来实现图表的 X 轴的 分类文字标签的换行效果",
                    "noMoreGroupingAndOverlapEachOtherColumnChart---不分组的相互重叠柱状图📊",
                    "noMoreGroupingAndNestedColumnChart---不分组的嵌套柱状图📊",
                    "topRoundedCornersStackingColumnChart---顶部为圆角的堆积柱状图📊",
                    "freeStyleRoundedCornersStackingColumnChart---各个圆角自由独立设置的堆积柱状图📊",
            },
            /*使用AAOptions绘制图表*/
            {
                    "customLegendStyle",
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
                    "gaugeChartWithPlotBand",},
            /*即时刷新📈📊图表数据*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",
                    "Scatter Chart---散点图",},
            /*图表高级更新功能*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",},
            /*自定义 formatter 函数*/
            {
                    "简单字符串拼接",
                    "自定义不同单位后缀",
                    "自定义多彩颜色文字",
                    "值为0时,在tooltip中不显示",
                    "自定义箱线图的浮动提示框头部内容",
                    "自定义Y轴文字",
                    "自定义Y轴文字2",
                    "自定义分组堆积柱状图tooltip内容",
                    "双 X 轴镜像图表",
                    "customArearangeChartTooltip---自定义折线范围图的tooltip",
                    "调整折线图的 X 轴左边距",
                    "通过来自外部的数据源来自定义 tooltip (而非常规的来自图表的 series)",},
            /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
            {
                    "eval JS function 1",
                    "eval JS function 2",
                    "eval JS function 3",},
            /*Double Charts Linked Work---双表联动*/
            {
                    "doubleChartsLinkedWork",},
            /*Scrollable Chart---可滚动图表*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",}
    };

    String[][] chartTypeArr = {
            {
                    /*基础类型图表*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    AAChartType.Area,
                    AAChartType.Line,
                    AAChartType.Line,
                    AAChartType.Spline,
            },
            {
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
            },
            {
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
            },
            {
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
                    "adjustYAxisMaxAndMinValues",
                    "customSpecialStyleDataLabelOfSingleDataElementChart",
                    "customBarChartHoverColorAndSelectColor",
                    "customChartHoverAndSelectHaloStyle",
                    "customSplineChartMarkerStatesHoverStyle",
                    "customNormalStackingChartDataLabelsContentAndStyle",
                    "upsideDownPyramidChart",
                    "doubleLayerPieChart",
                    "disableSomeOfLinesMouseTrackingEffect",
                    "configureColorfulShadowSplineChart",
                    "configureColorfulDataLabelsStepLineChart",
                    "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart",
                    "disableSplineChartMarkerHoverEffect",
                    "configureMaxAndMinDataLabelsForChart",
                    "customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag",
                    "noMoreGroupingAndOverlapEachOtherColumnChart",
                    "noMoreGroupingAndNestedColumnChart",
                    "topRoundedCornersStackingColumnChart",
                    "freeStyleRoundedCornersStackingColumnChart",
            },

            {
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
            },
            {
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
            },
            {
                    /*图表高级更新功能*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    AAChartType.Area,
                    AAChartType.Line,
                    AAChartType.Line,
                    AAChartType.Spline,
            },
            {
                    /*自定义 formatter 函数*/
                    "customAreaChartTooltipStyleWithSimpleFormatString",
                    "customAreaChartTooltipStyleWithDifferentUnitSuffix",
                    "customAreaChartTooltipStyleWithColorfulHtmlLabels",
                    "customLineChartTooltipStyleWhenValueBeZeroDoNotShow",
                    "customBoxplotTooltipContent",
                    "customYAxisLabels",
                    "customYAxisLabels2",
                    "customStackedAndGroupedColumnChartTooltip",
                    "customDoubleXAxesChart",
                    "customArearangeChartTooltip",
                    "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter",
                    "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries",
            },
            {
                    /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
                    "evalJSFunction1",
                    "evalJSFunction2",
                    "evalJSFunction3",
            },
            {
                    /*Double Charts Linked Work---双表联动*/
                    "doubleChartsLinkedWork",
            },
            {
                    /*Scrollable Chart---可滚动图表*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    AAChartType.Area,
                    AAChartType.Line,
                    AAChartType.Line,
                    AAChartType.Spline,
            },


    };

    private String chartType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupExpandableListView();
    }

    void  setupExpandableListView() {
        String[] groupTitleArr = {
                "Basic Type Chart --- 基础类型图表",
                "Special Type Chart --- 特殊类型图表",
                "Mixed Chart --- 混合图形",
                "Custom Style Chart---一些自定义风格样式图表",

                "Draw Chart With AAOptions---通过Options绘图",
                "Only Refresh data ---即时刷新图表数据",
                "Chart Options Advanced Updating---图表高级更新",
                "JS Function For AAOptionns ---通过带有 JS 函数的 Options 绘图",
                "Evaluate JS String Function---执行js函数",
                "Double Charts Linked Work---双表联动",
                "Scrollable chart ---可滚动の图表",
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.exlist_lol);
        MyBaseExpandableListAdapter myAdapter = new MyBaseExpandableListAdapter(groupTitleArr, chartTypeNameArr,this);
        listView.setAdapter(myAdapter);

        //为列表设置点击事件
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
               String chartType = chartTypeArr[groupPosition][childPosition];
                switch (groupPosition) {
                    case 0: /*基础类型图表*/
                        goToCommonChartActivity(chartType,childPosition);
                        break;
                    case 1: /*特殊类型图表*/
                        goToSpecialChartActivity(chartType);
                        break;
                    case 2:  /*Mixed Chart---混合图*/
                        goToMixedChartActivity(chartType);
                        break;
                    case 3: /*自定义样式图表*/
                        goToCustomStyleChartActivity(chartType);
                        break;
                    case 4: /*使用AAOptions绘制图表*/
                        goToDrawChartWithAAOptionsActivity(chartType);
                        break;
                    case 5: /*即时刷新📈📊图表数据*/
                        goToOnlyRefreshChartDataActivity(chartType);
                        break;
                    case 6: /*图表高级更新功能*/
                        goToAdvancedUpdatingFeatureActivity(chartType,childPosition);
                        break;
                    case 7: /*formatter js function*/
                        goToCustomTooltipWithJSFunctionActivity(chartType);
                        break;
                    case 8:  /*eval JS Function*/
                        goToEvaluateJSStringFunctionActivity(chartType);
                        break;
                    case 9:  /*Double Charts Linked Work*/
                        goToDoubleChartsLinkedWorkActivity(chartType);
                        break;
                    case 10: /*Scrollable Chart---可滚动图表*/
                        gotoScrollableChartActivity(chartType,childPosition);
                        break;
                }

                Toast.makeText(MainActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }


    void goToCommonChartActivity(String chartType, int position) {
        Intent intent = new Intent(this, BasicChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void goToSpecialChartActivity(String chartType) {
        Intent intent = new Intent(this, SpecialChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToCustomStyleChartActivity(String chartType) {
        Intent intent = new Intent(this, CustomStyleChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToMixedChartActivity(String chartType) {
        Intent intent = new Intent(this, MixedChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToDrawChartWithAAOptionsActivity(String chartType) {
        Intent intent = new Intent(this, DrawChartWithAAOptionsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToOnlyRefreshChartDataActivity(String chartType) {
        Intent intent = new Intent(this, OnlyRefreshChartDataActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToAdvancedUpdatingFeatureActivity(String chartType, int position) {
        Intent intent = new Intent(this, AdvancedUpdatingFeatureActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void goToCustomTooltipWithJSFunctionActivity(String chartType) {
        Intent intent = new Intent(this, JSFormatterFunctionActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToEvaluateJSStringFunctionActivity(String chartType) {
        Intent intent = new Intent(this, EvaluateJSStringFunctionActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToHideOrShowChartSeriesActivity(String chartType) {
        Intent intent = new Intent(this, HideOrShowChartSeriesActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToDoubleChartsLinkedWorkActivity(String chartType) {
        Intent intent = new Intent(this, DoubleChartsLinkedWorkActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void gotoScrollableChartActivity(String chartType, int position) {
        Intent intent = new Intent(this, ScrollableChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }


}



