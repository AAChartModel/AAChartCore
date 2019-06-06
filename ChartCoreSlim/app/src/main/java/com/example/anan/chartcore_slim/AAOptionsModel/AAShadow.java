package com.example.anan.chartcore_slim.AAOptionsModel;

public class AAShadow {
    private String color;
    private Float offsetX;
    private Float offsetY;
    private Float opacity;
    private Float width;

    public AAShadow color(String color) {
        this.color = color;
        return this;
    }

    public AAShadow offsetX(Float offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public AAShadow offsetY(Float offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public AAShadow opacity(Float opacity) {
        this.opacity = opacity;
        return this;
    }

    public AAShadow width(Float width) {
        this.width = width;
        return this;
    }

}
