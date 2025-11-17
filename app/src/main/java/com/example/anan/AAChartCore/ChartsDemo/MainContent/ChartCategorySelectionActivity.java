package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.ChartCategories;
import com.example.anan.AAChartCore.R;

public class ChartCategorySelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_category_selection);

        Button basicChartsBtn = findViewById(R.id.basic_charts_button);
        Button specialChartsBtn = findViewById(R.id.special_charts_button);
        Button mixedChartsBtn = findViewById(R.id.mixed_charts_button);
        Button customStyleChartsBtn = findViewById(R.id.custom_style_charts_button);
        Button chartOptionsBtn = findViewById(R.id.chart_options_button);
        Button jsAxisBtn = findViewById(R.id.js_axis_button);
        Button jsTooltipBtn = findViewById(R.id.js_tooltip_button);
        Button jsLegendBtn = findViewById(R.id.js_legend_button);
        Button jsOptionsFunctionBtn = findViewById(R.id.js_options_function_button);
        Button jsChartEventsBtn = findViewById(R.id.js_chart_events_button);
        Button officialSamplesBtn = findViewById(R.id.official_samples_button);

        basicChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.BASIC);
            }
        });

        specialChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.SPECIAL);
            }
        });

        mixedChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.MIXED);
            }
        });

        customStyleChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.CUSTOM);
            }
        });

        chartOptionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.OPTIONS);
            }
        });

        jsAxisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.JS_AXIS);
            }
        });

        jsTooltipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.JS_TOOLTIP);
            }
        });

        jsLegendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.JS_LEGEND);
            }
        });

        jsOptionsFunctionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.JS_OPTIONS);
            }
        });

        jsChartEventsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.JS_CHART_EVENTS);
            }
        });

        officialSamplesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChartListActivity(ChartCategories.OFFICIAL_SAMPLES);
            }
        });
    }

    private void startChartListActivity(String category) {
        Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
        intent.putExtra("chart_category", category);
        startActivity(intent);
    }
}