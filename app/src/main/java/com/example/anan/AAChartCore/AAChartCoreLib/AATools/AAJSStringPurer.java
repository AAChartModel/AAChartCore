package com.example.anan.AAChartCore.AAChartCoreLib.AATools;

public class AAJSStringPurer {

    public static String pureJavaScriptFunctionString(String jsFunctionStr)  {
        String pureJSFunctionStr = jsFunctionStr;
        pureJSFunctionStr = pureJSFunctionStr.replace("'", "\"");
        pureJSFunctionStr = pureJSFunctionStr.replace("\0", "");
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "");
        pureJSFunctionStr = pureJSFunctionStr.replace("\\", "\\\\");
        pureJSFunctionStr = pureJSFunctionStr.replace("\"", "\\\"");
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "\\n");
        pureJSFunctionStr = pureJSFunctionStr.replace("\r", "\\r");
        pureJSFunctionStr = pureJSFunctionStr.replace("\f", "\\f");
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2028", "\\u2028");
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2029","\\u2029" );
        return pureJSFunctionStr;
    }
}
