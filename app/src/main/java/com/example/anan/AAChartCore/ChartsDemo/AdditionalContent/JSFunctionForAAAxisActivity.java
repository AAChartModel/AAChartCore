package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAAxisComposer.*;
import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAAxisComposer.customYAxisLabels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFunctionForAAAxisActivity extends AppCompatActivity {

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
            case "customYAxisLabels": return customYAxisLabels();//自定义Y轴文字
            case "customYAxisLabels2": return customYAxisLabels2();//自定义Y轴文字2
            case "customAreaChartXAxisLabelsTextUnitSuffix1": return customAreaChartXAxisLabelsTextUnitSuffix1();//自定义X轴文字单位后缀(通过 formatter 函数)
            case "customAreaChartXAxisLabelsTextUnitSuffix2": return customAreaChartXAxisLabelsTextUnitSuffix2();//自定义X轴文字单位后缀(不通过 formatter 函数)
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart": return configureTheAxesLabelsFormattersOfDoubleYAxesChart();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 1
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart2": return configureTheAxesLabelsFormattersOfDoubleYAxesChart2();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 2
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart3": return configureTheAxesLabelsFormattersOfDoubleYAxesChart3();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 3
            case "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters": return customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters();//通过截取前四个字符来自定义 X 轴 labels
            case "customSpiderChartStyle": return customSpiderChartStyle();//自定义蜘蛛🕷🕸图样式
            case "customizeEveryDataLabelSinglelyByDataLabelsFormatter": return customizeEveryDataLabelSinglelyByDataLabelsFormatter();//通过 DataLabels 的 formatter 函数来实现单个数据标签🏷自定义
            case "customXAxisLabelsBeImages": return customXAxisLabelsBeImages();//自定义 X轴 labels 为一组图片
            default:
                return customYAxisLabels();
        }

    }

}
