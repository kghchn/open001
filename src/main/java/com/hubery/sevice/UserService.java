package com.hubery.sevice;

import com.hubery.dao.UserMapper;
import com.hubery.entity.User;

public interface UserService {

    void  UserServiceImpl(UserMapper userMapper) ;
    User login(User user);
}
