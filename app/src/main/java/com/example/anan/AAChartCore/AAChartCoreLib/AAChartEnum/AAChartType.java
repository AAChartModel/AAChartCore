package com.example.anan.AAChartCore.AAChartCoreLib.AAChartEnum;

public interface AAChartType {
    String Column          = "column"; //Column series display one column per value along an X axis.
    String Bar             = "bar"; //A bar series is a special type of column series where the columns are horizontal.
    String Area            = "area"; //The area series type.
    String Areaspline      = "areaspline"; //The area spline series is an area series where the graph between the points is smoothed into a spline.
    String Line            = "line"; //A line series displays information as a series of data points connected by straight line segments.
    String Spline          = "spline"; //A spline series is a special type of line series, where the segments between the data points are smoothed.
    String Scatter         = "scatter"; //A scatter plot uses cartesian coordinates to display values for two variables for a set of data.
    String Pie             = "pie"; //A pie chart is a circular graphic which is divided into slices to illustrate numerical proportion.
    String Bubble          = "bubble"; //A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
    String Pyramid         = "pyramid"; //A pyramid series is a special type of funnel, without neck and reversed by default.
    String Funnel          = "funnel"; //Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the modules/funnel.js file is loaded.
    String Columnrange     = "columnrange"; //The column range is a cartesian series type with higher and lower Y values along an X axis. To display horizontal bars, set chart.inverted to true.
    String Arearange       = "arearange"; //The area range series is a carteseian series with higher and lower values for each point along an X axis, where the area between the values is shaded.
    String Areasplinerange = "areasplinerange"; //The area spline range is a cartesian series type with higher and lower Y values along an X axis. The area inside the range is colored, and the graph outlining the area is a smoothed spline.
    String Boxplot         = "boxplot"; //A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
    String Waterfall       = "waterfall"; //A waterfall chart displays sequentially introduced positive or negative values in cumulative columns.
    String Polygon         = "polygon"; //A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the color option, and stroke is applied through lineWidth and lineColor options.
    String Gauge           = "gauge"; //Gauges are circular plots displaying one or more values with a dial pointing to values along the perimeter.
    String Errorbar        = "errorbar"; //Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
}
