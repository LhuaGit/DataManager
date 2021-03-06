package com.manager.entity;


import com.manager.util.IStatusMessage;

import java.io.Serializable;

/**
 * @项目名称： wyait-manage
 * @类名称： ResponseResult
 * @类描述： 前端请求响应结果, code:编码,message:描述,obj对象，可以是单个数据对象，数据列表或者PageInfo
 * @创建时间： 2018年1月4日10:57:24
 * @version:
 */
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 7285065610386199394L;

    private String code = IStatusMessage.SystemStatus.SUCCESS.getCode();
    private String message;
    private T obj;

    public ResponseResult() {
        this.code = IStatusMessage.SystemStatus.SUCCESS.getCode();
        this.message = IStatusMessage.SystemStatus.SUCCESS.getMessage();
    }

    public ResponseResult(T obj) {
        this.code = IStatusMessage.SystemStatus.SUCCESS.getCode();
        this.message = IStatusMessage.SystemStatus.SUCCESS.getMessage();
        this.obj = obj;
    }

    public ResponseResult(IStatusMessage statusMessage) {
        this.code = statusMessage.getCode();
        this.message = statusMessage.getMessage();

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResponseResult{" + "code='" + code + '\'' + ", message='"
                + message + '\'' + ", obj=" + obj + '}';
    }
}
