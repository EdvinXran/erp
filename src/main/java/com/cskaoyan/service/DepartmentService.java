package com.cskaoyan.service;

import com.cskaoyan.bean.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectAllDepartment();

    List<Department> selectDepartment();

    int insertDepartment(Department department);

    int updateDepartmentById(Department department,String departmentId);

    int deletedDepartment(String[] ids);

    int updateNoteById(String note, String departmentId);
}
