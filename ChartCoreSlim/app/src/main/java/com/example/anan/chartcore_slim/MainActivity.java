package com.example.anan.chartcore_slim;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AAChartView aaChartView = (AAChartView) findViewById(R.id.AAChartView);


        ArrayList<Number> dataArr = new ArrayList<Number>();
        dataArr = new ArrayList<Number>(Arrays.asList(
                5, 25, 50, 120, 150, 200, 426, 660, 869, 1060, 1605, 2471, 3322,
                4238, 5221, 6129, 7089, 8339, 9399, 10538, 11643, 13092, 14478,
                15915, 17385, 19055, 21205, 23044, 25393, 27935, 30062, 32049,
                33952, 35804, 37431, 39197, 45000, 43000, 41000, 39000, 37000,
                35000, 33000, 31000, 29000, 27000, 25000, 24000, 23000, 22000,
                21000, 20000, 19000, 18000, 18000, 17000, 16000));


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartModel.AAChartType.Area)
                .title("店内会员占比情况")
                .subtitle("")
                .dataLabelEnabled(true)
                .legendVerticalAlign(AAChartModel.AAChartLegendVerticalAlignType.Bottom)
                .series(
                        new AASeriesElement[]{
                                new AASeriesElement()
                                        .data(dataArr)
                                        .name("店内会员数量"),

                        }
                );

        aaChartView.aa_drawChartWithChartModel(aaChartModel);

        // 将对象编译成json
        Gson gson = new Gson();
       String optionsJson = gson.toJson(aaChartModel);
        System.out.println("🍎获得了最后的字符串 Options "+optionsJson);

        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setMessage(optionsJson)
                .setPositiveButton("确定", null)
                .show();




    }
}
