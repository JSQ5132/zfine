package com.ykxj.zfine.model;

import java.io.Serializable;

public class Pbcatvld implements Serializable {
    private String pbvName;

    private String pbvVald;

    private Integer pbvType;

    private Integer pbvCntr;

    private String pbvMsg;

    private static final long serialVersionUID = 1L;

    public String getPbvName() {
        return pbvName;
    }

    public void setPbvName(String pbvName) {
        this.pbvName = pbvName;
    }

    public String getPbvVald() {
        return pbvVald;
    }

    public void setPbvVald(String pbvVald) {
        this.pbvVald = pbvVald;
    }

    public Integer getPbvType() {
        return pbvType;
    }

    public void setPbvType(Integer pbvType) {
        this.pbvType = pbvType;
    }

    public Integer getPbvCntr() {
        return pbvCntr;
    }

    public void setPbvCntr(Integer pbvCntr) {
        this.pbvCntr = pbvCntr;
    }

    public String getPbvMsg() {
        return pbvMsg;
    }

    public void setPbvMsg(String pbvMsg) {
        this.pbvMsg = pbvMsg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbvName=").append(pbvName);
        sb.append(", pbvVald=").append(pbvVald);
        sb.append(", pbvType=").append(pbvType);
        sb.append(", pbvCntr=").append(pbvCntr);
        sb.append(", pbvMsg=").append(pbvMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}