package com.tuling.library.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNumberIsNull() {
            addCriterion("stu_number is null");
            return (Criteria) this;
        }

        public Criteria andStuNumberIsNotNull() {
            addCriterion("stu_number is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumberEqualTo(String value) {
            addCriterion("stu_number =", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotEqualTo(String value) {
            addCriterion("stu_number <>", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberGreaterThan(String value) {
            addCriterion("stu_number >", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stu_number >=", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberLessThan(String value) {
            addCriterion("stu_number <", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberLessThanOrEqualTo(String value) {
            addCriterion("stu_number <=", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberLike(String value) {
            addCriterion("stu_number like", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotLike(String value) {
            addCriterion("stu_number not like", value, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberIn(List<String> values) {
            addCriterion("stu_number in", values, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotIn(List<String> values) {
            addCriterion("stu_number not in", values, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberBetween(String value1, String value2) {
            addCriterion("stu_number between", value1, value2, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNumberNotBetween(String value1, String value2) {
            addCriterion("stu_number not between", value1, value2, "stuNumber");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNull() {
            addCriterion("stu_gender is null");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNotNull() {
            addCriterion("stu_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStuGenderEqualTo(Byte value) {
            addCriterion("stu_gender =", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotEqualTo(Byte value) {
            addCriterion("stu_gender <>", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThan(Byte value) {
            addCriterion("stu_gender >", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("stu_gender >=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThan(Byte value) {
            addCriterion("stu_gender <", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThanOrEqualTo(Byte value) {
            addCriterion("stu_gender <=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderIn(List<Byte> values) {
            addCriterion("stu_gender in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotIn(List<Byte> values) {
            addCriterion("stu_gender not in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderBetween(Byte value1, Byte value2) {
            addCriterion("stu_gender between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("stu_gender not between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuDeptIsNull() {
            addCriterion("stu_dept is null");
            return (Criteria) this;
        }

        public Criteria andStuDeptIsNotNull() {
            addCriterion("stu_dept is not null");
            return (Criteria) this;
        }

        public Criteria andStuDeptEqualTo(String value) {
            addCriterion("stu_dept =", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptNotEqualTo(String value) {
            addCriterion("stu_dept <>", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptGreaterThan(String value) {
            addCriterion("stu_dept >", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptGreaterThanOrEqualTo(String value) {
            addCriterion("stu_dept >=", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptLessThan(String value) {
            addCriterion("stu_dept <", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptLessThanOrEqualTo(String value) {
            addCriterion("stu_dept <=", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptLike(String value) {
            addCriterion("stu_dept like", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptNotLike(String value) {
            addCriterion("stu_dept not like", value, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptIn(List<String> values) {
            addCriterion("stu_dept in", values, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptNotIn(List<String> values) {
            addCriterion("stu_dept not in", values, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptBetween(String value1, String value2) {
            addCriterion("stu_dept between", value1, value2, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuDeptNotBetween(String value1, String value2) {
            addCriterion("stu_dept not between", value1, value2, "stuDept");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNull() {
            addCriterion("stu_major is null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNotNull() {
            addCriterion("stu_major is not null");
            return (Criteria) this;
        }

        public Criteria andStuMajorEqualTo(String value) {
            addCriterion("stu_major =", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotEqualTo(String value) {
            addCriterion("stu_major <>", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThan(String value) {
            addCriterion("stu_major >", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThanOrEqualTo(String value) {
            addCriterion("stu_major >=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThan(String value) {
            addCriterion("stu_major <", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThanOrEqualTo(String value) {
            addCriterion("stu_major <=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLike(String value) {
            addCriterion("stu_major like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotLike(String value) {
            addCriterion("stu_major not like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorIn(List<String> values) {
            addCriterion("stu_major in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotIn(List<String> values) {
            addCriterion("stu_major not in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorBetween(String value1, String value2) {
            addCriterion("stu_major between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotBetween(String value1, String value2) {
            addCriterion("stu_major not between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
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