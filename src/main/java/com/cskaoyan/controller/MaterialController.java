package com.cskaoyan.controller;

import com.cskaoyan.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by VAP
 * Date 2019/5/18  Time 9:11
 */

@Controller
@RequestMapping("material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @RequestMapping("list")
    public String list(){
        return "material_list";
    }




}
