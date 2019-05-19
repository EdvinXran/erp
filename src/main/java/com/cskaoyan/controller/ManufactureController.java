package com.cskaoyan.controller;


import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("manufacture")
public class ManufactureController {


    @Autowired
    ManufactureService manufactureService;

    @RequestMapping("find")
    public String find(){

        return "manufacture_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public QueryVo<Manufacture> list(int page, int rows) {

        QueryVo<Manufacture> manufactureQueryVo = manufactureService.queryManufacture(page, rows);
        return manufactureQueryVo;
    }
}
