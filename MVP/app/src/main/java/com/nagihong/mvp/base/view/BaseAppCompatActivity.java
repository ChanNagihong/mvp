package com.nagihong.mvp.base.view;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by channagihong on 6/28/17
 */

public abstract class BaseAppCompatActivity<PRESENTER extends IBasePresenter> extends AppCompatActivity{

    private PRESENTER mPresenter;

    protected abstract PRESENTER initPresenter();

    protected PRESENTER getPresenter() {
        if (null == mPresenter) {
            mPresenter = initPresenter();
        }
        return mPresenter;
    }

}
