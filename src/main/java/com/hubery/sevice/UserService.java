package com.hubery.sevice;

import com.hubery.dao.UserMapper;
import com.hubery.entity.User;

public interface UserService {
    User login(User user);
}
