package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Product;
import com.cskaoyan.mapper.ProductMapper;
import com.cskaoyan.service.ProductService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Page<Product> queryProduct(int page, int rows) {

        PageHelper.startPage(page, rows);
        List<Product> products = productMapper.queryProduct();

        return (Page<Product>)products;
    }
}
