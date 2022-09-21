package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.ChartOptionsComposer.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

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

    private AAOptions configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "customLegendStyle":
                return customChartLegendStyle();
            case "AAPlotBandsForChart":
                return configureAAPlotBandsForChart();
            case "AAPlotLinesForChart":
                return configureAAPlotLinesForChart();
            case "customAATooltipWithJSFunction":
                return customAATooltipWithJSFunction();
            case "customXAxisCrosshairStyle":
                return customXAxisCrosshairStyle();
            case "XAxisLabelsFontColorWithHTMLString":
                return configureXAxisLabelsFontColorWithHTMLString();
            case "XAxisLabelsFontColorAndFontSizeWithHTMLString":
                return configureXAxisLabelsFontColorAndFontSizeWithHTMLString();
            case "_DataLabels_XAXis_YAxis_Legend_Style":
                return configure_DataLabels_XAXis_YAxis_Legend_Style();
            case "XAxisPlotBand":
                return configureXAxisPlotBand();
            case "configureTheMirrorColumnChart":
                return configureTheMirrorColumnChart();
            case "configureDoubleYAxisChartOptions":
                return configureDoubleYAxisChartOptions();
            case "configureTripleYAxesMixedChart":
                return configureTripleYAxesMixedChart();
            case "customLineChartDataLabelsFormat":
                return customLineChartDataLabelsFormat();
            case "configureDoubleYAxesAndColumnLineMixedChart":
                return configureDoubleYAxesAndColumnLineMixedChart();
            case "configureDoubleYAxesMarketDepthChart":
                return configureDoubleYAxesMarketDepthChart();
            case "customAreaChartTooltipStyleLikeHTMLTable":
                return customAreaChartTooltipStyleLikeHTMLTable();
            case "simpleGaugeChart":
                return simpleGaugeChart();
            case "gaugeChartWithPlotBand":
                return gaugeChartWithPlotBand();

            case "doubleLayerHalfPieChart":
                return doubleLayerHalfPieChart();
            case "customAreasplineChartTooltipContentWithHeaderFormat":
                return customAreasplineChartTooltipContentWithHeaderFormat(); //通过 tooltip 的 headerFormat 属性来自定义 曲线填充图的 to
            case "customAreaChartTooltipStyleWithTotalValueHeader":
                return customAreaChartTooltipStyleWithTotalValueHeader(); //浮动提示框 header 显示总值信息
            case "configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart":
                return configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart(); //自定义 Y 轴的 Labels 国际单位符基数及国际单位符
            case "timeDataWithIrregularIntervalsChart":
                return timeDataWithIrregularIntervalsChart(); //X 轴时间不连续的折线图
            case "logarithmicAxisLineChart":
                return logarithmicAxisLineChart(); //对数轴折线图📈
            case "logarithmicAxisScatterChart":
                return logarithmicAxisScatterChart(); //对数轴散点图
            case "disableMixedChartInactiveAnimationEffect":
                return disableMixedChartInactiveAnimationEffect(); //禁用混合图表的 inactive 动画效果
            case "adjustBubbleChartMinAndMax":
                return adjustBubbleChartMinAndMax(); //调整气泡图的 min 和 max 相关属性
            case "customLineChartDataLabelsFormat1":
                return customLineChartDataLabelsFormat(); //自定义曲线图的 DataLabels 的 format 属性
            case "customLineChartDataLabelsFormat2":
                return customLineChartDataLabelsFormat2(); //自定义曲线图的 DataLabels 的 format 属性(更简易方法)
            case "complicatedScatterChart":
                return complicatedScatterChart(); //复杂的自定义散点图
            case "customColumnrangeChartGroupStyleAndSeriesStatesHoverColor":
                return customColumnrangeChartGroupStyleAndSeriesStatesHoverColor(); //自定义柱状图的 groupStyle 和 seriesStates hoverColor 属性
            case "customTitleStyle":
                return customTitleStyle(); //自定义标题样式
            case "configureBoxplotChartWithSpecialStyle":
                return configureBoxplotChartWithSpecialStyle(); //自定义盒须图样式


        }
        return configureAAPlotBandsForChart();
    }
}