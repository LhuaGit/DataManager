package com.manager.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.manager.dao.CasesMapper;
import com.manager.entity.CaseQuery;
import com.manager.model.Cases;
import com.manager.model.HomeCondition;
import com.manager.model.User;
import com.manager.util.PageDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import java.util.*;

/**
 * @author lhua
 * @date 2019/2/13.
 */
@Service
public class CaseService {

    @Autowired
    CasesMapper casesMapper;

    public void addCase(User user, Cases cases) {
        if (cases.getId() == null || cases.getId() == 0) {
            cases.setCreated(new Date());
            cases.setEnable(1);
            cases.setInsertUserId(user.getId());
            cases.setStatus("1");
            casesMapper.insert(cases);
        } else {
            casesMapper.updateByPrimaryKey(cases);
        }
    }

    public void updCaseWithStatus(User user, Cases cases) {
//        casesMapper.updCaseWithStatus(cases);
    }

    public PageDataResult queryCases(User user, CaseQuery caseQuery) {
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(caseQuery.getPageNo(), caseQuery.getPageSize());
        List<Cases> list = casesMapper.selectByQuery(caseQuery);
        // 获取分页查询后的数据
        PageInfo<Cases> pageInfo = new PageInfo<>(list);
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list == null ? new ArrayList<>(0) : list);
        return pdr;
    }

    public Integer deleteCases(User user, String delIds) {
        String[] ids = delIds.split(",");
        Integer[] idArr = new Integer[ids.length];
        for (int i = 0; i < ids.length; i++) {
            idArr[i] = Integer.parseInt(ids[i]);
        }
        int res = casesMapper.deleteByPrimaryKeys(idArr);
        return res;
    }

    public Map<String, Object> countCases(User user, Date createdStart, Date createdEnd, String operateName) {
        CaseQuery query = new CaseQuery();
        query.setCreatedStart(createdStart);
        query.setCreatedEnd(createdEnd);
        query.setOperateName(operateName);
        Map<String, Integer> stateCount = casesMapper.countByState(query);
//        stateCount.put("new",stateCount.get("1"));
        Map<String, Integer> caseTypeCount = casesMapper.countByCaseType(query);
        Map<String, Integer> inTypeCount = casesMapper.countByInType(query);
        Map<String, Object> res = new HashMap<>(3);
        res.put("stateCount", stateCount);
        res.put("caseTypeCount", caseTypeCount);
        res.put("inTypeCount", inTypeCount);
        return res;
    }
}
