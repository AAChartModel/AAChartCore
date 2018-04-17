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


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartModel.AAChartType.Area)
                .title("title")
                .subtitle("subtitleubtitleSubtitle")
                .dataLabelEnabled(true)
                .legendVerticalAlign(AAChartModel.AAChartLegendVerticalAlignType.Bottom)
                .series(
                        new AASeriesElement[]{
                                new AASeriesElement()
                                        .name("Tokyo")
                                        .data(getSeriesData(1)),
                                new AASeriesElement()
                                        .name("NewYork")
                                        .data(getSeriesData(2)),
                                new AASeriesESlement()
                                        .name("London")
                                        .data(getSeriesData(3)),
                                new AASeriesElement()
                                        .name("Berlin")
                                        .data(getSeriesData(4))


                        }
                );

        aaChartView.aa_drawChartWithChartModel(aaChartModel);

        // 将对象编译成json
        Gson gson = new Gson();
       String optionsJson = gson.toJson(aaChartModel);
        System.out.println("🍎获得了最后的字符串 Options "+optionsJson);

//        new AlertDialog.Builder(this)
//                .setTitle("标题")
//                .setMessage(optionsJson)
//                .setPositiveButton("确定", null)
//                .show();

    }

    /**
     *
     * @param series
     * @return
     */
    public ArrayList<Number> getSeriesData(int series) {
        ArrayList<Number> array = new ArrayList<Number>();

        if (series == 1) {
            array = new ArrayList<Number>(Arrays.asList
                    (7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6));
        }
        else if (series == 2) {
            array = new ArrayList<Number>(Arrays.asList
                    (0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5));
        }
        else if (series == 3) {
            array = new ArrayList<Number>(Arrays.asList
                    (0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0));
        }
        else if (series == 4) {
            array = new ArrayList<Number>(Arrays.asList
                    (3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8));
        }

        return array;
    }
}
