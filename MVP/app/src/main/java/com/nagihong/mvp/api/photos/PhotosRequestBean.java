package com.nagihong.mvp.api.photos;

/**
 * Created by channagihong on 27/06/2017.
 */

public class PhotosRequestBean {

    private String filename;
    private String extension;
    private int page;
    private int pageCount = 10;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
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
