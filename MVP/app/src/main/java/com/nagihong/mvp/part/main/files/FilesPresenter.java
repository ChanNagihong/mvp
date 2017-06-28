package com.nagihong.mvp.part.main.files;

import com.nagihong.mvp.base.view.BasePresenter;

/**
 * Created by channagihong on 6/28/17
 */

public class FilesPresenter extends BasePresenter<IFiles.IView> implements IFiles.IPresenter{

    public FilesPresenter(IFiles.IView mView) {
        super(mView);
    }

    @Override
    public void refreshFiles() {

    }

    @Override
    public void fetchMoreFiles(int page) {

    }
}
