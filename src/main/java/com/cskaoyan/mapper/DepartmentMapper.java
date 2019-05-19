package com.cskaoyan.mapper;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    //getdata的list集合
    List<Department> selectByDepartment();
    //新增部门
    int indertDepartment(Department department);
    //修改部门
    int updatebyDepartmentId(@Param("department") Department department,@Param("id") String departmentId);
    //删除部门
    int deleteDepartmentByIds(@Param("ids")String[] ids);
    //修改note
    int updateNoteByDepartmentd(@Param("note")String note,@Param("id") String departmentId);
}