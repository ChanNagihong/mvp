package com.nagihong.mvp.part.main.documents;

import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.documents.DocumentsRequestBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.base.view.BasePresenter;
import com.nagihong.mvp.model.DocumentBean;

import java.util.List;

import okhttp3.Call;

/**
 * Created by channagihong on 6/28/17
 */

public class DocumentsPresenter extends BasePresenter<IDocuments.IView> implements IDocuments.IPresenter {

    public DocumentsPresenter(IDocuments.IView mView) {
        super(mView);
    }

    @Override
    public void refreshDocuments() {
        DocumentsRequestBean request = new DocumentsRequestBean();
        request.setPage(0);
        ApiManager.fetchDocuments(request, new ApiCallback<List<DocumentBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onRefreshDocumentsFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onRefreshDocumentsFailed("onFailure()");
                } else {
                    mView.onRefreshDocumentsFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<DocumentBean> result) {
                mView.onRefreshDocumentsSuccess(result);
            }
        });
    }

    @Override
    public void fetchMoreDocuments(int page) {
        DocumentsRequestBean request = new DocumentsRequestBean();
        request.setPage(page);
        ApiManager.fetchDocuments(request, new ApiCallback<List<DocumentBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onFetchMoreDocumentsFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onFetchMoreDocumentsFailed("onFailure()");
                } else {
                    mView.onFetchMoreDocumentsFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<DocumentBean> result) {
                mView.onFetchMoreDocumentsSuccess(result);
            }
        });
    }
}
