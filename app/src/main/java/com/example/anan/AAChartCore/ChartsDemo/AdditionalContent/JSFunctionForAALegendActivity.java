package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAALegendComposer.*;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFunctionForAALegendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        AAOptions aaOptions = chartConfigurationWithSelectedIndex(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);
    }


    AAOptions chartConfigurationWithSelectedIndex(String chartType) {
        switch (chartType) {
            case "disableLegendClickEventForNormalChart": return disableLegendClickEventForNormalChart();//禁用普通图表的图例点击事件
            case "disableLegendClickEventForPieChart": return disableLegendClickEventForPieChart();//禁用饼图图表的图例点击事件
            case "customLegendItemClickEvent": return customLegendItemClickEvent();//自定义图例点击事件
            default:
                return disableLegendClickEventForNormalChart();
        }
    }

}
