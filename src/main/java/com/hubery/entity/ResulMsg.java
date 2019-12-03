package com.hubery.entity;

/**
 * @program hubery
 * @description: 用户信息
 * @author: kgh
 * @create: 2019/08/07 15:08
 *  @param <T>
 */

public class ResulMsg<T> {

    /**错误码*/
    private Integer code;

    /**提示信息 */
    private String msg;

    /**数据内容*/
    private  T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResulMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
