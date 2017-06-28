package com.nagihong.mvp.part.main;

import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.login.LoginRequestBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.base.view.BasePresenter;
import com.nagihong.mvp.database.transactions.UserTransaction;
import com.nagihong.mvp.model.UserBean;

import okhttp3.Call;

/**
 * Created by channagihong on 6/28/17
 */

public class MainPresenter extends BasePresenter<IMain.IView> implements IMain.IPresenter {

    private UserTransaction transaction;

    public MainPresenter(IMain.IView mView) {
        super(mView);
    }

    @Override
    public void autoLogin() {
        UserBean user = getTransaction().get();
        if(null == user) {
            mView.onAutoLoginFailed("no user data in cache");
            return;
        }
        LoginRequestBean request = new LoginRequestBean();
        request.setUsername(user.getUsername());
        request.setPassword(user.getPassword());
        ApiManager.login(request, new ApiCallback<UserBean>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onAutoLoginFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if(null == result) {
                    mView.onAutoLoginFailed("onFailure()");
                } else {
                    mView.onAutoLoginFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(UserBean result) {
                mView.onAutoLoginSuccess(result);
            }
        });
    }

    private UserTransaction getTransaction() {
        if (null == transaction) {
            transaction = new UserTransaction();
        }
        return transaction;
    }

}
