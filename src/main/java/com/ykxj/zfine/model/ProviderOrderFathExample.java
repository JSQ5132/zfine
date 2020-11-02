package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviderOrderFathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderOrderFathExample() {
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

        public Criteria andAppidIsNull() {
            addCriterion("Appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("Appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("Appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("Appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("Appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("Appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("Appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("Appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("Appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("Appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("Appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("Appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("Appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("Appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andBusdateIsNull() {
            addCriterion("Busdate is null");
            return (Criteria) this;
        }

        public Criteria andBusdateIsNotNull() {
            addCriterion("Busdate is not null");
            return (Criteria) this;
        }

        public Criteria andBusdateEqualTo(Date value) {
            addCriterion("Busdate =", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotEqualTo(Date value) {
            addCriterion("Busdate <>", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateGreaterThan(Date value) {
            addCriterion("Busdate >", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Busdate >=", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateLessThan(Date value) {
            addCriterion("Busdate <", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateLessThanOrEqualTo(Date value) {
            addCriterion("Busdate <=", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateIn(List<Date> values) {
            addCriterion("Busdate in", values, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotIn(List<Date> values) {
            addCriterion("Busdate not in", values, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateBetween(Date value1, Date value2) {
            addCriterion("Busdate between", value1, value2, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotBetween(Date value1, Date value2) {
            addCriterion("Busdate not between", value1, value2, "busdate");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("Statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("Statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(Integer value) {
            addCriterion("Statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(Integer value) {
            addCriterion("Statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(Integer value) {
            addCriterion("Statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("Statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(Integer value) {
            addCriterion("Statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(Integer value) {
            addCriterion("Statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<Integer> values) {
            addCriterion("Statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<Integer> values) {
            addCriterion("Statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(Integer value1, Integer value2) {
            addCriterion("Statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("Statu not between", value1, value2, "statu");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOrganIsNull() {
            addCriterion("organ is null");
            return (Criteria) this;
        }

        public Criteria andOrganIsNotNull() {
            addCriterion("organ is not null");
            return (Criteria) this;
        }

        public Criteria andOrganEqualTo(String value) {
            addCriterion("organ =", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotEqualTo(String value) {
            addCriterion("organ <>", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThan(String value) {
            addCriterion("organ >", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThanOrEqualTo(String value) {
            addCriterion("organ >=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThan(String value) {
            addCriterion("organ <", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThanOrEqualTo(String value) {
            addCriterion("organ <=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLike(String value) {
            addCriterion("organ like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotLike(String value) {
            addCriterion("organ not like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganIn(List<String> values) {
            addCriterion("organ in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotIn(List<String> values) {
            addCriterion("organ not in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganBetween(String value1, String value2) {
            addCriterion("organ between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotBetween(String value1, String value2) {
            addCriterion("organ not between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPrintnumIsNull() {
            addCriterion("PrintNum is null");
            return (Criteria) this;
        }

        public Criteria andPrintnumIsNotNull() {
            addCriterion("PrintNum is not null");
            return (Criteria) this;
        }

        public Criteria andPrintnumEqualTo(Integer value) {
            addCriterion("PrintNum =", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumNotEqualTo(Integer value) {
            addCriterion("PrintNum <>", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumGreaterThan(Integer value) {
            addCriterion("PrintNum >", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintNum >=", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumLessThan(Integer value) {
            addCriterion("PrintNum <", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumLessThanOrEqualTo(Integer value) {
            addCriterion("PrintNum <=", value, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumIn(List<Integer> values) {
            addCriterion("PrintNum in", values, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumNotIn(List<Integer> values) {
            addCriterion("PrintNum not in", values, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumBetween(Integer value1, Integer value2) {
            addCriterion("PrintNum between", value1, value2, "printnum");
            return (Criteria) this;
        }

        public Criteria andPrintnumNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintNum not between", value1, value2, "printnum");
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