package com.hubery.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    /**
     * 自增主键，系统内的用户ID
     */
    private Long userId;

    private String userName;

    private String userPassword;

    /**
     * 生日
     */
    private Date userBirthday;

    /**
     * 性别:0-保密,1-男,2-女
     */
    private Boolean userSex;

    /**
     * 身份证件类型：1中国大陆身份证，2护照
     */
    private Byte idType;

    private String userIdNo;

    private String userEmail;

    private String userMobile;

    /**
     * 地址记录ID
     */
    private Long addressId;

    private String miniOpenId;

    private String miniUnionId;

    private String miniNickName;

    private String userProfilePhoto;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 用户状态， -1:删除,01:正常,02:冻结
     */
    private Byte userStatus;

    /**
     * 记录生成的时间
     */
    private Date createTime;

    /**
     * 记录最近修改的时间
     */
    private Date updateTime;
}