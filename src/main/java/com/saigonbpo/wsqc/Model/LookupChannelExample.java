package com.saigonbpo.wsqc.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LookupChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LookupChannelExample() {
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

        public Criteria andCcCodeIsNull() {
            addCriterion("cc_code is null");
            return (Criteria) this;
        }

        public Criteria andCcCodeIsNotNull() {
            addCriterion("cc_code is not null");
            return (Criteria) this;
        }

        public Criteria andCcCodeEqualTo(String value) {
            addCriterion("cc_code =", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeNotEqualTo(String value) {
            addCriterion("cc_code <>", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeGreaterThan(String value) {
            addCriterion("cc_code >", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cc_code >=", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeLessThan(String value) {
            addCriterion("cc_code <", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeLessThanOrEqualTo(String value) {
            addCriterion("cc_code <=", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeLike(String value) {
            addCriterion("cc_code like", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeNotLike(String value) {
            addCriterion("cc_code not like", value, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeIn(List<String> values) {
            addCriterion("cc_code in", values, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeNotIn(List<String> values) {
            addCriterion("cc_code not in", values, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeBetween(String value1, String value2) {
            addCriterion("cc_code between", value1, value2, "ccCode");
            return (Criteria) this;
        }

        public Criteria andCcCodeNotBetween(String value1, String value2) {
            addCriterion("cc_code not between", value1, value2, "ccCode");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andPosCodeIsNull() {
            addCriterion("pos_code is null");
            return (Criteria) this;
        }

        public Criteria andPosCodeIsNotNull() {
            addCriterion("pos_code is not null");
            return (Criteria) this;
        }

        public Criteria andPosCodeEqualTo(String value) {
            addCriterion("pos_code =", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotEqualTo(String value) {
            addCriterion("pos_code <>", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeGreaterThan(String value) {
            addCriterion("pos_code >", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pos_code >=", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLessThan(String value) {
            addCriterion("pos_code <", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLessThanOrEqualTo(String value) {
            addCriterion("pos_code <=", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLike(String value) {
            addCriterion("pos_code like", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotLike(String value) {
            addCriterion("pos_code not like", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeIn(List<String> values) {
            addCriterion("pos_code in", values, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotIn(List<String> values) {
            addCriterion("pos_code not in", values, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeBetween(String value1, String value2) {
            addCriterion("pos_code between", value1, value2, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotBetween(String value1, String value2) {
            addCriterion("pos_code not between", value1, value2, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNull() {
            addCriterion("pos_name is null");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNotNull() {
            addCriterion("pos_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosNameEqualTo(String value) {
            addCriterion("pos_name =", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotEqualTo(String value) {
            addCriterion("pos_name <>", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThan(String value) {
            addCriterion("pos_name >", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThanOrEqualTo(String value) {
            addCriterion("pos_name >=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThan(String value) {
            addCriterion("pos_name <", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThanOrEqualTo(String value) {
            addCriterion("pos_name <=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLike(String value) {
            addCriterion("pos_name like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotLike(String value) {
            addCriterion("pos_name not like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameIn(List<String> values) {
            addCriterion("pos_name in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotIn(List<String> values) {
            addCriterion("pos_name not in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameBetween(String value1, String value2) {
            addCriterion("pos_name between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotBetween(String value1, String value2) {
            addCriterion("pos_name not between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNull() {
            addCriterion("cc_name is null");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNotNull() {
            addCriterion("cc_name is not null");
            return (Criteria) this;
        }

        public Criteria andCcNameEqualTo(String value) {
            addCriterion("cc_name =", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotEqualTo(String value) {
            addCriterion("cc_name <>", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThan(String value) {
            addCriterion("cc_name >", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThanOrEqualTo(String value) {
            addCriterion("cc_name >=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThan(String value) {
            addCriterion("cc_name <", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThanOrEqualTo(String value) {
            addCriterion("cc_name <=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLike(String value) {
            addCriterion("cc_name like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotLike(String value) {
            addCriterion("cc_name not like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameIn(List<String> values) {
            addCriterion("cc_name in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotIn(List<String> values) {
            addCriterion("cc_name not in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameBetween(String value1, String value2) {
            addCriterion("cc_name between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotBetween(String value1, String value2) {
            addCriterion("cc_name not between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcPasswordIsNull() {
            addCriterion("cc_password is null");
            return (Criteria) this;
        }

        public Criteria andCcPasswordIsNotNull() {
            addCriterion("cc_password is not null");
            return (Criteria) this;
        }

        public Criteria andCcPasswordEqualTo(String value) {
            addCriterion("cc_password =", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordNotEqualTo(String value) {
            addCriterion("cc_password <>", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordGreaterThan(String value) {
            addCriterion("cc_password >", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cc_password >=", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordLessThan(String value) {
            addCriterion("cc_password <", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordLessThanOrEqualTo(String value) {
            addCriterion("cc_password <=", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordLike(String value) {
            addCriterion("cc_password like", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordNotLike(String value) {
            addCriterion("cc_password not like", value, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordIn(List<String> values) {
            addCriterion("cc_password in", values, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordNotIn(List<String> values) {
            addCriterion("cc_password not in", values, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordBetween(String value1, String value2) {
            addCriterion("cc_password between", value1, value2, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcPasswordNotBetween(String value1, String value2) {
            addCriterion("cc_password not between", value1, value2, "ccPassword");
            return (Criteria) this;
        }

        public Criteria andCcRoleIsNull() {
            addCriterion("cc_role is null");
            return (Criteria) this;
        }

        public Criteria andCcRoleIsNotNull() {
            addCriterion("cc_role is not null");
            return (Criteria) this;
        }

        public Criteria andCcRoleEqualTo(String value) {
            addCriterion("cc_role =", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleNotEqualTo(String value) {
            addCriterion("cc_role <>", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleGreaterThan(String value) {
            addCriterion("cc_role >", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleGreaterThanOrEqualTo(String value) {
            addCriterion("cc_role >=", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleLessThan(String value) {
            addCriterion("cc_role <", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleLessThanOrEqualTo(String value) {
            addCriterion("cc_role <=", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleLike(String value) {
            addCriterion("cc_role like", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleNotLike(String value) {
            addCriterion("cc_role not like", value, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleIn(List<String> values) {
            addCriterion("cc_role in", values, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleNotIn(List<String> values) {
            addCriterion("cc_role not in", values, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleBetween(String value1, String value2) {
            addCriterion("cc_role between", value1, value2, "ccRole");
            return (Criteria) this;
        }

        public Criteria andCcRoleNotBetween(String value1, String value2) {
            addCriterion("cc_role not between", value1, value2, "ccRole");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberIsNull() {
            addCriterion("cc_phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberIsNotNull() {
            addCriterion("cc_phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberEqualTo(String value) {
            addCriterion("cc_phonenumber =", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberNotEqualTo(String value) {
            addCriterion("cc_phonenumber <>", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberGreaterThan(String value) {
            addCriterion("cc_phonenumber >", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("cc_phonenumber >=", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberLessThan(String value) {
            addCriterion("cc_phonenumber <", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("cc_phonenumber <=", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberLike(String value) {
            addCriterion("cc_phonenumber like", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberNotLike(String value) {
            addCriterion("cc_phonenumber not like", value, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberIn(List<String> values) {
            addCriterion("cc_phonenumber in", values, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberNotIn(List<String> values) {
            addCriterion("cc_phonenumber not in", values, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberBetween(String value1, String value2) {
            addCriterion("cc_phonenumber between", value1, value2, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andCcPhonenumberNotBetween(String value1, String value2) {
            addCriterion("cc_phonenumber not between", value1, value2, "ccPhonenumber");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("device_model =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("device_model >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("device_model <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("device_model like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("device_model not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("device_model in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyIsNull() {
            addCriterion("security_key is null");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyIsNotNull() {
            addCriterion("security_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyEqualTo(String value) {
            addCriterion("security_key =", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyNotEqualTo(String value) {
            addCriterion("security_key <>", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyGreaterThan(String value) {
            addCriterion("security_key >", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyGreaterThanOrEqualTo(String value) {
            addCriterion("security_key >=", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyLessThan(String value) {
            addCriterion("security_key <", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyLessThanOrEqualTo(String value) {
            addCriterion("security_key <=", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyLike(String value) {
            addCriterion("security_key like", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyNotLike(String value) {
            addCriterion("security_key not like", value, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyIn(List<String> values) {
            addCriterion("security_key in", values, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyNotIn(List<String> values) {
            addCriterion("security_key not in", values, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyBetween(String value1, String value2) {
            addCriterion("security_key between", value1, value2, "securityKey");
            return (Criteria) this;
        }

        public Criteria andSecurityKeyNotBetween(String value1, String value2) {
            addCriterion("security_key not between", value1, value2, "securityKey");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIsNull() {
            addCriterion("is_android is null");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIsNotNull() {
            addCriterion("is_android is not null");
            return (Criteria) this;
        }

        public Criteria andIsAndroidEqualTo(Short value) {
            addCriterion("is_android =", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotEqualTo(Short value) {
            addCriterion("is_android <>", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidGreaterThan(Short value) {
            addCriterion("is_android >", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidGreaterThanOrEqualTo(Short value) {
            addCriterion("is_android >=", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidLessThan(Short value) {
            addCriterion("is_android <", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidLessThanOrEqualTo(Short value) {
            addCriterion("is_android <=", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIn(List<Short> values) {
            addCriterion("is_android in", values, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotIn(List<Short> values) {
            addCriterion("is_android not in", values, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidBetween(Short value1, Short value2) {
            addCriterion("is_android between", value1, value2, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotBetween(Short value1, Short value2) {
            addCriterion("is_android not between", value1, value2, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationIsNull() {
            addCriterion("date_of_user_creation is null");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationIsNotNull() {
            addCriterion("date_of_user_creation is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationEqualTo(Date value) {
            addCriterion("date_of_user_creation =", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationNotEqualTo(Date value) {
            addCriterion("date_of_user_creation <>", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationGreaterThan(Date value) {
            addCriterion("date_of_user_creation >", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationGreaterThanOrEqualTo(Date value) {
            addCriterion("date_of_user_creation >=", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationLessThan(Date value) {
            addCriterion("date_of_user_creation <", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationLessThanOrEqualTo(Date value) {
            addCriterion("date_of_user_creation <=", value, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationIn(List<Date> values) {
            addCriterion("date_of_user_creation in", values, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationNotIn(List<Date> values) {
            addCriterion("date_of_user_creation not in", values, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationBetween(Date value1, Date value2) {
            addCriterion("date_of_user_creation between", value1, value2, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andDateOfUserCreationNotBetween(Date value1, Date value2) {
            addCriterion("date_of_user_creation not between", value1, value2, "dateOfUserCreation");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Boolean value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Boolean value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Boolean value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Boolean value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Boolean> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Boolean> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Date value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Date value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Date value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Date value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Date> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Date> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Date value1, Date value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeIsNull() {
            addCriterion("last_pwd_change is null");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeIsNotNull() {
            addCriterion("last_pwd_change is not null");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeEqualTo(Date value) {
            addCriterion("last_pwd_change =", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeNotEqualTo(Date value) {
            addCriterion("last_pwd_change <>", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeGreaterThan(Date value) {
            addCriterion("last_pwd_change >", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_pwd_change >=", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeLessThan(Date value) {
            addCriterion("last_pwd_change <", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeLessThanOrEqualTo(Date value) {
            addCriterion("last_pwd_change <=", value, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeIn(List<Date> values) {
            addCriterion("last_pwd_change in", values, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeNotIn(List<Date> values) {
            addCriterion("last_pwd_change not in", values, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeBetween(Date value1, Date value2) {
            addCriterion("last_pwd_change between", value1, value2, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andLastPwdChangeNotBetween(Date value1, Date value2) {
            addCriterion("last_pwd_change not between", value1, value2, "lastPwdChange");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedIsNull() {
            addCriterion("is_pwd_changed is null");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedIsNotNull() {
            addCriterion("is_pwd_changed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedEqualTo(Boolean value) {
            addCriterion("is_pwd_changed =", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedNotEqualTo(Boolean value) {
            addCriterion("is_pwd_changed <>", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedGreaterThan(Boolean value) {
            addCriterion("is_pwd_changed >", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pwd_changed >=", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedLessThan(Boolean value) {
            addCriterion("is_pwd_changed <", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pwd_changed <=", value, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedIn(List<Boolean> values) {
            addCriterion("is_pwd_changed in", values, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedNotIn(List<Boolean> values) {
            addCriterion("is_pwd_changed not in", values, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pwd_changed between", value1, value2, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andIsPwdChangedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pwd_changed not between", value1, value2, "isPwdChanged");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andBcryptIsNull() {
            addCriterion("bcrypt is null");
            return (Criteria) this;
        }

        public Criteria andBcryptIsNotNull() {
            addCriterion("bcrypt is not null");
            return (Criteria) this;
        }

        public Criteria andBcryptEqualTo(String value) {
            addCriterion("bcrypt =", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptNotEqualTo(String value) {
            addCriterion("bcrypt <>", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptGreaterThan(String value) {
            addCriterion("bcrypt >", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptGreaterThanOrEqualTo(String value) {
            addCriterion("bcrypt >=", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptLessThan(String value) {
            addCriterion("bcrypt <", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptLessThanOrEqualTo(String value) {
            addCriterion("bcrypt <=", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptLike(String value) {
            addCriterion("bcrypt like", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptNotLike(String value) {
            addCriterion("bcrypt not like", value, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptIn(List<String> values) {
            addCriterion("bcrypt in", values, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptNotIn(List<String> values) {
            addCriterion("bcrypt not in", values, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptBetween(String value1, String value2) {
            addCriterion("bcrypt between", value1, value2, "bcrypt");
            return (Criteria) this;
        }

        public Criteria andBcryptNotBetween(String value1, String value2) {
            addCriterion("bcrypt not between", value1, value2, "bcrypt");
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