package com.nagihong.mvp.part.login;

import android.app.Activity;

import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.login.LoginRequestBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.base.view.BasePresenter;
import com.nagihong.mvp.model.UserBean;

import okhttp3.Call;

/**
 * Created by channagihong on 22/06/2017.
 */

public class LoginPresenter extends BasePresenter<ILogin.IView> implements ILogin.IPresenter {

    public LoginPresenter(ILogin.IView mView) {
        super(mView);
    }

    @Override
    public void login(String username, String password) {
        LoginRequestBean request = new LoginRequestBean();
        request.setUsername(username);
        request.setPassword(password);
        ApiManager.login(request, new ApiCallback<UserBean>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onLoginFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onLoginFailed("onFailure()");
                } else {
                    mView.onLoginFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(UserBean result) {
                mView.onLoginSuccess(result);
            }
        });
    }

    @Override
    public void loginWithVerificationCode(String username, String password, String code) {
        LoginRequestBean request = new LoginRequestBean();
        request.setUsername(username);
        request.setPassword(password);
        request.setVerificationCode(code);
        ApiManager.login(request, new ApiCallback<UserBean>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onLoginFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if(null == result) {
                    mView.onLoginFailed("onFailure()");
                } else {
                    mView.onLoginFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(UserBean result) {
                mView.onLoginSuccess(result);
            }
        });
    }
}
