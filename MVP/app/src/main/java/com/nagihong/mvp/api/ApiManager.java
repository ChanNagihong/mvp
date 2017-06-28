package com.nagihong.mvp.api;

import com.nagihong.mvp.api.documents.DocumentsRequestBean;
import com.nagihong.mvp.api.documents.DocumentsResultBean;
import com.nagihong.mvp.api.files.FilesRequestBean;
import com.nagihong.mvp.api.files.FilesResultBean;
import com.nagihong.mvp.api.login.LoginRequestBean;
import com.nagihong.mvp.api.login.LoginResultBean;
import com.nagihong.mvp.api.musics.MusicsRequestBean;
import com.nagihong.mvp.api.musics.MusicsResultBean;
import com.nagihong.mvp.api.photos.PhotosRequestBean;
import com.nagihong.mvp.api.photos.PhotosResultBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.constants.Constants;
import com.nagihong.mvp.model.DocumentBean;
import com.nagihong.mvp.model.FileBean;
import com.nagihong.mvp.model.MusicBean;
import com.nagihong.mvp.model.PhotoBean;
import com.nagihong.mvp.model.UserBean;
import com.nagihong.mvp.utils.GsonUtils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by channagihong on 22/06/2017.
 */

public class ApiManager {

    volatile private static OkHttpClient mInstance = null;

    public static OkHttpClient getHttpClient() {
        if (null == mInstance) {
            synchronized (ApiManager.class) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                if (Constants.DEBUG) {
                    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                    builder.addInterceptor(interceptor);
                }
                builder.connectTimeout(30000, TimeUnit.MILLISECONDS);
                builder.readTimeout(30000, TimeUnit.MILLISECONDS);
                builder.writeTimeout(30000, TimeUnit.MILLISECONDS);
                mInstance = builder.build();
            }
        }
        return mInstance;
    }

    private static void post(String api, Object requestBean, final Class resultBeanClass, final ApiCallback callback) {

        Request request = new ApiBuilder(api, requestBean).build();
        getHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseStr = response.body().string();
                ApiResultBean resultBean = GsonUtils.convert(responseStr, resultBeanClass);
                if (resultBean.getCode() == 1) {
                    callback.onSuccess(resultBean.toLocalBean());
                } else {
                    callback.onFailure(resultBean);
                }
            }
        });
    }

    public static void login(LoginRequestBean request, ApiCallback<UserBean> callback) {
        post(ApiConstants.API_LOGIN, request, LoginResultBean.class, callback);
    }

    public static void fetchMusics(MusicsRequestBean request, ApiCallback<List<MusicBean>> callback) {
        post(ApiConstants.API_MUSICS, request, MusicsResultBean.class, callback);
    }

    public static void fetchFiles(FilesRequestBean request, ApiCallback<List<FileBean>> callback) {
        post(ApiConstants.API_FILES, request, FilesResultBean.class, callback);
    }

    public static void fetchPhotos(PhotosRequestBean request, ApiCallback<List<PhotoBean>> callback) {
        post(ApiConstants.API_PHOTOS, request, PhotosResultBean.class, callback);
    }

    public static void fetchDocuments(DocumentsRequestBean request, ApiCallback<List<DocumentBean>> callback) {
        post(ApiConstants.API_DOCUMENTS, request, DocumentsResultBean.class, callback);
    }
}
