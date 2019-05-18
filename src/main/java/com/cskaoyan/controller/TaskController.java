package com.cskaoyan.controller;


import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Task;
import com.cskaoyan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskService taskService;


    @RequestMapping("find")
    public String find() {
        return "task_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public QueryVo<Task> list(int page, int rows) {

        QueryVo<Task> taskQueryVo = taskService.queryTask(page, rows);
        return taskQueryVo;
    }

}
