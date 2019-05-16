package com.example.anan.chartcore_slim.ChartsDemo.MainContent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.example.anan.chartcore_slim.AAChartConfiger.AAChartModel;
import com.example.anan.chartcore_slim.AAChartConfiger.AAChartView;
import com.example.anan.chartcore_slim.AAChartConfiger.AASeriesElement;
import com.example.anan.chartcore_slim.R;


public class CommonChartActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private AAChartModel aaChartModel;
    private AAChartView aaChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_chart);


        setUpRadioButtonsAndSwithes();
        setUpAAChartView();
    }

    void setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView);
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
                .subtitle("this is the subtitle of chart")
                .backgroundColor("#ffffff")
                .dataLabelEnabled(true)
                .yAxisGridLineWidth(0)
                .legendVerticalAlign(AAChartModel.LegendVerticalAlignType.Bottom)

        ;

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

        if (chartType.equals(AAChartModel.Type.Area)
                || chartType.equals(AAChartModel.Type.Arearange)) {
            aaChartModel.symbolStyle(AAChartModel.SymbolStyleType.InnerBlank);
        } else if (chartType.equals(AAChartModel.Type.Line)
                ||chartType.equals(AAChartModel.Type.Spline)) {
            aaChartModel.symbolStyle(AAChartModel.SymbolStyleType.BorderBlank);
        }
        return aaChartModel;
    }


    void setUpRadioButtonsAndSwithes() {

        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(this);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(this);

        Switch boolSwitch1 = (Switch)findViewById(R.id.switch1);
        boolSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              aaChartModel.xAxisReversed(isChecked);
              aaChartView.aa_refreshChartWithChartModel(aaChartModel);
            }
        });
        Switch boolSwitch2 = (Switch)findViewById(R.id.switch2);
        boolSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                aaChartModel.yAxisReversed(isChecked);
                aaChartView.aa_refreshChartWithChartModel(aaChartModel);
            }
        });

        Switch boolSwitch3 = (Switch)findViewById(R.id.switch3);
        boolSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                aaChartModel.inverted(isChecked);
                aaChartView.aa_refreshChartWithChartModel(aaChartModel);
            }
        });
        Switch boolSwitch4 = (Switch)findViewById(R.id.switch4);
        boolSwitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                aaChartModel.polar(isChecked);
                aaChartView.aa_refreshChartWithChartModel(aaChartModel);
            }
        });
        Switch boolSwitch5 = (Switch)findViewById(R.id.switch5);
        boolSwitch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                aaChartModel.dataLabelEnabled(isChecked);
                aaChartView.aa_refreshChartWithChartModel(aaChartModel);
            }
        });


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
                case R.id.stackingRadioButton1:
                    aaChartModel.stacking(AAChartModel.StackingType.False);
                    break;
                case R.id.stackingRadioButton2:
                    aaChartModel.stacking(AAChartModel.StackingType.Normal);
                    break;
                case R.id.stackingRadioButton3:
                    aaChartModel.stacking(AAChartModel.StackingType.Percent);
                    break;
            }
        } else {
            switch (group.getCheckedRadioButtonId()) {
                case R.id.symbolRadioButton1:
                    aaChartModel.symbol(AAChartModel.SymbolType.Circle);
                    break;
                case R.id.symbolRadioButton2:
                    aaChartModel.symbol(AAChartModel.SymbolType.Diamond);
                    break;
                case R.id.symbolRadioButton3:
                    aaChartModel.symbol(AAChartModel.SymbolType.Square);
                    break;
                case R.id.symbolRadioButton4:
                    aaChartModel.symbol(AAChartModel.SymbolType.Triangle);
                    break;
                case R.id.symbolRadioButton5:
                    aaChartModel.symbol(AAChartModel.SymbolType.Triangle_down);
                    break;
            }
        }

        aaChartView.aa_refreshChartWithChartModel(aaChartModel);
        }


}
