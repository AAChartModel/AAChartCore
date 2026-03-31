package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.AdvancedUpdatingFeatureActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DoubleChartsLinkedWorkActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAAxisActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAALegendActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAOptionsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAATooltipActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DrawChartWithAAOptionsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.EvaluateJSStringFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.HideOrShowChartSeriesActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAChartEventsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.OnlyRefreshChartDataActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.ScrollableChartActivity;
import com.example.anan.AAChartCore.R;


public class MainActivity extends AppCompatActivity {
    private static final String  kChartTypeKey = "chartType";

    private String[][] chartTypeNameArr = {
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
                    "gaugeChartWithPlotBand",
                    "doubleLayerHalfPieChart",
                    "customAreasplineChartTooltipContentWithHeaderFormat---通过 tooltip 的 headerFormat 属性来自定义 曲线填充图的 tooltip",
                    "customAreaChartTooltipStyleWithTotalValueHeader---浮动提示框 header 显示总值信息",
                    "configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart---自定义 Y 轴的 Labels 国际单位符基数及国际单位符",
                    "timeDataWithIrregularIntervalsChart---X 轴时间不连续的折线图",
                    "logarithmicAxisLineChart---对数轴折线图📈",
                    "logarithmicAxisScatterChart---对数轴散点图",
                    "disableMixedChartInactiveAnimationEffect---禁用混合图表的 inactive 动画效果",
                    "adjustBubbleChartMinAndMax---调整气泡图的 min 和 max 相关属性",
                    "customLineChartDataLabelsFormat---自定义曲线图的 DataLabels 的 format 属性",
                    "customLineChartDataLabelsFormat2---自定义曲线图的 DataLabels 的 format 属性(更简易方法)",
                    "complicatedScatterChart---复杂的自定义散点图",
                    "customColumnrangeChartGroupStyleAndSeriesStatesHoverColor---自定义柱状图 group 样式及 series 元素时的柱形颜色",
                    "customTitleStyle---自定义标题样式",
                    "configureBoxplotChartWithSpecialStyle---自定义盒须图样式",

            },
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

                    "自定义分组堆积柱状图tooltip内容",
                    "customArearangeChartTooltip---自定义折线范围图的tooltip",
                    "调整折线图的 X 轴左边距",
                    "通过来自外部的数据源来自定义 tooltip (而非常规的来自图表的 series)",
                    "customTooltipPostionerFunction---自定义浮动提示框 Positioner 函数",

                    "fixedTooltipPositionByCustomPositionerFunction---通过 Positioner 函数来实现一个位置固定的提示框",
                    "customPlotAreaOutsideComlicatedTooltipStyle---通过 Positioner 函数来实现绘图区外的复杂浮动提示框样式",
                    "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction---通过 Series 的 Point 的选中事件函数来禁用条形图反选效果",
                    "customAreasplineChartTooltipStyleByDivWithCSS---通过自定义 div 的 css 样式来自定义复杂效果的 tooltip 浮动提示框",
                    "makePieChartShow0Data---使饼图显示为 0 的数据",

                    "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart---图表加载完成后, 在指定位置默认显示 crosshair 和 tooltip",
                    "customColumnChartBorderStyleAndStatesHoverColor---自定义📊柱状图的 border 样式和手指或鼠标 hover 时的显示效果",
            },
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
                    "Spline Chart---曲线图",},

            /*JS Function For AAAXis Labels*/
            {
                    "customYAxisLabels---自定义Y轴文字",
                    "customYAxisLabels2---自定义Y轴文字2",
                    "customAreaChartXAxisLabelsTextUnitSuffix1---自定义X轴文字单位后缀(通过 formatter 函数)",
                    "customAreaChartXAxisLabelsTextUnitSuffix2---自定义X轴文字单位后缀(不通过 formatter 函数)",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart---配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 1",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart2---配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 2",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart3---配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 3",
                    "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters---通过截取前四个字符来自定义 X 轴 labels",
                    "customSpiderChartStyle---自定义蜘蛛🕷🕸图样式",
                    "customizeEveryDataLabelSinglelyByDataLabelsFormatter---通过 DataLabels 的 formatter 函数来实现单个数据标签🏷自定义",
                    "customXAxisLabelsBeImages---自定义 X轴 labels 为一组图片",
            },
            /*JS Function For AALegend*/
            {
                    "disableLegendClickEventForNormalChart---禁用常规图表 legend 点击事件",
                    "disableLegendClickEventForPieChart---禁用饼图 legend 点击事件",
                    "customLegendItemClickEvent---自定义图例 legend 的点击事件",
            },
            /*JS Function For AAChartEvents*/
            {
                    "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart---图表加载完成后设置 crosshair 和 tooltip 到默认位置",
                    "generalDrawingChart---普通绘图",
                    "advancedTimeLineChart---高级时间轴绘图",
                    "configureBlinkMarkerChart---配置闪烁特效的 marker 图表",
                    "configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect---配置闪烁特效的 marker 图表2",
                    "configureScatterChartWithBlinkEffect---配置闪烁特效的散点图",
                    "automaticallyHideTooltipAfterItIsShown---在浮动提示框显示后自动隐藏",
                    "dynamicHeightGridLineAreaChart---动态高度的网格线区域填充图",
                    "customizeYAxisPlotLinesLabelBeSpecialStyle---自定义 Y 轴轴线上面的标签文字特殊样式",
                    "configureECGStyleChart---配置心电图样式的图表",
            },
            /*JS Function For AAOptions*/
            {
                    "customDoubleXAxesChart---自定义双 X 轴图表",
                    "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction---通过 Series 的 Point 的选中事件函数来禁用条形图反选效果",
                    "customizeEveryDataLabelSinglelyByDataLabelsFormatter---通过 formatter 来自定义单个 dataLabels 元素",
                    "configureColorfulDataLabelsForPieChart---为饼图配置多彩 dataLabels"
            },
    };

    String[][] chartTypeArr = {
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
                    "doubleLayerHalfPieChart",
                    "customAreasplineChartTooltipContentWithHeaderFormat",
                    "customAreaChartTooltipStyleWithTotalValueHeader",
                    "configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart",
                    "timeDataWithIrregularIntervalsChart",
                    "logarithmicAxisLineChart",
                    "logarithmicAxisScatterChart",
                    "disableMixedChartInactiveAnimationEffect",
                    "adjustBubbleChartMinAndMax",
                    "customLineChartDataLabelsFormat",
                    "customLineChartDataLabelsFormat2",
                    "complicatedScatterChart",
                    "customColumnrangeChartGroupStyleAndSeriesStatesHoverColor",
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

                    "customStackedAndGroupedColumnChartTooltip",
                    "customArearangeChartTooltip",
                    "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter",
                    "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries",
                    "customTooltipPostionerFunction",

                    "fixedTooltipPositionByCustomPositionerFunction",
                    "customPlotAreaOutsideComlicatedTooltipStyle",
                    "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction",
                    "customAreasplineChartTooltipStyleByDivWithCSS",
                    "makePieChartShow0Data",

                    "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters",
                    "customColumnChartBorderStyleAndStatesHoverColor",
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

            {
                    /*JS Function For AAAXis Labels*/
                    "customYAxisLabels",
                    "customYAxisLabels2",
                    "customAreaChartXAxisLabelsTextUnitSuffix1",
                    "customAreaChartXAxisLabelsTextUnitSuffix2",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart2",
                    "configureTheAxesLabelsFormattersOfDoubleYAxesChart3",
                    "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters",
                    "customSpiderChartStyle",
                    "customizeEveryDataLabelSinglelyByDataLabelsFormatter",
                    "customXAxisLabelsBeImages",
            },

            {
                    /*JS Function For AALegend*/
                    "disableLegendClickEventForNormalChart",
                    "disableLegendClickEventForPieChart",
                    "customLegendItemClickEvent",
            },

            {
                    /*JS Function For AAChartEvents*/
                    "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart",
                    "generalDrawingChart",
                    "advancedTimeLineChart",
                    "configureBlinkMarkerChart",
                    "configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect",
                    "configureScatterChartWithBlinkEffect",
                    "automaticallyHideTooltipAfterItIsShown",
                    "dynamicHeightGridLineAreaChart",
                    "customizeYAxisPlotLinesLabelBeSpecialStyle",
                    "configureECGStyleChart",
            },

            {
                    /*JS Function For AAOptions*/
                    "customDoubleXAxesChart",
                    "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction",
                    "customizeEveryDataLabelSinglelyByDataLabelsFormatter",
                    "configureColorfulDataLabelsForPieChart"
            },

    };

    private String chartType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTabLayout();
        setupExpandableListView();

        findViewById(R.id.show_chart_list_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChartCategorySelectionActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 确保返回时第二个 tab 被选中
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab secondTab = tabLayout.getTabAt(1);
        if (secondTab != null && !secondTab.isSelected()) {
            secondTab.select();
        }
    }

    void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        // 默认选中第二个 tab (AAOptions)
        TabLayout.Tab aaOptionsTab = tabLayout.getTabAt(1);
        if (aaOptionsTab != null) {
            aaOptionsTab.select();
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    // 切换到 AAChartModel 页面
                    Intent intent = new Intent(MainActivity.this, AAChartModelListActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    Intent intent = new Intent(MainActivity.this, AAChartModelListActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                }
            }
        });
    }

    void  setupExpandableListView() {
        String[] groupTitleArr = {
                "Draw Chart With AAOptions | 通过Options绘图",
                "Only Refresh data | 即时刷新图表数据",
                "Chart Options Advanced Updating | 图表高级更新",
                "JS Function For AAOptions | 通过带有 JS 函数的 Options 绘图",
                "Evaluate JS String Function | 执行js函数",
                "Double Charts Linked Work | 双表联动",
                "Scrollable chart | 可滚动的图表",
                "JS Function For AAAxis Labels | 通过带有 JS 函数的自定义 AAAxis 的文字标签",
                "JS Function For AALegend | 通过带有 JS 函数的自定义 AALegend",
                "JS Function For AAChartEvents---通过 JSFunction 自定义 AAChartEvents 的事件",
                "JS Function For AAOptions---通过 JSFunction 自定义 AAOptions 内容",
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
                    case 0: /*使用AAOptions绘制图表*/
                        goToDrawChartWithAAOptionsActivity(chartType);
                        break;
                    case 1: /*即时刷新📈📊图表数据*/
                        goToOnlyRefreshChartDataActivity(chartType);
                        break;
                    case 2: /*图表高级更新功能*/
                        goToAdvancedUpdatingFeatureActivity(chartType,childPosition);
                        break;
                    case 3: /*formatter js function*/
                        goToCustomTooltipWithJSFunctionActivity(chartType);
                        break;
                    case 4:  /*eval JS Function*/
                        goToEvaluateJSStringFunctionActivity(chartType);
                        break;
                    case 5:  /*Double Charts Linked Work*/
                        goToDoubleChartsLinkedWorkActivity(chartType);
                        break;
                    case 6: /*Scrollable Chart---可滚动图表*/
                        gotoScrollableChartActivity(chartType,childPosition);
                        break;
                    case 7: /*JJS Function For AAAxis Labels | 通过带有 JS 函数的自定义 AAAxis 的文字标签*/
                        gotoJSFunctionForAAAxisActivity(chartType,childPosition);
                        break;
                    case 8: /*JS Function For AALegend | 通过带有 JS 函数的自定义 AALegend*/
                        gotoJSFunctionForAALegendActivity(chartType,childPosition);
                        break;
                    case 9: /*JS Function For AAChartEvents---通过 JSFunction 自定义 AAChartEvents 的事件*/
                        gotoJSFunctionForAAChartEventsActivity(chartType,childPosition);
                        break;
                    case 10: /*JS Function For AAOptions---通过 JSFunction 自定义 AAOptions 内容*/
                        gotoJSFunctionForAAOptionsActivity(chartType,childPosition);
                        break;

                }

                Toast.makeText(MainActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
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
        Intent intent = new Intent(this, JSFunctionForAATooltipActivity.class);
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

    void gotoJSFunctionForAAAxisActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAAxisActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void gotoJSFunctionForAALegendActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAALegendActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void gotoJSFunctionForAAChartEventsActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAChartEventsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void gotoJSFunctionForAAOptionsActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAOptionsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }


}



