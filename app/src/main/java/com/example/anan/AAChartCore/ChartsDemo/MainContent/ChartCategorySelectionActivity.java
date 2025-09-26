package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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

        basicChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
                intent.putExtra("chart_category", "basic");
                startActivity(intent);
            }
        });

        specialChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
                intent.putExtra("chart_category", "special");
                startActivity(intent);
            }
        });

        mixedChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
                intent.putExtra("chart_category", "mixed");
                startActivity(intent);
            }
        });

        customStyleChartsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
                intent.putExtra("chart_category", "custom");
                startActivity(intent);
            }
        });

        Button chartOptionsBtn = findViewById(R.id.chart_options_button);
        chartOptionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartCategorySelectionActivity.this, ChartListActivity.class);
                intent.putExtra("chart_category", "options");
                startActivity(intent);
            }
        });
    }
}