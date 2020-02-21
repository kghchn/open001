package com.hubery.entity;

import lombok.Data;

/**
 * @program hubery
 * @description: 用户信息
 * @author: kgh
 * @create: 2019/05/23 19:08
 */

@Data
public class UserOne {
    private Integer userId;
    private String userName;
    private String password;
}
