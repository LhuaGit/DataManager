package com.manager.model;

import java.util.Date;

public class HomeCondition {
    private Integer id;

    private String neighborhood;

    private Integer num;

    private String registryAddress;

    private String registryCondition;

    private String phone;

    private String liveAddress;

    private String difficut;

    private String type;

    private String low;

    private String lowMoney;

    private String lowIn;

    private String specPoor;

    private String specPoorMoney;

    private String specPoorOut;

    private String poorChild;

    private String poorChildMoney;

    private String disabledMan;

    private String disabledManMoney;

    private String lowRent;

    private String lowRentMoney;

    private String ownHouse;

    private String ownOutHouse;

    private String ownCar;

    private String inquireGoal;

    private String inquireCondition;

    private String operateName;

    private Integer insertUserId;

    private Date created;

    private Date modified;

    private Integer enbale;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public Integer getEnbale() {
        return enbale;
    }

    public void setEnbale(Integer enbale) {
        this.enbale = enbale;
    }
}