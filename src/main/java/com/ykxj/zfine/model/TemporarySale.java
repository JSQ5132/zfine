package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TemporarySale implements Serializable {
    private Integer tId;

    private String appid;

    private Date busdate;

    private String organ;

    private String depart;

    private String provider;

    private String code;

    private String barcode;

    private String acceptid;

    private BigDecimal amount;

    private BigDecimal sumCost;

    private BigDecimal sumPrice;

    private Long nd;

    private Date moditime;

    private Integer nature;

    private BigDecimal sumDisc;

    private String sort;

    private Integer statue;

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

    public Long getNd() {
        return nd;
    }

    public void setNd(Long nd) {
        this.nd = nd;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public BigDecimal getSumDisc() {
        return sumDisc;
    }

    public void setSumDisc(BigDecimal sumDisc) {
        this.sumDisc = sumDisc;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", appid=").append(appid);
        sb.append(", busdate=").append(busdate);
        sb.append(", organ=").append(organ);
        sb.append(", depart=").append(depart);
        sb.append(", provider=").append(provider);
        sb.append(", code=").append(code);
        sb.append(", barcode=").append(barcode);
        sb.append(", acceptid=").append(acceptid);
        sb.append(", amount=").append(amount);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", sumPrice=").append(sumPrice);
        sb.append(", nd=").append(nd);
        sb.append(", moditime=").append(moditime);
        sb.append(", nature=").append(nature);
        sb.append(", sumDisc=").append(sumDisc);
        sb.append(", sort=").append(sort);
        sb.append(", statue=").append(statue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}