package com.cskaoyan.mapper;

import com.cskaoyan.bean.Material_receive;
import com.cskaoyan.bean.Material_receiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Material_receiveMapper {
    long countByExample(Material_receiveExample example);

    int deleteByExample(Material_receiveExample example);

    int deleteByPrimaryKey(String receiveId);

    int insert(Material_receive record);

    int insertSelective(Material_receive record);

    List<Material_receive> selectByExample(Material_receiveExample example);

    Material_receive selectByPrimaryKey(String receiveId);

    int updateByExampleSelective(@Param("record") Material_receive record, @Param("example") Material_receiveExample example);

    int updateByExample(@Param("record") Material_receive record, @Param("example") Material_receiveExample example);

    int updateByPrimaryKeySelective(Material_receive record);

    int updateByPrimaryKey(Material_receive record);
}