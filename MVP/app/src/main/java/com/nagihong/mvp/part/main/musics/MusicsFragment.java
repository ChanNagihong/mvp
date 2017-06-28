package com.nagihong.mvp.part.main.musics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nagihong.mvp.R;
import com.nagihong.mvp.base.view.BaseFragment;
import com.nagihong.mvp.model.MusicBean;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by channagihong on 6/28/17
 */

public class MusicsFragment extends BaseFragment<MusicsPresenter> implements IMusics.IView{

    private View vRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(null == vRootView) {
            vRootView = inflater.inflate(R.layout.fragment_musics, container);
            ButterKnife.bind(this, vRootView);
        }
        return vRootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().refreshMusics();
    }

    @OnClick(R.id.fragment_musics_fetchmore)
    public void clickFetchMore() {
        int newPage = getCurrentPage() + 1;
        getPresenter().fetchMoreMusics(newPage);
    }

    @OnClick(R.id.fragment_musics_refresh)
    public void clickRefresh() {
        getPresenter().refreshMusics();
    }

    @Override
    protected MusicsPresenter initPresenter() {
        return new MusicsPresenter(this);
    }

    @Override
    public void onRefreshMusicsSuccess(List<MusicBean> data) {
        Toast.makeText(getContext(), "onRefreshMusicsSuccess()", Toast.LENGTH_SHORT).show();
        resetCurrentPage();
    }

    @Override
    public void onRefreshMusicsFailed(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchMoreMusicsSuccess(List<MusicBean> data) {
        Toast.makeText(getContext(), "onFetchMoreMusicsSuccess()", Toast.LENGTH_SHORT).show();
        updateCurrentPage(+1);
    }

    @Override
    public void onFetchMoreMusicFailed(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public int getCurrentPage() {
        int current = 0;
        if (null == vRootView || null == vRootView.getTag()) {
            return current;
        }
        current = (int) vRootView.getTag();
        return current;
    }

    public boolean updateCurrentPage(int offset) {
        if (null == vRootView) {
            return false;
        }
        int current = getCurrentPage();
        current += offset;
        vRootView.setTag(offset);
        return true;
    }

    public boolean resetCurrentPage() {
        if (null == vRootView) {
            return false;
        }
        vRootView.setTag(0);
        return true;
    }

}
