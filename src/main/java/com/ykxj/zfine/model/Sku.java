package com.ykxj.zfine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Sku implements Serializable {
    private Integer tId;

    private String appid;

    private String code;

    private String barcode;

    private String name;

    private String spec;

    private String unit;

    private Integer ifstock;

    private BigDecimal conversion;

    private String provider;

    private BigDecimal costprice;

    private BigDecimal price;

    private BigDecimal memprice;

    private BigDecimal batchprice;

    private Integer tax;

    private String nature;

    private Integer keepday;

    private String statu;

    private Integer curversion;

    private Date moditime;

    private String sort;

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

    public Integer getIfstock() {
        return ifstock;
    }

    public void setIfstock(Integer ifstock) {
        this.ifstock = ifstock;
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public void setConversion(BigDecimal conversion) {
        this.conversion = conversion;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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

    public BigDecimal getMemprice() {
        return memprice;
    }

    public void setMemprice(BigDecimal memprice) {
        this.memprice = memprice;
    }

    public BigDecimal getBatchprice() {
        return batchprice;
    }

    public void setBatchprice(BigDecimal batchprice) {
        this.batchprice = batchprice;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public Integer getCurversion() {
        return curversion;
    }

    public void setCurversion(Integer curversion) {
        this.curversion = curversion;
    }

    public Date getModitime() {
        return moditime;
    }

    public void setModitime(Date moditime) {
        this.moditime = moditime;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", appid=").append(appid);
        sb.append(", code=").append(code);
        sb.append(", barcode=").append(barcode);
        sb.append(", name=").append(name);
        sb.append(", spec=").append(spec);
        sb.append(", unit=").append(unit);
        sb.append(", ifstock=").append(ifstock);
        sb.append(", conversion=").append(conversion);
        sb.append(", provider=").append(provider);
        sb.append(", costprice=").append(costprice);
        sb.append(", price=").append(price);
        sb.append(", memprice=").append(memprice);
        sb.append(", batchprice=").append(batchprice);
        sb.append(", tax=").append(tax);
        sb.append(", nature=").append(nature);
        sb.append(", keepday=").append(keepday);
        sb.append(", statu=").append(statu);
        sb.append(", curversion=").append(curversion);
        sb.append(", moditime=").append(moditime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}