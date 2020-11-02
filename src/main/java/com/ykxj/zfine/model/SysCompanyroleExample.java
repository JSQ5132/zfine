package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCompanyroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCompanyroleExample() {
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