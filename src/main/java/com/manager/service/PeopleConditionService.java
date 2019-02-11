package com.manager.service;

import com.manager.dao.PeopleConditionMapper;
import com.manager.model.PeopleCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhua
 * @date 2019/1/29.
 */
@Service
public class PeopleConditionService {
    @Autowired
    private PeopleConditionMapper peopleConditionMapper;

    public void addPeopleCondition(List<PeopleCondition> list) {
        for (PeopleCondition peopleCondition : list) {
            if (peopleCondition.getId() == null || peopleCondition.getId() == 0) {
                addPeopleCondition(peopleCondition);
            } else {
                updPeopleCondition(peopleCondition);
            }
        }
    }

    private void updPeopleCondition(PeopleCondition peopleCondition) {
        peopleConditionMapper.updateByPrimaryKey(peopleCondition);

    }

    public void addPeopleCondition(PeopleCondition peopleCondition) {
        peopleConditionMapper.insert(peopleCondition);
    }

    public List<PeopleCondition> getPeopleConditionList(List<Integer> homeIdList) {
        List<PeopleCondition> list = peopleConditionMapper.selectByHomeIdList(homeIdList);
        return list == null ? new ArrayList<>(0) : list;
    }
}
