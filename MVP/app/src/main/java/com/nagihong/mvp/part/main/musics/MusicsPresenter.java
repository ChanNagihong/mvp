package com.nagihong.mvp.part.main.musics;

import com.nagihong.mvp.api.ApiManager;
import com.nagihong.mvp.api.musics.MusicsRequestBean;
import com.nagihong.mvp.base.api.ApiCallback;
import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.base.view.BasePresenter;
import com.nagihong.mvp.model.MusicBean;

import java.util.List;

import okhttp3.Call;

/**
 * Created by channagihong on 6/28/17
 */

public class MusicsPresenter extends BasePresenter<IMusics.IView> implements IMusics.IPresenter {

    public MusicsPresenter(IMusics.IView mView) {
        super(mView);
    }

    @Override
    public void refreshMusics() {
        MusicsRequestBean request = new MusicsRequestBean();
        request.setPage(0);
        ApiManager.fetchMusics(request, new ApiCallback<List<MusicBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onRefreshMusicsFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onRefreshMusicsFailed("onFailure()'");
                } else {
                    mView.onRefreshMusicsFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<MusicBean> result) {
                mView.onRefreshMusicsSuccess(result);
            }
        });
    }

    @Override
    public void fetchMoreMusics(int page) {
        MusicsRequestBean request = new MusicsRequestBean();
        request.setPage(page);
        ApiManager.fetchMusics(request, new ApiCallback<List<MusicBean>>() {
            @Override
            public void onError(Call call, Exception e) {
                mView.onFetchMoreMusicFailed("onError()");
            }

            @Override
            public void onFailure(ApiResultBean result) {
                if (null == result) {
                    mView.onFetchMoreMusicFailed("onFailure()");
                } else {
                    mView.onFetchMoreMusicFailed(result.getMsg());
                }
            }

            @Override
            public void onSuccess(List<MusicBean> result) {
                mView.onFetchMoreMusicsSuccess(result);
            }
        });
    }
}
