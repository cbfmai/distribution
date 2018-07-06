package com.mmtech.distribution.server.wechat.service.impl;

import com.mmtech.common.entity.Pager;
import com.mmtech.common.util.SnowFlake;
import com.mmtech.distribution.server.wechat.dao.WechatUserMapper;
import com.mmtech.distribution.server.wechat.entity.WechatUser;
import com.mmtech.distribution.server.wechat.entity.WechatUserCriteria;
import com.mmtech.distribution.server.wechat.entity.WechatUserCriteria.Criteria;
import com.mmtech.distribution.server.wechat.service.WechatUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WechatUserServiceImpl implements WechatUserService {
    private static final Logger logger = LoggerFactory.getLogger(WechatUserServiceImpl.class);

    @Autowired
    private WechatUserMapper wechatUserMapper;

    private void setCriteria(Criteria criteria, Map<String, Object> params) {
        if (!StringUtils.isEmpty(params.getOrDefault("id", "").toString()))
            criteria.andIdEqualTo(Long.parseLong(params.get("id").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanid", "").toString()))
            criteria.andIdGreaterThan(Long.parseLong(params.get("greaterThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanid", "").toString()))
            criteria.andIdLessThan(Long.parseLong(params.get("lessThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("userId", "").toString()))
            criteria.andUserIdEqualTo(Long.parseLong(params.get("userId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanuserId", "").toString()))
            criteria.andUserIdGreaterThan(Long.parseLong(params.get("greaterThanuserId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanuserId", "").toString()))
            criteria.andUserIdLessThan(Long.parseLong(params.get("lessThanuserId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("openid", "").toString()))
            criteria.andOpenidEqualTo(params.get("openid").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeopenid", "").toString()))
            criteria.andOpenidLike("%" + params.get("likeopenid").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("nickname", "").toString()))
            criteria.andNicknameEqualTo(params.get("nickname").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likenickname", "").toString()))
            criteria.andNicknameLike("%" + params.get("likenickname").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("sexDesc", "").toString()))
            criteria.andSexDescEqualTo(params.get("sexDesc").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likesexDesc", "").toString()))
            criteria.andSexDescLike("%" + params.get("likesexDesc").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("sex", "").toString()))
            criteria.andSexEqualTo(Integer.parseInt(params.get("sex").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThansex", "").toString()))
            criteria.andSexGreaterThan(Integer.parseInt(params.get("greaterThansex").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThansex", "").toString()))
            criteria.andSexLessThan(Integer.parseInt(params.get("lessThansex").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("qrScene", "").toString()))
            criteria.andQrSceneEqualTo(params.get("qrScene").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeqrScene", "").toString()))
            criteria.andQrSceneLike("%" + params.get("likeqrScene").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("qrSceneStr", "").toString()))
            criteria.andQrSceneStrEqualTo(params.get("qrSceneStr").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeqrSceneStr", "").toString()))
            criteria.andQrSceneStrLike("%" + params.get("likeqrSceneStr").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("language", "").toString()))
            criteria.andLanguageEqualTo(params.get("language").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likelanguage", "").toString()))
            criteria.andLanguageLike("%" + params.get("likelanguage").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("city", "").toString()))
            criteria.andCityEqualTo(params.get("city").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likecity", "").toString()))
            criteria.andCityLike("%" + params.get("likecity").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("groupId", "").toString()))
            criteria.andGroupIdEqualTo(Integer.parseInt(params.get("groupId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThangroupId", "").toString()))
            criteria.andGroupIdGreaterThan(Integer.parseInt(params.get("greaterThangroupId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThangroupId", "").toString()))
            criteria.andGroupIdLessThan(Integer.parseInt(params.get("lessThangroupId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("province", "").toString()))
            criteria.andProvinceEqualTo(params.get("province").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeprovince", "").toString()))
            criteria.andProvinceLike("%" + params.get("likeprovince").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("country", "").toString()))
            criteria.andCountryEqualTo(params.get("country").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likecountry", "").toString()))
            criteria.andCountryLike("%" + params.get("likecountry").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("headImgUrl", "").toString()))
            criteria.andHeadImgUrlEqualTo(params.get("headImgUrl").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeheadImgUrl", "").toString()))
            criteria.andHeadImgUrlLike("%" + params.get("likeheadImgUrl").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("appId", "").toString()))
            criteria.andAppIdEqualTo(params.get("appId").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeappId", "").toString()))
            criteria.andAppIdLike("%" + params.get("likeappId").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("remark", "").toString()))
            criteria.andRemarkEqualTo(params.get("remark").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeremark", "").toString()))
            criteria.andRemarkLike("%" + params.get("likeremark").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("unionid", "").toString()))
            criteria.andUnionidEqualTo(params.get("unionid").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeunionid", "").toString()))
            criteria.andUnionidLike("%" + params.get("likeunionid").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("subscribe", "").toString()))
            criteria.andSubscribeEqualTo(params.get("subscribe").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likesubscribe", "").toString()))
            criteria.andSubscribeLike("%" + params.get("likesubscribe").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("subscribeScene", "").toString()))
            criteria.andSubscribeSceneEqualTo(params.get("subscribeScene").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likesubscribeScene", "").toString()))
            criteria.andSubscribeSceneLike("%" + params.get("likesubscribeScene").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThansubscribeTime", "").toString()))
            criteria.andSubscribeTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThansubscribeTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThansubscribeTime", "").toString()))
            criteria.andSubscribeTimeLessThan(new Date(Long.parseLong(params.get("lessThansubscribeTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThancreatedTime", "").toString()))
            criteria.andCreatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThancreatedTime", "").toString()))
            criteria.andCreatedTimeLessThan(new Date(Long.parseLong(params.get("lessThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThanupdatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeLessThan(new Date(Long.parseLong(params.get("lessThanupdatedTime").toString())));
    }

    public WechatUser addWechatUser(WechatUser record) {
        if (StringUtils.isEmpty(record.getId())) {
            record.setId(SnowFlake.getId());
        }
        record.setCreatedTime(new Date(System.currentTimeMillis()));
        record.setUpdatedTime(new Date(System.currentTimeMillis()));
        if (this.wechatUserMapper.insert(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public boolean deleteWechatUser(Long id) {
        return this.wechatUserMapper.deleteByPrimaryKey(id) == 1;
    }

    public WechatUser modifyWechatUser(WechatUser record) {
        if (StringUtils.isEmpty(record.getId())) {
            return this.addWechatUser(record);
        }
        record.setUpdatedTime(new Date());
        if (this.wechatUserMapper.updateByPrimaryKeySelective(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public WechatUser getWechatUser(Long id) {
        return this.wechatUserMapper.selectByPrimaryKey(id);
    }

    public List<WechatUser> getWechatUsers(Map<String, Object> params) {
        WechatUserCriteria criteria = new WechatUserCriteria();
        Criteria cri = criteria.createCriteria();
        setCriteria(cri, params);
        return this.wechatUserMapper.selectByCondition(criteria);
    }

    public Pager<WechatUser> getPagerWechatUser(Map<String, Object> params) {
        WechatUserCriteria criteria = new WechatUserCriteria();
        Pager<WechatUser> pager = new Pager<WechatUser>();
        Criteria cri = criteria.createCriteria();
        if (params.containsKey("offset")) {
            int offset = Integer.parseInt(params.get("offset").toString());
            int limit = Integer.parseInt(params.get("limit").toString());
            pager.setCurrentPage(offset / limit + 1);
        }
        if (params.containsKey("limit")) {
            pager.setSize(Integer.parseInt(params.get("limit").toString()));
        }
        setCriteria(cri, params);
        pager.setData(wechatUserMapper.selectByCondition(criteria));
        pager.setTotal(wechatUserMapper.countByCondition(criteria));
        pager.setTotalPage((int) Math.ceil((double) pager.getTotal() / pager.getSize()));
        return pager;
    }
}