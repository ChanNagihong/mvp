package com.nagihong.mvp.part.main.photos;

import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.photos.PhotosRequestBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.base.view.BasePresenter;
import com.nagihong.mvp.model.PhotoBean;

import java.util.List;

import okhttp3.Call;

/**
 * Created by channagihong on 6/28/17
 */

public class PhotosPresenter extends BasePresenter<IPhotos.IView> implements IPhotos.IPresenter {

    public PhotosPresenter(IPhotos.IView mView) {
        super(mView);
    }

    @Override
    public void refreshPhotos() {
        PhotosRequestBean request = new PhotosRequestBean();
        request.setPage(0);
        ApiManager.fetchPhotos(request, new ApiCallback<List<PhotoBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onRefreshPhotosFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onRefreshPhotosFailed("onFailure()");
                } else {
                    mView.onRefreshPhotosFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<PhotoBean> result) {
                mView.onRefreshPhotosSuccess(result);
            }
        });
    }

    @Override
    public void fetchMorePhotos(int page) {
        PhotosRequestBean request = new PhotosRequestBean();
        request.setPage(page);
        ApiManager.fetchPhotos(request, new ApiCallback<List<PhotoBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onFetchMorePhotoFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onFetchMorePhotoFailed("onFailure()");
                } else {
                    mView.onFetchMorePhotoFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<PhotoBean> result) {
                mView.onFetchMorePhotosSuccess(result);
            }
        });
    }
}
