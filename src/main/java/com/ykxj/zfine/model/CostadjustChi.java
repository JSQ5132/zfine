package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CostadjustChi implements Serializable {
    private Integer nd;

    private String appid;

    private String id;

    private String code;

    private String barcode;

    private String acceptid;

    private BigDecimal amount;

    private BigDecimal costprice;

    private BigDecimal costpriceNew;

    private BigDecimal costadjust;

    private BigDecimal sumCost;

    private BigDecimal price;

    private BigDecimal notaxcost;

    private Integer tax;

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

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getCostpriceNew() {
        return costpriceNew;
    }

    public void setCostpriceNew(BigDecimal costpriceNew) {
        this.costpriceNew = costpriceNew;
    }

    public BigDecimal getCostadjust() {
        return costadjust;
    }

    public void setCostadjust(BigDecimal costadjust) {
        this.costadjust = costadjust;
    }

    public BigDecimal getSumCost() {
        return sumCost;
    }

    public void setSumCost(BigDecimal sumCost) {
        this.sumCost = sumCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNotaxcost() {
        return notaxcost;
    }

    public void setNotaxcost(BigDecimal notaxcost) {
        this.notaxcost = notaxcost;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
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
        sb.append(", acceptid=").append(acceptid);
        sb.append(", amount=").append(amount);
        sb.append(", costprice=").append(costprice);
        sb.append(", costpriceNew=").append(costpriceNew);
        sb.append(", costadjust=").append(costadjust);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", price=").append(price);
        sb.append(", notaxcost=").append(notaxcost);
        sb.append(", tax=").append(tax);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}