package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Acc implements Serializable {
    private Integer nd;

    private String appid;

    private Date busdate;

    private String organ;

    private String sort;

    private String provider;

    private String code;

    private String barcode;

    private String resume;

    private String acceptid;

    private BigDecimal amount;

    private BigDecimal sumCost;

    private BigDecimal sumPrice;

    private Integer state;

    private Integer tax;

    private BigDecimal sumWscost;

    private Integer nature;

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

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(String acceptid) {
        this.acceptid = acceptid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSumCost() {
        return sumCost;
    }

    public void setSumCost(BigDecimal sumCost) {
        this.sumCost = sumCost;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public BigDecimal getSumWscost() {
        return sumWscost;
    }

    public void setSumWscost(BigDecimal sumWscost) {
        this.sumWscost = sumWscost;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nd=").append(nd);
        sb.append(", appid=").append(appid);
        sb.append(", busdate=").append(busdate);
        sb.append(", organ=").append(organ);
        sb.append(", sort=").append(sort);
        sb.append(", provider=").append(provider);
        sb.append(", code=").append(code);
        sb.append(", barcode=").append(barcode);
        sb.append(", resume=").append(resume);
        sb.append(", acceptid=").append(acceptid);
        sb.append(", amount=").append(amount);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", sumPrice=").append(sumPrice);
        sb.append(", state=").append(state);
        sb.append(", tax=").append(tax);
        sb.append(", sumWscost=").append(sumWscost);
        sb.append(", nature=").append(nature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}