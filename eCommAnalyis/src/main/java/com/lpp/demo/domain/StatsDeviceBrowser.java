package com.lpp.demo.domain;

import java.util.Date;

public class StatsDeviceBrowser {
    private Integer platformDimensionId;
    private Integer dateDimensionId;
    private Integer browserDimensionId;
    private Integer activeUsers;
    private Integer newInstallUsers;
    private Integer totalInstallUsers;
    private Integer sessions;
    private Integer sessionsLength;
    private Integer totalMembers;
    private Integer activeMembers;
    private Integer newMembers;
    private Integer pv;
    private Date created;

    public Integer getPlatformDimensionId() {
        return platformDimensionId;
    }

    public void setPlatformDimensionId(Integer platformDimensionId) {
        this.platformDimensionId = platformDimensionId;
    }

    public Integer getDateDimensionId() {
        return dateDimensionId;
    }

    public void setDateDimensionId(Integer dateDimensionId) {
        this.dateDimensionId = dateDimensionId;
    }

    public Integer getBrowserDimensionId() {
        return browserDimensionId;
    }

    public void setBrowserDimensionId(Integer browserDimensionId) {
        this.browserDimensionId = browserDimensionId;
    }

    public Integer getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    public Integer getNewInstallUsers() {
        return newInstallUsers;
    }

    public void setNewInstallUsers(Integer newInstallUsers) {
        this.newInstallUsers = newInstallUsers;
    }

    public Integer getTotalInstallUsers() {
        return totalInstallUsers;
    }

    public void setTotalInstallUsers(Integer totalInstallUsers) {
        this.totalInstallUsers = totalInstallUsers;
    }

    public Integer getSessions() {
        return sessions;
    }

    public void setSessions(Integer sessions) {
        this.sessions = sessions;
    }

    public Integer getSessionsLength() {
        return sessionsLength;
    }

    public void setSessionsLength(Integer sessionsLength) {
        this.sessionsLength = sessionsLength;
    }

    public Integer getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(Integer totalMembers) {
        this.totalMembers = totalMembers;
    }

    public Integer getActiveMembers() {
        return activeMembers;
    }

    public void setActiveMembers(Integer activeMembers) {
        this.activeMembers = activeMembers;
    }

    public Integer getNewMembers() {
        return newMembers;
    }

    public void setNewMembers(Integer newMembers) {
        this.newMembers = newMembers;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
