package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysItemsdetail implements Serializable {
    private String fId;

    private String fItemid;

    private String fParentid;

    private String fItemcode;

    private String fItemname;

    private String fSimplespelling;

    private Boolean fIsdefault;

    private Integer fLayers;

    private Integer fSortcode;

    private Boolean fDeletemark;

    private Boolean fEnabledmark;

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

    public String getfItemid() {
        return fItemid;
    }

    public void setfItemid(String fItemid) {
        this.fItemid = fItemid;
    }

    public String getfParentid() {
        return fParentid;
    }

    public void setfParentid(String fParentid) {
        this.fParentid = fParentid;
    }

    public String getfItemcode() {
        return fItemcode;
    }

    public void setfItemcode(String fItemcode) {
        this.fItemcode = fItemcode;
    }

    public String getfItemname() {
        return fItemname;
    }

    public void setfItemname(String fItemname) {
        this.fItemname = fItemname;
    }

    public String getfSimplespelling() {
        return fSimplespelling;
    }

    public void setfSimplespelling(String fSimplespelling) {
        this.fSimplespelling = fSimplespelling;
    }

    public Boolean getfIsdefault() {
        return fIsdefault;
    }

    public void setfIsdefault(Boolean fIsdefault) {
        this.fIsdefault = fIsdefault;
    }

    public Integer getfLayers() {
        return fLayers;
    }

    public void setfLayers(Integer fLayers) {
        this.fLayers = fLayers;
    }

    public Integer getfSortcode() {
        return fSortcode;
    }

    public void setfSortcode(Integer fSortcode) {
        this.fSortcode = fSortcode;
    }

    public Boolean getfDeletemark() {
        return fDeletemark;
    }

    public void setfDeletemark(Boolean fDeletemark) {
        this.fDeletemark = fDeletemark;
    }

    public Boolean getfEnabledmark() {
        return fEnabledmark;
    }

    public void setfEnabledmark(Boolean fEnabledmark) {
        this.fEnabledmark = fEnabledmark;
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
        sb.append(", fItemid=").append(fItemid);
        sb.append(", fParentid=").append(fParentid);
        sb.append(", fItemcode=").append(fItemcode);
        sb.append(", fItemname=").append(fItemname);
        sb.append(", fSimplespelling=").append(fSimplespelling);
        sb.append(", fIsdefault=").append(fIsdefault);
        sb.append(", fLayers=").append(fLayers);
        sb.append(", fSortcode=").append(fSortcode);
        sb.append(", fDeletemark=").append(fDeletemark);
        sb.append(", fEnabledmark=").append(fEnabledmark);
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