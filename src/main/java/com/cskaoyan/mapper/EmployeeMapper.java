package com.cskaoyan.mapper;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.bean.EmployeeExample;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String empId);

    int insert(Employee employee);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectAllEmployee();

    int insertemployee(Employee employee,String departmentId);

    int updateEmployeeById(@Param("emp") Employee employee,@Param("Did") String departmentId);


    int deletedEmployeeByIds(@Param("ids") String[] ids);
}