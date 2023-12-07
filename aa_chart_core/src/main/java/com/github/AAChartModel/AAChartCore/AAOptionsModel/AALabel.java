package com.github.AAChartModel.AAChartCore.AAOptionsModel;

import com.github.AAChartModel.AAChartCore.AATools.AAJSStringPurer;

public class AALabel {
    public String  align;//标签的对齐方式，可用的值有 "left"、"center" 及 "right"。默认值是根据坐标轴的位置（在图表中的位置）即标签的旋转角度进行智能判断的。 默认是：center.
    public Number  rotation;//标签的旋转角度 默认是：0.
    public String  text;//文字
    public String  textAlign;//文字对齐
    public Boolean useHTML;//HTML渲染
    public String  verticalAlign;//竖直对齐
    public AAStyle style;//轴标签的 CSS 样式
    public Number  x;//水平偏移
    public Number  y;// 竖直偏移
    public String  format;//格式化字符串
    public String  formatter;//格式化函数

    public AALabel align(String prop) {
        align = prop;
        return this;
    }

    public AALabel rotation(Number prop) {
        rotation = prop;
        return this;
    }

    public AALabel text(String prop) {
        text = prop;
        return this;
    }

    public AALabel textAlign(String prop) {
        textAlign = prop;
        return this;
    }

    public AALabel useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public AALabel verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public AALabel style(AAStyle prop) {
        style = prop;
        return this;
    }

    public AALabel x(Number prop) {
        x = prop;
        return this;
    }

    public AALabel y(Number prop) {
        y = prop;
        return this;
    }

    public AALabel format(String prop) {
        format = prop;
        return this;
    }

    public AALabel formatter(String prop) {
        formatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }
}