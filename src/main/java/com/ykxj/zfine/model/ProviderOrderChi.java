package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProviderOrderChi implements Serializable {
    private Integer nd;

    private String fId;

    private String code;

    private String barcode;

    private String name;

    private String spec;

    private String unit;

    private BigDecimal amount;

    private BigDecimal costprice;

    private BigDecimal price;

    private BigDecimal confirmamount;

    private BigDecimal stockamount;

    private BigDecimal dailysaleamount;

    private static final long serialVersionUID = 1L;

    public Integer getNd() {
        return nd;
    }

    public void setNd(Integer nd) {
        this.nd = nd;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getConfirmamount() {
        return confirmamount;
    }

    public void setConfirmamount(BigDecimal confirmamount) {
        this.confirmamount = confirmamount;
    }

    public BigDecimal getStockamount() {
        return stockamount;
    }

    public void setStockamount(BigDecimal stockamount) {
        this.stockamount = stockamount;
    }

    public BigDecimal getDailysaleamount() {
        return dailysaleamount;
    }

    public void setDailysaleamount(BigDecimal dailysaleamount) {
        this.dailysaleamount = dailysaleamount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nd=").append(nd);
        sb.append(", fId=").append(fId);
        sb.append(", code=").append(code);
        sb.append(", barcode=").append(barcode);
        sb.append(", name=").append(name);
        sb.append(", spec=").append(spec);
        sb.append(", unit=").append(unit);
        sb.append(", amount=").append(amount);
        sb.append(", costprice=").append(costprice);
        sb.append(", price=").append(price);
        sb.append(", confirmamount=").append(confirmamount);
        sb.append(", stockamount=").append(stockamount);
        sb.append(", dailysaleamount=").append(dailysaleamount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}