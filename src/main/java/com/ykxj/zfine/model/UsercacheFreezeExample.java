package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class UsercacheFreezeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsercacheFreezeExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
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

        public Criteria andFOpenidIsNull() {
            addCriterion("F_OpenId is null");
            return (Criteria) this;
        }

        public Criteria andFOpenidIsNotNull() {
            addCriterion("F_OpenId is not null");
            return (Criteria) this;
        }

        public Criteria andFOpenidEqualTo(String value) {
            addCriterion("F_OpenId =", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotEqualTo(String value) {
            addCriterion("F_OpenId <>", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidGreaterThan(String value) {
            addCriterion("F_OpenId >", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("F_OpenId >=", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLessThan(String value) {
            addCriterion("F_OpenId <", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLessThanOrEqualTo(String value) {
            addCriterion("F_OpenId <=", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidLike(String value) {
            addCriterion("F_OpenId like", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotLike(String value) {
            addCriterion("F_OpenId not like", value, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidIn(List<String> values) {
            addCriterion("F_OpenId in", values, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotIn(List<String> values) {
            addCriterion("F_OpenId not in", values, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidBetween(String value1, String value2) {
            addCriterion("F_OpenId between", value1, value2, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFOpenidNotBetween(String value1, String value2) {
            addCriterion("F_OpenId not between", value1, value2, "fOpenid");
            return (Criteria) this;
        }

        public Criteria andFPhoneIsNull() {
            addCriterion("F_Phone is null");
            return (Criteria) this;
        }

        public Criteria andFPhoneIsNotNull() {
            addCriterion("F_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andFPhoneEqualTo(String value) {
            addCriterion("F_Phone =", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotEqualTo(String value) {
            addCriterion("F_Phone <>", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneGreaterThan(String value) {
            addCriterion("F_Phone >", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("F_Phone >=", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLessThan(String value) {
            addCriterion("F_Phone <", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLessThanOrEqualTo(String value) {
            addCriterion("F_Phone <=", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLike(String value) {
            addCriterion("F_Phone like", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotLike(String value) {
            addCriterion("F_Phone not like", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneIn(List<String> values) {
            addCriterion("F_Phone in", values, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotIn(List<String> values) {
            addCriterion("F_Phone not in", values, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneBetween(String value1, String value2) {
            addCriterion("F_Phone between", value1, value2, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotBetween(String value1, String value2) {
            addCriterion("F_Phone not between", value1, value2, "fPhone");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNull() {
            addCriterion("DueTime is null");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNotNull() {
            addCriterion("DueTime is not null");
            return (Criteria) this;
        }

        public Criteria andDuetimeEqualTo(String value) {
            addCriterion("DueTime =", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotEqualTo(String value) {
            addCriterion("DueTime <>", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThan(String value) {
            addCriterion("DueTime >", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DueTime >=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThan(String value) {
            addCriterion("DueTime <", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThanOrEqualTo(String value) {
            addCriterion("DueTime <=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLike(String value) {
            addCriterion("DueTime like", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotLike(String value) {
            addCriterion("DueTime not like", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIn(List<String> values) {
            addCriterion("DueTime in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotIn(List<String> values) {
            addCriterion("DueTime not in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeBetween(String value1, String value2) {
            addCriterion("DueTime between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotBetween(String value1, String value2) {
            addCriterion("DueTime not between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("LoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(String value) {
            addCriterion("LoginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(String value) {
            addCriterion("LoginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(String value) {
            addCriterion("LoginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("LoginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(String value) {
            addCriterion("LoginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(String value) {
            addCriterion("LoginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLike(String value) {
            addCriterion("LoginTime like", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotLike(String value) {
            addCriterion("LoginTime not like", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<String> values) {
            addCriterion("LoginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<String> values) {
            addCriterion("LoginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(String value1, String value2) {
            addCriterion("LoginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(String value1, String value2) {
            addCriterion("LoginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(String value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(String value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(String value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(String value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(String value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLike(String value) {
            addCriterion("LastLoginTime like", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotLike(String value) {
            addCriterion("LastLoginTime not like", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<String> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<String> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(String value1, String value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(String value1, String value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
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

        public Criteria andIsinfoIsNull() {
            addCriterion("IsInfo is null");
            return (Criteria) this;
        }

        public Criteria andIsinfoIsNotNull() {
            addCriterion("IsInfo is not null");
            return (Criteria) this;
        }

        public Criteria andIsinfoEqualTo(String value) {
            addCriterion("IsInfo =", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoNotEqualTo(String value) {
            addCriterion("IsInfo <>", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoGreaterThan(String value) {
            addCriterion("IsInfo >", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoGreaterThanOrEqualTo(String value) {
            addCriterion("IsInfo >=", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoLessThan(String value) {
            addCriterion("IsInfo <", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoLessThanOrEqualTo(String value) {
            addCriterion("IsInfo <=", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoLike(String value) {
            addCriterion("IsInfo like", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoNotLike(String value) {
            addCriterion("IsInfo not like", value, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoIn(List<String> values) {
            addCriterion("IsInfo in", values, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoNotIn(List<String> values) {
            addCriterion("IsInfo not in", values, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoBetween(String value1, String value2) {
            addCriterion("IsInfo between", value1, value2, "isinfo");
            return (Criteria) this;
        }

        public Criteria andIsinfoNotBetween(String value1, String value2) {
            addCriterion("IsInfo not between", value1, value2, "isinfo");
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

        public Criteria andUnionidIsNull() {
            addCriterion("Unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("Unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("Unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("Unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("Unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("Unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("Unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("Unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("Unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("Unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("Unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("Unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("Unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("Unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidIsNull() {
            addCriterion("gzh_Openid is null");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidIsNotNull() {
            addCriterion("gzh_Openid is not null");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidEqualTo(String value) {
            addCriterion("gzh_Openid =", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidNotEqualTo(String value) {
            addCriterion("gzh_Openid <>", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidGreaterThan(String value) {
            addCriterion("gzh_Openid >", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("gzh_Openid >=", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidLessThan(String value) {
            addCriterion("gzh_Openid <", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidLessThanOrEqualTo(String value) {
            addCriterion("gzh_Openid <=", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidLike(String value) {
            addCriterion("gzh_Openid like", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidNotLike(String value) {
            addCriterion("gzh_Openid not like", value, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidIn(List<String> values) {
            addCriterion("gzh_Openid in", values, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidNotIn(List<String> values) {
            addCriterion("gzh_Openid not in", values, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidBetween(String value1, String value2) {
            addCriterion("gzh_Openid between", value1, value2, "gzhOpenid");
            return (Criteria) this;
        }

        public Criteria andGzhOpenidNotBetween(String value1, String value2) {
            addCriterion("gzh_Openid not between", value1, value2, "gzhOpenid");
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