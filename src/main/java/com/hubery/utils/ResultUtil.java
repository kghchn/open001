package com.hubery.utils;

import com.hubery.entity.ResulMsg;

/**
 * @program: hubery
 * @description: 统一的返回信息格式
 * @author: kgh
 * @create: 2019-08-07 15:54
 */
public class ResultUtil {
    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static ResulMsg success(String msgString , Object object){
        ResulMsg resulMsg = new ResulMsg();
        resulMsg.setCode(200);
        resulMsg.setMsg(msgString);
        resulMsg.setData(object);
        return resulMsg;
    }
    public static ResulMsg success(String msgString ){
        return success(msgString,null);
    }

    /**
     * 请求失败
     * @param code
     * @param resultMsg
     * @return
     */
    public static ResulMsg error(Integer code, String resultMsg){
        ResulMsg resulMsg = new ResulMsg();
        resulMsg.setCode(code);
        resulMsg.setMsg(resultMsg);
        resulMsg.setData("失败");
        return resulMsg;
    }

}
