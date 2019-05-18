package com.cskaoyan.service;

import com.cskaoyan.bean.Product;
import com.github.pagehelper.Page;

public interface ProductService {

    Page<Product> queryProduct(int page, int rows);
}
