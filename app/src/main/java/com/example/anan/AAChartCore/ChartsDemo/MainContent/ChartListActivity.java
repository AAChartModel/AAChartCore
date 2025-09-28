package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.AAChartModelListProvider;
import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.AAOptionsListProvider;
import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.AAOptionsListProvider.OptionsBundle;
import com.example.anan.AAChartCore.ChartsDemo.ChartListProvider.ChartCategories;
import com.example.anan.AAChartCore.R;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

public class ChartListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("chart_category");
        if (category == null) {
            category = ChartCategories.BASIC;
        }

        OptionsBundle optionsBundle = AAOptionsListProvider.provideChartOptions(category);
        if (optionsBundle != null) {
            ChartListAdapter adapter = new ChartListAdapter(this, category, optionsBundle.titles, optionsBundle.options);
            recyclerView.setAdapter(adapter);
        } else {
            AAChartModel[] chartModels = AAChartModelListProvider.provideChartModels(category);
            ChartListAdapter adapter = new ChartListAdapter(this, category, chartModels);
            recyclerView.setAdapter(adapter);
        }
    }
}