package com.nagihong.mvp.database.transactions;

import com.nagihong.mvp.base.transaction.ITransaction;
import com.nagihong.mvp.database.DaoManager;
import com.nagihong.mvp.database.greendao.UserBeanDao;
import com.nagihong.mvp.model.UserBean;

import java.util.List;

/**
 * Created by channagihong on 29/06/2017.
 */

public class UserTransaction implements ITransaction<UserBeanDao>{

    public void save(UserBean bean) {
        getDao().save(bean);
    }

    public void clearThenSave(UserBean bean) {
        getDao().deleteAll();
        getDao().save(bean);
    }

    public void clear() {
        getDao().deleteAll();
    }

    public UserBean get() {
        List<UserBean> list = getDao().loadAll();
        if(null == list || list.size() < 1) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public UserBeanDao getDao() {
        return DaoManager.getUserDao();
    }
}
