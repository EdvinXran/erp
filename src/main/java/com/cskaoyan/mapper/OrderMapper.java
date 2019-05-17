package com.cskaoyan.mapper;

import com.cskaoyan.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    List<Order> queryOrders(@Param("page")int page, @Param("rows") int rows);
}
