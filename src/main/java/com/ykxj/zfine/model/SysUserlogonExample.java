package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserlogonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserlogonExample() {
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

        public Criteria andFUseridIsNull() {
            addCriterion("F_UserId is null");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNotNull() {
            addCriterion("F_UserId is not null");
            return (Criteria) this;
        }

        public Criteria andFUseridEqualTo(String value) {
            addCriterion("F_UserId =", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotEqualTo(String value) {
            addCriterion("F_UserId <>", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThan(String value) {
            addCriterion("F_UserId >", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_UserId >=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThan(String value) {
            addCriterion("F_UserId <", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThanOrEqualTo(String value) {
            addCriterion("F_UserId <=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLike(String value) {
            addCriterion("F_UserId like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotLike(String value) {
            addCriterion("F_UserId not like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridIn(List<String> values) {
            addCriterion("F_UserId in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotIn(List<String> values) {
            addCriterion("F_UserId not in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridBetween(String value1, String value2) {
            addCriterion("F_UserId between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotBetween(String value1, String value2) {
            addCriterion("F_UserId not between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordIsNull() {
            addCriterion("F_UserPassword is null");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordIsNotNull() {
            addCriterion("F_UserPassword is not null");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordEqualTo(String value) {
            addCriterion("F_UserPassword =", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordNotEqualTo(String value) {
            addCriterion("F_UserPassword <>", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordGreaterThan(String value) {
            addCriterion("F_UserPassword >", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("F_UserPassword >=", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordLessThan(String value) {
            addCriterion("F_UserPassword <", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("F_UserPassword <=", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordLike(String value) {
            addCriterion("F_UserPassword like", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordNotLike(String value) {
            addCriterion("F_UserPassword not like", value, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordIn(List<String> values) {
            addCriterion("F_UserPassword in", values, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordNotIn(List<String> values) {
            addCriterion("F_UserPassword not in", values, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordBetween(String value1, String value2) {
            addCriterion("F_UserPassword between", value1, value2, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUserpasswordNotBetween(String value1, String value2) {
            addCriterion("F_UserPassword not between", value1, value2, "fUserpassword");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyIsNull() {
            addCriterion("F_UserSecretkey is null");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyIsNotNull() {
            addCriterion("F_UserSecretkey is not null");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyEqualTo(String value) {
            addCriterion("F_UserSecretkey =", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyNotEqualTo(String value) {
            addCriterion("F_UserSecretkey <>", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyGreaterThan(String value) {
            addCriterion("F_UserSecretkey >", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_UserSecretkey >=", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyLessThan(String value) {
            addCriterion("F_UserSecretkey <", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyLessThanOrEqualTo(String value) {
            addCriterion("F_UserSecretkey <=", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyLike(String value) {
            addCriterion("F_UserSecretkey like", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyNotLike(String value) {
            addCriterion("F_UserSecretkey not like", value, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyIn(List<String> values) {
            addCriterion("F_UserSecretkey in", values, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyNotIn(List<String> values) {
            addCriterion("F_UserSecretkey not in", values, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyBetween(String value1, String value2) {
            addCriterion("F_UserSecretkey between", value1, value2, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFUsersecretkeyNotBetween(String value1, String value2) {
            addCriterion("F_UserSecretkey not between", value1, value2, "fUsersecretkey");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeIsNull() {
            addCriterion("F_AllowStartTime is null");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeIsNotNull() {
            addCriterion("F_AllowStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeEqualTo(Date value) {
            addCriterion("F_AllowStartTime =", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeNotEqualTo(Date value) {
            addCriterion("F_AllowStartTime <>", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeGreaterThan(Date value) {
            addCriterion("F_AllowStartTime >", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_AllowStartTime >=", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeLessThan(Date value) {
            addCriterion("F_AllowStartTime <", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("F_AllowStartTime <=", value, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeIn(List<Date> values) {
            addCriterion("F_AllowStartTime in", values, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeNotIn(List<Date> values) {
            addCriterion("F_AllowStartTime not in", values, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeBetween(Date value1, Date value2) {
            addCriterion("F_AllowStartTime between", value1, value2, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("F_AllowStartTime not between", value1, value2, "fAllowstarttime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeIsNull() {
            addCriterion("F_AllowEndTime is null");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeIsNotNull() {
            addCriterion("F_AllowEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeEqualTo(Date value) {
            addCriterion("F_AllowEndTime =", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeNotEqualTo(Date value) {
            addCriterion("F_AllowEndTime <>", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeGreaterThan(Date value) {
            addCriterion("F_AllowEndTime >", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_AllowEndTime >=", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeLessThan(Date value) {
            addCriterion("F_AllowEndTime <", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeLessThanOrEqualTo(Date value) {
            addCriterion("F_AllowEndTime <=", value, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeIn(List<Date> values) {
            addCriterion("F_AllowEndTime in", values, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeNotIn(List<Date> values) {
            addCriterion("F_AllowEndTime not in", values, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeBetween(Date value1, Date value2) {
            addCriterion("F_AllowEndTime between", value1, value2, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFAllowendtimeNotBetween(Date value1, Date value2) {
            addCriterion("F_AllowEndTime not between", value1, value2, "fAllowendtime");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateIsNull() {
            addCriterion("F_LockStartDate is null");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateIsNotNull() {
            addCriterion("F_LockStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateEqualTo(Date value) {
            addCriterion("F_LockStartDate =", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateNotEqualTo(Date value) {
            addCriterion("F_LockStartDate <>", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateGreaterThan(Date value) {
            addCriterion("F_LockStartDate >", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LockStartDate >=", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateLessThan(Date value) {
            addCriterion("F_LockStartDate <", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateLessThanOrEqualTo(Date value) {
            addCriterion("F_LockStartDate <=", value, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateIn(List<Date> values) {
            addCriterion("F_LockStartDate in", values, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateNotIn(List<Date> values) {
            addCriterion("F_LockStartDate not in", values, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateBetween(Date value1, Date value2) {
            addCriterion("F_LockStartDate between", value1, value2, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockstartdateNotBetween(Date value1, Date value2) {
            addCriterion("F_LockStartDate not between", value1, value2, "fLockstartdate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateIsNull() {
            addCriterion("F_LockEndDate is null");
            return (Criteria) this;
        }

        public Criteria andFLockenddateIsNotNull() {
            addCriterion("F_LockEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andFLockenddateEqualTo(Date value) {
            addCriterion("F_LockEndDate =", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateNotEqualTo(Date value) {
            addCriterion("F_LockEndDate <>", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateGreaterThan(Date value) {
            addCriterion("F_LockEndDate >", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LockEndDate >=", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateLessThan(Date value) {
            addCriterion("F_LockEndDate <", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateLessThanOrEqualTo(Date value) {
            addCriterion("F_LockEndDate <=", value, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateIn(List<Date> values) {
            addCriterion("F_LockEndDate in", values, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateNotIn(List<Date> values) {
            addCriterion("F_LockEndDate not in", values, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateBetween(Date value1, Date value2) {
            addCriterion("F_LockEndDate between", value1, value2, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFLockenddateNotBetween(Date value1, Date value2) {
            addCriterion("F_LockEndDate not between", value1, value2, "fLockenddate");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeIsNull() {
            addCriterion("F_FirstVisitTime is null");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeIsNotNull() {
            addCriterion("F_FirstVisitTime is not null");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeEqualTo(Date value) {
            addCriterion("F_FirstVisitTime =", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeNotEqualTo(Date value) {
            addCriterion("F_FirstVisitTime <>", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeGreaterThan(Date value) {
            addCriterion("F_FirstVisitTime >", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_FirstVisitTime >=", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeLessThan(Date value) {
            addCriterion("F_FirstVisitTime <", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeLessThanOrEqualTo(Date value) {
            addCriterion("F_FirstVisitTime <=", value, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeIn(List<Date> values) {
            addCriterion("F_FirstVisitTime in", values, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeNotIn(List<Date> values) {
            addCriterion("F_FirstVisitTime not in", values, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeBetween(Date value1, Date value2) {
            addCriterion("F_FirstVisitTime between", value1, value2, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFFirstvisittimeNotBetween(Date value1, Date value2) {
            addCriterion("F_FirstVisitTime not between", value1, value2, "fFirstvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeIsNull() {
            addCriterion("F_PreviousVisitTime is null");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeIsNotNull() {
            addCriterion("F_PreviousVisitTime is not null");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeEqualTo(Date value) {
            addCriterion("F_PreviousVisitTime =", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeNotEqualTo(Date value) {
            addCriterion("F_PreviousVisitTime <>", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeGreaterThan(Date value) {
            addCriterion("F_PreviousVisitTime >", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_PreviousVisitTime >=", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeLessThan(Date value) {
            addCriterion("F_PreviousVisitTime <", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeLessThanOrEqualTo(Date value) {
            addCriterion("F_PreviousVisitTime <=", value, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeIn(List<Date> values) {
            addCriterion("F_PreviousVisitTime in", values, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeNotIn(List<Date> values) {
            addCriterion("F_PreviousVisitTime not in", values, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeBetween(Date value1, Date value2) {
            addCriterion("F_PreviousVisitTime between", value1, value2, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFPreviousvisittimeNotBetween(Date value1, Date value2) {
            addCriterion("F_PreviousVisitTime not between", value1, value2, "fPreviousvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeIsNull() {
            addCriterion("F_LastVisitTime is null");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeIsNotNull() {
            addCriterion("F_LastVisitTime is not null");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeEqualTo(Date value) {
            addCriterion("F_LastVisitTime =", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeNotEqualTo(Date value) {
            addCriterion("F_LastVisitTime <>", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeGreaterThan(Date value) {
            addCriterion("F_LastVisitTime >", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LastVisitTime >=", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeLessThan(Date value) {
            addCriterion("F_LastVisitTime <", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeLessThanOrEqualTo(Date value) {
            addCriterion("F_LastVisitTime <=", value, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeIn(List<Date> values) {
            addCriterion("F_LastVisitTime in", values, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeNotIn(List<Date> values) {
            addCriterion("F_LastVisitTime not in", values, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeBetween(Date value1, Date value2) {
            addCriterion("F_LastVisitTime between", value1, value2, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFLastvisittimeNotBetween(Date value1, Date value2) {
            addCriterion("F_LastVisitTime not between", value1, value2, "fLastvisittime");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateIsNull() {
            addCriterion("F_ChangePasswordDate is null");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateIsNotNull() {
            addCriterion("F_ChangePasswordDate is not null");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateEqualTo(Date value) {
            addCriterion("F_ChangePasswordDate =", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateNotEqualTo(Date value) {
            addCriterion("F_ChangePasswordDate <>", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateGreaterThan(Date value) {
            addCriterion("F_ChangePasswordDate >", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateGreaterThanOrEqualTo(Date value) {
            addCriterion("F_ChangePasswordDate >=", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateLessThan(Date value) {
            addCriterion("F_ChangePasswordDate <", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateLessThanOrEqualTo(Date value) {
            addCriterion("F_ChangePasswordDate <=", value, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateIn(List<Date> values) {
            addCriterion("F_ChangePasswordDate in", values, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateNotIn(List<Date> values) {
            addCriterion("F_ChangePasswordDate not in", values, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateBetween(Date value1, Date value2) {
            addCriterion("F_ChangePasswordDate between", value1, value2, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFChangepassworddateNotBetween(Date value1, Date value2) {
            addCriterion("F_ChangePasswordDate not between", value1, value2, "fChangepassworddate");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginIsNull() {
            addCriterion("F_MultiUserLogin is null");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginIsNotNull() {
            addCriterion("F_MultiUserLogin is not null");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginEqualTo(Boolean value) {
            addCriterion("F_MultiUserLogin =", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginNotEqualTo(Boolean value) {
            addCriterion("F_MultiUserLogin <>", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginGreaterThan(Boolean value) {
            addCriterion("F_MultiUserLogin >", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_MultiUserLogin >=", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginLessThan(Boolean value) {
            addCriterion("F_MultiUserLogin <", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginLessThanOrEqualTo(Boolean value) {
            addCriterion("F_MultiUserLogin <=", value, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginIn(List<Boolean> values) {
            addCriterion("F_MultiUserLogin in", values, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginNotIn(List<Boolean> values) {
            addCriterion("F_MultiUserLogin not in", values, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginBetween(Boolean value1, Boolean value2) {
            addCriterion("F_MultiUserLogin between", value1, value2, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFMultiuserloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_MultiUserLogin not between", value1, value2, "fMultiuserlogin");
            return (Criteria) this;
        }

        public Criteria andFLogoncountIsNull() {
            addCriterion("F_LogOnCount is null");
            return (Criteria) this;
        }

        public Criteria andFLogoncountIsNotNull() {
            addCriterion("F_LogOnCount is not null");
            return (Criteria) this;
        }

        public Criteria andFLogoncountEqualTo(Integer value) {
            addCriterion("F_LogOnCount =", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountNotEqualTo(Integer value) {
            addCriterion("F_LogOnCount <>", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountGreaterThan(Integer value) {
            addCriterion("F_LogOnCount >", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_LogOnCount >=", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountLessThan(Integer value) {
            addCriterion("F_LogOnCount <", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountLessThanOrEqualTo(Integer value) {
            addCriterion("F_LogOnCount <=", value, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountIn(List<Integer> values) {
            addCriterion("F_LogOnCount in", values, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountNotIn(List<Integer> values) {
            addCriterion("F_LogOnCount not in", values, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountBetween(Integer value1, Integer value2) {
            addCriterion("F_LogOnCount between", value1, value2, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFLogoncountNotBetween(Integer value1, Integer value2) {
            addCriterion("F_LogOnCount not between", value1, value2, "fLogoncount");
            return (Criteria) this;
        }

        public Criteria andFUseronlineIsNull() {
            addCriterion("F_UserOnLine is null");
            return (Criteria) this;
        }

        public Criteria andFUseronlineIsNotNull() {
            addCriterion("F_UserOnLine is not null");
            return (Criteria) this;
        }

        public Criteria andFUseronlineEqualTo(Boolean value) {
            addCriterion("F_UserOnLine =", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineNotEqualTo(Boolean value) {
            addCriterion("F_UserOnLine <>", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineGreaterThan(Boolean value) {
            addCriterion("F_UserOnLine >", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_UserOnLine >=", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineLessThan(Boolean value) {
            addCriterion("F_UserOnLine <", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineLessThanOrEqualTo(Boolean value) {
            addCriterion("F_UserOnLine <=", value, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineIn(List<Boolean> values) {
            addCriterion("F_UserOnLine in", values, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineNotIn(List<Boolean> values) {
            addCriterion("F_UserOnLine not in", values, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineBetween(Boolean value1, Boolean value2) {
            addCriterion("F_UserOnLine between", value1, value2, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFUseronlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_UserOnLine not between", value1, value2, "fUseronline");
            return (Criteria) this;
        }

        public Criteria andFQuestionIsNull() {
            addCriterion("F_Question is null");
            return (Criteria) this;
        }

        public Criteria andFQuestionIsNotNull() {
            addCriterion("F_Question is not null");
            return (Criteria) this;
        }

        public Criteria andFQuestionEqualTo(String value) {
            addCriterion("F_Question =", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionNotEqualTo(String value) {
            addCriterion("F_Question <>", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionGreaterThan(String value) {
            addCriterion("F_Question >", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("F_Question >=", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionLessThan(String value) {
            addCriterion("F_Question <", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionLessThanOrEqualTo(String value) {
            addCriterion("F_Question <=", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionLike(String value) {
            addCriterion("F_Question like", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionNotLike(String value) {
            addCriterion("F_Question not like", value, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionIn(List<String> values) {
            addCriterion("F_Question in", values, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionNotIn(List<String> values) {
            addCriterion("F_Question not in", values, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionBetween(String value1, String value2) {
            addCriterion("F_Question between", value1, value2, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFQuestionNotBetween(String value1, String value2) {
            addCriterion("F_Question not between", value1, value2, "fQuestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionIsNull() {
            addCriterion("F_AnswerQuestion is null");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionIsNotNull() {
            addCriterion("F_AnswerQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionEqualTo(String value) {
            addCriterion("F_AnswerQuestion =", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionNotEqualTo(String value) {
            addCriterion("F_AnswerQuestion <>", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionGreaterThan(String value) {
            addCriterion("F_AnswerQuestion >", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionGreaterThanOrEqualTo(String value) {
            addCriterion("F_AnswerQuestion >=", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionLessThan(String value) {
            addCriterion("F_AnswerQuestion <", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionLessThanOrEqualTo(String value) {
            addCriterion("F_AnswerQuestion <=", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionLike(String value) {
            addCriterion("F_AnswerQuestion like", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionNotLike(String value) {
            addCriterion("F_AnswerQuestion not like", value, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionIn(List<String> values) {
            addCriterion("F_AnswerQuestion in", values, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionNotIn(List<String> values) {
            addCriterion("F_AnswerQuestion not in", values, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionBetween(String value1, String value2) {
            addCriterion("F_AnswerQuestion between", value1, value2, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFAnswerquestionNotBetween(String value1, String value2) {
            addCriterion("F_AnswerQuestion not between", value1, value2, "fAnswerquestion");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressIsNull() {
            addCriterion("F_CheckIPAddress is null");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressIsNotNull() {
            addCriterion("F_CheckIPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressEqualTo(Boolean value) {
            addCriterion("F_CheckIPAddress =", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressNotEqualTo(Boolean value) {
            addCriterion("F_CheckIPAddress <>", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressGreaterThan(Boolean value) {
            addCriterion("F_CheckIPAddress >", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_CheckIPAddress >=", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressLessThan(Boolean value) {
            addCriterion("F_CheckIPAddress <", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressLessThanOrEqualTo(Boolean value) {
            addCriterion("F_CheckIPAddress <=", value, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressIn(List<Boolean> values) {
            addCriterion("F_CheckIPAddress in", values, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressNotIn(List<Boolean> values) {
            addCriterion("F_CheckIPAddress not in", values, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressBetween(Boolean value1, Boolean value2) {
            addCriterion("F_CheckIPAddress between", value1, value2, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFCheckipaddressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_CheckIPAddress not between", value1, value2, "fCheckipaddress");
            return (Criteria) this;
        }

        public Criteria andFLanguageIsNull() {
            addCriterion("F_Language is null");
            return (Criteria) this;
        }

        public Criteria andFLanguageIsNotNull() {
            addCriterion("F_Language is not null");
            return (Criteria) this;
        }

        public Criteria andFLanguageEqualTo(String value) {
            addCriterion("F_Language =", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageNotEqualTo(String value) {
            addCriterion("F_Language <>", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageGreaterThan(String value) {
            addCriterion("F_Language >", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("F_Language >=", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageLessThan(String value) {
            addCriterion("F_Language <", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageLessThanOrEqualTo(String value) {
            addCriterion("F_Language <=", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageLike(String value) {
            addCriterion("F_Language like", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageNotLike(String value) {
            addCriterion("F_Language not like", value, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageIn(List<String> values) {
            addCriterion("F_Language in", values, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageNotIn(List<String> values) {
            addCriterion("F_Language not in", values, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageBetween(String value1, String value2) {
            addCriterion("F_Language between", value1, value2, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFLanguageNotBetween(String value1, String value2) {
            addCriterion("F_Language not between", value1, value2, "fLanguage");
            return (Criteria) this;
        }

        public Criteria andFThemeIsNull() {
            addCriterion("F_Theme is null");
            return (Criteria) this;
        }

        public Criteria andFThemeIsNotNull() {
            addCriterion("F_Theme is not null");
            return (Criteria) this;
        }

        public Criteria andFThemeEqualTo(String value) {
            addCriterion("F_Theme =", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeNotEqualTo(String value) {
            addCriterion("F_Theme <>", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeGreaterThan(String value) {
            addCriterion("F_Theme >", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeGreaterThanOrEqualTo(String value) {
            addCriterion("F_Theme >=", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeLessThan(String value) {
            addCriterion("F_Theme <", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeLessThanOrEqualTo(String value) {
            addCriterion("F_Theme <=", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeLike(String value) {
            addCriterion("F_Theme like", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeNotLike(String value) {
            addCriterion("F_Theme not like", value, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeIn(List<String> values) {
            addCriterion("F_Theme in", values, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeNotIn(List<String> values) {
            addCriterion("F_Theme not in", values, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeBetween(String value1, String value2) {
            addCriterion("F_Theme between", value1, value2, "fTheme");
            return (Criteria) this;
        }

        public Criteria andFThemeNotBetween(String value1, String value2) {
            addCriterion("F_Theme not between", value1, value2, "fTheme");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextIsNull() {
            addCriterion("PasswordPlaintext is null");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextIsNotNull() {
            addCriterion("PasswordPlaintext is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextEqualTo(String value) {
            addCriterion("PasswordPlaintext =", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextNotEqualTo(String value) {
            addCriterion("PasswordPlaintext <>", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextGreaterThan(String value) {
            addCriterion("PasswordPlaintext >", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordPlaintext >=", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextLessThan(String value) {
            addCriterion("PasswordPlaintext <", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextLessThanOrEqualTo(String value) {
            addCriterion("PasswordPlaintext <=", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextLike(String value) {
            addCriterion("PasswordPlaintext like", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextNotLike(String value) {
            addCriterion("PasswordPlaintext not like", value, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextIn(List<String> values) {
            addCriterion("PasswordPlaintext in", values, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextNotIn(List<String> values) {
            addCriterion("PasswordPlaintext not in", values, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextBetween(String value1, String value2) {
            addCriterion("PasswordPlaintext between", value1, value2, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordplaintextNotBetween(String value1, String value2) {
            addCriterion("PasswordPlaintext not between", value1, value2, "passwordplaintext");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueIsNull() {
            addCriterion("PasswordStatue is null");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueIsNotNull() {
            addCriterion("PasswordStatue is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueEqualTo(Boolean value) {
            addCriterion("PasswordStatue =", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueNotEqualTo(Boolean value) {
            addCriterion("PasswordStatue <>", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueGreaterThan(Boolean value) {
            addCriterion("PasswordStatue >", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PasswordStatue >=", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueLessThan(Boolean value) {
            addCriterion("PasswordStatue <", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueLessThanOrEqualTo(Boolean value) {
            addCriterion("PasswordStatue <=", value, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueIn(List<Boolean> values) {
            addCriterion("PasswordStatue in", values, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueNotIn(List<Boolean> values) {
            addCriterion("PasswordStatue not in", values, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueBetween(Boolean value1, Boolean value2) {
            addCriterion("PasswordStatue between", value1, value2, "passwordstatue");
            return (Criteria) this;
        }

        public Criteria andPasswordstatueNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PasswordStatue not between", value1, value2, "passwordstatue");
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