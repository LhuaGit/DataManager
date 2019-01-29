package com.manager.dao;

import com.manager.model.PeopleCondition;

public interface PeopleConditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PeopleCondition record);

    int insertSelective(PeopleCondition record);

    PeopleCondition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PeopleCondition record);

    int updateByPrimaryKey(PeopleCondition record);
}