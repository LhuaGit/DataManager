package com.manager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "homeCondition", description = "包含成员家庭信息")
public class HomeCondition {
    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "所属居委")
    private String neighborhood;
    @ApiModelProperty(value = "户籍人数")
    private Integer num;
    @ApiModelProperty(value = "户籍地址")
    private String registryAddress;
    @ApiModelProperty(value = "户籍情况")
    private String registryCondition;
    @ApiModelProperty(value = "联系电话")
    private String phone;
    @ApiModelProperty(value = "居住地址")
    private String liveAddress;
    @ApiModelProperty(value = "困难程度")
    private String difficut;
    @ApiModelProperty(value = "家庭类别")
    private String homeType;
    @ApiModelProperty(value = "是否低保，1：是，0：不是")
    private String low;
    @ApiModelProperty(value = "低保金额")
    private String lowMoney;
    @ApiModelProperty(value = "低收入，1：是，0:不是")
    private String lowIn;
    @ApiModelProperty(value = "是否特困，1：是")
    private String specPoor;
    @ApiModelProperty(value = "特困金额")
    private String specPoorMoney;
    @ApiModelProperty(value = "支出型特困，1：是")
    private String specPoorOut;
    @ApiModelProperty(value = "是否有特困儿童，1：是")
    private String poorChild;
    @ApiModelProperty(value = "困境儿童金额")
    private String poorChildMoney;
    @ApiModelProperty(value = "是否是残疾人，1：是")
    private String disabledMan;
    @ApiModelProperty(value = "残疾补贴金额")
    private String disabledManMoney;
    @ApiModelProperty(value = "是否是廉租房")
    private String lowRent;
    @ApiModelProperty(value = "廉租房金额")
    private String lowRentMoney;
    @ApiModelProperty(value = "是否是自有住房，1：是")
    private String ownHouse;
    @ApiModelProperty(value = "是否自有非居住类房，1：是")
    private String ownOutHouse;
    @ApiModelProperty(value = "是否自有机动车，1：是")
    private String ownCar;
    @ApiModelProperty(value = "调查目的")
    private String inquireGoal;
    @ApiModelProperty(value = "调查情况")
    private String inquireCondition;
    @ApiModelProperty(value = "操作人=录入人")
    private String operateName;
    @ApiModelProperty(value = "插入记录人")
    private Integer insertUserId;
    @ApiModelProperty(value = "创建时间，无需传递")
    private Date created;
    @ApiModelProperty(value = "修改时间，无需传递")
    private Date modified;
    @ApiModelProperty(value = "是有有效，1：有效")
    private Integer enable;
    @ApiModelProperty(value = "多个成员")
    private List<PeopleCondition> peopleConditionList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood == null ? null : neighborhood.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress == null ? null : registryAddress.trim();
    }

    public String getRegistryCondition() {
        return registryCondition;
    }

    public void setRegistryCondition(String registryCondition) {
        this.registryCondition = registryCondition == null ? null : registryCondition.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress == null ? null : liveAddress.trim();
    }

    public String getDifficut() {
        return difficut;
    }

    public void setDifficut(String difficut) {
        this.difficut = difficut == null ? null : difficut.trim();
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low == null ? null : low.trim();
    }

    public String getLowMoney() {
        return lowMoney;
    }

    public void setLowMoney(String lowMoney) {
        this.lowMoney = lowMoney == null ? null : lowMoney.trim();
    }

    public String getLowIn() {
        return lowIn;
    }

    public void setLowIn(String lowIn) {
        this.lowIn = lowIn == null ? null : lowIn.trim();
    }

    public String getSpecPoor() {
        return specPoor;
    }

    public void setSpecPoor(String specPoor) {
        this.specPoor = specPoor == null ? null : specPoor.trim();
    }

    public String getSpecPoorMoney() {
        return specPoorMoney;
    }

    public void setSpecPoorMoney(String specPoorMoney) {
        this.specPoorMoney = specPoorMoney == null ? null : specPoorMoney.trim();
    }

    public String getSpecPoorOut() {
        return specPoorOut;
    }

    public void setSpecPoorOut(String specPoorOut) {
        this.specPoorOut = specPoorOut == null ? null : specPoorOut.trim();
    }

    public String getPoorChild() {
        return poorChild;
    }

    public void setPoorChild(String poorChild) {
        this.poorChild = poorChild == null ? null : poorChild.trim();
    }

    public String getPoorChildMoney() {
        return poorChildMoney;
    }

    public void setPoorChildMoney(String poorChildMoney) {
        this.poorChildMoney = poorChildMoney == null ? null : poorChildMoney.trim();
    }

    public String getDisabledMan() {
        return disabledMan;
    }

    public void setDisabledMan(String disabledMan) {
        this.disabledMan = disabledMan == null ? null : disabledMan.trim();
    }

    public String getDisabledManMoney() {
        return disabledManMoney;
    }

    public void setDisabledManMoney(String disabledManMoney) {
        this.disabledManMoney = disabledManMoney == null ? null : disabledManMoney.trim();
    }

    public String getLowRent() {
        return lowRent;
    }

    public void setLowRent(String lowRent) {
        this.lowRent = lowRent == null ? null : lowRent.trim();
    }

    public String getLowRentMoney() {
        return lowRentMoney;
    }

    public void setLowRentMoney(String lowRentMoney) {
        this.lowRentMoney = lowRentMoney == null ? null : lowRentMoney.trim();
    }

    public String getOwnHouse() {
        return ownHouse;
    }

    public void setOwnHouse(String ownHouse) {
        this.ownHouse = ownHouse == null ? null : ownHouse.trim();
    }

    public String getOwnOutHouse() {
        return ownOutHouse;
    }

    public void setOwnOutHouse(String ownOutHouse) {
        this.ownOutHouse = ownOutHouse == null ? null : ownOutHouse.trim();
    }

    public String getOwnCar() {
        return ownCar;
    }

    public void setOwnCar(String ownCar) {
        this.ownCar = ownCar == null ? null : ownCar.trim();
    }

    public String getInquireGoal() {
        return inquireGoal;
    }

    public void setInquireGoal(String inquireGoal) {
        this.inquireGoal = inquireGoal == null ? null : inquireGoal.trim();
    }

    public String getInquireCondition() {
        return inquireCondition;
    }

    public void setInquireCondition(String inquireCondition) {
        this.inquireCondition = inquireCondition == null ? null : inquireCondition.trim();
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public Integer getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(Integer insertUserId) {
        this.insertUserId = insertUserId;
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

    public List<PeopleCondition> getPeopleConditionList() {
        return peopleConditionList;
    }

    public void setPeopleConditionList(List<PeopleCondition> peopleConditionList) {
        this.peopleConditionList = peopleConditionList;
    }
}