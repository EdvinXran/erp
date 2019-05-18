package com.cskaoyan.mapper;

import com.cskaoyan.bean.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskMapper {

    List<Task> queryTask(@Param("page") int page, @Param("rows") int rows);


    int queryTaskNum();
}
