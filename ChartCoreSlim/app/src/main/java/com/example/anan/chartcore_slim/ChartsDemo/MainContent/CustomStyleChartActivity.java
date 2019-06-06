package com.example.anan.chartcore_slim.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.AAChartConfiger.AAChartView;
import com.example.anan.chartcore_slim.AAChartConfiger.AASeriesElement;
import com.example.anan.chartcore_slim.AAOptionsModel.AAShadow;
import com.example.anan.chartcore_slim.AATools.AAColor;
import com.example.anan.chartcore_slim.AATools.AAGradientColor;
import com.example.anan.chartcore_slim.R;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class CustomStyleChartActivity extends AppCompatActivity {

    private AAChartModel aaChartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_style_chart);

        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        switch (chartType) {
            case "colorfulChart":
                aaChartModel = configureColorfulChart();
                break;
            case "gradientColorfulChart":
                aaChartModel = configureColorfulGradientColorChart();
                break;
            case "discontinuousDataChart":
                aaChartModel = configureDiscontinuousDataChart();
                break;
        }

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartModel(aaChartModel);
    }

    AAChartModel configureColorfulChart() {
        String[] colorsNameArr = {
                "red",
                "orange",
                "yellow",
                "green",
                "cyan",
                "blue",
                "purple",
                "gray",
                "darkGray",
                "lightGray",
                "magenta",
                "brown",
                "black"};

        String[] colorsArr = {
                AAColor.redColor(),
                AAColor.orangeColor(),
                AAColor.yellowColor(),
                AAColor.greenColor(),
                AAColor.cyanColor(),
                AAColor.blueColor(),
                AAColor.purpleColor(),
                AAColor.grayColor(),
                AAColor.darkGrayColor(),
                AAColor.lightGrayColor(),
                AAColor.magentaColor(),
                AAColor.brownColor(),
                AAColor.blackColor(),};

        return new AAChartModel()
                .chartType(AAChartModel.Type.Bar)
                .animationType(AAChartModel.AnimationType.Bounce)
                .title("Colorful Chart")
                .subtitle("use AAColor to get color string")
                .dataLabelEnabled(false)
                .categories(colorsNameArr)
                .colorsTheme(colorsArr)
                .stacking(AAChartModel.StackingType.Percent)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] {
                                        149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                .colorByPoint(true)
                });

    }

        AAChartModel configureColorfulGradientColorChart() {
           String[] gradientColorNamesArr = {
                   "oceanBlue",
                    "sanguine",
                    "lusciousLime",
                    "purpleLake",
                    "freshPapaya",
                    "ultramarine",
                    "pinkSugar",
                    "lemonDrizzle",
                    "victoriaPurple",
                    "springGreens",
                    "mysticMauve",
                    "reflexSilver",
                    "newLeaf",
                    "cottonCandy",
                    "pixieDust",
                    "fizzyPeach",
                    "sweetDream",
                    "firebrick",
                    "wroughtIron",
                    "deepSea",
                    "coastalBreeze",
                    "eveningDelight",
            };

           HashMap[] gradientColorArr =  {
                   AAGradientColor.oceanBlueColor(),
                   AAGradientColor.sanguineColor(),
                   AAGradientColor.lusciousLimeColor(),
                   AAGradientColor.purpleLakeColor(),
                   AAGradientColor.freshPapayaColor(),
                   AAGradientColor.ultramarineColor(),
                   AAGradientColor.pinkSugarColor(),
                   AAGradientColor.lemonDrizzleColor(),
                   AAGradientColor.victoriaPurpleColor(),
                   AAGradientColor.springGreensColor(),
                   AAGradientColor.mysticMauveColor(),
                   AAGradientColor.reflexSilverColor(),
                   AAGradientColor.newLeafColor(),
                   AAGradientColor.cottonCandyColor(),
                   AAGradientColor.pixieDustColor(),
                   AAGradientColor.fizzyPeachColor(),
                   AAGradientColor.sweetDreamColor(),
                   AAGradientColor.firebrickColor(),
                   AAGradientColor.wroughtIronColor(),
                   AAGradientColor.deepSeaColor(),
                   AAGradientColor.coastalBreezeColor(),
                   AAGradientColor.eveningDelightColor(),
           };

            return new AAChartModel()
                    .chartType(AAChartModel.Type.Bar)
                    .title("Colorful Column Chart")
                    .subtitle("single data array colorful column chart")
                    .categories(gradientColorNamesArr)
                    .colorsTheme(gradientColorArr)
                    .yAxisTitle("gradient color")
                    .stacking(AAChartModel.StackingType.Percent)
                    .series(new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(new Object[] {
                                            149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                    .colorByPoint(true)
                    });

        }

    AAChartModel configureDiscontinuousDataChart() {
        return new AAChartModel()
                .chartType(AAChartModel.Type.Column)
                .title("Discontinuous Data Chart")
                .yAxisTitle("")
                .dataLabelEnabled(true)
                .tooltipEnabled(true)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] { 6.9, 9.5, 14.5, 18.2, 21.5, null, null, null, null, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6})
                                .color(AAGradientColor.deepSeaColor())

                });

    }

    AAChartModel configureColorfulColumnChart() {
        return new AAChartModel()
                .chartType(AAChartModel.Type.Column)
                .title("Colorful Column Chart")
                .subtitle("single data array colorful column chart")
                .colorsTheme(new String[]{"#febc0f","#FF14d4","#0bf8f5","#F33c52","#1904dd",})
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("东京")
                                .data(new Object[]{149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                .colorByPoint(true)
                });
    }

    AAChartModel configureNightingaleRoseChart() {
        return  new  AAChartModel()
                .title("南丁格尔玫瑰图")
                .subtitle("极地图中的一种")
                .yAxisTitle("cm")
                .chartType(AAChartModel.Type.Column)
                .xAxisVisible(false)//是否显示最外一层圆环
                .yAxisVisible(true)//是否显示中间的多个圆环
                .legendEnabled(false)//隐藏图例(底部可点按的小圆点)
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .dataLabelEnabled(true)
                .polar(true)//极地化图形
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("东京")
                                .data(new Object[]{7.0, 6.9, 9.5, 9.6, 13.9, 14.5, 18.3, 18.2, 21.5, 25.2, 26.5, 23.3}),
                 }
               )
        ;
    }

    AAChartModel configureChartWithShadowStyle() {
        return new AAChartModel()
                .chartType(AAChartModel.Type.Areaspline)
                .title("")
                .subtitle("")
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .yAxisTitle("")
                .markerRadius(0)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0)
                .legendEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(8.0f)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .shadow(
                                new AAShadow()
                                        .offsetX(15.0f)
                                        .offsetY(15.0f)
                                        .opacity(0.2f)
                                        .width(8.0f)
                                        .color(AAColor.redColor()))
                });
    }

    AAChartModel configureColorfulGradientAreaChart() {
        Map linearGradientColorMap = new HashMap<String,Integer>();
        linearGradientColorMap.put("x1",0);
        linearGradientColorMap.put("y1",0);
        linearGradientColorMap.put("x2",1);
        linearGradientColorMap.put("y2",0);
        Object[][] stopsArr =  new Object[][]{
                {0.00 ,"#febc0f"},
                {0.50  ,"#FF14d4"},
                {1.00  ,"#0bf8f5"},
        };//颜色字符串设置支持十六进制类型和 rgba 类型
        Map gradientColorMap = new  HashMap<String,Object>();
        gradientColorMap.put("linearGradient",linearGradientColorMap);
        gradientColorMap.put("stops",stopsArr);

        return new AAChartModel()
                .chartType(AAChartModel.Type.Areaspline)
                .title("")
                .subtitle("")
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .yAxisTitle("")
                .markerRadius(0)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0)
                .legendEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(15.0f)
                                .color(gradientColorMap)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                        }
                );
    }


    AAChartModel configureColorfulGradientSplineChart() {
        Map linearGradientColorMap = new HashMap<String,Integer>();
        linearGradientColorMap.put("x1",0);
        linearGradientColorMap.put("y1",0);
        linearGradientColorMap.put("x2",1);
        linearGradientColorMap.put("y2",0);
        Object[][] stopsArr =  new Object[][]{
                {0.00 ,"#febc0f"},
                {0.25  ,"#FF14d4"},
                {0.50  ,"#0bf8f5"},
                {0.75 ,"#F33c52"},
                {1.00  ,"#1904dd"},
        };//颜色字符串设置支持十六进制类型和 rgba 类型
        Map gradientColorMap = new  HashMap<String,Object>();
        gradientColorMap.put("linearGradient",linearGradientColorMap);
        gradientColorMap.put("stops",stopsArr);

        return new AAChartModel()
                .chartType(AAChartModel.Type.Spline)
                .title("")
                .subtitle("")
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"})
                 .yAxisTitle("")
                .markerRadius(0)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0)
                .legendEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(15.0f)
                                .color(gradientColorMap)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                        }
                );
    }


    AAChartModel configureGradientColorAreasplineChart() {
        Map linearGradientColorMap = new HashMap<String,Integer>();
        linearGradientColorMap.put("x1",0);
        linearGradientColorMap.put("y1",0);
        linearGradientColorMap.put("x2",0);
        linearGradientColorMap.put("y2",1);
        Object[][] stopsArr =  new Object[][]{
                {0  ,"rgba(2255,20,147,1)"},//深粉色, alpha 透明度 1
                {1  ,"rgba(255,105,180,0.1)"},//热情的粉红, alpha 透明度 0.1
        };//颜色字符串设置支持十六进制类型和 rgba 类型
        Map gradientColorMap = new  HashMap<String,Object>();
        gradientColorMap.put("linearGradient",linearGradientColorMap);
        gradientColorMap.put("stops",stopsArr);

        return new AAChartModel()
                .chartType(AAChartModel.Type.Areaspline)
                .title("")
                .subtitle("")
                .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"})
                .yAxisTitle("")
                .markerRadius(8)//marker点半径为8个像素
                .markerSymbolStyle(AAChartModel.SymbolStyleType.InnerBlank)//marker点为空心效果
                .markerSymbol(AAChartModel.SymbolType.Circle)//marker点为圆形点○
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0)
                .legendEnabled(false)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo Hot")
                                .lineWidth(5.0f)
                                .color("rgba(220,20,60,1)")//猩红色, alpha 透明度 1
                                .fillColor(gradientColorMap)
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6}),
                 }
               );

    }

    }

