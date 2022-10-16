package com.example.anan.AAChartCore.AAChartCoreLib.AATools;

public class AAJSStringPurer {

    public static String pureJavaScriptFunctionString(String JSStr)  {
        String pureJSStr = JSStr;
        pureJSStr = pureJSStr.replace("'", "\"");
        pureJSStr = pureJSStr.replace("\0", "");
        pureJSStr = pureJSStr.replace("\n", "");
        pureJSStr = pureJSStr.replace("\\", "\\\\");
        pureJSStr = pureJSStr.replace("\"", "\\\"");
        pureJSStr = pureJSStr.replace("\n", "\\n");
        pureJSStr = pureJSStr.replace("\r", "\\r");
        pureJSStr = pureJSStr.replace("\f", "\\f");
        pureJSStr = pureJSStr.replace("\u2028", "\\u2028");
        pureJSStr = pureJSStr.replace("\u2029","\\u2029" );
        return pureJSStr;
    }

    public static String pureJavaScriptAnonymousFunctionString(String JSStr)  {
        String pureJSStr = "(" + JSStr + ")";
        pureJSStr = pureJavaScriptFunctionString(pureJSStr);
        return pureJSStr;
    }
}
