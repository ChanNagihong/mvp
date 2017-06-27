package com.nagihong.mvp.api.files;

import com.nagihong.mvp.api.ApiBuilder;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.login.LoginRequestBean;
import com.nagihong.mvp.model.FileBean;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.utils.GsonUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by channagihong on 25/06/2017.
 */
public class ApiFiles {

    public void fetchFiles(LoginRequestBean bean, final ApiCallback<List<FileBean>> callback) {

        Request filesRequest = new ApiBuilder(ApiConstants.API_FILES, bean).build();
        ApiManager.getHttpClient().newCall(filesRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseStr = response.body().string();
                FilesResultBean resultBean = GsonUtils.convert(responseStr, FilesRequestBean.class);
                if(resultBean.getCode() == 1) {
                    callback.onSuccess(resultBean.toLocalBean());
                } else {
                    callback.onFailure(resultBean);
                }
            }
        });

    }

}
