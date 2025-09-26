package com.github.AAChartModel.AAChartCore.AAChartEnum;

public enum AAChartAxisTitleAlignValueType {
    High("high"),
    Low("low"),
    Middle("middle");

    private final String value;

    AAChartAxisTitleAlignValueType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}