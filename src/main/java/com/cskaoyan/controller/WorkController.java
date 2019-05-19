package com.cskaoyan.controller;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Work;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("work")
public class WorkController {

    @Autowired
    WorkService workService;


    @RequestMapping("find")
    public String find() {

        return "work_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public QueryVo<Work> list(int page, int rows) {


        QueryVo<Work> workQueryVo = workService.queryWork(page, rows);

        //workQueryVo.settList();
        return workQueryVo;
    }
}
