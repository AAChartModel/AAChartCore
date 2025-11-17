package com.example.anan.AAChartCore.ChartsDemo.ChartListProvider;

import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.AreaChartOptionsComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.BarOrColumnChartOptionsComposer;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.PieChartOptionsComposer;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;

import java.util.ArrayList;
import java.util.List;

public class OfficalSamplesChartProvider {

    public static List<AAOptions> officalChartSampleItems() {
        List<AAOptions> allItems = new ArrayList<>();
        allItems.addAll(areaChartSamples());
        allItems.addAll(barOrColumnChartSamples());
        allItems.addAll(pieChartSamples());

        return processChartOptions(allItems);
    }

    // Area Chart Samples

    private static List<AAOptions> areaChartSamples() {
        List<AAOptions> charts = new ArrayList<>();

        // 基础面积图
        charts.add(AreaChartOptionsComposer.basicAreaChart());
        // 带有负值的面积图
        charts.add(AreaChartOptionsComposer.areaWithNegativeValuesChart());
        // 堆积面积图
        charts.add(AreaChartOptionsComposer.stackedAreaChart());
        // 百分比堆积面积图
        charts.add(AreaChartOptionsComposer.percentStackedAreaChart());
        // 带有缺失点的面积图
        charts.add(AreaChartOptionsComposer.areaWithMissingPointsChart());
        // 翻转面积图
        charts.add(AreaChartOptionsComposer.invertedAreaChart());
        // 曲线面积图
        charts.add(AreaChartOptionsComposer.areasplineChart());
        // 区域范围图
        charts.add(AreaChartOptionsComposer.arearangeChart());
        // 区域范围图和折线图混合图
        charts.add(AreaChartOptionsComposer.arearangeAndLineChart());

        return charts;
    }

    // Bar/Column Chart Samples

    private static List<AAOptions> barOrColumnChartSamples() {
        List<AAOptions> charts = new ArrayList<>();

        // 基础柱状图
        charts.add(BarOrColumnChartOptionsComposer.basicBarChart());
        // 堆积柱状图
        charts.add(BarOrColumnChartOptionsComposer.stackingBarChart());
        // 人口金字塔图
        charts.add(BarOrColumnChartOptionsComposer.populationPyramidChart());
        // 基础条形图
        charts.add(BarOrColumnChartOptionsComposer.basicColumnChart());
        // 带有负值的条形图
        charts.add(BarOrColumnChartOptionsComposer.basicColumnChartWithNegativeValue());
        // 带有数据标签的堆积条形图
        charts.add(BarOrColumnChartOptionsComposer.basicColumnChartWithStackedDataLabels());
        // 带有数据标签的堆积条形图2
        charts.add(BarOrColumnChartOptionsComposer.basicColumnChartWithStackedDataLabels2());
        // 百分比堆积条形图
        charts.add(BarOrColumnChartOptionsComposer.percentStackedColumnChart());
        // 带有旋转标签的条形图
        charts.add(BarOrColumnChartOptionsComposer.columnChartWithRotatedLabels());
        // 嵌套条形图
        charts.add(BarOrColumnChartOptionsComposer.columnChartWithNestedColumn());
        // 条形范围图
        charts.add(BarOrColumnChartOptionsComposer.columnRangeChart());

        return charts;
    }

    // Pie Chart Samples

    private static List<AAOptions> pieChartSamples() {
        List<AAOptions> charts = new ArrayList<>();

        // 基本饼状图
        charts.add(PieChartOptionsComposer.basicPieChart());
        // 带有图例的基本饼状图
        charts.add(PieChartOptionsComposer.basicPieChartWithLegend());
        // 带有渐变色的基本饼状图
        charts.add(PieChartOptionsComposer.basicPieChartWithGradientColor());
        // 带有渐变色的基本饼状图
        charts.add(PieChartOptionsComposer.basicPieChartWithGradientColor2());
        // 带有单色的基本饼状图
        charts.add(PieChartOptionsComposer.basicPieChartWithMonochromeColor());
        // 自定义饼状图标题位置
        charts.add(PieChartOptionsComposer.customPieChartTitlePosition());

        return charts;
    }

    // Helper Methods

    private static List<AAOptions> processChartOptions(List<AAOptions> options) {
        // 遍历 options 列表,将其中的每个 AAOptions 实例进行处理
        List<AAOptions> finalItems = new ArrayList<>();
        for (AAOptions aaOptions : options) {
            // 可以在这里对每个 AAOptions 实例进行额外的处理
            // 例如：aaOptions.getChart().setPolar(true); // 如果需要极坐标图表
            finalItems.add(aaOptions);
        }
        return finalItems;
    }
}