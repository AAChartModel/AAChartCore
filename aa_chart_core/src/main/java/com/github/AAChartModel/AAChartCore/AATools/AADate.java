package com.github.AAChartModel.AAChartCore.AATools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;



public class AADate {
    //   get UTC number from date
    public static long AADateUTC(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            date = sdf.parse(year + "-" + month + "-" + day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }
}