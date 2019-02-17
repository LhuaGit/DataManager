package com.manager.controller;

import com.manager.entity.CaseQuery;
import com.manager.entity.ResponseResult;
import com.manager.model.Cases;
import com.manager.model.User;
import com.manager.service.CaseService;
import com.manager.util.PageDataResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Map;

/**
 * @author lhua
 * @date 2019/2/13.
 */
@RestController
@RequestMapping("/cases")
public class CaseController extends BaseController {

    @Autowired
    private CaseService caseService;

    @RequestMapping(value = "/addCase", method = RequestMethod.POST)
    @ApiOperation(value = "新增/编辑个案表单信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult addCase(@RequestBody @ApiParam(value = "个案信息") Cases cases) {
        User user = getUser();
        caseService.addCase(user, cases);
        return buildSuccessResponse();
    }

    @RequestMapping(value = "/queryCases", method = RequestMethod.POST)
    @ApiOperation(value = "查询个案信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult queryCases(@ApiParam(value = "居委") String neighborhood,
                                     @ApiParam(value = "对象类别") String homeType,
                                     @ApiParam(value = "成员姓名") String name,
                                     @ApiParam(value = "页码") Integer pageNo,
                                     @ApiParam(value = "每页显示条数") Integer pageSize) {
        User user = getUser();
        CaseQuery query = new CaseQuery();
        query.setPageNo(pageNo);
        query.setPageSize(pageSize);
        query.setName(name);
        query.setNeighborhood(neighborhood);
        query.setHomeType(homeType);
        PageDataResult pdr = caseService.queryCases(user, query);
        return buildResponse(pdr);
    }

    @RequestMapping(value = "/deleteCases", method = RequestMethod.POST)
    @ApiOperation(value = "删除个案信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult deleteCases(@ApiParam(value = "需要删除的id，多个id用,拼接") String delIds) throws Exception {
        User user = getUser();
        if (StringUtils.isBlank(delIds)) {
            throw new Exception("请勾选记录");
        }
        Integer res = caseService.deleteCases(user, delIds);
        return buildResponse(res);
    }

    @RequestMapping(value = "/countCases", method = RequestMethod.POST)
    @ApiOperation(value = "统计个案信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseResult countCases(@ApiParam(value = "开始时间") @NotBlank Date createdStart,
                                     @ApiParam(value = "结束时间") @NotBlank Date createdEnd,
                                     @ApiParam(value = "经办人=录入人") String operateName) {
        User user = getUser();

        Map<String, Object> res = caseService.countCases(user, createdStart, createdEnd, operateName);
        return buildResponse(res);
    }


}
