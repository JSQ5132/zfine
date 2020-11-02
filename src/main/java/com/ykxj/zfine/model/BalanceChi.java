package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BalanceChi implements Serializable {
    private Integer nd;

    private String appid;

    private String id;

    private String voucher;

    private String resume;

    private BigDecimal sumWscost;

    private BigDecimal sumTax;

    private BigDecimal sumCost;

    private String remark;

    private Date moditime;

    private Integer state;

    private Date busdate;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public BigDecimal getSumWscost() {
        return sumWscost;
    }

    public void setSumWscost(BigDecimal sumWscost) {
        this.sumWscost = sumWscost;
    }

    public BigDecimal getSumTax() {
        return sumTax;
    }

    public void setSumTax(BigDecimal sumTax) {
        this.sumTax = sumTax;
    }

    public BigDecimal getSumCost() {
        return sumCost;
    }

    public void setSumCost(BigDecimal sumCost) {
        this.sumCost = sumCost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getBusdate() {
        return busdate;
    }

    public void setBusdate(Date busdate) {
        this.busdate = busdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nd=").append(nd);
        sb.append(", appid=").append(appid);
        sb.append(", id=").append(id);
        sb.append(", voucher=").append(voucher);
        sb.append(", resume=").append(resume);
        sb.append(", sumWscost=").append(sumWscost);
        sb.append(", sumTax=").append(sumTax);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", remark=").append(remark);
        sb.append(", moditime=").append(moditime);
        sb.append(", state=").append(state);
        sb.append(", busdate=").append(busdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}