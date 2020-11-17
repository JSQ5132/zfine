package com.ykxj.zfine.model.mysql;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Long id;

    private String companyAppid;

    private String providerCode;

    private Long storeId;

    private String number;

    private Date createTime;

    private Date busDate;

    private String remark;

    private String operator;

    private Date recordTime;

    private Date markTime;

    private String verifier;

    private Integer printCount;

    private Byte state;

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

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
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

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getMarkTime() {
        return markTime;
    }

    public void setMarkTime(Date markTime) {
        this.markTime = markTime;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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
        sb.append(", providerCode=").append(providerCode);
        sb.append(", storeId=").append(storeId);
        sb.append(", number=").append(number);
        sb.append(", createTime=").append(createTime);
        sb.append(", busDate=").append(busDate);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", markTime=").append(markTime);
        sb.append(", verifier=").append(verifier);
        sb.append(", printCount=").append(printCount);
        sb.append(", state=").append(state);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}