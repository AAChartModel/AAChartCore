package com.example.anan.AAChartCore.ChartsDemo.ChartListProvider;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.BasicChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.CustomStyleChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.MixedChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.SpecialChartComposer;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;

public final class AAChartModelListProvider {

	private AAChartModelListProvider() {
		// Utility class
	}

	public static AAChartModel[] provideChartModels(String category) {
		if (category == null || ChartCategories.BASIC.equals(category)) {
			return provideBasicChartModels();
		}
		switch (category) {
			case ChartCategories.SPECIAL:
				return provideSpecialChartModels();
			case ChartCategories.MIXED:
				return provideMixedChartModels();
			case ChartCategories.CUSTOM:
				return provideCustomStyleChartModels();
			default:
				return new AAChartModel[0];
		}
	}

	private static AAChartModel[] provideBasicChartModels() {
		return new AAChartModel[]{
				BasicChartComposer.configureAreaChart(),
				BasicChartComposer.configureColumnChartAndBarChart(),
				BasicChartComposer.configureColumnChartAndBarChart().chartType(AAChartType.Bar),
				BasicChartComposer.configureLineChartAndSplineChartStyle(AAChartType.Line),
				BasicChartComposer.configureLineChartAndSplineChartStyle(AAChartType.Spline),
				BasicChartComposer.configureStepAreaChartAndStepLineChart(),
				BasicChartComposer.configureStepAreaChartAndStepLineChart().chartType(AAChartType.Line)
		};
	}

	private static AAChartModel[] provideSpecialChartModels() {
		return new AAChartModel[]{
				SpecialChartComposer.configurePolarColumnChart(),
				SpecialChartComposer.configurePolarBarChart(),
				SpecialChartComposer.configurePolarLineChart(),
				SpecialChartComposer.configurePolarAreaChart(),
				SpecialChartComposer.configurePieChart(),
				SpecialChartComposer.configureBubbleChart(),
				SpecialChartComposer.configureScatterChart(),
				SpecialChartComposer.configureArearangeChart(),
				SpecialChartComposer.configureAreasplinerangeChart(),
				SpecialChartComposer.configureColumnrangeChart(),
				SpecialChartComposer.configureStepLineChart(),
				SpecialChartComposer.configureStepAreaChart(),
				SpecialChartComposer.configureBoxplotChart(),
				SpecialChartComposer.configureWaterfallChart(),
				SpecialChartComposer.configurePyramidChart(),
				SpecialChartComposer.configureFunnelChart(),
				SpecialChartComposer.configureErrorbarChart(),
				SpecialChartComposer.configureGaugeChart(),
				SpecialChartComposer.configurePolygonChart()
		};
	}

	private static AAChartModel[] provideMixedChartModels() {
		return new AAChartModel[]{
				MixedChartComposer.arearangeMixedLine(),
				MixedChartComposer.columnrangeMixedLine(),
				MixedChartComposer.stackingColumnMixedLine(),
				MixedChartComposer.dashStyleTypeMixed(),
				MixedChartComposer.negativeColorMixed(),
				MixedChartComposer.scatterMixedLine(),
				MixedChartComposer.negativeColorMixedBubble(),
				MixedChartComposer.polygonMixedScatter(),
				MixedChartComposer.polarChartMixed(),
				MixedChartComposer.configurePieMixedLineMixedColumnChart(),
				MixedChartComposer.configureNegativeColorMixedAreasplineChart(),
				MixedChartComposer.configureAerasplinerangeMixedColumnrangeMixedLineChart()
		};
	}

	private static AAChartModel[] provideCustomStyleChartModels() {
		return new AAChartModel[]{
				CustomStyleChartComposer.configureColorfulChart(),
				CustomStyleChartComposer.configureColorfulGradientColorChart(),
				CustomStyleChartComposer.configureDiscontinuousDataChart(),
				CustomStyleChartComposer.configureColorfulColumnChart(),
				CustomStyleChartComposer.configureNightingaleRoseChart(),
				CustomStyleChartComposer.configureChartWithShadowStyle(),
				CustomStyleChartComposer.configureColorfulGradientAreaChart(),
				CustomStyleChartComposer.configureColorfulGradientSplineChart(),
				CustomStyleChartComposer.configureGradientColorAreasplineChart(),
				CustomStyleChartComposer.configureSpecialStyleMarkerOfSingleDataElementChart(),
				CustomStyleChartComposer.configureSpecialStyleColumnOfSingleDataElementChart(),
				CustomStyleChartComposer.configureAreaChartThreshold(),
				CustomStyleChartComposer.customScatterChartMarkerSymbolContent(),
				CustomStyleChartComposer.customLineChartMarkerSymbolContent(),
				CustomStyleChartComposer.configureTriangleRadarChart(),
				CustomStyleChartComposer.configureQuadrangleRadarChart(),
				CustomStyleChartComposer.configurePentagonRadarChart(),
				CustomStyleChartComposer.configureHexagonRadarChart(),
				CustomStyleChartComposer.adjustYAxisMaxAndMinValues(),
				CustomStyleChartComposer.customSpecialStyleDataLabelOfSingleDataElementChart(),
				CustomStyleChartComposer.customBarChartHoverColorAndSelectColor(),
				CustomStyleChartComposer.customChartHoverAndSelectHaloStyle(),
				CustomStyleChartComposer.customSplineChartMarkerStatesHoverStyle(),
				CustomStyleChartComposer.splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle(),
				CustomStyleChartComposer.customNormalStackingChartDataLabelsContentAndStyle(),
				CustomStyleChartComposer.upsideDownPyramidChart(),
				CustomStyleChartComposer.doubleLayerPieChart(),
				CustomStyleChartComposer.disableSomeOfLinesMouseTrackingEffect(),
				CustomStyleChartComposer.configureColorfulShadowSplineChart(),
				CustomStyleChartComposer.configureColorfulDataLabelsStepLineChart(),
				CustomStyleChartComposer.configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart(),
				CustomStyleChartComposer.disableSplineChartMarkerHoverEffect(),
				CustomStyleChartComposer.configureMaxAndMinDataLabelsForChart(),
				CustomStyleChartComposer.customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag(),
				CustomStyleChartComposer.noMoreGroupingAndOverlapEachOtherColumnChart(),
				CustomStyleChartComposer.noMoreGroupingAndNestedColumnChart(),
				CustomStyleChartComposer.topRoundedCornersStackingColumnChart(),
				CustomStyleChartComposer.freeStyleRoundedCornersStackingColumnChart(),
				CustomStyleChartComposer.customColumnChartBorderStyleAndStatesHoverColor(),
				CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines(),
				CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines2(),
				CustomStyleChartComposer.drawLineChartWithPointsCoordinates(),
				CustomStyleChartComposer.configureSpecialStyleColumnForNegativeDataMixedPositiveData(),
				CustomStyleChartComposer.configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart(),
				CustomStyleChartComposer.connectNullsForSingleAASeriesElement(),
				CustomStyleChartComposer.lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement(),
				CustomStyleChartComposer.largeDataStackingColumnChart(),
				CustomStyleChartComposer.customAreasplineChartWithColorfulGradientColorZones()
		};
	}
}
