package com.cskaoyan.bean;

import java.util.List;

public class EmployeeVo {
    private int total;
    private List<Employee> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Employee> getRows() {
        return rows;
    }

    public void setRows(List<Employee> rows) {
        this.rows = rows;
    }
}
