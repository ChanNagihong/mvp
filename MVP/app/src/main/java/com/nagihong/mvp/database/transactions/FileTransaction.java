package com.nagihong.mvp.database.transactions;

import com.nagihong.mvp.base.transaction.ITransaction;
import com.nagihong.mvp.database.DaoManager;
import com.nagihong.mvp.database.greendao.FileBeanDao;
import com.nagihong.mvp.model.FileBean;

/**
 * Created by channagihong on 29/06/2017.
 */

public class FileTransaction implements ITransaction<FileBeanDao> {

    public void save(FileBean bean) {
        getDao().save(bean);
    }

    public void update(FileBean bean) {
        getDao().update(bean);
    }

    public void delete(FileBean bean) {
        getDao().delete(bean);
    }

    public void deleteById(int id) {
        FileBean result = getDao().queryBuilder().where(FileBeanDao.Properties.Id.eq(id)).build().unique();
        if(null == result) {
            return;
        }
        getDao().delete(result);
    }

    @Override
    public FileBeanDao getDao() {
        return DaoManager.getFileDao();
    }
}
