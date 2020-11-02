package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFIdIsNull() {
            addCriterion("F_Id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("F_Id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("F_Id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("F_Id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_Id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("F_Id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("F_Id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("F_Id like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("F_Id not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("F_Id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("F_Id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("F_Id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("F_Id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFAccountIsNull() {
            addCriterion("F_Account is null");
            return (Criteria) this;
        }

        public Criteria andFAccountIsNotNull() {
            addCriterion("F_Account is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountEqualTo(String value) {
            addCriterion("F_Account =", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotEqualTo(String value) {
            addCriterion("F_Account <>", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountGreaterThan(String value) {
            addCriterion("F_Account >", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountGreaterThanOrEqualTo(String value) {
            addCriterion("F_Account >=", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLessThan(String value) {
            addCriterion("F_Account <", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLessThanOrEqualTo(String value) {
            addCriterion("F_Account <=", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLike(String value) {
            addCriterion("F_Account like", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotLike(String value) {
            addCriterion("F_Account not like", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountIn(List<String> values) {
            addCriterion("F_Account in", values, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotIn(List<String> values) {
            addCriterion("F_Account not in", values, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountBetween(String value1, String value2) {
            addCriterion("F_Account between", value1, value2, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotBetween(String value1, String value2) {
            addCriterion("F_Account not between", value1, value2, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFRealnameIsNull() {
            addCriterion("F_RealName is null");
            return (Criteria) this;
        }

        public Criteria andFRealnameIsNotNull() {
            addCriterion("F_RealName is not null");
            return (Criteria) this;
        }

        public Criteria andFRealnameEqualTo(String value) {
            addCriterion("F_RealName =", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameNotEqualTo(String value) {
            addCriterion("F_RealName <>", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameGreaterThan(String value) {
            addCriterion("F_RealName >", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_RealName >=", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameLessThan(String value) {
            addCriterion("F_RealName <", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameLessThanOrEqualTo(String value) {
            addCriterion("F_RealName <=", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameLike(String value) {
            addCriterion("F_RealName like", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameNotLike(String value) {
            addCriterion("F_RealName not like", value, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameIn(List<String> values) {
            addCriterion("F_RealName in", values, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameNotIn(List<String> values) {
            addCriterion("F_RealName not in", values, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameBetween(String value1, String value2) {
            addCriterion("F_RealName between", value1, value2, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFRealnameNotBetween(String value1, String value2) {
            addCriterion("F_RealName not between", value1, value2, "fRealname");
            return (Criteria) this;
        }

        public Criteria andFNicknameIsNull() {
            addCriterion("F_NickName is null");
            return (Criteria) this;
        }

        public Criteria andFNicknameIsNotNull() {
            addCriterion("F_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andFNicknameEqualTo(String value) {
            addCriterion("F_NickName =", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotEqualTo(String value) {
            addCriterion("F_NickName <>", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameGreaterThan(String value) {
            addCriterion("F_NickName >", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NickName >=", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLessThan(String value) {
            addCriterion("F_NickName <", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLessThanOrEqualTo(String value) {
            addCriterion("F_NickName <=", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLike(String value) {
            addCriterion("F_NickName like", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotLike(String value) {
            addCriterion("F_NickName not like", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameIn(List<String> values) {
            addCriterion("F_NickName in", values, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotIn(List<String> values) {
            addCriterion("F_NickName not in", values, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameBetween(String value1, String value2) {
            addCriterion("F_NickName between", value1, value2, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotBetween(String value1, String value2) {
            addCriterion("F_NickName not between", value1, value2, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFHeadiconIsNull() {
            addCriterion("F_HeadIcon is null");
            return (Criteria) this;
        }

        public Criteria andFHeadiconIsNotNull() {
            addCriterion("F_HeadIcon is not null");
            return (Criteria) this;
        }

        public Criteria andFHeadiconEqualTo(String value) {
            addCriterion("F_HeadIcon =", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconNotEqualTo(String value) {
            addCriterion("F_HeadIcon <>", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconGreaterThan(String value) {
            addCriterion("F_HeadIcon >", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconGreaterThanOrEqualTo(String value) {
            addCriterion("F_HeadIcon >=", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconLessThan(String value) {
            addCriterion("F_HeadIcon <", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconLessThanOrEqualTo(String value) {
            addCriterion("F_HeadIcon <=", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconLike(String value) {
            addCriterion("F_HeadIcon like", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconNotLike(String value) {
            addCriterion("F_HeadIcon not like", value, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconIn(List<String> values) {
            addCriterion("F_HeadIcon in", values, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconNotIn(List<String> values) {
            addCriterion("F_HeadIcon not in", values, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconBetween(String value1, String value2) {
            addCriterion("F_HeadIcon between", value1, value2, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFHeadiconNotBetween(String value1, String value2) {
            addCriterion("F_HeadIcon not between", value1, value2, "fHeadicon");
            return (Criteria) this;
        }

        public Criteria andFGenderIsNull() {
            addCriterion("F_Gender is null");
            return (Criteria) this;
        }

        public Criteria andFGenderIsNotNull() {
            addCriterion("F_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andFGenderEqualTo(Boolean value) {
            addCriterion("F_Gender =", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderNotEqualTo(Boolean value) {
            addCriterion("F_Gender <>", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderGreaterThan(Boolean value) {
            addCriterion("F_Gender >", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_Gender >=", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderLessThan(Boolean value) {
            addCriterion("F_Gender <", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("F_Gender <=", value, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderIn(List<Boolean> values) {
            addCriterion("F_Gender in", values, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderNotIn(List<Boolean> values) {
            addCriterion("F_Gender not in", values, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("F_Gender between", value1, value2, "fGender");
            return (Criteria) this;
        }

        public Criteria andFGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_Gender not between", value1, value2, "fGender");
            return (Criteria) this;
        }

        public Criteria andFBirthdayIsNull() {
            addCriterion("F_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andFBirthdayIsNotNull() {
            addCriterion("F_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andFBirthdayEqualTo(Date value) {
            addCriterion("F_Birthday =", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayNotEqualTo(Date value) {
            addCriterion("F_Birthday <>", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayGreaterThan(Date value) {
            addCriterion("F_Birthday >", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("F_Birthday >=", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayLessThan(Date value) {
            addCriterion("F_Birthday <", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("F_Birthday <=", value, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayIn(List<Date> values) {
            addCriterion("F_Birthday in", values, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayNotIn(List<Date> values) {
            addCriterion("F_Birthday not in", values, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayBetween(Date value1, Date value2) {
            addCriterion("F_Birthday between", value1, value2, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("F_Birthday not between", value1, value2, "fBirthday");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIsNull() {
            addCriterion("F_MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIsNotNull() {
            addCriterion("F_MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneEqualTo(String value) {
            addCriterion("F_MobilePhone =", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotEqualTo(String value) {
            addCriterion("F_MobilePhone <>", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneGreaterThan(String value) {
            addCriterion("F_MobilePhone >", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("F_MobilePhone >=", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLessThan(String value) {
            addCriterion("F_MobilePhone <", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("F_MobilePhone <=", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLike(String value) {
            addCriterion("F_MobilePhone like", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotLike(String value) {
            addCriterion("F_MobilePhone not like", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIn(List<String> values) {
            addCriterion("F_MobilePhone in", values, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotIn(List<String> values) {
            addCriterion("F_MobilePhone not in", values, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneBetween(String value1, String value2) {
            addCriterion("F_MobilePhone between", value1, value2, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotBetween(String value1, String value2) {
            addCriterion("F_MobilePhone not between", value1, value2, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNull() {
            addCriterion("F_Email is null");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNotNull() {
            addCriterion("F_Email is not null");
            return (Criteria) this;
        }

        public Criteria andFEmailEqualTo(String value) {
            addCriterion("F_Email =", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotEqualTo(String value) {
            addCriterion("F_Email <>", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThan(String value) {
            addCriterion("F_Email >", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThanOrEqualTo(String value) {
            addCriterion("F_Email >=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThan(String value) {
            addCriterion("F_Email <", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThanOrEqualTo(String value) {
            addCriterion("F_Email <=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLike(String value) {
            addCriterion("F_Email like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotLike(String value) {
            addCriterion("F_Email not like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailIn(List<String> values) {
            addCriterion("F_Email in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotIn(List<String> values) {
            addCriterion("F_Email not in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailBetween(String value1, String value2) {
            addCriterion("F_Email between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotBetween(String value1, String value2) {
            addCriterion("F_Email not between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFWechatIsNull() {
            addCriterion("F_WeChat is null");
            return (Criteria) this;
        }

        public Criteria andFWechatIsNotNull() {
            addCriterion("F_WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andFWechatEqualTo(String value) {
            addCriterion("F_WeChat =", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotEqualTo(String value) {
            addCriterion("F_WeChat <>", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatGreaterThan(String value) {
            addCriterion("F_WeChat >", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatGreaterThanOrEqualTo(String value) {
            addCriterion("F_WeChat >=", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLessThan(String value) {
            addCriterion("F_WeChat <", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLessThanOrEqualTo(String value) {
            addCriterion("F_WeChat <=", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLike(String value) {
            addCriterion("F_WeChat like", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotLike(String value) {
            addCriterion("F_WeChat not like", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatIn(List<String> values) {
            addCriterion("F_WeChat in", values, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotIn(List<String> values) {
            addCriterion("F_WeChat not in", values, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatBetween(String value1, String value2) {
            addCriterion("F_WeChat between", value1, value2, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotBetween(String value1, String value2) {
            addCriterion("F_WeChat not between", value1, value2, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFManageridIsNull() {
            addCriterion("F_ManagerId is null");
            return (Criteria) this;
        }

        public Criteria andFManageridIsNotNull() {
            addCriterion("F_ManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andFManageridEqualTo(String value) {
            addCriterion("F_ManagerId =", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotEqualTo(String value) {
            addCriterion("F_ManagerId <>", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridGreaterThan(String value) {
            addCriterion("F_ManagerId >", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridGreaterThanOrEqualTo(String value) {
            addCriterion("F_ManagerId >=", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLessThan(String value) {
            addCriterion("F_ManagerId <", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLessThanOrEqualTo(String value) {
            addCriterion("F_ManagerId <=", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLike(String value) {
            addCriterion("F_ManagerId like", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotLike(String value) {
            addCriterion("F_ManagerId not like", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridIn(List<String> values) {
            addCriterion("F_ManagerId in", values, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotIn(List<String> values) {
            addCriterion("F_ManagerId not in", values, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridBetween(String value1, String value2) {
            addCriterion("F_ManagerId between", value1, value2, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotBetween(String value1, String value2) {
            addCriterion("F_ManagerId not between", value1, value2, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelIsNull() {
            addCriterion("F_SecurityLevel is null");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelIsNotNull() {
            addCriterion("F_SecurityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelEqualTo(Integer value) {
            addCriterion("F_SecurityLevel =", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelNotEqualTo(Integer value) {
            addCriterion("F_SecurityLevel <>", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelGreaterThan(Integer value) {
            addCriterion("F_SecurityLevel >", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_SecurityLevel >=", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelLessThan(Integer value) {
            addCriterion("F_SecurityLevel <", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelLessThanOrEqualTo(Integer value) {
            addCriterion("F_SecurityLevel <=", value, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelIn(List<Integer> values) {
            addCriterion("F_SecurityLevel in", values, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelNotIn(List<Integer> values) {
            addCriterion("F_SecurityLevel not in", values, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelBetween(Integer value1, Integer value2) {
            addCriterion("F_SecurityLevel between", value1, value2, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSecuritylevelNotBetween(Integer value1, Integer value2) {
            addCriterion("F_SecurityLevel not between", value1, value2, "fSecuritylevel");
            return (Criteria) this;
        }

        public Criteria andFSignatureIsNull() {
            addCriterion("F_Signature is null");
            return (Criteria) this;
        }

        public Criteria andFSignatureIsNotNull() {
            addCriterion("F_Signature is not null");
            return (Criteria) this;
        }

        public Criteria andFSignatureEqualTo(String value) {
            addCriterion("F_Signature =", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureNotEqualTo(String value) {
            addCriterion("F_Signature <>", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureGreaterThan(String value) {
            addCriterion("F_Signature >", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("F_Signature >=", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureLessThan(String value) {
            addCriterion("F_Signature <", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureLessThanOrEqualTo(String value) {
            addCriterion("F_Signature <=", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureLike(String value) {
            addCriterion("F_Signature like", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureNotLike(String value) {
            addCriterion("F_Signature not like", value, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureIn(List<String> values) {
            addCriterion("F_Signature in", values, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureNotIn(List<String> values) {
            addCriterion("F_Signature not in", values, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureBetween(String value1, String value2) {
            addCriterion("F_Signature between", value1, value2, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFSignatureNotBetween(String value1, String value2) {
            addCriterion("F_Signature not between", value1, value2, "fSignature");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidIsNull() {
            addCriterion("F_OrganizeId is null");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidIsNotNull() {
            addCriterion("F_OrganizeId is not null");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidEqualTo(String value) {
            addCriterion("F_OrganizeId =", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotEqualTo(String value) {
            addCriterion("F_OrganizeId <>", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidGreaterThan(String value) {
            addCriterion("F_OrganizeId >", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidGreaterThanOrEqualTo(String value) {
            addCriterion("F_OrganizeId >=", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLessThan(String value) {
            addCriterion("F_OrganizeId <", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLessThanOrEqualTo(String value) {
            addCriterion("F_OrganizeId <=", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLike(String value) {
            addCriterion("F_OrganizeId like", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotLike(String value) {
            addCriterion("F_OrganizeId not like", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidIn(List<String> values) {
            addCriterion("F_OrganizeId in", values, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotIn(List<String> values) {
            addCriterion("F_OrganizeId not in", values, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidBetween(String value1, String value2) {
            addCriterion("F_OrganizeId between", value1, value2, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotBetween(String value1, String value2) {
            addCriterion("F_OrganizeId not between", value1, value2, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidIsNull() {
            addCriterion("F_DepartmentId is null");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidIsNotNull() {
            addCriterion("F_DepartmentId is not null");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidEqualTo(String value) {
            addCriterion("F_DepartmentId =", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidNotEqualTo(String value) {
            addCriterion("F_DepartmentId <>", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidGreaterThan(String value) {
            addCriterion("F_DepartmentId >", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("F_DepartmentId >=", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidLessThan(String value) {
            addCriterion("F_DepartmentId <", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("F_DepartmentId <=", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidLike(String value) {
            addCriterion("F_DepartmentId like", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidNotLike(String value) {
            addCriterion("F_DepartmentId not like", value, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidIn(List<String> values) {
            addCriterion("F_DepartmentId in", values, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidNotIn(List<String> values) {
            addCriterion("F_DepartmentId not in", values, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidBetween(String value1, String value2) {
            addCriterion("F_DepartmentId between", value1, value2, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFDepartmentidNotBetween(String value1, String value2) {
            addCriterion("F_DepartmentId not between", value1, value2, "fDepartmentid");
            return (Criteria) this;
        }

        public Criteria andFRoleidIsNull() {
            addCriterion("F_RoleId is null");
            return (Criteria) this;
        }

        public Criteria andFRoleidIsNotNull() {
            addCriterion("F_RoleId is not null");
            return (Criteria) this;
        }

        public Criteria andFRoleidEqualTo(String value) {
            addCriterion("F_RoleId =", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotEqualTo(String value) {
            addCriterion("F_RoleId <>", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidGreaterThan(String value) {
            addCriterion("F_RoleId >", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("F_RoleId >=", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLessThan(String value) {
            addCriterion("F_RoleId <", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLessThanOrEqualTo(String value) {
            addCriterion("F_RoleId <=", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLike(String value) {
            addCriterion("F_RoleId like", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotLike(String value) {
            addCriterion("F_RoleId not like", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidIn(List<String> values) {
            addCriterion("F_RoleId in", values, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotIn(List<String> values) {
            addCriterion("F_RoleId not in", values, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidBetween(String value1, String value2) {
            addCriterion("F_RoleId between", value1, value2, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotBetween(String value1, String value2) {
            addCriterion("F_RoleId not between", value1, value2, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFDutyidIsNull() {
            addCriterion("F_DutyId is null");
            return (Criteria) this;
        }

        public Criteria andFDutyidIsNotNull() {
            addCriterion("F_DutyId is not null");
            return (Criteria) this;
        }

        public Criteria andFDutyidEqualTo(String value) {
            addCriterion("F_DutyId =", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidNotEqualTo(String value) {
            addCriterion("F_DutyId <>", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidGreaterThan(String value) {
            addCriterion("F_DutyId >", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidGreaterThanOrEqualTo(String value) {
            addCriterion("F_DutyId >=", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidLessThan(String value) {
            addCriterion("F_DutyId <", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidLessThanOrEqualTo(String value) {
            addCriterion("F_DutyId <=", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidLike(String value) {
            addCriterion("F_DutyId like", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidNotLike(String value) {
            addCriterion("F_DutyId not like", value, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidIn(List<String> values) {
            addCriterion("F_DutyId in", values, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidNotIn(List<String> values) {
            addCriterion("F_DutyId not in", values, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidBetween(String value1, String value2) {
            addCriterion("F_DutyId between", value1, value2, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFDutyidNotBetween(String value1, String value2) {
            addCriterion("F_DutyId not between", value1, value2, "fDutyid");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorIsNull() {
            addCriterion("F_IsAdministrator is null");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorIsNotNull() {
            addCriterion("F_IsAdministrator is not null");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorEqualTo(Boolean value) {
            addCriterion("F_IsAdministrator =", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorNotEqualTo(Boolean value) {
            addCriterion("F_IsAdministrator <>", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorGreaterThan(Boolean value) {
            addCriterion("F_IsAdministrator >", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_IsAdministrator >=", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorLessThan(Boolean value) {
            addCriterion("F_IsAdministrator <", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorLessThanOrEqualTo(Boolean value) {
            addCriterion("F_IsAdministrator <=", value, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorIn(List<Boolean> values) {
            addCriterion("F_IsAdministrator in", values, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorNotIn(List<Boolean> values) {
            addCriterion("F_IsAdministrator not in", values, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorBetween(Boolean value1, Boolean value2) {
            addCriterion("F_IsAdministrator between", value1, value2, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFIsadministratorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_IsAdministrator not between", value1, value2, "fIsadministrator");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIsNull() {
            addCriterion("F_SortCode is null");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIsNotNull() {
            addCriterion("F_SortCode is not null");
            return (Criteria) this;
        }

        public Criteria andFSortcodeEqualTo(Integer value) {
            addCriterion("F_SortCode =", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotEqualTo(Integer value) {
            addCriterion("F_SortCode <>", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeGreaterThan(Integer value) {
            addCriterion("F_SortCode >", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode >=", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeLessThan(Integer value) {
            addCriterion("F_SortCode <", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeLessThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode <=", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIn(List<Integer> values) {
            addCriterion("F_SortCode in", values, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotIn(List<Integer> values) {
            addCriterion("F_SortCode not in", values, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode between", value1, value2, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode not between", value1, value2, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIsNull() {
            addCriterion("F_DeleteMark is null");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIsNotNull() {
            addCriterion("F_DeleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkEqualTo(Boolean value) {
            addCriterion("F_DeleteMark =", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <>", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkGreaterThan(Boolean value) {
            addCriterion("F_DeleteMark >", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark >=", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkLessThan(Boolean value) {
            addCriterion("F_DeleteMark <", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <=", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIn(List<Boolean> values) {
            addCriterion("F_DeleteMark in", values, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotIn(List<Boolean> values) {
            addCriterion("F_DeleteMark not in", values, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark between", value1, value2, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark not between", value1, value2, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIsNull() {
            addCriterion("F_EnabledMark is null");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIsNotNull() {
            addCriterion("F_EnabledMark is not null");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkEqualTo(Boolean value) {
            addCriterion("F_EnabledMark =", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <>", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkGreaterThan(Boolean value) {
            addCriterion("F_EnabledMark >", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark >=", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkLessThan(Boolean value) {
            addCriterion("F_EnabledMark <", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <=", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIn(List<Boolean> values) {
            addCriterion("F_EnabledMark in", values, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotIn(List<Boolean> values) {
            addCriterion("F_EnabledMark not in", values, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark between", value1, value2, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark not between", value1, value2, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNull() {
            addCriterion("F_Description is null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNotNull() {
            addCriterion("F_Description is not null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionEqualTo(String value) {
            addCriterion("F_Description =", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotEqualTo(String value) {
            addCriterion("F_Description <>", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThan(String value) {
            addCriterion("F_Description >", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("F_Description >=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThan(String value) {
            addCriterion("F_Description <", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThanOrEqualTo(String value) {
            addCriterion("F_Description <=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLike(String value) {
            addCriterion("F_Description like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotLike(String value) {
            addCriterion("F_Description not like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIn(List<String> values) {
            addCriterion("F_Description in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotIn(List<String> values) {
            addCriterion("F_Description not in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionBetween(String value1, String value2) {
            addCriterion("F_Description between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotBetween(String value1, String value2) {
            addCriterion("F_Description not between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIsNull() {
            addCriterion("F_CreatorTime is null");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIsNotNull() {
            addCriterion("F_CreatorTime is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeEqualTo(Date value) {
            addCriterion("F_CreatorTime =", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotEqualTo(Date value) {
            addCriterion("F_CreatorTime <>", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeGreaterThan(Date value) {
            addCriterion("F_CreatorTime >", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime >=", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeLessThan(Date value) {
            addCriterion("F_CreatorTime <", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeLessThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime <=", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIn(List<Date> values) {
            addCriterion("F_CreatorTime in", values, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotIn(List<Date> values) {
            addCriterion("F_CreatorTime not in", values, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime between", value1, value2, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime not between", value1, value2, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIsNull() {
            addCriterion("F_CreatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIsNotNull() {
            addCriterion("F_CreatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridEqualTo(String value) {
            addCriterion("F_CreatorUserId =", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotEqualTo(String value) {
            addCriterion("F_CreatorUserId <>", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridGreaterThan(String value) {
            addCriterion("F_CreatorUserId >", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId >=", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLessThan(String value) {
            addCriterion("F_CreatorUserId <", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLessThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId <=", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLike(String value) {
            addCriterion("F_CreatorUserId like", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotLike(String value) {
            addCriterion("F_CreatorUserId not like", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIn(List<String> values) {
            addCriterion("F_CreatorUserId in", values, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotIn(List<String> values) {
            addCriterion("F_CreatorUserId not in", values, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId between", value1, value2, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId not between", value1, value2, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIsNull() {
            addCriterion("F_LastModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIsNotNull() {
            addCriterion("F_LastModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeEqualTo(Date value) {
            addCriterion("F_LastModifyTime =", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotEqualTo(Date value) {
            addCriterion("F_LastModifyTime <>", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeGreaterThan(Date value) {
            addCriterion("F_LastModifyTime >", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime >=", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeLessThan(Date value) {
            addCriterion("F_LastModifyTime <", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeLessThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime <=", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIn(List<Date> values) {
            addCriterion("F_LastModifyTime in", values, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotIn(List<Date> values) {
            addCriterion("F_LastModifyTime not in", values, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime between", value1, value2, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime not between", value1, value2, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIsNull() {
            addCriterion("F_LastModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIsNotNull() {
            addCriterion("F_LastModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridEqualTo(String value) {
            addCriterion("F_LastModifyUserId =", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotEqualTo(String value) {
            addCriterion("F_LastModifyUserId <>", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridGreaterThan(String value) {
            addCriterion("F_LastModifyUserId >", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId >=", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLessThan(String value) {
            addCriterion("F_LastModifyUserId <", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLessThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId <=", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLike(String value) {
            addCriterion("F_LastModifyUserId like", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotLike(String value) {
            addCriterion("F_LastModifyUserId not like", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIn(List<String> values) {
            addCriterion("F_LastModifyUserId in", values, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotIn(List<String> values) {
            addCriterion("F_LastModifyUserId not in", values, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId between", value1, value2, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId not between", value1, value2, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIsNull() {
            addCriterion("F_DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIsNotNull() {
            addCriterion("F_DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeEqualTo(Date value) {
            addCriterion("F_DeleteTime =", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotEqualTo(Date value) {
            addCriterion("F_DeleteTime <>", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeGreaterThan(Date value) {
            addCriterion("F_DeleteTime >", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime >=", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeLessThan(Date value) {
            addCriterion("F_DeleteTime <", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime <=", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIn(List<Date> values) {
            addCriterion("F_DeleteTime in", values, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotIn(List<Date> values) {
            addCriterion("F_DeleteTime not in", values, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime between", value1, value2, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime not between", value1, value2, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIsNull() {
            addCriterion("F_DeleteUserId is null");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIsNotNull() {
            addCriterion("F_DeleteUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridEqualTo(String value) {
            addCriterion("F_DeleteUserId =", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotEqualTo(String value) {
            addCriterion("F_DeleteUserId <>", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridGreaterThan(String value) {
            addCriterion("F_DeleteUserId >", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId >=", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLessThan(String value) {
            addCriterion("F_DeleteUserId <", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLessThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId <=", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLike(String value) {
            addCriterion("F_DeleteUserId like", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotLike(String value) {
            addCriterion("F_DeleteUserId not like", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIn(List<String> values) {
            addCriterion("F_DeleteUserId in", values, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotIn(List<String> values) {
            addCriterion("F_DeleteUserId not in", values, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId between", value1, value2, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId not between", value1, value2, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("Areas is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("Areas is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(Integer value) {
            addCriterion("Areas =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(Integer value) {
            addCriterion("Areas <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(Integer value) {
            addCriterion("Areas >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(Integer value) {
            addCriterion("Areas >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(Integer value) {
            addCriterion("Areas <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(Integer value) {
            addCriterion("Areas <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<Integer> values) {
            addCriterion("Areas in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<Integer> values) {
            addCriterion("Areas not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(Integer value1, Integer value2) {
            addCriterion("Areas between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(Integer value1, Integer value2) {
            addCriterion("Areas not between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andOrgansIsNull() {
            addCriterion("Organs is null");
            return (Criteria) this;
        }

        public Criteria andOrgansIsNotNull() {
            addCriterion("Organs is not null");
            return (Criteria) this;
        }

        public Criteria andOrgansEqualTo(Integer value) {
            addCriterion("Organs =", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansNotEqualTo(Integer value) {
            addCriterion("Organs <>", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansGreaterThan(Integer value) {
            addCriterion("Organs >", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansGreaterThanOrEqualTo(Integer value) {
            addCriterion("Organs >=", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansLessThan(Integer value) {
            addCriterion("Organs <", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansLessThanOrEqualTo(Integer value) {
            addCriterion("Organs <=", value, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansIn(List<Integer> values) {
            addCriterion("Organs in", values, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansNotIn(List<Integer> values) {
            addCriterion("Organs not in", values, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansBetween(Integer value1, Integer value2) {
            addCriterion("Organs between", value1, value2, "organs");
            return (Criteria) this;
        }

        public Criteria andOrgansNotBetween(Integer value1, Integer value2) {
            addCriterion("Organs not between", value1, value2, "organs");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidIsNull() {
            addCriterion("Info_Openid is null");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidIsNotNull() {
            addCriterion("Info_Openid is not null");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidEqualTo(String value) {
            addCriterion("Info_Openid =", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidNotEqualTo(String value) {
            addCriterion("Info_Openid <>", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidGreaterThan(String value) {
            addCriterion("Info_Openid >", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("Info_Openid >=", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidLessThan(String value) {
            addCriterion("Info_Openid <", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidLessThanOrEqualTo(String value) {
            addCriterion("Info_Openid <=", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidLike(String value) {
            addCriterion("Info_Openid like", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidNotLike(String value) {
            addCriterion("Info_Openid not like", value, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidIn(List<String> values) {
            addCriterion("Info_Openid in", values, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidNotIn(List<String> values) {
            addCriterion("Info_Openid not in", values, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidBetween(String value1, String value2) {
            addCriterion("Info_Openid between", value1, value2, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andInfoOpenidNotBetween(String value1, String value2) {
            addCriterion("Info_Openid not between", value1, value2, "infoOpenid");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("UserCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("UserCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("UserCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("UserCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("UserCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UserCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("UserCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("UserCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("UserCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("UserCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("UserCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("UserCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("UserCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("UserCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUserheadIsNull() {
            addCriterion("UserHead is null");
            return (Criteria) this;
        }

        public Criteria andUserheadIsNotNull() {
            addCriterion("UserHead is not null");
            return (Criteria) this;
        }

        public Criteria andUserheadEqualTo(String value) {
            addCriterion("UserHead =", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadNotEqualTo(String value) {
            addCriterion("UserHead <>", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadGreaterThan(String value) {
            addCriterion("UserHead >", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadGreaterThanOrEqualTo(String value) {
            addCriterion("UserHead >=", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadLessThan(String value) {
            addCriterion("UserHead <", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadLessThanOrEqualTo(String value) {
            addCriterion("UserHead <=", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadLike(String value) {
            addCriterion("UserHead like", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadNotLike(String value) {
            addCriterion("UserHead not like", value, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadIn(List<String> values) {
            addCriterion("UserHead in", values, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadNotIn(List<String> values) {
            addCriterion("UserHead not in", values, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadBetween(String value1, String value2) {
            addCriterion("UserHead between", value1, value2, "userhead");
            return (Criteria) this;
        }

        public Criteria andUserheadNotBetween(String value1, String value2) {
            addCriterion("UserHead not between", value1, value2, "userhead");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("F_Type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("F_Type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("F_Type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("F_Type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("F_Type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_Type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("F_Type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("F_Type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("F_Type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("F_Type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("F_Type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("F_Type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("F_Type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("F_Type not between", value1, value2, "fType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}