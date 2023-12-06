package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAOptionsComposer.*;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFunctionForAAOptionsActivity extends AppCompatActivity {

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
            case "customDoubleXAxesChart": return customDoubleXAxesChart();//自定义双 X 轴图表
            case "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction": return disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction();//禁用柱状图图表的选中状态
            case "customizeEveryDataLabelSinglelyByDataLabelsFormatter": return customizeEveryDataLabelSinglelyByDataLabelsFormatter();//自定义每个数据点的数据标签内容
            case "configureColorfulDataLabelsForPieChart": return configureColorfulDataLabelsForPieChart();//为饼图图表配置多彩的数据标签
            default:
                return customDoubleXAxesChart();
        }
    }

}
