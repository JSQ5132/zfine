package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrganizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrganizeExample() {
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

        public Criteria andFShortnameIsNull() {
            addCriterion("F_ShortName is null");
            return (Criteria) this;
        }

        public Criteria andFShortnameIsNotNull() {
            addCriterion("F_ShortName is not null");
            return (Criteria) this;
        }

        public Criteria andFShortnameEqualTo(String value) {
            addCriterion("F_ShortName =", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameNotEqualTo(String value) {
            addCriterion("F_ShortName <>", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameGreaterThan(String value) {
            addCriterion("F_ShortName >", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_ShortName >=", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameLessThan(String value) {
            addCriterion("F_ShortName <", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameLessThanOrEqualTo(String value) {
            addCriterion("F_ShortName <=", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameLike(String value) {
            addCriterion("F_ShortName like", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameNotLike(String value) {
            addCriterion("F_ShortName not like", value, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameIn(List<String> values) {
            addCriterion("F_ShortName in", values, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameNotIn(List<String> values) {
            addCriterion("F_ShortName not in", values, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameBetween(String value1, String value2) {
            addCriterion("F_ShortName between", value1, value2, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFShortnameNotBetween(String value1, String value2) {
            addCriterion("F_ShortName not between", value1, value2, "fShortname");
            return (Criteria) this;
        }

        public Criteria andFCategoryidIsNull() {
            addCriterion("F_CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andFCategoryidIsNotNull() {
            addCriterion("F_CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andFCategoryidEqualTo(String value) {
            addCriterion("F_CategoryId =", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidNotEqualTo(String value) {
            addCriterion("F_CategoryId <>", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidGreaterThan(String value) {
            addCriterion("F_CategoryId >", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("F_CategoryId >=", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidLessThan(String value) {
            addCriterion("F_CategoryId <", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidLessThanOrEqualTo(String value) {
            addCriterion("F_CategoryId <=", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidLike(String value) {
            addCriterion("F_CategoryId like", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidNotLike(String value) {
            addCriterion("F_CategoryId not like", value, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidIn(List<String> values) {
            addCriterion("F_CategoryId in", values, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidNotIn(List<String> values) {
            addCriterion("F_CategoryId not in", values, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidBetween(String value1, String value2) {
            addCriterion("F_CategoryId between", value1, value2, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFCategoryidNotBetween(String value1, String value2) {
            addCriterion("F_CategoryId not between", value1, value2, "fCategoryid");
            return (Criteria) this;
        }

        public Criteria andFManageridIsNull() {
            addCriterion("F_ManagerId is null");
            return (Criteria) this;
        }

        public Criteria andFManageridIsNotNull() {
            addCriterion("F_ManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andFManageridEqualTo(String value) {
            addCriterion("F_ManagerId =", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotEqualTo(String value) {
            addCriterion("F_ManagerId <>", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridGreaterThan(String value) {
            addCriterion("F_ManagerId >", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridGreaterThanOrEqualTo(String value) {
            addCriterion("F_ManagerId >=", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLessThan(String value) {
            addCriterion("F_ManagerId <", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLessThanOrEqualTo(String value) {
            addCriterion("F_ManagerId <=", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridLike(String value) {
            addCriterion("F_ManagerId like", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotLike(String value) {
            addCriterion("F_ManagerId not like", value, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridIn(List<String> values) {
            addCriterion("F_ManagerId in", values, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotIn(List<String> values) {
            addCriterion("F_ManagerId not in", values, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridBetween(String value1, String value2) {
            addCriterion("F_ManagerId between", value1, value2, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFManageridNotBetween(String value1, String value2) {
            addCriterion("F_ManagerId not between", value1, value2, "fManagerid");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIsNull() {
            addCriterion("F_TelePhone is null");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIsNotNull() {
            addCriterion("F_TelePhone is not null");
            return (Criteria) this;
        }

        public Criteria andFTelephoneEqualTo(String value) {
            addCriterion("F_TelePhone =", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotEqualTo(String value) {
            addCriterion("F_TelePhone <>", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneGreaterThan(String value) {
            addCriterion("F_TelePhone >", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("F_TelePhone >=", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLessThan(String value) {
            addCriterion("F_TelePhone <", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLessThanOrEqualTo(String value) {
            addCriterion("F_TelePhone <=", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLike(String value) {
            addCriterion("F_TelePhone like", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotLike(String value) {
            addCriterion("F_TelePhone not like", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIn(List<String> values) {
            addCriterion("F_TelePhone in", values, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotIn(List<String> values) {
            addCriterion("F_TelePhone not in", values, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneBetween(String value1, String value2) {
            addCriterion("F_TelePhone between", value1, value2, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotBetween(String value1, String value2) {
            addCriterion("F_TelePhone not between", value1, value2, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIsNull() {
            addCriterion("F_MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIsNotNull() {
            addCriterion("F_MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneEqualTo(String value) {
            addCriterion("F_MobilePhone =", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotEqualTo(String value) {
            addCriterion("F_MobilePhone <>", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneGreaterThan(String value) {
            addCriterion("F_MobilePhone >", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("F_MobilePhone >=", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLessThan(String value) {
            addCriterion("F_MobilePhone <", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("F_MobilePhone <=", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneLike(String value) {
            addCriterion("F_MobilePhone like", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotLike(String value) {
            addCriterion("F_MobilePhone not like", value, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneIn(List<String> values) {
            addCriterion("F_MobilePhone in", values, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotIn(List<String> values) {
            addCriterion("F_MobilePhone not in", values, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneBetween(String value1, String value2) {
            addCriterion("F_MobilePhone between", value1, value2, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFMobilephoneNotBetween(String value1, String value2) {
            addCriterion("F_MobilePhone not between", value1, value2, "fMobilephone");
            return (Criteria) this;
        }

        public Criteria andFWechatIsNull() {
            addCriterion("F_WeChat is null");
            return (Criteria) this;
        }

        public Criteria andFWechatIsNotNull() {
            addCriterion("F_WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andFWechatEqualTo(String value) {
            addCriterion("F_WeChat =", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotEqualTo(String value) {
            addCriterion("F_WeChat <>", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatGreaterThan(String value) {
            addCriterion("F_WeChat >", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatGreaterThanOrEqualTo(String value) {
            addCriterion("F_WeChat >=", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLessThan(String value) {
            addCriterion("F_WeChat <", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLessThanOrEqualTo(String value) {
            addCriterion("F_WeChat <=", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatLike(String value) {
            addCriterion("F_WeChat like", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotLike(String value) {
            addCriterion("F_WeChat not like", value, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatIn(List<String> values) {
            addCriterion("F_WeChat in", values, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotIn(List<String> values) {
            addCriterion("F_WeChat not in", values, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatBetween(String value1, String value2) {
            addCriterion("F_WeChat between", value1, value2, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFWechatNotBetween(String value1, String value2) {
            addCriterion("F_WeChat not between", value1, value2, "fWechat");
            return (Criteria) this;
        }

        public Criteria andFFaxIsNull() {
            addCriterion("F_Fax is null");
            return (Criteria) this;
        }

        public Criteria andFFaxIsNotNull() {
            addCriterion("F_Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFFaxEqualTo(String value) {
            addCriterion("F_Fax =", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxNotEqualTo(String value) {
            addCriterion("F_Fax <>", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxGreaterThan(String value) {
            addCriterion("F_Fax >", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxGreaterThanOrEqualTo(String value) {
            addCriterion("F_Fax >=", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxLessThan(String value) {
            addCriterion("F_Fax <", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxLessThanOrEqualTo(String value) {
            addCriterion("F_Fax <=", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxLike(String value) {
            addCriterion("F_Fax like", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxNotLike(String value) {
            addCriterion("F_Fax not like", value, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxIn(List<String> values) {
            addCriterion("F_Fax in", values, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxNotIn(List<String> values) {
            addCriterion("F_Fax not in", values, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxBetween(String value1, String value2) {
            addCriterion("F_Fax between", value1, value2, "fFax");
            return (Criteria) this;
        }

        public Criteria andFFaxNotBetween(String value1, String value2) {
            addCriterion("F_Fax not between", value1, value2, "fFax");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNull() {
            addCriterion("F_Email is null");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNotNull() {
            addCriterion("F_Email is not null");
            return (Criteria) this;
        }

        public Criteria andFEmailEqualTo(String value) {
            addCriterion("F_Email =", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotEqualTo(String value) {
            addCriterion("F_Email <>", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThan(String value) {
            addCriterion("F_Email >", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThanOrEqualTo(String value) {
            addCriterion("F_Email >=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThan(String value) {
            addCriterion("F_Email <", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThanOrEqualTo(String value) {
            addCriterion("F_Email <=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLike(String value) {
            addCriterion("F_Email like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotLike(String value) {
            addCriterion("F_Email not like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailIn(List<String> values) {
            addCriterion("F_Email in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotIn(List<String> values) {
            addCriterion("F_Email not in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailBetween(String value1, String value2) {
            addCriterion("F_Email between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotBetween(String value1, String value2) {
            addCriterion("F_Email not between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFAreaidIsNull() {
            addCriterion("F_AreaId is null");
            return (Criteria) this;
        }

        public Criteria andFAreaidIsNotNull() {
            addCriterion("F_AreaId is not null");
            return (Criteria) this;
        }

        public Criteria andFAreaidEqualTo(String value) {
            addCriterion("F_AreaId =", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidNotEqualTo(String value) {
            addCriterion("F_AreaId <>", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidGreaterThan(String value) {
            addCriterion("F_AreaId >", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("F_AreaId >=", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidLessThan(String value) {
            addCriterion("F_AreaId <", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidLessThanOrEqualTo(String value) {
            addCriterion("F_AreaId <=", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidLike(String value) {
            addCriterion("F_AreaId like", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidNotLike(String value) {
            addCriterion("F_AreaId not like", value, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidIn(List<String> values) {
            addCriterion("F_AreaId in", values, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidNotIn(List<String> values) {
            addCriterion("F_AreaId not in", values, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidBetween(String value1, String value2) {
            addCriterion("F_AreaId between", value1, value2, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAreaidNotBetween(String value1, String value2) {
            addCriterion("F_AreaId not between", value1, value2, "fAreaid");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNull() {
            addCriterion("F_Address is null");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNotNull() {
            addCriterion("F_Address is not null");
            return (Criteria) this;
        }

        public Criteria andFAddressEqualTo(String value) {
            addCriterion("F_Address =", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotEqualTo(String value) {
            addCriterion("F_Address <>", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThan(String value) {
            addCriterion("F_Address >", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThanOrEqualTo(String value) {
            addCriterion("F_Address >=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThan(String value) {
            addCriterion("F_Address <", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThanOrEqualTo(String value) {
            addCriterion("F_Address <=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLike(String value) {
            addCriterion("F_Address like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotLike(String value) {
            addCriterion("F_Address not like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressIn(List<String> values) {
            addCriterion("F_Address in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotIn(List<String> values) {
            addCriterion("F_Address not in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressBetween(String value1, String value2) {
            addCriterion("F_Address between", value1, value2, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotBetween(String value1, String value2) {
            addCriterion("F_Address not between", value1, value2, "fAddress");
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