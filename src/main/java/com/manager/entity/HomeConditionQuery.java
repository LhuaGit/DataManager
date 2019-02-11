package com.manager.entity;

import java.util.Date;

/**
 * @author lhua
 * @date 2019/1/29.
 */
public class HomeConditionQuery extends BaseQuery {

    /**
     * 所属居委
     */
    private String neighborhood;

    /**
     * 操作人
     */
    private String operateName;

    /**
     * 家庭类别
     */
    private String homeType;

    private Date createdStart;

    private Date createdEnd;

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
