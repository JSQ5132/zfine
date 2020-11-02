package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class Down implements Serializable {
    private Integer nd;

    private String appid;

    private String otype;

    private String tbname;

    private String id;

    private String operator;

    private Date moditime;

    private static final long serialVersionUID = 1L;

    public Integer getNd() {
        return nd;
    }

    public void setNd(Integer nd) {
        this.nd = nd;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public String getTbname() {
        return tbname;
    }

    public void setTbname(String tbname) {
        this.tbname = tbname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nd=").append(nd);
        sb.append(", appid=").append(appid);
        sb.append(", otype=").append(otype);
        sb.append(", tbname=").append(tbname);
        sb.append(", id=").append(id);
        sb.append(", operator=").append(operator);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}