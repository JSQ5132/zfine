package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysModulebutton implements Serializable {
    private String fId;

    private String fModuleid;

    private String fParentid;

    private Integer fLayers;

    private String fEncode;

    private String fFullname;

    private String fIcon;

    private Integer fLocation;

    private String fJsevent;

    private String fUrladdress;

    private Boolean fSplit;

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

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfModuleid() {
        return fModuleid;
    }

    public void setfModuleid(String fModuleid) {
        this.fModuleid = fModuleid;
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

    public Integer getfLocation() {
        return fLocation;
    }

    public void setfLocation(Integer fLocation) {
        this.fLocation = fLocation;
    }

    public String getfJsevent() {
        return fJsevent;
    }

    public void setfJsevent(String fJsevent) {
        this.fJsevent = fJsevent;
    }

    public String getfUrladdress() {
        return fUrladdress;
    }

    public void setfUrladdress(String fUrladdress) {
        this.fUrladdress = fUrladdress;
    }

    public Boolean getfSplit() {
        return fSplit;
    }

    public void setfSplit(Boolean fSplit) {
        this.fSplit = fSplit;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fModuleid=").append(fModuleid);
        sb.append(", fParentid=").append(fParentid);
        sb.append(", fLayers=").append(fLayers);
        sb.append(", fEncode=").append(fEncode);
        sb.append(", fFullname=").append(fFullname);
        sb.append(", fIcon=").append(fIcon);
        sb.append(", fLocation=").append(fLocation);
        sb.append(", fJsevent=").append(fJsevent);
        sb.append(", fUrladdress=").append(fUrladdress);
        sb.append(", fSplit=").append(fSplit);
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}