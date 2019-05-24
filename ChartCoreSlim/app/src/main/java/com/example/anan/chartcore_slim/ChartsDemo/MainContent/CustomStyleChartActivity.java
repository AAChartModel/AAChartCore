package com.example.anan.chartcore_slim.ChartsDemo.MainContent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.AAChartConfiger.AAChartView;
import com.example.anan.chartcore_slim.AAChartConfiger.AASeriesElement;
import com.example.anan.chartcore_slim.AATools.AAColor;
import com.example.anan.chartcore_slim.AATools.AAGradientColor;
import com.example.anan.chartcore_slim.R;

import java.util.HashMap;

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


    }

