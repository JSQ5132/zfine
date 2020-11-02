package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BalanceFath implements Serializable {
    private Integer tId;

    private String appid;

    private String id;

    private String provider;

    private String month;

    private Date busdate;

    private Date startdate;

    private Date enddate;

    private String organ;

    private String contractid;

    private BigDecimal sumWscost;

    private BigDecimal sumTax;

    private BigDecimal sumCost;

    private BigDecimal sumQc;

    private BigDecimal sumBq;

    private BigDecimal sumFee;

    private BigDecimal sumBalance;

    private String remark;

    private String operator;

    private Date recdate;

    private Date verdate;

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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getBusdate() {
        return busdate;
    }

    public void setBusdate(Date busdate) {
        this.busdate = busdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
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

    public BigDecimal getSumQc() {
        return sumQc;
    }

    public void setSumQc(BigDecimal sumQc) {
        this.sumQc = sumQc;
    }

    public BigDecimal getSumBq() {
        return sumBq;
    }

    public void setSumBq(BigDecimal sumBq) {
        this.sumBq = sumBq;
    }

    public BigDecimal getSumFee() {
        return sumFee;
    }

    public void setSumFee(BigDecimal sumFee) {
        this.sumFee = sumFee;
    }

    public BigDecimal getSumBalance() {
        return sumBalance;
    }

    public void setSumBalance(BigDecimal sumBalance) {
        this.sumBalance = sumBalance;
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
        sb.append(", provider=").append(provider);
        sb.append(", month=").append(month);
        sb.append(", busdate=").append(busdate);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", organ=").append(organ);
        sb.append(", contractid=").append(contractid);
        sb.append(", sumWscost=").append(sumWscost);
        sb.append(", sumTax=").append(sumTax);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", sumQc=").append(sumQc);
        sb.append(", sumBq=").append(sumBq);
        sb.append(", sumFee=").append(sumFee);
        sb.append(", sumBalance=").append(sumBalance);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", recdate=").append(recdate);
        sb.append(", verdate=").append(verdate);
        sb.append(", printcount=").append(printcount);
        sb.append(", moditime=").append(moditime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}