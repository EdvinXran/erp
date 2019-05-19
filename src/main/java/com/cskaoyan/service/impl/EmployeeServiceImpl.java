package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.mapper.EmployeeMapper;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public int insertEmpl(Employee employee,String departmentId) {
        int i = employeeMapper.insertemployee(employee,departmentId);
        return i;
    }
    @Override
    public List<Employee> selectAllEmployee() {
        return employeeMapper.selectAllEmployee();
    }

    @Override
    public int updateEmployeeById(Employee employee,String departmentId) {
        int i = employeeMapper.updateEmployeeById(employee,departmentId);
        return i;
    }

    @Override
    public int deleted(String[] ids) {
        int i = employeeMapper.deletedEmployeeByIds(ids);
        return i;
    }


}
