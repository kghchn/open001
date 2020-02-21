package com.hubery.sevice.Impl;

import com.hubery.dao.UserOneMapper;
import com.hubery.entity.UserOne;
import com.hubery.sevice.UserOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program hubery selUserByNameAndPassword
 * @description: 用户 user 业务层
 * @author: kgh
 * @create: 2019/07/22 14:17
 */

@Service
public class UserOneServiceImpl implements UserOneService {
    private final UserOneMapper userOneMapper;

    @Autowired
    public UserOneServiceImpl(UserOneMapper userOneMapper) {
        this.userOneMapper = userOneMapper;
    }

    @Override
    public UserOne login(UserOne user) {
        return userOneMapper.selUserByNameAndPassword(user);
    }
}
