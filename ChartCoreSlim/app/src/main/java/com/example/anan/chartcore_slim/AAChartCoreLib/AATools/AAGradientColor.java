package com.example.anan.chartcore_slim.AAChartCoreLib.AATools;

import java.util.HashMap;
import java.util.Map;

public class AAGradientColor {

    public static HashMap<String,Object> oceanBlueColor() {
        return gradientColorMap("#2E3192","#1BFFFF");
    }

    public static HashMap<String,Object> sanguineColor() {
        return gradientColorMap("#D4145A","#FBB03B");
    }

    public static HashMap<String,Object> lusciousLimeColor() {
        return gradientColorMap("#009245","#FCEE21");
    }

    public static HashMap<String,Object> purpleLakeColor() {
        return gradientColorMap("#662D8C","#ED1E79");
    }

    public static HashMap<String,Object> freshPapayaColor() {
        return gradientColorMap("#ED1C24","#FCEE21");
    }

    public static HashMap<String,Object> ultramarineColor() {
        return gradientColorMap("#00A8C5","#FFFF7E");
    }

    public static HashMap<String,Object> pinkSugarColor() {
        return gradientColorMap("#D74177","#FFE98A");
    }

    public static HashMap<String,Object> lemonDrizzleColor() {
        return gradientColorMap("#FB872B","#D9E021");
    }

    public static HashMap<String,Object> victoriaPurpleColor() {
        return gradientColorMap("#312A6C","#852D91");
    }

    public static HashMap<String,Object> springGreensColor() {
        return gradientColorMap("#009E00","#FFFF96");
    }

    public static HashMap<String,Object> mysticMauveColor() {
        return gradientColorMap("#B066FE","#63E2FF");
    }

    public static HashMap<String,Object> reflexSilverColor() {
        return gradientColorMap("#808080","#E6E6E6");
    }

    public static HashMap<String,Object> neonGlowColor() {
        return gradientColorMap("#00FFA1","#00FFFF");
    }

    public static HashMap<String,Object> berrySmoothieColor() {
        return gradientColorMap("#8E78FF","#FC7D7B");
    }

    public static HashMap<String,Object> newLeafColor() {
        return gradientColorMap("#00537E","#3AA17E");
    }

    public static HashMap<String,Object> cottonCandyColor() {
        return gradientColorMap("#FCA5F1","#B5FFFF");
    }

    public static HashMap<String,Object> pixieDustColor() {
        return gradientColorMap("#D585FF","#00FFEE");
    }

    public static HashMap<String,Object> fizzyPeachColor() {
        return gradientColorMap("#F24645","#EBC08D");
    }

    public static HashMap<String,Object> sweetDreamColor() {
        return gradientColorMap("#3A3897","#A3A1FF");
    }

    public static HashMap<String,Object> firebrickColor() {
        return gradientColorMap("#45145A","#FF5300");
    }

    public static HashMap<String,Object> wroughtIronColor() {
        return gradientColorMap("#333333","#5A5454");
    }

    public static HashMap<String,Object> deepSeaColor() {
        return gradientColorMap("#4F00BC","#29ABE2");
    }

    public static HashMap<String,Object> coastalBreezeColor() {
        return gradientColorMap("#00B7FF","#FFFFC7");
    }

    public static HashMap<String,Object> eveningDelightColor() {
        return gradientColorMap("#93278F","#00A99D");
    }

    public static  HashMap<String,Object> gradientColorMap(String startColor,
                                                           String endColor) {
      return gradientColorMap(AALinearGradientDirection.ToTop, startColor, endColor);
    }

    public static  HashMap<String,Object> gradientColorMap(
            AALinearGradientDirection direction,
            String startColor,
            String endColor) {
        Map linearGradientColorMap = linearGradientMap(direction);
        Object[][] stopsArr =  new Object[][]{
                {0  ,startColor},
                {1  ,endColor},
        };
        HashMap gradientColorMap = new  HashMap<String,Object>();
        gradientColorMap.put("linearGradient",linearGradientColorMap);
        gradientColorMap.put("stops",stopsArr);
        return gradientColorMap;
    }

    /**
     (0,0) ----------- (1,0)
     |                   |
     |                   |
     |                   |
     |                   |
     |                   |
     (0,1) ----------- (1,1)
     */
    private static Map linearGradientMap(AALinearGradientDirection direction) {
        switch (direction)    {
            case ToTop:
                return linearGradientMap(0, 1, 0, 0);
            case ToBottom:
                return linearGradientMap(0, 0, 0, 1);
            case ToLeft:
                return linearGradientMap(1, 0, 0, 0);
            case ToRight:
                return linearGradientMap(0, 0, 1, 0);
            case ToTopLeft:
                return linearGradientMap(1, 1, 0, 0);
            case ToTopRight:
                return linearGradientMap(0, 1, 1, 0);
            case ToBottomLeft:
                return linearGradientMap(1, 0, 0, 1);
            case ToBottomRight:
                return linearGradientMap(0, 0, 1, 1);
               default: return null;
        }
    }

    private static Map linearGradientMap(int x1, int y1, int x2, int y2) {
        Map linearGradientColorMap = new HashMap<String,Integer>();
        linearGradientColorMap.put("x1",0);
        linearGradientColorMap.put("y1",1);
        linearGradientColorMap.put("x2",0);
        linearGradientColorMap.put("y2",0);
        return linearGradientColorMap;
    }
}
