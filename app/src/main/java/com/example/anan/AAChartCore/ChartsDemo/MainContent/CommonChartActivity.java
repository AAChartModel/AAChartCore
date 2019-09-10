package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartAnimationType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAMoveOverEventMessageModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAAnimation;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAGradientColor;
import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AALinearGradientDirection;
import com.example.anan.AAChartCore.R;
import com.google.gson.Gson;

import java.util.Map;


public class CommonChartActivity extends AppCompatActivity
        implements
        RadioGroup.OnCheckedChangeListener,
        CompoundButton.OnCheckedChangeListener,
        AAChartView.AAChartViewCallBack
{



    private AAChartModel aaChartModel;
    private AAChartView aaChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_chart);


        setUpRadioButtonsAndSwitches();
        setUpAAChartView();
    }

    void setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView);
        aaChartView.callBack = this;
        aaChartModel = configureAAChartModel();
        aaChartView.aa_drawChartWithChartModel(aaChartModel);

    }

    AAChartModel configureAAChartModel() {
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");
        int position = intent.getIntExtra("position",0);


        aaChartModel = new AAChartModel()
                .chartType(chartType)
                .title("title")
                .subtitle("subtitle")
                .backgroundColor("#4b2b7f")
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0f)
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

        configureTheStyleForDifferentTypeChart(chartType,position);

        return aaChartModel;
    }

    void configureTheStyleForDifferentTypeChart(String chartType,int position) {
        if ((chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Line))
                && (position == 4 || position == 5)) {
            aaChartModel
                    .series(new AASeriesElement[]{
                    new AASeriesElement()
                            .name("Tokyo")
                            .step(true)
                            .data(new Object[]{149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4})
                    ,
                    new AASeriesElement()
                            .name("NewYork")
                            .step(true)
                            .data(new Object[]{83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3})
                    ,
                    new AASeriesElement()
                            .name("London")
                            .step(true)
                            .data(new Object[]{48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2})
                    ,
            });
        } else if (chartType.equals(AAChartType.Column) || chartType.equals(AAChartType.Bar)) {
            aaChartModel
                    .categories(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"})
                    .legendEnabled(true)
                    .colorsTheme(new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"})
                    .animationType(AAChartAnimationType.Bounce)
                    .animationDuration(1200);
        } else if (chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Areaspline)) {
            aaChartModel
                    .animationType(AAChartAnimationType.EaseOutQuart)
                    .legendEnabled(true)
                    .markerRadius(5f)
                    .markerSymbol(AAChartSymbolType.Circle)
                    .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank);

            if (chartType.equals(AAChartType.Areaspline)) {
                Map gradientColorDic = AAGradientColor.linearGradient(
                        AALinearGradientDirection.ToBottomRight,
                        "rgba(138,43,226,1)",
                        "rgba(30,144,255,1)" //颜色字符串设置支持十六进制类型和 rgba 类型
                );

                aaChartModel
                        .animationType(AAChartAnimationType.EaseFrom)//设置图表渲染动画类型为 EaseFrom
                        .series(new AASeriesElement[] {
                                new AASeriesElement()
                                        .name("Tokyo Hot")
                                        .data(new Object[]{0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34,
                                                0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36})
                                        .color(gradientColorDic)
                                ,
                                new AASeriesElement()
                                        .name("Berlin Hot")
                                        .data(new Object[]{0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56,
                                        0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67})
                                ,
                                new AASeriesElement()
                                        .name("New York Hot")
                                        .data(new Object[]{0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74,
                                        0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64})
                                ,
                                new AASeriesElement()
                                        .name("London Hot")
                                        .data(new Object[]{0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60,
                                        0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53})
                        });

               }
        } else if (chartType.equals(AAChartType.Line) || chartType.equals(AAChartType.Spline)) {
            aaChartModel
                    .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//设置折线连接点样式为:边缘白色
                    .markerRadius(6f);
            if (chartType.equals(AAChartType.Spline)) {
                aaChartModel
                        .animationType(AAChartAnimationType.SwingFromTo)
                        .series(new AASeriesElement[]{
                                new AASeriesElement()
                                        .name("Tokyo")
                                        .lineWidth(7f)
                                        .data(new Object[]{50, 320, 230, 370, 230, 400,})
                                ,
                                new AASeriesElement()
                                        .name("Berlin")
                                        .lineWidth(7f)
                                        .data(new Object[]{80, 390, 210, 340, 240, 350,})
                                ,
                                new AASeriesElement()
                                        .name("New York")
                                        .lineWidth(7f)
                                        .data(new Object[]{100, 370, 180, 280, 260, 300,})
                                ,
                                new AASeriesElement()
                                        .name("London")
                                        .lineWidth(7f)
                                        .data(new Object[]{130, 350, 160, 310, 250, 268,})
                        });
            }
        }

    }


    void setUpRadioButtonsAndSwitches() {

        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(this);

        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(this);


        Switch boolSwitch1 = findViewById(R.id.switch1);
        boolSwitch1.setOnCheckedChangeListener(this);

        Switch boolSwitch2 = findViewById(R.id.switch2);
        boolSwitch2.setOnCheckedChangeListener(this);

        Switch boolSwitch3 = findViewById(R.id.switch3);
        boolSwitch3.setOnCheckedChangeListener(this);

        Switch boolSwitch4 = findViewById(R.id.switch4);
        boolSwitch4.setOnCheckedChangeListener(this);

        Switch boolSwitch5 = findViewById(R.id.switch5);
        boolSwitch5.setOnCheckedChangeListener(this);
    }

    /**
     * 重写的状态改变的事件的方法
     * @param group 单选组合框
     * @param checkedId 其中的每个RadioButton的Id
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group.getId() == R.id.radioGroup1) {
            //根据不同ID 弹出不同的吐司
            switch (group.getCheckedRadioButtonId()) {
                case R.id.stacking1: aaChartModel.stacking(AAChartStackingType.False);
                    break;
                case R.id.stacking2: aaChartModel.stacking(AAChartStackingType.Normal);
                    break;
                case R.id.stacking3: aaChartModel.stacking(AAChartStackingType.Percent);
                    break;
            }
        } else {
            switch (group.getCheckedRadioButtonId()) {
                case R.id.symbol1: aaChartModel.markerSymbol(AAChartSymbolType.Circle);
                    break;
                case R.id.symbol2: aaChartModel.markerSymbol(AAChartSymbolType.Diamond);
                    break;
                case R.id.symbol3: aaChartModel.markerSymbol(AAChartSymbolType.Square);
                    break;
                case R.id.symbol4: aaChartModel.markerSymbol(AAChartSymbolType.Triangle);
                    break;
                case R.id.symbol5: aaChartModel.markerSymbol(AAChartSymbolType.Triangle_down);
                    break;
            }
        }

        aaChartView.aa_refreshChartWithChartModel(aaChartModel);
        }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.switch1: aaChartModel.xAxisReversed(isChecked);
                break;
            case R.id.switch2: aaChartModel.yAxisReversed(isChecked);
                break;
            case R.id.switch3: aaChartModel.inverted(isChecked);
                break;
            case R.id.switch4: aaChartModel.polar(isChecked);
                break;
            case R.id.switch5: aaChartModel.dataLabelsEnabled(isChecked);
                break;
        }

        aaChartView.aa_refreshChartWithChartModel(aaChartModel);

    }

    @Override
    public void chartViewDidFinishedLoad(AAChartView aaChartView) {
        System.out.println("🔥图表加载完成回调方法!!!!!!!! ");
    }

    @Override
    public void chartViewMoveOverEventMessage(AAChartView aaChartView, AAMoveOverEventMessageModel messageModel) {
        Gson gson = new Gson();
        System.out.println("🚀move over event message " + gson.toJson(messageModel));

    }
}
