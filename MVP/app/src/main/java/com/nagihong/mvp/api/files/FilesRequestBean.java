package com.nagihong.mvp.api.files;

/**
 * Created by channagihong on 25/06/2017.
 */

public class FilesRequestBean {

    private String extension;
    private String filename;
    private int page;
    private int pageCount = 10;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
