package com.hubery.sevice;

import com.hubery.entity.User;

public interface UserService {


    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectUserByUseId(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}


