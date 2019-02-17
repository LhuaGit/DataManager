package com.manager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "成员信息", description = "成员信息")
public class PeopleCondition {
    @ApiModelProperty(value = "主键id")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "身份证")
    private String idcard;
    @ApiModelProperty(value = "生日")
    private Date birthday;
    @ApiModelProperty(value = "与申请人的关系")
    private String relation;
    @ApiModelProperty(value = "户籍性质")
    private String registryQuality;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "是否是人户分离 ，1：是")
    private String leave;
    @ApiModelProperty(value = "文化程度")
    private String education;
    @ApiModelProperty(value = "民族")
    private String nation;
    @ApiModelProperty(value = "户籍地址")
    private String registryAddress;
    @ApiModelProperty(value = "联系电话")
    private String phone;
    @ApiModelProperty(value = "居住地址")
    private String liveAddress;
    @ApiModelProperty(value = "婚姻")
    private String marriage;
    @ApiModelProperty(value = "就业")
    private String job;
    @ApiModelProperty(value = "工作地址")
    private String jobAddress;
    @ApiModelProperty(value = "是否学生,1：是")
    private String student;
    @ApiModelProperty(value = "学校地址")
    private String schoolAddress;
    @ApiModelProperty(value = "助学结对")
    private String assistanceCouple;
    @ApiModelProperty(value = "名称")
    private String coupleName;
    @ApiModelProperty(value = "金额")
    private String coupleMoney;
    @ApiModelProperty(value = "人员类别 刑释解教/戒毒")
    private String peopleType;
    @ApiModelProperty(value = "户主姓名")
    private String homeName;
    @ApiModelProperty(value = "是否是户主,1是")
    private String homeMan;
    @ApiModelProperty(value = "总收入")
    private String inMoney;
    @ApiModelProperty(value = "工资收入")
    private String workMoney;
    @ApiModelProperty(value = "养老金")
    private String oldMoney;
    @ApiModelProperty(value = "享受政策")
    private String enjoy;
    @ApiModelProperty(value = "医疗保险")
    private String healthInsurance;
    @ApiModelProperty(value = "居民保险")
    private String homeInsurance;
    @ApiModelProperty(value = "互助帮扶保险")
    private String helpInsurance;
    @ApiModelProperty(value = "城镇职工养老保险")
    private String workOldInsurance;
    @ApiModelProperty(value = "健康状况")
    private String health;
    @ApiModelProperty(value = "重大疾病 恶性肿瘤/尿毒症/精神病（下拉框）")
    private String bigSickness;
    @ApiModelProperty(value = "残疾状况")
    private String poorHealth;
    @ApiModelProperty(value = "残疾等级")
    private String poorRank;
    @ApiModelProperty(value = "家庭信息id")
    private Integer homeConditionId;
    @ApiModelProperty(value = "操作人")
    private String operateName;
    @ApiModelProperty(value = "插入人id")
    private Integer insertUserId;
    @ApiModelProperty(value = "创建时间")
    private Date created;
    @ApiModelProperty(value = "修改时间")
    private Date modified;
    @ApiModelProperty(value = "是否有效")
    private Integer enable = 1;

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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getRegistryQuality() {
        return registryQuality;
    }

    public void setRegistryQuality(String registryQuality) {
        this.registryQuality = registryQuality == null ? null : registryQuality.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave == null ? null : leave.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress == null ? null : registryAddress.trim();
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

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress == null ? null : jobAddress.trim();
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress == null ? null : schoolAddress.trim();
    }

    public String getAssistanceCouple() {
        return assistanceCouple;
    }

    public void setAssistanceCouple(String assistanceCouple) {
        this.assistanceCouple = assistanceCouple == null ? null : assistanceCouple.trim();
    }

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String coupleName) {
        this.coupleName = coupleName == null ? null : coupleName.trim();
    }

    public String getCoupleMoney() {
        return coupleMoney;
    }

    public void setCoupleMoney(String coupleMoney) {
        this.coupleMoney = coupleMoney == null ? null : coupleMoney.trim();
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType == null ? null : peopleType.trim();
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName == null ? null : homeName.trim();
    }

    public String getHomeMan() {
        return homeMan;
    }

    public void setHomeMan(String homeMan) {
        this.homeMan = homeMan == null ? null : homeMan.trim();
    }

    public String getInMoney() {
        return inMoney;
    }

    public void setInMoney(String inMoney) {
        this.inMoney = inMoney == null ? null : inMoney.trim();
    }

    public String getWorkMoney() {
        return workMoney;
    }

    public void setWorkMoney(String workMoney) {
        this.workMoney = workMoney == null ? null : workMoney.trim();
    }

    public String getOldMoney() {
        return oldMoney;
    }

    public void setOldMoney(String oldMoney) {
        this.oldMoney = oldMoney == null ? null : oldMoney.trim();
    }

    public String getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(String enjoy) {
        this.enjoy = enjoy == null ? null : enjoy.trim();
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance == null ? null : healthInsurance.trim();
    }

    public String getHomeInsurance() {
        return homeInsurance;
    }

    public void setHomeInsurance(String homeInsurance) {
        this.homeInsurance = homeInsurance == null ? null : homeInsurance.trim();
    }

    public String getHelpInsurance() {
        return helpInsurance;
    }

    public void setHelpInsurance(String helpInsurance) {
        this.helpInsurance = helpInsurance == null ? null : helpInsurance.trim();
    }

    public String getWorkOldInsurance() {
        return workOldInsurance;
    }

    public void setWorkOldInsurance(String workOldInsurance) {
        this.workOldInsurance = workOldInsurance == null ? null : workOldInsurance.trim();
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    public String getBigSickness() {
        return bigSickness;
    }

    public void setBigSickness(String bigSickness) {
        this.bigSickness = bigSickness == null ? null : bigSickness.trim();
    }

    public String getPoorHealth() {
        return poorHealth;
    }

    public void setPoorHealth(String poorHealth) {
        this.poorHealth = poorHealth == null ? null : poorHealth.trim();
    }

    public String getPoorRank() {
        return poorRank;
    }

    public void setPoorRank(String poorRank) {
        this.poorRank = poorRank == null ? null : poorRank.trim();
    }

    public Integer getHomeConditionId() {
        return homeConditionId;
    }

    public void setHomeConditionId(Integer homeConditionId) {
        this.homeConditionId = homeConditionId;
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
}