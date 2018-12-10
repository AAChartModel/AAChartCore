package com.example.anan.chartcore_slim.AATools;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;

import java.util.HashMap;

public class AAColor {

    public static String blackColor() {
        return "black";
    }

    public static String darkGrayColor() {
        return "darkGray";
    }

    public static String lightGrayColor() {
        return "lightGray";
    }

    public static String whiteColor() {
        return "white";
    }

    public static String grayColor() {
        return "gray";
    }

    public static String redColor() {
        return "red";
    }

    public static String greenColor() {
        return "green";
    }

    public static String blueColor() {
        return "blue";
    }

    public static String cyanColor() {
        return "cyan";
    }

    public static String yellowColor() {
        return "yellow";
    }

    public static String magentaColor() {
        return "magenta";
    }

    public static String orangeColor() {
        return "orange";
    }

    public static String purpleColor() {
        return "purple";
    }

    public static String brownColor() { return "brown"; }

    public static String clearColor() {
        return "clear";
    }

    public static class AAOptionsConstructor
    {
        public static HashMap<String, Object> configureChartOptions(AAChartModel aaChartModel)
        {
            HashMap aaChart = new HashMap<String, Object>();
            aaChart.put("type", aaChartModel.chartType);//图表类型
            aaChart.put("inverted", aaChartModel.inverted);//设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
            aaChart.put("backgroundColor", aaChartModel.backgroundColor);//图表背景色
            aaChart.put("animation", true);//是否开启图表渲染动画
            aaChart.put("pinchType", aaChartModel.zoomType);//设置手势缩放方向
            aaChart.put("panning", true);//设置手势缩放后是否可平移
            aaChart.put("polar", aaChartModel.polar);//是否极化图表(开启极坐标模式)
            aaChart.put("marginLeft", aaChartModel.marginLeft);//图表左边距
            aaChart.put("marginRight", aaChartModel.marginRight);//图表右边距

            HashMap aaTitle = new HashMap<String, Object>();
            aaTitle.put("text", aaChartModel.title);//标题文本内容
            HashMap aaTitleStyle = new HashMap<String, Object>();
            aaTitleStyle.put("color", aaChartModel.titleColor);//标题文字颜色
            aaTitleStyle.put("fontSize", "12px");//标题文字大小
            aaTitle.put("style", aaTitleStyle);

            HashMap aaSubtitle = new HashMap<String, Object>();
            aaSubtitle.put("text", aaChartModel.subtitle);//富标题文本内容
            HashMap aaSubtitleStyle = new HashMap<String, Object>();
            aaSubtitleStyle.put("color", aaChartModel.subTitleColor);//副标题文字颜色
            aaSubtitleStyle.put("fontSize", "9px");//副标题文字大小
            aaSubtitle.put("style", aaSubtitleStyle);

            HashMap aaTooltip = new HashMap<String, Object>();
            aaTooltip.put("enabled", aaChartModel.tooltipEnabled);//是否开启浮动提示框 tooltip
            aaTooltip.put("valueSuffix", aaChartModel.tooltipValueSuffix);// 浮动提示框数字的单位后缀
            aaTooltip.put("shared", true);//多组 series 数据时,是否共享浮动提示框,默认共享
            aaTooltip.put("crosshairs", aaChartModel.tooltipCrosshairs);

            HashMap aaSeries = new HashMap<String, Object>();
            aaSeries.put("stacking", aaChartModel.stacking);//图表堆叠样式类型
            HashMap aaAnimation = new HashMap<String, Object>();
            aaAnimation.put("duration", aaChartModel.animationDuration);//图表渲染的动画时间
            aaAnimation.put("easing", aaChartModel.animationType);//图表渲染的动画类型
            aaSeries.put("animation", aaAnimation);

            HashMap aaPlotOptions = new HashMap<String, Object>();
            aaPlotOptions.put("series", aaSeries);

            //数据点标记的相关配置
            aaPlotOptions = configureAAPlotOptionsMarkerStyle(aaChartModel,aaSeries,aaPlotOptions);
            //配置 aaPlotOptions 的 dataLabels 等相关内容
            aaPlotOptions = configureAAPlotOptionsDataLabels(aaPlotOptions,aaChartModel);

            HashMap aaLegend = new HashMap<String, Object>();
            aaLegend.put("enabled", aaChartModel.legendEnabled);//是否显示图表的图例,默认显示
            aaLegend.put("layout", aaChartModel.legendLayout); //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
            aaLegend.put("align", aaChartModel.legendAlign);//设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
            aaLegend.put("verticalAlign", aaChartModel.legendVerticalAlign);//设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
            aaLegend.put("borderWidth", 0);
            HashMap aaLegendItemSyle = new HashMap<String, Object>();
            aaLegend.put("color", aaChartModel.axisColor);//图例的文字颜色,默认图例的文字颜色和X轴文字颜色一样
            aaLegend.put("itemStyle", aaLegendItemSyle);


            HashMap aaOptions = new HashMap<String, Object>();
            aaOptions.put("chart", aaChart);
            aaOptions.put("title", aaTitle);
            aaOptions.put("subtitle", aaSubtitle);
            aaOptions.put("tooltip", aaTooltip);
            aaOptions.put("legend", aaLegend);
            aaOptions.put("plotOptions", aaPlotOptions);
            aaOptions.put("colors", aaChartModel.colorsTheme);//图表的主体颜色数组
            aaOptions.put("series", aaChartModel.series);//图表的数据列数组
            aaOptions.put("axisColor", aaChartModel.axisColor);//图表的 x 轴颜色

            configureAxisContentAndStyle(aaOptions,aaChartModel);

            return aaOptions;
        }

        private static HashMap<String,Object> configureAAPlotOptionsMarkerStyle(AAChartModel aaChartModel,
                                                                                HashMap<String,Object> aaSeries,
                                                                                HashMap<String,Object> aaPlotOptions)
        {
            String chartType = aaChartModel.chartType;
            //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图,散点图)才有数据点标记
            if (       chartType == AAChartModel.AAChartType.Area
                    || chartType == AAChartModel.AAChartType.AreaSpline
                    || chartType == AAChartModel.AAChartType.Line
                    || chartType == AAChartModel.AAChartType.Spline
                    || chartType == AAChartModel.AAChartType.Scatter)
            {
                HashMap aaMarker = new HashMap<String, Object>();
                aaMarker.put("radius", aaChartModel.markerRadius);//曲线连接点半径，默认是4
                aaMarker.put("symbol",aaChartModel.symbol);//曲线连接点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                //设置曲线连接点风格样式
                if (aaChartModel.symbolStyle == AAChartModel.AAChartSymbolStyleType.InnerBlank)
                {
                    aaMarker.put("fillColor", "#FFFFFF");//点的填充色(用来设置折线连接点的填充色)
                    aaMarker.put("lineWidth", 2);//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    aaMarker.put("lineColor", "");//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
                }
                else if (aaChartModel.symbolStyle == AAChartModel.AAChartSymbolStyleType.BorderBlank)
                {
                    aaMarker.put("lineWidth", 2);//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    aaMarker.put("lineColor", aaChartModel.backgroundColor);//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
                }
                aaSeries.put("marker", aaMarker);
                aaPlotOptions.put("series", aaSeries);
            }
            return aaPlotOptions;
        }


        private static HashMap<String,Object> configureAAPlotOptionsDataLabels (HashMap<String,Object> aaPlotOptions,
                                                                                AAChartModel aaChartModel)
        {

            String chartType = aaChartModel.chartType;
            HashMap aaDataLabels = new HashMap<String, Object>();
            aaDataLabels.put("enabled", aaChartModel.xAxisLabelsEnabled);
            HashMap aaSomeTypeChart = new HashMap<String, Object>();

            if (       chartType == AAChartModel.AAChartType.Column
                    || chartType == AAChartModel.AAChartType.Bar)
            {
                aaSomeTypeChart.put("borderWidth", 0);
                aaSomeTypeChart.put("borderRadius", aaChartModel.borderRadius);
                aaSomeTypeChart.put("dataLabels", aaDataLabels);
                if (aaChartModel.polar == true)
                {
                    aaSomeTypeChart.put("pointPadding", 0);
                    aaSomeTypeChart.put("groupPadding", 0.005);
                }
            }
            else if (chartType == AAChartModel.AAChartType.Pie)
            {
                aaSomeTypeChart.put("allowPointSelect", true);
                aaSomeTypeChart.put("cursor", "pointer");
                aaSomeTypeChart.put("showInLegend", aaChartModel.legendEnabled);
                aaDataLabels.put("format", "{point.name}");
                aaSomeTypeChart.put("dataLabels", aaDataLabels);
            }
            else
            {
                aaSomeTypeChart.put("dataLabels",aaDataLabels);
            }
            aaPlotOptions.put(chartType,aaSomeTypeChart);

            return aaPlotOptions;
        }

        private static void configureAxisContentAndStyle (HashMap<String,Object> aaOptions,
                                                          AAChartModel aaChartModel)
        {

            if (       aaChartModel.chartType != AAChartModel.AAChartType.Pie
                    && aaChartModel.chartType != AAChartModel.AAChartType.Pyramid
                    && aaChartModel.chartType != AAChartModel.AAChartType.Funnel  )
            {
                HashMap aaAxisLabel = new HashMap<String, Object>();
                aaAxisLabel.put("enabled", aaChartModel.xAxisLabelsEnabled);

                HashMap aaXAxis = new HashMap<String, Object>();
                aaXAxis.put("label", aaAxisLabel);
                aaXAxis.put("reversed", aaChartModel.xAxisReversed);
                aaXAxis.put("gridLineWidth", aaChartModel.xAxisGridLineWidth);
                aaXAxis.put("categories", aaChartModel.categories);
                aaXAxis.put("visible", aaChartModel.xAxisVisible);

                HashMap aaYAxis = new HashMap<String, Object>();
                aaYAxis.put("label", aaAxisLabel);
                aaYAxis.put("reversed", aaChartModel.yAxisReversed);
                aaYAxis.put("gridLineWidth", aaChartModel.yAxisGridLineWidth);
                aaYAxis.put("title", aaChartModel.yAxisTitle);
                aaYAxis.put("lineWidth", aaChartModel.yAxisLineWidth);
                aaYAxis.put("visible", aaChartModel.yAxisVisible);

                aaOptions.put("xAxis",aaXAxis);
                aaOptions.put("yAxis", aaYAxis);
            }
        }


    }
}
