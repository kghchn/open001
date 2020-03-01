package com.hubery.sevice.Impl;

import com.hubery.common.annotation.operationlogdetail.OperationLogDetail;
import com.hubery.common.annotation.operationlogdetail.OperationType;
import com.hubery.common.annotation.operationlogdetail.OperationUnit;
import com.hubery.dao.UserMapper;
import com.hubery.entity.User;
import com.hubery.sevice.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional
    public int deleteByPrimaryKey(Long userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    @Transactional
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    /**
     *
     * @param userId
     * @return
     */
    @Override
    /*事务管理*/
    @Transactional
    @OperationLogDetail(detail = "根据用户Id获取用户信息:{{userId}}",targetObjectId="{{userId}}",level = 2,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    public User selectByPrimaryKey(Long userId) {
        /*Integer i = 1/0 ;*/
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     *
     * @param record
     * @return
     */
    @Override
    /*事务管理*/
    @Transactional
    public int updateByPrimaryKeySelective(User record) {
        int i = userMapper.updateByPrimaryKeySelective(record);
        int num = 1 / 0;
        return i;
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

}


