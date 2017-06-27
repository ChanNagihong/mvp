package com.nagihong.mvp.api.musics;

import com.nagihong.mvp.api.ApiBuilder;
import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.model.MusicBean;
import com.nagihong.mvp.utils.GsonUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by channagihong on 27/06/2017.
 */

public class ApiMusics {

    public void fetchMusics(MusicsRequestBean bean, final ApiCallback<List<MusicBean>> callback) {

        Request musicsRequest = new ApiBuilder(ApiConstants.API_MUSICS, bean).build();
        ApiManager.getHttpClient().newCall(musicsRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseStr = response.body().string();
                MusicsResultBean resultBean = GsonUtils.convert(responseStr, MusicsResultBean.class);
                if(resultBean.getCode() == 1) {
                    callback.onSuccess(resultBean.toLocalBean());
                } else {
                    callback.onFailure(resultBean);
                }
            }
        });
    }

}
