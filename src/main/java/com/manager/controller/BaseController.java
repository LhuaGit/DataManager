package com.manager.controller;

import com.manager.entity.ResponseResult;
import com.manager.model.User;
import org.apache.shiro.SecurityUtils;

/**
 * @author lhua
 * @date 2019/1/29.
 */
public class BaseController {

    public User getUser() {
        User existUser = new User();
        existUser.setId(1);
        //TODO 后期去除临时user信息
//        User existUser = (User) SecurityUtils.getSubject().getPrincipal();
        if (existUser == null) {
            throw new RuntimeException("会话失效，请重新登陆");
        }
        return existUser;
    }

    public ResponseResult buildSuccessResponse() {
        return new ResponseResult();
    }

    public ResponseResult buildResponse(Object obj) {
        return new ResponseResult(obj);
    }
}
