package com.codewater.user_service2.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * user_info
 * @author 
 */
public class UserInfo implements Serializable {
    private String id;

    private String name;

    private String password;

    /**
     * 性别，0未知 1男 2女
     */
    private Boolean sex;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * qq的id
     */
    private String qqId;

    /**
     * 角色 0未知
     */
    private Boolean role;

    /**
     * 城市
     */
    private String city;

    /**
     * 工作经验, 0:在校生 1:0年 2:1-2年 3:3-5年 4:5-10年 5:10年+
     */
    private Byte experience;

    /**
     * 技能
     */
    private String skill;

    /**
     * 工作日空闲开始时间
     */
    private Date workdayStartTime;

    /**
     * 工作日空闲结束时间
     */
    private Date workdayEndTime;

    /**
     * 周末空闲结束时间
     */
    private Date weekendStartTime;

    /**
     * 周末空闲结束时间
     */
    private Date weekendEndTime;

    /**
     * 影响力
     */
    private Integer influence;

    /**
     * 赞的数量
     */
    private Integer likeNum;

    /**
     * 个人简介
     */
    private String introduce;

    /**
     * 用户状态，0已注销 1正常
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Byte getExperience() {
        return experience;
    }

    public void setExperience(Byte experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Date getWorkdayStartTime() {
        return workdayStartTime;
    }

    public void setWorkdayStartTime(Date workdayStartTime) {
        this.workdayStartTime = workdayStartTime;
    }

    public Date getWorkdayEndTime() {
        return workdayEndTime;
    }

    public void setWorkdayEndTime(Date workdayEndTime) {
        this.workdayEndTime = workdayEndTime;
    }

    public Date getWeekendStartTime() {
        return weekendStartTime;
    }

    public void setWeekendStartTime(Date weekendStartTime) {
        this.weekendStartTime = weekendStartTime;
    }

    public Date getWeekendEndTime() {
        return weekendEndTime;
    }

    public void setWeekendEndTime(Date weekendEndTime) {
        this.weekendEndTime = weekendEndTime;
    }

    public Integer getInfluence() {
        return influence;
    }

    public void setInfluence(Integer influence) {
        this.influence = influence;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getQqId() == null ? other.getQqId() == null : this.getQqId().equals(other.getQqId()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getExperience() == null ? other.getExperience() == null : this.getExperience().equals(other.getExperience()))
            && (this.getSkill() == null ? other.getSkill() == null : this.getSkill().equals(other.getSkill()))
            && (this.getWorkdayStartTime() == null ? other.getWorkdayStartTime() == null : this.getWorkdayStartTime().equals(other.getWorkdayStartTime()))
            && (this.getWorkdayEndTime() == null ? other.getWorkdayEndTime() == null : this.getWorkdayEndTime().equals(other.getWorkdayEndTime()))
            && (this.getWeekendStartTime() == null ? other.getWeekendStartTime() == null : this.getWeekendStartTime().equals(other.getWeekendStartTime()))
            && (this.getWeekendEndTime() == null ? other.getWeekendEndTime() == null : this.getWeekendEndTime().equals(other.getWeekendEndTime()))
            && (this.getInfluence() == null ? other.getInfluence() == null : this.getInfluence().equals(other.getInfluence()))
            && (this.getLikeNum() == null ? other.getLikeNum() == null : this.getLikeNum().equals(other.getLikeNum()))
            && (this.getIntroduce() == null ? other.getIntroduce() == null : this.getIntroduce().equals(other.getIntroduce()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getQqId() == null) ? 0 : getQqId().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getExperience() == null) ? 0 : getExperience().hashCode());
        result = prime * result + ((getSkill() == null) ? 0 : getSkill().hashCode());
        result = prime * result + ((getWorkdayStartTime() == null) ? 0 : getWorkdayStartTime().hashCode());
        result = prime * result + ((getWorkdayEndTime() == null) ? 0 : getWorkdayEndTime().hashCode());
        result = prime * result + ((getWeekendStartTime() == null) ? 0 : getWeekendStartTime().hashCode());
        result = prime * result + ((getWeekendEndTime() == null) ? 0 : getWeekendEndTime().hashCode());
        result = prime * result + ((getInfluence() == null) ? 0 : getInfluence().hashCode());
        result = prime * result + ((getLikeNum() == null) ? 0 : getLikeNum().hashCode());
        result = prime * result + ((getIntroduce() == null) ? 0 : getIntroduce().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", openid=").append(openid);
        sb.append(", qqId=").append(qqId);
        sb.append(", role=").append(role);
        sb.append(", city=").append(city);
        sb.append(", experience=").append(experience);
        sb.append(", skill=").append(skill);
        sb.append(", workdayStartTime=").append(workdayStartTime);
        sb.append(", workdayEndTime=").append(workdayEndTime);
        sb.append(", weekendStartTime=").append(weekendStartTime);
        sb.append(", weekendEndTime=").append(weekendEndTime);
        sb.append(", influence=").append(influence);
        sb.append(", likeNum=").append(likeNum);
        sb.append(", introduce=").append(introduce);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}