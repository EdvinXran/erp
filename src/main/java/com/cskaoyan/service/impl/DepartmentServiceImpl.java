package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.DepartmentExample;
import com.cskaoyan.mapper.DepartmentMapper;
import com.cskaoyan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAllDepartment() {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.clear();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }
}
