package com.example.anan.chartcore_slim;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;


public class CommonChartActivity extends AppCompatActivity {
    public static final String CHART_TYPE = "chartType";
    public static final String STEP = "step";



    public String chartType;
    private String step;


    private AAChartModel aaChartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        AAChartView aaChartView = (AAChartView) findViewById(R.id.AAChartView);

        // 获取传递过来的信息。
        this.chartType = getIntent().getStringExtra(CHART_TYPE);
        this.step = getIntent().getStringExtra(STEP);

        aaChartModel = new AAChartModel()
                .chartType(this.chartType)
                .title("title")
                .subtitle("subtitleubtitleSubtitle")
                .dataLabelEnabled(true)
                .legendVerticalAlign(AAChartModel.AAChartLegendVerticalAlignType.Bottom);

        if ((this.chartType == AAChartModel.AAChartType.Area && this.step == "TRUE")
                || (this.chartType == AAChartModel.AAChartType.Line && this.step == "TRUE")) {
            this.aaChartModel =  this.aaChartModel.series(
                    new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(getStepChartSeriesData(1))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("NewYork")
                                    .data(getStepChartSeriesData(2))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("London")
                                    .data(getStepChartSeriesData(3))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("Berlin")
                                    .data(getStepChartSeriesData(4))
                                    .step(true)

                    });

        } else  {
            this.aaChartModel =  this.aaChartModel.series(
                    new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(getSeriesData(1))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("NewYork")
                                    .data(getSeriesData(2))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("London")
                                    .data(getSeriesData(3))
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("Berlin")
                                    .data(getSeriesData(4))
                                    .step(true)

                    });
        }


        aaChartView.aa_drawChartWithChartModel(aaChartModel);


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
     ArrayList<Number> getSeriesData(int series) {
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

    /**
     *
     * @param series
     * @return
     */
    ArrayList<Number> getStepChartSeriesData(int series) {
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
