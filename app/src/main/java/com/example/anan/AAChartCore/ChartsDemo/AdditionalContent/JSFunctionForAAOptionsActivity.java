package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAOptionsComposer.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;

public class JSFunctionForAAOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    AAOptions chartConfigurationWithSelectedIndex(String chartType) {
        switch (chartType) {
            case "0": return customDoubleXAxesChart();//自定义双 X 轴图表
            case "1": return disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction();//禁用柱状图图表的选中状态
            case "2": return customizeEveryDataLabelSinglelyByDataLabelsFormatter();//自定义每个数据点的数据标签内容
            case "3": return configureColorfulDataLabelsForPieChart();//为饼图图表配置多彩的数据标签
            default:
                return customDoubleXAxesChart();
        }
    }

}