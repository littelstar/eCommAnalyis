package com.lpp.demo.domain;

import java.util.Date;

public class StatsEvent {
    private Integer platformDimensionId;
    private Integer dateDimensionId;
    private Integer event_dimension_id;
    private Integer times;
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

    public Integer getEvent_dimension_id() {
        return event_dimension_id;
    }

    public void setEvent_dimension_id(Integer event_dimension_id) {
        this.event_dimension_id = event_dimension_id;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
