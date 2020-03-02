package com.hubery.common.swagger;

import java.io.Serializable;

/**
 * 统一返回参数
 */
public class ResultMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String msg;

    private Object data;

    public ResultMessage() {}

    public ResultMessage(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultMessage success() {
        ResultMessage result = new ResultMessage();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static ResultMessage success(Object data) {
        ResultMessage result = new ResultMessage();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static ResultMessage success(ResultCode resultCode, String msg,Object data) {
        ResultMessage result = new ResultMessage();
        result.setResultCode(resultCode);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static ResultMessage failure(ResultCode resultCode) {
        ResultMessage result = new ResultMessage();
        result.setResultCode(resultCode);
        return result;
    }

    public static ResultMessage failure(ResultCode resultCode, Object data) {
        ResultMessage result = new ResultMessage();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    public static ResultMessage failure(int resultCode, String msg) {
        ResultMessage result = new ResultMessage();
        result.setCode(resultCode);
        result.setMsg(msg);
        return result;
    }

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
