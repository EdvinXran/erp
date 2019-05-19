package com.cskaoyan.mapper;

import com.cskaoyan.bean.Manufacture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManufactureMapper {

    List<Manufacture> queryManufacture(@Param("page") int page, @Param("rows") int rows);

    int queryManufactureNum();
}
