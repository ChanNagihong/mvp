package com.nagihong.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by channagihong on 27/06/2017.
 */
@Entity
public class PhotoBean extends FileBean {

    @Id(autoincrement = true)
    private Long id;
    private String location;
    private int width;
    private int height;
    private String deviceMake;
    private String deviceModel;
    private String colorSpace;
    private String colorProfile;
    private int focalLength;
    private boolean alphaChannel;
    private boolean redEye;
    private float fNumber;
    private int exposureProgram;
    private String exposureTime;

    @Generated(hash = 615300081)
    public PhotoBean(Long id, String location, int width, int height,
            String deviceMake, String deviceModel, String colorSpace,
            String colorProfile, int focalLength, boolean alphaChannel,
            boolean redEye, float fNumber, int exposureProgram,
            String exposureTime) {
        this.id = id;
        this.location = location;
        this.width = width;
        this.height = height;
        this.deviceMake = deviceMake;
        this.deviceModel = deviceModel;
        this.colorSpace = colorSpace;
        this.colorProfile = colorProfile;
        this.focalLength = focalLength;
        this.alphaChannel = alphaChannel;
        this.redEye = redEye;
        this.fNumber = fNumber;
        this.exposureProgram = exposureProgram;
        this.exposureTime = exposureTime;
    }

    @Generated(hash = 487180461)
    public PhotoBean() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDeviceMake() {
        return deviceMake;
    }

    public void setDeviceMake(String deviceMake) {
        this.deviceMake = deviceMake;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getColorSpace() {
        return colorSpace;
    }

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    public String getColorProfile() {
        return colorProfile;
    }

    public void setColorProfile(String colorProfile) {
        this.colorProfile = colorProfile;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    public boolean isAlphaChannel() {
        return alphaChannel;
    }

    public void setAlphaChannel(boolean alphaChannel) {
        this.alphaChannel = alphaChannel;
    }

    public boolean isRedEye() {
        return redEye;
    }

    public void setRedEye(boolean redEye) {
        this.redEye = redEye;
    }

    public float getfNumber() {
        return fNumber;
    }

    public void setfNumber(float fNumber) {
        this.fNumber = fNumber;
    }

    public int getExposureProgram() {
        return exposureProgram;
    }

    public void setExposureProgram(int exposureProgram) {
        this.exposureProgram = exposureProgram;
    }

    public String getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(String exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getAlphaChannel() {
        return this.alphaChannel;
    }

    public boolean getRedEye() {
        return this.redEye;
    }

    public float getFNumber() {
        return this.fNumber;
    }

    public void setFNumber(float fNumber) {
        this.fNumber = fNumber;
    }
}
