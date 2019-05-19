package com.cskaoyan.controller;


import com.cskaoyan.bean.CodeType;
import com.cskaoyan.bean.Department;
import com.cskaoyan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    //首页的find
    @RequestMapping("department/find")
    public String find(){
        return "department_list";
    }
    //首页的list集合
    @RequestMapping("department/list")
    @ResponseBody
    public List<Department> departmentList(){
        return departmentService.selectAllDepartment();
    }
    //添加的add
    @RequestMapping("department/add")
    public String add1(){
        return "department_add";
    }
    //添加的add_judge
    @RequestMapping("department/add_judge")
    @ResponseBody
    public String add(){
        return "department_add";
    }
    //添加的insert
    @RequestMapping("department/insert")
    @ResponseBody
    public CodeType insert(Department department) {
        int i = departmentService.insertDepartment(department);
        CodeType codeType = new CodeType();
        if (i == 1) {
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        } else {
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("部门添加失败");
        }
        return codeType;
    }
    //修改edit_judge
    @RequestMapping("department/edit_judge")
    @ResponseBody
    public String edit(){
        return "";
    }
    //修改的edit
    @RequestMapping("department/edit")
    public String edit1(){
        return "department_edit";
    }
    @RequestMapping("department/update_all")
    @ResponseBody
    public CodeType update_all(Department department,String departmentId){
        int i = departmentService.updateDepartmentById(department,departmentId);
        CodeType codeType = new CodeType();
        if (i == 1) {
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        } else {
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("部门修改失败");
        }
        return codeType;
    }

    @RequestMapping("department/delete_judge")
    @ResponseBody
    public String delete_judge(){
        return "";
    }
    @RequestMapping("department/delete_batch")
    @ResponseBody
    public CodeType delete_batch(String[]ids){
        int i = departmentService.deletedDepartment(ids);
        CodeType codeType = new CodeType();
        if (i != 0) {
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        } else {
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("部门删除失败");
        }
        return codeType;
    }
    @RequestMapping("department/update_note")
    @ResponseBody
    public CodeType update_note(String note,String departmentId){
        int i = departmentService.updateNoteById(note,departmentId);
        CodeType codeType = new CodeType();
        if (i == 1) {
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        } else {
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("部门职责修改失败");
        }
        return codeType;
    }
    //多个使用的get_data
    @RequestMapping("department/get_data")
    @ResponseBody
    public List<Department> selectAllDepartment(){
        return departmentService.selectDepartment();
    }
    //模糊查询
}
