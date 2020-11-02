package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
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

        public Criteria andFDateIsNull() {
            addCriterion("F_Date is null");
            return (Criteria) this;
        }

        public Criteria andFDateIsNotNull() {
            addCriterion("F_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFDateEqualTo(Date value) {
            addCriterion("F_Date =", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotEqualTo(Date value) {
            addCriterion("F_Date <>", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThan(Date value) {
            addCriterion("F_Date >", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThanOrEqualTo(Date value) {
            addCriterion("F_Date >=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThan(Date value) {
            addCriterion("F_Date <", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThanOrEqualTo(Date value) {
            addCriterion("F_Date <=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateIn(List<Date> values) {
            addCriterion("F_Date in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotIn(List<Date> values) {
            addCriterion("F_Date not in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateBetween(Date value1, Date value2) {
            addCriterion("F_Date between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotBetween(Date value1, Date value2) {
            addCriterion("F_Date not between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFAccountIsNull() {
            addCriterion("F_Account is null");
            return (Criteria) this;
        }

        public Criteria andFAccountIsNotNull() {
            addCriterion("F_Account is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountEqualTo(String value) {
            addCriterion("F_Account =", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotEqualTo(String value) {
            addCriterion("F_Account <>", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountGreaterThan(String value) {
            addCriterion("F_Account >", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountGreaterThanOrEqualTo(String value) {
            addCriterion("F_Account >=", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLessThan(String value) {
            addCriterion("F_Account <", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLessThanOrEqualTo(String value) {
            addCriterion("F_Account <=", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountLike(String value) {
            addCriterion("F_Account like", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotLike(String value) {
            addCriterion("F_Account not like", value, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountIn(List<String> values) {
            addCriterion("F_Account in", values, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotIn(List<String> values) {
            addCriterion("F_Account not in", values, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountBetween(String value1, String value2) {
            addCriterion("F_Account between", value1, value2, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFAccountNotBetween(String value1, String value2) {
            addCriterion("F_Account not between", value1, value2, "fAccount");
            return (Criteria) this;
        }

        public Criteria andFNicknameIsNull() {
            addCriterion("F_NickName is null");
            return (Criteria) this;
        }

        public Criteria andFNicknameIsNotNull() {
            addCriterion("F_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andFNicknameEqualTo(String value) {
            addCriterion("F_NickName =", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotEqualTo(String value) {
            addCriterion("F_NickName <>", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameGreaterThan(String value) {
            addCriterion("F_NickName >", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NickName >=", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLessThan(String value) {
            addCriterion("F_NickName <", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLessThanOrEqualTo(String value) {
            addCriterion("F_NickName <=", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameLike(String value) {
            addCriterion("F_NickName like", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotLike(String value) {
            addCriterion("F_NickName not like", value, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameIn(List<String> values) {
            addCriterion("F_NickName in", values, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotIn(List<String> values) {
            addCriterion("F_NickName not in", values, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameBetween(String value1, String value2) {
            addCriterion("F_NickName between", value1, value2, "fNickname");
            return (Criteria) this;
        }

        public Criteria andFNicknameNotBetween(String value1, String value2) {
            addCriterion("F_NickName not between", value1, value2, "fNickname");
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

        public Criteria andFIpaddressIsNull() {
            addCriterion("F_IPAddress is null");
            return (Criteria) this;
        }

        public Criteria andFIpaddressIsNotNull() {
            addCriterion("F_IPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFIpaddressEqualTo(String value) {
            addCriterion("F_IPAddress =", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressNotEqualTo(String value) {
            addCriterion("F_IPAddress <>", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressGreaterThan(String value) {
            addCriterion("F_IPAddress >", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_IPAddress >=", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressLessThan(String value) {
            addCriterion("F_IPAddress <", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressLessThanOrEqualTo(String value) {
            addCriterion("F_IPAddress <=", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressLike(String value) {
            addCriterion("F_IPAddress like", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressNotLike(String value) {
            addCriterion("F_IPAddress not like", value, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressIn(List<String> values) {
            addCriterion("F_IPAddress in", values, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressNotIn(List<String> values) {
            addCriterion("F_IPAddress not in", values, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressBetween(String value1, String value2) {
            addCriterion("F_IPAddress between", value1, value2, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressNotBetween(String value1, String value2) {
            addCriterion("F_IPAddress not between", value1, value2, "fIpaddress");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameIsNull() {
            addCriterion("F_IPAddressName is null");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameIsNotNull() {
            addCriterion("F_IPAddressName is not null");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameEqualTo(String value) {
            addCriterion("F_IPAddressName =", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameNotEqualTo(String value) {
            addCriterion("F_IPAddressName <>", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameGreaterThan(String value) {
            addCriterion("F_IPAddressName >", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_IPAddressName >=", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameLessThan(String value) {
            addCriterion("F_IPAddressName <", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameLessThanOrEqualTo(String value) {
            addCriterion("F_IPAddressName <=", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameLike(String value) {
            addCriterion("F_IPAddressName like", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameNotLike(String value) {
            addCriterion("F_IPAddressName not like", value, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameIn(List<String> values) {
            addCriterion("F_IPAddressName in", values, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameNotIn(List<String> values) {
            addCriterion("F_IPAddressName not in", values, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameBetween(String value1, String value2) {
            addCriterion("F_IPAddressName between", value1, value2, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFIpaddressnameNotBetween(String value1, String value2) {
            addCriterion("F_IPAddressName not between", value1, value2, "fIpaddressname");
            return (Criteria) this;
        }

        public Criteria andFModuleidIsNull() {
            addCriterion("F_ModuleId is null");
            return (Criteria) this;
        }

        public Criteria andFModuleidIsNotNull() {
            addCriterion("F_ModuleId is not null");
            return (Criteria) this;
        }

        public Criteria andFModuleidEqualTo(String value) {
            addCriterion("F_ModuleId =", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidNotEqualTo(String value) {
            addCriterion("F_ModuleId <>", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidGreaterThan(String value) {
            addCriterion("F_ModuleId >", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidGreaterThanOrEqualTo(String value) {
            addCriterion("F_ModuleId >=", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidLessThan(String value) {
            addCriterion("F_ModuleId <", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidLessThanOrEqualTo(String value) {
            addCriterion("F_ModuleId <=", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidLike(String value) {
            addCriterion("F_ModuleId like", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidNotLike(String value) {
            addCriterion("F_ModuleId not like", value, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidIn(List<String> values) {
            addCriterion("F_ModuleId in", values, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidNotIn(List<String> values) {
            addCriterion("F_ModuleId not in", values, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidBetween(String value1, String value2) {
            addCriterion("F_ModuleId between", value1, value2, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModuleidNotBetween(String value1, String value2) {
            addCriterion("F_ModuleId not between", value1, value2, "fModuleid");
            return (Criteria) this;
        }

        public Criteria andFModulenameIsNull() {
            addCriterion("F_ModuleName is null");
            return (Criteria) this;
        }

        public Criteria andFModulenameIsNotNull() {
            addCriterion("F_ModuleName is not null");
            return (Criteria) this;
        }

        public Criteria andFModulenameEqualTo(String value) {
            addCriterion("F_ModuleName =", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameNotEqualTo(String value) {
            addCriterion("F_ModuleName <>", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameGreaterThan(String value) {
            addCriterion("F_ModuleName >", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("F_ModuleName >=", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameLessThan(String value) {
            addCriterion("F_ModuleName <", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameLessThanOrEqualTo(String value) {
            addCriterion("F_ModuleName <=", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameLike(String value) {
            addCriterion("F_ModuleName like", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameNotLike(String value) {
            addCriterion("F_ModuleName not like", value, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameIn(List<String> values) {
            addCriterion("F_ModuleName in", values, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameNotIn(List<String> values) {
            addCriterion("F_ModuleName not in", values, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameBetween(String value1, String value2) {
            addCriterion("F_ModuleName between", value1, value2, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFModulenameNotBetween(String value1, String value2) {
            addCriterion("F_ModuleName not between", value1, value2, "fModulename");
            return (Criteria) this;
        }

        public Criteria andFResultIsNull() {
            addCriterion("F_Result is null");
            return (Criteria) this;
        }

        public Criteria andFResultIsNotNull() {
            addCriterion("F_Result is not null");
            return (Criteria) this;
        }

        public Criteria andFResultEqualTo(Boolean value) {
            addCriterion("F_Result =", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultNotEqualTo(Boolean value) {
            addCriterion("F_Result <>", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultGreaterThan(Boolean value) {
            addCriterion("F_Result >", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_Result >=", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultLessThan(Boolean value) {
            addCriterion("F_Result <", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultLessThanOrEqualTo(Boolean value) {
            addCriterion("F_Result <=", value, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultIn(List<Boolean> values) {
            addCriterion("F_Result in", values, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultNotIn(List<Boolean> values) {
            addCriterion("F_Result not in", values, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultBetween(Boolean value1, Boolean value2) {
            addCriterion("F_Result between", value1, value2, "fResult");
            return (Criteria) this;
        }

        public Criteria andFResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_Result not between", value1, value2, "fResult");
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