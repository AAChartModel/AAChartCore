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
        }
        return configureAAPlotBandsForChart();
    }
}