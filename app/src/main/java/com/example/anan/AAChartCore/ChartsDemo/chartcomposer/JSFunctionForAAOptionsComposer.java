package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartAnimationType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartFontWeightType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartLineDashStyleType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartStackingType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartVerticalAlignType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAAnimation;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAHover;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AALabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAMarker;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPoint;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPointEvents;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASelect;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASeries;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStates;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStyle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATitle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATooltip;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAXAxis;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAYAxis;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;
import com.github.AAChartModel.AAChartCore.AATools.AAGradientColor;
import com.github.AAChartModel.AAChartCore.AATools.AALinearGradientDirection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JSFunctionForAAOptionsComposer {

    //https://github.com/AAChartModel/AAChartKit/issues/780
    public static AAOptions customDoubleXAxesChart() {
        Map<String, Object> gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#7052f4",
                "#00b0ff"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        Map<String, Object> gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#EF71FF",
                "#4740C8"//颜色字符串设置支持十六进制类型和 rgba 类型
        );

        AAChart aaChart = new AAChart()
                .type(AAChartType.Bar);

        AATitle aaTitle = new AATitle()
                .text("2015 年德国人口金字塔")
                .style(new AAStyle()
                        .color("#000000")
                        .fontSize(12.0));

        String[] aaCategories = new String[]{"0-4", "5-9", "10-14", "15-19",
                "20-24", "25-29", "30-34", "35-39", "40-44",
                "45-49", "50-54", "55-59", "60-64", "65-69",
                "70-74", "75-79", "80-84", "85-89", "90-94",
                "95-99", "100 + "};

        AAXAxis aaXAxis1 = new AAXAxis()
                .reversed(true)
                .categories(aaCategories)
                .labels(new AALabels()
                        .step(1))
                ;

        AAXAxis aaXAxis2 = new AAXAxis()
                .reversed(true)
                .opposite(true)
                .categories(aaCategories)
                .linkedTo(0)
                .labels(new AALabels()
                        .step(1));

        AAYAxis aaYAxis = new AAYAxis()
                .gridLineWidth(0)// Y 轴网格线宽度
                .title(new AATitle()
                        .text(""))//Y 轴标题
                .labels(new AALabels()
                        .formatter("function () {\n" +
                                "    return (Math.abs(this.value) / 1000000) + 'M';\n" +
                                "}"))
                .min(-4000000)
                .max(4000000);

        AAPlotOptions aaPlotOptions = new AAPlotOptions()
                .series(new AASeries()
                        .animation(new AAAnimation()
                                .duration(800)
                                .easing(AAChartAnimationType.Bounce)
                        )
                        .stacking(AAChartStackingType.Normal));

        AATooltip aaTooltip = new AATooltip()
                .enabled(true)
                .shared(false)
                .formatter("function () {\n" +
                        "    return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +\n" +
                        "        '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);\n" +
                        "}");

        AASeriesElement aaSeriesElement1 = new AASeriesElement()
                .name("Men")
                .color(gradientColorDic1)
                .data(new Object[]{-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
                        -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768,
                        -2176300, -1329968, -836804, -354784, -90569, -28367, -3878});

        AASeriesElement aaSeriesElement2 = new AASeriesElement()
                .name("Women")
                .color(gradientColorDic2)
                .data(new Object[]{1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
                        3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638,
                        1447162, 1005011, 330870, 130632, 21208});

        return new AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxisArray(new AAXAxis[]{aaXAxis1,aaXAxis2})
                .yAxis(aaYAxis)
                .plotOptions(aaPlotOptions)
                .tooltip(aaTooltip)
                .series(new Object[]{aaSeriesElement1,aaSeriesElement2});
    }

    //https://github.com/AAChartModel/AAChartKit/issues/967
    public static AAOptions disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Bar)
                .title("Custom Bar Chart select color")
                .yAxisReversed(true)
                .xAxisReversed(true)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("ElementOne")
                                .data(new Object[]{211,183,157,133,111,91,73,57,43,31,21,13,7,3})
                                .allowPointSelect(true)
                                .states(new AAStates()
                                .hover(new AAHover()
                                        .color(AAColor.Yellow))
                                .select(new AASelect()
                                        .color(AAColor.Red))
                        )
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        AAPoint aaPoint = new AAPoint()
                .events(new AAPointEvents()
                        .click("function () {\n" +
                                "         if (this.selected == true) {\n" +
                                "             this.selected = false;\n" +
                                "         }\n" +
                                "         return;\n" +
                                "     }"));

        aaOptions.plotOptions.series
                .point(aaPoint);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit/issues/589
    public static AAOptions customizeEveryDataLabelSinglelyByDataLabelsFormatter() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .dataLabelsEnabled(true)
                .tooltipEnabled(false)
                .colorsTheme(new Object[]{AAGradientColor.FizzyPeach})
                .markerRadius(0)
                .legendEnabled(false)
                .categories(new String[]{"美国🇺🇸","欧洲🇪🇺","中国🇨🇳","日本🇯🇵","韩国🇰🇷","越南🇻🇳","中国香港🇭🇰",})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.yAxis.gridLineDashStyle = AAChartLineDashStyleType.LongDash;//设置Y轴的网格线样式为 AAChartLineDashStyleType.LongDash

        String[] unitArr ={"美元", "欧元", "人民币", "日元", "韩元", "越南盾", "港币", };
        String unitJSArrStr = javaScriptArrayStringWithJavaArray(unitArr);
        String dataLabelsFormatter = String.format("function () {\n" +
                "        return this.y + %s[this.point.index];  \n" +  //单组 series 图表, 获取选中的点的索引是 this.point.index ,多组并且共享提示框,则是this.points[0].index
                "    }", unitJSArrStr);

        AADataLabels aaDatalabels = aaOptions.plotOptions.series.dataLabels;
        aaDatalabels
                .style(AAStyle.style(AAColor.Red, 10, AAChartFontWeightType.Bold, "1px 1px contrast"))
                .formatter(dataLabelsFormatter)
                .backgroundColor(AAColor.White)// white color
                .borderColor(AAColor.Red)// red color
                .borderRadius(1.5)
                .borderWidth(1.3)
                .x(3).y(-20)
                .verticalAlign(AAChartVerticalAlignType.Middle);

        return aaOptions;
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/404
    public static AAOptions configureColorfulDataLabelsForPieChart() {
        AAOptions aaOptions = new AAOptions()
                .title(new AATitle()
                        .text("Colorful DataLabels For Pie Chart"))
                .colors(new Object[]{
                        "#0c9674", "#7dffc0", "#ff3333", "#facd32", "#ffffa0",
                        "#EA007B", "#fe117c", "#ffc069", "#06caf4", "#7dffc0"
                })
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type(AAChartType.Pie)
                                .name("语言热度值")
                                .innerSize("20%")//内部圆环半径大小占比
                                .borderWidth(0)//描边的宽度
                                .allowPointSelect(true)//是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                                .states(new AAStates()
                                        .hover(new AAHover()
                                                .enabled(false)))//禁用点击区块之后出现的半透明遮罩层
                                .dataLabels(new AADataLabels()
                                        .allowOverlap(true)//允许字符重叠
                                        .useHTML(true)
                                        .formatter("function () {\n" +
                                                "       const point = this.point;\n" +
                                                "       return '<span style=\\\"color: ' + point.color + '\\\">' +\n" +
                                                "           point.name + ': ' + point.y + '%</span>';\n" +
                                                "   }"))
                                .data(new Object[][]{
                                        {"Firefox", 3336.2},
                                        {"IE", 26.8},
                                        {"Chrome", 666.8},
                                        {"Safari", 88.5},
                                        {"Opera", 46.0},
                                        {"Others", 223.0},
                                        {"Firefox", 3336.2},
                                        {"IE", 26.8},
                                        {"Chrome", 666.8},
                                        {"Safari", 88.5},
                                        {"Opera", 46.0},
                                        {"Others", 223.0},
                                })
                });

        return aaOptions;
    }

    public static AAOptions verifyBeforeAndAfterDrawJavaScriptCallbacks() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .title("Before / After Draw JS Demo")
                .subtitle("背景将由 beforeDraw 脚本修改")
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月"})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("访客量")
                                .data(new Object[]{45, 88, 63, 72, 95, 102})
                                .color(AAGradientColor.MysticMauve)
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions
                .beforeDrawChartJavaScript("function () {"
                        + "console.log('beforeDrawChartJavaScript fired');"
                        + "var container = document.getElementById('container');"
                        + "if (container) {"
                        + "container.style.background = 'linear-gradient(135deg, #FFEFD5 0%, #FFDAB9 100%)';"
                        + "container.setAttribute('data-before-draw', 'executed');"
                        + "}"
                        + "}")
                .afterDrawChartJavaScript("function () {"
                        + "console.log('afterDrawChartJavaScript fired');"
                        + "if (typeof aaGlobalChart !== 'undefined' && aaGlobalChart) {"
                        + "aaGlobalChart.setTitle({ text: 'JS 回调已执行 ✅' });"
                        + "aaGlobalChart.renderer.label('afterDraw 已执行', 10, 10)"
                        + ".attr({ zIndex: 8, padding: 10 })"
                        + ".css({ color: '#FFFFFF', fontSize: '12px', backgroundColor: 'rgba(25, 118, 210, 0.75)' })"
                        + ".add();"
                        + "}"
                        + "}");

        return aaOptions;
    }


        private static String javaScriptArrayStringWithJavaArray(Object[] javaArray) {
        StringBuilder originalJsArrStr = new StringBuilder();
        for (Object element : javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',");
        }

        return "[" + originalJsArrStr + "]";
    }

    static ArrayList<Map<String, Object>> createSplineDataWithCurve(double[] point1, double[] point2, double curveOffset) {
        double x0 = point1[0];
        double y0 = point1[1];
        double x2 = point2[0];
        double y2 = point2[1];

        double x1 = (x0 + x2) / 2;
        double y1 = (y0 + y2) / 2 + curveOffset;

        ArrayList<Map<String, Object>> data = new ArrayList<>();

        // 第一个点
        Map<String, Object> point1Map = new HashMap<>();
        point1Map.put("x", x0);
        point1Map.put("y", y0);
        data.add(point1Map);

        // 中间虚拟点
        Map<String, Object> virtualPoint = new HashMap<>();
        virtualPoint.put("x", x1);
        virtualPoint.put("y", y1);

        Map<String, Object> marker = new HashMap<>();
        marker.put("enabled", false);
        Map<String, Object> states = new HashMap<>();
        Map<String, Object> hover = new HashMap<>();
        hover.put("enabled", false);
        states.put("hover", hover);
        marker.put("states", states);
        virtualPoint.put("marker", marker);

        Map<String, Object> dataLabels = new HashMap<>();
        dataLabels.put("enabled", false);
        virtualPoint.put("dataLabels", dataLabels);

        virtualPoint.put("isVirtual", true);
        data.add(virtualPoint);

        // 第二个点
        Map<String, Object> point2Map = new HashMap<>();
        point2Map.put("x", x2);
        point2Map.put("y", y2);
        data.add(point2Map);

        return data;
    }

    //https://github.com/AAChartModel/AAChartCore/issues/208
    public static AAOptions doublePointsSplineChart() {
        double[] dataPoint1 = {1.0, 5.0};
        double[] dataPoint2 = {8.0, 15.0};
        ArrayList<Map<String, Object>> splineData = createSplineDataWithCurve(dataPoint1, dataPoint2, 2.0);

        AAOptions options = new AAOptions()
                .chart(new AAChart()
                        .type(AAChartType.Spline))
                .title(new AATitle()
                        .text("两点间的曲线 (中间点无交互)"))
                .tooltip(new AATooltip()
                        .useHTML(true)
                        .formatter("function() {\n" +
                                "            if (!this.points || this.points.length === 0) {\n" +
                                "                return false;\n" +
                                "            }\n" +
                                "            \n" +
                                "            let wholeContentStr = this.points[0].x + '<br/>';\n" +
                                "            let length = this.points.length;\n" +
                                "            \n" +
                                "            for (let i = 0; i < length; i++) {\n" +
                                "                let thisPoint = this.points[i];\n" +
                                "                \n" +
                                "                if (thisPoint.point && thisPoint.point.isVirtual) {\n" +
                                "                    return false;\n" +
                                "                }\n" +
                                "                \n" +
                                "                let yValue = thisPoint.y;\n" +
                                "                if (yValue != 0) {\n" +
                                "                    let prefixStr = '<span style=\\\"' + 'color:'+ thisPoint.color + '; font-size:13px\\\"' + '>◉ ';\n" +
                                "                    wholeContentStr += prefixStr + thisPoint.series.name + ': ' + yValue + '<br/>';\n" +
                                "                }\n" +
                                "            }\n" +
                                "            return wholeContentStr;\n" +
                                "        }"

                        ))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Curved Line")
                                .data(splineData.toArray())
                                .marker(new AAMarker()
                                .enabled(true)
                                .radius(5f))
                });

        return options;
    }
}
