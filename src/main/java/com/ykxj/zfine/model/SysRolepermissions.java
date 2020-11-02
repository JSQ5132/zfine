package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysRolepermissions implements Serializable {
    private String fId;

    private Integer fItemtype;

    private String fAppid;

    private String fItemid;

    private String fObjectid;

    private Date fCreatortime;

    private String fCreatoruserid;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public Integer getfItemtype() {
        return fItemtype;
    }

    public void setfItemtype(Integer fItemtype) {
        this.fItemtype = fItemtype;
    }

    public String getfAppid() {
        return fAppid;
    }

    public void setfAppid(String fAppid) {
        this.fAppid = fAppid;
    }

    public String getfItemid() {
        return fItemid;
    }

    public void setfItemid(String fItemid) {
        this.fItemid = fItemid;
    }

    public String getfObjectid() {
        return fObjectid;
    }

    public void setfObjectid(String fObjectid) {
        this.fObjectid = fObjectid;
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
        sb.append(", fItemtype=").append(fItemtype);
        sb.append(", fAppid=").append(fAppid);
        sb.append(", fItemid=").append(fItemid);
        sb.append(", fObjectid=").append(fObjectid);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}