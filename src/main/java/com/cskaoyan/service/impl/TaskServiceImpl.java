package com.cskaoyan.service.impl;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Task;
import com.cskaoyan.mapper.TaskMapper;
import com.cskaoyan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    TaskMapper taskMapper;


    @Override
    public QueryVo<Task> queryTask(int page, int rows) {
        int total = taskMapper.queryTaskNum();
        List<Task> taskList =  taskMapper.queryTask((page - 1) * rows, rows);
        QueryVo<Task> taskServiceQueryVo = new QueryVo<>();
        taskServiceQueryVo.setRows(taskList);
        taskServiceQueryVo.setTotal(total);
        return taskServiceQueryVo;
    }
}
