package com.cskaoyan.service;

import com.cskaoyan.bean.Order;
import com.github.pagehelper.Page;



public interface OrderService {

    Page<Order> getOrders(int page, int rows);
}
