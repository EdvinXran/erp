package com.cskaoyan.mapper;

import com.cskaoyan.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> queryProduct(@Param("page") int page, @Param("rows") int rows);

    int queryProductNum();
}
