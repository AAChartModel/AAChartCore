package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAOptionsConstructor;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAScrollablePlotArea;
import com.example.anan.AAChartCore.R;

public class ScollableChartActivity extends AppCompatActivity {
    private AAChartView aaChartView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scollable_chart);

        aaChartView1 = findViewById(R.id.AAChartView1);

        AAChartModel aaChartModel = configureChartModel();
        aaChartView1.aa_drawChartWithChartModel(aaChartModel);

    }



    private AAChartModel configureChartModel() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .yAxisTitle("")
                .legendEnabled(false)
                .yAxisGridLineWidth(0f)
                .scrollablePlotArea(
                        new AAScrollablePlotArea()
                                .minWidth(3000)
                                .scrollPositionX(1f)
                )
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(configureSeriesDataArray())

                });
        return aaChartModel;
    }

    private AADataElement[] configureSeriesDataArray() {
        int maxRange = 388;
        AADataElement[] numberArr1 = new AADataElement[maxRange];

        double y1;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01;
            AADataElement aaDataElement = new AADataElement()
                    .y((float) y1);

            numberArr1[i] = aaDataElement;
        }

        return numberArr1;
    }

}
