package com.hubery.sevice.Impl;

import com.hubery.dao.UserMapper;
import com.hubery.entity.User;
import com.hubery.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery selUserByNameAndPassword
 * @description: 用户 user 业务层
 * @author: kgh
 * @create: 2019/07/22 14:17
 */

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(User user) {
        return userMapper.selUserByNameAndPassword(user);
    }
}
