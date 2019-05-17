package com.cskaoyan.service;

import com.cskaoyan.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {
    int insertEmpl(@Param("employee") Employee employee);

    List<Employee> selectAllEmployee(Employee employee);

    boolean selectEmployee(String empId, String empName);

    int updateEmployeeById(Employee employee);

    int deletedEmployeeById(String empId);
}
