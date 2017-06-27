package com.nagihong.mvp.base.api;

/**
 * Created by channagihong on 22/06/2017.
 */

public abstract class ApiResultBean<DATA> {

    private int code;
    private String msg;
    private String token;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public abstract DATA toLocalBean();

}
