package com.microbridge.workspace.bean;

public class license {
    private String licenseid;

    private String projectid;

    private Integer runday;

    private Integer regnum;

    private String options;

    public license() {
        super();
    }

    public license(String licenseid, String projectid, Integer runday, Integer regnum, String options) {
        super();
        this.licenseid = licenseid;
        this.projectid = projectid;
        this.runday = runday;
        this.regnum = regnum;
        this.options = options;
    }

    @Override
    public String toString(){
        return "licenseid = " + licenseid + " projectid =" + projectid + " runday="+
                runday;
    }
    public String getLicenseid() {
        return licenseid;
    }

    public void setLicenseid(String licenseid) {
        this.licenseid = licenseid == null ? null : licenseid.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public Integer getRunday() {
        return runday;
    }

    public void setRunday(Integer runday) {
        this.runday = runday;
    }

    public Integer getRegnum() {
        return regnum;
    }

    public void setRegnum(Integer regnum) {
        this.regnum = regnum;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }
}