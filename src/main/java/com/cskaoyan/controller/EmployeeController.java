package com.cskaoyan.controller;


import com.cskaoyan.bean.CodeType;
import com.cskaoyan.bean.Employee;
import com.cskaoyan.bean.EmployeeVo;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //首页find
    @RequestMapping("employee/find")
    public String getOrders() {
        return "employee_list";
    }
    //首页list
    @ResponseBody
    @RequestMapping("employee/list")
    public EmployeeVo employeeList() {
        List<Employee> employeeList = employeeService.selectAllEmployee();
        EmployeeVo employeeVo = new EmployeeVo();
        employeeVo.setRows(employeeList);
        employeeVo.setTotal(employeeList.size());
        return employeeVo;
    }

    //添加add
    @RequestMapping("employee/add")
    public String add(){
        return "employee_add";
    }
    //添加add_judge
    @RequestMapping("employee/add_judge")
    @ResponseBody
    public String addjudge(){
        return "employee_add";
    }
    //新增insert
    @RequestMapping("employee/insert")
    @ResponseBody
    public CodeType insertEmployee(Employee employee,String departmentId){
        int i = employeeService.insertEmpl(employee,departmentId);
        CodeType codeType = new CodeType();
        if(i == 1){
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);

        }else{
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("添加失败");

        }
        return codeType;
    }
    //修改edit
    @RequestMapping("employee/edit")
    public String edit(){
        return "employee_edit";
    }
    //修改edit_judge
    @RequestMapping("employee/edit_judge")
    @ResponseBody
    public String edit_judge(){
        return "";
    }
    @RequestMapping("employee/update_all")
    @ResponseBody
    public CodeType updateEmpl(Employee employee,String departmentId){
        int i = employeeService.updateEmployeeById(employee,departmentId);
        CodeType codeType = new CodeType();
        if(i == 1){
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        }else{
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("修改失败");
        }
        return codeType;
    }
    //删除delete
    @RequestMapping("employee/delete_judge")
    @ResponseBody
    public String deleted(){
        return "";
    }
    @RequestMapping("employee/delete_batch")
    @ResponseBody
    public CodeType deleted(String[] ids){
        int i = employeeService.deleted(ids);
        CodeType codeType = new CodeType();
        if(i == 1){
            codeType.setMsg("OK");
            codeType.setStatus("200");
            codeType.setData(null);
        }else{
            codeType.setMsg("NO");
            codeType.setStatus("500");
            codeType.setData("删除失败");
        }
        return codeType;
    }
    //模糊查询


}
