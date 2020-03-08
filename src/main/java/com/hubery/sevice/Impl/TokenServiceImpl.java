package com.hubery.sevice.Impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hubery.entity.User;
import com.hubery.sevice.TokenService;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl  implements TokenService {

    @Override
    public String getToken(User user) {
        String token ;
        token= JWT.create().withAudience(user.getUserId().toString())
                .sign(Algorithm.HMAC256(user.getUserPassword()));
        return token;
    }
}
