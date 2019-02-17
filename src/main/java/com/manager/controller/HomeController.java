package com.manager.controller;

import com.manager.entity.HomeConditionQuery;
import com.manager.entity.ResponseResult;
import com.manager.model.HomeCondition;
import com.manager.model.PeopleCondition;
import com.manager.model.User;
import com.manager.service.HomeConditionService;
import com.manager.service.PeopleConditionService;
import com.manager.util.PageDataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhua
 * @date 2019/1/29.
 */
@Controller
@RequestMapping(value = "/home")
@Api(value = "家庭信息相关")
public class HomeController extends BaseController {

    @Autowired
    private HomeConditionService homeConditionService;
    @Autowired
    private PeopleConditionService peopleConditionService;

    @ApiOperation(value = "添加家庭信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @RequestMapping(value = "/addCondition", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult addHomePeopleContion(@RequestBody @ApiParam(value = "家庭信息表单")
                                                       HomeCondition homeCondition) throws Exception {
        User user = getUser();
        if (CollectionUtils.isEmpty(homeCondition.getPeopleConditionList())) {
            throw new Exception("需至少一个成员信息");
        }
        homeConditionService.addHomeAndPeopleCondition(user, homeCondition);
        return buildSuccessResponse();
    }

    @RequestMapping(value = "query", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询家庭信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult getHomeConditionList(@RequestBody @ApiParam(value = "查询信息表单") HomeConditionQuery query) {
        User user = getUser();
        PageDataResult pdr = homeConditionService.getHomeConditionList(query);
        return buildResponse(pdr);
    }

    @RequestMapping(value = "query/people", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询家庭成员信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult getPeopleConditionList(@RequestBody @ApiParam(value = "查询信息表单") HomeConditionQuery query) {
        if (query.getHomeId() == null) {
            throw new IllegalArgumentException("缺少参数");
        }
        User user = getUser();
        List<Integer> homeIdList = new ArrayList<>();
        homeIdList.add(query.getHomeId());
        List<PeopleCondition> list = peopleConditionService.getPeopleConditionList(homeIdList);
        ResponseResult<List<PeopleCondition>> result = new ResponseResult<>();
        result.setObj(list);
        return result;
    }

}
