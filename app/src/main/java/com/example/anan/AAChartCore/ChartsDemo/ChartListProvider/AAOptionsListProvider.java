package com.example.anan.AAChartCore.ChartsDemo.ChartListProvider;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.ChartOptionsComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAAxisComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAChartEventsComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAChartEventsComposer2;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAALegendComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAOptionsComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAATooltipComposer;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

public final class AAOptionsListProvider {

	private AAOptionsListProvider() {
	}

	public static OptionsBundle provideChartOptions(String category) {
		if (category == null) {
			return null;
		}
		switch (category) {
			case ChartCategories.OPTIONS:
				return provideGeneralOptionsBundle();
			case ChartCategories.JS_AXIS:
				return provideAxisOptionsBundle();
			case ChartCategories.JS_TOOLTIP:
				return provideTooltipOptionsBundle();
			case ChartCategories.JS_LEGEND:
				return provideLegendOptionsBundle();
			case ChartCategories.JS_OPTIONS:
				return provideOptionsFunctionBundle();
			case ChartCategories.JS_CHART_EVENTS:
				return provideChartEventsOptionsBundle();
			default:
				return null;
		}
	}

	private static OptionsBundle provideGeneralOptionsBundle() {
		AAOptions[] options = new AAOptions[]{
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
		return bundleWithGeneratedTitles("Chart Options", options);
	}

	private static OptionsBundle provideAxisOptionsBundle() {
		String[] titles = new String[]{
				"自定义Y轴文字",
				"自定义Y轴文字 (百分比)",
				"自定义X轴单位后缀 (formatter)",
				"自定义X轴单位后缀 (非formatter)",
				"双Y轴标签格式化示例一",
				"双Y轴标签格式化示例二",
				"双Y轴标签格式化示例三",
				"截取前四个字符作为X轴标签",
				"自定义蜘蛛图样式",
				"DataLabels格式化单元素",
				"X轴标签为图片"
		};
		AAOptions[] options = new AAOptions[]{
				JSFunctionForAAAxisComposer.customYAxisLabels(),
				JSFunctionForAAAxisComposer.customYAxisLabels2(),
				JSFunctionForAAAxisComposer.customAreaChartXAxisLabelsTextUnitSuffix1(),
				JSFunctionForAAAxisComposer.customAreaChartXAxisLabelsTextUnitSuffix2(),
				JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart(),
				JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart2(),
				JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart3(),
				JSFunctionForAAAxisComposer.customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters(),
				JSFunctionForAAAxisComposer.customSpiderChartStyle(),
				JSFunctionForAAAxisComposer.customizeEveryDataLabelSinglelyByDataLabelsFormatter(),
				JSFunctionForAAAxisComposer.customXAxisLabelsBeImages()
		};
		return bundle(titles, options, "JS Axis");
	}

	private static OptionsBundle provideTooltipOptionsBundle() {
		String[] titles = new String[]{
				"区域图Tooltip简单格式",
				"区域图Tooltip不同单位后缀",
				"区域图Tooltip多彩HTML",
				"折线图值为0时不显示",
				"箱形图Tooltip",
				"堆叠分组柱状图Tooltip",
				"面积范围图Tooltip",
				"原始点位还原",
				"外部数据源Tooltip",
				"自定义Tooltip定位函数",
				"固定位置Tooltip",
				"绘图区外复杂Tooltip",
				"通过Point事件禁用反选",
				"自定义CSS样式Tooltip",
				"饼图显示0数据",
				"自定义柱状图边框与Hover"
		};
		AAOptions[] options = new AAOptions[]{
				JSFunctionForAATooltipComposer.customAreaChartTooltipStyleWithSimpleFormatString(),
				JSFunctionForAATooltipComposer.customAreaChartTooltipStyleWithDifferentUnitSuffix(),
				JSFunctionForAATooltipComposer.customAreaChartTooltipStyleWithColorfulHtmlLabels(),
				JSFunctionForAATooltipComposer.customLineChartTooltipStyleWhenValueBeZeroDoNotShow(),
				JSFunctionForAATooltipComposer.customBoxplotTooltipContent(),
				JSFunctionForAATooltipComposer.customStackedAndGroupedColumnChartTooltip(),
				JSFunctionForAATooltipComposer.customArearangeChartTooltip(),
				JSFunctionForAATooltipComposer.customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter(),
				JSFunctionForAATooltipComposer.customTooltipWhichDataSourceComeFromOutSideRatherThanSeries(),
				JSFunctionForAATooltipComposer.customTooltipPostionerFunction(),
				JSFunctionForAATooltipComposer.fixedTooltipPositionByCustomPositionerFunction(),
				JSFunctionForAATooltipComposer.customPlotAreaOutsideComlicatedTooltipStyle(),
				JSFunctionForAATooltipComposer.disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction(),
				JSFunctionForAATooltipComposer.customAreasplineChartTooltipStyleByDivWithCSS(),
				JSFunctionForAATooltipComposer.makePieChartShow0Data(),
				JSFunctionForAATooltipComposer.customColumnChartBorderStyleAndStatesHoverColor()
		};
		return bundle(titles, options, "JS Tooltip");
	}

	private static OptionsBundle provideLegendOptionsBundle() {
		String[] titles = new String[]{
				"禁用普通图例点击",
				"禁用饼图图例点击",
				"自定义图例点击事件"
		};
		AAOptions[] options = new AAOptions[]{
				JSFunctionForAALegendComposer.disableLegendClickEventForNormalChart(),
				JSFunctionForAALegendComposer.disableLegendClickEventForPieChart(),
				JSFunctionForAALegendComposer.customLegendItemClickEvent()
		};
		return bundle(titles, options, "JS Legend");
	}

	private static OptionsBundle provideOptionsFunctionBundle() {
		String[] titles = new String[]{
				"自定义双X轴图表",
				"禁用柱状图反选事件",
				"DataLabels单元素自定义",
				"验证绘制前后回调"
		};
		AAOptions[] options = new AAOptions[]{
				JSFunctionForAAOptionsComposer.customDoubleXAxesChart(),
				JSFunctionForAAOptionsComposer.disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction(),
				JSFunctionForAAOptionsComposer.customizeEveryDataLabelSinglelyByDataLabelsFormatter(),
				JSFunctionForAAOptionsComposer.verifyBeforeAndAfterDrawJavaScriptCallbacks()
		};
		return bundle(titles, options, "JS Options");
	}

	private static OptionsBundle provideChartEventsOptionsBundle() {
		String[] titles = new String[]{
				"加载后设置默认十字准星",
				"自由绘图",
				"高级时间线图",
				"闪烁标记点",
				"单点闪烁特效",
				"散点图闪烁特效",
				"自动隐藏Tooltip",
				"动态高度网格线区域图",
				"自定义Y轴PlotLines标签",
				"ECG样式图表"
		};
		AAOptions[] options = new AAOptions[]{
				JSFunctionForAAChartEventsComposer.setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart(),
				JSFunctionForAAChartEventsComposer.generalDrawingChart(),
				JSFunctionForAAChartEventsComposer.advancedTimeLineChart(),
				JSFunctionForAAChartEventsComposer.configureBlinkMarkerChart(),
				JSFunctionForAAChartEventsComposer.configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect(),
				JSFunctionForAAChartEventsComposer.configureScatterChartWithBlinkEffect(),
				JSFunctionForAAChartEventsComposer.automaticallyHideTooltipAfterItIsShown(),
				JSFunctionForAAChartEventsComposer.dynamicHeightGridLineAreaChart(),
				JSFunctionForAAChartEventsComposer.customizeYAxisPlotLinesLabelBeSpecialStyle(),
				JSFunctionForAAChartEventsComposer2.disableHoverEventTooltipEffect()
		};
		return bundle(titles, options, "JS Events");
	}

	private static OptionsBundle bundle(String[] titles, AAOptions[] options, String fallbackPrefix) {
		if (titles == null || titles.length != options.length) {
			return bundleWithGeneratedTitles(fallbackPrefix, options);
		}
		return new OptionsBundle(titles, options);
	}

	private static OptionsBundle bundleWithGeneratedTitles(String prefix, AAOptions[] options) {
		String[] titles = new String[options.length];
		for (int i = 0; i < options.length; i++) {
			titles[i] = prefix + " " + (i + 1);
		}
		return new OptionsBundle(titles, options);
	}

	public static final class OptionsBundle {
		public final String[] titles;
		public final AAOptions[] options;

		private OptionsBundle(String[] titles, AAOptions[] options) {
			this.titles = titles;
			this.options = options;
		}
	}
}
