package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.R;

public class AAChartModelListActivity extends AppCompatActivity {
    private static final String kChartTypeKey = "chartType";

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
                    "Spline Chart---曲线图",
            },
            /*特殊类型图表*/
            {
                    "Polar Column Chart---玫瑰图",
                    "Polar Bar Chart---径向条形图",
                    "Polar Line Chart---蜘蛛图",
                    "Polar Area Chart---雷达图",
                    "Step Line Chart--- 直方折线图",
                    "Step Area Chart--- 直方折线填充图",
                    "Pie Chart---扇形图",
                    "Bubble Chart---气泡图",
                    "Scatter Chart---散点图",
                    "Arearange Chart---区域范围图",
                    "Columnrange Chart--- 柱形范围图",
                    "Boxplot Chart--- 箱线图",
                    "Waterfall Chart--- 瀑布图",
                    "Pyramid Chart---金字塔图",
                    "Funnel Chart---漏斗图",
                    "Errorbar Chart---误差图",
                    "Gauge Chart---仪表图",
                    "Polygon Chart---多边形图"
            },
            /*Mixed Chart---混合图*/
            {
                    "arearangeMixedLine---区域范围填充图混合折线图",
                    "columnrangeMixedLine---柱形范围填充图混合折线图",
                    "stackingColumnMixedLine---堆积柱形填充图混合折线图",
                    "dashStyleTypeMixed---虚线风格混合折线图",
                    "negativeColorMixed---负数颜色混合折线图",
                    "scatterMixedLine---散点图混合折线图",
                    "negativeColorMixedBubble---负数颜色混合气泡图",
                    "polygonMixedScatter---多边形图混合散点图",
                    "polarChartMixed---极地图混合图",
                    "configurePieMixedLineMixedColumnChart---配置饼图混合折线柱形图",
                    "configureNegativeColorMixedAreasplineChart---配置负数颜色混合曲线填充图",
                    "configureAerasplinerangeMixedColumnrangeMixedLineChart---配置曲线填充图混合柱形范围填充图混合折线图",
            },
            /*自定义样式图表*/
            {
                    "colorfulChart---彩色图",
                    "gradientColorfulChart---渐变色图",
                    "discontinuousDataChart---数值不连续图",
                    "colorfulColumnChart---彩色柱形图",
                    "nightingaleRoseChart---南丁格尔玫瑰图",
                    "chartWithShadowStyle---带阴影样式图表",
                    "colorfulGradientAreaChart---彩色渐变填充图",
                    "colorfulGradientSplineChart---彩色渐变曲线图",
                    "gradientColorAreasplineChart---渐变色填充图",
                    "SpecialStyleMarkerOfSingleDataElementChart---单个数据元素 marker 特殊样式图表",
                    "SpecialStyleColumnOfSingleDataElementChart---单个数据元素特殊样式柱形图",
                    "AreaChartThreshold---区域图阈值",
                    "customScatterChartMarkerSymbolContent---自定义散点图 marker 特殊样式图表",
                    "customLineChartMarkerSymbolContent---自定义折线图 marker 特殊样式图表",
                    "TriangleRadarChart---三角形雷达图",
                    "QuadrangleRadarChart---四边形雷达图",
                    "PentagonRadarChart---五边形雷达图",
                    "HexagonRadarChart---六边形雷达图",
                    "adjustYAxisMaxAndMinValues---调整 X 轴和 Y 轴最大值",
                    "custom Special Style DataLabel Of Single Data Element Chart---指定单个数据元素的 DataLabel 为特殊样式",
                    "custom Bar Chart Hover Color and Select Color---自定义条形图手指滑动颜色和单个长条被选中颜色",
                    "custom Line Chart Chart Hover And Select Halo Style---自定义直线图手指略过和选中的 Halo 样式",
                    "custom Spline Chart Marker States Hover Style---自定义曲线图手指略过时的 Marker 样式",
                    "splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle---曲线图手指掠过时的线条不变化且自定义 Marker 样式",
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
                    "customColumnChartBorderStyleAndStatesHoverColor---自定义柱状图 border 样式及手指掠过图表 series 元素时的柱形颜色",

                    "customLineChartWithColorfulMarkersAndLines---彩色连接点和连接线的折线图📈",
                    "customLineChartWithColorfulMarkersAndLines2---彩色连接点和连接线的多组折线的折线图📈",
                    "drawLineChartWithPointsCoordinates---通过点坐标来绘制折线图",
                    "configureSpecialStyleColumnForNegativeDataMixedPositiveData---为正负数混合的柱形图自定义特殊样式效果",
                    "configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart---多层次半透明渐变效果的曲线填充图混合折线图📈",
                    "connectNullsForSingleAASeriesElement---为单个 AASeriesElement 单独设置是否断点重连",
                    "lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement---不同 series 元素数据量差异较大的折线图📈",
                    "customAreasplineChartWithColorfulGradientColorZones---彩色分区渐变填充区域图📈",
                    "largeDataStackingColumnChart---大数据量的堆积柱状图📊",

            },
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
                    AAChartType.Bar,
                    AAChartType.Line,
                    AAChartType.Area,
                    AAChartType.Pie,
                    AAChartType.Bubble,
                    AAChartType.Scatter,
                    AAChartType.Arearange,
                    AAChartType.Columnrange,
                    AAChartType.Scatter,
                    AAChartType.Areaspline,
                    AAChartType.Boxplot,
                    AAChartType.Waterfall,
                    AAChartType.Pyramid,
                    AAChartType.Funnel,
                    AAChartType.Errorbar,
                    AAChartType.Gauge,
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
                    "configurePieMixedLineMixedColumnChart",
                    "configureNegativeColorMixedAreasplineChart",
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
                    "splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle",
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
                    "customColumnChartBorderStyleAndStatesHoverColor",

                    "customLineChartWithColorfulMarkersAndLines",
                    "customLineChartWithColorfulMarkersAndLines2",
                    "drawLineChartWithPointsCoordinates",
                    "configureSpecialStyleColumnForNegativeDataMixedPositiveData",
                    "configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart",
                    "connectNullsForSingleAASeriesElement",
                    "lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement",
                    "customAreasplineChartWithColorfulGradientColorZones",
                    "largeDataStackingColumnChart"

            },
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa_chart_model_list);
        setupTabLayout();
        setupExpandableListView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 确保返回时第一个 tab 被选中
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab firstTab = tabLayout.getTabAt(0);
        if (firstTab != null && !firstTab.isSelected()) {
            firstTab.select();
        }
    }

    void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        // 默认选中第一个 tab (AAChartModel)
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 1:
                        startActivity(new Intent(AAChartModelListActivity.this, AAOptionsListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 2:
                        startActivity(new Intent(AAChartModelListActivity.this, MainActivity.class)
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
                "Basic Type Chart | 基础类型图表",
                "Special Type Chart | 特殊类型图表",
                "Mixed Chart | 混合图形",
                "Custom Style Chart | 一些自定义风格样式图表",
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.exlist_lol);
        MyBaseExpandableListAdapter myAdapter = new MyBaseExpandableListAdapter(groupTitleArr, chartTypeNameArr, this);
        listView.setAdapter(myAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) {
                String chartType = chartTypeArr[groupPosition][childPosition];
                switch (groupPosition) {
                    case 0: /*基础类型图表*/
                        goToCommonChartActivity(chartType, childPosition);
                        break;
                    case 1: /*特殊类型图表*/
                        goToSpecialChartActivity(chartType);
                        break;
                    case 2: /*Mixed Chart---混合图*/
                        goToMixedChartActivity(chartType);
                        break;
                    case 3: /*自定义样式图表*/
                        goToCustomStyleChartActivity(chartType);
                        break;
                }

                Toast.makeText(AAChartModelListActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    void goToCommonChartActivity(String chartType, int position) {
        Intent intent = new Intent(this, BasicChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position", position);
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
}
