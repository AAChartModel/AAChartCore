package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.SpecialChartComposer.*;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.R;
;

public class SpecialChartActivity extends AppCompatActivity {
    private AAChartModel aaChartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AAChartView aaChartView = (AAChartView) findViewById(R.id.AAChartView);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        aaChartModel = configureChartModelWithChartType(chartType);


        aaChartView.aa_drawChartWithChartModel(aaChartModel);
    }

    AAChartModel configureChartModelWithChartType(String chartType) {
        switch (chartType) {
            case AAChartType.Column:
                return configurePolarColumnChart();
            case AAChartType.Bar:
                return configurePolarBarChart();
            case AAChartType.Line:
                return configurePolarLineChart();
            case AAChartType.Area:
                return configurePolarAreaChart();
            case AAChartType.Pie:
                return configurePieChart();
            case AAChartType.Bubble:
                return configureBubbleChart();
            case AAChartType.Scatter:
                return configureScatterChart();
            case AAChartType.Arearange:
                return configureArearangeChart();
            case AAChartType.Areasplinerange:
                return configureAreasplinerangeChart();
            case AAChartType.Columnrange:
                return configureColumnrangeChart();
            case AAChartType.Spline:
                return configureStepLineChart();
            case AAChartType.Areaspline:
                return configureStepAreaChart();
            case AAChartType.Boxplot:
                return configureBoxplotChart();
            case AAChartType.Waterfall:
                return configureWaterfallChart();
            case AAChartType.Pyramid:
                return configurePyramidChart();
            case AAChartType.Funnel:
                return configureFunnelChart();
            case AAChartType.Errorbar:
                return configureErrorbarChart();
            case AAChartType.Gauge:
                return configureGaugeChart();
            case AAChartType.Polygon:
                return configurePolygonChart();
            default:
                break;
        }

        return configurePolarColumnChart();
    }
}
