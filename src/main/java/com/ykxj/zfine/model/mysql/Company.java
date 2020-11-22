package com.ykxj.zfine.model.mysql;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
    private Long id;

    private String appid;

    private String appkey;

    private String name;

    private String erpType;

    private String version;

    private String linkman;

    private Short createProviderAmount;

    private Date expireTiem;

    private String mobilePhone;

    private String email;

    private String address;

    private String customer;

    private Byte state;

    private String description;

    private Date createTime;

    private Long createUserId;

    private Date lastUpdateTime;

    private Long lastUpdateUserId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getErpType() {
        return erpType;
    }

    public void setErpType(String erpType) {
        this.erpType = erpType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public Short getCreateProviderAmount() {
        return createProviderAmount;
    }

    public void setCreateProviderAmount(Short createProviderAmount) {
        this.createProviderAmount = createProviderAmount;
    }

    public Date getExpireTiem() {
        return expireTiem;
    }

    public void setExpireTiem(Date expireTiem) {
        this.expireTiem = expireTiem;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appid=").append(appid);
        sb.append(", appkey=").append(appkey);
        sb.append(", name=").append(name);
        sb.append(", erpType=").append(erpType);
        sb.append(", version=").append(version);
        sb.append(", linkman=").append(linkman);
        sb.append(", createProviderAmount=").append(createProviderAmount);
        sb.append(", expireTiem=").append(expireTiem);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", customer=").append(customer);
        sb.append(", state=").append(state);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateUserId=").append(lastUpdateUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}