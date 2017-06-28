package com.nagihong.mvp.part.main.musics;

import com.nagihong.mvp.base.view.IBasePresenter;
import com.nagihong.mvp.base.view.IBaseView;
import com.nagihong.mvp.model.MusicBean;

import java.util.List;

/**
 * Created by channagihong on 6/28/17
 */

public class IMusics {

    interface IView extends IBaseView {

        void onRefreshMusicsSuccess(List<MusicBean> data);

        void onRefreshMusicsFailed(String msg);

        void onFetchMoreMusicsSuccess(List<MusicBean> data);

        void onFetchMoreMusicFailed(String msg);

    }

    interface IPresenter extends IBasePresenter {

        void refreshMusics();

        void fetchMoreMusics(int page);

    }

}
