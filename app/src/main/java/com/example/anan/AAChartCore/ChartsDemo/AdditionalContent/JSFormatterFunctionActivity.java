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
            case "customYAxisLabels":
                return customYAxisLabels();
            case "customYAxisLabels2":
                return customYAxisLabels2();
            case "customStackedAndGroupedColumnChartTooltip":
                return customStackedAndGroupedColumnChartTooltip();
            case "customDoubleXAxesChart":
                return customDoubleXAxesChart();
            case "customArearangeChartTooltip":
                return customArearangeChartTooltip();
            case "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter":
                return customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter();
            case "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries":
                return customTooltipWhichDataSourceComeFromOutSideRatherThanSeries();

        }
        return customAreaChartTooltipStyleWithSimpleFormatString();
    }
}