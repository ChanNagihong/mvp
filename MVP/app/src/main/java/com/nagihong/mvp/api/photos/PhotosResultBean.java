package com.nagihong.mvp.api.photos;

import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.model.PhotoBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by channagihong on 27/06/2017.
 */

public class PhotosResultBean extends ApiResultBean<List<PhotoBean>> {

    private List<ResultBean> list;

    @Override
    public List<PhotoBean> toLocalBean() {
        List<PhotoBean> resultList = new LinkedList<>();

        for (ResultBean item : list) {
            PhotoBean bean = new PhotoBean();
            bean.setFileName(item.fileName);
            bean.setExtension(item.extension);
            bean.setCreateTime(item.createTime);
            bean.setLastModifiedTime(item.lastModifiedTime);
            bean.setSize(item.size);
            bean.setFlag(item.flag == 1);
            bean.setLocation(item.location);
            bean.setWidth(Integer.valueOf(item.width));
            bean.setHeight(Integer.valueOf(item.height));
            bean.setDeviceMake(item.deviceMake);
            bean.setDeviceModel(item.deviceModel);
            bean.setColorSpace(item.colorSpace);
            bean.setColorProfile(item.colorProfile);
            bean.setFocalLength(Integer.valueOf(item.focalLength));
            bean.setAlphaChannel(item.alphaChannel == 1);
            bean.setRedEye(item.redEye == 1);
            bean.setfNumber(Float.valueOf(item.fNumber));
            bean.setExposureProgram(Integer.valueOf(item.exposureProgram));
            bean.setExposureTime(item.exposureTime);
            resultList.add(bean);
        }

        return resultList;
    }

    class ResultBean {

        private String fileName;
        private String extension;
        private String createTime;
        private String lastModifiedTime;
        private String size;
        private int flag;
        private String location;
        private String width;
        private String height;
        private String deviceMake;
        private String deviceModel;
        private String colorSpace;
        private String colorProfile;
        private String focalLength;
        private int alphaChannel;
        private int redEye;
        private String fNumber;
        private String exposureProgram;
        private String exposureTime;

    }

}
