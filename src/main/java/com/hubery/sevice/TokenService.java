package com.hubery.sevice;

import com.hubery.entity.User;

public interface TokenService {
    String getToken(User user);
}
