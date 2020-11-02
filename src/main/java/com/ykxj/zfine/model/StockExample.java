package com.ykxj.zfine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("Barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("Barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("Barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("Barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("Barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("Barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("Barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("Barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("Barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("Barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("Barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("Barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("Barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("Barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andAcceptidIsNull() {
            addCriterion("Acceptid is null");
            return (Criteria) this;
        }

        public Criteria andAcceptidIsNotNull() {
            addCriterion("Acceptid is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptidEqualTo(String value) {
            addCriterion("Acceptid =", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotEqualTo(String value) {
            addCriterion("Acceptid <>", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidGreaterThan(String value) {
            addCriterion("Acceptid >", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidGreaterThanOrEqualTo(String value) {
            addCriterion("Acceptid >=", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidLessThan(String value) {
            addCriterion("Acceptid <", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidLessThanOrEqualTo(String value) {
            addCriterion("Acceptid <=", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidLike(String value) {
            addCriterion("Acceptid like", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotLike(String value) {
            addCriterion("Acceptid not like", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidIn(List<String> values) {
            addCriterion("Acceptid in", values, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotIn(List<String> values) {
            addCriterion("Acceptid not in", values, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidBetween(String value1, String value2) {
            addCriterion("Acceptid between", value1, value2, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotBetween(String value1, String value2) {
            addCriterion("Acceptid not between", value1, value2, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNull() {
            addCriterion("Sum_Cost is null");
            return (Criteria) this;
        }

        public Criteria andSumCostIsNotNull() {
            addCriterion("Sum_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostEqualTo(BigDecimal value) {
            addCriterion("Sum_Cost =", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotEqualTo(BigDecimal value) {
            addCriterion("Sum_Cost <>", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThan(BigDecimal value) {
            addCriterion("Sum_Cost >", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_Cost >=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThan(BigDecimal value) {
            addCriterion("Sum_Cost <", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_Cost <=", value, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostIn(List<BigDecimal> values) {
            addCriterion("Sum_Cost in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotIn(List<BigDecimal> values) {
            addCriterion("Sum_Cost not in", values, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_Cost between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_Cost not between", value1, value2, "sumCost");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("Sum_Price is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("Sum_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(BigDecimal value) {
            addCriterion("Sum_Price =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("Sum_Price <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(BigDecimal value) {
            addCriterion("Sum_Price >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_Price >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(BigDecimal value) {
            addCriterion("Sum_Price <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Sum_Price <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<BigDecimal> values) {
            addCriterion("Sum_Price in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("Sum_Price not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_Price between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Sum_Price not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andCurversionIsNull() {
            addCriterion("Curversion is null");
            return (Criteria) this;
        }

        public Criteria andCurversionIsNotNull() {
            addCriterion("Curversion is not null");
            return (Criteria) this;
        }

        public Criteria andCurversionEqualTo(Integer value) {
            addCriterion("Curversion =", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionNotEqualTo(Integer value) {
            addCriterion("Curversion <>", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionGreaterThan(Integer value) {
            addCriterion("Curversion >", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Curversion >=", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionLessThan(Integer value) {
            addCriterion("Curversion <", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionLessThanOrEqualTo(Integer value) {
            addCriterion("Curversion <=", value, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionIn(List<Integer> values) {
            addCriterion("Curversion in", values, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionNotIn(List<Integer> values) {
            addCriterion("Curversion not in", values, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionBetween(Integer value1, Integer value2) {
            addCriterion("Curversion between", value1, value2, "curversion");
            return (Criteria) this;
        }

        public Criteria andCurversionNotBetween(Integer value1, Integer value2) {
            addCriterion("Curversion not between", value1, value2, "curversion");
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

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("Sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("Sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("Sort not between", value1, value2, "sort");
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