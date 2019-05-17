package com.cskaoyan.mapper;

import com.cskaoyan.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectAllEmployee(Employee employee);

    Employee selectEmployeeByEmpidAndEmpName(@Param("id") String empId,@Param("name") String empName);
}