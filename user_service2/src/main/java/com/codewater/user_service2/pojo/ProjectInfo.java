package com.codewater.user_service2.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * project_info
 * @author 
 */
public class ProjectInfo implements Serializable {
    private String projectId;

    /**
     * 项目名字
     */
    private String projectName;

    /**
     * 项目封面
     */
    private String projectAvatar;

    /**
     * 项目难度
     */
    private Float projectDifficulty;

    /**
     * 项目类型类目编号
     */
    private Integer categoryType;

    /**
     * 项目类型类目名字
     */
    private String categoryName;

    /**
     * 项目进度
     */
    private Integer projectProgress;

    /**
     * 项目状态, 0进行中，1成功，2失败
     */
    private Integer projectStatus;

    /**
     * 项目简介
     */
    private String projectIntroduce;

    /**
     * 项目创建者id
     */
    private String projectCreatorId;

    /**
     * 团队id
     */
    private String teamId;

    /**
     * 项目开始时间
     */
    private Date projectStartDate;

    /**
     * 项目结束时间
     */
    private Date projectEndDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

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

    public String getProjectAvatar() {
        return projectAvatar;
    }

    public void setProjectAvatar(String projectAvatar) {
        this.projectAvatar = projectAvatar;
    }

    public Float getProjectDifficulty() {
        return projectDifficulty;
    }

    public void setProjectDifficulty(Float projectDifficulty) {
        this.projectDifficulty = projectDifficulty;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(Integer projectProgress) {
        this.projectProgress = projectProgress;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectIntroduce() {
        return projectIntroduce;
    }

    public void setProjectIntroduce(String projectIntroduce) {
        this.projectIntroduce = projectIntroduce;
    }

    public String getProjectCreatorId() {
        return projectCreatorId;
    }

    public void setProjectCreatorId(String projectCreatorId) {
        this.projectCreatorId = projectCreatorId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
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
        ProjectInfo other = (ProjectInfo) that;
        return (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getProjectAvatar() == null ? other.getProjectAvatar() == null : this.getProjectAvatar().equals(other.getProjectAvatar()))
            && (this.getProjectDifficulty() == null ? other.getProjectDifficulty() == null : this.getProjectDifficulty().equals(other.getProjectDifficulty()))
            && (this.getCategoryType() == null ? other.getCategoryType() == null : this.getCategoryType().equals(other.getCategoryType()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getProjectProgress() == null ? other.getProjectProgress() == null : this.getProjectProgress().equals(other.getProjectProgress()))
            && (this.getProjectStatus() == null ? other.getProjectStatus() == null : this.getProjectStatus().equals(other.getProjectStatus()))
            && (this.getProjectIntroduce() == null ? other.getProjectIntroduce() == null : this.getProjectIntroduce().equals(other.getProjectIntroduce()))
            && (this.getProjectCreatorId() == null ? other.getProjectCreatorId() == null : this.getProjectCreatorId().equals(other.getProjectCreatorId()))
            && (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getProjectStartDate() == null ? other.getProjectStartDate() == null : this.getProjectStartDate().equals(other.getProjectStartDate()))
            && (this.getProjectEndDate() == null ? other.getProjectEndDate() == null : this.getProjectEndDate().equals(other.getProjectEndDate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getProjectAvatar() == null) ? 0 : getProjectAvatar().hashCode());
        result = prime * result + ((getProjectDifficulty() == null) ? 0 : getProjectDifficulty().hashCode());
        result = prime * result + ((getCategoryType() == null) ? 0 : getCategoryType().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getProjectProgress() == null) ? 0 : getProjectProgress().hashCode());
        result = prime * result + ((getProjectStatus() == null) ? 0 : getProjectStatus().hashCode());
        result = prime * result + ((getProjectIntroduce() == null) ? 0 : getProjectIntroduce().hashCode());
        result = prime * result + ((getProjectCreatorId() == null) ? 0 : getProjectCreatorId().hashCode());
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getProjectStartDate() == null) ? 0 : getProjectStartDate().hashCode());
        result = prime * result + ((getProjectEndDate() == null) ? 0 : getProjectEndDate().hashCode());
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
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectAvatar=").append(projectAvatar);
        sb.append(", projectDifficulty=").append(projectDifficulty);
        sb.append(", categoryType=").append(categoryType);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", projectProgress=").append(projectProgress);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", projectIntroduce=").append(projectIntroduce);
        sb.append(", projectCreatorId=").append(projectCreatorId);
        sb.append(", teamId=").append(teamId);
        sb.append(", projectStartDate=").append(projectStartDate);
        sb.append(", projectEndDate=").append(projectEndDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}