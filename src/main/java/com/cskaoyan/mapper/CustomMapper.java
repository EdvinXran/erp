package com.cskaoyan.mapper;

import com.cskaoyan.bean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {

    List<Custom> queryCustom(@Param("page") int page, @Param("rows") int rows);

    int queryCustomNum();
 }
