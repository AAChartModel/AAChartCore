package com.example.anan.chartcore_slim.AAChartCoreLib.AATools;

import java.lang.reflect.Array;
import java.util.HashMap;

public class AAGradientColor {

    public static HashMap<String,Object> oceanBlueColor() {
        return configureGradientColor("#2E3192","#1BFFFF");
    }

    public static HashMap<String,Object> sanguineColor() {
        return configureGradientColor("#D4145A","#FBB03B");
    }

    public static HashMap<String,Object> lusciousLimeColor() {
        return configureGradientColor("#009245","#FCEE21");
    }

    public static HashMap<String,Object> purpleLakeColor() {
        return configureGradientColor("#662D8C","#ED1E79");
    }

    public static HashMap<String,Object> freshPapayaColor() {
        return configureGradientColor("#ED1C24","#FCEE21");
    }

    public static HashMap<String,Object> ultramarineColor() {
        return configureGradientColor("#00A8C5","#FFFF7E");
    }

    public static HashMap<String,Object> pinkSugarColor() {
        return configureGradientColor("#D74177","#FFE98A");
    }

    public static HashMap<String,Object> lemonDrizzleColor() {
        return configureGradientColor("#FB872B","#D9E021");
    }

    public static HashMap<String,Object> victoriaPurpleColor() {
        return configureGradientColor("#312A6C","#852D91");
    }

    public static HashMap<String,Object> springGreensColor() {
        return configureGradientColor("#009E00","#FFFF96");
    }

    public static HashMap<String,Object> mysticMauveColor() {
        return configureGradientColor("#B066FE","#63E2FF");
    }

    public static HashMap<String,Object> reflexSilverColor() {
        return configureGradientColor("#808080","#E6E6E6");
    }

    public static HashMap<String,Object> neonGlowColor() {
        return configureGradientColor("#00FFA1","#00FFFF");
    }

    public static HashMap<String,Object> berrySmoothieColor() {
        return configureGradientColor("#8E78FF","#FC7D7B");
    }

    public static HashMap<String,Object> newLeafColor() {
        return configureGradientColor("#00537E","#3AA17E");
    }

    public static HashMap<String,Object> cottonCandyColor() {
        return configureGradientColor("#FCA5F1","#B5FFFF");
    }

    public static HashMap<String,Object> pixieDustColor() {
        return configureGradientColor("#D585FF","#00FFEE");
    }

    public static HashMap<String,Object> fizzyPeachColor() {
        return configureGradientColor("#F24645","#EBC08D");
    }

    public static HashMap<String,Object> sweetDreamColor() {
        return configureGradientColor("#3A3897","#A3A1FF");
    }

    public static HashMap<String,Object> firebrickColor() {
        return configureGradientColor("#45145A","#FF5300");
    }

    public static HashMap<String,Object> wroughtIronColor() {
        return configureGradientColor("#333333","#5A5454");
    }

    public static HashMap<String,Object> deepSeaColor() {
        return configureGradientColor("#4F00BC","#29ABE2");
    }

    public static HashMap<String,Object> coastalBreezeColor() {
        return configureGradientColor("#00B7FF","#FFFFC7");
    }

    public static HashMap<String,Object> eveningDelightColor() {
        return configureGradientColor("#93278F","#00A99D");
    }

   private static  HashMap<String,Object> configureGradientColor(String startColor,
                                                                 String endColo) {
        HashMap linearGradientColorMap = new HashMap<String,Integer>();
        linearGradientColorMap.put("x1",0);
        linearGradientColorMap.put("y1",1);
        linearGradientColorMap.put("x2",0);
        linearGradientColorMap.put("y2",0);
        Object[][] stopsArr =  new Object[][]{
                {0  ,startColor},
                {1  ,endColo},
        };
        HashMap gradientColorMap = new  HashMap<String,Object>();
        gradientColorMap.put("linearGradient",linearGradientColorMap);
        gradientColorMap.put("stops",stopsArr);
        return gradientColorMap;
    }
}
