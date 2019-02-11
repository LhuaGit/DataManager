package com.manager.dao;

import com.manager.entity.HomeConditionQuery;
import com.manager.model.HomeCondition;

import java.util.List;

public interface HomeConditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomeCondition record);

    int insertSelective(HomeCondition record);

    HomeCondition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeCondition record);

    int updateByPrimaryKey(HomeCondition record);

    List<HomeCondition> selectByQuery(HomeConditionQuery query);
}