package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;

import java.util.List;

public interface CustomService {

    List<Custom> queryCustomService(String page, String rows);
}
