package com.manager.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.manager.dao.HomeConditionMapper;
import com.manager.entity.HomeConditionQuery;
import com.manager.model.HomeCondition;
import com.manager.model.User;
import com.manager.util.PageDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
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
    public void addHomeAndPeopleCondition(User user, HomeCondition homeCondition) {
        homeCondition.setNum(homeCondition.getPeopleConditionList().size());
        if (homeCondition.getId() == null || homeCondition.getId() == 0) {
            homeCondition.setCreated(new Date());
            homeCondition.setEnable(1);
            homeCondition.setInsertUserId(user.getId());
            addHomeCondition(homeCondition);
        } else {
            homeCondition.setEnable(1);
            updHomeCondition(homeCondition);
        }
        peopleConditionService.addPeopleCondition(user, homeCondition.getPeopleConditionList());
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
        List<HomeCondition> list = homeConditionMapper.selectByQuery(query);
        // 获取分页查询后的数据
        PageInfo<HomeCondition> pageInfo = new PageInfo<>(list);
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list == null ? new ArrayList<>(0) : list);
        return pdr;
    }
}
