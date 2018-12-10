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

        if (chartType.equals("colorfulChart")) {
            configureColorfulChart();
        } else  {
            configureColorfulGradientColorChart();
        }

        AAChartView aaChartView = (AAChartView) findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartModel(aaChartModel);
    }

    void configureColorfulChart() {
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

        aaChartModel = new AAChartModel()
                .chartType(AAChartModel.AAChartType.Bar)
                .animationType(AAChartModel.AAChartAnimationType.Bounce)
                .title("Colorful Chart")
                .subtitle("use AAColor to get color string")
                .dataLabelEnabled(false)
                .categories(colorsNameArr)
                .colorsTheme(colorsArr)
                .stacking(AAChartModel.AAChartStackingType.Percent)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[] {
                                        149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                .colorByPoint(true)
                });

    }

        void configureColorfulGradientColorChart() {

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

            aaChartModel = new AAChartModel()
                    .chartType(AAChartModel.AAChartType.Column)
                    .title("Colorful Column Chart")
                    .subtitle("single data array colorful column chart")
                    .categories(gradientColorNamesArr)
                    .colorsTheme(gradientColorArr)
                    .yAxisTitle("gradient color")
                    .stacking(AAChartModel.AAChartStackingType.Percent)
                    .series(new AASeriesElement[]{
                            new AASeriesElement()
                                    .name("Tokyo")
                                    .data(new Object[] {
                                            149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                                    .colorByPoint(true)
                    });

        }


    }

