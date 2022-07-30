package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.MixedChartComposer.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.R;

public class MixedChartActivity extends AppCompatActivity {
    private AAChartModel aaChartModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_chart);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        this.aaChartModel = configureTheAAChartModel(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartModel(this.aaChartModel);
    }


    private AAChartModel configureTheAAChartModel(String chartType) {
        switch (chartType) {
            case "arearangeMixedLine":
                return arearangeMixedLine();
            case "columnrangeMixedLine":
                return columnrangeMixedLine();
            case "stackingColumnMixedLine":
                return stackingColumnMixedLine();
            case "dashStyleTypeMixed":
                return dashStyleTypeMixed();
            case "negativeColorMixed":
                return negativeColorMixed();
            case "scatterMixedLine":
                return scatterMixedLine();
            case "negativeColorMixedBubble":
                return negativeColorMixedBubble();
            case "polygonMixedScatter":
                return polygonMixedScatter();
            case "polarChartMixed":
                return polarChartMixed();
            case "configurePieMixedLineMixedColumnChart":
                return configurePieMixedLineMixedColumnChart();
            case "configureNegativeColorMixedAreasplineChart":
                return configureNegativeColorMixedAreasplineChart();
        }
        return arearangeMixedLine();
    }
}