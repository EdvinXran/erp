package com.cskaoyan.service;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Work;

import java.util.List;

public interface WorkService {

    QueryVo<Work> queryWork(int page, int rows);
}
