package com.mmtech.distribution.server.user.service;

import com.mmtech.common.entity.Pager;
import com.mmtech.distribution.server.user.entity.User;
import java.util.List;
import java.util.Map;

public interface UserService {
    User addUser(User record);

    boolean deleteUser(Long id);

    User modifyUser(User record);

    User getUser(Long id);

    List<User> getUsers(Map<String, Object> params);

    Pager<User> getPagerUser(Map<String, Object> params);
}