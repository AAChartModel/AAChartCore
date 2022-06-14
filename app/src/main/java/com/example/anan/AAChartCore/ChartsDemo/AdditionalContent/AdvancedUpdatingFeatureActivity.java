package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartStackingType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum.AAChartSymbolType;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAPlotOptions;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AASeries;
import com.example.anan.AAChartCore.ChartsDemo.MainContent.BasicChartActivity;
import com.example.anan.AAChartCore.R;

public class AdvancedUpdatingFeatureActivity extends BasicChartActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Object options = new Object();
        if (group.getId() == R.id.stackingTypeRadioGroup) {
            String stackingType = "";
            switch (group.getCheckedRadioButtonId()) {
                case R.id.noStackingRadio:
                    stackingType = AAChartStackingType.False;
                    break;
                case R.id.normalStackingRadio:
                    stackingType = AAChartStackingType.Normal;
                    break;
                case R.id.percentStackingRadio:
                    stackingType = AAChartStackingType.Percent;
                    break;
            }
            AAPlotOptions aaPlotOptions = new AAPlotOptions()
                    .series(new AASeries()
                            .stacking(stackingType));
            options = aaPlotOptions;
        } else {
            String markerSymbol = "";
            switch (group.getCheckedRadioButtonId()) {
                case R.id.symbol1:
                    markerSymbol = AAChartSymbolType.Circle;
                    break;
                case R.id.symbol2:
                    markerSymbol = AAChartSymbolType.Diamond;
                    break;
                case R.id.symbol3:
                    markerSymbol = AAChartSymbolType.Square;
                    break;
                case R.id.symbol4:
                    markerSymbol = AAChartSymbolType.Triangle;
                    break;
                case R.id.symbol5:
                    markerSymbol = AAChartSymbolType.Triangle_down;
                    break;
            }
            AAPlotOptions aaPlotOptions = new AAPlotOptions()
                    .series(new AASeries()
                            .marker(new AAMarker()
                                    .symbol(markerSymbol)));
            options = aaPlotOptions;
        }

        aaChartView.aa_updateChartWithOptions(options, true);
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
}