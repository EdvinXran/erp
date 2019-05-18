package com.cskaoyan.controller;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.service.CustomService;
import com.github.pagehelper.Page;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("custom")
public class CustomController {

    @Autowired
    CustomService customService;

    @RequestMapping("find")
    public String find() {

        return "custom_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public Page<Custom> customList(int page, int rows) {

        Page<Custom> customs = customService.queryCustom(page, rows);

        return customs;
    }
}
