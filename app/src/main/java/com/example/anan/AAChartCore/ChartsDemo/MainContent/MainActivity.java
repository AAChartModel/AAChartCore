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
                    "configureSpecialStyleColumnForNegativeDataMixedPositiveData---为正负数混合的柱形图自定义特殊样式效果"
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

            /*通过 JSFunction 自定义 AAChartEvents 的事件*/
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
            }
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
                    /*通过 JSFunction 自定义 AAChartEvents 的事件*/
                    "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart",
                    "generalDrawingChart",
                    "advancedTimeLineChart",
                    "configureBlinkMarkerChart",
                    "configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect",
                    "configureScatterChartWithBlinkEffect",
                    "automaticallyHideTooltipAfterItIsShown",
                    "dynamicHeightGridLineAreaChart",
                    "customizeYAxisPlotLinesLabelBeSpecialStyle",

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
                "Basic Type Chart | 基础类型图表",
                "Special Type Chart | 特殊类型图表",
                "Mixed Chart | 混合图形",
                "Custom Style Chart | 一些自定义风格样式图表",
                "Draw Chart With AAOptions | 通过Options绘图",
                "Only Refresh data | 即时刷新图表数据",
                "Chart Options Advanced Updating | 图表高级更新",
                "JS Function For AAOptions | 通过带有 JS 函数的 Options 绘图",
                "Evaluate JS String Function | 执行js函数",
                "Double Charts Linked Work | 双表联动",
                "Scrollable chart | 可滚动的图表",
                "JS Function For AAChartEvents---通过 JSFunction 自定义 AAChartEvents 的事件",
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
                    case 11: /*JS Function For AAChartEvents---通过 JSFunction 自定义 AAChartEvents 的事件*/
                        gotoJSFunctionForAAChartEventsActivity(chartType,childPosition);
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

    void gotoJSFunctionForAAChartEventsActivity(String chartType, int position) {
        Intent intent = new Intent(this, JSFunctionForAAChartEventsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }


}



