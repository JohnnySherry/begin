package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EcatscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcatscoreExample() {
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

        public Criteria andScoreidIsNull() {
            addCriterion("ScoreID is null");
            return (Criteria) this;
        }

        public Criteria andScoreidIsNotNull() {
            addCriterion("ScoreID is not null");
            return (Criteria) this;
        }

        public Criteria andScoreidEqualTo(Integer value) {
            addCriterion("ScoreID =", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotEqualTo(Integer value) {
            addCriterion("ScoreID <>", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThan(Integer value) {
            addCriterion("ScoreID >", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ScoreID >=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThan(Integer value) {
            addCriterion("ScoreID <", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidLessThanOrEqualTo(Integer value) {
            addCriterion("ScoreID <=", value, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidIn(List<Integer> values) {
            addCriterion("ScoreID in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotIn(List<Integer> values) {
            addCriterion("ScoreID not in", values, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidBetween(Integer value1, Integer value2) {
            addCriterion("ScoreID between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andScoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("ScoreID not between", value1, value2, "scoreid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andScoredateIsNull() {
            addCriterion("ScoreDate is null");
            return (Criteria) this;
        }

        public Criteria andScoredateIsNotNull() {
            addCriterion("ScoreDate is not null");
            return (Criteria) this;
        }

        public Criteria andScoredateEqualTo(Date value) {
            addCriterion("ScoreDate =", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateNotEqualTo(Date value) {
            addCriterion("ScoreDate <>", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateGreaterThan(Date value) {
            addCriterion("ScoreDate >", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateGreaterThanOrEqualTo(Date value) {
            addCriterion("ScoreDate >=", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateLessThan(Date value) {
            addCriterion("ScoreDate <", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateLessThanOrEqualTo(Date value) {
            addCriterion("ScoreDate <=", value, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateIn(List<Date> values) {
            addCriterion("ScoreDate in", values, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateNotIn(List<Date> values) {
            addCriterion("ScoreDate not in", values, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateBetween(Date value1, Date value2) {
            addCriterion("ScoreDate between", value1, value2, "scoredate");
            return (Criteria) this;
        }

        public Criteria andScoredateNotBetween(Date value1, Date value2) {
            addCriterion("ScoreDate not between", value1, value2, "scoredate");
            return (Criteria) this;
        }

        public Criteria andQrcIsNull() {
            addCriterion("QRC is null");
            return (Criteria) this;
        }

        public Criteria andQrcIsNotNull() {
            addCriterion("QRC is not null");
            return (Criteria) this;
        }

        public Criteria andQrcEqualTo(Double value) {
            addCriterion("QRC =", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcNotEqualTo(Double value) {
            addCriterion("QRC <>", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcGreaterThan(Double value) {
            addCriterion("QRC >", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcGreaterThanOrEqualTo(Double value) {
            addCriterion("QRC >=", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcLessThan(Double value) {
            addCriterion("QRC <", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcLessThanOrEqualTo(Double value) {
            addCriterion("QRC <=", value, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcIn(List<Double> values) {
            addCriterion("QRC in", values, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcNotIn(List<Double> values) {
            addCriterion("QRC not in", values, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcBetween(Double value1, Double value2) {
            addCriterion("QRC between", value1, value2, "qrc");
            return (Criteria) this;
        }

        public Criteria andQrcNotBetween(Double value1, Double value2) {
            addCriterion("QRC not between", value1, value2, "qrc");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("EC is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("EC is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(Double value) {
            addCriterion("EC =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(Double value) {
            addCriterion("EC <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(Double value) {
            addCriterion("EC >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(Double value) {
            addCriterion("EC >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(Double value) {
            addCriterion("EC <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(Double value) {
            addCriterion("EC <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<Double> values) {
            addCriterion("EC in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<Double> values) {
            addCriterion("EC not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(Double value1, Double value2) {
            addCriterion("EC between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(Double value1, Double value2) {
            addCriterion("EC not between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andStopshipIsNull() {
            addCriterion("Stopship is null");
            return (Criteria) this;
        }

        public Criteria andStopshipIsNotNull() {
            addCriterion("Stopship is not null");
            return (Criteria) this;
        }

        public Criteria andStopshipEqualTo(Double value) {
            addCriterion("Stopship =", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipNotEqualTo(Double value) {
            addCriterion("Stopship <>", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipGreaterThan(Double value) {
            addCriterion("Stopship >", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipGreaterThanOrEqualTo(Double value) {
            addCriterion("Stopship >=", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipLessThan(Double value) {
            addCriterion("Stopship <", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipLessThanOrEqualTo(Double value) {
            addCriterion("Stopship <=", value, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipIn(List<Double> values) {
            addCriterion("Stopship in", values, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipNotIn(List<Double> values) {
            addCriterion("Stopship not in", values, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipBetween(Double value1, Double value2) {
            addCriterion("Stopship between", value1, value2, "stopship");
            return (Criteria) this;
        }

        public Criteria andStopshipNotBetween(Double value1, Double value2) {
            addCriterion("Stopship not between", value1, value2, "stopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipIsNull() {
            addCriterion("PreStopship is null");
            return (Criteria) this;
        }

        public Criteria andPrestopshipIsNotNull() {
            addCriterion("PreStopship is not null");
            return (Criteria) this;
        }

        public Criteria andPrestopshipEqualTo(Double value) {
            addCriterion("PreStopship =", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipNotEqualTo(Double value) {
            addCriterion("PreStopship <>", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipGreaterThan(Double value) {
            addCriterion("PreStopship >", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipGreaterThanOrEqualTo(Double value) {
            addCriterion("PreStopship >=", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipLessThan(Double value) {
            addCriterion("PreStopship <", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipLessThanOrEqualTo(Double value) {
            addCriterion("PreStopship <=", value, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipIn(List<Double> values) {
            addCriterion("PreStopship in", values, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipNotIn(List<Double> values) {
            addCriterion("PreStopship not in", values, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipBetween(Double value1, Double value2) {
            addCriterion("PreStopship between", value1, value2, "prestopship");
            return (Criteria) this;
        }

        public Criteria andPrestopshipNotBetween(Double value1, Double value2) {
            addCriterion("PreStopship not between", value1, value2, "prestopship");
            return (Criteria) this;
        }

        public Criteria andGaqsIsNull() {
            addCriterion("GAQS is null");
            return (Criteria) this;
        }

        public Criteria andGaqsIsNotNull() {
            addCriterion("GAQS is not null");
            return (Criteria) this;
        }

        public Criteria andGaqsEqualTo(Double value) {
            addCriterion("GAQS =", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsNotEqualTo(Double value) {
            addCriterion("GAQS <>", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsGreaterThan(Double value) {
            addCriterion("GAQS >", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsGreaterThanOrEqualTo(Double value) {
            addCriterion("GAQS >=", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsLessThan(Double value) {
            addCriterion("GAQS <", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsLessThanOrEqualTo(Double value) {
            addCriterion("GAQS <=", value, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsIn(List<Double> values) {
            addCriterion("GAQS in", values, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsNotIn(List<Double> values) {
            addCriterion("GAQS not in", values, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsBetween(Double value1, Double value2) {
            addCriterion("GAQS between", value1, value2, "gaqs");
            return (Criteria) this;
        }

        public Criteria andGaqsNotBetween(Double value1, Double value2) {
            addCriterion("GAQS not between", value1, value2, "gaqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsIsNull() {
            addCriterion("NPIQS is null");
            return (Criteria) this;
        }

        public Criteria andNpiqsIsNotNull() {
            addCriterion("NPIQS is not null");
            return (Criteria) this;
        }

        public Criteria andNpiqsEqualTo(Double value) {
            addCriterion("NPIQS =", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsNotEqualTo(Double value) {
            addCriterion("NPIQS <>", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsGreaterThan(Double value) {
            addCriterion("NPIQS >", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsGreaterThanOrEqualTo(Double value) {
            addCriterion("NPIQS >=", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsLessThan(Double value) {
            addCriterion("NPIQS <", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsLessThanOrEqualTo(Double value) {
            addCriterion("NPIQS <=", value, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsIn(List<Double> values) {
            addCriterion("NPIQS in", values, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsNotIn(List<Double> values) {
            addCriterion("NPIQS not in", values, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsBetween(Double value1, Double value2) {
            addCriterion("NPIQS between", value1, value2, "npiqs");
            return (Criteria) this;
        }

        public Criteria andNpiqsNotBetween(Double value1, Double value2) {
            addCriterion("NPIQS not between", value1, value2, "npiqs");
            return (Criteria) this;
        }

        public Criteria andFfcIsNull() {
            addCriterion("FFC is null");
            return (Criteria) this;
        }

        public Criteria andFfcIsNotNull() {
            addCriterion("FFC is not null");
            return (Criteria) this;
        }

        public Criteria andFfcEqualTo(Double value) {
            addCriterion("FFC =", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcNotEqualTo(Double value) {
            addCriterion("FFC <>", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcGreaterThan(Double value) {
            addCriterion("FFC >", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcGreaterThanOrEqualTo(Double value) {
            addCriterion("FFC >=", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcLessThan(Double value) {
            addCriterion("FFC <", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcLessThanOrEqualTo(Double value) {
            addCriterion("FFC <=", value, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcIn(List<Double> values) {
            addCriterion("FFC in", values, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcNotIn(List<Double> values) {
            addCriterion("FFC not in", values, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcBetween(Double value1, Double value2) {
            addCriterion("FFC between", value1, value2, "ffc");
            return (Criteria) this;
        }

        public Criteria andFfcNotBetween(Double value1, Double value2) {
            addCriterion("FFC not between", value1, value2, "ffc");
            return (Criteria) this;
        }

        public Criteria andFqpIsNull() {
            addCriterion("FQP is null");
            return (Criteria) this;
        }

        public Criteria andFqpIsNotNull() {
            addCriterion("FQP is not null");
            return (Criteria) this;
        }

        public Criteria andFqpEqualTo(Double value) {
            addCriterion("FQP =", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpNotEqualTo(Double value) {
            addCriterion("FQP <>", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpGreaterThan(Double value) {
            addCriterion("FQP >", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpGreaterThanOrEqualTo(Double value) {
            addCriterion("FQP >=", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpLessThan(Double value) {
            addCriterion("FQP <", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpLessThanOrEqualTo(Double value) {
            addCriterion("FQP <=", value, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpIn(List<Double> values) {
            addCriterion("FQP in", values, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpNotIn(List<Double> values) {
            addCriterion("FQP not in", values, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpBetween(Double value1, Double value2) {
            addCriterion("FQP between", value1, value2, "fqp");
            return (Criteria) this;
        }

        public Criteria andFqpNotBetween(Double value1, Double value2) {
            addCriterion("FQP not between", value1, value2, "fqp");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("CI is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("CI is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(Double value) {
            addCriterion("CI =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(Double value) {
            addCriterion("CI <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(Double value) {
            addCriterion("CI >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(Double value) {
            addCriterion("CI >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(Double value) {
            addCriterion("CI <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(Double value) {
            addCriterion("CI <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<Double> values) {
            addCriterion("CI in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<Double> values) {
            addCriterion("CI not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(Double value1, Double value2) {
            addCriterion("CI between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(Double value1, Double value2) {
            addCriterion("CI not between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Double value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Double value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Double value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Double value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Double value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Double> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Double> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Double value1, Double value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Double value1, Double value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andAuditscoreIsNull() {
            addCriterion("AuditScore is null");
            return (Criteria) this;
        }

        public Criteria andAuditscoreIsNotNull() {
            addCriterion("AuditScore is not null");
            return (Criteria) this;
        }

        public Criteria andAuditscoreEqualTo(Double value) {
            addCriterion("AuditScore =", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreNotEqualTo(Double value) {
            addCriterion("AuditScore <>", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreGreaterThan(Double value) {
            addCriterion("AuditScore >", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("AuditScore >=", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreLessThan(Double value) {
            addCriterion("AuditScore <", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreLessThanOrEqualTo(Double value) {
            addCriterion("AuditScore <=", value, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreIn(List<Double> values) {
            addCriterion("AuditScore in", values, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreNotIn(List<Double> values) {
            addCriterion("AuditScore not in", values, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreBetween(Double value1, Double value2) {
            addCriterion("AuditScore between", value1, value2, "auditscore");
            return (Criteria) this;
        }

        public Criteria andAuditscoreNotBetween(Double value1, Double value2) {
            addCriterion("AuditScore not between", value1, value2, "auditscore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreIsNull() {
            addCriterion("QualityIssueScore is null");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreIsNotNull() {
            addCriterion("QualityIssueScore is not null");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreEqualTo(Double value) {
            addCriterion("QualityIssueScore =", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreNotEqualTo(Double value) {
            addCriterion("QualityIssueScore <>", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreGreaterThan(Double value) {
            addCriterion("QualityIssueScore >", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreGreaterThanOrEqualTo(Double value) {
            addCriterion("QualityIssueScore >=", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreLessThan(Double value) {
            addCriterion("QualityIssueScore <", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreLessThanOrEqualTo(Double value) {
            addCriterion("QualityIssueScore <=", value, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreIn(List<Double> values) {
            addCriterion("QualityIssueScore in", values, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreNotIn(List<Double> values) {
            addCriterion("QualityIssueScore not in", values, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreBetween(Double value1, Double value2) {
            addCriterion("QualityIssueScore between", value1, value2, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityissuescoreNotBetween(Double value1, Double value2) {
            addCriterion("QualityIssueScore not between", value1, value2, "qualityissuescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreIsNull() {
            addCriterion("QualityPerformanceScore is null");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreIsNotNull() {
            addCriterion("QualityPerformanceScore is not null");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreEqualTo(Double value) {
            addCriterion("QualityPerformanceScore =", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreNotEqualTo(Double value) {
            addCriterion("QualityPerformanceScore <>", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreGreaterThan(Double value) {
            addCriterion("QualityPerformanceScore >", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreGreaterThanOrEqualTo(Double value) {
            addCriterion("QualityPerformanceScore >=", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreLessThan(Double value) {
            addCriterion("QualityPerformanceScore <", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreLessThanOrEqualTo(Double value) {
            addCriterion("QualityPerformanceScore <=", value, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreIn(List<Double> values) {
            addCriterion("QualityPerformanceScore in", values, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreNotIn(List<Double> values) {
            addCriterion("QualityPerformanceScore not in", values, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreBetween(Double value1, Double value2) {
            addCriterion("QualityPerformanceScore between", value1, value2, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andQualityperformancescoreNotBetween(Double value1, Double value2) {
            addCriterion("QualityPerformanceScore not between", value1, value2, "qualityperformancescore");
            return (Criteria) this;
        }

        public Criteria andCipscoreIsNull() {
            addCriterion("CIPScore is null");
            return (Criteria) this;
        }

        public Criteria andCipscoreIsNotNull() {
            addCriterion("CIPScore is not null");
            return (Criteria) this;
        }

        public Criteria andCipscoreEqualTo(Double value) {
            addCriterion("CIPScore =", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreNotEqualTo(Double value) {
            addCriterion("CIPScore <>", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreGreaterThan(Double value) {
            addCriterion("CIPScore >", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("CIPScore >=", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreLessThan(Double value) {
            addCriterion("CIPScore <", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreLessThanOrEqualTo(Double value) {
            addCriterion("CIPScore <=", value, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreIn(List<Double> values) {
            addCriterion("CIPScore in", values, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreNotIn(List<Double> values) {
            addCriterion("CIPScore not in", values, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreBetween(Double value1, Double value2) {
            addCriterion("CIPScore between", value1, value2, "cipscore");
            return (Criteria) this;
        }

        public Criteria andCipscoreNotBetween(Double value1, Double value2) {
            addCriterion("CIPScore not between", value1, value2, "cipscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreIsNull() {
            addCriterion("OthersScore is null");
            return (Criteria) this;
        }

        public Criteria andOthersscoreIsNotNull() {
            addCriterion("OthersScore is not null");
            return (Criteria) this;
        }

        public Criteria andOthersscoreEqualTo(Double value) {
            addCriterion("OthersScore =", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreNotEqualTo(Double value) {
            addCriterion("OthersScore <>", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreGreaterThan(Double value) {
            addCriterion("OthersScore >", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("OthersScore >=", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreLessThan(Double value) {
            addCriterion("OthersScore <", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreLessThanOrEqualTo(Double value) {
            addCriterion("OthersScore <=", value, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreIn(List<Double> values) {
            addCriterion("OthersScore in", values, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreNotIn(List<Double> values) {
            addCriterion("OthersScore not in", values, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreBetween(Double value1, Double value2) {
            addCriterion("OthersScore between", value1, value2, "othersscore");
            return (Criteria) this;
        }

        public Criteria andOthersscoreNotBetween(Double value1, Double value2) {
            addCriterion("OthersScore not between", value1, value2, "othersscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("TotalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("TotalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Double value) {
            addCriterion("TotalScore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Double value) {
            addCriterion("TotalScore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Double value) {
            addCriterion("TotalScore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalScore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Double value) {
            addCriterion("TotalScore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Double value) {
            addCriterion("TotalScore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Double> values) {
            addCriterion("TotalScore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Double> values) {
            addCriterion("TotalScore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Double value1, Double value2) {
            addCriterion("TotalScore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Double value1, Double value2) {
            addCriterion("TotalScore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andSpepercentageIsNull() {
            addCriterion("SPEPercentage is null");
            return (Criteria) this;
        }

        public Criteria andSpepercentageIsNotNull() {
            addCriterion("SPEPercentage is not null");
            return (Criteria) this;
        }

        public Criteria andSpepercentageEqualTo(Double value) {
            addCriterion("SPEPercentage =", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageNotEqualTo(Double value) {
            addCriterion("SPEPercentage <>", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageGreaterThan(Double value) {
            addCriterion("SPEPercentage >", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEPercentage >=", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageLessThan(Double value) {
            addCriterion("SPEPercentage <", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageLessThanOrEqualTo(Double value) {
            addCriterion("SPEPercentage <=", value, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageIn(List<Double> values) {
            addCriterion("SPEPercentage in", values, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageNotIn(List<Double> values) {
            addCriterion("SPEPercentage not in", values, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageBetween(Double value1, Double value2) {
            addCriterion("SPEPercentage between", value1, value2, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andSpepercentageNotBetween(Double value1, Double value2) {
            addCriterion("SPEPercentage not between", value1, value2, "spepercentage");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("SN =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("SN <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("SN >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("SN >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("SN <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("SN <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("SN like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("SN not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("SN in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("SN not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("SN between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UpdateUser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UpdateUser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UpdateUser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UpdateUser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UpdateUser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateUser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UpdateUser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UpdateUser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UpdateUser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UpdateUser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UpdateUser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UpdateUser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UpdateUser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UpdateUser not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andIsapproveIsNull() {
            addCriterion("IsApprove is null");
            return (Criteria) this;
        }

        public Criteria andIsapproveIsNotNull() {
            addCriterion("IsApprove is not null");
            return (Criteria) this;
        }

        public Criteria andIsapproveEqualTo(Integer value) {
            addCriterion("IsApprove =", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotEqualTo(Integer value) {
            addCriterion("IsApprove <>", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveGreaterThan(Integer value) {
            addCriterion("IsApprove >", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsApprove >=", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveLessThan(Integer value) {
            addCriterion("IsApprove <", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveLessThanOrEqualTo(Integer value) {
            addCriterion("IsApprove <=", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveIn(List<Integer> values) {
            addCriterion("IsApprove in", values, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotIn(List<Integer> values) {
            addCriterion("IsApprove not in", values, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveBetween(Integer value1, Integer value2) {
            addCriterion("IsApprove between", value1, value2, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotBetween(Integer value1, Integer value2) {
            addCriterion("IsApprove not between", value1, value2, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("IsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("IsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("IsDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("IsDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("IsDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("IsDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IsDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("IsDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("IsDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("IsDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDelete not between", value1, value2, "isdelete");
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