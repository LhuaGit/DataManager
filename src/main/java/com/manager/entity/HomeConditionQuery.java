package com.manager.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author lhua
 * @date 2019/1/29.
 */
@ApiModel(value = "查询家庭信息表单")
public class HomeConditionQuery extends BaseQuery {

    /**
     * 所属居委
     */
    @ApiModelProperty(value = "所属居委")
    private String neighborhood;

    /**
     * 操作人
     */
    @ApiModelProperty(value = "操作人=录入人")
    private String operateName;

    /**
     * 家庭类别
     */
    @ApiModelProperty(value = "家庭类别")
    private String homeType;

    @ApiModelProperty(value = "开始时间")
    private Date createdStart;

    @ApiModelProperty(value = "结束时间")
    private Date createdEnd;

    @ApiModelProperty(value = "查询家庭成员时使用，传入家庭id")
    private Integer homeId;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public Date getCreatedStart() {
        return createdStart;
    }

    public void setCreatedStart(Date createdStart) {
        this.createdStart = createdStart;
    }

    public Date getCreatedEnd() {
        return createdEnd;
    }

    public void setCreatedEnd(Date createdEnd) {
        this.createdEnd = createdEnd;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }
}
