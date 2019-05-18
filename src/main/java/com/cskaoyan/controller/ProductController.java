package com.cskaoyan.controller;

import com.cskaoyan.bean.Product;
import com.cskaoyan.service.ProductService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping("find")
    public String find() {

        return "product_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public Page<Product> list(int page, int rows) {

        Page<Product> products = productService.queryProduct(page, rows);
        return products;

    }

}
