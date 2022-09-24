package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAAChartEventsComposer.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFunctionForAAChartEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        AAOptions aaOptions = configureTheChartOptions(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);
    }

    AAOptions configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart": return setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart(); //图表加载完成后,自动设置默认的十字准星和浮动提示框的位置
            case "generalDrawingChart": return generalDrawingChart(); //自由绘图
            case "advancedTimeLineChart": return advancedTimeLineChart(); //高级时间线图
            case "configureBlinkMarkerChart": return configureBlinkMarkerChart(); //配置闪烁的标记点
            case "configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect": return configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect(); //配置单个数据元素的特殊样式标记点即闪烁特效
            case "configureScatterChartWithBlinkEffect": return configureScatterChartWithBlinkEffect(); //配置散点图的闪烁特效
            case "automaticallyHideTooltipAfterItIsShown": return automaticallyHideTooltipAfterItIsShown(); //图表加载完成后,自动隐藏浮动提示框
            case "dynamicHeightGridLineAreaChart": return dynamicHeightGridLineAreaChart(); //动态高度网格线的区域填充图
            case "customizeYAxisPlotLinesLabelBeSpecialStyle": return customizeYAxisPlotLinesLabelBeSpecialStyle(); //自定义 Y 轴轴线上面的标签文字特殊样式
        }
        return null;
    }



    }