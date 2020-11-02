package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class CostadjustFath implements Serializable {
    private Integer tId;

    private String appid;

    private String id;

    private String provider;

    private String contractid;

    private Date busdate;

    private String organ;

    private String remark;

    private String operator;

    private Date verdate;

    private Date moditime;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public Date getBusdate() {
        return busdate;
    }

    public void setBusdate(Date busdate) {
        this.busdate = busdate;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getVerdate() {
        return verdate;
    }

    public void setVerdate(Date verdate) {
        this.verdate = verdate;
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
        sb.append(", tId=").append(tId);
        sb.append(", appid=").append(appid);
        sb.append(", id=").append(id);
        sb.append(", provider=").append(provider);
        sb.append(", contractid=").append(contractid);
        sb.append(", busdate=").append(busdate);
        sb.append(", organ=").append(organ);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", verdate=").append(verdate);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}