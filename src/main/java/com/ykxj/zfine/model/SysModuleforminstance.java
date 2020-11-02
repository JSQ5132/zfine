package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysModuleforminstance implements Serializable {
    private String fId;

    private String fFormid;

    private String fObjectid;

    private Integer fSortcode;

    private Date fCreatortime;

    private String fCreatoruserid;

    private String fInstancejson;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfFormid() {
        return fFormid;
    }

    public void setfFormid(String fFormid) {
        this.fFormid = fFormid;
    }

    public String getfObjectid() {
        return fObjectid;
    }

    public void setfObjectid(String fObjectid) {
        this.fObjectid = fObjectid;
    }

    public Integer getfSortcode() {
        return fSortcode;
    }

    public void setfSortcode(Integer fSortcode) {
        this.fSortcode = fSortcode;
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

    public String getfInstancejson() {
        return fInstancejson;
    }

    public void setfInstancejson(String fInstancejson) {
        this.fInstancejson = fInstancejson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fFormid=").append(fFormid);
        sb.append(", fObjectid=").append(fObjectid);
        sb.append(", fSortcode=").append(fSortcode);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", fInstancejson=").append(fInstancejson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}