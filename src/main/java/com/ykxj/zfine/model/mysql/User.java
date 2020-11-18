package com.ykxj.zfine.model.mysql;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String name;

    private String nickname;

    private String account;

    private String password;

    private String email;

    private String headIcon;

    private String mobilePhone;

    private Byte state;

    private Byte type;

    private Date allowStartTime;

    private Date allowEndTime;

    private Date firstVisitTime;

    private Date lastVisitTime;

    private Long companyId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getAllowStartTime() {
        return allowStartTime;
    }

    public void setAllowStartTime(Date allowStartTime) {
        this.allowStartTime = allowStartTime;
    }

    public Date getAllowEndTime() {
        return allowEndTime;
    }

    public void setAllowEndTime(Date allowEndTime) {
        this.allowEndTime = allowEndTime;
    }

    public Date getFirstVisitTime() {
        return firstVisitTime;
    }

    public void setFirstVisitTime(Date firstVisitTime) {
        this.firstVisitTime = firstVisitTime;
    }

    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
        sb.append(", name=").append(name);
        sb.append(", nickname=").append(nickname);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", headIcon=").append(headIcon);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", state=").append(state);
        sb.append(", type=").append(type);
        sb.append(", allowStartTime=").append(allowStartTime);
        sb.append(", allowEndTime=").append(allowEndTime);
        sb.append(", firstVisitTime=").append(firstVisitTime);
        sb.append(", lastVisitTime=").append(lastVisitTime);
        sb.append(", companyId=").append(companyId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastUpdateUserId=").append(lastUpdateUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}