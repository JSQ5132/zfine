package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class PbcatvldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbcatvldExample() {
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

        public Criteria andPbvNameIsNull() {
            addCriterion("pbv_name is null");
            return (Criteria) this;
        }

        public Criteria andPbvNameIsNotNull() {
            addCriterion("pbv_name is not null");
            return (Criteria) this;
        }

        public Criteria andPbvNameEqualTo(String value) {
            addCriterion("pbv_name =", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameNotEqualTo(String value) {
            addCriterion("pbv_name <>", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameGreaterThan(String value) {
            addCriterion("pbv_name >", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameGreaterThanOrEqualTo(String value) {
            addCriterion("pbv_name >=", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameLessThan(String value) {
            addCriterion("pbv_name <", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameLessThanOrEqualTo(String value) {
            addCriterion("pbv_name <=", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameLike(String value) {
            addCriterion("pbv_name like", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameNotLike(String value) {
            addCriterion("pbv_name not like", value, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameIn(List<String> values) {
            addCriterion("pbv_name in", values, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameNotIn(List<String> values) {
            addCriterion("pbv_name not in", values, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameBetween(String value1, String value2) {
            addCriterion("pbv_name between", value1, value2, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvNameNotBetween(String value1, String value2) {
            addCriterion("pbv_name not between", value1, value2, "pbvName");
            return (Criteria) this;
        }

        public Criteria andPbvValdIsNull() {
            addCriterion("pbv_vald is null");
            return (Criteria) this;
        }

        public Criteria andPbvValdIsNotNull() {
            addCriterion("pbv_vald is not null");
            return (Criteria) this;
        }

        public Criteria andPbvValdEqualTo(String value) {
            addCriterion("pbv_vald =", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdNotEqualTo(String value) {
            addCriterion("pbv_vald <>", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdGreaterThan(String value) {
            addCriterion("pbv_vald >", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdGreaterThanOrEqualTo(String value) {
            addCriterion("pbv_vald >=", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdLessThan(String value) {
            addCriterion("pbv_vald <", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdLessThanOrEqualTo(String value) {
            addCriterion("pbv_vald <=", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdLike(String value) {
            addCriterion("pbv_vald like", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdNotLike(String value) {
            addCriterion("pbv_vald not like", value, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdIn(List<String> values) {
            addCriterion("pbv_vald in", values, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdNotIn(List<String> values) {
            addCriterion("pbv_vald not in", values, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdBetween(String value1, String value2) {
            addCriterion("pbv_vald between", value1, value2, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvValdNotBetween(String value1, String value2) {
            addCriterion("pbv_vald not between", value1, value2, "pbvVald");
            return (Criteria) this;
        }

        public Criteria andPbvTypeIsNull() {
            addCriterion("pbv_type is null");
            return (Criteria) this;
        }

        public Criteria andPbvTypeIsNotNull() {
            addCriterion("pbv_type is not null");
            return (Criteria) this;
        }

        public Criteria andPbvTypeEqualTo(Integer value) {
            addCriterion("pbv_type =", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeNotEqualTo(Integer value) {
            addCriterion("pbv_type <>", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeGreaterThan(Integer value) {
            addCriterion("pbv_type >", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbv_type >=", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeLessThan(Integer value) {
            addCriterion("pbv_type <", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pbv_type <=", value, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeIn(List<Integer> values) {
            addCriterion("pbv_type in", values, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeNotIn(List<Integer> values) {
            addCriterion("pbv_type not in", values, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeBetween(Integer value1, Integer value2) {
            addCriterion("pbv_type between", value1, value2, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pbv_type not between", value1, value2, "pbvType");
            return (Criteria) this;
        }

        public Criteria andPbvCntrIsNull() {
            addCriterion("pbv_cntr is null");
            return (Criteria) this;
        }

        public Criteria andPbvCntrIsNotNull() {
            addCriterion("pbv_cntr is not null");
            return (Criteria) this;
        }

        public Criteria andPbvCntrEqualTo(Integer value) {
            addCriterion("pbv_cntr =", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrNotEqualTo(Integer value) {
            addCriterion("pbv_cntr <>", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrGreaterThan(Integer value) {
            addCriterion("pbv_cntr >", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbv_cntr >=", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrLessThan(Integer value) {
            addCriterion("pbv_cntr <", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrLessThanOrEqualTo(Integer value) {
            addCriterion("pbv_cntr <=", value, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrIn(List<Integer> values) {
            addCriterion("pbv_cntr in", values, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrNotIn(List<Integer> values) {
            addCriterion("pbv_cntr not in", values, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrBetween(Integer value1, Integer value2) {
            addCriterion("pbv_cntr between", value1, value2, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvCntrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbv_cntr not between", value1, value2, "pbvCntr");
            return (Criteria) this;
        }

        public Criteria andPbvMsgIsNull() {
            addCriterion("pbv_msg is null");
            return (Criteria) this;
        }

        public Criteria andPbvMsgIsNotNull() {
            addCriterion("pbv_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPbvMsgEqualTo(String value) {
            addCriterion("pbv_msg =", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgNotEqualTo(String value) {
            addCriterion("pbv_msg <>", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgGreaterThan(String value) {
            addCriterion("pbv_msg >", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pbv_msg >=", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgLessThan(String value) {
            addCriterion("pbv_msg <", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgLessThanOrEqualTo(String value) {
            addCriterion("pbv_msg <=", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgLike(String value) {
            addCriterion("pbv_msg like", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgNotLike(String value) {
            addCriterion("pbv_msg not like", value, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgIn(List<String> values) {
            addCriterion("pbv_msg in", values, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgNotIn(List<String> values) {
            addCriterion("pbv_msg not in", values, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgBetween(String value1, String value2) {
            addCriterion("pbv_msg between", value1, value2, "pbvMsg");
            return (Criteria) this;
        }

        public Criteria andPbvMsgNotBetween(String value1, String value2) {
            addCriterion("pbv_msg not between", value1, value2, "pbvMsg");
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