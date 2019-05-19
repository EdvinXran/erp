package com.cskaoyan.service;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.QueryVo;

public interface ManufactureService {

    QueryVo<Manufacture> queryManufacture(int page, int rows);
}
