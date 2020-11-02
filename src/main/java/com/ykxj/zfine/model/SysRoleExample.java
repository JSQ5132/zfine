package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andFOrganizeidIsNull() {
            addCriterion("F_OrganizeId is null");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidIsNotNull() {
            addCriterion("F_OrganizeId is not null");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidEqualTo(String value) {
            addCriterion("F_OrganizeId =", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotEqualTo(String value) {
            addCriterion("F_OrganizeId <>", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidGreaterThan(String value) {
            addCriterion("F_OrganizeId >", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidGreaterThanOrEqualTo(String value) {
            addCriterion("F_OrganizeId >=", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLessThan(String value) {
            addCriterion("F_OrganizeId <", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLessThanOrEqualTo(String value) {
            addCriterion("F_OrganizeId <=", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidLike(String value) {
            addCriterion("F_OrganizeId like", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotLike(String value) {
            addCriterion("F_OrganizeId not like", value, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidIn(List<String> values) {
            addCriterion("F_OrganizeId in", values, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotIn(List<String> values) {
            addCriterion("F_OrganizeId not in", values, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidBetween(String value1, String value2) {
            addCriterion("F_OrganizeId between", value1, value2, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFOrganizeidNotBetween(String value1, String value2) {
            addCriterion("F_OrganizeId not between", value1, value2, "fOrganizeid");
            return (Criteria) this;
        }

        public Criteria andFCategoryIsNull() {
            addCriterion("F_Category is null");
            return (Criteria) this;
        }

        public Criteria andFCategoryIsNotNull() {
            addCriterion("F_Category is not null");
            return (Criteria) this;
        }

        public Criteria andFCategoryEqualTo(Integer value) {
            addCriterion("F_Category =", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryNotEqualTo(Integer value) {
            addCriterion("F_Category <>", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryGreaterThan(Integer value) {
            addCriterion("F_Category >", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_Category >=", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryLessThan(Integer value) {
            addCriterion("F_Category <", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("F_Category <=", value, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryIn(List<Integer> values) {
            addCriterion("F_Category in", values, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryNotIn(List<Integer> values) {
            addCriterion("F_Category not in", values, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryBetween(Integer value1, Integer value2) {
            addCriterion("F_Category between", value1, value2, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("F_Category not between", value1, value2, "fCategory");
            return (Criteria) this;
        }

        public Criteria andFEncodeIsNull() {
            addCriterion("F_EnCode is null");
            return (Criteria) this;
        }

        public Criteria andFEncodeIsNotNull() {
            addCriterion("F_EnCode is not null");
            return (Criteria) this;
        }

        public Criteria andFEncodeEqualTo(String value) {
            addCriterion("F_EnCode =", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeNotEqualTo(String value) {
            addCriterion("F_EnCode <>", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeGreaterThan(String value) {
            addCriterion("F_EnCode >", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_EnCode >=", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeLessThan(String value) {
            addCriterion("F_EnCode <", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeLessThanOrEqualTo(String value) {
            addCriterion("F_EnCode <=", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeLike(String value) {
            addCriterion("F_EnCode like", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeNotLike(String value) {
            addCriterion("F_EnCode not like", value, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeIn(List<String> values) {
            addCriterion("F_EnCode in", values, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeNotIn(List<String> values) {
            addCriterion("F_EnCode not in", values, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeBetween(String value1, String value2) {
            addCriterion("F_EnCode between", value1, value2, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFEncodeNotBetween(String value1, String value2) {
            addCriterion("F_EnCode not between", value1, value2, "fEncode");
            return (Criteria) this;
        }

        public Criteria andFFullnameIsNull() {
            addCriterion("F_FullName is null");
            return (Criteria) this;
        }

        public Criteria andFFullnameIsNotNull() {
            addCriterion("F_FullName is not null");
            return (Criteria) this;
        }

        public Criteria andFFullnameEqualTo(String value) {
            addCriterion("F_FullName =", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameNotEqualTo(String value) {
            addCriterion("F_FullName <>", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameGreaterThan(String value) {
            addCriterion("F_FullName >", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_FullName >=", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameLessThan(String value) {
            addCriterion("F_FullName <", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameLessThanOrEqualTo(String value) {
            addCriterion("F_FullName <=", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameLike(String value) {
            addCriterion("F_FullName like", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameNotLike(String value) {
            addCriterion("F_FullName not like", value, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameIn(List<String> values) {
            addCriterion("F_FullName in", values, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameNotIn(List<String> values) {
            addCriterion("F_FullName not in", values, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameBetween(String value1, String value2) {
            addCriterion("F_FullName between", value1, value2, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFFullnameNotBetween(String value1, String value2) {
            addCriterion("F_FullName not between", value1, value2, "fFullname");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("F_Type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("F_Type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("F_Type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("F_Type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("F_Type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_Type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("F_Type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("F_Type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("F_Type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("F_Type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("F_Type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("F_Type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("F_Type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("F_Type not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFAlloweditIsNull() {
            addCriterion("F_AllowEdit is null");
            return (Criteria) this;
        }

        public Criteria andFAlloweditIsNotNull() {
            addCriterion("F_AllowEdit is not null");
            return (Criteria) this;
        }

        public Criteria andFAlloweditEqualTo(Boolean value) {
            addCriterion("F_AllowEdit =", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditNotEqualTo(Boolean value) {
            addCriterion("F_AllowEdit <>", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditGreaterThan(Boolean value) {
            addCriterion("F_AllowEdit >", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_AllowEdit >=", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditLessThan(Boolean value) {
            addCriterion("F_AllowEdit <", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditLessThanOrEqualTo(Boolean value) {
            addCriterion("F_AllowEdit <=", value, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditIn(List<Boolean> values) {
            addCriterion("F_AllowEdit in", values, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditNotIn(List<Boolean> values) {
            addCriterion("F_AllowEdit not in", values, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditBetween(Boolean value1, Boolean value2) {
            addCriterion("F_AllowEdit between", value1, value2, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAlloweditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_AllowEdit not between", value1, value2, "fAllowedit");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteIsNull() {
            addCriterion("F_AllowDelete is null");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteIsNotNull() {
            addCriterion("F_AllowDelete is not null");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteEqualTo(Boolean value) {
            addCriterion("F_AllowDelete =", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteNotEqualTo(Boolean value) {
            addCriterion("F_AllowDelete <>", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteGreaterThan(Boolean value) {
            addCriterion("F_AllowDelete >", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_AllowDelete >=", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteLessThan(Boolean value) {
            addCriterion("F_AllowDelete <", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("F_AllowDelete <=", value, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteIn(List<Boolean> values) {
            addCriterion("F_AllowDelete in", values, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteNotIn(List<Boolean> values) {
            addCriterion("F_AllowDelete not in", values, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("F_AllowDelete between", value1, value2, "fAllowdelete");
            return (Criteria) this;
        }

        public Criteria andFAllowdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_AllowDelete not between", value1, value2, "fAllowdelete");
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

        public Criteria andFGroupidIsNull() {
            addCriterion("F_GroupId is null");
            return (Criteria) this;
        }

        public Criteria andFGroupidIsNotNull() {
            addCriterion("F_GroupId is not null");
            return (Criteria) this;
        }

        public Criteria andFGroupidEqualTo(String value) {
            addCriterion("F_GroupId =", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidNotEqualTo(String value) {
            addCriterion("F_GroupId <>", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidGreaterThan(String value) {
            addCriterion("F_GroupId >", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("F_GroupId >=", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidLessThan(String value) {
            addCriterion("F_GroupId <", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidLessThanOrEqualTo(String value) {
            addCriterion("F_GroupId <=", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidLike(String value) {
            addCriterion("F_GroupId like", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidNotLike(String value) {
            addCriterion("F_GroupId not like", value, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidIn(List<String> values) {
            addCriterion("F_GroupId in", values, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidNotIn(List<String> values) {
            addCriterion("F_GroupId not in", values, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidBetween(String value1, String value2) {
            addCriterion("F_GroupId between", value1, value2, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andFGroupidNotBetween(String value1, String value2) {
            addCriterion("F_GroupId not between", value1, value2, "fGroupid");
            return (Criteria) this;
        }

        public Criteria andStatueIsNull() {
            addCriterion("Statue is null");
            return (Criteria) this;
        }

        public Criteria andStatueIsNotNull() {
            addCriterion("Statue is not null");
            return (Criteria) this;
        }

        public Criteria andStatueEqualTo(String value) {
            addCriterion("Statue =", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotEqualTo(String value) {
            addCriterion("Statue <>", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThan(String value) {
            addCriterion("Statue >", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueGreaterThanOrEqualTo(String value) {
            addCriterion("Statue >=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThan(String value) {
            addCriterion("Statue <", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLessThanOrEqualTo(String value) {
            addCriterion("Statue <=", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueLike(String value) {
            addCriterion("Statue like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotLike(String value) {
            addCriterion("Statue not like", value, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueIn(List<String> values) {
            addCriterion("Statue in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotIn(List<String> values) {
            addCriterion("Statue not in", values, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueBetween(String value1, String value2) {
            addCriterion("Statue between", value1, value2, "statue");
            return (Criteria) this;
        }

        public Criteria andStatueNotBetween(String value1, String value2) {
            addCriterion("Statue not between", value1, value2, "statue");
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