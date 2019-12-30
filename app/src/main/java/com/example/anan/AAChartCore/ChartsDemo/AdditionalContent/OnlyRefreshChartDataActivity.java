package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.R;

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
        aaChartModel.series(this.configureChartSeriesArray());
        return aaChartModel;
    }

    private AAChartModel configureChartBasicContent() {
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        return new AAChartModel()
                .chartType(chartType)
                .xAxisVisible(true)
                .yAxisVisible(false)
                .title("")
                .yAxisTitle("摄氏度")
                .colorsTheme(new Object[]{"#1e90ff","#dc143c"});
    }

    private AASeriesElement[] configureChartSeriesArray() {
        int maxRange = 40;

        Object[] numberArr1 = new Object[maxRange];
        Object[] numberArr2 = new Object[maxRange];

        double y1, y2;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin((random) * (i * Math.PI / 180)) + i * 2 * 0.01;
            y2 = Math.cos((random) * (i * Math.PI / 180)) + i * 3 * 0.01;
            numberArr1[i] = y1;
            numberArr2[i] = y2;
        }

        return new AASeriesElement[]{
                new AASeriesElement()
                        .name("2017")
                        .color(AAGradientColor.sanguineColor())
                        .data(numberArr1),
                new AASeriesElement()
                        .name("2018")
                        .color(AAGradientColor.deepSeaColor())
                        .data(numberArr2)};
    }

    void repeatUpdateChartData() {
        final Handler mHandler = new Handler();
        Runnable r = new Runnable() {

            @Override
            public void run() {
                AASeriesElement[] seriesArr = configureChartSeriesArray();
                aaChartView.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesArr);

                //每隔1s循环执行run方法
                mHandler.postDelayed(this, 1000);
            }
        };

        mHandler.postDelayed(r, 1000);//延时1000毫秒
    }
}
