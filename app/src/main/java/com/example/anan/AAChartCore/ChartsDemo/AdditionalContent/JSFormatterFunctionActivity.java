package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionChartOptionsComposer.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFormatterFunctionActivity extends AppCompatActivity {

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
            case "customAreaChartTooltipStyleWithSimpleFormatString":
                return customAreaChartTooltipStyleWithSimpleFormatString();//简单字符串拼接
            case "customAreaChartTooltipStyleWithDifferentUnitSuffix":
                return customAreaChartTooltipStyleWithDifferentUnitSuffix();//自定义不同单位后缀
            case "customAreaChartTooltipStyleWithColorfulHtmlLabels":
                return customAreaChartTooltipStyleWithColorfulHtmlLabels();//自定义多彩颜色文字
            case "customLineChartTooltipStyleWhenValueBeZeroDoNotShow":
                return customLineChartTooltipStyleWhenValueBeZeroDoNotShow();//值为0时,在tooltip中不显示
            case "customBoxplotTooltipContent":
                return customBoxplotTooltipContent();
            case "customStackedAndGroupedColumnChartTooltip":
                return customStackedAndGroupedColumnChartTooltip();
            case "customArearangeChartTooltip":
                return customArearangeChartTooltip();
            case "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter":
                return customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter();
            case "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries":
                return customTooltipWhichDataSourceComeFromOutSideRatherThanSeries();

            case "customTooltipPostionerFunction":
                return customTooltipPostionerFunction();//自定义浮动提示框 Positioner 函数
            case "fixedTooltipPositionByCustomPositionerFunction":
                return fixedTooltipPositionByCustomPositionerFunction();//通过 Positioner 函数来实现一个位置固定的提示框
            case "customPlotAreaOutsideComlicatedTooltipStyle":
                return customPlotAreaOutsideComlicatedTooltipStyle();//通过 Positioner 函数来实现绘图区外的复杂浮动提示框样式
            case "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction":
                return disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction();//通过 Series 的 Point 的选中事件函数来禁用条形图反选效果
            case "customAreasplineChartTooltipStyleByDivWithCSS":
                return customAreasplineChartTooltipStyleByDivWithCSS();//通过自定义 div 的 css 样式来自定义复杂效果的 tooltip 浮动提示框
            case "makePieChartShow0Data":
                return makePieChartShow0Data();//使饼图显示为 0 的数据
            case "customColumnChartBorderStyleAndStatesHoverColor":
                return customColumnChartBorderStyleAndStatesHoverColor();//自定义📊柱状图的 border 样式和手指或鼠标 hover 时的显示效果

        }
        return customAreaChartTooltipStyleWithSimpleFormatString();
    }
}