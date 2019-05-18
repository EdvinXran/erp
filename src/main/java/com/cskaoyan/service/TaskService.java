package com.cskaoyan.service;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Task;

public interface TaskService {

    QueryVo<Task> queryTask(int page, int rows);
}
