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
        switch (group.getId()) {
            case R.id.stackingTypeRadioGroup: {
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
                break;
            }
            case R.id.cornerStyleTypeRadioGroup: {
                Float borderRadius = null;
                switch (group.getCheckedRadioButtonId()) {
                    case R.id.squareCornersRadio:
                        borderRadius = 1f;
                        break;
                    case R.id.roundedCornersRadio:
                        borderRadius = 10f;
                        break;
                    case R.id.wedgeCornersRadio:
                        borderRadius = 100f;
                        break;
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
                break;
            }
            default: {
                String markerSymbol = "";
                switch (group.getCheckedRadioButtonId()) {
                    case R.id.circleSymbolRadio:
                        markerSymbol = AAChartSymbolType.Circle;
                        break;
                    case R.id.diamondSymbolRadio:
                        markerSymbol = AAChartSymbolType.Diamond;
                        break;
                    case R.id.squareSymbolRadio:
                        markerSymbol = AAChartSymbolType.Square;
                        break;
                    case R.id.triangleSymbolRadio:
                        markerSymbol = AAChartSymbolType.Triangle;
                        break;
                    case R.id.triangleDownSymbolRadio:
                        markerSymbol = AAChartSymbolType.Triangle_down;
                        break;
                }
                AAPlotOptions aaPlotOptions = new AAPlotOptions()
                        .series(new AASeries()
                                .marker(new AAMarker()
                                        .symbol(markerSymbol)));
                options = aaPlotOptions;
                break;
            }
        }

        aaChartView.aa_updateChartWithOptions(options, true);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Object options = new Object();
        boolean isOn = isChecked;
        switch (buttonView.getId()) {
            case R.id.xReversedSwitch: {
                AAXAxis aaXAxis = new AAXAxis()
                        .reversed(isOn);
                options = aaXAxis;
                break;
            }
            case R.id.yReversedSwitch: {
                AAYAxis aaYAxis = new AAYAxis()
                        .reversed(isOn);
                options = aaYAxis;
                break;
            }
            case R.id.xInvertedSwitch : {
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
                break;
            }
            case R.id.polarSwitch: {
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
                break;
            }
            case R.id.dataShowSwitch: {
                AAPlotOptions aaPlotOptions = new AAPlotOptions()
                        .series(new AASeries()
                                .dataLabels(new AADataLabels()
                                        .enabled(isOn)));
                options = aaPlotOptions;
                break;
            }
            case R.id.markerHideSwitch: {
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
                break;
            }
        }

        aaChartView.aa_updateChartWithOptions(options, true);
    }
}