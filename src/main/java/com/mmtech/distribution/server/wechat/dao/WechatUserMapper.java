package com.mmtech.distribution.server.wechat.dao;

import com.mmtech.distribution.server.wechat.entity.WechatUser;
import com.mmtech.distribution.server.wechat.entity.WechatUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface WechatUserMapper {
    long countByCondition(WechatUserCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(WechatUser record);

    int insertSelective(WechatUser record);

    List<WechatUser> selectByCondition(WechatUserCriteria example);

    WechatUser selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") WechatUser record, @Param("example") WechatUserCriteria example);

    int updateByCondition(@Param("record") WechatUser record, @Param("example") WechatUserCriteria example);

    int updateByPrimaryKeySelective(WechatUser record);

    int updateByPrimaryKey(WechatUser record);
}