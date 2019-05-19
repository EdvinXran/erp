package com.cskaoyan.bean;

import java.util.Date;

public class Manufacture {

    private String manufactureSn;
    private int launchQuantity;
    private Date beginDate;
    private Order cOrder;
    private Date endDate;


    private Technology technology;

    public Order getcOrder() {
        return cOrder;
    }

    public void setcOrder(Order cOrder) {
        this.cOrder = cOrder;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn;
    }


    public int getLaunchQuantity() {
        return launchQuantity;
    }

    public void setLaunchQuantity(int launchQuantity) {
        this.launchQuantity = launchQuantity;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
