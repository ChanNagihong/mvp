package com.nagihong.mvp.model;

/**
 * Created by channagihong on 27/06/2017.
 */

public class PhotoBean extends FileBean {

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
}
