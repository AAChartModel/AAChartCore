package com.example.anan.chartcore_slim.AATools;

public class AAEasyTool {

    public static String pureJavaScriptFunctionString(String jsFunctionStr)  {
        String pureJSFunctionStr = jsFunctionStr;
        pureJSFunctionStr = pureJSFunctionStr.replace("'", "\"");
        pureJSFunctionStr = pureJSFunctionStr.replace(" ", "");
        pureJSFunctionStr = pureJSFunctionStr.replace("\"", "\\\"");
        pureJSFunctionStr = pureJSFunctionStr.replace("\'", "\\\'");
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "\\n");
        pureJSFunctionStr = pureJSFunctionStr.replace("\r", "\\r");
        return pureJSFunctionStr;
    }
}
