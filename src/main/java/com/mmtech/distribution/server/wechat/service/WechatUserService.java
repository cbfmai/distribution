package com.mmtech.distribution.server.wechat.service;

import com.mmtech.common.entity.Pager;
import com.mmtech.distribution.server.wechat.entity.WechatUser;
import java.util.List;
import java.util.Map;

public interface WechatUserService {
    WechatUser addWechatUser(WechatUser record);

    boolean deleteWechatUser(Long id);

    WechatUser modifyWechatUser(WechatUser record);

    WechatUser getWechatUser(Long id);

    List<WechatUser> getWechatUsers(Map<String, Object> params);

    Pager<WechatUser> getPagerWechatUser(Map<String, Object> params);
}