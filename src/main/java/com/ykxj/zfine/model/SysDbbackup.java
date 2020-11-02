package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysDbbackup implements Serializable {
    private String fId;

    private String fBackuptype;

    private String fDbname;

    private String fFilename;

    private String fFilesize;

    private String fFilepath;

    private Date fBackuptime;

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

    public String getfBackuptype() {
        return fBackuptype;
    }

    public void setfBackuptype(String fBackuptype) {
        this.fBackuptype = fBackuptype;
    }

    public String getfDbname() {
        return fDbname;
    }

    public void setfDbname(String fDbname) {
        this.fDbname = fDbname;
    }

    public String getfFilename() {
        return fFilename;
    }

    public void setfFilename(String fFilename) {
        this.fFilename = fFilename;
    }

    public String getfFilesize() {
        return fFilesize;
    }

    public void setfFilesize(String fFilesize) {
        this.fFilesize = fFilesize;
    }

    public String getfFilepath() {
        return fFilepath;
    }

    public void setfFilepath(String fFilepath) {
        this.fFilepath = fFilepath;
    }

    public Date getfBackuptime() {
        return fBackuptime;
    }

    public void setfBackuptime(Date fBackuptime) {
        this.fBackuptime = fBackuptime;
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
        sb.append(", fBackuptype=").append(fBackuptype);
        sb.append(", fDbname=").append(fDbname);
        sb.append(", fFilename=").append(fFilename);
        sb.append(", fFilesize=").append(fFilesize);
        sb.append(", fFilepath=").append(fFilepath);
        sb.append(", fBackuptime=").append(fBackuptime);
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