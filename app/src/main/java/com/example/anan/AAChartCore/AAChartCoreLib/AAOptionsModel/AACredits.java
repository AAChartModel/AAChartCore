package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

class AACredits {
    public Boolean enabled;
    public String href;
    public AAPosition position;
    public AAStyle style;
    public String text;

    public AACredits enabled(boolean prop) {
        enabled = prop;
        return this;
    }

    public AACredits href(String prop) {
        href = prop;
        return this;
    }

    public AACredits position(AAPosition prop) {
        position = prop;
        return this;
    }

    public AACredits style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AACredits text(String prop) {
        text = prop;
        return this;
    }
}
