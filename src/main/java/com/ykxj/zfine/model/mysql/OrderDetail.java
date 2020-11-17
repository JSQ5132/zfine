package com.ykxj.zfine.model.mysql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail implements Serializable {
    private Long id;

    private String companyAppid;

    private String orderNumber;

    private String skuCode;

    private String barcode;

    private BigDecimal amount;

    private BigDecimal packAmount;

    private BigDecimal costPrice;

    private BigDecimal sumCost;

    private BigDecimal price;

    private String remark;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyAppid() {
        return companyAppid;
    }

    public void setCompanyAppid(String companyAppid) {
        this.companyAppid = companyAppid;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
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

    public BigDecimal getPackAmount() {
        return packAmount;
    }

    public void setPackAmount(BigDecimal packAmount) {
        this.packAmount = packAmount;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyAppid=").append(companyAppid);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", barcode=").append(barcode);
        sb.append(", amount=").append(amount);
        sb.append(", packAmount=").append(packAmount);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", sumCost=").append(sumCost);
        sb.append(", price=").append(price);
        sb.append(", remark=").append(remark);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}