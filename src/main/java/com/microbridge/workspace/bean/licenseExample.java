package com.microbridge.workspace.bean;

import java.util.ArrayList;
import java.util.List;

public class licenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public licenseExample() {
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

        public Criteria andLicenseidIsNull() {
            addCriterion("licenseID is null");
            return (Criteria) this;
        }

        public Criteria andLicenseidIsNotNull() {
            addCriterion("licenseID is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseidEqualTo(String value) {
            addCriterion("licenseID =", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotEqualTo(String value) {
            addCriterion("licenseID <>", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidGreaterThan(String value) {
            addCriterion("licenseID >", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidGreaterThanOrEqualTo(String value) {
            addCriterion("licenseID >=", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLessThan(String value) {
            addCriterion("licenseID <", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLessThanOrEqualTo(String value) {
            addCriterion("licenseID <=", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLike(String value) {
            addCriterion("licenseID like", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotLike(String value) {
            addCriterion("licenseID not like", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidIn(List<String> values) {
            addCriterion("licenseID in", values, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotIn(List<String> values) {
            addCriterion("licenseID not in", values, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidBetween(String value1, String value2) {
            addCriterion("licenseID between", value1, value2, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotBetween(String value1, String value2) {
            addCriterion("licenseID not between", value1, value2, "licenseid");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(String value) {
            addCriterion("projectID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(String value) {
            addCriterion("projectID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(String value) {
            addCriterion("projectID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(String value) {
            addCriterion("projectID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(String value) {
            addCriterion("projectID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(String value) {
            addCriterion("projectID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLike(String value) {
            addCriterion("projectID like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotLike(String value) {
            addCriterion("projectID not like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<String> values) {
            addCriterion("projectID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<String> values) {
            addCriterion("projectID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(String value1, String value2) {
            addCriterion("projectID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(String value1, String value2) {
            addCriterion("projectID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andRundayIsNull() {
            addCriterion("runDay is null");
            return (Criteria) this;
        }

        public Criteria andRundayIsNotNull() {
            addCriterion("runDay is not null");
            return (Criteria) this;
        }

        public Criteria andRundayEqualTo(Integer value) {
            addCriterion("runDay =", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayNotEqualTo(Integer value) {
            addCriterion("runDay <>", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayGreaterThan(Integer value) {
            addCriterion("runDay >", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayGreaterThanOrEqualTo(Integer value) {
            addCriterion("runDay >=", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayLessThan(Integer value) {
            addCriterion("runDay <", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayLessThanOrEqualTo(Integer value) {
            addCriterion("runDay <=", value, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayIn(List<Integer> values) {
            addCriterion("runDay in", values, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayNotIn(List<Integer> values) {
            addCriterion("runDay not in", values, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayBetween(Integer value1, Integer value2) {
            addCriterion("runDay between", value1, value2, "runday");
            return (Criteria) this;
        }

        public Criteria andRundayNotBetween(Integer value1, Integer value2) {
            addCriterion("runDay not between", value1, value2, "runday");
            return (Criteria) this;
        }

        public Criteria andRegnumIsNull() {
            addCriterion("regNum is null");
            return (Criteria) this;
        }

        public Criteria andRegnumIsNotNull() {
            addCriterion("regNum is not null");
            return (Criteria) this;
        }

        public Criteria andRegnumEqualTo(Integer value) {
            addCriterion("regNum =", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotEqualTo(Integer value) {
            addCriterion("regNum <>", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumGreaterThan(Integer value) {
            addCriterion("regNum >", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("regNum >=", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumLessThan(Integer value) {
            addCriterion("regNum <", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumLessThanOrEqualTo(Integer value) {
            addCriterion("regNum <=", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumIn(List<Integer> values) {
            addCriterion("regNum in", values, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotIn(List<Integer> values) {
            addCriterion("regNum not in", values, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumBetween(Integer value1, Integer value2) {
            addCriterion("regNum between", value1, value2, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotBetween(Integer value1, Integer value2) {
            addCriterion("regNum not between", value1, value2, "regnum");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNull() {
            addCriterion("options is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("options is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("options =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("options <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("options >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("options >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("options <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("options <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("options like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("options not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<String> values) {
            addCriterion("options in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<String> values) {
            addCriterion("options not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("options between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("options not between", value1, value2, "options");
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