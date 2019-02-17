package com.manager.dao;

import com.manager.entity.CaseQuery;
import com.manager.model.Cases;
import com.manager.model.HomeCondition;

import java.util.List;
import java.util.Map;

public interface CasesMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByPrimaryKeys(Integer[] id);

    int insert(Cases record);

    int insertSelective(Cases record);

    Cases selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cases record);

    int updateByPrimaryKey(Cases record);

    List<Cases> selectByQuery(CaseQuery caseQuery);

    Map<String, Integer> countByState(CaseQuery query);

    Map<String, Integer> countByCaseType(CaseQuery query);

    Map<String, Integer> countByInType(CaseQuery query);
}