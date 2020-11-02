package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecedFathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecedFathExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
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

        public Criteria andOrderidIsNull() {
            addCriterion("Orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("Orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("Orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("Orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("Orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("Orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("Orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("Orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("Orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("Orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("Orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("Orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("Orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("Orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("Provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("Provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("Provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("Provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("Provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("Provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("Provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("Provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("Provider like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("Provider not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("Provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("Provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("Provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("Provider not between", value1, value2, "provider");
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

        public Criteria andOrganIsNull() {
            addCriterion("Organ is null");
            return (Criteria) this;
        }

        public Criteria andOrganIsNotNull() {
            addCriterion("Organ is not null");
            return (Criteria) this;
        }

        public Criteria andOrganEqualTo(String value) {
            addCriterion("Organ =", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotEqualTo(String value) {
            addCriterion("Organ <>", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThan(String value) {
            addCriterion("Organ >", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThanOrEqualTo(String value) {
            addCriterion("Organ >=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThan(String value) {
            addCriterion("Organ <", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThanOrEqualTo(String value) {
            addCriterion("Organ <=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLike(String value) {
            addCriterion("Organ like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotLike(String value) {
            addCriterion("Organ not like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganIn(List<String> values) {
            addCriterion("Organ in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotIn(List<String> values) {
            addCriterion("Organ not in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganBetween(String value1, String value2) {
            addCriterion("Organ between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotBetween(String value1, String value2) {
            addCriterion("Organ not between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andDepartIsNull() {
            addCriterion("Depart is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("Depart is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("Depart =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("Depart <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("Depart >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("Depart >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("Depart <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("Depart <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("Depart like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("Depart not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("Depart in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("Depart not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("Depart between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("Depart not between", value1, value2, "depart");
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

        public Criteria andRecdateIsNull() {
            addCriterion("Recdate is null");
            return (Criteria) this;
        }

        public Criteria andRecdateIsNotNull() {
            addCriterion("Recdate is not null");
            return (Criteria) this;
        }

        public Criteria andRecdateEqualTo(Date value) {
            addCriterion("Recdate =", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotEqualTo(Date value) {
            addCriterion("Recdate <>", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateGreaterThan(Date value) {
            addCriterion("Recdate >", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Recdate >=", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateLessThan(Date value) {
            addCriterion("Recdate <", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateLessThanOrEqualTo(Date value) {
            addCriterion("Recdate <=", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateIn(List<Date> values) {
            addCriterion("Recdate in", values, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotIn(List<Date> values) {
            addCriterion("Recdate not in", values, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateBetween(Date value1, Date value2) {
            addCriterion("Recdate between", value1, value2, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotBetween(Date value1, Date value2) {
            addCriterion("Recdate not between", value1, value2, "recdate");
            return (Criteria) this;
        }

        public Criteria andVerdateIsNull() {
            addCriterion("Verdate is null");
            return (Criteria) this;
        }

        public Criteria andVerdateIsNotNull() {
            addCriterion("Verdate is not null");
            return (Criteria) this;
        }

        public Criteria andVerdateEqualTo(Date value) {
            addCriterion("Verdate =", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateNotEqualTo(Date value) {
            addCriterion("Verdate <>", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateGreaterThan(Date value) {
            addCriterion("Verdate >", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Verdate >=", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateLessThan(Date value) {
            addCriterion("Verdate <", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateLessThanOrEqualTo(Date value) {
            addCriterion("Verdate <=", value, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateIn(List<Date> values) {
            addCriterion("Verdate in", values, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateNotIn(List<Date> values) {
            addCriterion("Verdate not in", values, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateBetween(Date value1, Date value2) {
            addCriterion("Verdate between", value1, value2, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerdateNotBetween(Date value1, Date value2) {
            addCriterion("Verdate not between", value1, value2, "verdate");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("Verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("Verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("Verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("Verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("Verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("Verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("Verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("Verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("Verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("Verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("Verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("Verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("Verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("Verifier not between", value1, value2, "verifier");
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

        public Criteria andPrintcountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printcount");
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