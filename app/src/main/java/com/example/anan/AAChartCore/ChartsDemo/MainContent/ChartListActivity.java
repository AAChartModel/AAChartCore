package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.BasicChartComposer;
import com.example.anan.AAChartCore.R;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;

public class ChartListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AAChartModel[] chartModels = {
                BasicChartComposer.configureAreaChart(),
                BasicChartComposer.configureColumnChartAndBarChart(),
                BasicChartComposer.configureColumnChartAndBarChart().chartType(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Bar),
                BasicChartComposer.configureLineChartAndSplineChartStyle(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Line),
                BasicChartComposer.configureLineChartAndSplineChartStyle(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Spline),
                BasicChartComposer.configureStepAreaChartAndStepLineChart(),
                BasicChartComposer.configureStepAreaChartAndStepLineChart().chartType(com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType.Line),
        };

        ChartListAdapter adapter = new ChartListAdapter(this, chartModels);
        recyclerView.setAdapter(adapter);
    }
}