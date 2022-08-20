package com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator;

public class AAChartEvents {
    public String load;
    public String selection;

    public AAChartEvents load(String prop) {
        load = prop;
        return this;
    }

    public AAChartEvents selection(String prop) {
        selection = prop;
        return this;
    }
}
