package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLayoutType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartVerticalAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartZoomType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAHover;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPoint;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPointEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeriesEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStates;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;

public class JSFunctionForAALegendComposer {
    public static AAOptions disableLegendClickEventForNormalChart() {
        AASeriesElement element1 = new AASeriesElement()
                .name("Predefined symbol")
                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36});

        AASeriesElement element2 = new AASeriesElement()
                .name("Image symbol")
                .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67});

        AASeriesElement element3 = new AASeriesElement()
                .name("Base64 symbol (*)")
                .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64});

        AASeriesElement element4 = new AASeriesElement()
                .name("Custom symbol")
                .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53});


        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("CUSTOM LEGEND STYLE")
                .subtitle("LEGEND ON THE TOP_RIGHT SIDE WITH VERTICAL STYLE")
                .subtitleAlign(AAChartAlignType.Left)
                .markerRadius(0)
                .backgroundColor(AAColor.White)
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0)
                .yAxisTitle("percent values")
                .zoomType(AAChartZoomType.X)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(new String[]{"mediumspringgreen", "deepskyblue", "red", "sandybrown"})
                .series(new AASeriesElement[]{element1, element2, element3, element4});

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.legend
                .enabled(true)
                .verticalAlign(AAChartVerticalAlignType.Top)//设置图例位于水平方向上的右侧
                .layout(AAChartLayoutType.Vertical)//设置图例排列方式为垂直排布
                .align(AAChartAlignType.Right)//设置图例位于竖直方向上的顶部
        ;

        //禁用图例点击事件
        aaOptions.plotOptions.series.events = new AASeriesEvents()
                .legendItemClick("function() { " +
                        "return false; " +
                        "}");

        return aaOptions;
    }

    //    //https://github.com/AAChartModel/AAChartKit-Swift/issues/391
    //    //https://github.com/AAChartModel/AAChartKit-Swift/issues/393
    public static AAOptions disableLegendClickEventForPieChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Pie)
                .backgroundColor(AAColor.White)
                .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
                .subtitle("virtual data")
                .dataLabelsEnabled(true)//是否直接显示扇形图数据
                .yAxisTitle("℃")
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Language market shares")
                                .innerSize("20%")//内部圆环半径大小占比(内部圆环半径/扇形图半径),
                                .allowPointSelect(true)
                                .states(new AAStates()
                                        .hover(new AAHover()
                                                .enabled(false)//禁用点击区块之后出现的半透明遮罩层
                                        ))
                                .data(new Object[][]{
                                        {"Java", 67},
                                        {"Swift", 999},
                                        {"Python", 83},
                                        {"OC", 11},
                                        {"Go", 30},
                                })
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.legend.labelFormat("{name} {percentage:.2f}%");

        //禁用饼图图例点击事件
        aaOptions.plotOptions.series
                .point(new AAPoint()
                        .events(new AAPointEvents()
                                .legendItemClick("" +
                                        "function() { " +
                                             "return false; " +
                                        "}")));

        return aaOptions;
    }

    //https://bbs.hcharts.cn/article-109-1.html
    //图表自带的图例点击事件是：
    //点击某个显示/隐藏的图例，该图例对应的serie就隐藏/显示。
    //个人觉得不合理，正常来说，有多条折线(或其他类型的图表)，点击某个图例是想只看该图例对应的数据；
    //于是修改了图例点击事件。
    //
    //实现的效果是(以折线图为例)：
    //1. 当某条折线隐藏时，点击该折线的图例 --> 该折线显示；
    //2. 当全部折线都显示时，点击某个图例 --> 该图例对应的折线显示，其他折线均隐藏；
    //3. 当只有一条折线显示时，点击该折线的图例 --> 全部折线均显示；
    //4. 其他情况，按默认处理：
    //显示 --> 隐藏；
    //隐藏 --> 显示；
    //Customized legendItemClick Event online: http://code.hcharts.cn/rencht/hhhhLv/share
    public static AAOptions customLegendItemClickEvent() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"})//设置主题颜色数组
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("2017")
                                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}),
                        new AASeriesElement()
                                .name("2018")
                                .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5}),
                        new AASeriesElement()
                                .name("2019")
                                .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0}),
                        new AASeriesElement()
                                .name("2020")
                                .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8}),
                });


        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.legend
                .enabled(true)
                .align(AAChartAlignType.Right)//设置图例位于水平方向上的右侧
                .layout(AAChartLayoutType.Vertical)//设置图例排列方式为垂直排布
                .verticalAlign(AAChartVerticalAlignType.Top);//设置图例位于竖直方向上的顶部


        //自定义图例点击事件
        aaOptions.plotOptions.series.events = new AASeriesEvents()
                .legendItemClick("function(event) {\n" +
                        "        function getVisibleMode(series, serieName) {\n" +
                        "            var allVisible = true;\n" +
                        "            var allHidden = true;\n" +
                        "            for (var i = 0; i < series.length; i++) {\n" +
                        "                if (series[i].name == serieName)\n" +
                        "                    continue;\n" +
                        "                allVisible &= series[i].visible;\n" +
                        "                allHidden &= (!series[i].visible);\n" +
                        "            }\n" +
                        "            if (allVisible && !allHidden)\n" +
                        "                return 'all-visible';\n" +
                        "            if (allHidden && !allVisible)\n" +
                        "                return 'all-hidden';\n" +
                        "            return 'other-cases';\n" +
                        "        }\n" +
                        "        \n" +
                        "        var series = this.chart.series;\n" +
                        "        var mode = getVisibleMode(series, this.name);\n" +
                        "        var enableDefault = false;\n" +
                        "        if (!this.visible) {\n" +
                        "            enableDefault = true;\n" +
                        "        }\n" +
                        "        else if (mode == 'all-visible') {\n" +
                        "            var seriesLength = series.length;\n" +
                        "            for (var i = 0; i < seriesLength; i++) {\n" +
                        "                var serie = series[i];\n" +
                        "                serie.hide();\n" +
                        "            }\n" +
                        "            this.show();\n" +
                        "        }\n" +
                        "        else if (mode == 'all-hidden') {\n" +
                        "            var seriesLength = series.length;\n" +
                        "            for (var i = 0; i < seriesLength; i++) {\n" +
                        "                var serie = series[i];\n" +
                        "                serie.show();\n" +
                        "            }\n" +
                        "        }\n" +
                        "        else {\n" +
                        "            enableDefault = true;\n" +
                        "        }\n" +
                        "        return enableDefault;\n" +
                        "    }");

        return aaOptions;
    }

}
