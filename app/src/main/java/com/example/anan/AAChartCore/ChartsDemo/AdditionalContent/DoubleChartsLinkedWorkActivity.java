package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAClickEventMessageModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAMoveOverEventMessageModel;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAOptionsConstructor;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataElement;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AATools.AAGradientColor;
import com.example.anan.AAChartCore.R;

import java.util.Map;

public class DoubleChartsLinkedWorkActivity extends AppCompatActivity implements AAChartView.AAChartViewCallBack {

    private Map selectedGradientColor;
    private AAChartView aaChartView1;
    private AAChartView aaChartView2;
    private Map[] gradientColorsArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_charts_linked_work);

        aaChartView1 = findViewById(R.id.AAChartView1);
        aaChartView1.callBack = this;

        aaChartView2 = findViewById(R.id.AAChartView2);

        aaChartView1.aa_drawChartWithChartOptions(configureChartOptions1());
        aaChartView2.aa_drawChartWithChartOptions(configureChartOptions2());
    }


    private AAOptions configureChartOptions1() {
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
                "neonGlowColor",
                "berrySmoothieColor",
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
                "neonGlowColor",
                "berrySmoothieColor"
        };

        Map[] gradientColorArr = {
                AAGradientColor.OceanBlue,
                AAGradientColor.Sanguine,
                AAGradientColor.LusciousLime,
                AAGradientColor.PurpleLake,
                AAGradientColor.FreshPapaya,
                AAGradientColor.Ultramarine,
                AAGradientColor.PinkSugar,
                AAGradientColor.LemonDrizzle,
                AAGradientColor.VictoriaPurple,
                AAGradientColor.SpringGreens,
                AAGradientColor.MysticMauve,
                AAGradientColor.ReflexSilver,
                AAGradientColor.NewLeaf,
                AAGradientColor.CottonCandy,
                AAGradientColor.PixieDust,
                AAGradientColor.FizzyPeach,
                AAGradientColor.SweetDream,
                AAGradientColor.Firebrick,
                AAGradientColor.WroughtIron,
                AAGradientColor.DeepSea,
                AAGradientColor.CoastalBreeze,
                AAGradientColor.EveningDelight,
                AAGradientColor.NeonGlow,
                AAGradientColor.BerrySmoothie
        };

        this.gradientColorsArr = gradientColorArr;

        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .categories(gradientColorNamesArr)
                .colorsTheme(gradientColorArr)
                .xAxisReversed(true)
                .yAxisReversed(true)
                .inverted(true)
                .legendEnabled(false)
                .clickEventEnabled(true) //设置点击事件
                .touchEventEnabled(true) //设置触摸(手指掠过)事件
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{211,183,157,133,111,91,73,57,43,31,21,13,
                                        211,183,157,133,111,91,73,57,43,31,21,13,})
                                .colorByPoint(true)
                });

        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.plotOptions.column.groupPadding = 0f;

        return aaOptions;
    }


    private  AAOptions configureChartOptions2() {
        AAChartModel aaChartModel = new AAChartModel()
                .chartType(AAChartType.Column)
                .legendEnabled(false)
                .yAxisGridLineWidth(0f)
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .name("Tokyo")
                                .data(new Object[]{
                                149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4,
                                149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})

                });
        AAOptions aaOptions = aaChartModel.aa_toAAOptions();
        aaOptions.plotOptions.column.groupPadding = 0f;
        return aaOptions;
    }

    private AADataElement[] configureSeriesDataArray() {
        int maxRange = 40;
        AADataElement[] numberArr1 = new AADataElement[maxRange];

        double y1;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01;
            AADataElement aaDataElement = new AADataElement()
                    .color(selectedGradientColor != null ? selectedGradientColor : AAGradientColor.OceanBlue)
                    .y((float) y1);

            numberArr1[i] = aaDataElement;
        }

        return numberArr1;
    }

    @Override
    public void chartViewDidFinishLoad(AAChartView aaChartView) {

    }

    @Override
    public void chartViewClickEventMessage(AAChartView aaChartView, AAClickEventMessageModel clickEventMessage) {
        if (clickEventMessage == null || clickEventMessage.index == null) {
            return;
        }

        //打印点击事件信息
        System.out.println("🖱🖱🖱获取点击事件 clickMessageModel = " + clickEventMessage);

        // 防止数组越界
        int index = clickEventMessage.index;
        if (gradientColorsArr != null && index >= 0 && index < gradientColorsArr.length) {
            this.selectedGradientColor = gradientColorsArr[index];
        }


        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                //已在主线程中，可以更新UI
                AASeriesElement[] aaSeriesElementsArr = new AASeriesElement[]{
                        new AASeriesElement()
                                .data(configureSeriesDataArray())
                };
                aaChartView2.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(aaSeriesElementsArr);
            }
        });
    }

    @Override
    public void chartViewMoveOverEventMessage(AAChartView aaChartView, AAMoveOverEventMessageModel moveOverEventMessage) {
        if (moveOverEventMessage == null || moveOverEventMessage.index == null) {
            return;
        }

        //打印触摸(手指掠过)事件信息
        System.out.println("👋👋👋获取触摸(手指掠过)事件 moveOverEventMessage  " + moveOverEventMessage);

        // 防止数组越界
        int index = moveOverEventMessage.index;
        if (gradientColorsArr != null && index >= 0 && index < gradientColorsArr.length) {
            this.selectedGradientColor = gradientColorsArr[index];
        }
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                //已在主线程中，可以更新UI
                AASeriesElement[] aaSeriesElementsArr = new AASeriesElement[]{
                        new AASeriesElement()
                                .data(configureSeriesDataArray())
                };
                aaChartView2.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(aaSeriesElementsArr);
            }
        });

    }



}
