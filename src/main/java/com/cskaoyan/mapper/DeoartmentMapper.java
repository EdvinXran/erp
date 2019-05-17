package com.cskaoyan.mapper;

import com.cskaoyan.bean.Deoartment;
import com.cskaoyan.bean.DeoartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeoartmentMapper {
    long countByExample(DeoartmentExample example);

    int deleteByExample(DeoartmentExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(Deoartment record);

    int insertSelective(Deoartment record);

    List<Deoartment> selectByExample(DeoartmentExample example);

    Deoartment selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") Deoartment record, @Param("example") DeoartmentExample example);

    int updateByExample(@Param("record") Deoartment record, @Param("example") DeoartmentExample example);

    int updateByPrimaryKeySelective(Deoartment record);

    int updateByPrimaryKey(Deoartment record);
}