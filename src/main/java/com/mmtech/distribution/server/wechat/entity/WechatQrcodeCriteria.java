package com.mmtech.distribution.server.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatQrcodeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int limit;

    private int offset;

    public WechatQrcodeCriteria() {
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

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
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
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNull() {
            addCriterion("action_name_ is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("action_name_ is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("action_name_ =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("action_name_ <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("action_name_ >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("action_name_ >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("action_name_ <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("action_name_ <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("action_name_ like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("action_name_ not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("action_name_ in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("action_name_ not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("action_name_ between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("action_name_ not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionInfoIsNull() {
            addCriterion("action_info_ is null");
            return (Criteria) this;
        }

        public Criteria andActionInfoIsNotNull() {
            addCriterion("action_info_ is not null");
            return (Criteria) this;
        }

        public Criteria andActionInfoEqualTo(String value) {
            addCriterion("action_info_ =", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoNotEqualTo(String value) {
            addCriterion("action_info_ <>", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoGreaterThan(String value) {
            addCriterion("action_info_ >", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("action_info_ >=", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoLessThan(String value) {
            addCriterion("action_info_ <", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoLessThanOrEqualTo(String value) {
            addCriterion("action_info_ <=", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoLike(String value) {
            addCriterion("action_info_ like", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoNotLike(String value) {
            addCriterion("action_info_ not like", value, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoIn(List<String> values) {
            addCriterion("action_info_ in", values, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoNotIn(List<String> values) {
            addCriterion("action_info_ not in", values, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoBetween(String value1, String value2) {
            addCriterion("action_info_ between", value1, value2, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andActionInfoNotBetween(String value1, String value2) {
            addCriterion("action_info_ not between", value1, value2, "actionInfo");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id_ is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("scene_id_ =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("scene_id_ <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("scene_id_ >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_id_ >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("scene_id_ <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("scene_id_ <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("scene_id_ in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("scene_id_ not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("scene_id_ between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_id_ not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneStrIsNull() {
            addCriterion("scene_str_ is null");
            return (Criteria) this;
        }

        public Criteria andSceneStrIsNotNull() {
            addCriterion("scene_str_ is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStrEqualTo(String value) {
            addCriterion("scene_str_ =", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrNotEqualTo(String value) {
            addCriterion("scene_str_ <>", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrGreaterThan(String value) {
            addCriterion("scene_str_ >", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrGreaterThanOrEqualTo(String value) {
            addCriterion("scene_str_ >=", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrLessThan(String value) {
            addCriterion("scene_str_ <", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrLessThanOrEqualTo(String value) {
            addCriterion("scene_str_ <=", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrLike(String value) {
            addCriterion("scene_str_ like", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrNotLike(String value) {
            addCriterion("scene_str_ not like", value, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrIn(List<String> values) {
            addCriterion("scene_str_ in", values, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrNotIn(List<String> values) {
            addCriterion("scene_str_ not in", values, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrBetween(String value1, String value2) {
            addCriterion("scene_str_ between", value1, value2, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andSceneStrNotBetween(String value1, String value2) {
            addCriterion("scene_str_ not between", value1, value2, "sceneStr");
            return (Criteria) this;
        }

        public Criteria andTicketIsNull() {
            addCriterion("ticket_ is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("ticket_ is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(String value) {
            addCriterion("ticket_ =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(String value) {
            addCriterion("ticket_ <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(String value) {
            addCriterion("ticket_ >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_ >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(String value) {
            addCriterion("ticket_ <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(String value) {
            addCriterion("ticket_ <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLike(String value) {
            addCriterion("ticket_ like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotLike(String value) {
            addCriterion("ticket_ not like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<String> values) {
            addCriterion("ticket_ in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<String> values) {
            addCriterion("ticket_ not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(String value1, String value2) {
            addCriterion("ticket_ between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(String value1, String value2) {
            addCriterion("ticket_ not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url_ is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url_ is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url_ =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url_ <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url_ >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url_ >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url_ <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url_ <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url_ like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url_ not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url_ in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url_ not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url_ between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url_ not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id_ is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id_ =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id_ <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id_ >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id_ >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id_ <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id_ <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id_ like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id_ not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id_ in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id_ not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id_ between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id_ not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type_ is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type_ is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type_ =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type_ <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type_ >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type_ >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type_ <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type_ <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type_ like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type_ not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type_ in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type_ not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type_ between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type_ not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataExpressionIsNull() {
            addCriterion("data_expression_ is null");
            return (Criteria) this;
        }

        public Criteria andDataExpressionIsNotNull() {
            addCriterion("data_expression_ is not null");
            return (Criteria) this;
        }

        public Criteria andDataExpressionEqualTo(String value) {
            addCriterion("data_expression_ =", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionNotEqualTo(String value) {
            addCriterion("data_expression_ <>", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionGreaterThan(String value) {
            addCriterion("data_expression_ >", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("data_expression_ >=", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionLessThan(String value) {
            addCriterion("data_expression_ <", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionLessThanOrEqualTo(String value) {
            addCriterion("data_expression_ <=", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionLike(String value) {
            addCriterion("data_expression_ like", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionNotLike(String value) {
            addCriterion("data_expression_ not like", value, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionIn(List<String> values) {
            addCriterion("data_expression_ in", values, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionNotIn(List<String> values) {
            addCriterion("data_expression_ not in", values, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionBetween(String value1, String value2) {
            addCriterion("data_expression_ between", value1, value2, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataExpressionNotBetween(String value1, String value2) {
            addCriterion("data_expression_ not between", value1, value2, "dataExpression");
            return (Criteria) this;
        }

        public Criteria andDataMsgIsNull() {
            addCriterion("data_msg_ is null");
            return (Criteria) this;
        }

        public Criteria andDataMsgIsNotNull() {
            addCriterion("data_msg_ is not null");
            return (Criteria) this;
        }

        public Criteria andDataMsgEqualTo(String value) {
            addCriterion("data_msg_ =", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgNotEqualTo(String value) {
            addCriterion("data_msg_ <>", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgGreaterThan(String value) {
            addCriterion("data_msg_ >", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgGreaterThanOrEqualTo(String value) {
            addCriterion("data_msg_ >=", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgLessThan(String value) {
            addCriterion("data_msg_ <", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgLessThanOrEqualTo(String value) {
            addCriterion("data_msg_ <=", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgLike(String value) {
            addCriterion("data_msg_ like", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgNotLike(String value) {
            addCriterion("data_msg_ not like", value, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgIn(List<String> values) {
            addCriterion("data_msg_ in", values, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgNotIn(List<String> values) {
            addCriterion("data_msg_ not in", values, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgBetween(String value1, String value2) {
            addCriterion("data_msg_ between", value1, value2, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andDataMsgNotBetween(String value1, String value2) {
            addCriterion("data_msg_ not between", value1, value2, "dataMsg");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time_ is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time_ =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time_ <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time_ >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time_ >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time_ <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time_ <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time_ in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time_ not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time_ between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time_ not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("created_user_id_ is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("created_user_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(Long value) {
            addCriterion("created_user_id_ =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(Long value) {
            addCriterion("created_user_id_ <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(Long value) {
            addCriterion("created_user_id_ >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("created_user_id_ >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(Long value) {
            addCriterion("created_user_id_ <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("created_user_id_ <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<Long> values) {
            addCriterion("created_user_id_ in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<Long> values) {
            addCriterion("created_user_id_ not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(Long value1, Long value2) {
            addCriterion("created_user_id_ between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("created_user_id_ not between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time_ is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time_ =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time_ <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time_ >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time_ >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time_ <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time_ <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time_ in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time_ not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time_ between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time_ not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time_ is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time_ =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time_ <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time_ >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time_ >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time_ <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time_ <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time_ in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time_ not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time_ between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time_ not between", value1, value2, "updatedTime");
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