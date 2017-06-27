package com.nagihong.mvp.part.login;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.UserBean;

/**
 * Created by channagihong on 22/06/2017.
 */

public interface ILogin {

    interface IView extends IBaseView {

        void onLoginSuccess(UserBean user);

        void onLoginFailed(String msg);

    }

    interface IPresenter extends IBasePresenter {

        void login(String username, String password);

        void loginWithVerificationCode(String name, String password, String code);

    }

}
