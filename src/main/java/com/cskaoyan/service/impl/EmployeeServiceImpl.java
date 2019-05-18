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
    public int insertEmpl(Employee employee) {
        int i = employeeMapper.insert(employee);
        return i;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return employeeMapper.selectAllEmployee();
    }

    @Override
    public boolean selectEmployee(String empId, String empName) {
        return employeeMapper.selectEmployeeByEmpidAndEmpName(empId,empName) != null;
    }

    @Override
    public int updateEmployeeById(Employee employee) {
        int i = employeeMapper.updateByPrimaryKey(employee);
        return i;
    }

    @Override
    public int deletedEmployeeById(String empId) {
        int i = employeeMapper.deleteByPrimaryKey(empId);
        return i;
    }

}
