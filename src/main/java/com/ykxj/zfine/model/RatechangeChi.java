package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class RatechangeChi implements Serializable {
    private Integer nd;

    private String appid;

    private String id;

    private String code;

    private String barcode;

    private BigDecimal rateOld;

    private BigDecimal rateNew;

    private BigDecimal price;

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

    public BigDecimal getRateOld() {
        return rateOld;
    }

    public void setRateOld(BigDecimal rateOld) {
        this.rateOld = rateOld;
    }

    public BigDecimal getRateNew() {
        return rateNew;
    }

    public void setRateNew(BigDecimal rateNew) {
        this.rateNew = rateNew;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        sb.append(", code=").append(code);
        sb.append(", barcode=").append(barcode);
        sb.append(", rateOld=").append(rateOld);
        sb.append(", rateNew=").append(rateNew);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}