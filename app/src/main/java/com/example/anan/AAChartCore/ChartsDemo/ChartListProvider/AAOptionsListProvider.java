package com.example.anan.AAChartCore.ChartsDemo.ChartListProvider;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.ChartOptionsComposer;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

public final class AAOptionsListProvider {

	private AAOptionsListProvider() {
		// Utility class
	}

	public static AAOptions[] provideChartOptions() {
		return new AAOptions[]{
				ChartOptionsComposer.customChartLegendStyle(),
				ChartOptionsComposer.configureAAPlotBandsForChart(),
				ChartOptionsComposer.configureAAPlotLinesForChart(),
				ChartOptionsComposer.customAATooltipWithJSFunction(),
				ChartOptionsComposer.customXAxisCrosshairStyle(),
				ChartOptionsComposer.configureXAxisLabelsFontColorWithHTMLString(),
				ChartOptionsComposer.configureXAxisLabelsFontColorAndFontSizeWithHTMLString(),
				ChartOptionsComposer.configure_DataLabels_XAXis_YAxis_Legend_Style(),
				ChartOptionsComposer.configureXAxisPlotBand(),
				ChartOptionsComposer.configureTheMirrorColumnChart(),
				ChartOptionsComposer.configureDoubleYAxisChartOptions(),
				ChartOptionsComposer.configureTripleYAxesMixedChart(),
				ChartOptionsComposer.customLineChartDataLabelsFormat(),
				ChartOptionsComposer.configureDoubleYAxesAndColumnLineMixedChart(),
				ChartOptionsComposer.configureDoubleYAxesMarketDepthChart(),
				ChartOptionsComposer.customAreaChartTooltipStyleLikeHTMLTable(),
				ChartOptionsComposer.simpleGaugeChart(),
				ChartOptionsComposer.gaugeChartWithPlotBand(),
				ChartOptionsComposer.doubleLayerHalfPieChart(),
				ChartOptionsComposer.customAreasplineChartTooltipContentWithHeaderFormat(),
				ChartOptionsComposer.customAreaChartTooltipStyleWithTotalValueHeader(),
				ChartOptionsComposer.configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart(),
				ChartOptionsComposer.timeDataWithIrregularIntervalsChart(),
				ChartOptionsComposer.logarithmicAxisLineChart(),
				ChartOptionsComposer.logarithmicAxisScatterChart(),
				ChartOptionsComposer.disableMixedChartInactiveAnimationEffect(),
				ChartOptionsComposer.adjustBubbleChartMinAndMax(),
				ChartOptionsComposer.customLineChartDataLabelsFormat2(),
				ChartOptionsComposer.complicatedScatterChart(),
				ChartOptionsComposer.customColumnrangeChartGroupStyleAndSeriesStatesHoverColor(),
				ChartOptionsComposer.customTitleStyle(),
				ChartOptionsComposer.configureBoxplotChartWithSpecialStyle()
		};
	}
}
