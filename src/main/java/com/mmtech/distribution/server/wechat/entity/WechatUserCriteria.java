package com.mmtech.distribution.server.wechat.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int limit;

    private int offset;

    public WechatUserCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id_ is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id_ =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id_ <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id_ >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id_ >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id_ <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id_ <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id_ in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id_ not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id_ between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id_ not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid_ is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid_ is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid_ =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid_ <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid_ >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid_ >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid_ <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid_ <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid_ like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid_ not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid_ in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid_ not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid_ between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid_ not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname_ is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname_ is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname_ =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname_ <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname_ >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname_ >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname_ <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname_ <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname_ like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname_ not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname_ in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname_ not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname_ between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname_ not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNull() {
            addCriterion("sex_desc_ is null");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNotNull() {
            addCriterion("sex_desc_ is not null");
            return (Criteria) this;
        }

        public Criteria andSexDescEqualTo(String value) {
            addCriterion("sex_desc_ =", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotEqualTo(String value) {
            addCriterion("sex_desc_ <>", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThan(String value) {
            addCriterion("sex_desc_ >", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThanOrEqualTo(String value) {
            addCriterion("sex_desc_ >=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThan(String value) {
            addCriterion("sex_desc_ <", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThanOrEqualTo(String value) {
            addCriterion("sex_desc_ <=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLike(String value) {
            addCriterion("sex_desc_ like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotLike(String value) {
            addCriterion("sex_desc_ not like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescIn(List<String> values) {
            addCriterion("sex_desc_ in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotIn(List<String> values) {
            addCriterion("sex_desc_ not in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescBetween(String value1, String value2) {
            addCriterion("sex_desc_ between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotBetween(String value1, String value2) {
            addCriterion("sex_desc_ not between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex_ is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex_ is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex_ =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex_ <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex_ >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex_ >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex_ <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex_ <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex_ in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex_ not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex_ between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex_ not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNull() {
            addCriterion("qr_scene_ is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNotNull() {
            addCriterion("qr_scene_ is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneEqualTo(String value) {
            addCriterion("qr_scene_ =", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotEqualTo(String value) {
            addCriterion("qr_scene_ <>", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThan(String value) {
            addCriterion("qr_scene_ >", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene_ >=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThan(String value) {
            addCriterion("qr_scene_ <", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThanOrEqualTo(String value) {
            addCriterion("qr_scene_ <=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLike(String value) {
            addCriterion("qr_scene_ like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotLike(String value) {
            addCriterion("qr_scene_ not like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneIn(List<String> values) {
            addCriterion("qr_scene_ in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotIn(List<String> values) {
            addCriterion("qr_scene_ not in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneBetween(String value1, String value2) {
            addCriterion("qr_scene_ between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotBetween(String value1, String value2) {
            addCriterion("qr_scene_ not between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNull() {
            addCriterion("qr_scene_str_ is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNotNull() {
            addCriterion("qr_scene_str_ is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrEqualTo(String value) {
            addCriterion("qr_scene_str_ =", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotEqualTo(String value) {
            addCriterion("qr_scene_str_ <>", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThan(String value) {
            addCriterion("qr_scene_str_ >", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene_str_ >=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThan(String value) {
            addCriterion("qr_scene_str_ <", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThanOrEqualTo(String value) {
            addCriterion("qr_scene_str_ <=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLike(String value) {
            addCriterion("qr_scene_str_ like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotLike(String value) {
            addCriterion("qr_scene_str_ not like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIn(List<String> values) {
            addCriterion("qr_scene_str_ in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotIn(List<String> values) {
            addCriterion("qr_scene_str_ not in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrBetween(String value1, String value2) {
            addCriterion("qr_scene_str_ between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotBetween(String value1, String value2) {
            addCriterion("qr_scene_str_ not between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language_ is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language_ is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language_ =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language_ <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language_ >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language_ >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language_ <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language_ <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language_ like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language_ not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language_ in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language_ not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language_ between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language_ not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city_ is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city_ is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city_ =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city_ <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city_ >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city_ >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city_ <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city_ <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city_ like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city_ not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city_ in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city_ not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city_ between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city_ not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id_ is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id_ =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id_ <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id_ >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id_ >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id_ <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id_ <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id_ in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id_ not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id_ between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id_ not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province_ is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province_ is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province_ =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province_ <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province_ >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province_ >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province_ <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province_ <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province_ like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province_ not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province_ in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province_ not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province_ between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province_ not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country_ is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country_ is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country_ =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country_ <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country_ >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country_ >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country_ <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country_ <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country_ like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country_ not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country_ in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country_ not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country_ between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country_ not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNull() {
            addCriterion("head_img_url_ is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNotNull() {
            addCriterion("head_img_url_ is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlEqualTo(String value) {
            addCriterion("head_img_url_ =", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotEqualTo(String value) {
            addCriterion("head_img_url_ <>", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThan(String value) {
            addCriterion("head_img_url_ >", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_url_ >=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThan(String value) {
            addCriterion("head_img_url_ <", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("head_img_url_ <=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLike(String value) {
            addCriterion("head_img_url_ like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotLike(String value) {
            addCriterion("head_img_url_ not like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIn(List<String> values) {
            addCriterion("head_img_url_ in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotIn(List<String> values) {
            addCriterion("head_img_url_ not in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlBetween(String value1, String value2) {
            addCriterion("head_img_url_ between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("head_img_url_ not between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id_ is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id_ =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id_ <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id_ >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id_ >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id_ <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id_ <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id_ like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id_ not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id_ in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id_ not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id_ between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id_ not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark_ is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark_ is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark_ =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark_ <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark_ >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark_ >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark_ <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark_ <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark_ like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark_ not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark_ in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark_ not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark_ between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark_ not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid_ is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid_ is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid_ =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid_ <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid_ >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid_ >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid_ <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid_ <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid_ like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid_ not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid_ in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid_ not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid_ between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid_ not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNull() {
            addCriterion("subscribe_ is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNotNull() {
            addCriterion("subscribe_ is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEqualTo(String value) {
            addCriterion("subscribe_ =", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotEqualTo(String value) {
            addCriterion("subscribe_ <>", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThan(String value) {
            addCriterion("subscribe_ >", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_ >=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThan(String value) {
            addCriterion("subscribe_ <", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThanOrEqualTo(String value) {
            addCriterion("subscribe_ <=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLike(String value) {
            addCriterion("subscribe_ like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotLike(String value) {
            addCriterion("subscribe_ not like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeIn(List<String> values) {
            addCriterion("subscribe_ in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotIn(List<String> values) {
            addCriterion("subscribe_ not in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeBetween(String value1, String value2) {
            addCriterion("subscribe_ between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotBetween(String value1, String value2) {
            addCriterion("subscribe_ not between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNull() {
            addCriterion("subscribe_scene_ is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNotNull() {
            addCriterion("subscribe_scene_ is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneEqualTo(String value) {
            addCriterion("subscribe_scene_ =", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotEqualTo(String value) {
            addCriterion("subscribe_scene_ <>", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThan(String value) {
            addCriterion("subscribe_scene_ >", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_scene_ >=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThan(String value) {
            addCriterion("subscribe_scene_ <", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThanOrEqualTo(String value) {
            addCriterion("subscribe_scene_ <=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLike(String value) {
            addCriterion("subscribe_scene_ like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotLike(String value) {
            addCriterion("subscribe_scene_ not like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIn(List<String> values) {
            addCriterion("subscribe_scene_ in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotIn(List<String> values) {
            addCriterion("subscribe_scene_ not in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneBetween(String value1, String value2) {
            addCriterion("subscribe_scene_ between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotBetween(String value1, String value2) {
            addCriterion("subscribe_scene_ not between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNull() {
            addCriterion("subscribe_time_ is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNotNull() {
            addCriterion("subscribe_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeEqualTo(Date value) {
            addCriterion("subscribe_time_ =", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotEqualTo(Date value) {
            addCriterion("subscribe_time_ <>", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThan(Date value) {
            addCriterion("subscribe_time_ >", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("subscribe_time_ >=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThan(Date value) {
            addCriterion("subscribe_time_ <", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThanOrEqualTo(Date value) {
            addCriterion("subscribe_time_ <=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIn(List<Date> values) {
            addCriterion("subscribe_time_ in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotIn(List<Date> values) {
            addCriterion("subscribe_time_ not in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeBetween(Date value1, Date value2) {
            addCriterion("subscribe_time_ between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotBetween(Date value1, Date value2) {
            addCriterion("subscribe_time_ not between", value1, value2, "subscribeTime");
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