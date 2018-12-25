package com.codewater.controller.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * team_info
 * @author 
 */
public class TeamInfo implements Serializable {
    /**
     * 团队id
     */
    private String teamId;

    /**
     * 团队名字
     */
    private String teamName;

    /**
     * 团队头像
     */
    private String teamAvatar;

    /**
     * 团队简介
     */
    private String teamIntroduce;

    /**
     * 团队创建者id
     */
    private String teamCreatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamAvatar() {
        return teamAvatar;
    }

    public void setTeamAvatar(String teamAvatar) {
        this.teamAvatar = teamAvatar;
    }

    public String getTeamIntroduce() {
        return teamIntroduce;
    }

    public void setTeamIntroduce(String teamIntroduce) {
        this.teamIntroduce = teamIntroduce;
    }

    public String getTeamCreatorId() {
        return teamCreatorId;
    }

    public void setTeamCreatorId(String teamCreatorId) {
        this.teamCreatorId = teamCreatorId;
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
        TeamInfo other = (TeamInfo) that;
        return (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getTeamName() == null ? other.getTeamName() == null : this.getTeamName().equals(other.getTeamName()))
            && (this.getTeamAvatar() == null ? other.getTeamAvatar() == null : this.getTeamAvatar().equals(other.getTeamAvatar()))
            && (this.getTeamIntroduce() == null ? other.getTeamIntroduce() == null : this.getTeamIntroduce().equals(other.getTeamIntroduce()))
            && (this.getTeamCreatorId() == null ? other.getTeamCreatorId() == null : this.getTeamCreatorId().equals(other.getTeamCreatorId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getTeamName() == null) ? 0 : getTeamName().hashCode());
        result = prime * result + ((getTeamAvatar() == null) ? 0 : getTeamAvatar().hashCode());
        result = prime * result + ((getTeamIntroduce() == null) ? 0 : getTeamIntroduce().hashCode());
        result = prime * result + ((getTeamCreatorId() == null) ? 0 : getTeamCreatorId().hashCode());
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
        sb.append(", teamId=").append(teamId);
        sb.append(", teamName=").append(teamName);
        sb.append(", teamAvatar=").append(teamAvatar);
        sb.append(", teamIntroduce=").append(teamIntroduce);
        sb.append(", teamCreatorId=").append(teamCreatorId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}