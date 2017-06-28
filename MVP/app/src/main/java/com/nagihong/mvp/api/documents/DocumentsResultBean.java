package com.nagihong.mvp.api.documents;

import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.model.DocumentBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by channagihong on 27/06/2017.
 */

public class DocumentsResultBean extends ApiResultBean<List<DocumentBean>> {

    private List<ResultBean> list;

    @Override
    public List<DocumentBean> toLocalBean() {

        List<DocumentBean> resultList = new LinkedList<>();

        for (ResultBean item : this.list) {
            DocumentBean bean = new DocumentBean();
            bean.setFileName(item.documentNmae);
            bean.setExtension(item.documentExtension);
            bean.setCreateTime(item.documentCreateTime);
            bean.setLastModifiedTime(item.documentLastModifiedTime);
            bean.setSize(item.documentSize);
            bean.setFlag(item.documentFlag);
            bean.setSupportPreview(item.documentSupportPreview);
            bean.setSupportShare(item.documentSupportShare);
            bean.setLinkApp(item.documentLinkApp);
            bean.setIconType(item.documentIconType);
            resultList.add(bean);
        }
        return resultList;
    }

    class ResultBean {

        private String documentNmae;
        private String documentExtension;
        private String documentCreateTime;
        private String documentLastModifiedTime;
        private String documentSize;
        private boolean documentFlag;
        private boolean documentSupportPreview;
        private boolean documentSupportShare;
        private String documentLinkApp;
        private int documentIconType;

    }

}
