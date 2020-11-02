package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysModule implements Serializable {
    private String fId;

    private String fParentid;

    private Integer fLayers;

    private String fEncode;

    private String fFullname;

    private String fIcon;

    private String fUrladdress;

    private String fTarget;

    private Boolean fIsmenu;

    private Boolean fIsexpand;

    private Boolean fIspublic;

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

    private String edition;

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

    public String getfIcon() {
        return fIcon;
    }

    public void setfIcon(String fIcon) {
        this.fIcon = fIcon;
    }

    public String getfUrladdress() {
        return fUrladdress;
    }

    public void setfUrladdress(String fUrladdress) {
        this.fUrladdress = fUrladdress;
    }

    public String getfTarget() {
        return fTarget;
    }

    public void setfTarget(String fTarget) {
        this.fTarget = fTarget;
    }

    public Boolean getfIsmenu() {
        return fIsmenu;
    }

    public void setfIsmenu(Boolean fIsmenu) {
        this.fIsmenu = fIsmenu;
    }

    public Boolean getfIsexpand() {
        return fIsexpand;
    }

    public void setfIsexpand(Boolean fIsexpand) {
        this.fIsexpand = fIsexpand;
    }

    public Boolean getfIspublic() {
        return fIspublic;
    }

    public void setfIspublic(Boolean fIspublic) {
        this.fIspublic = fIspublic;
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
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
        sb.append(", fIcon=").append(fIcon);
        sb.append(", fUrladdress=").append(fUrladdress);
        sb.append(", fTarget=").append(fTarget);
        sb.append(", fIsmenu=").append(fIsmenu);
        sb.append(", fIsexpand=").append(fIsexpand);
        sb.append(", fIspublic=").append(fIspublic);
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
        sb.append(", edition=").append(edition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}