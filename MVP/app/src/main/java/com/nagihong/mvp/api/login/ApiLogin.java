package com.nagihong.mvp.api.login;

import com.nagihong.mvp.api.ApiBuilder;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.model.UserBean;
import com.nagihong.mvp.utils.GsonUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by channagihong on 23/06/2017.
 */

public class ApiLogin {

    public void login(final LoginRequestBean bean, final ApiCallback<UserBean> callback) {

        Request login = new ApiBuilder(ApiConstants.API_LOGIN, bean).build();
        ApiManager.getHttpClient().newCall(login).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseStr = response.body().string();
                LoginResultBean resultBean = GsonUtils.convert(responseStr, LoginResultBean.class);
                resultBean.setRequestBean(bean);
                if(resultBean.getCode() == 1) {
                    callback.onSuccess(resultBean.toLocalBean());
                } else {
                    callback.onFailure(resultBean);
                }
            }
        });

    }

}
