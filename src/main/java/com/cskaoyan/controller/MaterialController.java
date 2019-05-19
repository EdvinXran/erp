package com.cskaoyan.controller;

import com.cskaoyan.bean.Material;
import com.cskaoyan.bean.MaterialManagerVo;
import com.cskaoyan.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VAP
 * Date 2019/5/18  Time 21:49
 */

@Controller
@RequestMapping("material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    /*
    跳转到显示页面
     */
    @RequestMapping("find")
    public String materialManage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<String> per = new ArrayList<>();
        per.add("material:add");
        per.add("material:edit");
        per.add("material:delete");
        session.setAttribute("sysPermissionList",per);
        return "material_list";
    }

    /*
    分页查询物料信息
     */
    @RequestMapping("list")
    @ResponseBody
    public MaterialManagerVo findPartMaterial(@RequestParam int page,@RequestParam int rows){
        MaterialManagerVo materialManagerVo = new MaterialManagerVo();
        List<Material> materialList = materialService.findAll(page, rows);
        materialManagerVo.setRows(materialList);
        materialManagerVo.setTotal(materialList == null?0:materialList.size());
        System.out.println(materialManagerVo);
        return materialManagerVo;
    }

    /*
    添加之前的判断
     */
    @RequestMapping("add_judge")
    @ResponseBody
    public String addJudge(){
        return null;
    }
    /*
    加载添加子页面
     */
//    @RequestMapping("")
}































