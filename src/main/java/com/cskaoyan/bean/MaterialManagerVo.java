package com.cskaoyan.bean;

import java.util.List;

/**
 * Created by VAP
 * Date 2019/5/18  Time 22:15
 */
public class MaterialManagerVo {
    int total;
    List<Material> rows;

    @Override
    public String toString() {
        return "MaterialManagerVo{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Material> getRows() {
        return rows;
    }

    public void setRows(List<Material> rows) {
        this.rows = rows;
    }

    public MaterialManagerVo(int total, List<Material> rows) {
        this.total = total;
        this.rows = rows;
    }

    public MaterialManagerVo() {
    }
}
