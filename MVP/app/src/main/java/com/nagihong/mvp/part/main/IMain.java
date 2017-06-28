package com.nagihong.mvp.part.main;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.UserBean;

/**
 * Created by channagihong on 6/28/17
 */

public class IMain {

    interface IView extends IBaseView {

        void onAutoLoginSuccess(UserBean user);

        void onAutoLoginFailed(String msg);

    }

    interface IPresenter extends IBasePresenter {

        void autoLogin();

    }

}
