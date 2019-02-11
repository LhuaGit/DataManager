package com.manager.controller;

import com.manager.entity.HomeConditionQuery;
import com.manager.entity.ResponseResult;
import com.manager.model.HomeCondition;
import com.manager.model.PeopleCondition;
import com.manager.service.HomeConditionService;
import com.manager.service.PeopleConditionService;
import com.manager.util.PageDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhua
 * @date 2019/1/29.
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    @Autowired
    private HomeConditionService homeConditionService;
    @Autowired
    private PeopleConditionService peopleConditionService;

    @RequestMapping("/addCondition")
    @ResponseBody
    public ResponseResult addHomePeopleContion(HomeCondition homeCondition) throws Exception {
        if (CollectionUtils.isEmpty(homeCondition.getPeopleConditionList())) {
            throw new Exception("需至少一个成员信息");
        }
        homeConditionService.addHomeAndPeopleCondition(homeCondition);
        return buildSuccessResponse();
    }

    @RequestMapping("query")
    @ResponseBody
    public ResponseResult getHomeConditionList(HomeConditionQuery query) {
        PageDataResult pdr = homeConditionService.getHomeConditionList(query);
        return buildResponse(pdr);
    }

    @RequestMapping("query/people")
    @ResponseBody
    public ResponseResult getPeopleConditionList(HomeConditionQuery query) {
        if (query.getHomeId() == null) {
            throw new IllegalArgumentException("缺少参数");
        }
        List<Integer> homeIdList = new ArrayList<>();
        homeIdList.add(query.getHomeId());
        List<PeopleCondition> list = peopleConditionService.getPeopleConditionList(homeIdList);
        return buildResponse(list);
    }

}
