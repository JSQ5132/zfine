package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private String fId;

    private Date fDate;

    private String fAccount;

    private String fNickname;

    private String fType;

    private String fIpaddress;

    private String fIpaddressname;

    private String fModuleid;

    private String fModulename;

    private Boolean fResult;

    private String fDescription;

    private Date fCreatortime;

    private String fCreatoruserid;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public String getfAccount() {
        return fAccount;
    }

    public void setfAccount(String fAccount) {
        this.fAccount = fAccount;
    }

    public String getfNickname() {
        return fNickname;
    }

    public void setfNickname(String fNickname) {
        this.fNickname = fNickname;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getfIpaddress() {
        return fIpaddress;
    }

    public void setfIpaddress(String fIpaddress) {
        this.fIpaddress = fIpaddress;
    }

    public String getfIpaddressname() {
        return fIpaddressname;
    }

    public void setfIpaddressname(String fIpaddressname) {
        this.fIpaddressname = fIpaddressname;
    }

    public String getfModuleid() {
        return fModuleid;
    }

    public void setfModuleid(String fModuleid) {
        this.fModuleid = fModuleid;
    }

    public String getfModulename() {
        return fModulename;
    }

    public void setfModulename(String fModulename) {
        this.fModulename = fModulename;
    }

    public Boolean getfResult() {
        return fResult;
    }

    public void setfResult(Boolean fResult) {
        this.fResult = fResult;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fDate=").append(fDate);
        sb.append(", fAccount=").append(fAccount);
        sb.append(", fNickname=").append(fNickname);
        sb.append(", fType=").append(fType);
        sb.append(", fIpaddress=").append(fIpaddress);
        sb.append(", fIpaddressname=").append(fIpaddressname);
        sb.append(", fModuleid=").append(fModuleid);
        sb.append(", fModulename=").append(fModulename);
        sb.append(", fResult=").append(fResult);
        sb.append(", fDescription=").append(fDescription);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}