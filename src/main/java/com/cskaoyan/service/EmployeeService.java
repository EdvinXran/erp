package com.cskaoyan.service;

import com.cskaoyan.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeService {
    int insertEmpl(@Param("employee") Employee employee);
}
