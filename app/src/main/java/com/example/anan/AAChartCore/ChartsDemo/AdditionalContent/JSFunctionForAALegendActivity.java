package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionForAALegendComposer.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;

public class JSFunctionForAALegendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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