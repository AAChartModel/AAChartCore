package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.AdvancedUpdatingFeatureActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DoubleChartsLinkedWorkActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.EvaluateJSStringFunctionActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.HideOrShowChartSeriesActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.OnlyRefreshChartDataActivity;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.ScrollableChartActivity;
import com.example.anan.AAChartCore.R;


public class MainActivity extends AppCompatActivity {
    private static final String  kChartTypeKey = "chartType";

    private String[][] chartTypeNameArr = {
            /*即时刷新📈📊图表数据*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",
                    "Scatter Chart---散点图",},
            /*图表高级更新功能*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",},
            /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
            {
                    "eval JS function 1",
                    "eval JS function 2",
                    "eval JS function 3",},
            /*Double Charts Linked Work---双表联动*/
            {
                    "doubleChartsLinkedWork",},
            /*Scrollable Chart---可滚动图表*/
            {
                    "Column Chart---柱形图",
                    "Bar Chart---条形图",
                    "Area Chart---折线填充图",
                    "Areaspline Chart---曲线填充图",
                    "Step Area Chart--- 直方折线填充图",
                    "Step Line Chart--- 直方折线图",
                    "Line Chart---折线图",
                    "Spline Chart---曲线图",},
    };

    String[][] chartTypeArr = {
            {
                    /*即时刷新📈📊图表数据*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    "stepArea",
                    "stepLine",
                    AAChartType.Line,
                    AAChartType.Spline,
                    AAChartType.Scatter,
            },
            {
                    /*图表高级更新功能*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    AAChartType.Area,
                    AAChartType.Line,
                    AAChartType.Line,
                    AAChartType.Spline,
            },
            {
                    /*执行由 JavaScript 字符串映射转换成的 js function 函数*/
                    "evalJSFunction1",
                    "evalJSFunction2",
                    "evalJSFunction3",
            },
            {
                    /*Double Charts Linked Work---双表联动*/
                    "doubleChartsLinkedWork",
            },
            {
                    /*Scrollable Chart---可滚动图表*/
                    AAChartType.Column,
                    AAChartType.Bar,
                    AAChartType.Area,
                    AAChartType.Areaspline,
                    AAChartType.Area,
                    AAChartType.Line,
                    AAChartType.Line,
                    AAChartType.Spline,
            },
    };

    private String chartType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTabLayout();
        setupExpandableListView();

        findViewById(R.id.show_chart_list_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChartCategorySelectionActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab thirdTab = tabLayout.getTabAt(3);
        if (thirdTab != null && !thirdTab.isSelected()) {
            thirdTab.select();
        }
    }

    void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab moreTab = tabLayout.getTabAt(3);
        if (moreTab != null) {
            moreTab.select();
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, AAChartModelListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, AAOptionsListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, AAOptionsWithJSListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                onTabSelected(tab);
            }
        });
    }

    void  setupExpandableListView() {
        String[] groupTitleArr = {
                "Only Refresh data | 即时刷新图表数据",
                "Chart Options Advanced Updating | 图表高级更新",
                "Evaluate JS String Function | 执行js函数",
                "Double Charts Linked Work | 双表联动",
                "Scrollable chart | 可滚动的图表",
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.exlist_lol);
        MyBaseExpandableListAdapter myAdapter = new MyBaseExpandableListAdapter(groupTitleArr, chartTypeNameArr,this);
        listView.setAdapter(myAdapter);

        //为列表设置点击事件
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
               String chartType = chartTypeArr[groupPosition][childPosition];
                switch (groupPosition) {
                    case 0: /*即时刷新📈📊图表数据*/
                        goToOnlyRefreshChartDataActivity(chartType);
                        break;
                    case 1: /*图表高级更新功能*/
                        goToAdvancedUpdatingFeatureActivity(chartType,childPosition);
                        break;
                    case 2:  /*eval JS Function*/
                        goToEvaluateJSStringFunctionActivity(chartType);
                        break;
                    case 3:  /*Double Charts Linked Work*/
                        goToDoubleChartsLinkedWorkActivity(chartType);
                        break;
                    case 4: /*Scrollable Chart---可滚动图表*/
                        gotoScrollableChartActivity(chartType,childPosition);
                        break;
                }

                Toast.makeText(MainActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }


    void goToOnlyRefreshChartDataActivity(String chartType) {
        Intent intent = new Intent(this, OnlyRefreshChartDataActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToAdvancedUpdatingFeatureActivity(String chartType, int position) {
        Intent intent = new Intent(this, AdvancedUpdatingFeatureActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }

    void goToEvaluateJSStringFunctionActivity(String chartType) {
        Intent intent = new Intent(this, EvaluateJSStringFunctionActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToHideOrShowChartSeriesActivity(String chartType) {
        Intent intent = new Intent(this, HideOrShowChartSeriesActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void goToDoubleChartsLinkedWorkActivity(String chartType) {
        Intent intent = new Intent(this, DoubleChartsLinkedWorkActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }

    void gotoScrollableChartActivity(String chartType, int position) {
        Intent intent = new Intent(this, ScrollableChartActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        intent.putExtra("position",position);
        startActivity(intent);
    }


}



