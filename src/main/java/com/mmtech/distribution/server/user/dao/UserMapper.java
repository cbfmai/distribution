package com.mmtech.distribution.server.user.dao;

import com.mmtech.distribution.server.user.entity.User;
import com.mmtech.distribution.server.user.entity.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    long countByCondition(UserCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByCondition(UserCriteria example);

    User selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByCondition(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}