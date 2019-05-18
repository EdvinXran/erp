package com.cskaoyan.controller;


import com.cskaoyan.bean.DeoartmentExample;
import com.cskaoyan.bean.Employee;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @RequestMapping("insert")
    @ResponseBody
    public String add(@RequestBody Employee employee){
        int i = employeeService.insertEmpl(employee);
        if(i==1){
            return "";
        }
        return "";
    }
    @RequestMapping("find")
    public String find(){
        return "employee_list";
    }
    @RequestMapping("list")
    @ResponseBody
    public List<Employee>employeeList(String page,String rows){
        List<Employee> employeeList = employeeService.selectAllEmployee();
        return employeeList;
    }
    @RequestMapping("add_judge")
    @ResponseBody
    public Employee add_judge(@RequestBody Employee employee){
        boolean i = employeeService.selectEmployee(employee.getEmpId(),employee.getEmpName());
        if(i){
            return employee;
        }
        return  employee;
    }
    @RequestMapping("edit_judge")
    @ResponseBody
    public Employee edit_judge(@RequestBody Employee employee){
        int i = employeeService.updateEmployeeById(employee);
        if(i == 1){
            return employee;
        }
        return employee;
    }
    @RequestMapping("delete_judge")
    public String deleted(Model model,Employee employee){
        employeeService.deletedEmployeeById(employee.getEmpId());
        return "";
    }
}
