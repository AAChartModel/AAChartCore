package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartEvents;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAlignType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAxisType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartLineDashStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAChart;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AACrosshair;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AADataElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AALabels;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotBandsElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAStyle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATitle;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AATooltip;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAXAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAYAxis;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAColor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class JSFunctionForAAChartEventsComposer {
    //https://github.com/AAChartModel/AAChartKit-Swift/issues/345
    public static AAOptions setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .colorsTheme(new String[]{"#04d69f","#1e90ff","#ef476f","#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .yAxisVisible(false)
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36}),
                        new AASeriesElement()
                                .name("Berlin Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67}),
                        new AASeriesElement()
                                .name("London Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64}),
                        new AASeriesElement()
                                .name("NewYork Hot")
                                .lineWidth(5.0)
                                .fillOpacity(0.4)
                                .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53}),
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();

        aaOptions.tooltip
                .style(AAStyle.style(AAColor.White))
                .backgroundColor("#050505")
                .borderColor("#050505");

        aaOptions.xAxis
                .crosshair(new AACrosshair()
                        .color(AAColor.DarkGray)
                        .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                        .width(2));

        //默认选中的位置索引
        int defaultSelectedIndex = 5;

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart
                .events(new AAChartEvents()
                        .load(String.format("function() {\n" +
                                "                let points = [];\n" +
                                "                let chart = this;\n" +
                                "                let series = chart.series;\n" +
                                "                let length = series.length;\n" +
                                "                           \n" +
                                "                for (let i = 0; i < length; i++) {\n" +
                                "                    let pointElement = series[i].data[%s];\n" +
                                "                    points.push(pointElement);\n" +
                                "                }\n" +
                                "                chart.xAxis[0].drawCrosshair(null, points[0]);\n" +
                                "                chart.tooltip.refresh(points);\n" +
                                "                       }", defaultSelectedIndex)));


        return aaOptions;
    }

    public static AAOptions generalDrawingChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .backgroundColor(AAColor.White)
                        .events(new AAChartEvents()
                                .load("function () {\n" +
                                        "                var ren = this.renderer,\n" +
                                        "                    colors = Highcharts.getOptions().colors,\n" +
                                        "                    rightArrow = ['M', 0, 0, 'L', 100, 0, 'L', 95, 5, 'M', 100, 0, 'L', 95, -5],\n" +
                                        "                    leftArrow = ['M', 100, 0, 'L', 0, 0, 'L', 5, 5, 'M', 0, 0, 'L', 5, -5];\n" +
                                        "\n" +
                                        "\n" +
                                        "                ren.path(['M', 120, 40, 'L', 120, 330])\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: 'silver',\n" +
                                        "                        dashstyle: 'dash'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.path(['M', 420, 40, 'L', 420, 330])\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: 'silver',\n" +
                                        "                        dashstyle: 'dash'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Web client', 20, 40)\n" +
                                        "                    .css({\n" +
                                        "                        fontWeight: 'bold'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "                ren.label('Web service / CLI', 220, 40)\n" +
                                        "                    .css({\n" +
                                        "                        fontWeight: 'bold'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "                ren.label('Command line client', 440, 40)\n" +
                                        "                    .css({\n" +
                                        "                        fontWeight: 'bold'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('SaaS client<br/>(browser or<br/>script)', 10, 82)\n" +
                                        "                    .attr({\n" +
                                        "                        fill: colors[0],\n" +
                                        "                        stroke: 'white',\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        padding: 5,\n" +
                                        "                        r: 5\n" +
                                        "                    })\n" +
                                        "                    .css({\n" +
                                        "                        color: 'white'\n" +
                                        "                    })\n" +
                                        "                    .add()\n" +
                                        "                    .shadow(true);\n" +
                                        "\n" +
                                        "                ren.path(rightArrow)\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[3]\n" +
                                        "                    })\n" +
                                        "                    .translate(95, 95)\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('POST options in JSON', 90, 75)\n" +
                                        "                    .css({\n" +
                                        "                        fontSize: '10px',\n" +
                                        "                        color: colors[3]\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('PhantomJS', 210, 82)\n" +
                                        "                    .attr({\n" +
                                        "                        r: 5,\n" +
                                        "                        width: 100,\n" +
                                        "                        fill: colors[1]\n" +
                                        "                    })\n" +
                                        "                    .css({\n" +
                                        "                        color: 'white',\n" +
                                        "                        fontWeight: 'bold'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.path(['M', 250, 110, 'L', 250, 185, 'L', 245, 180, 'M', 250, 185, 'L', 255, 180])\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[3]\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('SVG', 255, 120)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[3],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Batik', 210, 200)\n" +
                                        "                    .attr({\n" +
                                        "                        r: 5,\n" +
                                        "                        width: 100,\n" +
                                        "                        fill: colors[1]\n" +
                                        "                    })\n" +
                                        "                    .css({\n" +
                                        "                        color: 'white',\n" +
                                        "                        fontWeight: 'bold'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren\n" +
                                        "                    .path([\n" +
                                        "                        'M', 235, 185,\n" +
                                        "                        'L', 235, 155,\n" +
                                        "                        'C', 235, 130, 235, 130, 215, 130,\n" +
                                        "                        'L', 95, 130,\n" +
                                        "                        'L', 100, 125,\n" +
                                        "                        'M', 95, 130,\n" +
                                        "                        'L', 100, 135\n" +
                                        "                    ])\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[3]\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Rasterized image', 100, 110)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[3],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Browser<br/>running<br/>Highcharts', 10, 180)\n" +
                                        "                    .attr({\n" +
                                        "                        fill: colors[0],\n" +
                                        "                        stroke: 'white',\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        padding: 5,\n" +
                                        "                        r: 5\n" +
                                        "                    })\n" +
                                        "                    .css({\n" +
                                        "                        color: 'white',\n" +
                                        "                        width: '100px'\n" +
                                        "                    })\n" +
                                        "                    .add()\n" +
                                        "                    .shadow(true);\n" +
                                        "\n" +
                                        "\n" +
                                        "                ren.path(rightArrow)\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[1]\n" +
                                        "                    })\n" +
                                        "                    .translate(95, 205)\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('POST SVG', 110, 185)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[1],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.path(leftArrow)\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[1]\n" +
                                        "                    })\n" +
                                        "                    .translate(95, 215)\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Rasterized image', 100, 215)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[1],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Script', 450, 82)\n" +
                                        "                    .attr({\n" +
                                        "                        fill: colors[2],\n" +
                                        "                        stroke: 'white',\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        padding: 5,\n" +
                                        "                        r: 5\n" +
                                        "                    })\n" +
                                        "                    .css({\n" +
                                        "                        color: 'white',\n" +
                                        "                        width: '100px'\n" +
                                        "                    })\n" +
                                        "                    .add()\n" +
                                        "                    .shadow(true);\n" +
                                        "\n" +
                                        "                ren.path(leftArrow)\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[2]\n" +
                                        "                    })\n" +
                                        "                    .translate(330, 90)\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Command', 340, 70)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[2],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.path(rightArrow)\n" +
                                        "                    .attr({\n" +
                                        "                        'stroke-width': 2,\n" +
                                        "                        stroke: colors[2]\n" +
                                        "                    })\n" +
                                        "                    .translate(330, 100)\n" +
                                        "                    .add();\n" +
                                        "\n" +
                                        "                ren.label('Rasterized image', 330, 100)\n" +
                                        "                    .css({\n" +
                                        "                        color: colors[2],\n" +
                                        "                        fontSize: '10px'\n" +
                                        "                    })\n" +
                                        "                    .add();\n" +
                                        "            }")))
                .title(new AATitle()
                        .text("Highcharts export server overview")
                        .style(AAStyle.style(AAColor.Black)));

    }

    public static AAOptions advancedTimeLineChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .backgroundColor(AAColor.Red)
                        .events(new AAChartEvents()
                                .load("function () {\n" +
                                        "                        var centerX = 140;\n" +
                                        "                        var centerY = 110;\n" +
                                        "                        var path = [];\n" +
                                        "                        var angle;\n" +
                                        "                        var radius;\n" +
                                        "                        var badgeColor = Highcharts.color(Highcharts.getOptions().colors[0]).brighten(-0.2).get();\n" +
                                        "                        var spike;\n" +
                                        "                        var empImage;\n" +
                                        "                        var big5;\n" +
                                        "                        var label;\n" +
                                        "                        var left;\n" +
                                        "                        var right;\n" +
                                        "                        var years;\n" +
                                        "                        var renderer;\n" +
                                        "\n" +
                                        "                        if (this.chartWidth < 530) {\n" +
                                        "                            return;\n" +
                                        "                        }\n" +
                                        "\n" +
                                        "                        for (angle = 0; angle < 2 * Math.PI; angle += Math.PI / 24) {\n" +
                                        "                            radius = spike ? 80 : 70;\n" +
                                        "                            path.push(\n" +
                                        "                                'L',\n" +
                                        "                                centerX + radius * Math.cos(angle),\n" +
                                        "                                centerY + radius * Math.sin(angle)\n" +
                                        "                            );\n" +
                                        "                            spike = !spike;\n" +
                                        "                        }\n" +
                                        "                        path[0] = 'M';\n" +
                                        "                        path.push('z');\n" +
                                        "                        this.renderer.path(path)\n" +
                                        "                            .attr({\n" +
                                        "                                fill: badgeColor,\n" +
                                        "                                zIndex: 6\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "\n" +
                                        "                        empImage = this.renderer.path(path)\n" +
                                        "                            .attr({\n" +
                                        "                                zIndex: 7,\n" +
                                        "                                opacity: 0,\n" +
                                        "                                stroke: badgeColor,\n" +
                                        "                                'stroke-width': 1\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "\n" +
                                        "                        big5 = this.renderer.text('5')\n" +
                                        "                            .attr({\n" +
                                        "                                zIndex: 6\n" +
                                        "                            })\n" +
                                        "                            .css({\n" +
                                        "                                color: 'white',\n" +
                                        "                                fontSize: '100px',\n" +
                                        "                                fontStyle: 'italic',\n" +
                                        "                                fontFamily: '\\'Brush Script MT\\', sans-serif'\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "                        big5.attr({\n" +
                                        "                            x: centerX - big5.getBBox().width / 2,\n" +
                                        "                            y: centerY + 14\n" +
                                        "                        });\n" +
                                        "\n" +
                                        "                        label = this.renderer.text('Highcharts Anniversary')\n" +
                                        "                            .attr({\n" +
                                        "                                zIndex: 6\n" +
                                        "                            })\n" +
                                        "                            .css({\n" +
                                        "                                color: '#FFFFFF'\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "\n" +
                                        "                        left = centerX - label.getBBox().width / 2;\n" +
                                        "                        right = centerX + label.getBBox().width / 2;\n" +
                                        "\n" +
                                        "                        label.attr({\n" +
                                        "                            x: left,\n" +
                                        "                            y: centerY + 44\n" +
                                        "                        });\n" +
                                        "\n" +
                                        "                        left = centerX - 90;\n" +
                                        "                        right = centerX + 90;\n" +
                                        "                        this.renderer\n" +
                                        "                            .path([\n" +
                                        "                                'M', left, centerY + 30,\n" +
                                        "                                'L', right, centerY + 30,\n" +
                                        "                                right, centerY + 50,\n" +
                                        "                                left, centerY + 50,\n" +
                                        "                                'z',\n" +
                                        "                                'M', left, centerY + 40,\n" +
                                        "                                'L', left - 20, centerY + 40,\n" +
                                        "                                left - 10, centerY + 50,\n" +
                                        "                                left - 20, centerY + 60,\n" +
                                        "                                left + 10, centerY + 60,\n" +
                                        "                                left, centerY + 50,\n" +
                                        "                                left + 10, centerY + 60,\n" +
                                        "                                left + 10, centerY + 50,\n" +
                                        "                                left, centerY + 50,\n" +
                                        "                                'z',\n" +
                                        "                                'M', right, centerY + 40,\n" +
                                        "                                'L', right + 20, centerY + 40,\n" +
                                        "                                right + 10, centerY + 50,\n" +
                                        "                                right + 20, centerY + 60,\n" +
                                        "                                right - 10, centerY + 60,\n" +
                                        "                                right, centerY + 50,\n" +
                                        "                                right - 10, centerY + 60,\n" +
                                        "                                right - 10, centerY + 50,\n" +
                                        "                                right, centerY + 50,\n" +
                                        "                                'z'\n" +
                                        "                            ])\n" +
                                        "                            .attr({\n" +
                                        "                                fill: badgeColor,\n" +
                                        "                                stroke: '#FFFFFF',\n" +
                                        "                                'stroke-width': 1,\n" +
                                        "                                zIndex: 5\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "\n" +
                                        "                        years = this.renderer.text('2009-2014')\n" +
                                        "                            .attr({\n" +
                                        "                                zIndex: 6\n" +
                                        "                            })\n" +
                                        "                            .css({\n" +
                                        "                                color: '#FFFFFF',\n" +
                                        "                                fontStyle: 'italic',\n" +
                                        "                                fontSize: '10px'\n" +
                                        "                            })\n" +
                                        "                            .add();\n" +
                                        "                        years.attr({\n" +
                                        "                            x: centerX - years.getBBox().width / 2,\n" +
                                        "                            y: centerY + 62\n" +
                                        "                        });\n" +
                                        "\n" +
                                        "                        renderer = this.renderer;\n" +
                                        "                        if (renderer.defs) {\n" +
                                        "                            this.get('employees').points.forEach(point => {\n" +
                                        "                                let pattern;\n" +
                                        "                                if (point.image) {\n" +
                                        "                                    pattern = renderer.createElement('pattern').attr({\n" +
                                        "                                        id: 'pattern-' + point.image,\n" +
                                        "                                        patternUnits: 'userSpaceOnUse',\n" +
                                        "                                        width: 400,\n" +
                                        "                                        height: 400\n" +
                                        "                                    }).add(renderer.defs);\n" +
                                        "                                    renderer.image(\n" +
                                        "                                        'https://www.highcharts.com/images/employees2014/' + point.image + '.jpg',\n" +
                                        "                                        centerX - 80,\n" +
                                        "                                        centerY - 80,\n" +
                                        "                                        160,\n" +
                                        "                                        213\n" +
                                        "                                    ).add(pattern);\n" +
                                        "\n" +
                                        "                                    Highcharts.addEvent(point, 'mouseOver', function () {\n" +
                                        "                                        empImage\n" +
                                        "                                            .attr({\n" +
                                        "                                                fill: 'url(#pattern-' + point.image + ')'\n" +
                                        "                                            })\n" +
                                        "                                            .animate({ opacity: 1 }, { duration: 500 });\n" +
                                        "                                    });\n" +
                                        "                                    Highcharts.addEvent(point, 'mouseOut', function () {\n" +
                                        "                                        empImage.animate({ opacity: 0 }, { duration: 500 });\n" +
                                        "                                    });\n" +
                                        "                                }\n" +
                                        "                            });\n" +
                                        "                        }\n" +
                                        "                    }")
                        ))
//
                .xAxis(new AAXAxis()
                        .type(AAChartAxisType.Datetime)
                        .minTickInterval(315360000)
                        .labels(new AALabels()
                                .align(AAChartAlignType.Left))
                        .plotBands(new AAPlotBandsElement[]{
                                new AAPlotBandsElement()
                                        .from(1259280000)
                                        .to(1291161600)
                                        .color("#EFFFFF")
                                        .label(new AALabel()
                                        .text("办事处:Torstein的地下室")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(180)),
                                new AAPlotBandsElement()
                                        .from(1291161600)
                                        .to(1380585600)
                                        .color("#FFFFEF")
                                        .label(new AALabel()
                                        .text("办事处:Tomtebu")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(30)),
                                new AAPlotBandsElement()
                                        .from(1380585600)
                                        .to(1417046400)
                                        .color("#FFEFFF")
                                        .label(new AALabel()
                                        .text("办事处:VikØrsta")
                                        .style(new AAStyle()
                                                .color("#999999"))
                                        .y(30))
                        }))
                .title(new AATitle()
                        .text("Highsoft 公司发展历程"))
                .tooltip(new AATooltip()
                        .style(new AAStyle()
                                .width(250)))
                .yAxisArray(new AAYAxis[]{
                        new AAYAxis()
                                .max(100)
                                .labels(new AALabels()
                                        .enabled(false))
                                .title(new AATitle()
                                        .text(""))
                                .gridLineColor("rgba(0, 0, 0, 0.07)"),
                        new AAYAxis()
                                .allowDecimals(false)
                                .max(15)
                                .labels(new AALabels()
                                        .style(new AAStyle()
                                                .color("#90ed7d")))
                                .title(new AATitle()
                                        .text("雇员")
                                        .style(new AAStyle()
                                                .color("#90ed7d")))
                                .opposite(true)
                                .gridLineWidth(0)
                })
                .plotOptions(new AAPlotOptions()
                                .series(new AASeries()
                                                .marker(new AAMarker()
                                                        .enabled(false)
                                                        .symbol(AAChartSymbolType.Circle)
                                                        .radius(2))
//                .fillOpacity(0.5)
                                )
//            .flags(AAFlags.new
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %e, %Y")))
                )
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type(AAChartType.Line)
//                .id("google-trends")
                                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                                .name("Google search for highcharts")
                                .data(new AADataElement[]{
                                new AADataElement().x(1258322400)/* November 2009 */.y(0),
                                new AADataElement().x(1260961200).y(5),
                                new AADataElement().x(1263639600).y(7),
                                new AADataElement().x(1266188400).y(5),
                                new AADataElement().x(1268740800).y(6),
                                new AADataElement().x(1271368800).y(8),
                                new AADataElement().x(1274004000).y(11),
                                new AADataElement().x(1276639200).y(9),
                                new AADataElement().x(1279274400).y(12),
                                new AADataElement().x(1281952800).y(13),
                                new AADataElement().x(1284588000).y(17),
                                new AADataElement().x(1287223200).y(17),
                                new AADataElement().x(1289858400).y(18),
                                new AADataElement().x(1292497200).y(20),
                                new AADataElement().x(1295175600).y(20),
                                new AADataElement().x(1297724400).y(27),
                                new AADataElement().x(1300276800).y(32),
                                new AADataElement().x(1302904800).y(29),
                                new AADataElement().x(1305540000).y(34),
                                new AADataElement().x(1308175200).y(34),
                                new AADataElement().x(1310810400).y(36),
                                new AADataElement().x(1313488800).y(43),
                                new AADataElement().x(1316124000).y(44),
                                new AADataElement().x(1318759200).y(42),
                                new AADataElement().x(1321394400).y(47),
                                new AADataElement().x(1324033200).y(46),
                                new AADataElement().x(1326711600).y(50),
                                new AADataElement().x(1329303600).y(57),
                                new AADataElement().x(1331899200).y(54),
                                new AADataElement().x(1334527200).y(59),
                                new AADataElement().x(1337162400).y(62),
                                new AADataElement().x(1339797600).y(66),
                                new AADataElement().x(1342432800).y(61),
                                new AADataElement().x(1345111200).y(68),
                                new AADataElement().x(1347746400).y(67),
                                new AADataElement().x(1350381600).y(73),
                                new AADataElement().x(1353016800).y(63),
                                new AADataElement().x(1355655600).y(54),
                                new AADataElement().x(1358334000).y(67),
                                new AADataElement().x(1360882800).y(74),
                                new AADataElement().x(1363435200).y(81),
                                new AADataElement().x(1366063200).y(89),
                                new AADataElement().x(1368698400).y(83),
                                new AADataElement().x(1371333600).y(88),
                                new AADataElement().x(1373968800).y(86),
                                new AADataElement().x(1376647200).y(81),
                                new AADataElement().x(1379282400).y(83),
                                new AADataElement().x(1381917600).y(95),
                                new AADataElement().x(1384552800).y(86),
                                new AADataElement().x(1387191600).y(83),
                                new AADataElement().x(1389870000).y(89),
                                new AADataElement().x(1392418800).y(90),
                                new AADataElement().x(1394971200).y(94),
                                new AADataElement().x(1397599200).y(00),
                                new AADataElement().x(1400234400).y(00),
                                new AADataElement().x(1402869600).y(99),
                                new AADataElement().x(1405504800).y(99),
                                new AADataElement().x(1408183200).y(93),
                                new AADataElement().x(1410818400).y(97),
                                new AADataElement().x(1413453600).y(9),
                        })
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
//                    .valueSuffix(" % of best month"))
                        ,
                        new AASeriesElement()
                                .name("收入")
//                .id("revenue")
                                .type(AAChartType.Area)
                                .data(new AADataElement[]{
                                new AADataElement().x(1257033600).y( 2),
                                new AADataElement().x(1259625600).y( 3),
                                new AADataElement().x(1262304000).y( 2),
                                new AADataElement().x(1264982400).y( 3),
                                new AADataElement().x(1267401600).y( 4),
                                new AADataElement().x(1270080000).y( 4),
                                new AADataElement().x(1272672000).y( 4),
                                new AADataElement().x(1275350400).y( 4),
                                new AADataElement().x(1277942400).y( 5),
                                new AADataElement().x(1280620800).y( 7),
                                new AADataElement().x(1283299200).y( 6),
                                new AADataElement().x(1285891200).y( 9),
                                new AADataElement().x(1288569600).y(10),
                                new AADataElement().x(1291161600).y( 8),
                                new AADataElement().x(1293840000).y(10),
                                new AADataElement().x(1296518400).y(13),
                                new AADataElement().x(1298937600).y(15),
                                new AADataElement().x(1301616000).y(14),
                                new AADataElement().x(1304208000).y(15),
                                new AADataElement().x(1306886400).y(16),
                                new AADataElement().x(1309478400).y(22),
                                new AADataElement().x(1312156800).y(19),
                                new AADataElement().x(1314835200).y(20),
                                new AADataElement().x(1317427200).y(32),
                                new AADataElement().x(1320105600).y(34),
                                new AADataElement().x(1322697600).y(36),
                                new AADataElement().x(1325376000).y(34),
                                new AADataElement().x(1328054400).y(40),
                                new AADataElement().x(1330560000).y(37),
                                new AADataElement().x(1333238400).y(35),
                                new AADataElement().x(1335830400).y(40),
                                new AADataElement().x(1338508800).y(38),
                                new AADataElement().x(1341100800).y(39),
                                new AADataElement().x(1343779200).y(43),
                                new AADataElement().x(1346457600).y(49),
                                new AADataElement().x(1349049600).y(43),
                                new AADataElement().x(1351728000).y(54),
                                new AADataElement().x(1354320000).y(44),
                                new AADataElement().x(1356998400).y(43),
                                new AADataElement().x(1359676800).y(43),
                                new AADataElement().x(1362096000).y(52),
                                new AADataElement().x(1364774400).y(52),
                                new AADataElement().x(1367366400).y(56),
                                new AADataElement().x(1370044800).y(62),
                                new AADataElement().x(1372636800).y(66),
                                new AADataElement().x(1375315200).y(62),
                                new AADataElement().x(1377993600).y(63),
                                new AADataElement().x(1380585600).y(60),
                                new AADataElement().x(1383264000).y(60),
                                new AADataElement().x(1385856000).y(58),
                                new AADataElement().x(1388534400).y(65),
                                new AADataElement().x(1391212800).y(52),
                                new AADataElement().x(1393632000).y(72),
                                new AADataElement().x(1396310400).y(57),
                                new AADataElement().x(1398902400).y(70),
                                new AADataElement().x(1401580800).y(63),
                                new AADataElement().x(1404172800).y(65),
                                new AADataElement().x(1406851200).y(65),
                                new AADataElement().x(1409529600).y(89),
                                new AADataElement().x(1412121600).y(00)
                        })
//                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
//                    .valueSuffix(" % of best month")
//            )
                        ,
                        new AASeriesElement()
                                .yAxis(1)
                                .name("Highsoft 员工")
//                .id("employees")
                                .type(AAChartType.Area)
                                .step("left")
                                .tooltip(new AATooltip()
                                        .headerFormat("{point.x:%B %e, %Y}")
                                        .pointFormat("{point.name}{point.y}")
                                        .valueSuffix(" employees"))
                                .data(new Object[]{
                                new AADataElement().x(AADateUTC(2009, 10,  1)).y(1).name("Torstein 一个人工作"),
                                new AADataElement().x(AADateUTC(2010, 10, 20)).y(2).name("Grethe 加入"),
                                new AADataElement().x(AADateUTC(2011, 3,   1)).y(3).name("Erik 加入"),
                                new AADataElement().x(AADateUTC(2011, 7,   1)).y(4).name("Gert 加入"),
                                new AADataElement().x(AADateUTC(2011, 7,  15)).y(5).name("Hilde 加入"),
                                new AADataElement().x(AADateUTC(2012, 5,   1)).y(6).name("Guro 加入"),
                                new AADataElement().x(AADateUTC(2012, 8,   1)).y(5).name("Erik left"),
                                new AADataElement().x(AADateUTC(2012, 8,  15)).y(6).name("Anne Jorunn"),
                                new AADataElement().x(AADateUTC(2013, 0,   1)).y(7).name("Hilde T"),
                                new AADataElement().x(AADateUTC(2013, 7,   1)).y(8).name("Jon Arild"),
                                new AADataElement().x(AADateUTC(2013, 7,  20)).y(9).name("Øystein 加入"),
                                new AADataElement().x(AADateUTC(2013, 9,   1)).y(1).name("Stephane 加入"),
                                new AADataElement().x(AADateUTC(2014, 9,   1)).y(1).name("Anita 加入"),
                                new AADataElement().x(AADateUTC(2014, 10, 27)).y(1).name(""),
                        })});
    }

    //   get UTC number from date
    private static long AADateUTC(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            date = sdf.parse(year + "-" + month + "-" + day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }
}
