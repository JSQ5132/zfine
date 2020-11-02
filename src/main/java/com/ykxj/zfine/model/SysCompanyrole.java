package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysCompanyrole implements Serializable {
    private String fUserid;

    private String fRoleid;

    private Date fCreatortime;

    private String fCreatoruserid;

    private String fId;

    private static final long serialVersionUID = 1L;

    public String getfUserid() {
        return fUserid;
    }

    public void setfUserid(String fUserid) {
        this.fUserid = fUserid;
    }

    public String getfRoleid() {
        return fRoleid;
    }

    public void setfRoleid(String fRoleid) {
        this.fRoleid = fRoleid;
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

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fUserid=").append(fUserid);
        sb.append(", fRoleid=").append(fRoleid);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", fId=").append(fId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}