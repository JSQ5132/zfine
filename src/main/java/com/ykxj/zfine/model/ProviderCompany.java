package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class ProviderCompany implements Serializable {
    private String fId;

    private String fUserid;

    private String appid;

    private String token;

    private String code;

    private String name;

    private Boolean fDeletemark;

    private String fDescription;

    private Date fCreatortime;

    private String fCreatoruserid;

    private Date fLastmodifytime;

    private String fLastmodifyuserid;

    private Date fDeletetime;

    private String fDeleteuserid;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfUserid() {
        return fUserid;
    }

    public void setfUserid(String fUserid) {
        this.fUserid = fUserid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getfDeletemark() {
        return fDeletemark;
    }

    public void setfDeletemark(Boolean fDeletemark) {
        this.fDeletemark = fDeletemark;
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription;
    }

    public Date getfCreatortime() {
        return fCreatortime;
    }

    public void setfCreatortime(Date fCreatortime) {
        this.fCreatortime = fCreatortime;
    }

    public String getfCreatoruserid() {
        return fCreatoruserid;
    }

    public void setfCreatoruserid(String fCreatoruserid) {
        this.fCreatoruserid = fCreatoruserid;
    }

    public Date getfLastmodifytime() {
        return fLastmodifytime;
    }

    public void setfLastmodifytime(Date fLastmodifytime) {
        this.fLastmodifytime = fLastmodifytime;
    }

    public String getfLastmodifyuserid() {
        return fLastmodifyuserid;
    }

    public void setfLastmodifyuserid(String fLastmodifyuserid) {
        this.fLastmodifyuserid = fLastmodifyuserid;
    }

    public Date getfDeletetime() {
        return fDeletetime;
    }

    public void setfDeletetime(Date fDeletetime) {
        this.fDeletetime = fDeletetime;
    }

    public String getfDeleteuserid() {
        return fDeleteuserid;
    }

    public void setfDeleteuserid(String fDeleteuserid) {
        this.fDeleteuserid = fDeleteuserid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fUserid=").append(fUserid);
        sb.append(", appid=").append(appid);
        sb.append(", token=").append(token);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", fDeletemark=").append(fDeletemark);
        sb.append(", fDescription=").append(fDescription);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", fLastmodifytime=").append(fLastmodifytime);
        sb.append(", fLastmodifyuserid=").append(fLastmodifyuserid);
        sb.append(", fDeletetime=").append(fDeletetime);
        sb.append(", fDeleteuserid=").append(fDeleteuserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}