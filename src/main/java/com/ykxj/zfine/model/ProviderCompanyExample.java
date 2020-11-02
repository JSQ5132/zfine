package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviderCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderCompanyExample() {
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
            addCriterion("F_Userid is null");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNotNull() {
            addCriterion("F_Userid is not null");
            return (Criteria) this;
        }

        public Criteria andFUseridEqualTo(String value) {
            addCriterion("F_Userid =", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotEqualTo(String value) {
            addCriterion("F_Userid <>", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThan(String value) {
            addCriterion("F_Userid >", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_Userid >=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThan(String value) {
            addCriterion("F_Userid <", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThanOrEqualTo(String value) {
            addCriterion("F_Userid <=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLike(String value) {
            addCriterion("F_Userid like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotLike(String value) {
            addCriterion("F_Userid not like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridIn(List<String> values) {
            addCriterion("F_Userid in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotIn(List<String> values) {
            addCriterion("F_Userid not in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridBetween(String value1, String value2) {
            addCriterion("F_Userid between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotBetween(String value1, String value2) {
            addCriterion("F_Userid not between", value1, value2, "fUserid");
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

        public Criteria andTokenIsNull() {
            addCriterion("Token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("Token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("Token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("Token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("Token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("Token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("Token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("Token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("Token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("Token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("Token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("Token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("Token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
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