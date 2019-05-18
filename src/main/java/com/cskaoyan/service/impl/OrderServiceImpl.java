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
    public List<Order> getOrders(String page, String rows) {
        int rowsInt = Integer.parseInt(rows);
        int pageInt = (Integer.parseInt(page) - 1) * rowsInt;
        List<Order> orders = mapper.queryOrders(pageInt, rowsInt);
        return orders;
    }
}
