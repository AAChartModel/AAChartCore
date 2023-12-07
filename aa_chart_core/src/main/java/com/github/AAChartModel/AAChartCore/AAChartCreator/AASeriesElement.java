/**
//  AASeriesElement.java
//  AAChartCore
//
//  Created by anan on 2018/4/16..
//  Copyright © 2018年 An An. All rights reserved.

 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉


 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.github.AAChartModel.AAChartCore.AAChartCreator;

import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAMarker;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAShadow;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AATooltip;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAZonesElement;

/**
 * Created by anan on 2018/4/16.
 */

public class AASeriesElement {

    private String type;
    private Boolean allowPointSelect;
    private String name;
    private Object[] data;
    private Number lineWidth;//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private String borderColor; //The border color, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
    private Number borderWidth; //The border width, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
    private Number borderRadius; //The corner radius of the border surrounding each column or bar.
    private Object borderRadiusTopLeft;
    private Object borderRadiusTopRight;
    private Object borderRadiusBottomLeft;
    private Object borderRadiusBottomRight;
    private Object color;
    private Object fillColor;
    private Number fillOpacity;//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private Number threshold;//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private String negativeColor;// The color for the parts of the graph or points that are below the threshold
    private Object negativeFillColor;
    private Object size;
    private Object innerSize;
    private String dashStyle;
    private Integer yAxis;
    private AADataLabels dataLabels;
    private AAMarker marker;
    private Object step;
    private Object states;
    private Boolean colorByPoint;
    private Integer zIndex;
    private AAZonesElement[] zones;
    private String zoneAxis;
    private AAShadow shadow;
    private String stack;
    private AATooltip tooltip;
    private Boolean showInLegend;
    private Boolean enableMouseTracking;
    private Boolean reversed;
    private String id;
    private Boolean connectNulls;

    public AASeriesElement type(String prop) {
        type = prop;
        return this;
    }

    public AASeriesElement allowPointSelect(Boolean prop) {
        allowPointSelect = prop;
        return this;
    }

    public AASeriesElement name(String prop) {
        name = prop;
        return this;
    }

    public AASeriesElement data(Object[] prop) {
        data = prop;
        return this;
    }

    public AASeriesElement lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public AASeriesElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public AASeriesElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public AASeriesElement borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public AASeriesElement borderRadiusTopLeft(Object prop) {
        borderRadiusTopLeft = prop;
        return this;
    }

    public AASeriesElement borderRadiusTopRight(Object prop) {
        borderRadiusTopRight = prop;
        return this;
    }

    public AASeriesElement borderRadiusBottomLeft(Object prop) {
        borderRadiusBottomLeft = prop;
        return this;
    }

    public AASeriesElement borderRadiusBottomRight(Object prop) {
        borderRadiusBottomRight = prop;
        return this;
    }

    public AASeriesElement color(Object prop) {
        color = prop;
        return this;
    }

    public AASeriesElement fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public AASeriesElement fillOpacity(Number prop) {
        fillOpacity = prop;
        return this;
    }

    public AASeriesElement threshold(Number prop) {
        threshold = prop;
        return this;
    }

    public AASeriesElement negativeColor(String prop) {
        negativeColor = prop;
        return this;
    }

    public AASeriesElement negativeFillColor(Object prop) {
        negativeFillColor = prop;
        return this;
    }

    public AASeriesElement size(Object prop) {
        size = prop;
        return this;
    }

    public AASeriesElement innerSize(Object prop) {
        innerSize = prop;
        return this;
    }

    public AASeriesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public AASeriesElement yAxis(Integer prop) {
        yAxis = prop;
        return this;
    }

    public AASeriesElement dataLabels(AADataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public AASeriesElement marker(AAMarker prop) {
        marker = prop;
        return this;
    }

    public AASeriesElement step(Object prop) {
        step = prop;
        return this;
    }

    public AASeriesElement states(Object prop) {
        states = prop;
        return this;
    }

    public AASeriesElement colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public AASeriesElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

    public AASeriesElement zones(AAZonesElement[] prop) {
        zones = prop;
        return this;
    }

    public AASeriesElement zoneAxis(String prop) {
        zoneAxis = prop;
        return this;
    }

    public AASeriesElement shadow(AAShadow prop) {
        shadow = prop;
        return this;
    }

    public AASeriesElement stack(String prop) {
        stack = prop;
        return this;
    }

    public AASeriesElement tooltip(AATooltip prop) {
        tooltip = prop;
        return this;
    }

    public AASeriesElement showInLegend(Boolean prop) {
        showInLegend = prop;
        return this;
    }

    public AASeriesElement enableMouseTracking(Boolean prop) {
        enableMouseTracking = prop;
        return this;
    }

    public AASeriesElement reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public AASeriesElement id(String prop) {
        id = prop;
        return this;
    }

    public AASeriesElement connectNulls(Boolean prop) {
        connectNulls = prop;
        return this;
    }

}





