package com.cskaoyan.controller;

import com.cskaoyan.bean.Order;
import com.cskaoyan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public List<Order> orderList(String page, String rows, ModelAndView modelAndView) {

        int pageInt = (Integer.parseInt(page) - 1) * 10;
        int rowsInt = Integer.parseInt(rows);
        List<Order> orders = orderService.getOrders(pageInt, rowsInt);
        return orders;
    }
}
