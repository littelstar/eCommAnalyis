package com.lpp.demo.domain;

import java.util.Date;

public class StatsDeviceLocation {
    private int dateDimensionId;
    private int platformDimensionId;
    private int locationDimensionId;
    private int activeUsers;
    private int sessions;
    private int bounceSessions;
    private Date created;

    public int getDateDimensionId() {
        return dateDimensionId;
    }

    public void setDateDimensionId(int dateDimensionId) {
        this.dateDimensionId = dateDimensionId;
    }

    public int getPlatformDimensionId() {
        return platformDimensionId;
    }

    public void setPlatformDimensionId(int platformDimensionId) {
        this.platformDimensionId = platformDimensionId;
    }

    public int getLocationDimensionId() {
        return locationDimensionId;
    }

    public void setLocationDimensionId(int locationDimensionId) {
        this.locationDimensionId = locationDimensionId;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(int activeUsers) {
        this.activeUsers = activeUsers;
    }

    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public int getBounceSessions() {
        return bounceSessions;
    }

    public void setBounceSessions(int bounceSessions) {
        this.bounceSessions = bounceSessions;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
