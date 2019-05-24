package com.example.anan.chartcore_slim.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.R;

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
            "--------------Polar Chart---极地图图-------------",
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
            "---------------arearangeMixedLine-----------------",
            "columnrangeMixedLine",
            "stackingColumnMixedLine",
            "dashStyleTypeMixed",
            "negativeColorMixed",
            "scatterMixedLine",
            "negativeColorMixedBubble",
            "polygonMixedScatter",
            "polarChartMixed",
            "-----------------colorfulChart-----------------r",
            "gradientColorfulChart",
            "discontinuousDataChart",
            "-----------------drawChartWithOptionsOne-----------------r",
            "Two",
            "Three",
            "Four",

    };

    String[] chartTypeArr = {
            /*基础类型图表*/
            AAChartModel.Type.Column,
            AAChartModel.Type.Bar,
            AAChartModel.Type.Area,
            AAChartModel.Type.Areaspline,
            AAChartModel.Type.Area,
            AAChartModel.Type.Line,
            AAChartModel.Type.Line,
            AAChartModel.Type.Spline,
            /*特殊类型图表*/
            AAChartModel.Type.Column,
            AAChartModel.Type.Pie,
            AAChartModel.Type.Bubble,
            AAChartModel.Type.Scatter,
            AAChartModel.Type.Arearange,
            AAChartModel.Type.Columnrange,
            AAChartModel.Type.Line,
            AAChartModel.Type.Area,
            AAChartModel.Type.Boxplot,
            AAChartModel.Type.Waterfall,
            AAChartModel.Type.Pyramid,
            AAChartModel.Type.Funnel,

            /*Mixed Chart---混合图*/
            "arearangeMixedLine",
            "columnrangeMixedLine",
            "stackingColumnMixedLine",
            "dashStyleTypeMixed",
            "negativeColorMixed",
            "scatterMixedLine",
            "negativeColorMixedBubble",
            "polygonMixedScatter",
            "polarChartMixed",
            "colorfulChart",
            "gradientColorfulChart",
            "discontinuousDataChart",
            "configureAAPlotBandsForChart",
            "configureAAPlotLinesForChart",
            "customAATooltipWithJSFuntion",
            "customXAxisCrosshairStyle"
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
                } else if (position > 7 && position <= 19 ) {
                    goToSpecialChartActivity(position);
                } else if (position > 19 && position <= 28 ) {
                    goToMixedChartActivity(position);
                } else if (position > 28 && position <= 31 )  {
                    goToCustomStyleChartActivity(position);
                } else {
                    goToDrawChartWithAAOptionsActivity(position);
                }
            }

        });
    }

    void goToAnotherActivity(int position) {
        Intent intent = new Intent(this, CommonChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);
        intent.putExtra("position",position);

        startActivity(intent);
    }

    void goToSpecialChartActivity(int position) {
        Intent intent = new Intent(this, SpecialChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToCustomStyleChartActivity(int position) {
        Intent intent = new Intent(this, CustomStyleChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToMixedChartActivity(int position) {
        Intent intent = new Intent(this, MixedChartActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }

    void goToDrawChartWithAAOptionsActivity(int position) {
        Intent intent = new Intent(this, DrawChartWithAAOptionsActivity.class);
        intent.putExtra("chartType", chartTypeArr[position]);

        startActivity(intent);
    }



    }



