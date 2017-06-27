package com.nagihong.mvp.api.files;

import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.model.FileBean;

import java.util.List;

/**
 * Created by channagihong on 25/06/2017.
 */

public class FilesResultBean extends ApiResultBean<List<FileBean>> {

    private List<FileBean> fileList;

    public List<FileBean> getFileList() {
        return fileList;
    }

    public void setFileList(List<FileBean> fileList) {
        this.fileList = fileList;
    }

    @Override
    protected List<FileBean> toLocalBean() {
        return this.fileList;
    }

}
