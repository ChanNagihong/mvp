package com.nagihong.mvp.base.api;

import com.nagihong.mvp.base.api.ApiResultBean;

import okhttp3.Call;

/**
 * Created by channagihong on 22/06/2017.
 */

public abstract class ApiCallback<RESULTBEAN> {

    abstract public void onError(Call call, Exception e);

    abstract public void onFailure(ApiResultBean result);

    abstract public void onSuccess(RESULTBEAN result);

}
