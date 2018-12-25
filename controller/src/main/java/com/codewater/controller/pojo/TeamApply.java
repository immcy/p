package com.codewater.controller.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * team_apply
 * @author 
 */
public class TeamApply implements Serializable {
    private Integer id;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 项目名字
     */
    private String projectName;

    /**
     * 项目创建者id
     */
    private String projectCreatorId;

    /**
     * 申请者id
     */
    private String applicantsId;

    /**
     * 申请者姓名
     */
    private String applicantsName;

    /**
     * 申请者头像
     */
    private String applicantsAvatar;

    /**
     * 申请者城市
     */
    private String applicantsCity;

    /**
     * 申请者工作经验, 0:在校生 1:0年 2:1-2年 3:3-5年 4:5-10年 5:10年+
     */
    private Byte applicantsExperience;

    /**
     * 申请的角色，可以与用户本来的角色不同
     */
    private Boolean applicantsRole;

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
     * 申请备注
     */
    private String comments;

    /**
     * 申请审核状态，0待审核，1已通过，2驳回
     */
    private Boolean auditStatus;

    /**
     * 0删除，1正常
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCreatorId() {
        return projectCreatorId;
    }

    public void setProjectCreatorId(String projectCreatorId) {
        this.projectCreatorId = projectCreatorId;
    }

    public String getApplicantsId() {
        return applicantsId;
    }

    public void setApplicantsId(String applicantsId) {
        this.applicantsId = applicantsId;
    }

    public String getApplicantsName() {
        return applicantsName;
    }

    public void setApplicantsName(String applicantsName) {
        this.applicantsName = applicantsName;
    }

    public String getApplicantsAvatar() {
        return applicantsAvatar;
    }

    public void setApplicantsAvatar(String applicantsAvatar) {
        this.applicantsAvatar = applicantsAvatar;
    }

    public String getApplicantsCity() {
        return applicantsCity;
    }

    public void setApplicantsCity(String applicantsCity) {
        this.applicantsCity = applicantsCity;
    }

    public Byte getApplicantsExperience() {
        return applicantsExperience;
    }

    public void setApplicantsExperience(Byte applicantsExperience) {
        this.applicantsExperience = applicantsExperience;
    }

    public Boolean getApplicantsRole() {
        return applicantsRole;
    }

    public void setApplicantsRole(Boolean applicantsRole) {
        this.applicantsRole = applicantsRole;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
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
        TeamApply other = (TeamApply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getProjectCreatorId() == null ? other.getProjectCreatorId() == null : this.getProjectCreatorId().equals(other.getProjectCreatorId()))
            && (this.getApplicantsId() == null ? other.getApplicantsId() == null : this.getApplicantsId().equals(other.getApplicantsId()))
            && (this.getApplicantsName() == null ? other.getApplicantsName() == null : this.getApplicantsName().equals(other.getApplicantsName()))
            && (this.getApplicantsAvatar() == null ? other.getApplicantsAvatar() == null : this.getApplicantsAvatar().equals(other.getApplicantsAvatar()))
            && (this.getApplicantsCity() == null ? other.getApplicantsCity() == null : this.getApplicantsCity().equals(other.getApplicantsCity()))
            && (this.getApplicantsExperience() == null ? other.getApplicantsExperience() == null : this.getApplicantsExperience().equals(other.getApplicantsExperience()))
            && (this.getApplicantsRole() == null ? other.getApplicantsRole() == null : this.getApplicantsRole().equals(other.getApplicantsRole()))
            && (this.getWorkdayStartTime() == null ? other.getWorkdayStartTime() == null : this.getWorkdayStartTime().equals(other.getWorkdayStartTime()))
            && (this.getWorkdayEndTime() == null ? other.getWorkdayEndTime() == null : this.getWorkdayEndTime().equals(other.getWorkdayEndTime()))
            && (this.getWeekendStartTime() == null ? other.getWeekendStartTime() == null : this.getWeekendStartTime().equals(other.getWeekendStartTime()))
            && (this.getWeekendEndTime() == null ? other.getWeekendEndTime() == null : this.getWeekendEndTime().equals(other.getWeekendEndTime()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getProjectCreatorId() == null) ? 0 : getProjectCreatorId().hashCode());
        result = prime * result + ((getApplicantsId() == null) ? 0 : getApplicantsId().hashCode());
        result = prime * result + ((getApplicantsName() == null) ? 0 : getApplicantsName().hashCode());
        result = prime * result + ((getApplicantsAvatar() == null) ? 0 : getApplicantsAvatar().hashCode());
        result = prime * result + ((getApplicantsCity() == null) ? 0 : getApplicantsCity().hashCode());
        result = prime * result + ((getApplicantsExperience() == null) ? 0 : getApplicantsExperience().hashCode());
        result = prime * result + ((getApplicantsRole() == null) ? 0 : getApplicantsRole().hashCode());
        result = prime * result + ((getWorkdayStartTime() == null) ? 0 : getWorkdayStartTime().hashCode());
        result = prime * result + ((getWorkdayEndTime() == null) ? 0 : getWorkdayEndTime().hashCode());
        result = prime * result + ((getWeekendStartTime() == null) ? 0 : getWeekendStartTime().hashCode());
        result = prime * result + ((getWeekendEndTime() == null) ? 0 : getWeekendEndTime().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
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
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectCreatorId=").append(projectCreatorId);
        sb.append(", applicantsId=").append(applicantsId);
        sb.append(", applicantsName=").append(applicantsName);
        sb.append(", applicantsAvatar=").append(applicantsAvatar);
        sb.append(", applicantsCity=").append(applicantsCity);
        sb.append(", applicantsExperience=").append(applicantsExperience);
        sb.append(", applicantsRole=").append(applicantsRole);
        sb.append(", workdayStartTime=").append(workdayStartTime);
        sb.append(", workdayEndTime=").append(workdayEndTime);
        sb.append(", weekendStartTime=").append(weekendStartTime);
        sb.append(", weekendEndTime=").append(weekendEndTime);
        sb.append(", comments=").append(comments);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}