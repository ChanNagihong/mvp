package com.nagihong.mvp.database.transactions;

import com.nagihong.mvp.base.transaction.ITransaction;
import com.nagihong.mvp.database.DaoManager;
import com.nagihong.mvp.database.greendao.MusicBeanDao;
import com.nagihong.mvp.model.MusicBean;

/**
 * Created by channagihong on 29/06/2017.
 */

public class MusicTransaction implements ITransaction<MusicBeanDao> {

    public void save(MusicBean bean) {
        getDao().save(bean);
    }

    public void delete(MusicBean bean) {
        getDao().delete(bean);
    }

    public void update(MusicBean bean) {
        getDao().update(bean);
    }

    public void deleteById(int id) {
        MusicBean result = getDao().queryBuilder().where(MusicBeanDao.Properties.Id.eq(id)).build().unique();
        if(null == result) {
            return;
        }
        getDao().delete(result);
    }

    @Override
    public MusicBeanDao getDao() {
        return DaoManager.getMusicDao();
    }
}
