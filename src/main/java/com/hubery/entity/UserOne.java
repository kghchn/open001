package com.hubery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program hubery
 * @description: 用户信息
 * @author: kgh
 * @create: 2019/05/23 19:08
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOne {
    private Integer userId;
    private String userName;
    private String password;
}
