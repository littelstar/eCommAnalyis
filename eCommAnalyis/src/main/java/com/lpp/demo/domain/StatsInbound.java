package com.lpp.demo.domain;

import java.util.Date;

public class StatsInbound {
    private Integer platformDimensionId;
    private Integer dateDimensionId;
    private Integer inboundDimensionId;
    private Integer activeUsers;
    private Integer sessions;
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

    public Integer getInboundDimensionId() {
        return inboundDimensionId;
    }

    public void setInboundDimensionId(Integer inboundDimensionId) {
        this.inboundDimensionId = inboundDimensionId;
    }

    public Integer getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    public Integer getSessions() {
        return sessions;
    }

    public void setSessions(Integer sessions) {
        this.sessions = sessions;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
