package com.manager.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.manager.dao.HomeConditionMapper;
import com.manager.entity.HomeConditionQuery;
import com.manager.model.HomeCondition;
import com.manager.util.PageDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhua
 * @date 2019/1/29.
 */
@Service
public class HomeConditionService {

    @Autowired
    private PeopleConditionService peopleConditionService;

    @Autowired
    private HomeConditionMapper homeConditionMapper;

    @Transactional
    public void addHomeAndPeopleCondition(HomeCondition homeCondition) {

        if (homeCondition.getId() == null || homeCondition.getId() == 0) {
            addHomeCondition(homeCondition);
        } else {
            updHomeCondition(homeCondition);
        }
        peopleConditionService.addPeopleCondition(homeCondition.getPeopleConditionList());
    }

    public void addHomeCondition(HomeCondition homeCondition) {
        homeConditionMapper.insert(homeCondition);
    }

    public void updHomeCondition(HomeCondition homeCondition) {
        homeConditionMapper.updateByPrimaryKey(homeCondition);
    }

    public PageDataResult getHomeConditionList(HomeConditionQuery query) {
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(query.getPageNo(), query.getPageSize());
        // 获取分页查询后的数据
        PageInfo<HomeCondition> pageInfo = new PageInfo<>();
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        List<HomeCondition> list = homeConditionMapper.selectByQuery(query);
        pdr.setList(list == null ? new ArrayList<>(0) : list);
        return pdr;
    }
}
