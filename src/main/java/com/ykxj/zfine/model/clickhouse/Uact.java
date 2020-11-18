package com.ykxj.zfine.model.clickhouse;

import java.io.Serializable;

public class Uact implements Serializable {
    private Long userid;

    private Byte pageviews;

    private Byte duration;

    private Byte sign;

    private Byte version;

    private static final long serialVersionUID = 1L;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Byte getPageviews() {
        return pageviews;
    }

    public void setPageviews(Byte pageviews) {
        this.pageviews = pageviews;
    }

    public Byte getDuration() {
        return duration;
    }

    public void setDuration(Byte duration) {
        this.duration = duration;
    }

    public Byte getSign() {
        return sign;
    }

    public void setSign(Byte sign) {
        this.sign = sign;
    }

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", pageviews=").append(pageviews);
        sb.append(", duration=").append(duration);
        sb.append(", sign=").append(sign);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}