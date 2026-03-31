package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAATooltipActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAAxisActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAALegendActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAChartEventsActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.JSFunctionForAAOptionsActivity;
import com.example.anan.AAChartCore.R;

public class AAOptionsWithJSListActivity extends AppCompatActivity {
    private static final String kChartTypeKey = "chartType";

    private String[][] chartTypeNameArr = {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa_options_with_js_list);
        setupTabLayout();
        setupExpandableListView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab tab = tabLayout.getTabAt(2);
        if (tab != null && !tab.isSelected()) {
            tab.select();
        }
    }

    void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab jsTab = tabLayout.getTabAt(2);
        if (jsTab != null) {
            jsTab.select();
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        startActivity(new Intent(AAOptionsWithJSListActivity.this, AAChartModelListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 1:
                        startActivity(new Intent(AAOptionsWithJSListActivity.this, AAOptionsListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 3:
                        startActivity(new Intent(AAOptionsWithJSListActivity.this, MainActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                onTabSelected(tab);
            }
        });
    }

    void setupExpandableListView() {
        String[] groupTitleArr = {
                "JS Function For AATooltip | 通过带有 JS 函数的 Options 绘图",
                "JS Function For AAAxis Labels | 通过带有 JS 函数的自定义 AAAxis 的文字标签",
                "JS Function For AALegend | 通过带有 JS 函数的自定义 AALegend",
                "JS Function For AAChartEvents---通过 JSFunction 自定义 AAChartEvents 的事件",
                "JS Function For AAOptions---通过 JSFunction 自定义 AAOptions 内容",
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.exlist_lol);
        MyBaseExpandableListAdapter myAdapter = new MyBaseExpandableListAdapter(groupTitleArr, chartTypeNameArr, this);
        listView.setAdapter(myAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) {
                String chartType = chartTypeArr[groupPosition][childPosition];
                switch (groupPosition) {
                    case 0: /*自定义 formatter 函数*/
                        goToCustomTooltipWithJSFunctionActivity(chartType);
                        break;
                    case 1: /*JS Function For AAAxis Labels*/
                        gotoJSFunctionForAAAxisActivity(chartType, childPosition);
                        break;
                    case 2: /*JS Function For AALegend*/
                        gotoJSFunctionForAALegendActivity(chartType, childPosition);
                        break;
                    case 3: /*JS Function For AAChartEvents*/
                        gotoJSFunctionForAAChartEventsActivity(chartType, childPosition);
                        break;
                    case 4: /*JS Function For AAOptions*/
                        gotoJSFunctionForAAOptionsActivity(chartType, childPosition);
                        break;
                }

                Toast.makeText(AAOptionsWithJSListActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    void goToCustomTooltipWithJSFunctionActivity(String chartType) {
        Intent intent = new Intent(this, JSFunctionForAATooltipActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void gotoJSFunctionForAAAxisActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAAxisActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position", position);
        startActivity(intent);
    }

    void gotoJSFunctionForAALegendActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAALegendActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position", position);
        startActivity(intent);
    }

    void gotoJSFunctionForAAChartEventsActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAChartEventsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position", position);
        startActivity(intent);
    }

    void gotoJSFunctionForAAOptionsActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAOptionsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
