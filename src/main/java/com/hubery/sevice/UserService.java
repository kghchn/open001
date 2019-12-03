package com.hubery.sevice;

import com.hubery.dao.UserMapper;
import com.hubery.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery selUserByNameAndPassword
 * @description: 用户 user 业务层
 * @author: kgh
 * @create: 2019/07/22 14:17
 */

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(User user) {
        return userMapper.selUserByNameAndPassword(user);
    }
}
