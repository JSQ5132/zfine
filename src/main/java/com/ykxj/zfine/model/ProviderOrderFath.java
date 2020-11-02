package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class ProviderOrderFath implements Serializable {
    private String fId;

    private String fAccount;

    private String appid;

    private Date busdate;

    private Integer statu;

    private String fCreatoruserid;

    private Date fCreatortime;

    private String fLastmodifyuserid;

    private Date fLastmodifytime;

    private Boolean fDeletemark;

    private String fDeleteuserid;

    private Date fDeletetime;

    private String remark;

    private String organ;

    private String code;

    private Integer printnum;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfAccount() {
        return fAccount;
    }

    public void setfAccount(String fAccount) {
        this.fAccount = fAccount;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Date getBusdate() {
        return busdate;
    }

    public void setBusdate(Date busdate) {
        this.busdate = busdate;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getfCreatoruserid() {
        return fCreatoruserid;
    }

    public void setfCreatoruserid(String fCreatoruserid) {
        this.fCreatoruserid = fCreatoruserid;
    }

    public Date getfCreatortime() {
        return fCreatortime;
    }

    public void setfCreatortime(Date fCreatortime) {
        this.fCreatortime = fCreatortime;
    }

    public String getfLastmodifyuserid() {
        return fLastmodifyuserid;
    }

    public void setfLastmodifyuserid(String fLastmodifyuserid) {
        this.fLastmodifyuserid = fLastmodifyuserid;
    }

    public Date getfLastmodifytime() {
        return fLastmodifytime;
    }

    public void setfLastmodifytime(Date fLastmodifytime) {
        this.fLastmodifytime = fLastmodifytime;
    }

    public Boolean getfDeletemark() {
        return fDeletemark;
    }

    public void setfDeletemark(Boolean fDeletemark) {
        this.fDeletemark = fDeletemark;
    }

    public String getfDeleteuserid() {
        return fDeleteuserid;
    }

    public void setfDeleteuserid(String fDeleteuserid) {
        this.fDeleteuserid = fDeleteuserid;
    }

    public Date getfDeletetime() {
        return fDeletetime;
    }

    public void setfDeletetime(Date fDeletetime) {
        this.fDeletetime = fDeletetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPrintnum() {
        return printnum;
    }

    public void setPrintnum(Integer printnum) {
        this.printnum = printnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fAccount=").append(fAccount);
        sb.append(", appid=").append(appid);
        sb.append(", busdate=").append(busdate);
        sb.append(", statu=").append(statu);
        sb.append(", fCreatoruserid=").append(fCreatoruserid);
        sb.append(", fCreatortime=").append(fCreatortime);
        sb.append(", fLastmodifyuserid=").append(fLastmodifyuserid);
        sb.append(", fLastmodifytime=").append(fLastmodifytime);
        sb.append(", fDeletemark=").append(fDeletemark);
        sb.append(", fDeleteuserid=").append(fDeleteuserid);
        sb.append(", fDeletetime=").append(fDeletetime);
        sb.append(", remark=").append(remark);
        sb.append(", organ=").append(organ);
        sb.append(", code=").append(code);
        sb.append(", printnum=").append(printnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}