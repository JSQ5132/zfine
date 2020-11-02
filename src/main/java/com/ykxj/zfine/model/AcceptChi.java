package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcceptChi implements Serializable {
    private Integer nd;

    private String appid;

    private String id;

    private String code;

    private String barcode;

    private BigDecimal amount;

    private BigDecimal conversion;

    private BigDecimal packAmou;

    private BigDecimal costprice;

    private BigDecimal sumCost;

    private BigDecimal price;

    private String remark;

    private Date moditime;

    private Long sendamou;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public void setConversion(BigDecimal conversion) {
        this.conversion = conversion;
    }

    public BigDecimal getPackAmou() {
        return packAmou;
    }

    public void setPackAmou(BigDecimal packAmou) {
        this.packAmou = packAmou;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
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

    public Long getSendamou() {
        return sendamou;
    }

    public void setSendamou(Long sendamou) {
        this.sendamou = sendamou;
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
        sb.append(", amount=").append(amount);
        sb.append(", conversion=").append(conversion);
        sb.append(", packAmou=").append(packAmou);
        sb.append(", costprice=").append(costprice);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", price=").append(price);
        sb.append(", remark=").append(remark);
        sb.append(", moditime=").append(moditime);
        sb.append(", sendamou=").append(sendamou);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}