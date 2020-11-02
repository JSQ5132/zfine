package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class AcceptFath implements Serializable {
    private Integer tId;

    private String appid;

    private String id;

    private String orderid;

    private Date busdate;

    private String organ;

    private String depart;

    private String remark;

    private String operator;

    private Date recdate;

    private Date verdate;

    private String verifier;

    private Integer statu;

    private Integer printcount;

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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
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

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
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

    public Date getRecdate() {
        return recdate;
    }

    public void setRecdate(Date recdate) {
        this.recdate = recdate;
    }

    public Date getVerdate() {
        return verdate;
    }

    public void setVerdate(Date verdate) {
        this.verdate = verdate;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
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
        sb.append(", orderid=").append(orderid);
        sb.append(", busdate=").append(busdate);
        sb.append(", organ=").append(organ);
        sb.append(", depart=").append(depart);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", recdate=").append(recdate);
        sb.append(", verdate=").append(verdate);
        sb.append(", verifier=").append(verifier);
        sb.append(", statu=").append(statu);
        sb.append(", printcount=").append(printcount);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}