package com.manager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "个案信息实体")
public class Cases {
    @ApiModelProperty(value = "主键id，编辑时需要")
    private Integer id;

    @ApiModelProperty(value = "个案类型")
    private String caseType;

    @ApiModelProperty(value = "接入类型")
    private String inType;

    @ApiModelProperty(value = "计划")
    private String plan;

    @ApiModelProperty(value = "介入方式")
    private String getType;

    @ApiModelProperty(value = "介入时间")
    private Date getTime;

    @ApiModelProperty(value = "结果")
    private String result;

    @ApiModelProperty(value = "个案状态， 1：新建状态=保存，2：长期跟踪，3：结案")
    private String status;

    @ApiModelProperty(value = "个案家庭id")
    private Integer homeId;

    @ApiModelProperty(value = "个案成员id")
    private String peopleIds;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date modified;

    @ApiModelProperty(value = "是否有效")
    private Integer enable;

    @ApiModelProperty(value = "插入人id")
    private Integer insertUserId;

    @ApiModelProperty(value = "录入信息人")
    private String operateName;

    @ApiModelProperty(value = "所属居委")
    private String neighborhood;

    @ApiModelProperty(value = "成员姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    public String getGetType() {
        return getType;
    }

    public void setGetType(String getType) {
        this.getType = getType == null ? null : getType.trim();
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public String getPeopleIds() {
        return peopleIds;
    }

    public void setPeopleIds(String peopleIds) {
        this.peopleIds = peopleIds == null ? null : peopleIds.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(Integer insertUserId) {
        this.insertUserId = insertUserId;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}