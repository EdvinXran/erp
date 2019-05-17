package com.cskaoyan.mapper;

import com.cskaoyan.bean.Device_Check;
import com.cskaoyan.bean.Device_CheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Device_CheckMapper {
    long countByExample(Device_CheckExample example);

    int deleteByExample(Device_CheckExample example);

    int deleteByPrimaryKey(String deviceCheckId);

    int insert(Device_Check record);

    int insertSelective(Device_Check record);

    List<Device_Check> selectByExample(Device_CheckExample example);

    Device_Check selectByPrimaryKey(String deviceCheckId);

    int updateByExampleSelective(@Param("record") Device_Check record, @Param("example") Device_CheckExample example);

    int updateByExample(@Param("record") Device_Check record, @Param("example") Device_CheckExample example);

    int updateByPrimaryKeySelective(Device_Check record);

    int updateByPrimaryKey(Device_Check record);
}