package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.mapper.CustomMapper;
import com.cskaoyan.service.CustomService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    CustomMapper customMapper;

    @Override
    public QueryVo<Custom> queryCustom(int page, int rows) {
        List<Custom> customs = customMapper.queryCustom((page - 1) * rows, rows);
        int total = customMapper.queryCustomNum();
        QueryVo<Custom> customQueryVo = new QueryVo<>();
        customQueryVo.setTotal(total);
        customQueryVo.setRows(customs);
        return customQueryVo;
    }
}
