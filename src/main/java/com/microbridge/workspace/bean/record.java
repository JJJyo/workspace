package com.microbridge.workspace.bean;

public class record {
    private Integer id;

    private String regproname;

    private String regtime;

    private String regopt;

    private String regkey;

    private String regmac;

    private String regip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegproname() {
        return regproname;
    }

    public void setRegproname(String regproname) {
        this.regproname = regproname == null ? null : regproname.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public String getRegopt() {
        return regopt;
    }

    public void setRegopt(String regopt) {
        this.regopt = regopt == null ? null : regopt.trim();
    }

    public String getRegkey() {
        return regkey;
    }

    public void setRegkey(String regkey) {
        this.regkey = regkey == null ? null : regkey.trim();
    }

    public String getRegmac() {
        return regmac;
    }

    public void setRegmac(String regmac) {
        this.regmac = regmac == null ? null : regmac.trim();
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }
}