package com.nagihong.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by channagihong on 26/06/2017.
 */
@Entity
public class DocumentBean extends FileBean {

    @Id
    private Long id;
    private boolean supportPreview;
    private boolean supportShare;
    private String linkApp;
    private int iconType;

    @Generated(hash = 26272931)
    public DocumentBean(Long id, boolean supportPreview, boolean supportShare,
            String linkApp, int iconType) {
        this.id = id;
        this.supportPreview = supportPreview;
        this.supportShare = supportShare;
        this.linkApp = linkApp;
        this.iconType = iconType;
    }

    @Generated(hash = 1348634967)
    public DocumentBean() {
    }

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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getSupportPreview() {
        return this.supportPreview;
    }

    public boolean getSupportShare() {
        return this.supportShare;
    }
}
