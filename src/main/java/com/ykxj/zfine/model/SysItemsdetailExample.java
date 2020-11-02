package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysItemsdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysItemsdetailExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("F_Id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("F_Id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("F_Id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("F_Id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_Id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("F_Id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("F_Id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("F_Id like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("F_Id not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("F_Id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("F_Id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("F_Id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("F_Id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFItemidIsNull() {
            addCriterion("F_ItemId is null");
            return (Criteria) this;
        }

        public Criteria andFItemidIsNotNull() {
            addCriterion("F_ItemId is not null");
            return (Criteria) this;
        }

        public Criteria andFItemidEqualTo(String value) {
            addCriterion("F_ItemId =", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotEqualTo(String value) {
            addCriterion("F_ItemId <>", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidGreaterThan(String value) {
            addCriterion("F_ItemId >", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidGreaterThanOrEqualTo(String value) {
            addCriterion("F_ItemId >=", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLessThan(String value) {
            addCriterion("F_ItemId <", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLessThanOrEqualTo(String value) {
            addCriterion("F_ItemId <=", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidLike(String value) {
            addCriterion("F_ItemId like", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotLike(String value) {
            addCriterion("F_ItemId not like", value, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidIn(List<String> values) {
            addCriterion("F_ItemId in", values, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotIn(List<String> values) {
            addCriterion("F_ItemId not in", values, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidBetween(String value1, String value2) {
            addCriterion("F_ItemId between", value1, value2, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFItemidNotBetween(String value1, String value2) {
            addCriterion("F_ItemId not between", value1, value2, "fItemid");
            return (Criteria) this;
        }

        public Criteria andFParentidIsNull() {
            addCriterion("F_ParentId is null");
            return (Criteria) this;
        }

        public Criteria andFParentidIsNotNull() {
            addCriterion("F_ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andFParentidEqualTo(String value) {
            addCriterion("F_ParentId =", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidNotEqualTo(String value) {
            addCriterion("F_ParentId <>", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidGreaterThan(String value) {
            addCriterion("F_ParentId >", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidGreaterThanOrEqualTo(String value) {
            addCriterion("F_ParentId >=", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidLessThan(String value) {
            addCriterion("F_ParentId <", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidLessThanOrEqualTo(String value) {
            addCriterion("F_ParentId <=", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidLike(String value) {
            addCriterion("F_ParentId like", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidNotLike(String value) {
            addCriterion("F_ParentId not like", value, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidIn(List<String> values) {
            addCriterion("F_ParentId in", values, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidNotIn(List<String> values) {
            addCriterion("F_ParentId not in", values, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidBetween(String value1, String value2) {
            addCriterion("F_ParentId between", value1, value2, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFParentidNotBetween(String value1, String value2) {
            addCriterion("F_ParentId not between", value1, value2, "fParentid");
            return (Criteria) this;
        }

        public Criteria andFItemcodeIsNull() {
            addCriterion("F_ItemCode is null");
            return (Criteria) this;
        }

        public Criteria andFItemcodeIsNotNull() {
            addCriterion("F_ItemCode is not null");
            return (Criteria) this;
        }

        public Criteria andFItemcodeEqualTo(String value) {
            addCriterion("F_ItemCode =", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeNotEqualTo(String value) {
            addCriterion("F_ItemCode <>", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeGreaterThan(String value) {
            addCriterion("F_ItemCode >", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ItemCode >=", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeLessThan(String value) {
            addCriterion("F_ItemCode <", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeLessThanOrEqualTo(String value) {
            addCriterion("F_ItemCode <=", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeLike(String value) {
            addCriterion("F_ItemCode like", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeNotLike(String value) {
            addCriterion("F_ItemCode not like", value, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeIn(List<String> values) {
            addCriterion("F_ItemCode in", values, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeNotIn(List<String> values) {
            addCriterion("F_ItemCode not in", values, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeBetween(String value1, String value2) {
            addCriterion("F_ItemCode between", value1, value2, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemcodeNotBetween(String value1, String value2) {
            addCriterion("F_ItemCode not between", value1, value2, "fItemcode");
            return (Criteria) this;
        }

        public Criteria andFItemnameIsNull() {
            addCriterion("F_ItemName is null");
            return (Criteria) this;
        }

        public Criteria andFItemnameIsNotNull() {
            addCriterion("F_ItemName is not null");
            return (Criteria) this;
        }

        public Criteria andFItemnameEqualTo(String value) {
            addCriterion("F_ItemName =", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameNotEqualTo(String value) {
            addCriterion("F_ItemName <>", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameGreaterThan(String value) {
            addCriterion("F_ItemName >", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_ItemName >=", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameLessThan(String value) {
            addCriterion("F_ItemName <", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameLessThanOrEqualTo(String value) {
            addCriterion("F_ItemName <=", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameLike(String value) {
            addCriterion("F_ItemName like", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameNotLike(String value) {
            addCriterion("F_ItemName not like", value, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameIn(List<String> values) {
            addCriterion("F_ItemName in", values, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameNotIn(List<String> values) {
            addCriterion("F_ItemName not in", values, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameBetween(String value1, String value2) {
            addCriterion("F_ItemName between", value1, value2, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFItemnameNotBetween(String value1, String value2) {
            addCriterion("F_ItemName not between", value1, value2, "fItemname");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingIsNull() {
            addCriterion("F_SimpleSpelling is null");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingIsNotNull() {
            addCriterion("F_SimpleSpelling is not null");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingEqualTo(String value) {
            addCriterion("F_SimpleSpelling =", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingNotEqualTo(String value) {
            addCriterion("F_SimpleSpelling <>", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingGreaterThan(String value) {
            addCriterion("F_SimpleSpelling >", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingGreaterThanOrEqualTo(String value) {
            addCriterion("F_SimpleSpelling >=", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingLessThan(String value) {
            addCriterion("F_SimpleSpelling <", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingLessThanOrEqualTo(String value) {
            addCriterion("F_SimpleSpelling <=", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingLike(String value) {
            addCriterion("F_SimpleSpelling like", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingNotLike(String value) {
            addCriterion("F_SimpleSpelling not like", value, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingIn(List<String> values) {
            addCriterion("F_SimpleSpelling in", values, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingNotIn(List<String> values) {
            addCriterion("F_SimpleSpelling not in", values, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingBetween(String value1, String value2) {
            addCriterion("F_SimpleSpelling between", value1, value2, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFSimplespellingNotBetween(String value1, String value2) {
            addCriterion("F_SimpleSpelling not between", value1, value2, "fSimplespelling");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultIsNull() {
            addCriterion("F_IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultIsNotNull() {
            addCriterion("F_IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultEqualTo(Boolean value) {
            addCriterion("F_IsDefault =", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultNotEqualTo(Boolean value) {
            addCriterion("F_IsDefault <>", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultGreaterThan(Boolean value) {
            addCriterion("F_IsDefault >", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_IsDefault >=", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultLessThan(Boolean value) {
            addCriterion("F_IsDefault <", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("F_IsDefault <=", value, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultIn(List<Boolean> values) {
            addCriterion("F_IsDefault in", values, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultNotIn(List<Boolean> values) {
            addCriterion("F_IsDefault not in", values, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("F_IsDefault between", value1, value2, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_IsDefault not between", value1, value2, "fIsdefault");
            return (Criteria) this;
        }

        public Criteria andFLayersIsNull() {
            addCriterion("F_Layers is null");
            return (Criteria) this;
        }

        public Criteria andFLayersIsNotNull() {
            addCriterion("F_Layers is not null");
            return (Criteria) this;
        }

        public Criteria andFLayersEqualTo(Integer value) {
            addCriterion("F_Layers =", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersNotEqualTo(Integer value) {
            addCriterion("F_Layers <>", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersGreaterThan(Integer value) {
            addCriterion("F_Layers >", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_Layers >=", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersLessThan(Integer value) {
            addCriterion("F_Layers <", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersLessThanOrEqualTo(Integer value) {
            addCriterion("F_Layers <=", value, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersIn(List<Integer> values) {
            addCriterion("F_Layers in", values, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersNotIn(List<Integer> values) {
            addCriterion("F_Layers not in", values, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersBetween(Integer value1, Integer value2) {
            addCriterion("F_Layers between", value1, value2, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFLayersNotBetween(Integer value1, Integer value2) {
            addCriterion("F_Layers not between", value1, value2, "fLayers");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIsNull() {
            addCriterion("F_SortCode is null");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIsNotNull() {
            addCriterion("F_SortCode is not null");
            return (Criteria) this;
        }

        public Criteria andFSortcodeEqualTo(Integer value) {
            addCriterion("F_SortCode =", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotEqualTo(Integer value) {
            addCriterion("F_SortCode <>", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeGreaterThan(Integer value) {
            addCriterion("F_SortCode >", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode >=", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeLessThan(Integer value) {
            addCriterion("F_SortCode <", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeLessThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode <=", value, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeIn(List<Integer> values) {
            addCriterion("F_SortCode in", values, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotIn(List<Integer> values) {
            addCriterion("F_SortCode not in", values, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode between", value1, value2, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFSortcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode not between", value1, value2, "fSortcode");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIsNull() {
            addCriterion("F_DeleteMark is null");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIsNotNull() {
            addCriterion("F_DeleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkEqualTo(Boolean value) {
            addCriterion("F_DeleteMark =", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <>", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkGreaterThan(Boolean value) {
            addCriterion("F_DeleteMark >", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark >=", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkLessThan(Boolean value) {
            addCriterion("F_DeleteMark <", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <=", value, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkIn(List<Boolean> values) {
            addCriterion("F_DeleteMark in", values, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotIn(List<Boolean> values) {
            addCriterion("F_DeleteMark not in", values, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark between", value1, value2, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFDeletemarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark not between", value1, value2, "fDeletemark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIsNull() {
            addCriterion("F_EnabledMark is null");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIsNotNull() {
            addCriterion("F_EnabledMark is not null");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkEqualTo(Boolean value) {
            addCriterion("F_EnabledMark =", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <>", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkGreaterThan(Boolean value) {
            addCriterion("F_EnabledMark >", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark >=", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkLessThan(Boolean value) {
            addCriterion("F_EnabledMark <", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <=", value, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkIn(List<Boolean> values) {
            addCriterion("F_EnabledMark in", values, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotIn(List<Boolean> values) {
            addCriterion("F_EnabledMark not in", values, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark between", value1, value2, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFEnabledmarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark not between", value1, value2, "fEnabledmark");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNull() {
            addCriterion("F_Description is null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIsNotNull() {
            addCriterion("F_Description is not null");
            return (Criteria) this;
        }

        public Criteria andFDescriptionEqualTo(String value) {
            addCriterion("F_Description =", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotEqualTo(String value) {
            addCriterion("F_Description <>", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThan(String value) {
            addCriterion("F_Description >", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("F_Description >=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThan(String value) {
            addCriterion("F_Description <", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLessThanOrEqualTo(String value) {
            addCriterion("F_Description <=", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionLike(String value) {
            addCriterion("F_Description like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotLike(String value) {
            addCriterion("F_Description not like", value, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionIn(List<String> values) {
            addCriterion("F_Description in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotIn(List<String> values) {
            addCriterion("F_Description not in", values, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionBetween(String value1, String value2) {
            addCriterion("F_Description between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFDescriptionNotBetween(String value1, String value2) {
            addCriterion("F_Description not between", value1, value2, "fDescription");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIsNull() {
            addCriterion("F_CreatorTime is null");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIsNotNull() {
            addCriterion("F_CreatorTime is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeEqualTo(Date value) {
            addCriterion("F_CreatorTime =", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotEqualTo(Date value) {
            addCriterion("F_CreatorTime <>", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeGreaterThan(Date value) {
            addCriterion("F_CreatorTime >", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime >=", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeLessThan(Date value) {
            addCriterion("F_CreatorTime <", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeLessThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime <=", value, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeIn(List<Date> values) {
            addCriterion("F_CreatorTime in", values, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotIn(List<Date> values) {
            addCriterion("F_CreatorTime not in", values, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime between", value1, value2, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatortimeNotBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime not between", value1, value2, "fCreatortime");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIsNull() {
            addCriterion("F_CreatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIsNotNull() {
            addCriterion("F_CreatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridEqualTo(String value) {
            addCriterion("F_CreatorUserId =", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotEqualTo(String value) {
            addCriterion("F_CreatorUserId <>", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridGreaterThan(String value) {
            addCriterion("F_CreatorUserId >", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId >=", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLessThan(String value) {
            addCriterion("F_CreatorUserId <", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLessThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId <=", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridLike(String value) {
            addCriterion("F_CreatorUserId like", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotLike(String value) {
            addCriterion("F_CreatorUserId not like", value, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridIn(List<String> values) {
            addCriterion("F_CreatorUserId in", values, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotIn(List<String> values) {
            addCriterion("F_CreatorUserId not in", values, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId between", value1, value2, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFCreatoruseridNotBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId not between", value1, value2, "fCreatoruserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIsNull() {
            addCriterion("F_LastModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIsNotNull() {
            addCriterion("F_LastModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeEqualTo(Date value) {
            addCriterion("F_LastModifyTime =", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotEqualTo(Date value) {
            addCriterion("F_LastModifyTime <>", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeGreaterThan(Date value) {
            addCriterion("F_LastModifyTime >", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime >=", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeLessThan(Date value) {
            addCriterion("F_LastModifyTime <", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeLessThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime <=", value, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeIn(List<Date> values) {
            addCriterion("F_LastModifyTime in", values, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotIn(List<Date> values) {
            addCriterion("F_LastModifyTime not in", values, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime between", value1, value2, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifytimeNotBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime not between", value1, value2, "fLastmodifytime");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIsNull() {
            addCriterion("F_LastModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIsNotNull() {
            addCriterion("F_LastModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridEqualTo(String value) {
            addCriterion("F_LastModifyUserId =", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotEqualTo(String value) {
            addCriterion("F_LastModifyUserId <>", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridGreaterThan(String value) {
            addCriterion("F_LastModifyUserId >", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId >=", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLessThan(String value) {
            addCriterion("F_LastModifyUserId <", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLessThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId <=", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridLike(String value) {
            addCriterion("F_LastModifyUserId like", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotLike(String value) {
            addCriterion("F_LastModifyUserId not like", value, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridIn(List<String> values) {
            addCriterion("F_LastModifyUserId in", values, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotIn(List<String> values) {
            addCriterion("F_LastModifyUserId not in", values, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId between", value1, value2, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFLastmodifyuseridNotBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId not between", value1, value2, "fLastmodifyuserid");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIsNull() {
            addCriterion("F_DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIsNotNull() {
            addCriterion("F_DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeEqualTo(Date value) {
            addCriterion("F_DeleteTime =", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotEqualTo(Date value) {
            addCriterion("F_DeleteTime <>", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeGreaterThan(Date value) {
            addCriterion("F_DeleteTime >", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime >=", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeLessThan(Date value) {
            addCriterion("F_DeleteTime <", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime <=", value, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeIn(List<Date> values) {
            addCriterion("F_DeleteTime in", values, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotIn(List<Date> values) {
            addCriterion("F_DeleteTime not in", values, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime between", value1, value2, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime not between", value1, value2, "fDeletetime");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIsNull() {
            addCriterion("F_DeleteUserId is null");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIsNotNull() {
            addCriterion("F_DeleteUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridEqualTo(String value) {
            addCriterion("F_DeleteUserId =", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotEqualTo(String value) {
            addCriterion("F_DeleteUserId <>", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridGreaterThan(String value) {
            addCriterion("F_DeleteUserId >", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridGreaterThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId >=", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLessThan(String value) {
            addCriterion("F_DeleteUserId <", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLessThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId <=", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridLike(String value) {
            addCriterion("F_DeleteUserId like", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotLike(String value) {
            addCriterion("F_DeleteUserId not like", value, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridIn(List<String> values) {
            addCriterion("F_DeleteUserId in", values, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotIn(List<String> values) {
            addCriterion("F_DeleteUserId not in", values, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId between", value1, value2, "fDeleteuserid");
            return (Criteria) this;
        }

        public Criteria andFDeleteuseridNotBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId not between", value1, value2, "fDeleteuserid");
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