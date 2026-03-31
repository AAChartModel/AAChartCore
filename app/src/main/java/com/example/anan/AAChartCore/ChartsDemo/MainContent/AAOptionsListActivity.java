package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.example.anan.AAChartCore.ChartsDemo.AdditionalContent.DrawChartWithAAOptionsActivity;
import com.example.anan.AAChartCore.R;

public class AAOptionsListActivity extends AppCompatActivity {
    private static final String kChartTypeKey = "chartType";

    private String[][] chartTypeNameArr = {
            /*使用AAOptions绘制图表*/
            {
                    "customLegendStyle",
                    "drawChartWithOptionsOne",
                    "AAPlotLinesForChart",
                    "customAATooltipWithJSFunction",
                    "customXAxisCrosshairStyle",
                    "XAxisLabelsFontColorWithHTMLString",
                    "XAxisLabelsFontColorAndFontSizeWithHTMLString",
                    "_DataLabels_XAXis_YAxis_Legend_Style",
                    "XAxisPlotBand",
                    "configureTheMirrorColumnChart",
                    "configureDoubleYAxisChartOptions",
                    "configureTripleYAxesMixedChart",
                    "customLineChartDataLabelsFormat",
                    "configureDoubleYAxesAndColumnLineMixedChart",
                    "configureDoubleYAxesMarketDepthChart",
                    "customAreaChartTooltipStyleLikeHTMLTable",
                    "simpleGaugeChart",
                    "gaugeChartWithPlotBand",
                    "doubleLayerHalfPieChart",
                    "customAreasplineChartTooltipContentWithHeaderFormat---通过 tooltip 的 headerFormat 属性来自定义 曲线填充图的 tooltip",
                    "customAreaChartTooltipStyleWithTotalValueHeader---浮动提示框 header 显示总值信息",
                    "configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart---自定义 Y 轴的 Labels 国际单位符基数及国际单位符",
                    "timeDataWithIrregularIntervalsChart---X 轴时间不连续的折线图",
                    "logarithmicAxisLineChart---对数轴折线图📈",
                    "logarithmicAxisScatterChart---对数轴散点图",
                    "disableMixedChartInactiveAnimationEffect---禁用混合图表的 inactive 动画效果",
                    "adjustBubbleChartMinAndMax---调整气泡图的 min 和 max 相关属性",
                    "customLineChartDataLabelsFormat---自定义曲线图的 DataLabels 的 format 属性",
                    "customLineChartDataLabelsFormat2---自定义曲线图的 DataLabels 的 format 属性(更简易方法)",
                    "complicatedScatterChart---复杂的自定义散点图",
                    "customColumnrangeChartGroupStyleAndSeriesStatesHoverColor---自定义柱状图 group 样式及 series 元素时的柱形颜色",
                    "customTitleStyle---自定义标题样式",
                    "configureBoxplotChartWithSpecialStyle---自定义盒须图样式",
            },
    };

    String[][] chartTypeArr = {
            {
                    /*使用AAOptions绘制图表*/
                    "customLegendStyle",
                    "AAPlotBandsForChart",
                    "AAPlotLinesForChart",
                    "customAATooltipWithJSFunction",
                    "customXAxisCrosshairStyle",
                    "XAxisLabelsFontColorWithHTMLString",
                    "XAxisLabelsFontColorAndFontSizeWithHTMLString",
                    "_DataLabels_XAXis_YAxis_Legend_Style",
                    "XAxisPlotBand",
                    "configureTheMirrorColumnChart",
                    "configureDoubleYAxisChartOptions",
                    "configureTripleYAxesMixedChart",
                    "customLineChartDataLabelsFormat",
                    "configureDoubleYAxesAndColumnLineMixedChart",
                    "configureDoubleYAxesMarketDepthChart",
                    "customAreaChartTooltipStyleLikeHTMLTable",
                    "simpleGaugeChart",
                    "gaugeChartWithPlotBand",
                    "doubleLayerHalfPieChart",
                    "customAreasplineChartTooltipContentWithHeaderFormat",
                    "customAreaChartTooltipStyleWithTotalValueHeader",
                    "configureYAxisLabelsNumericSymbolsMagnitudeOfAerasplineChart",
                    "timeDataWithIrregularIntervalsChart",
                    "logarithmicAxisLineChart",
                    "logarithmicAxisScatterChart",
                    "disableMixedChartInactiveAnimationEffect",
                    "adjustBubbleChartMinAndMax",
                    "customLineChartDataLabelsFormat",
                    "customLineChartDataLabelsFormat2",
                    "complicatedScatterChart",
                    "customColumnrangeChartGroupStyleAndSeriesStatesHoverColor",
            },
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa_options_list);
        setupTabLayout();
        setupExpandableListView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab tab = tabLayout.getTabAt(1);
        if (tab != null && !tab.isSelected()) {
            tab.select();
        }
    }

    void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab aaOptionsTab = tabLayout.getTabAt(1);
        if (aaOptionsTab != null) {
            aaOptionsTab.select();
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        startActivity(new Intent(AAOptionsListActivity.this, AAChartModelListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 2:
                        startActivity(new Intent(AAOptionsListActivity.this, AAOptionsWithJSListActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
                        break;
                    case 3:
                        startActivity(new Intent(AAOptionsListActivity.this, MainActivity.class)
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

    void setupExpandableListView() {
        String[] groupTitleArr = {
                "Draw Chart With AAOptions | 通过Options绘图",
        };

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.exlist_lol);
        MyBaseExpandableListAdapter myAdapter = new MyBaseExpandableListAdapter(groupTitleArr, chartTypeNameArr, this);
        listView.setAdapter(myAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, android.view.View v, int groupPosition, int childPosition, long id) {
                String chartType = chartTypeArr[groupPosition][childPosition];
                switch (groupPosition) {
                    case 0: /*使用AAOptions绘制图表*/
                        goToDrawChartWithAAOptionsActivity(chartType);
                        break;
                }

                Toast.makeText(AAOptionsListActivity.this, "你点击了：" + chartTypeNameArr[groupPosition][childPosition], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    void goToDrawChartWithAAOptionsActivity(String chartType) {
        Intent intent = new Intent(this, DrawChartWithAAOptionsActivity.class);
        intent.putExtra(kChartTypeKey, chartType);
        startActivity(intent);
    }
}
