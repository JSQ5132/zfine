package com.ykxj.zfine.model;

import java.util.ArrayList;
import java.util.List;

public class PbcatcolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbcatcolExample() {
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

        public Criteria andPbcTnamIsNull() {
            addCriterion("pbc_tnam is null");
            return (Criteria) this;
        }

        public Criteria andPbcTnamIsNotNull() {
            addCriterion("pbc_tnam is not null");
            return (Criteria) this;
        }

        public Criteria andPbcTnamEqualTo(String value) {
            addCriterion("pbc_tnam =", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamNotEqualTo(String value) {
            addCriterion("pbc_tnam <>", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamGreaterThan(String value) {
            addCriterion("pbc_tnam >", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_tnam >=", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamLessThan(String value) {
            addCriterion("pbc_tnam <", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamLessThanOrEqualTo(String value) {
            addCriterion("pbc_tnam <=", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamLike(String value) {
            addCriterion("pbc_tnam like", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamNotLike(String value) {
            addCriterion("pbc_tnam not like", value, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamIn(List<String> values) {
            addCriterion("pbc_tnam in", values, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamNotIn(List<String> values) {
            addCriterion("pbc_tnam not in", values, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamBetween(String value1, String value2) {
            addCriterion("pbc_tnam between", value1, value2, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTnamNotBetween(String value1, String value2) {
            addCriterion("pbc_tnam not between", value1, value2, "pbcTnam");
            return (Criteria) this;
        }

        public Criteria andPbcTidIsNull() {
            addCriterion("pbc_tid is null");
            return (Criteria) this;
        }

        public Criteria andPbcTidIsNotNull() {
            addCriterion("pbc_tid is not null");
            return (Criteria) this;
        }

        public Criteria andPbcTidEqualTo(Integer value) {
            addCriterion("pbc_tid =", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidNotEqualTo(Integer value) {
            addCriterion("pbc_tid <>", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidGreaterThan(Integer value) {
            addCriterion("pbc_tid >", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_tid >=", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidLessThan(Integer value) {
            addCriterion("pbc_tid <", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_tid <=", value, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidIn(List<Integer> values) {
            addCriterion("pbc_tid in", values, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidNotIn(List<Integer> values) {
            addCriterion("pbc_tid not in", values, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidBetween(Integer value1, Integer value2) {
            addCriterion("pbc_tid between", value1, value2, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcTidNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_tid not between", value1, value2, "pbcTid");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrIsNull() {
            addCriterion("pbc_ownr is null");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrIsNotNull() {
            addCriterion("pbc_ownr is not null");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrEqualTo(String value) {
            addCriterion("pbc_ownr =", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrNotEqualTo(String value) {
            addCriterion("pbc_ownr <>", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrGreaterThan(String value) {
            addCriterion("pbc_ownr >", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_ownr >=", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrLessThan(String value) {
            addCriterion("pbc_ownr <", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrLessThanOrEqualTo(String value) {
            addCriterion("pbc_ownr <=", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrLike(String value) {
            addCriterion("pbc_ownr like", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrNotLike(String value) {
            addCriterion("pbc_ownr not like", value, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrIn(List<String> values) {
            addCriterion("pbc_ownr in", values, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrNotIn(List<String> values) {
            addCriterion("pbc_ownr not in", values, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrBetween(String value1, String value2) {
            addCriterion("pbc_ownr between", value1, value2, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcOwnrNotBetween(String value1, String value2) {
            addCriterion("pbc_ownr not between", value1, value2, "pbcOwnr");
            return (Criteria) this;
        }

        public Criteria andPbcCnamIsNull() {
            addCriterion("pbc_cnam is null");
            return (Criteria) this;
        }

        public Criteria andPbcCnamIsNotNull() {
            addCriterion("pbc_cnam is not null");
            return (Criteria) this;
        }

        public Criteria andPbcCnamEqualTo(String value) {
            addCriterion("pbc_cnam =", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamNotEqualTo(String value) {
            addCriterion("pbc_cnam <>", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamGreaterThan(String value) {
            addCriterion("pbc_cnam >", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_cnam >=", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamLessThan(String value) {
            addCriterion("pbc_cnam <", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamLessThanOrEqualTo(String value) {
            addCriterion("pbc_cnam <=", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamLike(String value) {
            addCriterion("pbc_cnam like", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamNotLike(String value) {
            addCriterion("pbc_cnam not like", value, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamIn(List<String> values) {
            addCriterion("pbc_cnam in", values, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamNotIn(List<String> values) {
            addCriterion("pbc_cnam not in", values, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamBetween(String value1, String value2) {
            addCriterion("pbc_cnam between", value1, value2, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCnamNotBetween(String value1, String value2) {
            addCriterion("pbc_cnam not between", value1, value2, "pbcCnam");
            return (Criteria) this;
        }

        public Criteria andPbcCidIsNull() {
            addCriterion("pbc_cid is null");
            return (Criteria) this;
        }

        public Criteria andPbcCidIsNotNull() {
            addCriterion("pbc_cid is not null");
            return (Criteria) this;
        }

        public Criteria andPbcCidEqualTo(Integer value) {
            addCriterion("pbc_cid =", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidNotEqualTo(Integer value) {
            addCriterion("pbc_cid <>", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidGreaterThan(Integer value) {
            addCriterion("pbc_cid >", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_cid >=", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidLessThan(Integer value) {
            addCriterion("pbc_cid <", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_cid <=", value, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidIn(List<Integer> values) {
            addCriterion("pbc_cid in", values, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidNotIn(List<Integer> values) {
            addCriterion("pbc_cid not in", values, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidBetween(Integer value1, Integer value2) {
            addCriterion("pbc_cid between", value1, value2, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcCidNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_cid not between", value1, value2, "pbcCid");
            return (Criteria) this;
        }

        public Criteria andPbcLablIsNull() {
            addCriterion("pbc_labl is null");
            return (Criteria) this;
        }

        public Criteria andPbcLablIsNotNull() {
            addCriterion("pbc_labl is not null");
            return (Criteria) this;
        }

        public Criteria andPbcLablEqualTo(String value) {
            addCriterion("pbc_labl =", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablNotEqualTo(String value) {
            addCriterion("pbc_labl <>", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablGreaterThan(String value) {
            addCriterion("pbc_labl >", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_labl >=", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablLessThan(String value) {
            addCriterion("pbc_labl <", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablLessThanOrEqualTo(String value) {
            addCriterion("pbc_labl <=", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablLike(String value) {
            addCriterion("pbc_labl like", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablNotLike(String value) {
            addCriterion("pbc_labl not like", value, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablIn(List<String> values) {
            addCriterion("pbc_labl in", values, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablNotIn(List<String> values) {
            addCriterion("pbc_labl not in", values, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablBetween(String value1, String value2) {
            addCriterion("pbc_labl between", value1, value2, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLablNotBetween(String value1, String value2) {
            addCriterion("pbc_labl not between", value1, value2, "pbcLabl");
            return (Criteria) this;
        }

        public Criteria andPbcLposIsNull() {
            addCriterion("pbc_lpos is null");
            return (Criteria) this;
        }

        public Criteria andPbcLposIsNotNull() {
            addCriterion("pbc_lpos is not null");
            return (Criteria) this;
        }

        public Criteria andPbcLposEqualTo(Integer value) {
            addCriterion("pbc_lpos =", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposNotEqualTo(Integer value) {
            addCriterion("pbc_lpos <>", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposGreaterThan(Integer value) {
            addCriterion("pbc_lpos >", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_lpos >=", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposLessThan(Integer value) {
            addCriterion("pbc_lpos <", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_lpos <=", value, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposIn(List<Integer> values) {
            addCriterion("pbc_lpos in", values, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposNotIn(List<Integer> values) {
            addCriterion("pbc_lpos not in", values, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposBetween(Integer value1, Integer value2) {
            addCriterion("pbc_lpos between", value1, value2, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcLposNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_lpos not between", value1, value2, "pbcLpos");
            return (Criteria) this;
        }

        public Criteria andPbcHdrIsNull() {
            addCriterion("pbc_hdr is null");
            return (Criteria) this;
        }

        public Criteria andPbcHdrIsNotNull() {
            addCriterion("pbc_hdr is not null");
            return (Criteria) this;
        }

        public Criteria andPbcHdrEqualTo(String value) {
            addCriterion("pbc_hdr =", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrNotEqualTo(String value) {
            addCriterion("pbc_hdr <>", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrGreaterThan(String value) {
            addCriterion("pbc_hdr >", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_hdr >=", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrLessThan(String value) {
            addCriterion("pbc_hdr <", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrLessThanOrEqualTo(String value) {
            addCriterion("pbc_hdr <=", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrLike(String value) {
            addCriterion("pbc_hdr like", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrNotLike(String value) {
            addCriterion("pbc_hdr not like", value, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrIn(List<String> values) {
            addCriterion("pbc_hdr in", values, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrNotIn(List<String> values) {
            addCriterion("pbc_hdr not in", values, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrBetween(String value1, String value2) {
            addCriterion("pbc_hdr between", value1, value2, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHdrNotBetween(String value1, String value2) {
            addCriterion("pbc_hdr not between", value1, value2, "pbcHdr");
            return (Criteria) this;
        }

        public Criteria andPbcHposIsNull() {
            addCriterion("pbc_hpos is null");
            return (Criteria) this;
        }

        public Criteria andPbcHposIsNotNull() {
            addCriterion("pbc_hpos is not null");
            return (Criteria) this;
        }

        public Criteria andPbcHposEqualTo(Integer value) {
            addCriterion("pbc_hpos =", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposNotEqualTo(Integer value) {
            addCriterion("pbc_hpos <>", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposGreaterThan(Integer value) {
            addCriterion("pbc_hpos >", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_hpos >=", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposLessThan(Integer value) {
            addCriterion("pbc_hpos <", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_hpos <=", value, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposIn(List<Integer> values) {
            addCriterion("pbc_hpos in", values, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposNotIn(List<Integer> values) {
            addCriterion("pbc_hpos not in", values, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposBetween(Integer value1, Integer value2) {
            addCriterion("pbc_hpos between", value1, value2, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcHposNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_hpos not between", value1, value2, "pbcHpos");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyIsNull() {
            addCriterion("pbc_jtfy is null");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyIsNotNull() {
            addCriterion("pbc_jtfy is not null");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyEqualTo(Integer value) {
            addCriterion("pbc_jtfy =", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyNotEqualTo(Integer value) {
            addCriterion("pbc_jtfy <>", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyGreaterThan(Integer value) {
            addCriterion("pbc_jtfy >", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_jtfy >=", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyLessThan(Integer value) {
            addCriterion("pbc_jtfy <", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_jtfy <=", value, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyIn(List<Integer> values) {
            addCriterion("pbc_jtfy in", values, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyNotIn(List<Integer> values) {
            addCriterion("pbc_jtfy not in", values, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyBetween(Integer value1, Integer value2) {
            addCriterion("pbc_jtfy between", value1, value2, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcJtfyNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_jtfy not between", value1, value2, "pbcJtfy");
            return (Criteria) this;
        }

        public Criteria andPbcMaskIsNull() {
            addCriterion("pbc_mask is null");
            return (Criteria) this;
        }

        public Criteria andPbcMaskIsNotNull() {
            addCriterion("pbc_mask is not null");
            return (Criteria) this;
        }

        public Criteria andPbcMaskEqualTo(String value) {
            addCriterion("pbc_mask =", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskNotEqualTo(String value) {
            addCriterion("pbc_mask <>", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskGreaterThan(String value) {
            addCriterion("pbc_mask >", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_mask >=", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskLessThan(String value) {
            addCriterion("pbc_mask <", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskLessThanOrEqualTo(String value) {
            addCriterion("pbc_mask <=", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskLike(String value) {
            addCriterion("pbc_mask like", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskNotLike(String value) {
            addCriterion("pbc_mask not like", value, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskIn(List<String> values) {
            addCriterion("pbc_mask in", values, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskNotIn(List<String> values) {
            addCriterion("pbc_mask not in", values, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskBetween(String value1, String value2) {
            addCriterion("pbc_mask between", value1, value2, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcMaskNotBetween(String value1, String value2) {
            addCriterion("pbc_mask not between", value1, value2, "pbcMask");
            return (Criteria) this;
        }

        public Criteria andPbcCaseIsNull() {
            addCriterion("pbc_case is null");
            return (Criteria) this;
        }

        public Criteria andPbcCaseIsNotNull() {
            addCriterion("pbc_case is not null");
            return (Criteria) this;
        }

        public Criteria andPbcCaseEqualTo(Integer value) {
            addCriterion("pbc_case =", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseNotEqualTo(Integer value) {
            addCriterion("pbc_case <>", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseGreaterThan(Integer value) {
            addCriterion("pbc_case >", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_case >=", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseLessThan(Integer value) {
            addCriterion("pbc_case <", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_case <=", value, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseIn(List<Integer> values) {
            addCriterion("pbc_case in", values, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseNotIn(List<Integer> values) {
            addCriterion("pbc_case not in", values, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseBetween(Integer value1, Integer value2) {
            addCriterion("pbc_case between", value1, value2, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcCaseNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_case not between", value1, value2, "pbcCase");
            return (Criteria) this;
        }

        public Criteria andPbcHghtIsNull() {
            addCriterion("pbc_hght is null");
            return (Criteria) this;
        }

        public Criteria andPbcHghtIsNotNull() {
            addCriterion("pbc_hght is not null");
            return (Criteria) this;
        }

        public Criteria andPbcHghtEqualTo(Integer value) {
            addCriterion("pbc_hght =", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtNotEqualTo(Integer value) {
            addCriterion("pbc_hght <>", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtGreaterThan(Integer value) {
            addCriterion("pbc_hght >", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_hght >=", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtLessThan(Integer value) {
            addCriterion("pbc_hght <", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_hght <=", value, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtIn(List<Integer> values) {
            addCriterion("pbc_hght in", values, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtNotIn(List<Integer> values) {
            addCriterion("pbc_hght not in", values, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtBetween(Integer value1, Integer value2) {
            addCriterion("pbc_hght between", value1, value2, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcHghtNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_hght not between", value1, value2, "pbcHght");
            return (Criteria) this;
        }

        public Criteria andPbcWdthIsNull() {
            addCriterion("pbc_wdth is null");
            return (Criteria) this;
        }

        public Criteria andPbcWdthIsNotNull() {
            addCriterion("pbc_wdth is not null");
            return (Criteria) this;
        }

        public Criteria andPbcWdthEqualTo(Integer value) {
            addCriterion("pbc_wdth =", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthNotEqualTo(Integer value) {
            addCriterion("pbc_wdth <>", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthGreaterThan(Integer value) {
            addCriterion("pbc_wdth >", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbc_wdth >=", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthLessThan(Integer value) {
            addCriterion("pbc_wdth <", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthLessThanOrEqualTo(Integer value) {
            addCriterion("pbc_wdth <=", value, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthIn(List<Integer> values) {
            addCriterion("pbc_wdth in", values, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthNotIn(List<Integer> values) {
            addCriterion("pbc_wdth not in", values, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthBetween(Integer value1, Integer value2) {
            addCriterion("pbc_wdth between", value1, value2, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcWdthNotBetween(Integer value1, Integer value2) {
            addCriterion("pbc_wdth not between", value1, value2, "pbcWdth");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnIsNull() {
            addCriterion("pbc_ptrn is null");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnIsNotNull() {
            addCriterion("pbc_ptrn is not null");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnEqualTo(String value) {
            addCriterion("pbc_ptrn =", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnNotEqualTo(String value) {
            addCriterion("pbc_ptrn <>", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnGreaterThan(String value) {
            addCriterion("pbc_ptrn >", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_ptrn >=", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnLessThan(String value) {
            addCriterion("pbc_ptrn <", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnLessThanOrEqualTo(String value) {
            addCriterion("pbc_ptrn <=", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnLike(String value) {
            addCriterion("pbc_ptrn like", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnNotLike(String value) {
            addCriterion("pbc_ptrn not like", value, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnIn(List<String> values) {
            addCriterion("pbc_ptrn in", values, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnNotIn(List<String> values) {
            addCriterion("pbc_ptrn not in", values, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnBetween(String value1, String value2) {
            addCriterion("pbc_ptrn between", value1, value2, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcPtrnNotBetween(String value1, String value2) {
            addCriterion("pbc_ptrn not between", value1, value2, "pbcPtrn");
            return (Criteria) this;
        }

        public Criteria andPbcBmapIsNull() {
            addCriterion("pbc_bmap is null");
            return (Criteria) this;
        }

        public Criteria andPbcBmapIsNotNull() {
            addCriterion("pbc_bmap is not null");
            return (Criteria) this;
        }

        public Criteria andPbcBmapEqualTo(String value) {
            addCriterion("pbc_bmap =", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapNotEqualTo(String value) {
            addCriterion("pbc_bmap <>", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapGreaterThan(String value) {
            addCriterion("pbc_bmap >", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_bmap >=", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapLessThan(String value) {
            addCriterion("pbc_bmap <", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapLessThanOrEqualTo(String value) {
            addCriterion("pbc_bmap <=", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapLike(String value) {
            addCriterion("pbc_bmap like", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapNotLike(String value) {
            addCriterion("pbc_bmap not like", value, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapIn(List<String> values) {
            addCriterion("pbc_bmap in", values, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapNotIn(List<String> values) {
            addCriterion("pbc_bmap not in", values, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapBetween(String value1, String value2) {
            addCriterion("pbc_bmap between", value1, value2, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcBmapNotBetween(String value1, String value2) {
            addCriterion("pbc_bmap not between", value1, value2, "pbcBmap");
            return (Criteria) this;
        }

        public Criteria andPbcInitIsNull() {
            addCriterion("pbc_init is null");
            return (Criteria) this;
        }

        public Criteria andPbcInitIsNotNull() {
            addCriterion("pbc_init is not null");
            return (Criteria) this;
        }

        public Criteria andPbcInitEqualTo(String value) {
            addCriterion("pbc_init =", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitNotEqualTo(String value) {
            addCriterion("pbc_init <>", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitGreaterThan(String value) {
            addCriterion("pbc_init >", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_init >=", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitLessThan(String value) {
            addCriterion("pbc_init <", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitLessThanOrEqualTo(String value) {
            addCriterion("pbc_init <=", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitLike(String value) {
            addCriterion("pbc_init like", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitNotLike(String value) {
            addCriterion("pbc_init not like", value, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitIn(List<String> values) {
            addCriterion("pbc_init in", values, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitNotIn(List<String> values) {
            addCriterion("pbc_init not in", values, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitBetween(String value1, String value2) {
            addCriterion("pbc_init between", value1, value2, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcInitNotBetween(String value1, String value2) {
            addCriterion("pbc_init not between", value1, value2, "pbcInit");
            return (Criteria) this;
        }

        public Criteria andPbcCmntIsNull() {
            addCriterion("pbc_cmnt is null");
            return (Criteria) this;
        }

        public Criteria andPbcCmntIsNotNull() {
            addCriterion("pbc_cmnt is not null");
            return (Criteria) this;
        }

        public Criteria andPbcCmntEqualTo(String value) {
            addCriterion("pbc_cmnt =", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntNotEqualTo(String value) {
            addCriterion("pbc_cmnt <>", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntGreaterThan(String value) {
            addCriterion("pbc_cmnt >", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_cmnt >=", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntLessThan(String value) {
            addCriterion("pbc_cmnt <", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntLessThanOrEqualTo(String value) {
            addCriterion("pbc_cmnt <=", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntLike(String value) {
            addCriterion("pbc_cmnt like", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntNotLike(String value) {
            addCriterion("pbc_cmnt not like", value, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntIn(List<String> values) {
            addCriterion("pbc_cmnt in", values, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntNotIn(List<String> values) {
            addCriterion("pbc_cmnt not in", values, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntBetween(String value1, String value2) {
            addCriterion("pbc_cmnt between", value1, value2, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcCmntNotBetween(String value1, String value2) {
            addCriterion("pbc_cmnt not between", value1, value2, "pbcCmnt");
            return (Criteria) this;
        }

        public Criteria andPbcEditIsNull() {
            addCriterion("pbc_edit is null");
            return (Criteria) this;
        }

        public Criteria andPbcEditIsNotNull() {
            addCriterion("pbc_edit is not null");
            return (Criteria) this;
        }

        public Criteria andPbcEditEqualTo(String value) {
            addCriterion("pbc_edit =", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditNotEqualTo(String value) {
            addCriterion("pbc_edit <>", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditGreaterThan(String value) {
            addCriterion("pbc_edit >", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_edit >=", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditLessThan(String value) {
            addCriterion("pbc_edit <", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditLessThanOrEqualTo(String value) {
            addCriterion("pbc_edit <=", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditLike(String value) {
            addCriterion("pbc_edit like", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditNotLike(String value) {
            addCriterion("pbc_edit not like", value, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditIn(List<String> values) {
            addCriterion("pbc_edit in", values, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditNotIn(List<String> values) {
            addCriterion("pbc_edit not in", values, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditBetween(String value1, String value2) {
            addCriterion("pbc_edit between", value1, value2, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcEditNotBetween(String value1, String value2) {
            addCriterion("pbc_edit not between", value1, value2, "pbcEdit");
            return (Criteria) this;
        }

        public Criteria andPbcTagIsNull() {
            addCriterion("pbc_tag is null");
            return (Criteria) this;
        }

        public Criteria andPbcTagIsNotNull() {
            addCriterion("pbc_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPbcTagEqualTo(String value) {
            addCriterion("pbc_tag =", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagNotEqualTo(String value) {
            addCriterion("pbc_tag <>", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagGreaterThan(String value) {
            addCriterion("pbc_tag >", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagGreaterThanOrEqualTo(String value) {
            addCriterion("pbc_tag >=", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagLessThan(String value) {
            addCriterion("pbc_tag <", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagLessThanOrEqualTo(String value) {
            addCriterion("pbc_tag <=", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagLike(String value) {
            addCriterion("pbc_tag like", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagNotLike(String value) {
            addCriterion("pbc_tag not like", value, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagIn(List<String> values) {
            addCriterion("pbc_tag in", values, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagNotIn(List<String> values) {
            addCriterion("pbc_tag not in", values, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagBetween(String value1, String value2) {
            addCriterion("pbc_tag between", value1, value2, "pbcTag");
            return (Criteria) this;
        }

        public Criteria andPbcTagNotBetween(String value1, String value2) {
            addCriterion("pbc_tag not between", value1, value2, "pbcTag");
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