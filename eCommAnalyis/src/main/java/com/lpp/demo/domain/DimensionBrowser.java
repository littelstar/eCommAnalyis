package com.lpp.demo.domain;

public class DimensionBrowser {
    private  int id;
    private String browser_name;
    private String browser_version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrowser_name() {
        return browser_name;
    }

    public void setBrowser_name(String browser_name) {
        this.browser_name = browser_name;
    }

    public String getBrowser_version() {
        return browser_version;
    }

    public void setBrowser_version(String browser_version) {
        this.browser_version = browser_version;
    }
}
