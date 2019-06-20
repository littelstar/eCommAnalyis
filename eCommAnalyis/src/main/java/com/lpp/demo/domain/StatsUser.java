package com.lpp.demo.domain;

import java.util.Date;

public class StatsUser {
    private int date_dimension_id;
    private int platform_dimension_id;
    private int active_users;
    private int new_install_users;
    private int total_install_users;
    private int sessions;
    private int sessions_length;
    private int total_members;
    private int active_members;
    private int new_members;
    private Date date;
    public int getDate_dimension_id() {
        return date_dimension_id;
    }

    public void setDate_dimension_id(int date_dimension_id) {
        this.date_dimension_id = date_dimension_id;
    }

    public int getPlatform_dimension_id() {
        return platform_dimension_id;
    }

    public void setPlatform_dimension_id(int platform_dimension_id) {
        this.platform_dimension_id = platform_dimension_id;
    }

    public int getActive_users() {
        return active_users;
    }

    public void setActive_users(int active_users) {
        this.active_users = active_users;
    }

    public int getNew_install_users() {
        return new_install_users;
    }

    public void setNew_install_users(int new_install_users) {
        this.new_install_users = new_install_users;
    }

    public int getTotal_install_users() {
        return total_install_users;
    }

    public void setTotal_install_users(int total_install_users) {
        this.total_install_users = total_install_users;
    }

    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public int getSessions_length() {
        return sessions_length;
    }

    public void setSessions_length(int sessions_length) {
        this.sessions_length = sessions_length;
    }

    public int getTotal_members() {
        return total_members;
    }

    public void setTotal_members(int total_members) {
        this.total_members = total_members;
    }

    public int getActive_members() {
        return active_members;
    }

    public void setActive_members(int active_members) {
        this.active_members = active_members;
    }

    public int getNew_members() {
        return new_members;
    }

    public void setNew_members(int new_members) {
        this.new_members = new_members;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
