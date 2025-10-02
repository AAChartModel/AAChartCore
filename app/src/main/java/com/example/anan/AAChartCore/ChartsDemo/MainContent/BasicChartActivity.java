package com.example.anan.AAChartCore.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartModel;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartStackingType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartView;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AAMoveOverEventMessageModel;
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
    public String chartType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_chart);


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
        chartType = intent.getStringExtra("chartType");
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
        RadioGroup squareCornersRadio = findViewById(R.id.cornerStyleTypeRadioGroup);
        RadioGroup markerSymbolTypeRadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup);

        if (chartType.equals(AAChartType.Column) || chartType.equals(AAChartType.Bar)) {
            squareCornersRadio.setVisibility(View.VISIBLE);
            markerSymbolTypeRadioGroup.setVisibility(View.GONE);

            Switch markerHideSwitch = findViewById(R.id.markerHideSwitch);
            markerHideSwitch.setVisibility(View.GONE);
            TextView markerHideTextView = findViewById(R.id.markerHideTextView);
            markerHideTextView.setVisibility(View.GONE);
        } else {
            squareCornersRadio.setVisibility(View.GONE);
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


        Switch boolSwitch1 = findViewById(R.id.xReversedSwitch);
        boolSwitch1.setOnCheckedChangeListener(this);

        Switch boolSwitch2 = findViewById(R.id.yReversedSwitch);
        boolSwitch2.setOnCheckedChangeListener(this);

        Switch boolSwitch3 = findViewById(R.id.polarSwitch);
        boolSwitch3.setOnCheckedChangeListener(this);

        Switch boolSwitch4 = findViewById(R.id.xInvertedSwitch);
        boolSwitch4.setOnCheckedChangeListener(this);

        Switch boolSwitch5 = findViewById(R.id.dataShowSwitch);
        boolSwitch5.setOnCheckedChangeListener(this);

        Switch boolSwitch6 = findViewById(R.id.markerHideSwitch);
        boolSwitch6.setOnCheckedChangeListener(this);
    }

    /**
     * 重写的状态改变的事件的方法
     * @param group 单选组合框
     * @param checkedId 其中的每个RadioButton的Id
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int checkedRadioButtonId = group.getCheckedRadioButtonId();
        
        if (group.getId() == R.id.stackingTypeRadioGroup) {
            if (checkedRadioButtonId == R.id.noStackingRadio) {
                aaChartModel.stacking(AAChartStackingType.False);
            } else if (checkedRadioButtonId == R.id.normalStackingRadio) {
                aaChartModel.stacking(AAChartStackingType.Normal);
            } else if (checkedRadioButtonId == R.id.percentStackingRadio) {
                aaChartModel.stacking(AAChartStackingType.Percent);
            }
        } else if (group.getId() == R.id.cornerStyleTypeRadioGroup) {
            if (checkedRadioButtonId == R.id.squareCornersRadio) {
                aaChartModel.borderRadius(1f);
            } else if (checkedRadioButtonId == R.id.roundedCornersRadio) {
                aaChartModel.borderRadius(10f);
            } else if (checkedRadioButtonId == R.id.wedgeCornersRadio) {
                aaChartModel.borderRadius(100f);
            }
        } else {
            if (checkedRadioButtonId == R.id.circleSymbolRadio) {
                aaChartModel.markerSymbol(AAChartSymbolType.Circle);
            } else if (checkedRadioButtonId == R.id.squareSymbolRadio) {
                aaChartModel.markerSymbol(AAChartSymbolType.Square);
            } else if (checkedRadioButtonId == R.id.diamondSymbolRadio) {
                aaChartModel.markerSymbol(AAChartSymbolType.Diamond);
            } else if (checkedRadioButtonId == R.id.triangleSymbolRadio) {
                aaChartModel.markerSymbol(AAChartSymbolType.Triangle);
            } else if (checkedRadioButtonId == R.id.triangleDownSymbolRadio) {
                aaChartModel.markerSymbol(AAChartSymbolType.Triangle_down);
            }
        }

        aaChartView.aa_refreshChartWithChartModel(aaChartModel);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int buttonViewId = buttonView.getId();
        if (buttonViewId == R.id.xReversedSwitch) {
            aaChartModel.xAxisReversed(isChecked);
        } else if (buttonViewId == R.id.yReversedSwitch) {
            aaChartModel.yAxisReversed(isChecked);
        } else if (buttonViewId == R.id.xInvertedSwitch) {
            aaChartModel.inverted(isChecked);
        } else if (buttonViewId == R.id.polarSwitch) {
            aaChartModel.polar(isChecked);
        } else if (buttonViewId == R.id.dataShowSwitch) {
            aaChartModel.dataLabelsEnabled(isChecked);
        } else if (buttonViewId == R.id.markerHideSwitch) {
            aaChartModel.markerRadius(isChecked ? 0f : 6f);
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
