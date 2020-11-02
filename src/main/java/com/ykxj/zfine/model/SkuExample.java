package com.ykxj.zfine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkuExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("Spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("Spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("Spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("Spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("Spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("Spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("Spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("Spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("Spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("Spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("Spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("Spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("Spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("Spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andIfstockIsNull() {
            addCriterion("ifstock is null");
            return (Criteria) this;
        }

        public Criteria andIfstockIsNotNull() {
            addCriterion("ifstock is not null");
            return (Criteria) this;
        }

        public Criteria andIfstockEqualTo(Integer value) {
            addCriterion("ifstock =", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotEqualTo(Integer value) {
            addCriterion("ifstock <>", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockGreaterThan(Integer value) {
            addCriterion("ifstock >", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("ifstock >=", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockLessThan(Integer value) {
            addCriterion("ifstock <", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockLessThanOrEqualTo(Integer value) {
            addCriterion("ifstock <=", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockIn(List<Integer> values) {
            addCriterion("ifstock in", values, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotIn(List<Integer> values) {
            addCriterion("ifstock not in", values, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockBetween(Integer value1, Integer value2) {
            addCriterion("ifstock between", value1, value2, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotBetween(Integer value1, Integer value2) {
            addCriterion("ifstock not between", value1, value2, "ifstock");
            return (Criteria) this;
        }

        public Criteria andConversionIsNull() {
            addCriterion("Conversion is null");
            return (Criteria) this;
        }

        public Criteria andConversionIsNotNull() {
            addCriterion("Conversion is not null");
            return (Criteria) this;
        }

        public Criteria andConversionEqualTo(BigDecimal value) {
            addCriterion("Conversion =", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotEqualTo(BigDecimal value) {
            addCriterion("Conversion <>", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionGreaterThan(BigDecimal value) {
            addCriterion("Conversion >", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Conversion >=", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionLessThan(BigDecimal value) {
            addCriterion("Conversion <", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Conversion <=", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionIn(List<BigDecimal> values) {
            addCriterion("Conversion in", values, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotIn(List<BigDecimal> values) {
            addCriterion("Conversion not in", values, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Conversion between", value1, value2, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Conversion not between", value1, value2, "conversion");
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

        public Criteria andCostpriceIsNull() {
            addCriterion("Costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("Costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("Costprice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("Costprice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("Costprice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Costprice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("Costprice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Costprice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("Costprice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("Costprice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Costprice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Costprice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMempriceIsNull() {
            addCriterion("Memprice is null");
            return (Criteria) this;
        }

        public Criteria andMempriceIsNotNull() {
            addCriterion("Memprice is not null");
            return (Criteria) this;
        }

        public Criteria andMempriceEqualTo(BigDecimal value) {
            addCriterion("Memprice =", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceNotEqualTo(BigDecimal value) {
            addCriterion("Memprice <>", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceGreaterThan(BigDecimal value) {
            addCriterion("Memprice >", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Memprice >=", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceLessThan(BigDecimal value) {
            addCriterion("Memprice <", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Memprice <=", value, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceIn(List<BigDecimal> values) {
            addCriterion("Memprice in", values, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceNotIn(List<BigDecimal> values) {
            addCriterion("Memprice not in", values, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Memprice between", value1, value2, "memprice");
            return (Criteria) this;
        }

        public Criteria andMempriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Memprice not between", value1, value2, "memprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceIsNull() {
            addCriterion("BatchPrice is null");
            return (Criteria) this;
        }

        public Criteria andBatchpriceIsNotNull() {
            addCriterion("BatchPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBatchpriceEqualTo(BigDecimal value) {
            addCriterion("BatchPrice =", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceNotEqualTo(BigDecimal value) {
            addCriterion("BatchPrice <>", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceGreaterThan(BigDecimal value) {
            addCriterion("BatchPrice >", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BatchPrice >=", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceLessThan(BigDecimal value) {
            addCriterion("BatchPrice <", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BatchPrice <=", value, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceIn(List<BigDecimal> values) {
            addCriterion("BatchPrice in", values, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceNotIn(List<BigDecimal> values) {
            addCriterion("BatchPrice not in", values, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BatchPrice between", value1, value2, "batchprice");
            return (Criteria) this;
        }

        public Criteria andBatchpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BatchPrice not between", value1, value2, "batchprice");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("Tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("Tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Integer value) {
            addCriterion("Tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Integer value) {
            addCriterion("Tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Integer value) {
            addCriterion("Tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Integer value) {
            addCriterion("Tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Integer value) {
            addCriterion("Tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Integer> values) {
            addCriterion("Tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Integer> values) {
            addCriterion("Tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Integer value1, Integer value2) {
            addCriterion("Tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("Tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("Nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("Nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("Nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("Nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("Nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("Nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("Nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("Nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("Nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("Nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("Nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("Nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("Nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("Nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andKeepdayIsNull() {
            addCriterion("keepday is null");
            return (Criteria) this;
        }

        public Criteria andKeepdayIsNotNull() {
            addCriterion("keepday is not null");
            return (Criteria) this;
        }

        public Criteria andKeepdayEqualTo(Integer value) {
            addCriterion("keepday =", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayNotEqualTo(Integer value) {
            addCriterion("keepday <>", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayGreaterThan(Integer value) {
            addCriterion("keepday >", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("keepday >=", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayLessThan(Integer value) {
            addCriterion("keepday <", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayLessThanOrEqualTo(Integer value) {
            addCriterion("keepday <=", value, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayIn(List<Integer> values) {
            addCriterion("keepday in", values, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayNotIn(List<Integer> values) {
            addCriterion("keepday not in", values, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayBetween(Integer value1, Integer value2) {
            addCriterion("keepday between", value1, value2, "keepday");
            return (Criteria) this;
        }

        public Criteria andKeepdayNotBetween(Integer value1, Integer value2) {
            addCriterion("keepday not between", value1, value2, "keepday");
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

        public Criteria andStatuEqualTo(String value) {
            addCriterion("Statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(String value) {
            addCriterion("Statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(String value) {
            addCriterion("Statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(String value) {
            addCriterion("Statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(String value) {
            addCriterion("Statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(String value) {
            addCriterion("Statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLike(String value) {
            addCriterion("Statu like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotLike(String value) {
            addCriterion("Statu not like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<String> values) {
            addCriterion("Statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<String> values) {
            addCriterion("Statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(String value1, String value2) {
            addCriterion("Statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(String value1, String value2) {
            addCriterion("Statu not between", value1, value2, "statu");
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