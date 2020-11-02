package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class PbcattblExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbcattblExample() {
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

        public Criteria andPbtTnamIsNull() {
            addCriterion("pbt_tnam is null");
            return (Criteria) this;
        }

        public Criteria andPbtTnamIsNotNull() {
            addCriterion("pbt_tnam is not null");
            return (Criteria) this;
        }

        public Criteria andPbtTnamEqualTo(String value) {
            addCriterion("pbt_tnam =", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamNotEqualTo(String value) {
            addCriterion("pbt_tnam <>", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamGreaterThan(String value) {
            addCriterion("pbt_tnam >", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamGreaterThanOrEqualTo(String value) {
            addCriterion("pbt_tnam >=", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamLessThan(String value) {
            addCriterion("pbt_tnam <", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamLessThanOrEqualTo(String value) {
            addCriterion("pbt_tnam <=", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamLike(String value) {
            addCriterion("pbt_tnam like", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamNotLike(String value) {
            addCriterion("pbt_tnam not like", value, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamIn(List<String> values) {
            addCriterion("pbt_tnam in", values, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamNotIn(List<String> values) {
            addCriterion("pbt_tnam not in", values, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamBetween(String value1, String value2) {
            addCriterion("pbt_tnam between", value1, value2, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTnamNotBetween(String value1, String value2) {
            addCriterion("pbt_tnam not between", value1, value2, "pbtTnam");
            return (Criteria) this;
        }

        public Criteria andPbtTidIsNull() {
            addCriterion("pbt_tid is null");
            return (Criteria) this;
        }

        public Criteria andPbtTidIsNotNull() {
            addCriterion("pbt_tid is not null");
            return (Criteria) this;
        }

        public Criteria andPbtTidEqualTo(Integer value) {
            addCriterion("pbt_tid =", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidNotEqualTo(Integer value) {
            addCriterion("pbt_tid <>", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidGreaterThan(Integer value) {
            addCriterion("pbt_tid >", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbt_tid >=", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidLessThan(Integer value) {
            addCriterion("pbt_tid <", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidLessThanOrEqualTo(Integer value) {
            addCriterion("pbt_tid <=", value, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidIn(List<Integer> values) {
            addCriterion("pbt_tid in", values, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidNotIn(List<Integer> values) {
            addCriterion("pbt_tid not in", values, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidBetween(Integer value1, Integer value2) {
            addCriterion("pbt_tid between", value1, value2, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtTidNotBetween(Integer value1, Integer value2) {
            addCriterion("pbt_tid not between", value1, value2, "pbtTid");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrIsNull() {
            addCriterion("pbt_ownr is null");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrIsNotNull() {
            addCriterion("pbt_ownr is not null");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrEqualTo(String value) {
            addCriterion("pbt_ownr =", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrNotEqualTo(String value) {
            addCriterion("pbt_ownr <>", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrGreaterThan(String value) {
            addCriterion("pbt_ownr >", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrGreaterThanOrEqualTo(String value) {
            addCriterion("pbt_ownr >=", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrLessThan(String value) {
            addCriterion("pbt_ownr <", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrLessThanOrEqualTo(String value) {
            addCriterion("pbt_ownr <=", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrLike(String value) {
            addCriterion("pbt_ownr like", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrNotLike(String value) {
            addCriterion("pbt_ownr not like", value, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrIn(List<String> values) {
            addCriterion("pbt_ownr in", values, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrNotIn(List<String> values) {
            addCriterion("pbt_ownr not in", values, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrBetween(String value1, String value2) {
            addCriterion("pbt_ownr between", value1, value2, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbtOwnrNotBetween(String value1, String value2) {
            addCriterion("pbt_ownr not between", value1, value2, "pbtOwnr");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtIsNull() {
            addCriterion("pbd_fhgt is null");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtIsNotNull() {
            addCriterion("pbd_fhgt is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtEqualTo(Integer value) {
            addCriterion("pbd_fhgt =", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtNotEqualTo(Integer value) {
            addCriterion("pbd_fhgt <>", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtGreaterThan(Integer value) {
            addCriterion("pbd_fhgt >", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbd_fhgt >=", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtLessThan(Integer value) {
            addCriterion("pbd_fhgt <", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbd_fhgt <=", value, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtIn(List<Integer> values) {
            addCriterion("pbd_fhgt in", values, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtNotIn(List<Integer> values) {
            addCriterion("pbd_fhgt not in", values, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fhgt between", value1, value2, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFhgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fhgt not between", value1, value2, "pbdFhgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtIsNull() {
            addCriterion("pbd_fwgt is null");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtIsNotNull() {
            addCriterion("pbd_fwgt is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtEqualTo(Integer value) {
            addCriterion("pbd_fwgt =", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtNotEqualTo(Integer value) {
            addCriterion("pbd_fwgt <>", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtGreaterThan(Integer value) {
            addCriterion("pbd_fwgt >", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbd_fwgt >=", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtLessThan(Integer value) {
            addCriterion("pbd_fwgt <", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbd_fwgt <=", value, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtIn(List<Integer> values) {
            addCriterion("pbd_fwgt in", values, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtNotIn(List<Integer> values) {
            addCriterion("pbd_fwgt not in", values, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fwgt between", value1, value2, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFwgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fwgt not between", value1, value2, "pbdFwgt");
            return (Criteria) this;
        }

        public Criteria andPbdFitlIsNull() {
            addCriterion("pbd_fitl is null");
            return (Criteria) this;
        }

        public Criteria andPbdFitlIsNotNull() {
            addCriterion("pbd_fitl is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFitlEqualTo(String value) {
            addCriterion("pbd_fitl =", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlNotEqualTo(String value) {
            addCriterion("pbd_fitl <>", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlGreaterThan(String value) {
            addCriterion("pbd_fitl >", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlGreaterThanOrEqualTo(String value) {
            addCriterion("pbd_fitl >=", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlLessThan(String value) {
            addCriterion("pbd_fitl <", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlLessThanOrEqualTo(String value) {
            addCriterion("pbd_fitl <=", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlLike(String value) {
            addCriterion("pbd_fitl like", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlNotLike(String value) {
            addCriterion("pbd_fitl not like", value, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlIn(List<String> values) {
            addCriterion("pbd_fitl in", values, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlNotIn(List<String> values) {
            addCriterion("pbd_fitl not in", values, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlBetween(String value1, String value2) {
            addCriterion("pbd_fitl between", value1, value2, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFitlNotBetween(String value1, String value2) {
            addCriterion("pbd_fitl not between", value1, value2, "pbdFitl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlIsNull() {
            addCriterion("pbd_funl is null");
            return (Criteria) this;
        }

        public Criteria andPbdFunlIsNotNull() {
            addCriterion("pbd_funl is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFunlEqualTo(String value) {
            addCriterion("pbd_funl =", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlNotEqualTo(String value) {
            addCriterion("pbd_funl <>", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlGreaterThan(String value) {
            addCriterion("pbd_funl >", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlGreaterThanOrEqualTo(String value) {
            addCriterion("pbd_funl >=", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlLessThan(String value) {
            addCriterion("pbd_funl <", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlLessThanOrEqualTo(String value) {
            addCriterion("pbd_funl <=", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlLike(String value) {
            addCriterion("pbd_funl like", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlNotLike(String value) {
            addCriterion("pbd_funl not like", value, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlIn(List<String> values) {
            addCriterion("pbd_funl in", values, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlNotIn(List<String> values) {
            addCriterion("pbd_funl not in", values, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlBetween(String value1, String value2) {
            addCriterion("pbd_funl between", value1, value2, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFunlNotBetween(String value1, String value2) {
            addCriterion("pbd_funl not between", value1, value2, "pbdFunl");
            return (Criteria) this;
        }

        public Criteria andPbdFchrIsNull() {
            addCriterion("pbd_fchr is null");
            return (Criteria) this;
        }

        public Criteria andPbdFchrIsNotNull() {
            addCriterion("pbd_fchr is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFchrEqualTo(Integer value) {
            addCriterion("pbd_fchr =", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrNotEqualTo(Integer value) {
            addCriterion("pbd_fchr <>", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrGreaterThan(Integer value) {
            addCriterion("pbd_fchr >", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbd_fchr >=", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrLessThan(Integer value) {
            addCriterion("pbd_fchr <", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrLessThanOrEqualTo(Integer value) {
            addCriterion("pbd_fchr <=", value, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrIn(List<Integer> values) {
            addCriterion("pbd_fchr in", values, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrNotIn(List<Integer> values) {
            addCriterion("pbd_fchr not in", values, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fchr between", value1, value2, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFchrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fchr not between", value1, value2, "pbdFchr");
            return (Criteria) this;
        }

        public Criteria andPbdFptcIsNull() {
            addCriterion("pbd_fptc is null");
            return (Criteria) this;
        }

        public Criteria andPbdFptcIsNotNull() {
            addCriterion("pbd_fptc is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFptcEqualTo(Integer value) {
            addCriterion("pbd_fptc =", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcNotEqualTo(Integer value) {
            addCriterion("pbd_fptc <>", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcGreaterThan(Integer value) {
            addCriterion("pbd_fptc >", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbd_fptc >=", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcLessThan(Integer value) {
            addCriterion("pbd_fptc <", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcLessThanOrEqualTo(Integer value) {
            addCriterion("pbd_fptc <=", value, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcIn(List<Integer> values) {
            addCriterion("pbd_fptc in", values, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcNotIn(List<Integer> values) {
            addCriterion("pbd_fptc not in", values, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fptc between", value1, value2, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFptcNotBetween(Integer value1, Integer value2) {
            addCriterion("pbd_fptc not between", value1, value2, "pbdFptc");
            return (Criteria) this;
        }

        public Criteria andPbdFfceIsNull() {
            addCriterion("pbd_ffce is null");
            return (Criteria) this;
        }

        public Criteria andPbdFfceIsNotNull() {
            addCriterion("pbd_ffce is not null");
            return (Criteria) this;
        }

        public Criteria andPbdFfceEqualTo(String value) {
            addCriterion("pbd_ffce =", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceNotEqualTo(String value) {
            addCriterion("pbd_ffce <>", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceGreaterThan(String value) {
            addCriterion("pbd_ffce >", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceGreaterThanOrEqualTo(String value) {
            addCriterion("pbd_ffce >=", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceLessThan(String value) {
            addCriterion("pbd_ffce <", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceLessThanOrEqualTo(String value) {
            addCriterion("pbd_ffce <=", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceLike(String value) {
            addCriterion("pbd_ffce like", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceNotLike(String value) {
            addCriterion("pbd_ffce not like", value, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceIn(List<String> values) {
            addCriterion("pbd_ffce in", values, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceNotIn(List<String> values) {
            addCriterion("pbd_ffce not in", values, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceBetween(String value1, String value2) {
            addCriterion("pbd_ffce between", value1, value2, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbdFfceNotBetween(String value1, String value2) {
            addCriterion("pbd_ffce not between", value1, value2, "pbdFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtIsNull() {
            addCriterion("pbh_fhgt is null");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtIsNotNull() {
            addCriterion("pbh_fhgt is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtEqualTo(Integer value) {
            addCriterion("pbh_fhgt =", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtNotEqualTo(Integer value) {
            addCriterion("pbh_fhgt <>", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtGreaterThan(Integer value) {
            addCriterion("pbh_fhgt >", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbh_fhgt >=", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtLessThan(Integer value) {
            addCriterion("pbh_fhgt <", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbh_fhgt <=", value, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtIn(List<Integer> values) {
            addCriterion("pbh_fhgt in", values, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtNotIn(List<Integer> values) {
            addCriterion("pbh_fhgt not in", values, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fhgt between", value1, value2, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFhgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fhgt not between", value1, value2, "pbhFhgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtIsNull() {
            addCriterion("pbh_fwgt is null");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtIsNotNull() {
            addCriterion("pbh_fwgt is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtEqualTo(Integer value) {
            addCriterion("pbh_fwgt =", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtNotEqualTo(Integer value) {
            addCriterion("pbh_fwgt <>", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtGreaterThan(Integer value) {
            addCriterion("pbh_fwgt >", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbh_fwgt >=", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtLessThan(Integer value) {
            addCriterion("pbh_fwgt <", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbh_fwgt <=", value, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtIn(List<Integer> values) {
            addCriterion("pbh_fwgt in", values, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtNotIn(List<Integer> values) {
            addCriterion("pbh_fwgt not in", values, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fwgt between", value1, value2, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFwgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fwgt not between", value1, value2, "pbhFwgt");
            return (Criteria) this;
        }

        public Criteria andPbhFitlIsNull() {
            addCriterion("pbh_fitl is null");
            return (Criteria) this;
        }

        public Criteria andPbhFitlIsNotNull() {
            addCriterion("pbh_fitl is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFitlEqualTo(String value) {
            addCriterion("pbh_fitl =", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlNotEqualTo(String value) {
            addCriterion("pbh_fitl <>", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlGreaterThan(String value) {
            addCriterion("pbh_fitl >", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlGreaterThanOrEqualTo(String value) {
            addCriterion("pbh_fitl >=", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlLessThan(String value) {
            addCriterion("pbh_fitl <", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlLessThanOrEqualTo(String value) {
            addCriterion("pbh_fitl <=", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlLike(String value) {
            addCriterion("pbh_fitl like", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlNotLike(String value) {
            addCriterion("pbh_fitl not like", value, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlIn(List<String> values) {
            addCriterion("pbh_fitl in", values, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlNotIn(List<String> values) {
            addCriterion("pbh_fitl not in", values, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlBetween(String value1, String value2) {
            addCriterion("pbh_fitl between", value1, value2, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFitlNotBetween(String value1, String value2) {
            addCriterion("pbh_fitl not between", value1, value2, "pbhFitl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlIsNull() {
            addCriterion("pbh_funl is null");
            return (Criteria) this;
        }

        public Criteria andPbhFunlIsNotNull() {
            addCriterion("pbh_funl is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFunlEqualTo(String value) {
            addCriterion("pbh_funl =", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlNotEqualTo(String value) {
            addCriterion("pbh_funl <>", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlGreaterThan(String value) {
            addCriterion("pbh_funl >", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlGreaterThanOrEqualTo(String value) {
            addCriterion("pbh_funl >=", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlLessThan(String value) {
            addCriterion("pbh_funl <", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlLessThanOrEqualTo(String value) {
            addCriterion("pbh_funl <=", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlLike(String value) {
            addCriterion("pbh_funl like", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlNotLike(String value) {
            addCriterion("pbh_funl not like", value, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlIn(List<String> values) {
            addCriterion("pbh_funl in", values, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlNotIn(List<String> values) {
            addCriterion("pbh_funl not in", values, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlBetween(String value1, String value2) {
            addCriterion("pbh_funl between", value1, value2, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFunlNotBetween(String value1, String value2) {
            addCriterion("pbh_funl not between", value1, value2, "pbhFunl");
            return (Criteria) this;
        }

        public Criteria andPbhFchrIsNull() {
            addCriterion("pbh_fchr is null");
            return (Criteria) this;
        }

        public Criteria andPbhFchrIsNotNull() {
            addCriterion("pbh_fchr is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFchrEqualTo(Integer value) {
            addCriterion("pbh_fchr =", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrNotEqualTo(Integer value) {
            addCriterion("pbh_fchr <>", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrGreaterThan(Integer value) {
            addCriterion("pbh_fchr >", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbh_fchr >=", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrLessThan(Integer value) {
            addCriterion("pbh_fchr <", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrLessThanOrEqualTo(Integer value) {
            addCriterion("pbh_fchr <=", value, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrIn(List<Integer> values) {
            addCriterion("pbh_fchr in", values, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrNotIn(List<Integer> values) {
            addCriterion("pbh_fchr not in", values, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fchr between", value1, value2, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFchrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fchr not between", value1, value2, "pbhFchr");
            return (Criteria) this;
        }

        public Criteria andPbhFptcIsNull() {
            addCriterion("pbh_fptc is null");
            return (Criteria) this;
        }

        public Criteria andPbhFptcIsNotNull() {
            addCriterion("pbh_fptc is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFptcEqualTo(Integer value) {
            addCriterion("pbh_fptc =", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcNotEqualTo(Integer value) {
            addCriterion("pbh_fptc <>", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcGreaterThan(Integer value) {
            addCriterion("pbh_fptc >", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbh_fptc >=", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcLessThan(Integer value) {
            addCriterion("pbh_fptc <", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcLessThanOrEqualTo(Integer value) {
            addCriterion("pbh_fptc <=", value, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcIn(List<Integer> values) {
            addCriterion("pbh_fptc in", values, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcNotIn(List<Integer> values) {
            addCriterion("pbh_fptc not in", values, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fptc between", value1, value2, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFptcNotBetween(Integer value1, Integer value2) {
            addCriterion("pbh_fptc not between", value1, value2, "pbhFptc");
            return (Criteria) this;
        }

        public Criteria andPbhFfceIsNull() {
            addCriterion("pbh_ffce is null");
            return (Criteria) this;
        }

        public Criteria andPbhFfceIsNotNull() {
            addCriterion("pbh_ffce is not null");
            return (Criteria) this;
        }

        public Criteria andPbhFfceEqualTo(String value) {
            addCriterion("pbh_ffce =", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceNotEqualTo(String value) {
            addCriterion("pbh_ffce <>", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceGreaterThan(String value) {
            addCriterion("pbh_ffce >", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceGreaterThanOrEqualTo(String value) {
            addCriterion("pbh_ffce >=", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceLessThan(String value) {
            addCriterion("pbh_ffce <", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceLessThanOrEqualTo(String value) {
            addCriterion("pbh_ffce <=", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceLike(String value) {
            addCriterion("pbh_ffce like", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceNotLike(String value) {
            addCriterion("pbh_ffce not like", value, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceIn(List<String> values) {
            addCriterion("pbh_ffce in", values, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceNotIn(List<String> values) {
            addCriterion("pbh_ffce not in", values, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceBetween(String value1, String value2) {
            addCriterion("pbh_ffce between", value1, value2, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPbhFfceNotBetween(String value1, String value2) {
            addCriterion("pbh_ffce not between", value1, value2, "pbhFfce");
            return (Criteria) this;
        }

        public Criteria andPblFhgtIsNull() {
            addCriterion("pbl_fhgt is null");
            return (Criteria) this;
        }

        public Criteria andPblFhgtIsNotNull() {
            addCriterion("pbl_fhgt is not null");
            return (Criteria) this;
        }

        public Criteria andPblFhgtEqualTo(Integer value) {
            addCriterion("pbl_fhgt =", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtNotEqualTo(Integer value) {
            addCriterion("pbl_fhgt <>", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtGreaterThan(Integer value) {
            addCriterion("pbl_fhgt >", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbl_fhgt >=", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtLessThan(Integer value) {
            addCriterion("pbl_fhgt <", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbl_fhgt <=", value, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtIn(List<Integer> values) {
            addCriterion("pbl_fhgt in", values, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtNotIn(List<Integer> values) {
            addCriterion("pbl_fhgt not in", values, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fhgt between", value1, value2, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFhgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fhgt not between", value1, value2, "pblFhgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtIsNull() {
            addCriterion("pbl_fwgt is null");
            return (Criteria) this;
        }

        public Criteria andPblFwgtIsNotNull() {
            addCriterion("pbl_fwgt is not null");
            return (Criteria) this;
        }

        public Criteria andPblFwgtEqualTo(Integer value) {
            addCriterion("pbl_fwgt =", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtNotEqualTo(Integer value) {
            addCriterion("pbl_fwgt <>", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtGreaterThan(Integer value) {
            addCriterion("pbl_fwgt >", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbl_fwgt >=", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtLessThan(Integer value) {
            addCriterion("pbl_fwgt <", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtLessThanOrEqualTo(Integer value) {
            addCriterion("pbl_fwgt <=", value, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtIn(List<Integer> values) {
            addCriterion("pbl_fwgt in", values, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtNotIn(List<Integer> values) {
            addCriterion("pbl_fwgt not in", values, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fwgt between", value1, value2, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFwgtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fwgt not between", value1, value2, "pblFwgt");
            return (Criteria) this;
        }

        public Criteria andPblFitlIsNull() {
            addCriterion("pbl_fitl is null");
            return (Criteria) this;
        }

        public Criteria andPblFitlIsNotNull() {
            addCriterion("pbl_fitl is not null");
            return (Criteria) this;
        }

        public Criteria andPblFitlEqualTo(String value) {
            addCriterion("pbl_fitl =", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlNotEqualTo(String value) {
            addCriterion("pbl_fitl <>", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlGreaterThan(String value) {
            addCriterion("pbl_fitl >", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlGreaterThanOrEqualTo(String value) {
            addCriterion("pbl_fitl >=", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlLessThan(String value) {
            addCriterion("pbl_fitl <", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlLessThanOrEqualTo(String value) {
            addCriterion("pbl_fitl <=", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlLike(String value) {
            addCriterion("pbl_fitl like", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlNotLike(String value) {
            addCriterion("pbl_fitl not like", value, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlIn(List<String> values) {
            addCriterion("pbl_fitl in", values, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlNotIn(List<String> values) {
            addCriterion("pbl_fitl not in", values, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlBetween(String value1, String value2) {
            addCriterion("pbl_fitl between", value1, value2, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFitlNotBetween(String value1, String value2) {
            addCriterion("pbl_fitl not between", value1, value2, "pblFitl");
            return (Criteria) this;
        }

        public Criteria andPblFunlIsNull() {
            addCriterion("pbl_funl is null");
            return (Criteria) this;
        }

        public Criteria andPblFunlIsNotNull() {
            addCriterion("pbl_funl is not null");
            return (Criteria) this;
        }

        public Criteria andPblFunlEqualTo(String value) {
            addCriterion("pbl_funl =", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlNotEqualTo(String value) {
            addCriterion("pbl_funl <>", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlGreaterThan(String value) {
            addCriterion("pbl_funl >", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlGreaterThanOrEqualTo(String value) {
            addCriterion("pbl_funl >=", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlLessThan(String value) {
            addCriterion("pbl_funl <", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlLessThanOrEqualTo(String value) {
            addCriterion("pbl_funl <=", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlLike(String value) {
            addCriterion("pbl_funl like", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlNotLike(String value) {
            addCriterion("pbl_funl not like", value, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlIn(List<String> values) {
            addCriterion("pbl_funl in", values, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlNotIn(List<String> values) {
            addCriterion("pbl_funl not in", values, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlBetween(String value1, String value2) {
            addCriterion("pbl_funl between", value1, value2, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFunlNotBetween(String value1, String value2) {
            addCriterion("pbl_funl not between", value1, value2, "pblFunl");
            return (Criteria) this;
        }

        public Criteria andPblFchrIsNull() {
            addCriterion("pbl_fchr is null");
            return (Criteria) this;
        }

        public Criteria andPblFchrIsNotNull() {
            addCriterion("pbl_fchr is not null");
            return (Criteria) this;
        }

        public Criteria andPblFchrEqualTo(Integer value) {
            addCriterion("pbl_fchr =", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrNotEqualTo(Integer value) {
            addCriterion("pbl_fchr <>", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrGreaterThan(Integer value) {
            addCriterion("pbl_fchr >", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbl_fchr >=", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrLessThan(Integer value) {
            addCriterion("pbl_fchr <", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrLessThanOrEqualTo(Integer value) {
            addCriterion("pbl_fchr <=", value, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrIn(List<Integer> values) {
            addCriterion("pbl_fchr in", values, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrNotIn(List<Integer> values) {
            addCriterion("pbl_fchr not in", values, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fchr between", value1, value2, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFchrNotBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fchr not between", value1, value2, "pblFchr");
            return (Criteria) this;
        }

        public Criteria andPblFptcIsNull() {
            addCriterion("pbl_fptc is null");
            return (Criteria) this;
        }

        public Criteria andPblFptcIsNotNull() {
            addCriterion("pbl_fptc is not null");
            return (Criteria) this;
        }

        public Criteria andPblFptcEqualTo(Integer value) {
            addCriterion("pbl_fptc =", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcNotEqualTo(Integer value) {
            addCriterion("pbl_fptc <>", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcGreaterThan(Integer value) {
            addCriterion("pbl_fptc >", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbl_fptc >=", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcLessThan(Integer value) {
            addCriterion("pbl_fptc <", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcLessThanOrEqualTo(Integer value) {
            addCriterion("pbl_fptc <=", value, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcIn(List<Integer> values) {
            addCriterion("pbl_fptc in", values, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcNotIn(List<Integer> values) {
            addCriterion("pbl_fptc not in", values, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fptc between", value1, value2, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFptcNotBetween(Integer value1, Integer value2) {
            addCriterion("pbl_fptc not between", value1, value2, "pblFptc");
            return (Criteria) this;
        }

        public Criteria andPblFfceIsNull() {
            addCriterion("pbl_ffce is null");
            return (Criteria) this;
        }

        public Criteria andPblFfceIsNotNull() {
            addCriterion("pbl_ffce is not null");
            return (Criteria) this;
        }

        public Criteria andPblFfceEqualTo(String value) {
            addCriterion("pbl_ffce =", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceNotEqualTo(String value) {
            addCriterion("pbl_ffce <>", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceGreaterThan(String value) {
            addCriterion("pbl_ffce >", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceGreaterThanOrEqualTo(String value) {
            addCriterion("pbl_ffce >=", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceLessThan(String value) {
            addCriterion("pbl_ffce <", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceLessThanOrEqualTo(String value) {
            addCriterion("pbl_ffce <=", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceLike(String value) {
            addCriterion("pbl_ffce like", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceNotLike(String value) {
            addCriterion("pbl_ffce not like", value, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceIn(List<String> values) {
            addCriterion("pbl_ffce in", values, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceNotIn(List<String> values) {
            addCriterion("pbl_ffce not in", values, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceBetween(String value1, String value2) {
            addCriterion("pbl_ffce between", value1, value2, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPblFfceNotBetween(String value1, String value2) {
            addCriterion("pbl_ffce not between", value1, value2, "pblFfce");
            return (Criteria) this;
        }

        public Criteria andPbtCmntIsNull() {
            addCriterion("pbt_cmnt is null");
            return (Criteria) this;
        }

        public Criteria andPbtCmntIsNotNull() {
            addCriterion("pbt_cmnt is not null");
            return (Criteria) this;
        }

        public Criteria andPbtCmntEqualTo(String value) {
            addCriterion("pbt_cmnt =", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntNotEqualTo(String value) {
            addCriterion("pbt_cmnt <>", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntGreaterThan(String value) {
            addCriterion("pbt_cmnt >", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntGreaterThanOrEqualTo(String value) {
            addCriterion("pbt_cmnt >=", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntLessThan(String value) {
            addCriterion("pbt_cmnt <", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntLessThanOrEqualTo(String value) {
            addCriterion("pbt_cmnt <=", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntLike(String value) {
            addCriterion("pbt_cmnt like", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntNotLike(String value) {
            addCriterion("pbt_cmnt not like", value, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntIn(List<String> values) {
            addCriterion("pbt_cmnt in", values, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntNotIn(List<String> values) {
            addCriterion("pbt_cmnt not in", values, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntBetween(String value1, String value2) {
            addCriterion("pbt_cmnt between", value1, value2, "pbtCmnt");
            return (Criteria) this;
        }

        public Criteria andPbtCmntNotBetween(String value1, String value2) {
            addCriterion("pbt_cmnt not between", value1, value2, "pbtCmnt");
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