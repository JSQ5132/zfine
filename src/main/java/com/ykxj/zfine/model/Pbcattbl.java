package com.ykxj.zfine.model;

import java.io.Serializable;

public class Pbcattbl implements Serializable {
    private String pbtTnam;

    private Integer pbtTid;

    private String pbtOwnr;

    private Integer pbdFhgt;

    private Integer pbdFwgt;

    private String pbdFitl;

    private String pbdFunl;

    private Integer pbdFchr;

    private Integer pbdFptc;

    private String pbdFfce;

    private Integer pbhFhgt;

    private Integer pbhFwgt;

    private String pbhFitl;

    private String pbhFunl;

    private Integer pbhFchr;

    private Integer pbhFptc;

    private String pbhFfce;

    private Integer pblFhgt;

    private Integer pblFwgt;

    private String pblFitl;

    private String pblFunl;

    private Integer pblFchr;

    private Integer pblFptc;

    private String pblFfce;

    private String pbtCmnt;

    private static final long serialVersionUID = 1L;

    public String getPbtTnam() {
        return pbtTnam;
    }

    public void setPbtTnam(String pbtTnam) {
        this.pbtTnam = pbtTnam;
    }

    public Integer getPbtTid() {
        return pbtTid;
    }

    public void setPbtTid(Integer pbtTid) {
        this.pbtTid = pbtTid;
    }

    public String getPbtOwnr() {
        return pbtOwnr;
    }

    public void setPbtOwnr(String pbtOwnr) {
        this.pbtOwnr = pbtOwnr;
    }

    public Integer getPbdFhgt() {
        return pbdFhgt;
    }

    public void setPbdFhgt(Integer pbdFhgt) {
        this.pbdFhgt = pbdFhgt;
    }

    public Integer getPbdFwgt() {
        return pbdFwgt;
    }

    public void setPbdFwgt(Integer pbdFwgt) {
        this.pbdFwgt = pbdFwgt;
    }

    public String getPbdFitl() {
        return pbdFitl;
    }

    public void setPbdFitl(String pbdFitl) {
        this.pbdFitl = pbdFitl;
    }

    public String getPbdFunl() {
        return pbdFunl;
    }

    public void setPbdFunl(String pbdFunl) {
        this.pbdFunl = pbdFunl;
    }

    public Integer getPbdFchr() {
        return pbdFchr;
    }

    public void setPbdFchr(Integer pbdFchr) {
        this.pbdFchr = pbdFchr;
    }

    public Integer getPbdFptc() {
        return pbdFptc;
    }

    public void setPbdFptc(Integer pbdFptc) {
        this.pbdFptc = pbdFptc;
    }

    public String getPbdFfce() {
        return pbdFfce;
    }

    public void setPbdFfce(String pbdFfce) {
        this.pbdFfce = pbdFfce;
    }

    public Integer getPbhFhgt() {
        return pbhFhgt;
    }

    public void setPbhFhgt(Integer pbhFhgt) {
        this.pbhFhgt = pbhFhgt;
    }

    public Integer getPbhFwgt() {
        return pbhFwgt;
    }

    public void setPbhFwgt(Integer pbhFwgt) {
        this.pbhFwgt = pbhFwgt;
    }

    public String getPbhFitl() {
        return pbhFitl;
    }

    public void setPbhFitl(String pbhFitl) {
        this.pbhFitl = pbhFitl;
    }

    public String getPbhFunl() {
        return pbhFunl;
    }

    public void setPbhFunl(String pbhFunl) {
        this.pbhFunl = pbhFunl;
    }

    public Integer getPbhFchr() {
        return pbhFchr;
    }

    public void setPbhFchr(Integer pbhFchr) {
        this.pbhFchr = pbhFchr;
    }

    public Integer getPbhFptc() {
        return pbhFptc;
    }

    public void setPbhFptc(Integer pbhFptc) {
        this.pbhFptc = pbhFptc;
    }

    public String getPbhFfce() {
        return pbhFfce;
    }

    public void setPbhFfce(String pbhFfce) {
        this.pbhFfce = pbhFfce;
    }

    public Integer getPblFhgt() {
        return pblFhgt;
    }

    public void setPblFhgt(Integer pblFhgt) {
        this.pblFhgt = pblFhgt;
    }

    public Integer getPblFwgt() {
        return pblFwgt;
    }

    public void setPblFwgt(Integer pblFwgt) {
        this.pblFwgt = pblFwgt;
    }

    public String getPblFitl() {
        return pblFitl;
    }

    public void setPblFitl(String pblFitl) {
        this.pblFitl = pblFitl;
    }

    public String getPblFunl() {
        return pblFunl;
    }

    public void setPblFunl(String pblFunl) {
        this.pblFunl = pblFunl;
    }

    public Integer getPblFchr() {
        return pblFchr;
    }

    public void setPblFchr(Integer pblFchr) {
        this.pblFchr = pblFchr;
    }

    public Integer getPblFptc() {
        return pblFptc;
    }

    public void setPblFptc(Integer pblFptc) {
        this.pblFptc = pblFptc;
    }

    public String getPblFfce() {
        return pblFfce;
    }

    public void setPblFfce(String pblFfce) {
        this.pblFfce = pblFfce;
    }

    public String getPbtCmnt() {
        return pbtCmnt;
    }

    public void setPbtCmnt(String pbtCmnt) {
        this.pbtCmnt = pbtCmnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbtTnam=").append(pbtTnam);
        sb.append(", pbtTid=").append(pbtTid);
        sb.append(", pbtOwnr=").append(pbtOwnr);
        sb.append(", pbdFhgt=").append(pbdFhgt);
        sb.append(", pbdFwgt=").append(pbdFwgt);
        sb.append(", pbdFitl=").append(pbdFitl);
        sb.append(", pbdFunl=").append(pbdFunl);
        sb.append(", pbdFchr=").append(pbdFchr);
        sb.append(", pbdFptc=").append(pbdFptc);
        sb.append(", pbdFfce=").append(pbdFfce);
        sb.append(", pbhFhgt=").append(pbhFhgt);
        sb.append(", pbhFwgt=").append(pbhFwgt);
        sb.append(", pbhFitl=").append(pbhFitl);
        sb.append(", pbhFunl=").append(pbhFunl);
        sb.append(", pbhFchr=").append(pbhFchr);
        sb.append(", pbhFptc=").append(pbhFptc);
        sb.append(", pbhFfce=").append(pbhFfce);
        sb.append(", pblFhgt=").append(pblFhgt);
        sb.append(", pblFwgt=").append(pblFwgt);
        sb.append(", pblFitl=").append(pblFitl);
        sb.append(", pblFunl=").append(pblFunl);
        sb.append(", pblFchr=").append(pblFchr);
        sb.append(", pblFptc=").append(pblFptc);
        sb.append(", pblFfce=").append(pblFfce);
        sb.append(", pbtCmnt=").append(pbtCmnt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}