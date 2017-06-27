package com.nagihong.mvp.api.documents;

import com.nagihong.mvp.api.ApiBuilder;
import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.constants.ApiConstants;
import com.nagihong.mvp.model.DocumentBean;
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

public class ApiDocuments {

    public void fetchDocuments(DocumentsRequestBean bean, final ApiCallback<List<DocumentBean>> callback) {

        Request documentsRequest = new ApiBuilder(ApiConstants.API_DOCUMENTS, bean).build();
        ApiManager.getHttpClient().newCall(documentsRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseStr = response.body().string();
                DocumentsResultBean resultBean = GsonUtils.convert(responseStr, DocumentsResultBean.class);
                if(resultBean.getCode() == 1) {
                    callback.onSuccess(resultBean.toLocalBean());
                } else {
                    callback.onFailure(resultBean);
                }
            }
        });

    }

}
