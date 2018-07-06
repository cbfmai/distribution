package com.mmtech.distribution.server.user.service.impl;

import com.mmtech.common.entity.Pager;
import com.mmtech.common.util.SnowFlake;
import com.mmtech.distribution.server.user.dao.UserMapper;
import com.mmtech.distribution.server.user.entity.User;
import com.mmtech.distribution.server.user.entity.UserCriteria;
import com.mmtech.distribution.server.user.entity.UserCriteria.Criteria;
import com.mmtech.distribution.server.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    private void setCriteria(Criteria criteria, Map<String, Object> params) {
        if (!StringUtils.isEmpty(params.getOrDefault("id", "").toString()))
            criteria.andIdEqualTo(Long.parseLong(params.get("id").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanid", "").toString()))
            criteria.andIdGreaterThan(Long.parseLong(params.get("greaterThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanid", "").toString()))
            criteria.andIdLessThan(Long.parseLong(params.get("lessThanid").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("username", "").toString()))
            criteria.andUsernameEqualTo(params.get("username").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likeusername", "").toString()))
            criteria.andUsernameLike("%" + params.get("likeusername").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("mobile", "").toString()))
            criteria.andMobileEqualTo(params.get("mobile").toString().trim());
        if (!StringUtils.isEmpty(params.getOrDefault("likemobile", "").toString()))
            criteria.andMobileLike("%" + params.get("likemobile").toString().trim() + "%");
        if (!StringUtils.isEmpty(params.getOrDefault("pId", "").toString()))
            criteria.andPIdEqualTo(Long.parseLong(params.get("pId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanpId", "").toString()))
            criteria.andPIdGreaterThan(Long.parseLong(params.get("greaterThanpId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanpId", "").toString()))
            criteria.andPIdLessThan(Long.parseLong(params.get("lessThanpId").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("status", "").toString()))
            criteria.andStatusEqualTo(Integer.parseInt(params.get("status").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanstatus", "").toString()))
            criteria.andStatusGreaterThan(Integer.parseInt(params.get("greaterThanstatus").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanstatus", "").toString()))
            criteria.andStatusLessThan(Integer.parseInt(params.get("lessThanstatus").toString()));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThancreatedTime", "").toString()))
            criteria.andCreatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThancreatedTime", "").toString()))
            criteria.andCreatedTimeLessThan(new Date(Long.parseLong(params.get("lessThancreatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("greaterThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeGreaterThan(new Date(Long.parseLong(params.get("greaterThanupdatedTime").toString())));
        if (!StringUtils.isEmpty(params.getOrDefault("lessThanupdatedTime", "").toString()))
            criteria.andUpdatedTimeLessThan(new Date(Long.parseLong(params.get("lessThanupdatedTime").toString())));
    }

    public User addUser(User record) {
        if (StringUtils.isEmpty(record.getId())) {
            record.setId(SnowFlake.getId());
        }
        record.setCreatedTime(new Date(System.currentTimeMillis()));
        record.setUpdatedTime(new Date(System.currentTimeMillis()));
        if (this.userMapper.insert(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public boolean deleteUser(Long id) {
        return this.userMapper.deleteByPrimaryKey(id) == 1;
    }

    public User modifyUser(User record) {
        if (StringUtils.isEmpty(record.getId())) {
            return this.addUser(record);
        }
        record.setUpdatedTime(new Date());
        if (this.userMapper.updateByPrimaryKeySelective(record) == 1) {
            return record;
        } else {
            return null;
        }
    }

    public User getUser(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> getUsers(Map<String, Object> params) {
        UserCriteria criteria = new UserCriteria();
        Criteria cri = criteria.createCriteria();
        setCriteria(cri, params);
        return this.userMapper.selectByCondition(criteria);
    }

    public Pager<User> getPagerUser(Map<String, Object> params) {
        UserCriteria criteria = new UserCriteria();
        Pager<User> pager = new Pager<User>();
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
        pager.setData(userMapper.selectByCondition(criteria));
        pager.setTotal(userMapper.countByCondition(criteria));
        pager.setTotalPage((int) Math.ceil((double) pager.getTotal() / pager.getSize()));
        return pager;
    }
}