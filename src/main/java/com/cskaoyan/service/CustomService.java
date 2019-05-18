package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import com.github.pagehelper.Page;

import java.util.List;

public interface CustomService {

    Page<Custom> queryCustom(int page, int rows);
}
