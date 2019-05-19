package com.cskaoyan.bean;

/**
 * 用于封装增删改的状态参数
 */
public class UpdateVo {
    String status;
    String msg;
    String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
