package com.example.anan.chartcore_slim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {
            /*基础类型图表*/
            "Column Chart---柱形图",
            "Bar Chart---条形图",
            "Area Chart---折线填充图",
            "Areaspline Chart---曲线填充图",
            "Step Area Chart--- 直方折线填充图",
            "Step Line Chart--- 直方折线图",
            "Line Chart---折线图",
            "Spline Chart---曲线图",
            /*特殊类型图表*/
            "Pie Chart---扇形图",
            "Bubble Chart---气泡图",
            "Scatter Chart---散点图",
            "Arearange Chart---区域范围图",
            "Columnrange Chart--- 柱形范围图",
            "Step Line Chart--- 直方折线图",
            "Step Area Chart--- 直方折线填充图",
            "Boxplot Chart--- 箱线图",
            "Waterfall Chart--- 瀑布图",
            "Pyramid Chart---金字塔图",
            "Funnel Chart---漏斗图",
            /*Mixed Chart---混合图*/
            "Arearange Mixed Line---面积范围均线图",
            "Columnrange Mixed Line---柱形范围图混合折线图",
            "Dash Style Types Mixed---多种类型曲线混合图",
            "Negative Color Mixed---基准线以下异色混合图",
            "scatterMixedLine---散点图混合折线图(待完成)",
            "Negative Color Mixed bubble---基准线以下异色气泡图"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position,
                                    long id) {
                System.out.println(position);
                if (position <= 7 ) {
            goToAnotherActivity(position);
                }

            }

        });
    }

    void goToAnotherActivity(int position) {
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

        String chartType = chartTypeArr[position];


        Intent intent = new Intent(this, CommonChartActivity.class);
        intent.putExtra(CommonChartActivity.RETURN_INFO, chartType);
        startActivity(intent);
    }



    }



