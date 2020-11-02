package com.ykxj.zfine.model;

import java.io.Serializable;

public class Pbcatfmt implements Serializable {
    private String pbfName;

    private String pbfFrmt;

    private Integer pbfType;

    private Integer pbfCntr;

    private static final long serialVersionUID = 1L;

    public String getPbfName() {
        return pbfName;
    }

    public void setPbfName(String pbfName) {
        this.pbfName = pbfName;
    }

    public String getPbfFrmt() {
        return pbfFrmt;
    }

    public void setPbfFrmt(String pbfFrmt) {
        this.pbfFrmt = pbfFrmt;
    }

    public Integer getPbfType() {
        return pbfType;
    }

    public void setPbfType(Integer pbfType) {
        this.pbfType = pbfType;
    }

    public Integer getPbfCntr() {
        return pbfCntr;
    }

    public void setPbfCntr(Integer pbfCntr) {
        this.pbfCntr = pbfCntr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbfName=").append(pbfName);
        sb.append(", pbfFrmt=").append(pbfFrmt);
        sb.append(", pbfType=").append(pbfType);
        sb.append(", pbfCntr=").append(pbfCntr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}