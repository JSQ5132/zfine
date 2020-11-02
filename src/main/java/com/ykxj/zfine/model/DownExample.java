package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DownExample() {
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

        public Criteria andNdIsNull() {
            addCriterion("ND is null");
            return (Criteria) this;
        }

        public Criteria andNdIsNotNull() {
            addCriterion("ND is not null");
            return (Criteria) this;
        }

        public Criteria andNdEqualTo(Integer value) {
            addCriterion("ND =", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotEqualTo(Integer value) {
            addCriterion("ND <>", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThan(Integer value) {
            addCriterion("ND >", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ND >=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThan(Integer value) {
            addCriterion("ND <", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdLessThanOrEqualTo(Integer value) {
            addCriterion("ND <=", value, "nd");
            return (Criteria) this;
        }

        public Criteria andNdIn(List<Integer> values) {
            addCriterion("ND in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotIn(List<Integer> values) {
            addCriterion("ND not in", values, "nd");
            return (Criteria) this;
        }

        public Criteria andNdBetween(Integer value1, Integer value2) {
            addCriterion("ND between", value1, value2, "nd");
            return (Criteria) this;
        }

        public Criteria andNdNotBetween(Integer value1, Integer value2) {
            addCriterion("ND not between", value1, value2, "nd");
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

        public Criteria andOtypeIsNull() {
            addCriterion("Otype is null");
            return (Criteria) this;
        }

        public Criteria andOtypeIsNotNull() {
            addCriterion("Otype is not null");
            return (Criteria) this;
        }

        public Criteria andOtypeEqualTo(String value) {
            addCriterion("Otype =", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotEqualTo(String value) {
            addCriterion("Otype <>", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThan(String value) {
            addCriterion("Otype >", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThanOrEqualTo(String value) {
            addCriterion("Otype >=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThan(String value) {
            addCriterion("Otype <", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThanOrEqualTo(String value) {
            addCriterion("Otype <=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLike(String value) {
            addCriterion("Otype like", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotLike(String value) {
            addCriterion("Otype not like", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeIn(List<String> values) {
            addCriterion("Otype in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotIn(List<String> values) {
            addCriterion("Otype not in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeBetween(String value1, String value2) {
            addCriterion("Otype between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotBetween(String value1, String value2) {
            addCriterion("Otype not between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andTbnameIsNull() {
            addCriterion("Tbname is null");
            return (Criteria) this;
        }

        public Criteria andTbnameIsNotNull() {
            addCriterion("Tbname is not null");
            return (Criteria) this;
        }

        public Criteria andTbnameEqualTo(String value) {
            addCriterion("Tbname =", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotEqualTo(String value) {
            addCriterion("Tbname <>", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThan(String value) {
            addCriterion("Tbname >", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThanOrEqualTo(String value) {
            addCriterion("Tbname >=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThan(String value) {
            addCriterion("Tbname <", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThanOrEqualTo(String value) {
            addCriterion("Tbname <=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLike(String value) {
            addCriterion("Tbname like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotLike(String value) {
            addCriterion("Tbname not like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameIn(List<String> values) {
            addCriterion("Tbname in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotIn(List<String> values) {
            addCriterion("Tbname not in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameBetween(String value1, String value2) {
            addCriterion("Tbname between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotBetween(String value1, String value2) {
            addCriterion("Tbname not between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("Operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("Operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("Operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("Operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("Operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("Operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("Operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("Operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("Operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("Operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("Operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("Operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("Operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("Operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andModitimeIsNull() {
            addCriterion("Moditime is null");
            return (Criteria) this;
        }

        public Criteria andModitimeIsNotNull() {
            addCriterion("Moditime is not null");
            return (Criteria) this;
        }

        public Criteria andModitimeEqualTo(Date value) {
            addCriterion("Moditime =", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeNotEqualTo(Date value) {
            addCriterion("Moditime <>", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeGreaterThan(Date value) {
            addCriterion("Moditime >", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Moditime >=", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeLessThan(Date value) {
            addCriterion("Moditime <", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeLessThanOrEqualTo(Date value) {
            addCriterion("Moditime <=", value, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeIn(List<Date> values) {
            addCriterion("Moditime in", values, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeNotIn(List<Date> values) {
            addCriterion("Moditime not in", values, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeBetween(Date value1, Date value2) {
            addCriterion("Moditime between", value1, value2, "moditime");
            return (Criteria) this;
        }

        public Criteria andModitimeNotBetween(Date value1, Date value2) {
            addCriterion("Moditime not between", value1, value2, "moditime");
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