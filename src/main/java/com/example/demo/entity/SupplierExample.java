package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andCommodityIsNull() {
            addCriterion("Commodity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNotNull() {
            addCriterion("Commodity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEqualTo(Integer value) {
            addCriterion("Commodity =", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotEqualTo(Integer value) {
            addCriterion("Commodity <>", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThan(Integer value) {
            addCriterion("Commodity >", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Commodity >=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThan(Integer value) {
            addCriterion("Commodity <", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThanOrEqualTo(Integer value) {
            addCriterion("Commodity <=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityIn(List<Integer> values) {
            addCriterion("Commodity in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotIn(List<Integer> values) {
            addCriterion("Commodity not in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityBetween(Integer value1, Integer value2) {
            addCriterion("Commodity between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotBetween(Integer value1, Integer value2) {
            addCriterion("Commodity not between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andFullscoreIsNull() {
            addCriterion("FullScore is null");
            return (Criteria) this;
        }

        public Criteria andFullscoreIsNotNull() {
            addCriterion("FullScore is not null");
            return (Criteria) this;
        }

        public Criteria andFullscoreEqualTo(Integer value) {
            addCriterion("FullScore =", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreNotEqualTo(Integer value) {
            addCriterion("FullScore <>", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreGreaterThan(Integer value) {
            addCriterion("FullScore >", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("FullScore >=", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreLessThan(Integer value) {
            addCriterion("FullScore <", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreLessThanOrEqualTo(Integer value) {
            addCriterion("FullScore <=", value, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreIn(List<Integer> values) {
            addCriterion("FullScore in", values, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreNotIn(List<Integer> values) {
            addCriterion("FullScore not in", values, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreBetween(Integer value1, Integer value2) {
            addCriterion("FullScore between", value1, value2, "fullscore");
            return (Criteria) this;
        }

        public Criteria andFullscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("FullScore not between", value1, value2, "fullscore");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplierownerIsNull() {
            addCriterion("SupplierOwner is null");
            return (Criteria) this;
        }

        public Criteria andSupplierownerIsNotNull() {
            addCriterion("SupplierOwner is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierownerEqualTo(String value) {
            addCriterion("SupplierOwner =", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerNotEqualTo(String value) {
            addCriterion("SupplierOwner <>", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerGreaterThan(String value) {
            addCriterion("SupplierOwner >", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierOwner >=", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerLessThan(String value) {
            addCriterion("SupplierOwner <", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerLessThanOrEqualTo(String value) {
            addCriterion("SupplierOwner <=", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerLike(String value) {
            addCriterion("SupplierOwner like", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerNotLike(String value) {
            addCriterion("SupplierOwner not like", value, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerIn(List<String> values) {
            addCriterion("SupplierOwner in", values, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerNotIn(List<String> values) {
            addCriterion("SupplierOwner not in", values, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerBetween(String value1, String value2) {
            addCriterion("SupplierOwner between", value1, value2, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplierownerNotBetween(String value1, String value2) {
            addCriterion("SupplierOwner not between", value1, value2, "supplierowner");
            return (Criteria) this;
        }

        public Criteria andSupplieruserIsNull() {
            addCriterion("SupplierUser is null");
            return (Criteria) this;
        }

        public Criteria andSupplieruserIsNotNull() {
            addCriterion("SupplierUser is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieruserEqualTo(String value) {
            addCriterion("SupplierUser =", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserNotEqualTo(String value) {
            addCriterion("SupplierUser <>", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserGreaterThan(String value) {
            addCriterion("SupplierUser >", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierUser >=", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserLessThan(String value) {
            addCriterion("SupplierUser <", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserLessThanOrEqualTo(String value) {
            addCriterion("SupplierUser <=", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserLike(String value) {
            addCriterion("SupplierUser like", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserNotLike(String value) {
            addCriterion("SupplierUser not like", value, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserIn(List<String> values) {
            addCriterion("SupplierUser in", values, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserNotIn(List<String> values) {
            addCriterion("SupplierUser not in", values, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserBetween(String value1, String value2) {
            addCriterion("SupplierUser between", value1, value2, "supplieruser");
            return (Criteria) this;
        }

        public Criteria andSupplieruserNotBetween(String value1, String value2) {
            addCriterion("SupplierUser not between", value1, value2, "supplieruser");
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