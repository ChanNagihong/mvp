package com.nagihong.mvp.utils;

import com.google.gson.Gson;

/**
 * Created by channagihong on 23/06/2017.
 */

public class GsonUtils {

    private static Gson mInstance;

    public static Gson getInstance() {
        if(null == mInstance) {
            mInstance = new Gson();
        }
        return mInstance;
    }

    public static <RESULTBEAN> RESULTBEAN convert(String json, Class clazz) {
        return (RESULTBEAN) getInstance().fromJson(json, clazz);
    }

}
