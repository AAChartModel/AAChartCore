package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import static com.github.AAChartModel.AAChartCore.AATools.AADate.AADateUTC;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartEvents;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartAlignType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartAxisType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartLineDashStyleType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartStackingType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolStyleType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AACrosshair;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAInactive;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AALabel;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AALabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAMarker;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotBandsElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotLinesElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAScatter;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASeries;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStates;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAStyle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATitle;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATooltip;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAXAxis;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAYAxis;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;

import java.util.Locale;


public class JSFunctionForAAChartEventsComposer {
    //https://github.com/AAChartModel/AAChartKit-Swift/issues/345
    public static AAOptions setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .colorsTheme(new String[]{"#04d69f", "#1e90ff", "#ef476f", "#ffd066",})
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
                                .id("google-trends")
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
                                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
                                .valueSuffix(" % of best month"))
                        ,
                        new AASeriesElement()
                                .name("收入")
                                .id("revenue")
                                .type(AAChartType.Area)
                                .data(new AADataElement[]{
                                        new AADataElement().x(1257033600).y(2),
                                        new AADataElement().x(1259625600).y(3),
                                        new AADataElement().x(1262304000).y(2),
                                        new AADataElement().x(1264982400).y(3),
                                        new AADataElement().x(1267401600).y(4),
                                        new AADataElement().x(1270080000).y(4),
                                        new AADataElement().x(1272672000).y(4),
                                        new AADataElement().x(1275350400).y(4),
                                        new AADataElement().x(1277942400).y(5),
                                        new AADataElement().x(1280620800).y(7),
                                        new AADataElement().x(1283299200).y(6),
                                        new AADataElement().x(1285891200).y(9),
                                        new AADataElement().x(1288569600).y(10),
                                        new AADataElement().x(1291161600).y(8),
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
                                .tooltip(new AATooltip()
//                    .xDateFormat("%B %Y")
                                        .valueSuffix(" % of best month")
                        )
                        ,
                        new AASeriesElement()
                                .yAxis(1)
                                .name("Highsoft 员工")
                                .id("employees")
                                .type(AAChartType.Area)
                                .step("left")
                                .tooltip(new AATooltip()
                                        .headerFormat("{point.x:%B %e, %Y}")
                                        .pointFormat("{point.name}{point.y}")
                                        .valueSuffix(" employees"))
                                .data(new Object[]{
                                new AADataElement().x(AADateUTC(2009, 10, 1)).y(1).name("Torstein 一个人工作"),
                                new AADataElement().x(AADateUTC(2010, 10, 20)).y(2).name("Grethe 加入"),
                                new AADataElement().x(AADateUTC(2011, 3, 1)).y(3).name("Erik 加入"),
                                new AADataElement().x(AADateUTC(2011, 7, 1)).y(4).name("Gert 加入"),
                                new AADataElement().x(AADateUTC(2011, 7, 15)).y(5).name("Hilde 加入"),
                                new AADataElement().x(AADateUTC(2012, 5, 1)).y(6).name("Guro 加入"),
                                new AADataElement().x(AADateUTC(2012, 8, 1)).y(5).name("Erik left"),
                                new AADataElement().x(AADateUTC(2012, 8, 15)).y(6).name("Anne Jorunn"),
                                new AADataElement().x(AADateUTC(2013, 0, 1)).y(7).name("Hilde T"),
                                new AADataElement().x(AADateUTC(2013, 7, 1)).y(8).name("Jon Arild"),
                                new AADataElement().x(AADateUTC(2013, 7, 20)).y(9).name("Øystein 加入"),
                                new AADataElement().x(AADateUTC(2013, 9, 1)).y(1).name("Stephane 加入"),
                                new AADataElement().x(AADateUTC(2014, 9, 1)).y(1).name("Anita 加入"),
                                new AADataElement().x(AADateUTC(2014, 10, 27)).y(1).name(""),
                        })});
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
//https://www.highcharts.com/forum/viewtopic.php?t=44985
    public static AAOptions configureBlinkMarkerChart() {
        Double[] dataArr = new Double[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6};
        int selectedIndex = dataArr.length - 1;
        return new AAOptions()
                .chart(new AAChart()
                        .events(new AAChartEvents()
                                .load( String.format(Locale.CHINA, "function() {" +
                                                "const chart = this;" +
                                                "const point = chart.series[0].points[%d];" +
                                                "let big = true;" +
                                                "setInterval(() => {" +
                                                "big = !big;" +
                                                "point.update({" +
                                                "marker: {" +
                                                "radius: big ? 5 : 15" +
                                                "}" +
                                                "})" +
                                                "}, 500);" +
                                                "}",
                                        selectedIndex)
                                )))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(dataArr)
                                .marker(new AAMarker()
                                .lineColor(AAColor.Red)
                                .lineWidth(3f)
                                .radius(10f))
                });
    }



    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
//https://www.highcharts.com/forum/viewtopic.php?t=44985
    public static AAOptions configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect() {
        Object[] stopsArr = new Object[]{
                new Object[]{0.00f, "#febc0f"},//颜色字符串设置支持十六进制类型和 rgba 类型
                new Object[]{0.25f, "#FF14d4"},
                new Object[]{0.50f, "#0bf8f5"},
                new Object[]{0.75f, "#F33c52"},
                new Object[]{1.00f, "#1904dd"},
        };

        AAMarker aaMarker = new AAMarker()
                .radius(8f)//曲线连接点半径
                .symbol(AAChartSymbolType.Circle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                .fillColor(AAColor.White)//点的填充色(用来设置折线连接点的填充色)
                .lineWidth(5f)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                .lineColor(AAColor.Red);

        AADataElement singleSpecialData = new AADataElement()
                .marker(aaMarker)
                .y(26.5f);

        return new AAOptions()
                .chart(new AAChart()
                        .type(AAChartType.Spline)
                        .backgroundColor("#4b2b7f")
                        .events(new AAChartEvents()
                                .load("function () {\n" +
                                        "                          const chart = this;\n" +
                                        "                          const point = chart.series[0].points[11];\n" +
                                        "                          let big = true;\n" +
                                        "                          setInterval(() => {\n" +
                                        "                                 big = !big;\n" +
                                        "                                 point.update({\n" +
                                        "                                      marker: {\n" +
                                        "                                        radius: big ? 5 : 55,\n" +
                                        "                                        fillColor: big ? \"white\": \"red\",\n" +
                                        "                                        lineWidth: big ? 5 : 15,\n" +
                                        "                                        lineColor: big ? \"green\": \"yellow\",\n" +
                                        "                                      }\n" +
                                        "                                 })\n" +
                                        "                          }, 500)\n" +
                                        "                     }")
                        )
                )

                .title(new AATitle()
                        .text("Special style single data element chart")
                )
                .tooltip(new AATooltip()
                        .enabled(true)
                )
                .xAxis(new AAXAxis()
                        .visible(false)
                )
                .yAxis(new AAYAxis()
                        .visible(false)
                )
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Virtual Data")
                                .lineWidth(6f)
                                .data(new Object[]{
                                        7.0f, 6.9f, 2.5f, 14.5f, 18.2f, singleSpecialData, 5.2f, 26.5f, 23.3f, 45.3f, 13.9f, 9.6f
                                })
                                .color(AAColor.Red)
                });
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
//https://echarts.apache.org/examples/zh/editor.html?c=scatter-effect
    public static AAOptions configureScatterChartWithBlinkEffect() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Scatter)
                .title("Height and weight distribution by sex")
                .yAxisTitle("kg")
                .markerRadius(8)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Blink Scatter")
                                .color(AAColor.Green)
                                .data(new Object[]{
                                new Object[]{172.7, 105.2},
                                new Object[]{153.4, 42}
                        }),
                        new AASeriesElement()
                                .name("Female")
                                .color("#ff0000")
                                .data(new Object[][] {
                                {161.2, 51.6}, {167.5, 59.0}, {159.5, 49.2}, {157.0, 63.0}, {155.8, 53.6},
                                {170.0, 59.0}, {159.1, 47.6}, {166.0, 69.8}, {176.2, 66.8}, {160.2, 75.2},
                                {172.5, 55.2}, {170.9, 54.2}, {172.9, 62.5}, {153.4, 42.0}, {160.0, 50.0},
                                {147.2, 49.8}, {168.2, 49.2}, {175.0, 73.2}, {157.0, 47.8}, {167.6, 68.8},
                                {159.5, 50.6}, {175.0, 82.5}, {166.8, 57.2}, {176.5, 87.8}, {170.2, 72.8},
                                {174.0, 54.5}, {173.0, 59.8}, {179.9, 67.3}, {170.5, 67.8}, {160.0, 47.0},
                                {154.4, 46.2}, {162.0, 55.0}, {176.5, 83.0}, {160.0, 54.4}, {152.0, 45.8},
                                {162.1, 53.6}, {170.0, 73.2}, {160.2, 52.1}, {161.3, 67.9}, {166.4, 56.6},
                                {168.9, 62.3}, {163.8, 58.5}, {167.6, 54.5}, {160.0, 50.2}, {161.3, 60.3},
                                {167.6, 58.3}, {165.1, 56.2}, {160.0, 50.2}, {170.0, 72.9}, {157.5, 59.8},
                                {167.6, 61.0}, {160.7, 69.1}, {163.2, 55.9}, {152.4, 46.5}, {157.5, 54.3},
                                {168.3, 54.8}, {180.3, 60.7}, {165.5, 60.0}, {165.0, 62.0}, {164.5, 60.3},
                                {156.0, 52.7}, {160.0, 74.3}, {163.0, 62.0}, {165.7, 73.1}, {161.0, 80.0},
                                {162.0, 54.7}, {166.0, 53.2}, {174.0, 75.7}, {172.7, 61.1}, {167.6, 55.7},
                                {151.1, 48.7}, {164.5, 52.3}, {163.5, 50.0}, {152.0, 59.3}, {169.0, 62.5},
                                {164.0, 55.7}, {161.2, 54.8}, {155.0, 45.9}, {170.0, 70.6}, {176.2, 67.2},
                                {170.0, 69.4}, {162.5, 58.2}, {170.3, 64.8}, {164.1, 71.6}, {169.5, 52.8},
                                {163.2, 59.8}, {154.5, 49.0}, {159.8, 50.0}, {173.2, 69.2}, {170.0, 55.9},
                                {161.4, 63.4}, {169.0, 58.2}, {166.2, 58.6}, {159.4, 45.7}, {162.5, 52.2},
                                {159.0, 48.6}, {162.8, 57.8}, {159.0, 55.6}, {179.8, 66.8}, {162.9, 59.4},
                                {161.0, 53.6}, {151.1, 73.2}, {168.2, 53.4}, {168.9, 69.0}, {173.2, 58.4},
                                {171.8, 56.2}, {178.0, 70.6}, {164.3, 59.8}, {163.0, 72.0}, {168.5, 65.2},
                                {166.8, 56.6}, {172.7, 88.8}, {163.5, 51.8}, {169.4, 63.4}, {167.8, 59.0},
                                {159.5, 47.6}, {167.6, 63.0}, {161.2, 55.2}, {160.0, 45.0}, {163.2, 54.0},
                                {162.2, 50.2}, {161.3, 60.2}, {149.5, 44.8}, {157.5, 58.8}, {163.2, 56.4},
                                {172.7, 62.0}, {155.0, 49.2}, {156.5, 67.2}, {164.0, 53.8}, {160.9, 54.4},
                                {162.8, 58.0}, {167.0, 59.8}, {160.0, 54.8}, {160.0, 43.2}, {168.9, 60.5},
                                {158.2, 46.4}, {156.0, 64.4}, {160.0, 48.8}, {167.1, 62.2}, {158.0, 55.5},
                                {167.6, 57.8}, {156.0, 54.6}, {162.1, 59.2}, {173.4, 52.7}, {159.8, 53.2},
                                {170.5, 64.5}, {159.2, 51.8}, {157.5, 56.0}, {161.3, 63.6}, {162.6, 63.2},
                                {160.0, 59.5}, {168.9, 56.8}, {165.1, 64.1}, {162.6, 50.0}, {165.1, 72.3},
                                {166.4, 55.0}, {160.0, 55.9}, {152.4, 60.4}, {170.2, 69.1}, {162.6, 84.5},
                                {170.2, 55.9}, {158.8, 55.5}, {172.7, 69.5}, {167.6, 76.4}, {162.6, 61.4},
                                {167.6, 65.9}, {156.2, 58.6}, {175.2, 66.8}, {172.1, 56.6}, {162.6, 58.6},
                                {160.0, 55.9}, {165.1, 59.1}, {182.9, 81.8}, {166.4, 70.7}, {165.1, 56.8},
                                {177.8, 60.0}, {165.1, 58.2}, {175.3, 72.7}, {154.9, 54.1}, {158.8, 49.1},
                                {172.7, 75.9}, {168.9, 55.0}, {161.3, 57.3}, {167.6, 55.0}, {165.1, 65.5},
                                {175.3, 65.5}, {157.5, 48.6}, {163.8, 58.6}, {167.6, 63.6}, {165.1, 55.2},
                                {165.1, 62.7}, {168.9, 56.6}, {162.6, 53.9}, {164.5, 63.2}, {176.5, 73.6},
                                {168.9, 62.0}, {175.3, 63.6}, {159.4, 53.2}, {160.0, 53.4}, {170.2, 55.0},
                                {162.6, 70.5}, {167.6, 54.5}, {162.6, 54.5}, {160.7, 55.9}, {160.0, 59.0},
                                {157.5, 63.6}, {162.6, 54.5}, {152.4, 47.3}, {170.2, 67.7}, {165.1, 80.9},
                                {172.7, 70.5}, {165.1, 60.9}, {170.2, 63.6}, {170.2, 54.5}, {170.2, 59.1},
                                {161.3, 70.5}, {167.6, 52.7}, {167.6, 62.7}, {165.1, 86.3}, {162.6, 66.4},
                                {152.4, 67.3}, {168.9, 63.0}, {170.2, 73.6}, {175.2, 62.3}, {175.2, 57.7},
                                {160.0, 55.4}, {165.1, 77.7}, {174.0, 55.5}, {170.2, 77.3}, {160.0, 80.5},
                                {167.6, 64.5}, {167.6, 72.3}, {167.6, 61.4}, {154.9, 58.2}, {162.6, 81.8},
                                {175.3, 63.6}, {171.4, 53.4}, {157.5, 54.5}, {165.1, 53.6}, {160.0, 60.0},
                                {174.0, 73.6}, {162.6, 61.4}, {174.0, 55.5}, {162.6, 63.6}, {161.3, 60.9},
                                {156.2, 60.0}, {149.9, 46.8}, {169.5, 57.3}, {160.0, 64.1}, {175.3, 63.6},
                                {169.5, 67.3}, {160.0, 75.5}, {172.7, 68.2}, {162.6, 61.4}, {157.5, 76.8},
                                {176.5, 71.8}, {164.4, 55.5}, {160.7, 48.6}, {174.0, 66.4}, {163.8, 67.3}})
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.chart.events(new AAChartEvents()
                .load("function() {\n" +
                        "                const chart = this;\n" +
                        "                const blinkScatterPointsArr = chart.series[0].points;\n" +
                        "                const range = blinkScatterPointsArr.length;\n" +
                        "                for (let i = 0; i < range; i++) {\n" +
                        "                    const point = blinkScatterPointsArr[i];\n" +
                        "                    let big = true;\n" +
                        "                    setInterval(() => {\n" +
                        "                            big = !big;\n" +
                        "                            point.update({\n" +
                        "                                marker: {\n" +
                        "                                radius: big ? 5 : 25,\n" +
                        "                                    fillColor: big ? \"pink\": \"red\",\n" +
                        "                                        lineWidth: big ? 5 : 15,\n" +
                        "                                        lineColor: big ? \"gold\": \"yellow\",\n" +
                        "                            }\n" +
                        "                            })\n" +
                        "                    }, 600)\n" +
                        "                }\n" +
                        "            }"));
        return aaOptions;
    }




    //https://github.com/AAChartModel/AAChartKit/issues/1093
    //https://github.com/highcharts/highcharts-ios/issues/97
    public static AAOptions automaticallyHideTooltipAfterItIsShown() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Areaspline)//图表类型
                .colorsTheme(new String[]{"#04d69f", "#1e90ff", "#ef476f", "#ffd066",})
                .stacking(AAChartStackingType.Normal)
                .yAxisVisible(false)
                .markerRadius(0)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}),
                        new AASeriesElement()
                                .name("NewYork")
                                .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5}),
                        new AASeriesElement()
                                .name("London")
                                .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0}),
                        new AASeriesElement()
                                .name("Berlin")
                                .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8})
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

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart
                .events(new AAChartEvents()
                        .load("function() {\n" +
                                "   const chart = this;\n" +
                                "   Highcharts.addEvent(\n" +
                                "       chart.tooltip,\n" +
                                "       'refresh',\n" +
                                "       function () {\n" +
                                "           chart.tooltip.hide(888);\n" + //设置 tooltip 自动隐藏的时间，单位为 ms
                                "   });\n" +
                                "}"));

        return aaOptions;
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1383
//https://www.highcharts.com/forum/viewtopic.php?t=49409
//    dynamicHeightGridLineAreaChart in Java
    public static AAOptions dynamicHeightGridLineAreaChart() {
        return new AAOptions()
                .title(new AATitle()
                        .text("dynamicHeightGridLineAreaChart"))
                .chart(new AAChart()
                        .type(AAChartType.Scatter)
                        .events(new AAChartEvents()
                                .load("function() {\n" +
                                        "   const chart = this;\n" +
                                        "   const mainSeries = chart.series[0];\n" +
                                        "   mainSeries.data.forEach((point, i) => {\n" +
                                        "       chart.addSeries({\n" +
                                        "           data: [\n" +
                                        "               [i, 0],\n" +
                                        "               [i, point.y]\n" +
                                        "           ]\n" +
                                        "       })\n" +
                                        "   })\n" +
                                        "}")))
                .plotOptions(new AAPlotOptions()
                        .scatter(new AAScatter()
                                .lineWidth(2)
                                .lineColor("#dbe751")
                                .dashStyle(AAChartLineDashStyleType.LongDash)
                                .enableMouseTracking(false)
                                .linkedTo("main")
                                .states(new AAStates()
                                        .inactive(new AAInactive()
                                                .enabled(false)))
                                .marker(new AAMarker()
                                        .enabled(false))))
                .yAxis(new AAYAxis()
                        .gridLineWidth(0))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .type(AAChartType.Areaspline)
                                .id("main")
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .lineWidth(6)
                                .color("#dbe751")
                                .fillOpacity(0.4f)
                                .marker(new AAMarker()
                                .enabled(false))
                });
    }


    //https://github.com/AAChartModel/AAChartKit-Swift-Pro/issues/3
//https://www.highcharts.com/forum/viewtopic.php?f=9&t=49492
    public static AAOptions customizeYAxisPlotLinesLabelBeSpecialStyle() {
        return new AAOptions()
                .chart(new AAChart()
                        .events(new AAChartEvents()
                                .load("function() {\n" +
                                        "   const chart = this,\n" +
                                        "   ren = chart.renderer,\n" +
                                        "   plotLineLabel = chart.yAxis[0].plotLinesAndBands[0].label,\n" +
                                        "   {\n" +
                                        "           x: labelX,\n" +
                                        "       y: labelY,\n" +
                                        "       width: labelWidth,\n" +
                                        "       height: labelHeight\n" +
                                        "       } = plotLineLabel.getBBox(),\n" +
                                        "   x = labelX + labelWidth,\n" +
                                        "   y = labelY,\n" +
                                        "   lh = labelHeight,\n" +
                                        "   ll = 40;\n" +
                                        "\n" +
                                        "   chart.customLabelTriangle = ren.path(['M', x - ll, y, x, y, x + lh, y + lh / 2, x, y + lh, x - ll, y + lh, 'Z']).attr({\n" +
                                        "       fill: '#a9a9ff',\n" +
                                        "                  }).add().toFront();\n" +
                                        "              }")))
                .yAxis(new AAYAxis()
                        .visible(true)
                        .lineWidth(2)
                        .plotLines(new AAPlotLinesElement[]{
                                new AAPlotLinesElement()
                                        .value(6.5f)
                                        .color("#a9a9ff")
                                        .width(2)
                                        .dashStyle(AAChartLineDashStyleType.Dash)
                                        .label(new AALabel()
                                        .useHTML(true)
                                        .textAlign(AAChartAlignType.Center)
                                        .x(0).y(2)
                                        .formatter("function () {\n" +
                                                "               return `<span style=\"padding: 2px 10px; display: block; color: white\">`+this.options.value+`</span>`\n" +
                                                "               }"))
                        }))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{2, 5, 2, 3, 6})
                });
    }

    ////https://stackoverflow.com/questions/47392848/set-ecg-paper-like-grid-intervals-highcharts-js
    //func configureECGStyleChart() -> AAOptions {
    //    return AAOptions()
    //        .title(AATitle()
    //            .text("ECG Paper Style Chart"))
    //        .chart(AAChart()
    //            .events(AAChartEvents()
    //                .render("""
    //                    function () {
    //                        const chart = this;
    //                        const axes = chart.axes;
    //                        let showMinorTicks = true;
    //
    //                        axes.forEach((a) => {
    //                                if (Object.keys(a.minorTicks).length === 0) {
    //                                    showMinorTicks = false;
    //                                }
    //                        });
    //
    //                        axes.forEach((a) => {
    //                                for (var key in a.minorTicks) {
    //                                    var mt = a.minorTicks[key].gridLine;
    //                                    showMinorTicks ? mt.show() : mt.hide();
    //                                }
    //                        });
    //                    }
    //                    """
    //                     )))
    //        .xAxis(AAXAxis()
    //            .tickInterval(0.5)
    //            .minorTicks(true)
    //            .minorTickInterval(0.1)
    //            .gridLineWidth(1)
    //            .gridLineColor("#ff0000"))
    //        .yAxis(AAYAxis()
    //            .tickInterval(0.5)
    //            .minorTicks(true)
    //            .minorTickInterval(0.1)
    //            .gridLineWidth(1)
    //            .gridLineColor("#ff0000"))
    //        .series([
    //            AASeriesElement()
    //                .data([1, 3, 4, 6, 1, 2, 2, 6, 1, 1, 1, 4, 6])
    //        ])
    //}

    //https://stackoverflow.com/questions/47392848/set-ecg-paper-like-grid-intervals-highcharts-js
    public static AAOptions configureECGStyleChart() {
        return new AAOptions()
                .chart(new AAChart()
                        .events(new AAChartEvents()
                                .render("function () {\n" +
                                        "       const chart = this;\n" +
                                        "       const axes = chart.axes;\n" +
                                        "       let showMinorTicks = true;\n" +
                                        "\n" +
                                        "       axes.forEach((a) => {\n" +
                                        "               if (Object.keys(a.minorTicks).length === 0) {\n" +
                                        "                   showMinorTicks = false;\n" +
                                        "               }\n" +
                                        "       });\n" +
                                        "\n" +
                                        "       axes.forEach((a) => {\n" +
                                        "               for (var key in a.minorTicks) {\n" +
                                        "                   var mt = a.minorTicks[key].gridLine;\n" +
                                        "                   showMinorTicks ? mt.show() : mt.hide();\n" +
                                        "               }\n" +
                                        "       });\n" +
                                        "   }")))
                .xAxis(new AAXAxis()
                        .tickInterval(0.5f)
                        .minorTicks(true)
                        .minorTickInterval(0.1f)
                        .gridLineWidth(1)
                        .gridLineColor("#ff0000"))
                .yAxis(new AAYAxis()
                        .tickInterval(0.5f)
                        .minorTicks(true)
                        .minorTickInterval(0.1f)
                        .gridLineWidth(1)
                        .gridLineColor("#ff0000"))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{1, 3, 4, 6, 1, 2, 2, 6, 1, 1, 1, 4, 6})
                });
    }
}




