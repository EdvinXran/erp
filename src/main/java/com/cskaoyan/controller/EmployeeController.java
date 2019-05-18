package com.cskaoyan.controller;


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
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @RequestMapping("find")
    public String getOrders() {

        return "employee_list";
    }

    @ResponseBody
    @RequestMapping("list")
    public List<Employee> employeeList(String page, String rows) {

        List<Employee>employeeList= employeeService.selectAllEmployee();
        return employeeList;
    }

    @RequestMapping("add")
    public String add(){
        return "employee_add";
    }
    @RequestMapping("add_judge")
    @ResponseBody
    public Employee add_judge(@RequestBody Employee employee){
        boolean i = employeeService.selectEmployee(employee.getEmpId(),employee.getEmpName());
        if(!i){

        }
        return employee;
    }
    @RequestMapping("edit")
    public String edit(){
        return "employee_edit";
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
//    @RequestMapping("delete_batch")
//    public
    @RequestMapping("delete_judge")
    public String deleted(Model model,Employee employee){
        employeeService.deletedEmployeeById(employee.getEmpId());
        return "";
    }
}
