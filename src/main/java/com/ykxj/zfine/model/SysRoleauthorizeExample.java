package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleauthorizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleauthorizeExample() {
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

        public Criteria andFItemtypeIsNull() {
            addCriterion("F_ItemType is null");
            return (Criteria) this;
        }

        public Criteria andFItemtypeIsNotNull() {
            addCriterion("F_ItemType is not null");
            return (Criteria) this;
        }

        public Criteria andFItemtypeEqualTo(Integer value) {
            addCriterion("F_ItemType =", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeNotEqualTo(Integer value) {
            addCriterion("F_ItemType <>", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeGreaterThan(Integer value) {
            addCriterion("F_ItemType >", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ItemType >=", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeLessThan(Integer value) {
            addCriterion("F_ItemType <", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_ItemType <=", value, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeIn(List<Integer> values) {
            addCriterion("F_ItemType in", values, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeNotIn(List<Integer> values) {
            addCriterion("F_ItemType not in", values, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeBetween(Integer value1, Integer value2) {
            addCriterion("F_ItemType between", value1, value2, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ItemType not between", value1, value2, "fItemtype");
            return (Criteria) this;
        }

        public Criteria andFItemidIsNull() {
            addCriterion("F_ItemId is null");
            return (Criteria) this;
        }

        public Criteria andFItemidIsNotNull() {
            addCriterion("F_ItemId is not null");
            return (Criteria) this;
        }

        public Criteria andFItemidEqualTo(String value) {
            addCriterion("F_ItemId =", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotEqualTo(String value) {
            addCriterion("F_ItemId <>", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidGreaterThan(String value) {
            addCriterion("F_ItemId >", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidGreaterThanOrEqualTo(String value) {
            addCriterion("F_ItemId >=", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLessThan(String value) {
            addCriterion("F_ItemId <", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLessThanOrEqualTo(String value) {
            addCriterion("F_ItemId <=", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLike(String value) {
            addCriterion("F_ItemId like", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotLike(String value) {
            addCriterion("F_ItemId not like", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidIn(List<String> values) {
            addCriterion("F_ItemId in", values, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotIn(List<String> values) {
            addCriterion("F_ItemId not in", values, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidBetween(String value1, String value2) {
            addCriterion("F_ItemId between", value1, value2, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotBetween(String value1, String value2) {
            addCriterion("F_ItemId not between", value1, value2, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeIsNull() {
            addCriterion("F_ObjectType is null");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeIsNotNull() {
            addCriterion("F_ObjectType is not null");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeEqualTo(Integer value) {
            addCriterion("F_ObjectType =", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeNotEqualTo(Integer value) {
            addCriterion("F_ObjectType <>", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeGreaterThan(Integer value) {
            addCriterion("F_ObjectType >", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ObjectType >=", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeLessThan(Integer value) {
            addCriterion("F_ObjectType <", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeLessThanOrEqualTo(Integer value) {
            addCriterion("F_ObjectType <=", value, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeIn(List<Integer> values) {
            addCriterion("F_ObjectType in", values, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeNotIn(List<Integer> values) {
            addCriterion("F_ObjectType not in", values, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeBetween(Integer value1, Integer value2) {
            addCriterion("F_ObjectType between", value1, value2, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjecttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ObjectType not between", value1, value2, "fObjecttype");
            return (Criteria) this;
        }

        public Criteria andFObjectidIsNull() {
            addCriterion("F_ObjectId is null");
            return (Criteria) this;
        }

        public Criteria andFObjectidIsNotNull() {
            addCriterion("F_ObjectId is not null");
            return (Criteria) this;
        }

        public Criteria andFObjectidEqualTo(String value) {
            addCriterion("F_ObjectId =", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidNotEqualTo(String value) {
            addCriterion("F_ObjectId <>", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidGreaterThan(String value) {
            addCriterion("F_ObjectId >", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidGreaterThanOrEqualTo(String value) {
            addCriterion("F_ObjectId >=", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidLessThan(String value) {
            addCriterion("F_ObjectId <", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidLessThanOrEqualTo(String value) {
            addCriterion("F_ObjectId <=", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidLike(String value) {
            addCriterion("F_ObjectId like", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidNotLike(String value) {
            addCriterion("F_ObjectId not like", value, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidIn(List<String> values) {
            addCriterion("F_ObjectId in", values, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidNotIn(List<String> values) {
            addCriterion("F_ObjectId not in", values, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidBetween(String value1, String value2) {
            addCriterion("F_ObjectId between", value1, value2, "fObjectid");
            return (Criteria) this;
        }

        public Criteria andFObjectidNotBetween(String value1, String value2) {
            addCriterion("F_ObjectId not between", value1, value2, "fObjectid");
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