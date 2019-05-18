package com.cskaoyan.service;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.QueryVo;
import com.github.pagehelper.Page;

public interface ProductService {

    QueryVo<Product> queryProduct(int page, int rows);
}
