package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAOptionsConstructor;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;
import com.example.anan.AAChartCore.R;

import java.util.Map;

public class OnlyRefreshChartDataActivity extends AppCompatActivity {

    private AAChartModel aaChartModel;
    private AAChartView aaChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_refresh_chart_data);

        setUpAAChartView();
        repeatUpdateChartData();

    }

    void setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView);
        aaChartModel = configureAAChartModel();

        AAOptions aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel);
        if (aaChartModel.chartType.equals(AAChartType.Column)) {
            aaOptions.plotOptions.column
                    .groupPadding(0f)
                    .pointPadding(0f)
                    .borderRadius(5f);

        } else if (aaChartModel.chartType.equals(AAChartType.Bar)) {
            aaOptions.plotOptions.bar
                    .groupPadding(0f)
                    .pointPadding(0f)
                    .borderRadius(5f);
        }

        aaChartView.aa_drawChartWithChartOptions(aaOptions);
    }

    private AAChartModel configureAAChartModel() {
       AAChartModel aaChartModel = configureChartBasicContent();


        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");
        AASeriesElement[] aaSeriesElementsArr = configureChartSeriesArray();

        if (chartType.equals("stepArea") || chartType.equals("stepLine")) {
            for (int i =0; i < aaSeriesElementsArr.length; i++ ) {
                AASeriesElement aaSeriesElement = aaSeriesElementsArr[i];
                aaSeriesElement.step(true);
            }
        }

        aaChartModel.series(aaSeriesElementsArr);
        return aaChartModel;
    }

    private AAChartModel configureChartBasicContent() {
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");
        if (chartType.equals("stepArea") ) {
            chartType = AAChartType.Area;
        } else if (chartType.equals("stepLine")) {
            chartType = AAChartType.Line;
        }

            Map gradientColorMap1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
        "rgba(138,43,226,1)",
                "rgba(30,144,255,1)"
        );

        Map gradientColorMap2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#00BFFF",
                "#00FA9A"
        );


        return new AAChartModel()
                .chartType(chartType)
                .xAxisVisible(true)
                .yAxisVisible(false)
                .title("")
                .yAxisTitle("摄氏度")
                .colorsTheme(new Object[]{
                        gradientColorMap1,
                        gradientColorMap2,
                        AAGradientColor.sanguineColor(),
                        AAGradientColor.wroughtIronColor()
                })
                .stacking(AAChartStackingType.Normal)
                ;
    }

    private AASeriesElement[] configureChartSeriesArray() {
        int maxRange = 40;

        Object[] numberArr1 = new Object[maxRange];
        Object[] numberArr2 = new Object[maxRange];

        double y1, y2;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01;
            y2 = Math.cos(random * (i * Math.PI / 180)) + i * 3 * 0.01;
            numberArr1[i] = y1;
            numberArr2[i] = y2;
        }

        AASeriesElement[] aaSeriesElementsArr = new AASeriesElement[]{
                new AASeriesElement()
                        .name("2017")
                        .data(numberArr1),
                new AASeriesElement()
                        .name("2018")
                        .data(numberArr2),
                new AASeriesElement()
                        .name("2019")
                        .data(numberArr1),
                new AASeriesElement()
                        .name("2020")
                        .data(numberArr2),
        };

        return aaSeriesElementsArr;
    }

    void repeatUpdateChartData() {
        final Handler mHandler = new Handler();
        Runnable r = new Runnable() {

            @Override
            public void run() {
                AASeriesElement[] aaSeriesElementsArr = configureChartSeriesArray();

                aaChartView.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(aaSeriesElementsArr);

                //每隔1s循环执行run方法
                mHandler.postDelayed(this, 1000);
            }
        };

        mHandler.postDelayed(r, 2000);//延时2000毫秒
    }
}
