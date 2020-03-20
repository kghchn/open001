package com.hubery.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -4272369295035209697L;
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
    private int userSex;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLoginTime;

    /**
     * 用户状态， -1:删除,01:正常,02:冻结
     */
    private Byte userStatus;

    /**
     * 记录生成的时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 记录最近修改的时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}