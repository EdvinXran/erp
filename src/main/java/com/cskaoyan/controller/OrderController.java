package com.cskaoyan.controller;

import com.cskaoyan.bean.Order;
import com.cskaoyan.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public PageInfo<Order> orderList(String page, String rows) {

        PageInfo<Order> orders = orderService.getOrders(page, rows);
        return orders;
    }
}
