package com.cskaoyan.mapper;

import com.cskaoyan.bean.Device_Type;
import com.cskaoyan.bean.Device_TypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Device_TypeMapper {
    long countByExample(Device_TypeExample example);

    int deleteByExample(Device_TypeExample example);

    int deleteByPrimaryKey(String deviceTypeId);

    int insert(Device_Type record);

    int insertSelective(Device_Type record);

    List<Device_Type> selectByExample(Device_TypeExample example);

    Device_Type selectByPrimaryKey(String deviceTypeId);

    int updateByExampleSelective(@Param("record") Device_Type record, @Param("example") Device_TypeExample example);

    int updateByExample(@Param("record") Device_Type record, @Param("example") Device_TypeExample example);

    int updateByPrimaryKeySelective(Device_Type record);

    int updateByPrimaryKey(Device_Type record);
}