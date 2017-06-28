package com.nagihong.mvp.base.view;

/**
 * Created by channagihong on 6/28/17
 */

public class BasePresenter<IView> {

    protected IView mView;

    public BasePresenter(IView mView) {
        this.mView = mView;
    }
}
