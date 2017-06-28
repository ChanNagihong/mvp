package com.nagihong.mvp.part.main.documents;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.DocumentBean;

import java.util.List;

/**
 * Created by channagihong on 6/28/17
 */

public class IDocuments {

    interface IView extends IBaseView {

        void onRefreshDocumentsSuccess(List<DocumentBean> data);

        void onRefreshDocumentsFailed(String msg);

        void onFetchMoreDocumentsSuccess(List<DocumentBean> data);

        void onFetchMoreDocumentsFailed(String msg);
    }

    interface IPresenter extends IBasePresenter {

        void refreshDocuments();

        void fetchMoreDocuments(int page);

    }

}
