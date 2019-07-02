package com.microbridge.workspace.bean;

import java.util.ArrayList;
import java.util.List;

public class recordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public recordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegpronameIsNull() {
            addCriterion("regProName is null");
            return (Criteria) this;
        }

        public Criteria andRegpronameIsNotNull() {
            addCriterion("regProName is not null");
            return (Criteria) this;
        }

        public Criteria andRegpronameEqualTo(String value) {
            addCriterion("regProName =", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameNotEqualTo(String value) {
            addCriterion("regProName <>", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameGreaterThan(String value) {
            addCriterion("regProName >", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameGreaterThanOrEqualTo(String value) {
            addCriterion("regProName >=", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameLessThan(String value) {
            addCriterion("regProName <", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameLessThanOrEqualTo(String value) {
            addCriterion("regProName <=", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameLike(String value) {
            addCriterion("regProName like", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameNotLike(String value) {
            addCriterion("regProName not like", value, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameIn(List<String> values) {
            addCriterion("regProName in", values, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameNotIn(List<String> values) {
            addCriterion("regProName not in", values, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameBetween(String value1, String value2) {
            addCriterion("regProName between", value1, value2, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegpronameNotBetween(String value1, String value2) {
            addCriterion("regProName not between", value1, value2, "regproname");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(String value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(String value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(String value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(String value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(String value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLike(String value) {
            addCriterion("regTime like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotLike(String value) {
            addCriterion("regTime not like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<String> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<String> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(String value1, String value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(String value1, String value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegoptIsNull() {
            addCriterion("regOpt is null");
            return (Criteria) this;
        }

        public Criteria andRegoptIsNotNull() {
            addCriterion("regOpt is not null");
            return (Criteria) this;
        }

        public Criteria andRegoptEqualTo(String value) {
            addCriterion("regOpt =", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptNotEqualTo(String value) {
            addCriterion("regOpt <>", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptGreaterThan(String value) {
            addCriterion("regOpt >", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptGreaterThanOrEqualTo(String value) {
            addCriterion("regOpt >=", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptLessThan(String value) {
            addCriterion("regOpt <", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptLessThanOrEqualTo(String value) {
            addCriterion("regOpt <=", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptLike(String value) {
            addCriterion("regOpt like", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptNotLike(String value) {
            addCriterion("regOpt not like", value, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptIn(List<String> values) {
            addCriterion("regOpt in", values, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptNotIn(List<String> values) {
            addCriterion("regOpt not in", values, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptBetween(String value1, String value2) {
            addCriterion("regOpt between", value1, value2, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegoptNotBetween(String value1, String value2) {
            addCriterion("regOpt not between", value1, value2, "regopt");
            return (Criteria) this;
        }

        public Criteria andRegkeyIsNull() {
            addCriterion("regKey is null");
            return (Criteria) this;
        }

        public Criteria andRegkeyIsNotNull() {
            addCriterion("regKey is not null");
            return (Criteria) this;
        }

        public Criteria andRegkeyEqualTo(String value) {
            addCriterion("regKey =", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyNotEqualTo(String value) {
            addCriterion("regKey <>", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyGreaterThan(String value) {
            addCriterion("regKey >", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyGreaterThanOrEqualTo(String value) {
            addCriterion("regKey >=", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyLessThan(String value) {
            addCriterion("regKey <", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyLessThanOrEqualTo(String value) {
            addCriterion("regKey <=", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyLike(String value) {
            addCriterion("regKey like", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyNotLike(String value) {
            addCriterion("regKey not like", value, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyIn(List<String> values) {
            addCriterion("regKey in", values, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyNotIn(List<String> values) {
            addCriterion("regKey not in", values, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyBetween(String value1, String value2) {
            addCriterion("regKey between", value1, value2, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegkeyNotBetween(String value1, String value2) {
            addCriterion("regKey not between", value1, value2, "regkey");
            return (Criteria) this;
        }

        public Criteria andRegmacIsNull() {
            addCriterion("regMac is null");
            return (Criteria) this;
        }

        public Criteria andRegmacIsNotNull() {
            addCriterion("regMac is not null");
            return (Criteria) this;
        }

        public Criteria andRegmacEqualTo(String value) {
            addCriterion("regMac =", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacNotEqualTo(String value) {
            addCriterion("regMac <>", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacGreaterThan(String value) {
            addCriterion("regMac >", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacGreaterThanOrEqualTo(String value) {
            addCriterion("regMac >=", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacLessThan(String value) {
            addCriterion("regMac <", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacLessThanOrEqualTo(String value) {
            addCriterion("regMac <=", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacLike(String value) {
            addCriterion("regMac like", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacNotLike(String value) {
            addCriterion("regMac not like", value, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacIn(List<String> values) {
            addCriterion("regMac in", values, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacNotIn(List<String> values) {
            addCriterion("regMac not in", values, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacBetween(String value1, String value2) {
            addCriterion("regMac between", value1, value2, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegmacNotBetween(String value1, String value2) {
            addCriterion("regMac not between", value1, value2, "regmac");
            return (Criteria) this;
        }

        public Criteria andRegipIsNull() {
            addCriterion("regIP is null");
            return (Criteria) this;
        }

        public Criteria andRegipIsNotNull() {
            addCriterion("regIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegipEqualTo(String value) {
            addCriterion("regIP =", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotEqualTo(String value) {
            addCriterion("regIP <>", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThan(String value) {
            addCriterion("regIP >", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThanOrEqualTo(String value) {
            addCriterion("regIP >=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThan(String value) {
            addCriterion("regIP <", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThanOrEqualTo(String value) {
            addCriterion("regIP <=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLike(String value) {
            addCriterion("regIP like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotLike(String value) {
            addCriterion("regIP not like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipIn(List<String> values) {
            addCriterion("regIP in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotIn(List<String> values) {
            addCriterion("regIP not in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipBetween(String value1, String value2) {
            addCriterion("regIP between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotBetween(String value1, String value2) {
            addCriterion("regIP not between", value1, value2, "regip");
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