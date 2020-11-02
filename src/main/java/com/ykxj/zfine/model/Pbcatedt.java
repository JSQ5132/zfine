package com.ykxj.zfine.model;

import java.io.Serializable;

public class Pbcatedt implements Serializable {
    private String pbeName;

    private String pbeEdit;

    private Integer pbeType;

    private Integer pbeCntr;

    private Integer pbeSeqn;

    private Integer pbeFlag;

    private String pbeWork;

    private static final long serialVersionUID = 1L;

    public String getPbeName() {
        return pbeName;
    }

    public void setPbeName(String pbeName) {
        this.pbeName = pbeName;
    }

    public String getPbeEdit() {
        return pbeEdit;
    }

    public void setPbeEdit(String pbeEdit) {
        this.pbeEdit = pbeEdit;
    }

    public Integer getPbeType() {
        return pbeType;
    }

    public void setPbeType(Integer pbeType) {
        this.pbeType = pbeType;
    }

    public Integer getPbeCntr() {
        return pbeCntr;
    }

    public void setPbeCntr(Integer pbeCntr) {
        this.pbeCntr = pbeCntr;
    }

    public Integer getPbeSeqn() {
        return pbeSeqn;
    }

    public void setPbeSeqn(Integer pbeSeqn) {
        this.pbeSeqn = pbeSeqn;
    }

    public Integer getPbeFlag() {
        return pbeFlag;
    }

    public void setPbeFlag(Integer pbeFlag) {
        this.pbeFlag = pbeFlag;
    }

    public String getPbeWork() {
        return pbeWork;
    }

    public void setPbeWork(String pbeWork) {
        this.pbeWork = pbeWork;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbeName=").append(pbeName);
        sb.append(", pbeEdit=").append(pbeEdit);
        sb.append(", pbeType=").append(pbeType);
        sb.append(", pbeCntr=").append(pbeCntr);
        sb.append(", pbeSeqn=").append(pbeSeqn);
        sb.append(", pbeFlag=").append(pbeFlag);
        sb.append(", pbeWork=").append(pbeWork);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}