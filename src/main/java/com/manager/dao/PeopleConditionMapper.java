package com.manager.dao;

import com.manager.model.PeopleCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeopleConditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PeopleCondition record);

    int insertSelective(PeopleCondition record);

    PeopleCondition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PeopleCondition record);

    int updateByPrimaryKey(PeopleCondition record);

    List<PeopleCondition> selectByHomeIdList(@Param("homeIdList") List<Integer> homeIdList);

}