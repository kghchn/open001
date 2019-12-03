package com.hubery.dao;

import com.hubery.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program hubery
 * @description: 用户 user 持久层
 * @author: kgh
 * @create: 2019/07/22 14:18
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户名和密码查询用户信息
     *
     * @param user 用户登录请求参数
     * @return 用户信息User id name
     */
    User selUserByNameAndPassword(User user);

}
