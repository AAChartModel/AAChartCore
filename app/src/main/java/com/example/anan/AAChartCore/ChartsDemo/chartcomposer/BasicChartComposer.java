package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartAnimationType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolStyleType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AATools.AAGradientColor;
import com.github.AAChartModel.AAChartCore.AATools.AALinearGradientDirection;

import java.util.Map;

public class BasicChartComposer {

    private static AAChartModel configureBasicOptions() {
        return new AAChartModel()
                .backgroundColor("#4b2b7f")
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0)
                .touchEventEnabled(true);
    }

   public static AAChartModel configureAreaChart() {
        AASeriesElement element1 = new AASeriesElement()
                .name("Tokyo")
                .data(new Object[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6});
        AASeriesElement element2 = new AASeriesElement()
                .name("NewYork")
                .data(new Object[]{0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5});
        AASeriesElement element3 = new AASeriesElement()
                .name("London")
                .data(new Object[]{0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0});
        AASeriesElement element4 = new AASeriesElement()
                .name("Berlin")
                .data(new Object[]{3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8});

       return configureBasicOptions()
               .chartType(AAChartType.Area)
               .categories(new String[]{"Java","Swift","Python","Ruby", "PHP","Go","C","C#","C++"})
               .series(new AASeriesElement[]{element1, element2, element3, element4});
    }

    public static AAChartModel configureStepAreaChartAndStepLineChart() {
        AASeriesElement element1 = new AASeriesElement()
                .name("Tokyo")
                .step(true)
                .data(new Object[]{149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4});

        AASeriesElement element2 = new AASeriesElement()
                .name("NewYork")
                .step(true)
                .data(new Object[]{83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3});

        AASeriesElement element3 = new AASeriesElement()
                .name("London")
                .step(true)
                .data(new Object[]{48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2});

        return configureBasicOptions()
                .chartType(AAChartType.Area)
                .series(new AASeriesElement[]{element1, element2, element3,});
    }

    public static AAChartModel configureColumnChartAndBarChart() {
        return configureAreaChart()
                 .categories(new String[]{
                         "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
                 })
                 .legendEnabled(true)
                 .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"})
                 .animationType(AAChartAnimationType.EaseOutCubic)
                 .animationDuration(1200);
    }

    public static AAChartModel configureAreaChartAndAreasplineChartStyle(String chartType) {
       AAChartModel aaChartModel = configureAreaChart()
                .animationType(AAChartAnimationType.EaseOutQuart)
                .legendEnabled(true)
                .markerRadius(6)
                .markerSymbol(AAChartSymbolType.Circle)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank);

        if (chartType.equals(AAChartType.Areaspline)) {
            Map<String, Object> gradientColorDic = AAGradientColor.linearGradient(
                    AALinearGradientDirection.ToBottomRight,
                    "rgba(138,43,226,1)",
                    "rgba(30,144,255,1)" //颜色字符串设置支持十六进制类型和 rgba 类型
            );

            AASeriesElement element1 = new AASeriesElement()
                    .name("Predefined symbol")
                    .fillColor(gradientColorDic)
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

            aaChartModel
                    .animationType(AAChartAnimationType.EaseFrom)//设置图表渲染动画类型为 EaseFrom
                    .series(new AASeriesElement[]{element1, element2, element3, element4});
        }
        return aaChartModel;
    }


    public static AAChartModel configureLineChartAndSplineChartStyle(String chartType) {
        AAChartModel aaChartModel = configureAreaChart()
                .chartType(chartType)
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//设置折线连接点样式为:边缘白色
                .markerRadius(6);
        if (chartType.equals(AAChartType.Spline)) {
            AASeriesElement element1 = new AASeriesElement()
                    .name("Tokyo")
                    .lineWidth(7)
                    .data(new Object[]{50, 320, 230, 370, 230, 400,});

            AASeriesElement element2 = new AASeriesElement()
                    .name("Berlin")
                    .lineWidth(7)
                    .data(new Object[]{80, 390, 210, 340, 240, 350,});

            AASeriesElement element3 = new AASeriesElement()
                    .name("New York")
                    .lineWidth(7)
                    .data(new Object[]{100, 370, 180, 280, 260, 300,});

            AASeriesElement element4 = new AASeriesElement()
                    .name("London")
                    .lineWidth(7)
                    .data(new Object[]{130, 350, 160, 310, 250, 268,});

            aaChartModel
                    .animationType(AAChartAnimationType.SwingFromTo)
                    .series(new AASeriesElement[]{element1, element2, element3, element4});

        }
        return aaChartModel;
    }
}
