package com.nagihong.mvp.model;

/**
 * Created by channagihong on 26/06/2017.
 */

public class DocumentBean extends FileBean {

    private boolean supportPreview;
    private boolean supportShare;
    private String linkApp;
    private int iconType;

    public boolean isSupportPreview() {
        return supportPreview;
    }

    public void setSupportPreview(boolean supportPreview) {
        this.supportPreview = supportPreview;
    }

    public boolean isSupportShare() {
        return supportShare;
    }

    public void setSupportShare(boolean supportShare) {
        this.supportShare = supportShare;
    }

    public String getLinkApp() {
        return linkApp;
    }

    public void setLinkApp(String linkApp) {
        this.linkApp = linkApp;
    }

    public int getIconType() {
        return iconType;
    }

    public void setIconType(int iconType) {
        this.iconType = iconType;
    }
}
