package com.nagihong.mvp.api;

import com.alibaba.fastjson.JSONObject;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.constants.Constants;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by channagihong on 23/06/2017.
 */

public class ApiBuilder {

    private String api;
    private Object requestBean;

    public ApiBuilder(String api, Object requestBean) {
        this.api = api;
        this.requestBean = requestBean;
    }

    public Request build() {
        return new Request.Builder()
                .url(Constants.BASE_URL + ApiConstants.API_LOGIN)
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), JSONObject.toJSONString(requestBean)))
                .addHeader("Content-Type", "text/json; Charset=UTF-8")
                .build();
    }

}
