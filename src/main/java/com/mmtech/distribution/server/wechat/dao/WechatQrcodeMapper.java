package com.mmtech.distribution.server.wechat.dao;

import com.mmtech.distribution.server.wechat.entity.WechatQrcode;
import com.mmtech.distribution.server.wechat.entity.WechatQrcodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface WechatQrcodeMapper {
    long countByCondition(WechatQrcodeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(WechatQrcode record);

    int insertSelective(WechatQrcode record);

    List<WechatQrcode> selectByCondition(WechatQrcodeCriteria example);

    WechatQrcode selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") WechatQrcode record, @Param("example") WechatQrcodeCriteria example);

    int updateByCondition(@Param("record") WechatQrcode record, @Param("example") WechatQrcodeCriteria example);

    int updateByPrimaryKeySelective(WechatQrcode record);

    int updateByPrimaryKey(WechatQrcode record);
}