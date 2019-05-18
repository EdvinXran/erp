package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.QueryVo;
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
    public QueryVo<Product> queryProduct(int page, int rows) {

        List<Product> products = productMapper.queryProduct((page - 1) * rows, rows);
        int total = productMapper.queryProductNum();
        QueryVo<Product> productQueryVo = new QueryVo<>();
        productQueryVo.setRows(products);
        productQueryVo.setTotal(total);
        return productQueryVo;
    }
}
