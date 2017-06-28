package com.nagihong.mvp.part.main;

import com.nagihong.mvp.api.login.LoginRequestBean;
import com.nagihong.mvp.base.view.BasePresenter;

/**
 * Created by channagihong on 6/28/17
 */

public class MainPresenter extends BasePresenter<IMain.IView> implements IMain.IPresenter {

    public MainPresenter(IMain.IView mView) {
        super(mView);
    }

    @Override
    public void autoLogin() {
        LoginRequestBean request = new LoginRequestBean();

    }
}
