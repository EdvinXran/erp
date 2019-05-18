package com.cskaoyan.bean;

import java.util.List;

public class QueryVo<T> {


    private int page;

    private List<T> tList;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }
}
