package com.ykxj.zfine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BalanceFathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceFathExample() {
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

        public Criteria andMonthIsNull() {
            addCriterion("Month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("Month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("Month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("Month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("Month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("Month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("Month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("Month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("Month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("Month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("Month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("Month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("Month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("Month not between", value1, value2, "month");
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

        public Criteria andStartdateIsNull() {
            addCriterion("Startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("Startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("Startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("Startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("Startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("Startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("Startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("Startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("Startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("Startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("Startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("Enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("Enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("Enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("Enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("Enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("Enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("Enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("Enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("Enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("Enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("Enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("Enddate not between", value1, value2, "enddate");
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

        public Criteria andContractidIsNull() {
            addCriterion("Contractid is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("Contractid is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("Contractid =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("Contractid <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("Contractid >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("Contractid >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("Contractid <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("Contractid <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("Contractid like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("Contractid not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("Contractid in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("Contractid not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("Contractid between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("Contractid not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andSumWscostIsNull() {
            addCriterion("Sum_wscost is null");
            return (Criteria) this;
        }

        public Criteria andSumWscostIsNotNull() {
            addCriterion("Sum_wscost is not null");
            return (Criteria) this;
        }

        public Criteria andSumWscostEqualTo(BigDecimal value) {
            addCriterion("Sum_wscost =", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostNotEqualTo(BigDecimal value) {
            addCriterion("Sum_wscost <>", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostGreaterThan(BigDecimal value) {
            addCriterion("Sum_wscost >", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_wscost >=", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostLessThan(BigDecimal value) {
            addCriterion("Sum_wscost <", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_wscost <=", value, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostIn(List<BigDecimal> values) {
            addCriterion("Sum_wscost in", values, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostNotIn(List<BigDecimal> values) {
            addCriterion("Sum_wscost not in", values, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_wscost between", value1, value2, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumWscostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_wscost not between", value1, value2, "sumWscost");
            return (Criteria) this;
        }

        public Criteria andSumTaxIsNull() {
            addCriterion("Sum_tax is null");
            return (Criteria) this;
        }

        public Criteria andSumTaxIsNotNull() {
            addCriterion("Sum_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSumTaxEqualTo(BigDecimal value) {
            addCriterion("Sum_tax =", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxNotEqualTo(BigDecimal value) {
            addCriterion("Sum_tax <>", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxGreaterThan(BigDecimal value) {
            addCriterion("Sum_tax >", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_tax >=", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxLessThan(BigDecimal value) {
            addCriterion("Sum_tax <", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_tax <=", value, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxIn(List<BigDecimal> values) {
            addCriterion("Sum_tax in", values, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxNotIn(List<BigDecimal> values) {
            addCriterion("Sum_tax not in", values, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_tax between", value1, value2, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_tax not between", value1, value2, "sumTax");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNull() {
            addCriterion("Sum_cost is null");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNotNull() {
            addCriterion("Sum_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostEqualTo(BigDecimal value) {
            addCriterion("Sum_cost =", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotEqualTo(BigDecimal value) {
            addCriterion("Sum_cost <>", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThan(BigDecimal value) {
            addCriterion("Sum_cost >", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_cost >=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThan(BigDecimal value) {
            addCriterion("Sum_cost <", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_cost <=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIn(List<BigDecimal> values) {
            addCriterion("Sum_cost in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotIn(List<BigDecimal> values) {
            addCriterion("Sum_cost not in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_cost between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_cost not between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumQcIsNull() {
            addCriterion("Sum_qc is null");
            return (Criteria) this;
        }

        public Criteria andSumQcIsNotNull() {
            addCriterion("Sum_qc is not null");
            return (Criteria) this;
        }

        public Criteria andSumQcEqualTo(BigDecimal value) {
            addCriterion("Sum_qc =", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcNotEqualTo(BigDecimal value) {
            addCriterion("Sum_qc <>", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcGreaterThan(BigDecimal value) {
            addCriterion("Sum_qc >", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_qc >=", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcLessThan(BigDecimal value) {
            addCriterion("Sum_qc <", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_qc <=", value, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcIn(List<BigDecimal> values) {
            addCriterion("Sum_qc in", values, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcNotIn(List<BigDecimal> values) {
            addCriterion("Sum_qc not in", values, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_qc between", value1, value2, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumQcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_qc not between", value1, value2, "sumQc");
            return (Criteria) this;
        }

        public Criteria andSumBqIsNull() {
            addCriterion("Sum_bq is null");
            return (Criteria) this;
        }

        public Criteria andSumBqIsNotNull() {
            addCriterion("Sum_bq is not null");
            return (Criteria) this;
        }

        public Criteria andSumBqEqualTo(BigDecimal value) {
            addCriterion("Sum_bq =", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqNotEqualTo(BigDecimal value) {
            addCriterion("Sum_bq <>", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqGreaterThan(BigDecimal value) {
            addCriterion("Sum_bq >", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_bq >=", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqLessThan(BigDecimal value) {
            addCriterion("Sum_bq <", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_bq <=", value, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqIn(List<BigDecimal> values) {
            addCriterion("Sum_bq in", values, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqNotIn(List<BigDecimal> values) {
            addCriterion("Sum_bq not in", values, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_bq between", value1, value2, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumBqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_bq not between", value1, value2, "sumBq");
            return (Criteria) this;
        }

        public Criteria andSumFeeIsNull() {
            addCriterion("Sum_fee is null");
            return (Criteria) this;
        }

        public Criteria andSumFeeIsNotNull() {
            addCriterion("Sum_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSumFeeEqualTo(BigDecimal value) {
            addCriterion("Sum_fee =", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotEqualTo(BigDecimal value) {
            addCriterion("Sum_fee <>", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThan(BigDecimal value) {
            addCriterion("Sum_fee >", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_fee >=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThan(BigDecimal value) {
            addCriterion("Sum_fee <", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_fee <=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeIn(List<BigDecimal> values) {
            addCriterion("Sum_fee in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotIn(List<BigDecimal> values) {
            addCriterion("Sum_fee not in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_fee between", value1, value2, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_fee not between", value1, value2, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIsNull() {
            addCriterion("Sum_balance is null");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIsNotNull() {
            addCriterion("Sum_balance is not null");
            return (Criteria) this;
        }

        public Criteria andSumBalanceEqualTo(BigDecimal value) {
            addCriterion("Sum_balance =", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotEqualTo(BigDecimal value) {
            addCriterion("Sum_balance <>", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceGreaterThan(BigDecimal value) {
            addCriterion("Sum_balance >", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_balance >=", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceLessThan(BigDecimal value) {
            addCriterion("Sum_balance <", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_balance <=", value, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceIn(List<BigDecimal> values) {
            addCriterion("Sum_balance in", values, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotIn(List<BigDecimal> values) {
            addCriterion("Sum_balance not in", values, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_balance between", value1, value2, "sumBalance");
            return (Criteria) this;
        }

        public Criteria andSumBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_balance not between", value1, value2, "sumBalance");
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