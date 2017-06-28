package com.nagihong.mvp.database;

import android.database.sqlite.SQLiteDatabase;

import com.nagihong.mvp.MVPApplication;
import com.nagihong.mvp.database.greendao.DaoMaster;
import com.nagihong.mvp.database.greendao.DaoSession;
import com.nagihong.mvp.database.greendao.DocumentBeanDao;
import com.nagihong.mvp.database.greendao.FileBeanDao;
import com.nagihong.mvp.database.greendao.MusicBeanDao;
import com.nagihong.mvp.database.greendao.PhotoBeanDao;
import com.nagihong.mvp.database.greendao.UserBeanDao;

/**
 * Created by channagihong on 29/06/2017.
 */

public class DaoManager {

    private volatile static DaoManager mInstance;

    private final DaoMaster.DevOpenHelper mHelper;
    private final SQLiteDatabase mDb;
    private final DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;

    private DaoManager() {
        mHelper = new DaoMaster.DevOpenHelper(MVPApplication.getInstance(), "mvp.db");
        mDb = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(mDb);
        mDaoSession = mDaoMaster.newSession();
    }

    public static DaoManager getInstance() {
        if (null == mInstance) {
            synchronized (DaoManager.class) {
                if (mInstance == null) {
                    mInstance = new DaoManager();
                }
            }
        }
        return mInstance;
    }

    private static DaoSession getSession() {
        if (null == mDaoSession) {
            mDaoSession = getInstance().mDaoMaster.newSession();
        }
        return mDaoSession;
    }

    public static DocumentBeanDao getDocumentDao() {
        return getSession().getDocumentBeanDao();
    }

    public static MusicBeanDao getMusicDao() {
        return getSession().getMusicBeanDao();
    }

    public static PhotoBeanDao getPhotoDao() {
        return getSession().getPhotoBeanDao();
    }

    public static FileBeanDao getFileDao() {
        return getSession().getFileBeanDao();
    }

    public static UserBeanDao getUserDao() {
        return getSession().getUserBeanDao();
    }

}
