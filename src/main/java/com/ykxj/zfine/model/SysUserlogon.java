package com.ykxj.zfine.model;

import java.io.Serializable;
import java.util.Date;

public class SysUserlogon implements Serializable {
    private String fId;

    private String fUserid;

    private String fUserpassword;

    private String fUsersecretkey;

    private Date fAllowstarttime;

    private Date fAllowendtime;

    private Date fLockstartdate;

    private Date fLockenddate;

    private Date fFirstvisittime;

    private Date fPreviousvisittime;

    private Date fLastvisittime;

    private Date fChangepassworddate;

    private Boolean fMultiuserlogin;

    private Integer fLogoncount;

    private Boolean fUseronline;

    private String fQuestion;

    private String fAnswerquestion;

    private Boolean fCheckipaddress;

    private String fLanguage;

    private String fTheme;

    private String passwordplaintext;

    private Boolean passwordstatue;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfUserid() {
        return fUserid;
    }

    public void setfUserid(String fUserid) {
        this.fUserid = fUserid;
    }

    public String getfUserpassword() {
        return fUserpassword;
    }

    public void setfUserpassword(String fUserpassword) {
        this.fUserpassword = fUserpassword;
    }

    public String getfUsersecretkey() {
        return fUsersecretkey;
    }

    public void setfUsersecretkey(String fUsersecretkey) {
        this.fUsersecretkey = fUsersecretkey;
    }

    public Date getfAllowstarttime() {
        return fAllowstarttime;
    }

    public void setfAllowstarttime(Date fAllowstarttime) {
        this.fAllowstarttime = fAllowstarttime;
    }

    public Date getfAllowendtime() {
        return fAllowendtime;
    }

    public void setfAllowendtime(Date fAllowendtime) {
        this.fAllowendtime = fAllowendtime;
    }

    public Date getfLockstartdate() {
        return fLockstartdate;
    }

    public void setfLockstartdate(Date fLockstartdate) {
        this.fLockstartdate = fLockstartdate;
    }

    public Date getfLockenddate() {
        return fLockenddate;
    }

    public void setfLockenddate(Date fLockenddate) {
        this.fLockenddate = fLockenddate;
    }

    public Date getfFirstvisittime() {
        return fFirstvisittime;
    }

    public void setfFirstvisittime(Date fFirstvisittime) {
        this.fFirstvisittime = fFirstvisittime;
    }

    public Date getfPreviousvisittime() {
        return fPreviousvisittime;
    }

    public void setfPreviousvisittime(Date fPreviousvisittime) {
        this.fPreviousvisittime = fPreviousvisittime;
    }

    public Date getfLastvisittime() {
        return fLastvisittime;
    }

    public void setfLastvisittime(Date fLastvisittime) {
        this.fLastvisittime = fLastvisittime;
    }

    public Date getfChangepassworddate() {
        return fChangepassworddate;
    }

    public void setfChangepassworddate(Date fChangepassworddate) {
        this.fChangepassworddate = fChangepassworddate;
    }

    public Boolean getfMultiuserlogin() {
        return fMultiuserlogin;
    }

    public void setfMultiuserlogin(Boolean fMultiuserlogin) {
        this.fMultiuserlogin = fMultiuserlogin;
    }

    public Integer getfLogoncount() {
        return fLogoncount;
    }

    public void setfLogoncount(Integer fLogoncount) {
        this.fLogoncount = fLogoncount;
    }

    public Boolean getfUseronline() {
        return fUseronline;
    }

    public void setfUseronline(Boolean fUseronline) {
        this.fUseronline = fUseronline;
    }

    public String getfQuestion() {
        return fQuestion;
    }

    public void setfQuestion(String fQuestion) {
        this.fQuestion = fQuestion;
    }

    public String getfAnswerquestion() {
        return fAnswerquestion;
    }

    public void setfAnswerquestion(String fAnswerquestion) {
        this.fAnswerquestion = fAnswerquestion;
    }

    public Boolean getfCheckipaddress() {
        return fCheckipaddress;
    }

    public void setfCheckipaddress(Boolean fCheckipaddress) {
        this.fCheckipaddress = fCheckipaddress;
    }

    public String getfLanguage() {
        return fLanguage;
    }

    public void setfLanguage(String fLanguage) {
        this.fLanguage = fLanguage;
    }

    public String getfTheme() {
        return fTheme;
    }

    public void setfTheme(String fTheme) {
        this.fTheme = fTheme;
    }

    public String getPasswordplaintext() {
        return passwordplaintext;
    }

    public void setPasswordplaintext(String passwordplaintext) {
        this.passwordplaintext = passwordplaintext;
    }

    public Boolean getPasswordstatue() {
        return passwordstatue;
    }

    public void setPasswordstatue(Boolean passwordstatue) {
        this.passwordstatue = passwordstatue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fId=").append(fId);
        sb.append(", fUserid=").append(fUserid);
        sb.append(", fUserpassword=").append(fUserpassword);
        sb.append(", fUsersecretkey=").append(fUsersecretkey);
        sb.append(", fAllowstarttime=").append(fAllowstarttime);
        sb.append(", fAllowendtime=").append(fAllowendtime);
        sb.append(", fLockstartdate=").append(fLockstartdate);
        sb.append(", fLockenddate=").append(fLockenddate);
        sb.append(", fFirstvisittime=").append(fFirstvisittime);
        sb.append(", fPreviousvisittime=").append(fPreviousvisittime);
        sb.append(", fLastvisittime=").append(fLastvisittime);
        sb.append(", fChangepassworddate=").append(fChangepassworddate);
        sb.append(", fMultiuserlogin=").append(fMultiuserlogin);
        sb.append(", fLogoncount=").append(fLogoncount);
        sb.append(", fUseronline=").append(fUseronline);
        sb.append(", fQuestion=").append(fQuestion);
        sb.append(", fAnswerquestion=").append(fAnswerquestion);
        sb.append(", fCheckipaddress=").append(fCheckipaddress);
        sb.append(", fLanguage=").append(fLanguage);
        sb.append(", fTheme=").append(fTheme);
        sb.append(", passwordplaintext=").append(passwordplaintext);
        sb.append(", passwordstatue=").append(passwordstatue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}