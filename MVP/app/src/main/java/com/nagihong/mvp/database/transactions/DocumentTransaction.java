package com.nagihong.mvp.database.transactions;

import com.nagihong.mvp.base.transaction.ITransaction;
import com.nagihong.mvp.database.DaoManager;
import com.nagihong.mvp.database.greendao.DocumentBeanDao;
import com.nagihong.mvp.model.DocumentBean;

import org.greenrobot.greendao.AbstractDao;

/**
 * Created by channagihong on 29/06/2017.
 */

public class DocumentTransaction implements ITransaction<DocumentBeanDao> {

    public void save(DocumentBean bean) {
        getDao().save(bean);
    }

    public void update(DocumentBean bean) {
        getDao().update(bean);
    }

    public void delete(DocumentBean bean) {
        getDao().delete(bean);
    }

    public void deleteById(int id) {
        DocumentBean result = getDao().queryBuilder().where(DocumentBeanDao.Properties.Id.eq(id)).build().unique();
        if (null == result) {
            return;
        }
        getDao().delete(result);
    }

    @Override
    public DocumentBeanDao getDao() {
        return DaoManager.getDocumentDao();
    }
}
