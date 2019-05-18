package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Custom;
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
    public Page<Custom> queryCustom(int page, int rows) {

        PageHelper.startPage(page, rows);
        List<Custom> customs = customMapper.queryCustom();
        Page<Custom> customsPage = (Page<Custom>) customs;

        return customsPage;
    }
}
