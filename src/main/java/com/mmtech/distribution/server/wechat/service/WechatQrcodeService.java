package com.mmtech.distribution.server.wechat.service;

import com.mmtech.common.entity.Pager;
import com.mmtech.distribution.server.wechat.entity.WechatQrcode;
import java.util.List;
import java.util.Map;

public interface WechatQrcodeService {
    WechatQrcode addWechatQrcode(WechatQrcode record);

    boolean deleteWechatQrcode(Long id);

    WechatQrcode modifyWechatQrcode(WechatQrcode record);

    WechatQrcode getWechatQrcode(Long id);

    List<WechatQrcode> getWechatQrcodes(Map<String, Object> params);

    Pager<WechatQrcode> getPagerWechatQrcode(Map<String, Object> params);
}