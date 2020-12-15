package com.example.anan.AAChartCore.AAChartCoreLib.AATools;

public class AAColor {
    public static String Black = blackColor();
    public static String DarkGray = darkGrayColor();
    public static String LightGray = lightGrayColor();
    public static String White = whiteColor();
    public static String Gray = grayColor();
    public static String Red = redColor();
    public static String Green = greenColor();
    public static String Blue = blueColor();
    public static String Cyan = cyanColor();
    public static String Yellow = yellowColor();
    public static String Magenta = magentaColor();
    public static String Orange = orangeColor();
    public static String Purple = purpleColor();
    public static String Brown = brownColor();
    public static String Clear = clearColor();

    public static String rgbaColor(
            Integer red,
            Integer green,
            Integer blue,
            Float alpha
    ) {
        return "rgba(" + red +"," + green + "," + blue + "," + alpha + ")";
    }


    private static String blackColor() {
        return "black";
    }

    private static String darkGrayColor() {
        return "darkGray";
    }

    private static String lightGrayColor() {
        return "lightGray";
    }

    private static String whiteColor() {
        return "white";
    }

    private static String grayColor() {
        return "gray";
    }

    private static String redColor() {
        return "red";
    }

    private static String greenColor() {
        return "green";
    }

    private static String blueColor() {
        return "blue";
    }

    private static String cyanColor() {
        return "cyan";
    }

    private static String yellowColor() {
        return "yellow";
    }

    private static String magentaColor() {
        return "magenta";
    }

    private static String orangeColor() {
        return "orange";
    }

    private static String purpleColor() {
        return "purple";
    }

    private static String brownColor() {
        return "brown";
    }

    private static String clearColor() {
        return "clear";
    }


}
