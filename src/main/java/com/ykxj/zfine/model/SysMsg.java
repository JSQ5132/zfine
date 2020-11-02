package com.ykxj.zfine.model;

import java.io.Serializable;

public class SysMsg implements Serializable {
    private String fId;

    private String fUser;

    private String readdate;

    private String fPhone;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfUser() {
        return fUser;
    }

    public void setfUser(String fUser) {
        this.fUser = fUser;
    }

    public String getReaddate() {
        return readdate;
    }

    public void setReaddate(String readdate) {
        this.readdate = readdate;
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fUser=").append(fUser);
        sb.append(", readdate=").append(readdate);
        sb.append(", fPhone=").append(fPhone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}