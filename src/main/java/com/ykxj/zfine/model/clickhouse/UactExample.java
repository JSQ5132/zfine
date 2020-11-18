package com.ykxj.zfine.model.clickhouse;

import java.util.ArrayList;
import java.util.List;

public class UactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UactExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNull() {
            addCriterion("PageViews is null");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNotNull() {
            addCriterion("PageViews is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewsEqualTo(Byte value) {
            addCriterion("PageViews =", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotEqualTo(Byte value) {
            addCriterion("PageViews <>", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThan(Byte value) {
            addCriterion("PageViews >", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThanOrEqualTo(Byte value) {
            addCriterion("PageViews >=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThan(Byte value) {
            addCriterion("PageViews <", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThanOrEqualTo(Byte value) {
            addCriterion("PageViews <=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsIn(List<Byte> values) {
            addCriterion("PageViews in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotIn(List<Byte> values) {
            addCriterion("PageViews not in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsBetween(Byte value1, Byte value2) {
            addCriterion("PageViews between", value1, value2, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotBetween(Byte value1, Byte value2) {
            addCriterion("PageViews not between", value1, value2, "pageviews");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("Duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("Duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Byte value) {
            addCriterion("Duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Byte value) {
            addCriterion("Duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Byte value) {
            addCriterion("Duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Byte value) {
            addCriterion("Duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Byte value) {
            addCriterion("Duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Byte value) {
            addCriterion("Duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Byte> values) {
            addCriterion("Duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Byte> values) {
            addCriterion("Duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Byte value1, Byte value2) {
            addCriterion("Duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Byte value1, Byte value2) {
            addCriterion("Duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("Sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("Sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(Byte value) {
            addCriterion("Sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(Byte value) {
            addCriterion("Sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(Byte value) {
            addCriterion("Sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(Byte value) {
            addCriterion("Sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(Byte value) {
            addCriterion("Sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(Byte value) {
            addCriterion("Sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<Byte> values) {
            addCriterion("Sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<Byte> values) {
            addCriterion("Sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(Byte value1, Byte value2) {
            addCriterion("Sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(Byte value1, Byte value2) {
            addCriterion("Sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Byte value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Byte value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Byte value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Byte value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Byte value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Byte value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Byte> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Byte> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Byte value1, Byte value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Byte value1, Byte value2) {
            addCriterion("Version not between", value1, value2, "version");
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