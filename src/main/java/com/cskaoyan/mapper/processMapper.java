package com.cskaoyan.mapper;

import com.cskaoyan.bean.process;
import com.cskaoyan.bean.processExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface processMapper {
    long countByExample(processExample example);

    int deleteByExample(processExample example);

    int deleteByPrimaryKey(String processId);

    int insert(process record);

    int insertSelective(process record);

    List<process> selectByExample(processExample example);

    process selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") process record, @Param("example") processExample example);

    int updateByExample(@Param("record") process record, @Param("example") processExample example);

    int updateByPrimaryKeySelective(process record);

    int updateByPrimaryKey(process record);
}