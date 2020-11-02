package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysOrganize implements Serializable {
    private String fId;

    private String fParentid;

    private Integer fLayers;

    private String fEncode;

    private String fFullname;

    private String fShortname;

    private String fCategoryid;

    private String fManagerid;

    private String fTelephone;

    private String fMobilephone;

    private String fWechat;

    private String fFax;

    private String fEmail;

    private String fAreaid;

    private String fAddress;

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

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfParentid() {
        return fParentid;
    }

    public void setfParentid(String fParentid) {
        this.fParentid = fParentid;
    }

    public Integer getfLayers() {
        return fLayers;
    }

    public void setfLayers(Integer fLayers) {
        this.fLayers = fLayers;
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

    public String getfShortname() {
        return fShortname;
    }

    public void setfShortname(String fShortname) {
        this.fShortname = fShortname;
    }

    public String getfCategoryid() {
        return fCategoryid;
    }

    public void setfCategoryid(String fCategoryid) {
        this.fCategoryid = fCategoryid;
    }

    public String getfManagerid() {
        return fManagerid;
    }

    public void setfManagerid(String fManagerid) {
        this.fManagerid = fManagerid;
    }

    public String getfTelephone() {
        return fTelephone;
    }

    public void setfTelephone(String fTelephone) {
        this.fTelephone = fTelephone;
    }

    public String getfMobilephone() {
        return fMobilephone;
    }

    public void setfMobilephone(String fMobilephone) {
        this.fMobilephone = fMobilephone;
    }

    public String getfWechat() {
        return fWechat;
    }

    public void setfWechat(String fWechat) {
        this.fWechat = fWechat;
    }

    public String getfFax() {
        return fFax;
    }

    public void setfFax(String fFax) {
        this.fFax = fFax;
    }

    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    public String getfAreaid() {
        return fAreaid;
    }

    public void setfAreaid(String fAreaid) {
        this.fAreaid = fAreaid;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fParentid=").append(fParentid);
        sb.append(", fLayers=").append(fLayers);
        sb.append(", fEncode=").append(fEncode);
        sb.append(", fFullname=").append(fFullname);
        sb.append(", fShortname=").append(fShortname);
        sb.append(", fCategoryid=").append(fCategoryid);
        sb.append(", fManagerid=").append(fManagerid);
        sb.append(", fTelephone=").append(fTelephone);
        sb.append(", fMobilephone=").append(fMobilephone);
        sb.append(", fWechat=").append(fWechat);
        sb.append(", fFax=").append(fFax);
        sb.append(", fEmail=").append(fEmail);
        sb.append(", fAreaid=").append(fAreaid);
        sb.append(", fAddress=").append(fAddress);
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}