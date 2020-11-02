package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class Organ implements Serializable {
    private Integer tId;

    private String appid;

    private String code;

    private String name;

    private String statu;

    private Integer curversion;

    private Date moditime;

    private String address;

    private String phone;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public Integer getCurversion() {
        return curversion;
    }

    public void setCurversion(Integer curversion) {
        this.curversion = curversion;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", appid=").append(appid);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", statu=").append(statu);
        sb.append(", curversion=").append(curversion);
        sb.append(", moditime=").append(moditime);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}