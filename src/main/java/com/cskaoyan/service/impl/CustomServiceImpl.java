package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.mapper.CustomMapper;
import com.cskaoyan.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    CustomMapper customMapper;

    @Override
    public List<Custom> queryCustomService(String page, String rows) {

        int rowsInt = Integer.parseInt(rows);
        int pageInt = (Integer.parseInt(page) - 1) * rowsInt;

        List<Custom> customs = customMapper.queryCustom(pageInt, rowsInt);
        return customs;
    }
}
