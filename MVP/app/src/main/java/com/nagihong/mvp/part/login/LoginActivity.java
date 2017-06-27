package com.nagihong.mvp.part.login;

import com.nagihong.mvp.base.view.AncestorActivity;

/**
 * Created by channagihong on 22/06/2017.
 */

public class LoginActivity extends AncestorActivity<ILogin.IPresenter> implements ILogin.IView{

    @Override
    public void onLoginSuccess(UserBean user) {

    }

    @Override
    public void onLoginFailed(String msg) {

    }

    @Override
    protected ILogin.IPresenter getPresenter() {
        return null;
    }
}
