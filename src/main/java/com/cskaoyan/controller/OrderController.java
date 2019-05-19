package com.cskaoyan.controller;

import com.cskaoyan.bean.Order;
import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.service.OrderService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("find")
    public String getOrders() {

        return "order_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public QueryVo<Order> list(int page, int rows) {

        QueryVo<Order> taskQueryVo = orderService.queryOrder(page, rows);
        return taskQueryVo;
    }
}
