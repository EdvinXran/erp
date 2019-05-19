package com.cskaoyan.service;

import com.cskaoyan.bean.Employee;


import java.util.List;

public interface EmployeeService {
    int insertEmpl(Employee employee,String departmentId);

    List<Employee> selectAllEmployee();

    int updateEmployeeById(Employee employee,String departmentId);


    int deleted(String[] ids);
}
