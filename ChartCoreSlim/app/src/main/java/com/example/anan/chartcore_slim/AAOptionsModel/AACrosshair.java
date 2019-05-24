package com.example.anan.chartcore_slim.AAOptionsModel;

public class AACrosshair {
    private Float width;
    private String color;
    private String dashStyle;

    public AACrosshair width(Float width) {
        this.width = width;
        return this;
    }

    public AACrosshair color(String color) {
        this.color = color;
        return this;
    }

    public AACrosshair dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }
}
