package com.ykxj.zfine.model;

import java.io.Serializable;

public class Usercache implements Serializable {
    private Integer tId;

    private String fAccount;

    private String fOpenid;

    private String fPhone;

    private String duetime;

    private String logintime;

    private String lastlogintime;

    private String fId;

    private String isinfo;

    private String infoOpenid;

    private String unionid;

    private String gzhOpenid;

    private String fRealname;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getfAccount() {
        return fAccount;
    }

    public void setfAccount(String fAccount) {
        this.fAccount = fAccount;
    }

    public String getfOpenid() {
        return fOpenid;
    }

    public void setfOpenid(String fOpenid) {
        this.fOpenid = fOpenid;
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public String getDuetime() {
        return duetime;
    }

    public void setDuetime(String duetime) {
        this.duetime = duetime;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getIsinfo() {
        return isinfo;
    }

    public void setIsinfo(String isinfo) {
        this.isinfo = isinfo;
    }

    public String getInfoOpenid() {
        return infoOpenid;
    }

    public void setInfoOpenid(String infoOpenid) {
        this.infoOpenid = infoOpenid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getGzhOpenid() {
        return gzhOpenid;
    }

    public void setGzhOpenid(String gzhOpenid) {
        this.gzhOpenid = gzhOpenid;
    }

    public String getfRealname() {
        return fRealname;
    }

    public void setfRealname(String fRealname) {
        this.fRealname = fRealname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", fAccount=").append(fAccount);
        sb.append(", fOpenid=").append(fOpenid);
        sb.append(", fPhone=").append(fPhone);
        sb.append(", duetime=").append(duetime);
        sb.append(", logintime=").append(logintime);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", fId=").append(fId);
        sb.append(", isinfo=").append(isinfo);
        sb.append(", infoOpenid=").append(infoOpenid);
        sb.append(", unionid=").append(unionid);
        sb.append(", gzhOpenid=").append(gzhOpenid);
        sb.append(", fRealname=").append(fRealname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}