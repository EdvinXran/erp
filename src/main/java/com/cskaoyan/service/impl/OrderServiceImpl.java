package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Order;
import com.cskaoyan.mapper.OrderMapper;
import com.cskaoyan.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper mapper;

    @Override
    public PageInfo<Order> getOrders(String page, String rows) {
        int rowsInt = Integer.parseInt(rows);
        int pageInt = Integer.parseInt(page);
        PageHelper.startPage(pageInt, rowsInt);
        List<Order> orders = mapper.queryOrders();
        PageInfo<Order> orderPageInfo = (PageInfo<Order>)orders;
        return orderPageInfo;
    }
}
