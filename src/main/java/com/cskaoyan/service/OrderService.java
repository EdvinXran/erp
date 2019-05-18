package com.cskaoyan.service;

import com.cskaoyan.bean.Order;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService {

    PageInfo<Order> getOrders(String page, String rows);
}
