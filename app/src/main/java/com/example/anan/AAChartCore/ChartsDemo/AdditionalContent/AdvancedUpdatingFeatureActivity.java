package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartStackingType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartSymbolType;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AABar;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAColumn;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAMarker;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAPlotOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AASeries;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAXAxis;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAYAxis;
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
        int groupId = group.getId();
        int checkedRadioButtonId = group.getCheckedRadioButtonId();
        
        if (groupId == R.id.stackingTypeRadioGroup) {
            String stackingType = "";
            if (checkedRadioButtonId == R.id.noStackingRadio) {
                stackingType = AAChartStackingType.False;
            } else if (checkedRadioButtonId == R.id.normalStackingRadio) {
                stackingType = AAChartStackingType.Normal;
            } else if (checkedRadioButtonId == R.id.percentStackingRadio) {
                stackingType = AAChartStackingType.Percent;
            }
            AAPlotOptions aaPlotOptions = new AAPlotOptions()
                    .series(new AASeries()
                            .stacking(stackingType));
            options = aaPlotOptions;
        } else if (groupId == R.id.cornerStyleTypeRadioGroup) {
            Float borderRadius = null;
            if (checkedRadioButtonId == R.id.squareCornersRadio) {
                borderRadius = 1f;
            } else if (checkedRadioButtonId == R.id.roundedCornersRadio) {
                borderRadius = 10f;
            } else if (checkedRadioButtonId == R.id.wedgeCornersRadio) {
                borderRadius = 100f;
            }

            AAPlotOptions aaPlotOptions;
            if (chartType.equals(AAChartType.Column)) {
                aaPlotOptions = new AAPlotOptions()
                        .column(new AAColumn()
                                .borderRadius(borderRadius));
            } else {
                aaPlotOptions = new AAPlotOptions()
                        .bar(new AABar()
                                .borderRadius(borderRadius));
            }
            options = aaPlotOptions;
        } else {
            String markerSymbol = "";
            if (checkedRadioButtonId == R.id.circleSymbolRadio) {
                markerSymbol = AAChartSymbolType.Circle;
            } else if (checkedRadioButtonId == R.id.diamondSymbolRadio) {
                markerSymbol = AAChartSymbolType.Diamond;
            } else if (checkedRadioButtonId == R.id.squareSymbolRadio) {
                markerSymbol = AAChartSymbolType.Square;
            } else if (checkedRadioButtonId == R.id.triangleSymbolRadio) {
                markerSymbol = AAChartSymbolType.Triangle;
            } else if (checkedRadioButtonId == R.id.triangleDownSymbolRadio) {
                markerSymbol = AAChartSymbolType.Triangle_down;
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
        Object options = new Object();
        boolean isOn = isChecked;
        int buttonViewId = buttonView.getId();
        
        if (buttonViewId == R.id.xReversedSwitch) {
            AAXAxis aaXAxis = new AAXAxis()
                    .reversed(isOn);
            options = aaXAxis;
        } else if (buttonViewId == R.id.yReversedSwitch) {
            AAYAxis aaYAxis = new AAYAxis()
                    .reversed(isOn);
            options = aaYAxis;
        } else if (buttonViewId == R.id.xInvertedSwitch) {
            if (this.aaChartModel.chartType.equals(AAChartType.Bar)) {
                Toast.makeText(this,
                        "⚠️⚠️⚠️inverted is useless for Bar Chart",
                        Toast.LENGTH_SHORT)
                        .show();
                Log.d("", "⚠️⚠️⚠️inverted is useless for Bar Chart");
            }
            AAChart aaChart = new AAChart()
                    .inverted(isOn)
                    .polar(this.aaChartModel.polar);
            options = aaChart;
        } else if (buttonViewId == R.id.polarSwitch) {
            this.aaChartModel.polar = isOn;
            AAChart aaChart = new AAChart()
                    .polar(isOn)
                    .inverted(this.aaChartModel.inverted);
            options = aaChart;

            if (this.aaChartModel.chartType.equals(AAChartType.Column)) {
                if (this.aaChartModel.polar) {
                    options = new AAOptions()
                            .chart(aaChart)
                            .plotOptions(new AAPlotOptions()
                                    .column(new AAColumn()
                                            .pointPadding(0f)
                                            .groupPadding(0.005f)));
                } else {
                    options = new AAOptions()
                            .chart(aaChart)
                            .plotOptions(new AAPlotOptions()
                                    .column(new AAColumn()
                                            .pointPadding(0.1f)
                                            .groupPadding(0.2f)));
                }
            } else if (this.aaChartModel.chartType.equals(AAChartType.Bar)) {
                if (this.aaChartModel.polar) {
                    options = new AAOptions()
                            .chart(aaChart)
                            .plotOptions(new AAPlotOptions()
                                    .bar(new AABar()
                                            .pointPadding(0f)
                                            .groupPadding(0.005f)));
                } else {
                    options = new AAOptions()
                            .chart(aaChart)
                            .plotOptions(new AAPlotOptions()
                                    .bar(new AABar()
                                            .pointPadding(0.1f)
                                            .groupPadding(0.2f)));
                }
            }
        } else if (buttonViewId == R.id.dataShowSwitch) {
            AAPlotOptions aaPlotOptions = new AAPlotOptions()
                    .series(new AASeries()
                            .dataLabels(new AADataLabels()
                                    .enabled(isOn)));
            options = aaPlotOptions;
        } else if (buttonViewId == R.id.markerHideSwitch) {
            AAMarker aaMarker = isOn ?
                    new AAMarker()
                            .enabled(false)
                    :
                    new AAMarker()
                            .enabled(true)
                            .radius(6f);

            AAPlotOptions aaPlotOptions = new AAPlotOptions()
                    .series(new AASeries()
                            .marker(aaMarker));
            options = aaPlotOptions;
        }

        aaChartView.aa_updateChartWithOptions(options, true);
    }
}