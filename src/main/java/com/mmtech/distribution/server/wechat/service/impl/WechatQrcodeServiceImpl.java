package com.mmtech.distribution.server.wechat.service.impl;

import com.mmtech.common.entity.Pager;
import com.mmtech.common.util.SnowFlake;
import com.mmtech.distribution.server.wechat.dao.WechatQrcodeMapper;
import com.mmtech.distribution.server.wechat.entity.WechatQrcode;
import com.mmtech.distribution.server.wechat.entity.WechatQrcodeCriteria;
import com.mmtech.distribution.server.wechat.entity.WechatQrcodeCriteria.Criteria;
import com.mmtech.distribution.server.wechat.service.WechatQrcodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WechatQrcodeServiceImpl implements WechatQrcodeService {
    private static final Logger logger = LoggerFactory.getLogger(WechatQrcodeServiceImpl.class);

    @Autowired
    private WechatQrcodeMapper wechatQrcodeMapper;

    private void setCriteria(Criteria criteria, Map<String, Object> params) {
        if (!StringUtils.isEmpty(params.getOrDefault("id", "").toString()))
            criteria.andIdEqualTo(Long.parseLong(params.get("id").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanid", "").toString()))
            criteria.andIdGreaterThan(Long.parseLong(params.get("greaterThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanid", "").toString()))
            criteria.andIdLessThan(Long.parseLong(params.get("lessThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("actionName", "").toString()))
            criteria.andActionNameEqualTo(params.get("actionName").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeactionName", "").toString()))
            criteria.andActionNameLike("%" + params.get("likeactionName").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("actionInfo", "").toString()))
            criteria.andActionInfoEqualTo(params.get("actionInfo").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeactionInfo", "").toString()))
            criteria.andActionInfoLike("%" + params.get("likeactionInfo").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("sceneId", "").toString()))
            criteria.andSceneIdEqualTo(Integer.parseInt(params.get("sceneId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThansceneId", "").toString()))
            criteria.andSceneIdGreaterThan(Integer.parseInt(params.get("greaterThansceneId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThansceneId", "").toString()))
            criteria.andSceneIdLessThan(Integer.parseInt(params.get("lessThansceneId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("sceneStr", "").toString()))
            criteria.andSceneStrEqualTo(params.get("sceneStr").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likesceneStr", "").toString()))
            criteria.andSceneStrLike("%" + params.get("likesceneStr").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("ticket", "").toString()))
            criteria.andTicketEqualTo(params.get("ticket").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("liketicket", "").toString()))
            criteria.andTicketLike("%" + params.get("liketicket").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("url", "").toString()))
            criteria.andUrlEqualTo(params.get("url").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeurl", "").toString()))
            criteria.andUrlLike("%" + params.get("likeurl").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("dataId", "").toString()))
            criteria.andDataIdEqualTo(params.get("dataId").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likedataId", "").toString()))
            criteria.andDataIdLike("%" + params.get("likedataId").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("dataType", "").toString()))
            criteria.andDataTypeEqualTo(params.get("dataType").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likedataType", "").toString()))
            criteria.andDataTypeLike("%" + params.get("likedataType").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("dataExpression", "").toString()))
            criteria.andDataExpressionEqualTo(params.get("dataExpression").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likedataExpression", "").toString()))
            criteria.andDataExpressionLike("%" + params.get("likedataExpression").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("dataMsg", "").toString()))
            criteria.andDataMsgEqualTo(params.get("dataMsg").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likedataMsg", "").toString()))
            criteria.andDataMsgLike("%" + params.get("likedataMsg").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanexpireTime", "").toString()))
            criteria.andExpireTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThanexpireTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanexpireTime", "").toString()))
            criteria.andExpireTimeLessThan(new Date(Long.parseLong(params.get("lessThanexpireTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("createdUserId", "").toString()))
            criteria.andCreatedUserIdEqualTo(Long.parseLong(params.get("createdUserId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThancreatedUserId", "").toString()))
            criteria.andCreatedUserIdGreaterThan(Long.parseLong(params.get("greaterThancreatedUserId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThancreatedUserId", "").toString()))
            criteria.andCreatedUserIdLessThan(Long.parseLong(params.get("lessThancreatedUserId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThancreatedTime", "").toString()))
            criteria.andCreatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThancreatedTime", "").toString()))
            criteria.andCreatedTimeLessThan(new Date(Long.parseLong(params.get("lessThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThanupdatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeLessThan(new Date(Long.parseLong(params.get("lessThanupdatedTime").toString())));
    }

    public WechatQrcode addWechatQrcode(WechatQrcode record) {
        if (StringUtils.isEmpty(record.getId())) {
            record.setId(SnowFlake.getId());
        }
        record.setCreatedTime(new Date(System.currentTimeMillis()));
        record.setUpdatedTime(new Date(System.currentTimeMillis()));
        if (this.wechatQrcodeMapper.insert(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public boolean deleteWechatQrcode(Long id) {
        return this.wechatQrcodeMapper.deleteByPrimaryKey(id) == 1;
    }

    public WechatQrcode modifyWechatQrcode(WechatQrcode record) {
        if (StringUtils.isEmpty(record.getId())) {
            return this.addWechatQrcode(record);
        }
        record.setUpdatedTime(new Date());
        if (this.wechatQrcodeMapper.updateByPrimaryKeySelective(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public WechatQrcode getWechatQrcode(Long id) {
        return this.wechatQrcodeMapper.selectByPrimaryKey(id);
    }

    public List<WechatQrcode> getWechatQrcodes(Map<String, Object> params) {
        WechatQrcodeCriteria criteria = new WechatQrcodeCriteria();
        Criteria cri = criteria.createCriteria();
        setCriteria(cri, params);
        return this.wechatQrcodeMapper.selectByCondition(criteria);
    }

    public Pager<WechatQrcode> getPagerWechatQrcode(Map<String, Object> params) {
        WechatQrcodeCriteria criteria = new WechatQrcodeCriteria();
        Pager<WechatQrcode> pager = new Pager<WechatQrcode>();
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
        pager.setData(wechatQrcodeMapper.selectByCondition(criteria));
        pager.setTotal(wechatQrcodeMapper.countByCondition(criteria));
        pager.setTotalPage((int) Math.ceil((double) pager.getTotal() / pager.getSize()));
        return pager;
    }
}