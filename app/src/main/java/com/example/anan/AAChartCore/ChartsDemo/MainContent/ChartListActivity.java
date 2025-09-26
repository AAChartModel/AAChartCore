package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.BasicChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.CustomStyleChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.MixedChartComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.SpecialChartComposer;
import com.example.anan.AAChartCore.R;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;

import java.util.Arrays;
import java.util.List;

public class ChartListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("chart_category");
        
        List<AAChartModel> chartModels = new java.util.ArrayList<>();
        
        if (category == null || category.equals("basic")) {
            chartModels.addAll(Arrays.asList(
                    BasicChartComposer.configureAreaChart(),
                    BasicChartComposer.configureColumnChartAndBarChart(),
                    BasicChartComposer.configureColumnChartAndBarChart().chartType(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Bar),
                    BasicChartComposer.configureLineChartAndSplineChartStyle(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Line),
                    BasicChartComposer.configureLineChartAndSplineChartStyle(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Spline),
                    BasicChartComposer.configureStepAreaChartAndStepLineChart(),
                    BasicChartComposer.configureStepAreaChartAndStepLineChart().chartType(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Line)
            ));
        } else if (category.equals("special")) {
            chartModels.addAll(Arrays.asList(
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
            ));
        } else if (category.equals("mixed")) {
            chartModels.addAll(Arrays.asList(
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
            ));
        } else if (category.equals("custom")) {
            chartModels.addAll(Arrays.asList(
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
            ));
        }

        ChartListAdapter adapter = new ChartListAdapter(this, chartModels.toArray(new AAChartModel[0]));
        recyclerView.setAdapter(adapter);
    }
}