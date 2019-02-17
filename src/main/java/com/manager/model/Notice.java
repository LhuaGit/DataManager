package com.manager.model;

import java.util.Date;

public class Notice {
    private Integer id;

    private String name;

    private String numId;

    private String sendDept;

    private String dealDept;

    private String adjustDesc;

    private String neighborhood;

    private String money;

    private String fileUrl;

    private Date created;

    private Date modified;

    private String enable;

    private Integer insertUserId;

    private Integer status;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId == null ? null : numId.trim();
    }

    public String getSendDept() {
        return sendDept;
    }

    public void setSendDept(String sendDept) {
        this.sendDept = sendDept == null ? null : sendDept.trim();
    }

    public String getDealDept() {
        return dealDept;
    }

    public void setDealDept(String dealDept) {
        this.dealDept = dealDept == null ? null : dealDept.trim();
    }

    public String getAdjustDesc() {
        return adjustDesc;
    }

    public void setAdjustDesc(String adjustDesc) {
        this.adjustDesc = adjustDesc == null ? null : adjustDesc.trim();
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood == null ? null : neighborhood.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
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

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public Integer getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(Integer insertUserId) {
        this.insertUserId = insertUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}