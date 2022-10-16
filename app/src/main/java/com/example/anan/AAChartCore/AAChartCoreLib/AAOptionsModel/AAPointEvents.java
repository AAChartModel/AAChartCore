package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

import com.example.anan.AAChartCore.AAChartCoreLib.AATools.AAJSStringPurer;

public class AAPointEvents {
    public String click; //点击事件
    public String mouseOut; //鼠标划出
    public String mouseOver; //鼠标划过
    public String remove; //删除
    public String select; //选中
    public String unselect; //取消选中
    public String update; //更新
    public String legendItemClick; //图例点击事件

    public AAPointEvents click(String prop) {
        click = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents mouseOut(String prop) {
        mouseOut = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents mouseOver(String prop) {
        mouseOver = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents remove(String prop) {
        remove = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents select(String prop) {
        select = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents unselect(String prop) {
        unselect = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents update(String prop) {
        update = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }

    public AAPointEvents legendItemClick(String prop) {
        legendItemClick = AAJSStringPurer.pureJavaScriptAnonymousFunctionString(prop);
        return this;
    }


}
