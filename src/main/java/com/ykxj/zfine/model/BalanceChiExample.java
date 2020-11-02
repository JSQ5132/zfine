package com.ykxj.zfine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BalanceChiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceChiExample() {
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

        public Criteria andVoucherIsNull() {
            addCriterion("Voucher is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNotNull() {
            addCriterion("Voucher is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEqualTo(String value) {
            addCriterion("Voucher =", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotEqualTo(String value) {
            addCriterion("Voucher <>", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThan(String value) {
            addCriterion("Voucher >", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("Voucher >=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThan(String value) {
            addCriterion("Voucher <", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThanOrEqualTo(String value) {
            addCriterion("Voucher <=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLike(String value) {
            addCriterion("Voucher like", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotLike(String value) {
            addCriterion("Voucher not like", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherIn(List<String> values) {
            addCriterion("Voucher in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotIn(List<String> values) {
            addCriterion("Voucher not in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherBetween(String value1, String value2) {
            addCriterion("Voucher between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotBetween(String value1, String value2) {
            addCriterion("Voucher not between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andResumeIsNull() {
            addCriterion("Resume is null");
            return (Criteria) this;
        }

        public Criteria andResumeIsNotNull() {
            addCriterion("Resume is not null");
            return (Criteria) this;
        }

        public Criteria andResumeEqualTo(String value) {
            addCriterion("Resume =", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotEqualTo(String value) {
            addCriterion("Resume <>", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThan(String value) {
            addCriterion("Resume >", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThanOrEqualTo(String value) {
            addCriterion("Resume >=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThan(String value) {
            addCriterion("Resume <", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThanOrEqualTo(String value) {
            addCriterion("Resume <=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLike(String value) {
            addCriterion("Resume like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotLike(String value) {
            addCriterion("Resume not like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeIn(List<String> values) {
            addCriterion("Resume in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotIn(List<String> values) {
            addCriterion("Resume not in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeBetween(String value1, String value2) {
            addCriterion("Resume between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotBetween(String value1, String value2) {
            addCriterion("Resume not between", value1, value2, "resume");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBusdateIsNull() {
            addCriterion("busdate is null");
            return (Criteria) this;
        }

        public Criteria andBusdateIsNotNull() {
            addCriterion("busdate is not null");
            return (Criteria) this;
        }

        public Criteria andBusdateEqualTo(Date value) {
            addCriterion("busdate =", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotEqualTo(Date value) {
            addCriterion("busdate <>", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateGreaterThan(Date value) {
            addCriterion("busdate >", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateGreaterThanOrEqualTo(Date value) {
            addCriterion("busdate >=", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateLessThan(Date value) {
            addCriterion("busdate <", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateLessThanOrEqualTo(Date value) {
            addCriterion("busdate <=", value, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateIn(List<Date> values) {
            addCriterion("busdate in", values, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotIn(List<Date> values) {
            addCriterion("busdate not in", values, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateBetween(Date value1, Date value2) {
            addCriterion("busdate between", value1, value2, "busdate");
            return (Criteria) this;
        }

        public Criteria andBusdateNotBetween(Date value1, Date value2) {
            addCriterion("busdate not between", value1, value2, "busdate");
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