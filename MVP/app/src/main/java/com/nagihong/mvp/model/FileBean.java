package com.nagihong.mvp.model;

import android.support.annotation.IntDef;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by channagihong on 25/06/2017.
 */
@Entity
public class FileBean {

    @Id(autoincrement = true)
    private Long id;
    private String fileName;
    private String extension;
    private String createTime;
    private String lastModifiedTime;
    private String size;
    private boolean flag;

    @Generated(hash = 806544187)
    public FileBean(Long id, String fileName, String extension, String createTime,
            String lastModifiedTime, String size, boolean flag) {
        this.id = id;
        this.fileName = fileName;
        this.extension = extension;
        this.createTime = createTime;
        this.lastModifiedTime = lastModifiedTime;
        this.size = size;
        this.flag = flag;
    }

    @Generated(hash = 1910776192)
    public FileBean() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getFlag() {
        return this.flag;
    }
}
