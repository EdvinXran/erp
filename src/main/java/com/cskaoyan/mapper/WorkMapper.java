package com.cskaoyan.mapper;

import com.cskaoyan.bean.Work;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkMapper {

    List<Work> queryWork(@Param("page") int page, @Param("rows") int rows);

    int queryWorkNum();
}
