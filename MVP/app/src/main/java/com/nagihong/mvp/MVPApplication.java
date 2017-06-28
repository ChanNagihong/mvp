package com.nagihong.mvp;

import android.app.Application;

/**
 * Created by channagihong on 21/06/2017.
 */

public class MVPApplication extends Application {

    private static MVPApplication mInstance;

    public static MVPApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
