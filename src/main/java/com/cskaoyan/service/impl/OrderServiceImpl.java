package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Order;
import com.cskaoyan.mapper.OrderMapper;
import com.cskaoyan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper mapper;

    @Override
    public List<Order> getOrders(int page, int rows) {

        List<Order> orders = mapper.queryOrders(page, rows);
        return orders;
    }
}
