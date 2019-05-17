package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology_requirement;
import com.cskaoyan.bean.Technology_requirementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Technology_requirementMapper {
    long countByExample(Technology_requirementExample example);

    int deleteByExample(Technology_requirementExample example);

    int deleteByPrimaryKey(String technologyRequirementId);

    int insert(Technology_requirement record);

    int insertSelective(Technology_requirement record);

    List<Technology_requirement> selectByExample(Technology_requirementExample example);

    Technology_requirement selectByPrimaryKey(String technologyRequirementId);

    int updateByExampleSelective(@Param("record") Technology_requirement record, @Param("example") Technology_requirementExample example);

    int updateByExample(@Param("record") Technology_requirement record, @Param("example") Technology_requirementExample example);

    int updateByPrimaryKeySelective(Technology_requirement record);

    int updateByPrimaryKey(Technology_requirement record);
}