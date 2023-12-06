package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAColumnrange {
    public Number borderRadius; //The color of the border surrounding each column or bar
    public Number borderWidth; //The corner radius of the border surrounding each column or bar. default：0.
    public AADataLabels dataLabels; //The options for the data labels appearing on top of each column or bar
    public Number groupPadding; //Padding between each value groups, in x axis units. default：0.2.
    public Boolean grouping; //Whether to group non-stacked columns or to let them render independent of each other. default：false.
    public Number pointPadding; //Padding between each column or bar, in x axis units. default：0.1.
    public Number pointPlacement; //Padding between each column or bar, in x axis units. default：0.1.

    public AAColumnrange borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AAColumnrange borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AAColumnrange dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AAColumnrange groupPadding(Number prop) {
        groupPadding = prop;
        return this;
    }

    public AAColumnrange grouping(Boolean prop) {
        grouping = prop;
        return this;
    }

    public AAColumnrange pointPadding(Number prop) {
        pointPadding = prop;
        return this;
    }

    public AAColumnrange pointPlacement(Number prop) {
        pointPlacement = prop;
        return this;
    }
}
