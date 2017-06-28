package com.nagihong.mvp.base.view;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

/**
 * Created by channagihong on 6/28/17
 */

public abstract class BaseFragment<PRESENTER extends IBasePresenter> extends Fragment {

    private PRESENTER mPresenter;

    protected abstract PRESENTER initPresenter();

    @NonNull
    protected PRESENTER getPresenter() {
        if (null == mPresenter) {
            mPresenter = initPresenter();
        }
        return mPresenter;
    }

}
