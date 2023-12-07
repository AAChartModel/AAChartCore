package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAMoveOverEventMessageModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartFontWeightType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartStackingType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStyle;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;
import com.github.AAChartModel.AAChartCore.AATools.AAGradientColor;
import com.example.anan.AAChartCore.R;

public class EvaluateJSStringFunctionActivity extends AppCompatActivity implements AAChartView.AAChartViewCallBack {
private  AAChartView aaChartView;
private String chartType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate_jsstring_function);

        Intent intent = getIntent();
        chartType = intent.getStringExtra("chartType");

        aaChartView = findViewById(R.id.AAChartView);
        AAChartModel aaChartModel = configureChartModel();
        aaChartView.aa_drawChartWithChartModel(aaChartModel);
        aaChartView.callBack = this;

    }

    AAChartModel configureChartModel() {
        if (chartType.equals("evalJSFunction3")) {
            return configureStackingColumnMixedLineChart();
        }

        return new AAChartModel()
                .chartType(AAChartType.Line)
                .dataLabelsEnabled(true)
                .tooltipEnabled(true)
                .backgroundColor(AAGradientColor.OceanBlue)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4})
                                .color(AAGradientColor.DeepSea)

                });
    }

    AAChartModel configureStackingColumnMixedLineChart() {
        AASeriesElement[] aaSeriesArr = {
                new AASeriesElement()
                        .name("新用户")
                        .data(new Object[] {82.89,67.54,62.07,59.43,67.02,67.09,35.66,71.78,81.61,78.85,79.12,72.30})
                        .dataLabels(
                        new AADataLabels()
                                .enabled(true)
                                .style(new AAStyle()
                                        .color(AAColor.Red)
                                        .fontSize(11f)
                                )
                )
                ,
                new AASeriesElement()
                        .name("老用户")
                        .data(new Object[] {198.66,330.81,151.95,160.12,222.56,229.05,128.53,250.91,224.47,473.99,126.85,260.50})
                        .dataLabels(
                        new AADataLabels()
                                .enabled(true)
                                .style(new AAStyle()
                                        .color("#000000")
                                        .fontSize(11f)
                                )
                ),
                new AASeriesElement()
                        .name("总量")
                        .type(AAChartType.Line)
                        .data(new Object[] {281.55,398.35,214.02,219.55,289.57,296.14,164.18,322.69,306.08,552.84,205.97,332.79})
                        .dataLabels(
                        new AADataLabels()
                                .enabled(true)
                                .style(new AAStyle()
                                        .color("#000000")
                                        .fontSize(15f)
                                        .fontWeight(AAChartFontWeightType.Bold)
                                )
                )
                ,
        };
        return new AAChartModel()
                .title("16年1月-16年11月充值客单分析")//图形标题
                .subtitle("BY MICVS")//图形副标题
                .chartType(AAChartType.Column)
                .stacking(AAChartStackingType.Normal)
                .legendEnabled(true)
                .colorsTheme(new Object[] {
                        AAGradientColor.OceanBlue,
                        AAGradientColor.Sanguine,
                        AAGradientColor.LusciousLime,
                })
                .series(aaSeriesArr);
    }

    @Override
    public void chartViewDidFinishLoad(AAChartView aaChartView) {
        Log.i("","🔥🔥🔥🔥🔥 AAChartView content did finish load!!!");

        String jsFunctionStr;

        if (chartType.equals("evalJSFunction1")) {
            jsFunctionStr = configureMaxMiniDataLabelJSFunctionString();
        } else if (chartType.equals("evalJSFunction2")) {
            jsFunctionStr = configureFirstSecondThirdDataLabelJSFunctionString();
        } else {
            jsFunctionStr = configureFirstSecondThirdStackLabelJSFunctionString();
        }

        aaChartView.aa_evaluateTheJavaScriptStringFunction(jsFunctionStr);
    }

    @Override
    public void chartViewMoveOverEventMessage(AAChartView aaChartView, AAMoveOverEventMessageModel messageModel) {

    }

    String configureMaxMiniDataLabelJSFunctionString() {
        String jsStr =
                " function render(aaGlobalChart, point, text) {\n" +
                "        return aaGlobalChart.renderer.label(text + ': ' + point.y,  point.plotX + aaGlobalChart.plotLeft -20 , point.plotY + aaGlobalChart.plotTop - 45, 'callout', point.plotX + aaGlobalChart.plotLeft, point.plotY + aaGlobalChart.plotTop)\n" +
                "        .css({\n" +
                "        color: '#FFFFFF',\n" +
                "        align: 'center',\n" +
                "        })\n" +
                "        .attr({\n" +
                "        fill: 'rgba(0, 0, 0, 0.75)',\n" +
                "        padding: 8,\n" +
                "        r: 5,\n" +
                "        zIndex: 6\n" +
                "        })\n" +
                "        .add();\n" +
                "        }\n" +
                "        function renderMinMaxLabel(aaGlobalChart) {\n" +
                "        var min = 1000,\n" +
                "        max = 0,\n" +
                "        pointsToShow = [0, 0],\n" +
                "        points = aaGlobalChart.series[0].points;\n" +
                "        Highcharts.each(points, function(p) {\n" +
                "        if(p.y>max) {\n" +
                "        pointsToShow[0] = p.index;\n" +
                "        max = p.y;\n" +
                "        }\n" +
                "        if(p.y<min) {\n" +
                "        pointsToShow[1] = p.index;\n" +
                "        min = p.y;\n" +
                "        }\n" +
                "        });\n" +
                "        render(aaGlobalChart, points[pointsToShow[0]], 'Max');\n" +
                "        render(aaGlobalChart, points[pointsToShow[1]], 'Min');\n" +
                "        }\n" +
                "        \n" +
                "        renderMinMaxLabel(aaGlobalChart);";
        return jsStr;
    }

    String configureFirstSecondThirdDataLabelJSFunctionString() {
        Integer firstMaxNumberIndex = 8;
        Integer secondMaxNumberIndex = 9;
        Integer thirdMaxNumberIndex = 5;

        String jsStr =
                "function render(aaGlobalChart, point, text) {\n" +
                "        return aaGlobalChart.renderer.label(text + ': ' + point.y,  point.plotX + aaGlobalChart.plotLeft -20 , point.plotY + aaGlobalChart.plotTop - 45, 'callout', point.plotX + aaGlobalChart.plotLeft, point.plotY + aaGlobalChart.plotTop)\n" +
                "        .css({\n" +
                "        color: '#FFFFFF',\n" +
                "        align: 'center',\n" +
                "        })\n" +
                "        .attr({\n" +
                "        fill: 'rgba(0, 0, 0, 0.75)',\n" +
                "        padding: 8,\n" +
                "        r: 5,\n" +
                "        zIndex: 6\n" +
                "        })\n" +
                "        .add();\n" +
                "        }\n" +
                "        function renderFirstSecondThirdLabel(aaGlobalChart) {\n" +
                "        var points = aaGlobalChart.series[0].points;\n" +
                "        render(aaGlobalChart, points[firstMaxNumberIndex], '第一名');\n" +
                "        render(aaGlobalChart, points[secondMaxNumberIndex], '第二名');\n" +
                "        render(aaGlobalChart, points[thirdMaxNumberIndex], '第三名');\n" +
                "        }\n" +
                "        \n" +
                "        renderFirstSecondThirdLabel(aaGlobalChart);";

        String firstMaxNumberIndexStr = String.valueOf(firstMaxNumberIndex);
        String secondMaxNumberIndexStr = String.valueOf(secondMaxNumberIndex);
        String thirdMaxNumberIndexStr = String.valueOf(thirdMaxNumberIndex);

        jsStr = jsStr.replace("firstMaxNumberIndex",firstMaxNumberIndexStr);
        jsStr = jsStr.replace("secondMaxNumberIndex",secondMaxNumberIndexStr);
        jsStr = jsStr.replace("thirdMaxNumberIndex",thirdMaxNumberIndexStr);

        return jsStr;
    }

    String configureFirstSecondThirdStackLabelJSFunctionString() {
        Integer firstMaxNumberIndex = 9;
        Integer secondMaxNumberIndex = 1;
        Integer thirdMaxNumberIndex = 11;

        String jsStr =
                "function render(aaGlobalChart, point, text,colorIndex) {\n" +
                "        var colorsArray = [\"#1e90ff\",\"#ef476f\",\"#ffd066\",];\n" +
                "        var colorHexString = colorsArray[colorIndex];\n" +
                "        return aaGlobalChart.renderer.label('   '+text,  point.plotX + aaGlobalChart.plotLeft -20 , point.plotY + aaGlobalChart.plotTop - 60, 'callout', point.plotX + aaGlobalChart.plotLeft, point.plotY + aaGlobalChart.plotTop)\n" +
                "        .css({\n" +
                "        color: '#FFFFFF',\n" +
                "        align: 'center',\n" +
                "        weight: 'bold',\n" +
                "        })\n" +
                "        .attr({\n" +
                "        fill: colorHexString,\n" +
                "        padding: 8,\n" +
                "        r: 5,\n" +
                "        zIndex: 6\n" +
                "        })\n" +
                "        .add();\n" +
                "        }\n" +
                "        function renderFirstSecondThirdLabel(aaGlobalChart) {\n" +
                "        var points = aaGlobalChart.series[0].points;\n" +
                "        render(aaGlobalChart, points[firstMaxNumberIndex], '第一名',0);\n" +
                "        render(aaGlobalChart, points[secondMaxNumberIndex], '第二名',1);\n" +
                "        render(aaGlobalChart, points[thirdMaxNumberIndex], '第三名',2);\n" +
                "        }\n" +
                "        \n" +
                "        renderFirstSecondThirdLabel(aaGlobalChart);";

        String firstMaxNumberIndexStr = String.valueOf(firstMaxNumberIndex);
        String secondMaxNumberIndexStr = String.valueOf(secondMaxNumberIndex);
        String thirdMaxNumberIndexStr = String.valueOf(thirdMaxNumberIndex);

        jsStr = jsStr.replace("firstMaxNumberIndex",firstMaxNumberIndexStr);
        jsStr = jsStr.replace("secondMaxNumberIndex",secondMaxNumberIndexStr);
        jsStr = jsStr.replace("thirdMaxNumberIndex",thirdMaxNumberIndexStr);

        return jsStr;
    }


}
