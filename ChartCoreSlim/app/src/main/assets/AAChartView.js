
        var AAGlobalChart;

        function loadTheHighChartView (sender,receivedWidth, receivedHeight) {

        var aaOptions = JSON.parse(sender);
             var animationEasingType = aaOptions.plotOptions.series.animation.easing;
            if (animationEasingType) { //懒调用(只有在 AAChartModel 实例对象设置了 animationType 属性值的时候才会调用设置动画类型的函数,否则不调用)
                aaOptions.plotOptions.series.animation.easing = configureTheChartAnimationEasingType(animationEasingType);
            }
            aaOptions.credits = {enabled:false};//去掉表格右下角版权信息
            if (aaOptions.tooltip) {
                    if (aaOptions.tooltip.formatter) {
                        aaOptions.tooltip.formatter = eval(aaOptions.tooltip.formatter);
                    }
                }
            AAGlobalChart = Highcharts.chart('container', aaOptions);
           //全局配置(可通过全局配置设置主题)https://api.hcharts.cn/highcharts#Highcharts.setOptions
        };


        //pragma mark -- setter method 适应内容https://code.hcharts.cn/highcharts/4YM0a8
        function setTheChartViewContentWidth (receivedWidth) {
            var container = document.getElementById('container');//获得元素
            container.style.width = receivedWidth;//设置宽度
            AAGlobalChart.reflow();
        }

        function setTheChartViewContentHeight (receivedHeight) {
            var container = document.getElementById('container');//获得元素
            container.style.height = receivedHeight;//设置高度
            AAGlobalChart.reflow();
        }

        function onlyRefreshTheChartDataWithSeries (receivedSeries) {
            var receivedSeriesElementArr = JSON.parse(receivedSeries);

            for (var i = 0; i < receivedSeriesElementArr.length; i++) {
                var receivedSeriesData = receivedSeriesElementArr[i].data;
                // 获取series
                var chartSeries =  AAGlobalChart.series[i];
                // 执行只刷新数据的函数
                chartSeries.setData(receivedSeriesData);
            }
        }

        function chartSeriesContentHideOrShow (hidden) {
            for (var i = 0; i < AAGlobalChart.series.length; i++) {
                var series = AAGlobalChart.series[i];
                if (hidden == true) {
                    series.hide();
                } else {
                    series.show();
                }
            }
        }

        function showTheSeriesElementContentWithIndex (elementIndex) {
            var series = AAGlobalChart.series[elementIndex];
            series.show();
        }