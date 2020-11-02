package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class PbcatfmtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbcatfmtExample() {
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

        public Criteria andPbfNameIsNull() {
            addCriterion("pbf_name is null");
            return (Criteria) this;
        }

        public Criteria andPbfNameIsNotNull() {
            addCriterion("pbf_name is not null");
            return (Criteria) this;
        }

        public Criteria andPbfNameEqualTo(String value) {
            addCriterion("pbf_name =", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameNotEqualTo(String value) {
            addCriterion("pbf_name <>", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameGreaterThan(String value) {
            addCriterion("pbf_name >", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameGreaterThanOrEqualTo(String value) {
            addCriterion("pbf_name >=", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameLessThan(String value) {
            addCriterion("pbf_name <", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameLessThanOrEqualTo(String value) {
            addCriterion("pbf_name <=", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameLike(String value) {
            addCriterion("pbf_name like", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameNotLike(String value) {
            addCriterion("pbf_name not like", value, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameIn(List<String> values) {
            addCriterion("pbf_name in", values, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameNotIn(List<String> values) {
            addCriterion("pbf_name not in", values, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameBetween(String value1, String value2) {
            addCriterion("pbf_name between", value1, value2, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfNameNotBetween(String value1, String value2) {
            addCriterion("pbf_name not between", value1, value2, "pbfName");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtIsNull() {
            addCriterion("pbf_frmt is null");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtIsNotNull() {
            addCriterion("pbf_frmt is not null");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtEqualTo(String value) {
            addCriterion("pbf_frmt =", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtNotEqualTo(String value) {
            addCriterion("pbf_frmt <>", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtGreaterThan(String value) {
            addCriterion("pbf_frmt >", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtGreaterThanOrEqualTo(String value) {
            addCriterion("pbf_frmt >=", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtLessThan(String value) {
            addCriterion("pbf_frmt <", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtLessThanOrEqualTo(String value) {
            addCriterion("pbf_frmt <=", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtLike(String value) {
            addCriterion("pbf_frmt like", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtNotLike(String value) {
            addCriterion("pbf_frmt not like", value, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtIn(List<String> values) {
            addCriterion("pbf_frmt in", values, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtNotIn(List<String> values) {
            addCriterion("pbf_frmt not in", values, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtBetween(String value1, String value2) {
            addCriterion("pbf_frmt between", value1, value2, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfFrmtNotBetween(String value1, String value2) {
            addCriterion("pbf_frmt not between", value1, value2, "pbfFrmt");
            return (Criteria) this;
        }

        public Criteria andPbfTypeIsNull() {
            addCriterion("pbf_type is null");
            return (Criteria) this;
        }

        public Criteria andPbfTypeIsNotNull() {
            addCriterion("pbf_type is not null");
            return (Criteria) this;
        }

        public Criteria andPbfTypeEqualTo(Integer value) {
            addCriterion("pbf_type =", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeNotEqualTo(Integer value) {
            addCriterion("pbf_type <>", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeGreaterThan(Integer value) {
            addCriterion("pbf_type >", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbf_type >=", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeLessThan(Integer value) {
            addCriterion("pbf_type <", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pbf_type <=", value, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeIn(List<Integer> values) {
            addCriterion("pbf_type in", values, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeNotIn(List<Integer> values) {
            addCriterion("pbf_type not in", values, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeBetween(Integer value1, Integer value2) {
            addCriterion("pbf_type between", value1, value2, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pbf_type not between", value1, value2, "pbfType");
            return (Criteria) this;
        }

        public Criteria andPbfCntrIsNull() {
            addCriterion("pbf_cntr is null");
            return (Criteria) this;
        }

        public Criteria andPbfCntrIsNotNull() {
            addCriterion("pbf_cntr is not null");
            return (Criteria) this;
        }

        public Criteria andPbfCntrEqualTo(Integer value) {
            addCriterion("pbf_cntr =", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrNotEqualTo(Integer value) {
            addCriterion("pbf_cntr <>", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrGreaterThan(Integer value) {
            addCriterion("pbf_cntr >", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbf_cntr >=", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrLessThan(Integer value) {
            addCriterion("pbf_cntr <", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrLessThanOrEqualTo(Integer value) {
            addCriterion("pbf_cntr <=", value, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrIn(List<Integer> values) {
            addCriterion("pbf_cntr in", values, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrNotIn(List<Integer> values) {
            addCriterion("pbf_cntr not in", values, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrBetween(Integer value1, Integer value2) {
            addCriterion("pbf_cntr between", value1, value2, "pbfCntr");
            return (Criteria) this;
        }

        public Criteria andPbfCntrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbf_cntr not between", value1, value2, "pbfCntr");
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