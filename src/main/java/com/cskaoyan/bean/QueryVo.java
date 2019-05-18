package com.cskaoyan.bean;

import java.util.List;

public class QueryVo<T> {


    private int total;

    private List<T> tList;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }
}
