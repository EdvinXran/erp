package com.cskaoyan.controller;


import com.cskaoyan.bean.Employee;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("add")
    public String add(Employee employee){
        int i = employeeService.insertEmpl(employee);
        if(i==1){
            return "";
        }
        return "";
    }
}
