package com.ykxj.zfine.model;

import java.io.Serializable;

public class Pbcatcol implements Serializable {
    private String pbcTnam;

    private Integer pbcTid;

    private String pbcOwnr;

    private String pbcCnam;

    private Integer pbcCid;

    private String pbcLabl;

    private Integer pbcLpos;

    private String pbcHdr;

    private Integer pbcHpos;

    private Integer pbcJtfy;

    private String pbcMask;

    private Integer pbcCase;

    private Integer pbcHght;

    private Integer pbcWdth;

    private String pbcPtrn;

    private String pbcBmap;

    private String pbcInit;

    private String pbcCmnt;

    private String pbcEdit;

    private String pbcTag;

    private static final long serialVersionUID = 1L;

    public String getPbcTnam() {
        return pbcTnam;
    }

    public void setPbcTnam(String pbcTnam) {
        this.pbcTnam = pbcTnam;
    }

    public Integer getPbcTid() {
        return pbcTid;
    }

    public void setPbcTid(Integer pbcTid) {
        this.pbcTid = pbcTid;
    }

    public String getPbcOwnr() {
        return pbcOwnr;
    }

    public void setPbcOwnr(String pbcOwnr) {
        this.pbcOwnr = pbcOwnr;
    }

    public String getPbcCnam() {
        return pbcCnam;
    }

    public void setPbcCnam(String pbcCnam) {
        this.pbcCnam = pbcCnam;
    }

    public Integer getPbcCid() {
        return pbcCid;
    }

    public void setPbcCid(Integer pbcCid) {
        this.pbcCid = pbcCid;
    }

    public String getPbcLabl() {
        return pbcLabl;
    }

    public void setPbcLabl(String pbcLabl) {
        this.pbcLabl = pbcLabl;
    }

    public Integer getPbcLpos() {
        return pbcLpos;
    }

    public void setPbcLpos(Integer pbcLpos) {
        this.pbcLpos = pbcLpos;
    }

    public String getPbcHdr() {
        return pbcHdr;
    }

    public void setPbcHdr(String pbcHdr) {
        this.pbcHdr = pbcHdr;
    }

    public Integer getPbcHpos() {
        return pbcHpos;
    }

    public void setPbcHpos(Integer pbcHpos) {
        this.pbcHpos = pbcHpos;
    }

    public Integer getPbcJtfy() {
        return pbcJtfy;
    }

    public void setPbcJtfy(Integer pbcJtfy) {
        this.pbcJtfy = pbcJtfy;
    }

    public String getPbcMask() {
        return pbcMask;
    }

    public void setPbcMask(String pbcMask) {
        this.pbcMask = pbcMask;
    }

    public Integer getPbcCase() {
        return pbcCase;
    }

    public void setPbcCase(Integer pbcCase) {
        this.pbcCase = pbcCase;
    }

    public Integer getPbcHght() {
        return pbcHght;
    }

    public void setPbcHght(Integer pbcHght) {
        this.pbcHght = pbcHght;
    }

    public Integer getPbcWdth() {
        return pbcWdth;
    }

    public void setPbcWdth(Integer pbcWdth) {
        this.pbcWdth = pbcWdth;
    }

    public String getPbcPtrn() {
        return pbcPtrn;
    }

    public void setPbcPtrn(String pbcPtrn) {
        this.pbcPtrn = pbcPtrn;
    }

    public String getPbcBmap() {
        return pbcBmap;
    }

    public void setPbcBmap(String pbcBmap) {
        this.pbcBmap = pbcBmap;
    }

    public String getPbcInit() {
        return pbcInit;
    }

    public void setPbcInit(String pbcInit) {
        this.pbcInit = pbcInit;
    }

    public String getPbcCmnt() {
        return pbcCmnt;
    }

    public void setPbcCmnt(String pbcCmnt) {
        this.pbcCmnt = pbcCmnt;
    }

    public String getPbcEdit() {
        return pbcEdit;
    }

    public void setPbcEdit(String pbcEdit) {
        this.pbcEdit = pbcEdit;
    }

    public String getPbcTag() {
        return pbcTag;
    }

    public void setPbcTag(String pbcTag) {
        this.pbcTag = pbcTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbcTnam=").append(pbcTnam);
        sb.append(", pbcTid=").append(pbcTid);
        sb.append(", pbcOwnr=").append(pbcOwnr);
        sb.append(", pbcCnam=").append(pbcCnam);
        sb.append(", pbcCid=").append(pbcCid);
        sb.append(", pbcLabl=").append(pbcLabl);
        sb.append(", pbcLpos=").append(pbcLpos);
        sb.append(", pbcHdr=").append(pbcHdr);
        sb.append(", pbcHpos=").append(pbcHpos);
        sb.append(", pbcJtfy=").append(pbcJtfy);
        sb.append(", pbcMask=").append(pbcMask);
        sb.append(", pbcCase=").append(pbcCase);
        sb.append(", pbcHght=").append(pbcHght);
        sb.append(", pbcWdth=").append(pbcWdth);
        sb.append(", pbcPtrn=").append(pbcPtrn);
        sb.append(", pbcBmap=").append(pbcBmap);
        sb.append(", pbcInit=").append(pbcInit);
        sb.append(", pbcCmnt=").append(pbcCmnt);
        sb.append(", pbcEdit=").append(pbcEdit);
        sb.append(", pbcTag=").append(pbcTag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}