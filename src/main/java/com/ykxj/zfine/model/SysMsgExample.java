package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class SysMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMsgExample() {
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

        public Criteria andFUserIsNull() {
            addCriterion("F_User is null");
            return (Criteria) this;
        }

        public Criteria andFUserIsNotNull() {
            addCriterion("F_User is not null");
            return (Criteria) this;
        }

        public Criteria andFUserEqualTo(String value) {
            addCriterion("F_User =", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserNotEqualTo(String value) {
            addCriterion("F_User <>", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserGreaterThan(String value) {
            addCriterion("F_User >", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserGreaterThanOrEqualTo(String value) {
            addCriterion("F_User >=", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserLessThan(String value) {
            addCriterion("F_User <", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserLessThanOrEqualTo(String value) {
            addCriterion("F_User <=", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserLike(String value) {
            addCriterion("F_User like", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserNotLike(String value) {
            addCriterion("F_User not like", value, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserIn(List<String> values) {
            addCriterion("F_User in", values, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserNotIn(List<String> values) {
            addCriterion("F_User not in", values, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserBetween(String value1, String value2) {
            addCriterion("F_User between", value1, value2, "fUser");
            return (Criteria) this;
        }

        public Criteria andFUserNotBetween(String value1, String value2) {
            addCriterion("F_User not between", value1, value2, "fUser");
            return (Criteria) this;
        }

        public Criteria andReaddateIsNull() {
            addCriterion("ReadDate is null");
            return (Criteria) this;
        }

        public Criteria andReaddateIsNotNull() {
            addCriterion("ReadDate is not null");
            return (Criteria) this;
        }

        public Criteria andReaddateEqualTo(String value) {
            addCriterion("ReadDate =", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotEqualTo(String value) {
            addCriterion("ReadDate <>", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateGreaterThan(String value) {
            addCriterion("ReadDate >", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateGreaterThanOrEqualTo(String value) {
            addCriterion("ReadDate >=", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateLessThan(String value) {
            addCriterion("ReadDate <", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateLessThanOrEqualTo(String value) {
            addCriterion("ReadDate <=", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateLike(String value) {
            addCriterion("ReadDate like", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotLike(String value) {
            addCriterion("ReadDate not like", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateIn(List<String> values) {
            addCriterion("ReadDate in", values, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotIn(List<String> values) {
            addCriterion("ReadDate not in", values, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateBetween(String value1, String value2) {
            addCriterion("ReadDate between", value1, value2, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotBetween(String value1, String value2) {
            addCriterion("ReadDate not between", value1, value2, "readdate");
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