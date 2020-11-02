package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    private String fId;

    private String fOrganizeid;

    private Integer fCategory;

    private String fEncode;

    private String fFullname;

    private String fType;

    private Boolean fAllowedit;

    private Boolean fAllowdelete;

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

    private String fGroupid;

    private String statue;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfOrganizeid() {
        return fOrganizeid;
    }

    public void setfOrganizeid(String fOrganizeid) {
        this.fOrganizeid = fOrganizeid;
    }

    public Integer getfCategory() {
        return fCategory;
    }

    public void setfCategory(Integer fCategory) {
        this.fCategory = fCategory;
    }

    public String getfEncode() {
        return fEncode;
    }

    public void setfEncode(String fEncode) {
        this.fEncode = fEncode;
    }

    public String getfFullname() {
        return fFullname;
    }

    public void setfFullname(String fFullname) {
        this.fFullname = fFullname;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public Boolean getfAllowedit() {
        return fAllowedit;
    }

    public void setfAllowedit(Boolean fAllowedit) {
        this.fAllowedit = fAllowedit;
    }

    public Boolean getfAllowdelete() {
        return fAllowdelete;
    }

    public void setfAllowdelete(Boolean fAllowdelete) {
        this.fAllowdelete = fAllowdelete;
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

    public String getfGroupid() {
        return fGroupid;
    }

    public void setfGroupid(String fGroupid) {
        this.fGroupid = fGroupid;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fOrganizeid=").append(fOrganizeid);
        sb.append(", fCategory=").append(fCategory);
        sb.append(", fEncode=").append(fEncode);
        sb.append(", fFullname=").append(fFullname);
        sb.append(", fType=").append(fType);
        sb.append(", fAllowedit=").append(fAllowedit);
        sb.append(", fAllowdelete=").append(fAllowdelete);
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
        sb.append(", fGroupid=").append(fGroupid);
        sb.append(", statue=").append(statue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}