package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Order;
import com.cskaoyan.mapper.OrderMapper;
import com.cskaoyan.service.OrderService;
import com.github.pagehelper.Page;
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
    public Page<Order> getOrders(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<Order> orders = mapper.queryOrders();
        Page<Order> orderPage = (Page<Order>)orders;
        return orderPage;
    }
}
