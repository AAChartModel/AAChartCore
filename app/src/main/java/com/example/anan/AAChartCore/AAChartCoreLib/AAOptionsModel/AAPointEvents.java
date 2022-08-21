package com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel;

public class AAPointEvents {
    public String click; //点击事件
    public String mouseOut; //鼠标划出
    public String mouseOver; //鼠标划过
    public String remove; //删除
    public String select; //选中
    public String unselect; //取消选中
    public String update; //更新

    public AAPointEvents click(String prop) {
        click = prop;
        return this;
    }

    public AAPointEvents mouseOut(String prop) {
        mouseOut = prop;
        return this;
    }

    public AAPointEvents mouseOver(String prop) {
        mouseOver = prop;
        return this;
    }

    public AAPointEvents remove(String prop) {
        remove = prop;
        return this;
    }

    public AAPointEvents select(String prop) {
        select = prop;
        return this;
    }

    public AAPointEvents unselect(String prop) {
        unselect = prop;
        return this;
    }

    public AAPointEvents update(String prop) {
        update = prop;
        return this;
    }


}
