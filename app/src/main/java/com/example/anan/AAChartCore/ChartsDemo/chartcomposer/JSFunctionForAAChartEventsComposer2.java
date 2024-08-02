package com.example.anan.AAChartCore.ChartsDemo.chartcomposer;

import com.github.AAChartModel.AAChartCore.AAChartCreator.AAChartEvents;
import com.github.AAChartModel.AAChartCore.AAChartCreator.AASeriesElement;
import com.github.AAChartModel.AAChartCore.AAChartEnum.AAChartType;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAChart;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AADataLabels;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAMarker;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAOptions;
import com.github.AAChartModel.AAChartCore.AAOptionsModel.AAXAxis;
import com.github.AAChartModel.AAChartCore.AATools.AAColor;

public class JSFunctionForAAChartEventsComposer2 {

//https://github.com/AAChartModel/AAChartKit/issues/1557
//https://github.com/AAChartModel/AAChartCore/issues/199
//https://developer.mozilla.org/zh-CN/docs/Web/API/Touch_events/Using_Touch_Events
//https://developer.mozilla.org/zh-CN/docs/Web/API/MouseEvent
/*
在 JavaScript 中，与触摸事件对应的鼠标事件分别是：

- `touchstart` 对应 `mousedown`
- `touchend` 对应 `mouseup`

因此，将你的代码中的触摸事件改为鼠标事件后，代码可以改写为：


 1.
```javascript
// 监听 mousedown 事件
container.addEventListener('mousedown', function() {
  hideDataLabels(chart);
});

// 监听 mouseup 事件
container.addEventListener('mouseup', function() {
  showDataLabels(chart);
});
```

或者也可以改成为:

 2.
 ```javascript
 // 监听 mouseenter 事件
 container.addEventListener('mouseenter', function() {
   hideDataLabels(chart);
 });

 // 监听 mouseleave 事件
 container.addEventListener('mouseleave', function() {
   showDataLabels(chart);
 });
 ```
*/
    public static AAOptions toggleDataLabelsOnTouch() {
        AAOptions options = new AAOptions()
                .chart(new AAChart()
                        .type(AAChartType.Areaspline)
                        .events(new AAChartEvents()
                                .load("function() {" +
                                        "const chart = this;" +
                                        "const container = document.getElementById('container');" +

                                        "container.addEventListener('touchstart', function() {" +
                                        "  hideDataLabels(chart);" +
                                        "});" +

                                        "container.addEventListener('touchend', function() {" +
                                        "  showDataLabels(chart);" +
                                        "});" +

                                        "function hideDataLabels(chart) {" +
                                        "  chart.series.forEach(function(series) {" +
                                        "    series.data.forEach(function(point) {" +
                                        "      point.update({ dataLabels: { enabled: false } });" +
                                        "    });" +
                                        "  });" +
                                        "}" +

                                        "function showDataLabels(chart) {" +
                                        "  chart.series.forEach(function(series) {" +
                                        "    series.data.forEach(function(point) {" +
                                        "      point.update({ dataLabels: { enabled: true } });" +
                                        "    });" +
                                        "  });" +
                                        "}" +
                                        "}")))
                .xAxis(new AAXAxis()
                        .categories(new String[]{"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"}))
                .series(new AASeriesElement[]{
                        new AASeriesElement()
                                .data(new Object[]{7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6})
                                .dataLabels(new AADataLabels()
                                        .enabled(true))
                                .marker(new AAMarker()
                                .lineColor(AAColor.Red)
                                .lineWidth(3)
                                .radius(10))
                });

        return options;
    }
}
