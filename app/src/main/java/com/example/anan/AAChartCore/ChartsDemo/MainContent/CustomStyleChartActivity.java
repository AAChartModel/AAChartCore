package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.R;
import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.CustomStyleChartComposer.*;

public class CustomStyleChartActivity extends AppCompatActivity {

    private AAChartModel aaChartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_style_chart);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        aaChartModel = configureTheAAChartModel(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartModel(aaChartModel);
    }

    private AAChartModel configureTheAAChartModel(String chartType) {
        switch (chartType) {
            case "colorfulChart":
                return configureColorfulChart();
            case "gradientColorfulChart":
                return configureColorfulGradientColorChart();
            case "discontinuousDataChart":
                return configureDiscontinuousDataChart();
            case "colorfulColumnChart":
                return configureColorfulColumnChart();
            case "nightingaleRoseChart":
                return configureNightingaleRoseChart();
            case "chartWithShadowStyle":
                return configureChartWithShadowStyle();
            case "colorfulGradientAreaChart":
                return configureColorfulGradientAreaChart();
            case "colorfulGradientSplineChart":
                return configureColorfulGradientSplineChart();
            case "gradientColorAreasplineChart":
                return configureGradientColorAreasplineChart();
            case "SpecialStyleMarkerOfSingleDataElementChart":
                return configureSpecialStyleMarkerOfSingleDataElementChart();
            case "SpecialStyleColumnOfSingleDataElementChart":
                return configureSpecialStyleColumnOfSingleDataElementChart();
            case "AreaChartThreshold":
                return configureAreaChartThreshold();
            case "customScatterChartMarkerSymbolContent":
                return customScatterChartMarkerSymbolContent();
            case "customLineChartMarkerSymbolContent":
                return customLineChartMarkerSymbolContent();
            case "TriangleRadarChart":
                return configureTriangleRadarChart();
            case "QuadrangleRadarChart":
                return configureQuadrangleRadarChart();
            case "PentagonRadarChart":
                return configurePentagonRadarChart();
            case "HexagonRadarChart":
                return configureHexagonRadarChart();

            case "adjustYAxisMaxAndMinValues":
                return adjustYAxisMaxAndMinValues();
            case "customSpecialStyleDataLabelOfSingleDataElementChart":
                return customSpecialStyleDataLabelOfSingleDataElementChart();
            case "customBarChartHoverColorAndSelectColor":
                return customBarChartHoverColorAndSelectColor();
            case "customChartHoverAndSelectHaloStyle":
                return customChartHoverAndSelectHaloStyle();
            case "customSplineChartMarkerStatesHoverStyle":
                return customSplineChartMarkerStatesHoverStyle();
            case "customNormalStackingChartDataLabelsContentAndStyle":
                return customNormalStackingChartDataLabelsContentAndStyle();
            case "upsideDownPyramidChart":
                return upsideDownPyramidChart();
            case "doubleLayerPieChart":
                return doubleLayerPieChart();
            case "disableSomeOfLinesMouseTrackingEffect":
                return disableSomeOfLinesMouseTrackingEffect();
            case "configureColorfulShadowSplineChart":
                return configureColorfulShadowSplineChart();
            case "configureColorfulDataLabelsStepLineChart":
                return configureColorfulDataLabelsStepLineChart();
            case "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart":
                return configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart();
            case "disableSplineChartMarkerHoverEffect":
                return disableSplineChartMarkerHoverEffect();
        }
        return configureColorfulChart();
    }

}


