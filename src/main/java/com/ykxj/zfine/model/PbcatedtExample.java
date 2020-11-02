package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class PbcatedtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbcatedtExample() {
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

        public Criteria andPbeNameIsNull() {
            addCriterion("pbe_name is null");
            return (Criteria) this;
        }

        public Criteria andPbeNameIsNotNull() {
            addCriterion("pbe_name is not null");
            return (Criteria) this;
        }

        public Criteria andPbeNameEqualTo(String value) {
            addCriterion("pbe_name =", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameNotEqualTo(String value) {
            addCriterion("pbe_name <>", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameGreaterThan(String value) {
            addCriterion("pbe_name >", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pbe_name >=", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameLessThan(String value) {
            addCriterion("pbe_name <", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameLessThanOrEqualTo(String value) {
            addCriterion("pbe_name <=", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameLike(String value) {
            addCriterion("pbe_name like", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameNotLike(String value) {
            addCriterion("pbe_name not like", value, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameIn(List<String> values) {
            addCriterion("pbe_name in", values, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameNotIn(List<String> values) {
            addCriterion("pbe_name not in", values, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameBetween(String value1, String value2) {
            addCriterion("pbe_name between", value1, value2, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeNameNotBetween(String value1, String value2) {
            addCriterion("pbe_name not between", value1, value2, "pbeName");
            return (Criteria) this;
        }

        public Criteria andPbeEditIsNull() {
            addCriterion("pbe_edit is null");
            return (Criteria) this;
        }

        public Criteria andPbeEditIsNotNull() {
            addCriterion("pbe_edit is not null");
            return (Criteria) this;
        }

        public Criteria andPbeEditEqualTo(String value) {
            addCriterion("pbe_edit =", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditNotEqualTo(String value) {
            addCriterion("pbe_edit <>", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditGreaterThan(String value) {
            addCriterion("pbe_edit >", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditGreaterThanOrEqualTo(String value) {
            addCriterion("pbe_edit >=", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditLessThan(String value) {
            addCriterion("pbe_edit <", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditLessThanOrEqualTo(String value) {
            addCriterion("pbe_edit <=", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditLike(String value) {
            addCriterion("pbe_edit like", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditNotLike(String value) {
            addCriterion("pbe_edit not like", value, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditIn(List<String> values) {
            addCriterion("pbe_edit in", values, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditNotIn(List<String> values) {
            addCriterion("pbe_edit not in", values, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditBetween(String value1, String value2) {
            addCriterion("pbe_edit between", value1, value2, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeEditNotBetween(String value1, String value2) {
            addCriterion("pbe_edit not between", value1, value2, "pbeEdit");
            return (Criteria) this;
        }

        public Criteria andPbeTypeIsNull() {
            addCriterion("pbe_type is null");
            return (Criteria) this;
        }

        public Criteria andPbeTypeIsNotNull() {
            addCriterion("pbe_type is not null");
            return (Criteria) this;
        }

        public Criteria andPbeTypeEqualTo(Integer value) {
            addCriterion("pbe_type =", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeNotEqualTo(Integer value) {
            addCriterion("pbe_type <>", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeGreaterThan(Integer value) {
            addCriterion("pbe_type >", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbe_type >=", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeLessThan(Integer value) {
            addCriterion("pbe_type <", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pbe_type <=", value, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeIn(List<Integer> values) {
            addCriterion("pbe_type in", values, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeNotIn(List<Integer> values) {
            addCriterion("pbe_type not in", values, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeBetween(Integer value1, Integer value2) {
            addCriterion("pbe_type between", value1, value2, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pbe_type not between", value1, value2, "pbeType");
            return (Criteria) this;
        }

        public Criteria andPbeCntrIsNull() {
            addCriterion("pbe_cntr is null");
            return (Criteria) this;
        }

        public Criteria andPbeCntrIsNotNull() {
            addCriterion("pbe_cntr is not null");
            return (Criteria) this;
        }

        public Criteria andPbeCntrEqualTo(Integer value) {
            addCriterion("pbe_cntr =", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrNotEqualTo(Integer value) {
            addCriterion("pbe_cntr <>", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrGreaterThan(Integer value) {
            addCriterion("pbe_cntr >", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbe_cntr >=", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrLessThan(Integer value) {
            addCriterion("pbe_cntr <", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrLessThanOrEqualTo(Integer value) {
            addCriterion("pbe_cntr <=", value, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrIn(List<Integer> values) {
            addCriterion("pbe_cntr in", values, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrNotIn(List<Integer> values) {
            addCriterion("pbe_cntr not in", values, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrBetween(Integer value1, Integer value2) {
            addCriterion("pbe_cntr between", value1, value2, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeCntrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbe_cntr not between", value1, value2, "pbeCntr");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnIsNull() {
            addCriterion("pbe_seqn is null");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnIsNotNull() {
            addCriterion("pbe_seqn is not null");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnEqualTo(Integer value) {
            addCriterion("pbe_seqn =", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnNotEqualTo(Integer value) {
            addCriterion("pbe_seqn <>", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnGreaterThan(Integer value) {
            addCriterion("pbe_seqn >", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbe_seqn >=", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnLessThan(Integer value) {
            addCriterion("pbe_seqn <", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnLessThanOrEqualTo(Integer value) {
            addCriterion("pbe_seqn <=", value, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnIn(List<Integer> values) {
            addCriterion("pbe_seqn in", values, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnNotIn(List<Integer> values) {
            addCriterion("pbe_seqn not in", values, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnBetween(Integer value1, Integer value2) {
            addCriterion("pbe_seqn between", value1, value2, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeSeqnNotBetween(Integer value1, Integer value2) {
            addCriterion("pbe_seqn not between", value1, value2, "pbeSeqn");
            return (Criteria) this;
        }

        public Criteria andPbeFlagIsNull() {
            addCriterion("pbe_flag is null");
            return (Criteria) this;
        }

        public Criteria andPbeFlagIsNotNull() {
            addCriterion("pbe_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPbeFlagEqualTo(Integer value) {
            addCriterion("pbe_flag =", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagNotEqualTo(Integer value) {
            addCriterion("pbe_flag <>", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagGreaterThan(Integer value) {
            addCriterion("pbe_flag >", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbe_flag >=", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagLessThan(Integer value) {
            addCriterion("pbe_flag <", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pbe_flag <=", value, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagIn(List<Integer> values) {
            addCriterion("pbe_flag in", values, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagNotIn(List<Integer> values) {
            addCriterion("pbe_flag not in", values, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagBetween(Integer value1, Integer value2) {
            addCriterion("pbe_flag between", value1, value2, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pbe_flag not between", value1, value2, "pbeFlag");
            return (Criteria) this;
        }

        public Criteria andPbeWorkIsNull() {
            addCriterion("pbe_work is null");
            return (Criteria) this;
        }

        public Criteria andPbeWorkIsNotNull() {
            addCriterion("pbe_work is not null");
            return (Criteria) this;
        }

        public Criteria andPbeWorkEqualTo(String value) {
            addCriterion("pbe_work =", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkNotEqualTo(String value) {
            addCriterion("pbe_work <>", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkGreaterThan(String value) {
            addCriterion("pbe_work >", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkGreaterThanOrEqualTo(String value) {
            addCriterion("pbe_work >=", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkLessThan(String value) {
            addCriterion("pbe_work <", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkLessThanOrEqualTo(String value) {
            addCriterion("pbe_work <=", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkLike(String value) {
            addCriterion("pbe_work like", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkNotLike(String value) {
            addCriterion("pbe_work not like", value, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkIn(List<String> values) {
            addCriterion("pbe_work in", values, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkNotIn(List<String> values) {
            addCriterion("pbe_work not in", values, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkBetween(String value1, String value2) {
            addCriterion("pbe_work between", value1, value2, "pbeWork");
            return (Criteria) this;
        }

        public Criteria andPbeWorkNotBetween(String value1, String value2) {
            addCriterion("pbe_work not between", value1, value2, "pbeWork");
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