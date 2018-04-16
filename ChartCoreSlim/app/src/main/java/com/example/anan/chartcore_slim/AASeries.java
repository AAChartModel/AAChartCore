package com.jswym.cloud.statistics;

import java.util.List;

/**
 * Created by AnAn on 2017/9/7.
 */

public class AASeries {
    private String name;
    private List data;
    private String innerSize;

    public AASeries setName(String name) {
        this.name = name;
        return this;
    }

    public AASeries setData(List data) {
        this.data = data;
        return this;
    }

    public AASeries setInnerSize(String innerSize) {
        this.innerSize = innerSize;
        return this;
    }


}
