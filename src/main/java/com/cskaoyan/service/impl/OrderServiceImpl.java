package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Order;
import com.cskaoyan.bean.QueryVo;
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
    public QueryVo<Order> queryOrder(int page, int rows) {
        List<Order> orderList = mapper.queryOrders((page - 1) * rows, rows);
        int total = mapper.queryOrdersNum();
        QueryVo<Order> orderQueryVo = new QueryVo<>();
        orderQueryVo.setTotal(total);
        orderQueryVo.setRows(orderList);
        return orderQueryVo;
    }
}
