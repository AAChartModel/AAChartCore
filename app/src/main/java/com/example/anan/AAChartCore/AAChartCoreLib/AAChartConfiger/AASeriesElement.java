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

package com.example.anan.AAChartCore.AAChartCoreLib.AAChartConfiger;

import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAMarker;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAShadow;

import java.util.Dictionary;

/**
 * Created by anan on 2018/4/16.
 */

public class AASeriesElement {

    private String type;
    private String name;
    private Object[] data;
    private Float lineWidth;//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private Object color;
    private Object fillColor;
    private Float fillOpacity;//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private Float threshold;//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private String negativeColor;// The color for the parts of the graph or points that are below the threshold
    private String dashStyle;
    private Dictionary dataLabels;
    private AAMarker marker;
    private Object step;
    private Boolean colorByPoint;
    private Integer zIndex;
    private Object[] zones;
    private AAShadow shadow;


    public AASeriesElement type(String prop) {
        type = prop;
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

    public AASeriesElement lineWidth(Float prop) {
        lineWidth = prop;
        return this;
    }

    public AASeriesElement  color(Object prop) {
        color = prop;
        return this;
    }

    public AASeriesElement fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public AASeriesElement fillOpacity(Float prop) {
        fillOpacity = prop;
        return this;
    }

    public AASeriesElement threshold(Float prop) {
        threshold = prop;
        return this;
    }

    public AASeriesElement negativeColor(String prop) {
        negativeColor = prop;
        return this;
    }

    public AASeriesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public AASeriesElement dataLabels(Dictionary prop) {
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

    public AASeriesElement colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public AASeriesElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

    public AASeriesElement zones(Object[] prop) {
        zones = prop;
        return this;
    }

    public AASeriesElement shadow(AAShadow prop) {
        shadow = prop;
        return this;
    }


}





