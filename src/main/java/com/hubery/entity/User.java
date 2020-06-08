package com.hubery.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * user
 */
@ApiModel(value = "com-hubery-entity-User")
@Data
public class User implements Serializable {
    /**
     * 自增主键，系统内的用户ID
     */
    @ApiModelProperty(value = "自增主键，系统内的用户ID")
    private Long userId;

    /**
     * userName
     */
    @ApiModelProperty(value = "userName")
    private String userName;

    /**
     * userPassword
     */
    @ApiModelProperty(value = "userPassword")
    private String userPassword;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    private LocalDateTime userBirthday;

    /**
     * 身份证件类型：1中国大陆身份证，2护照
     */
    @ApiModelProperty(value = "身份证件类型：1中国大陆身份证，2护照")
    private Integer idType;

    /**
     * userIdNo
     */
    @ApiModelProperty(value = "userIdNo")
    private String userIdNo;

    /**
     * userEmail
     */
    @ApiModelProperty(value = "userEmail")
    private String userEmail;

    /**
     * userMobile
     */
    @ApiModelProperty(value = "userMobile")
    private String userMobile;

    /**
     * 地址记录ID
     */
    @ApiModelProperty(value = "地址记录ID")
    private Long addressId;

    /**
     * miniOpenId
     */
    @ApiModelProperty(value = "miniOpenId")
    private String miniOpenId;

    /**
     * miniUnionId
     */
    @ApiModelProperty(value = "miniUnionId")
    private String miniUnionId;

    /**
     * miniNickName
     */
    @ApiModelProperty(value = "miniNickName")
    private String miniNickName;

    /**
     * userProfilePhoto
     */
    @ApiModelProperty(value = "userProfilePhoto")
    private String userProfilePhoto;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime lastLoginTime;

    /**
     * 用户状态， -1:删除,01:正常,02:冻结
     */
    @ApiModelProperty(value = "用户状态， -1:删除,01:正常,02:冻结")
    private Integer userStatus;

    /**
     * 记录生成的时间
     */
    @ApiModelProperty(value = "记录生成的时间")
    private LocalDateTime createTime;

    /**
     * 记录最近修改的时间
     */
    @ApiModelProperty(value = "记录最近修改的时间")
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;
}