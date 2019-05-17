package com.cskaoyan.mapper;

import com.cskaoyan.bean.Device_Maintain;
import com.cskaoyan.bean.Device_MaintainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Device_MaintainMapper {
    long countByExample(Device_MaintainExample example);

    int deleteByExample(Device_MaintainExample example);

    int deleteByPrimaryKey(String deviceMaintainId);

    int insert(Device_Maintain record);

    int insertSelective(Device_Maintain record);

    List<Device_Maintain> selectByExample(Device_MaintainExample example);

    Device_Maintain selectByPrimaryKey(String deviceMaintainId);

    int updateByExampleSelective(@Param("record") Device_Maintain record, @Param("example") Device_MaintainExample example);

    int updateByExample(@Param("record") Device_Maintain record, @Param("example") Device_MaintainExample example);

    int updateByPrimaryKeySelective(Device_Maintain record);

    int updateByPrimaryKey(Device_Maintain record);
}