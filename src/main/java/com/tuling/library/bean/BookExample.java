package com.tuling.library.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookGistIsNull() {
            addCriterion("book_gist is null");
            return (Criteria) this;
        }

        public Criteria andBookGistIsNotNull() {
            addCriterion("book_gist is not null");
            return (Criteria) this;
        }

        public Criteria andBookGistEqualTo(String value) {
            addCriterion("book_gist =", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistNotEqualTo(String value) {
            addCriterion("book_gist <>", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistGreaterThan(String value) {
            addCriterion("book_gist >", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistGreaterThanOrEqualTo(String value) {
            addCriterion("book_gist >=", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistLessThan(String value) {
            addCriterion("book_gist <", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistLessThanOrEqualTo(String value) {
            addCriterion("book_gist <=", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistLike(String value) {
            addCriterion("book_gist like", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistNotLike(String value) {
            addCriterion("book_gist not like", value, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistIn(List<String> values) {
            addCriterion("book_gist in", values, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistNotIn(List<String> values) {
            addCriterion("book_gist not in", values, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistBetween(String value1, String value2) {
            addCriterion("book_gist between", value1, value2, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookGistNotBetween(String value1, String value2) {
            addCriterion("book_gist not between", value1, value2, "bookGist");
            return (Criteria) this;
        }

        public Criteria andBookPubDateIsNull() {
            addCriterion("book_pub_date is null");
            return (Criteria) this;
        }

        public Criteria andBookPubDateIsNotNull() {
            addCriterion("book_pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookPubDateEqualTo(Date value) {
            addCriterionForJDBCDate("book_pub_date =", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_pub_date <>", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateGreaterThan(Date value) {
            addCriterionForJDBCDate("book_pub_date >", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_pub_date >=", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateLessThan(Date value) {
            addCriterionForJDBCDate("book_pub_date <", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_pub_date <=", value, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateIn(List<Date> values) {
            addCriterionForJDBCDate("book_pub_date in", values, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_pub_date not in", values, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_pub_date between", value1, value2, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookPubDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_pub_date not between", value1, value2, "bookPubDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateIsNull() {
            addCriterion("book_pro_date is null");
            return (Criteria) this;
        }

        public Criteria andBookProDateIsNotNull() {
            addCriterion("book_pro_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookProDateEqualTo(Date value) {
            addCriterionForJDBCDate("book_pro_date =", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_pro_date <>", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateGreaterThan(Date value) {
            addCriterionForJDBCDate("book_pro_date >", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_pro_date >=", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateLessThan(Date value) {
            addCriterionForJDBCDate("book_pro_date <", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_pro_date <=", value, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateIn(List<Date> values) {
            addCriterionForJDBCDate("book_pro_date in", values, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_pro_date not in", values, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_pro_date between", value1, value2, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_pro_date not between", value1, value2, "bookProDate");
            return (Criteria) this;
        }

        public Criteria andBookProPriceIsNull() {
            addCriterion("book_pro_price is null");
            return (Criteria) this;
        }

        public Criteria andBookProPriceIsNotNull() {
            addCriterion("book_pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookProPriceEqualTo(BigDecimal value) {
            addCriterion("book_pro_price =", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceNotEqualTo(BigDecimal value) {
            addCriterion("book_pro_price <>", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceGreaterThan(BigDecimal value) {
            addCriterion("book_pro_price >", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_pro_price >=", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceLessThan(BigDecimal value) {
            addCriterion("book_pro_price <", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_pro_price <=", value, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceIn(List<BigDecimal> values) {
            addCriterion("book_pro_price in", values, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceNotIn(List<BigDecimal> values) {
            addCriterion("book_pro_price not in", values, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_pro_price between", value1, value2, "bookProPrice");
            return (Criteria) this;
        }

        public Criteria andBookProPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_pro_price not between", value1, value2, "bookProPrice");
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