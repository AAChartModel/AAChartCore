package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAAxisComposer.*;
import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAAxisComposer.customYAxisLabels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;

public class JSFunctionForAAAxisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    AAOptions chartConfigurationWithSelectedIndex(String chartType) {
        switch (chartType) {
            case "0": return customYAxisLabels();//自定义Y轴文字
            case "1": return customYAxisLabels2();//自定义Y轴文字2
            case "2": return customAreaChartXAxisLabelsTextUnitSuffix1();//自定义X轴文字单位后缀(通过 formatter 函数)
            case "3": return customAreaChartXAxisLabelsTextUnitSuffix2();//自定义X轴文字单位后缀(不通过 formatter 函数)
            case "4": return configureTheAxesLabelsFormattersOfDoubleYAxesChart();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 1
            case "5": return configureTheAxesLabelsFormattersOfDoubleYAxesChart2();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 2
            case "6": return configureTheAxesLabelsFormattersOfDoubleYAxesChart3();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 3
            case "7": return customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters();//通过截取前四个字符来自定义 X 轴 labels
            case "8": return customSpiderChartStyle();//自定义蜘蛛🕷🕸图样式
            case "9": return customizeEveryDataLabelSinglelyByDataLabelsFormatter();//通过 DataLabels 的 formatter 函数来实现单个数据标签🏷自定义
            case "10": return customXAxisLabelsBeImages();//自定义 X轴 labels 为一组图片
            default:
                return customYAxisLabels();
        }
    }

    }
