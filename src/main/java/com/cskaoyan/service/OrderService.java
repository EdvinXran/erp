package com.cskaoyan.service;

import com.cskaoyan.bean.Order;
import com.cskaoyan.bean.QueryVo;



public interface OrderService {

    QueryVo<Order> queryOrder(int page, int rows);
}
