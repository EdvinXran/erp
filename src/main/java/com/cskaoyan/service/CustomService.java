package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.QueryVo;
import com.github.pagehelper.Page;

import java.util.List;

public interface CustomService {

    QueryVo<Custom> queryCustom(int page, int rows);
}
