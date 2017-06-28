package com.nagihong.mvp.part.main.files;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.FileBean;

import java.util.List;

/**
 * Created by channagihong on 6/28/17
 */

public class IFiles {

    interface IView extends IBaseView {

        void onRefreshFilesSuccess(List<FileBean> data);

        void onRefreshFilesFailed(String msg);

        void onFetchMoreFilesSuccess(List<FileBean> data);

        void onFetchMoreFilesFailed(String msg);

    }

    interface IPresenter extends IBasePresenter {

        void refreshFiles();

        void fetchMoreFiles(int page);

    }

}
