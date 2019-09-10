package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolStyleType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AAMoveOverEventMessageModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger.AASeriesElement;
import com.example.anan.AAChartCore.R;
import com.google.gson.Gson;


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


        AAChartModel aaChartModel = new AAChartModel()
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

        if (position == 4 || position == 5) {
            aaChartModel.series(new AASeriesElement[]{
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

        } else {
            aaChartModel.series(new AASeriesElement[]{
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

        }

        if (chartType.equals(AAChartType.Area)
                || chartType.equals(AAChartType.Arearange)) {
            aaChartModel.markerSymbolStyle(AAChartSymbolStyleType.InnerBlank);
        } else if (chartType.equals(AAChartType.Line)
                ||chartType.equals(AAChartType.Spline)) {
            aaChartModel.markerSymbolStyle(AAChartSymbolStyleType.BorderBlank);
        }


        return aaChartModel;
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
