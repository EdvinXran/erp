package com.cskaoyan.mapper;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.processExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface processMapper {
    long countByExample(processExample example);

    int deleteByExample(processExample example);

    int deleteByPrimaryKey(String processId);

    int insert(Process record);

    int insertSelective(Process record);

    List<Process> selectByExample(processExample example);

    Process selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") Process record, @Param("example") processExample example);

    int updateByExample(@Param("record") Process record, @Param("example") processExample example);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);
}