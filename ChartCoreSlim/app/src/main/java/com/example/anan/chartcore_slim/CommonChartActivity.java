package com.example.anan.chartcore_slim;

import android.content.Intent;
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



    public String chartType;


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


        String[] chartTypeArr = {
            /*基础类型图表*/
                AAChartModel.AAChartType.Column,
                AAChartModel.AAChartType.Bar,
                AAChartModel.AAChartType.Area,
                AAChartModel.AAChartType.AreaSpline,
                AAChartModel.AAChartType.Area,
                AAChartModel.AAChartType.Line,
                AAChartModel.AAChartType.Line,
                AAChartModel.AAChartType.Spline,
            /*特殊类型图表*/
                AAChartModel.AAChartType.Column,
                AAChartModel.AAChartType.Pie,
                AAChartModel.AAChartType.Bubble,
                AAChartModel.AAChartType.Scatter,
                AAChartModel.AAChartType.Arearange,
                AAChartModel.AAChartType.Columnrange,
                AAChartModel.AAChartType.Line,
                AAChartModel.AAChartType.Area,
                AAChartModel.AAChartType.Boxplot,
                AAChartModel.AAChartType.Waterfall,
                AAChartModel.AAChartType.Pyramid,
                AAChartModel.AAChartType.Funnel,
            /*Mixed Chart---混合图*/
                "Arearange Mixed Line---面积范围均线图",
                "Columnrange Mixed Line---柱形范围图混合折线图",
                "Dash Style Types Mixed---多种类型曲线混合图",
                "Negative Color Mixed---基准线以下异色混合图",
                "scatterMixedLine---散点图混合折线图(待完成)",
                "Negative Color Mixed bubble---基准线以下异色气泡图"

        };

//        String position =  getIntent().getExtras(CHART_TYPE);

        Intent intent = getIntent();
        int position = intent.getIntExtra(CHART_TYPE,0);


        String chartType = chartTypeArr[position];

        aaChartModel = new AAChartModel()
                .chartType(chartType)
                .title("title")
                .subtitle("subtitleubtitleSubtitle")
//                .backgroundColor("#4b2b7f")
                .dataLabelEnabled(true)
                .yAxisGridLineWidth(0)
                .legendVerticalAlign(AAChartModel.AAChartLegendVerticalAlignType.Bottom);

        if (position == 4 || position == 5) {
            aaChartModel =  aaChartModel.series(
                    new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(new Object[]{149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("NewYork")
                                    .data(new Object[]{83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3})
                                    .step(true)
                            ,
                            new AASeriesElement()
                                    .name("London")
                                    .data(new Object[]{48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2})
                                    .step(true)
                            ,

                    });

        } else {
            aaChartModel =  aaChartModel.series(
                    new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6})
                            ,
                            new AASeriesElement()
                                    .name("NewYork")
                                    .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5})
                            ,
                            new AASeriesElement()
                                    .name("London")
                                    .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0})
                            ,
                            new AASeriesElement()
                                    .name("Berlin")
                                    .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8})

                    });

        }

        if (chartType.equals(AAChartModel.AAChartType.Area)
                || chartType.equals(AAChartModel.AAChartType.Arearange)) {
            aaChartModel.symbolStyle(AAChartModel.AAChartSymbolStyleType.InnerBlank);
        } else if (chartType.equals(AAChartModel.AAChartType.Line)
                ||chartType.equals(AAChartModel.AAChartType.Spline)) {
            aaChartModel.symbolStyle(AAChartModel.AAChartSymbolStyleType.BorderBlank);
        }

        aaChartView.aa_drawChartWithChartModel(aaChartModel);


//        new AlertDialog.Builder(this)
//                .setTitle("标题")
//                .setMessage(optionsJson)
//                .setPositiveButton("确定", null)
//                .show();
    }

}
