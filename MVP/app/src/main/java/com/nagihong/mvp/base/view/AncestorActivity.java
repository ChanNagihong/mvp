package com.nagihong.mvp.base.view;

import android.app.Activity;

/**
 * Created by channagihong on 22/06/2017.
 */

public abstract class AncestorActivity<PRESENTER extends IBasePresenter> extends Activity {

    private PRESENTER mPresenter;

    protected abstract PRESENTER getPresenter();

}
