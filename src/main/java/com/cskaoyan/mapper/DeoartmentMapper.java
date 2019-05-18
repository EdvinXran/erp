package com.cskaoyan.mapper;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.DeoartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeoartmentMapper {
    long countByExample(DeoartmentExample example);

    int deleteByExample(DeoartmentExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DeoartmentExample example);

    Department selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DeoartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DeoartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}