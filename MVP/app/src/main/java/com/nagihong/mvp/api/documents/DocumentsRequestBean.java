package com.nagihong.mvp.api.documents;

/**
 * Created by channagihong on 27/06/2017.
 */

public class DocumentsRequestBean {

    private String filename;
    private int page;
    private int pageCount = 10;

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
