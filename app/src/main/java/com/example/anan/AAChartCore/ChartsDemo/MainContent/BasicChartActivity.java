package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartModel;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAMoveOverEventMessageModel;
import com.example.anan.AAChartCore.ChartsDemo.chartcomposer.BasicChartComposer;
import com.example.anan.AAChartCore.R;
import com.google.gson.Gson;


public class BasicChartActivity extends AppCompatActivity
        implements
        RadioGroup.OnCheckedChangeListener,
        CompoundButton.OnCheckedChangeListener,
        AAChartView.AAChartViewCallBack
{
    public AAChartModel aaChartModel;
    public AAChartView aaChartView;

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

        aaChartModel = BasicChartComposer.configureAreaChart();
        configureTheStyleForDifferentTypeChart(chartType,position);
        configureViewsVisibility(chartType);

        return aaChartModel;
    }

    void configureTheStyleForDifferentTypeChart(String chartType,int position) {
        if ((chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Line))
                && (position == 4 || position == 5)) {
           aaChartModel = BasicChartComposer.configureStepAreaChartAndStepLineChart();
        } else if (chartType.equals(AAChartType.Column) || chartType.equals(AAChartType.Bar)) {

           aaChartModel = BasicChartComposer.configureColumnChartAndBarChart();
        } else if (chartType.equals(AAChartType.Area) || chartType.equals(AAChartType.Areaspline)) {
            aaChartModel = BasicChartComposer.configureAreaChartAndAreasplineChartStyle(chartType);
        } else if (chartType.equals(AAChartType.Line) || chartType.equals(AAChartType.Spline)) {
            aaChartModel = BasicChartComposer.configureLineChartAndSplineChartStyle(chartType);
        }
        aaChartModel.chartType = chartType;
    }

    void configureViewsVisibility(String chartType) {
        if (chartType.equals(AAChartType.Column) || chartType.equals(AAChartType.Bar)) {
            RadioGroup squareCornersRadio = findViewById(R.id.cornerStyleTypeRadioGroup);
            squareCornersRadio.setVisibility(View.VISIBLE);
            RadioGroup markerSymbolTypeRadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup);
            markerSymbolTypeRadioGroup.setVisibility(View.GONE);
        } else {
            RadioGroup squareCornersRadio = findViewById(R.id.cornerStyleTypeRadioGroup);
            squareCornersRadio.setVisibility(View.GONE);
            RadioGroup markerSymbolTypeRadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup);
            markerSymbolTypeRadioGroup.setVisibility(View.VISIBLE);
        }
    }

    void setUpRadioButtonsAndSwitches() {
        RadioGroup stackingTypeRadioGroup = findViewById(R.id.stackingTypeRadioGroup);
        stackingTypeRadioGroup.setOnCheckedChangeListener(this);

        RadioGroup cornerStyleTypeRadioGroup = findViewById(R.id.cornerStyleTypeRadioGroup);
        cornerStyleTypeRadioGroup.setOnCheckedChangeListener(this);

        RadioGroup markerSymbolTypeRadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup);
        markerSymbolTypeRadioGroup.setOnCheckedChangeListener(this);


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
        if (group.getId() == R.id.cornerStyleTypeRadioGroup) {
            //根据不同ID 弹出不同的吐司
            switch (group.getCheckedRadioButtonId()) {
                case R.id.squareCornersRadio:
                    aaChartModel.borderRadius(0f);
                    break;
                case R.id.roundedCornersRadio:
                    aaChartModel.borderRadius(10f);
                    break;
                case R.id.wedgeRadio:
                    aaChartModel.borderRadius(100f);
                    break;
            }
        } else if (group.getId() == R.id.stackingTypeRadioGroup) {
            //根据不同ID 弹出不同的吐司
            switch (group.getCheckedRadioButtonId()) {
                case R.id.noStackingRadio:
                    aaChartModel.stacking(AAChartStackingType.False);
                    break;
                case R.id.normalStackingRadio:
                    aaChartModel.stacking(AAChartStackingType.Normal);
                    break;
                case R.id.percentStackingRadio:
                    aaChartModel.stacking(AAChartStackingType.Percent);
                    break;
            }
        } else {
            switch (group.getCheckedRadioButtonId()) {
                case R.id.symbol1:
                    aaChartModel.markerSymbol(AAChartSymbolType.Circle);
                    break;
                case R.id.symbol2:
                    aaChartModel.markerSymbol(AAChartSymbolType.Diamond);
                    break;
                case R.id.symbol3:
                    aaChartModel.markerSymbol(AAChartSymbolType.Square);
                    break;
                case R.id.symbol4:
                    aaChartModel.markerSymbol(AAChartSymbolType.Triangle);
                    break;
                case R.id.symbol5:
                    aaChartModel.markerSymbol(AAChartSymbolType.Triangle_down);
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
    public void chartViewDidFinishLoad(AAChartView aaChartView) {
        System.out.println("🔥🔥🔥🔥🔥图表加载完成回调方法!!!!!!!! ");
    }

    @Override
    public void chartViewMoveOverEventMessage(AAChartView aaChartView, AAMoveOverEventMessageModel messageModel) {
        Gson gson = new Gson();
        System.out.println("👌👌👌👌👌move over event message " + gson.toJson(messageModel));

    }
}
