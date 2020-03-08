package com.hubery.common.annotation.operationlogdetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationLog {
    /**
     * 日志记录Id
     */
    private String id;
    /**
     * 日志记录时间
     */
    private Date createTime;
    /**
     * 日志等级
     */
    private Integer level;
    /**
     * 目标对象Id
     */
    private Long targetObjectId;

    /**
     * 被操作的对象
     */
    private String operationUnit;
    /**
     * 方法名
     */
    private String method;
    /**
     * 参数
     */
    private String args;
    /**
     * 操作人id
     */
    private String userId;
    /**
     * 操作人
     */
    private String userName;
    /**
     * 日志描述
     */
    private String describe;
    /**
     * 操作类型
     */
    private String operationType;
    /**
     * 方法运行时间 毫秒
     */
    private Long runTime;
    /**
     * 方法返回值
     */
    private String returnValue;

}
