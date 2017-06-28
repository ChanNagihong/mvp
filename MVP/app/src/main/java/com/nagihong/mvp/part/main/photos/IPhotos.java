package com.nagihong.mvp.part.main.photos;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.PhotoBean;

import java.util.List;

/**
 * Created by channagihong on 6/28/17
 */

public class IPhotos {

    interface IView extends IBaseView {

        void onRefreshPhotosSuccess(List<PhotoBean> data);

        void onRefreshPhotosFailed(String msg);

        void onFetchMorePhotosSuccess(List<PhotoBean> data);

        void onFetchMorePhotoFailed(String msg);

    }

    interface IPresenter extends IBasePresenter {

        void refreshPhotos();

        void fetchMorePhotos(int page);

    }

}
