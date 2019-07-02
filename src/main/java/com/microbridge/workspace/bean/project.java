package com.microbridge.workspace.bean;

public class project {
    private String projectid;

    private String projectname;

    private String projecthash;

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjecthash() {
        return projecthash;
    }

    public void setProjecthash(String projecthash) {
        this.projecthash = projecthash == null ? null : projecthash.trim();
    }
}