package com.nagihong.mvp.base.view;

import android.app.Activity;

/**
 * Created by channagihong on 22/06/2017.
 */

public abstract class BaseActivity<PRESENTER extends IBasePresenter> extends Activity {

    private PRESENTER mPresenter;

    protected abstract PRESENTER initPresenter();

    protected PRESENTER getPresenter() {
        if (null == mPresenter) {
            mPresenter = initPresenter();
        }
        return mPresenter;
    }

}
