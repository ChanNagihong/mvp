package com.nagihong.mvp.base.transaction;

import org.greenrobot.greendao.AbstractDao;

/**
 * Created by channagihong on 29/06/2017.
 */

public interface ITransaction<DAO> {

    DAO getDao();

}
