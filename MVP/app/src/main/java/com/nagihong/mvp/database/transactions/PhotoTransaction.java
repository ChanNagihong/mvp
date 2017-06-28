package com.nagihong.mvp.database.transactions;

import com.nagihong.mvp.base.transaction.ITransaction;
import com.nagihong.mvp.database.DaoManager;
import com.nagihong.mvp.database.greendao.PhotoBeanDao;
import com.nagihong.mvp.model.PhotoBean;

/**
 * Created by channagihong on 29/06/2017.
 */

public class PhotoTransaction implements ITransaction<PhotoBeanDao> {

    public void update(PhotoBean bean) {
        getDao().update(bean);
    }

    public void delete(PhotoBean bean) {
        getDao().delete(bean);
    }

    public void save(PhotoBean bean) {
        getDao().save(bean);
    }

    public void deleteById(int id) {
        PhotoBean result = getDao().queryBuilder().where(PhotoBeanDao.Properties.Id.eq(id)).build().unique();
        if(null == result) {
            return;
        }
        getDao().delete(result);
    }

    @Override
    public PhotoBeanDao getDao() {
        return DaoManager.getPhotoDao();
    }
}
