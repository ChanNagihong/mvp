package com.nagihong.mvp.part.main.files;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nagihong.mvp.R;
import com.nagihong.mvp.base.view.BaseFragment;
import com.nagihong.mvp.model.FileBean;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by channagihong on 6/28/17
 */

public class FilesFragment extends BaseFragment<IFiles.IPresenter> implements IFiles.IView {

    private View vRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (null == vRootView) {
            vRootView = inflater.inflate(R.layout.fragment_files, container);
            ButterKnife.bind(this, vRootView);
        }
        return vRootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().refreshFiles();
    }

    @OnClick(R.id.fragment_files_fetchmore)
    public void clickFetchMore() {
        int newPage = getCurrentPage() + 1;
        getPresenter().fetchMoreFiles(newPage);
    }

    @OnClick(R.id.fragment_files_refresh)
    public void clickRefresh() {
        getPresenter().refreshFiles();
    }

    @Override
    protected IFiles.IPresenter initPresenter() {
        return new FilesPresenter(this);
    }

    @Override
    public void onRefreshFilesSuccess(List<FileBean> data) {
        Toast.makeText(getContext(), "onRefreshFilesSuccess()", Toast.LENGTH_SHORT).show();
        resetCurrentPage();
    }

    @Override
    public void onRefreshFilesFailed(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchMoreFilesSuccess(List<FileBean> data) {
        Toast.makeText(getContext(), "onFetchMoreFilesSuccess()", Toast.LENGTH_SHORT).show();
        updateCurrentPage(+1);
    }

    @Override
    public void onFetchMoreFilesFailed(String msg) {
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
