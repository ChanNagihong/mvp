package com.nagihong.mvp.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nagihong.mvp.model.FileBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FILE_BEAN".
*/
public class FileBeanDao extends AbstractDao<FileBean, Long> {

    public static final String TABLENAME = "FILE_BEAN";

    /**
     * Properties of entity FileBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FileName = new Property(1, String.class, "fileName", false, "FILE_NAME");
        public final static Property Extension = new Property(2, String.class, "extension", false, "EXTENSION");
        public final static Property CreateTime = new Property(3, String.class, "createTime", false, "CREATE_TIME");
        public final static Property LastModifiedTime = new Property(4, String.class, "lastModifiedTime", false, "LAST_MODIFIED_TIME");
        public final static Property Size = new Property(5, String.class, "size", false, "SIZE");
        public final static Property Flag = new Property(6, boolean.class, "flag", false, "FLAG");
    }


    public FileBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FileBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FILE_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"FILE_NAME\" TEXT," + // 1: fileName
                "\"EXTENSION\" TEXT," + // 2: extension
                "\"CREATE_TIME\" TEXT," + // 3: createTime
                "\"LAST_MODIFIED_TIME\" TEXT," + // 4: lastModifiedTime
                "\"SIZE\" TEXT," + // 5: size
                "\"FLAG\" INTEGER NOT NULL );"); // 6: flag
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FILE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FileBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(2, fileName);
        }
 
        String extension = entity.getExtension();
        if (extension != null) {
            stmt.bindString(3, extension);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(4, createTime);
        }
 
        String lastModifiedTime = entity.getLastModifiedTime();
        if (lastModifiedTime != null) {
            stmt.bindString(5, lastModifiedTime);
        }
 
        String size = entity.getSize();
        if (size != null) {
            stmt.bindString(6, size);
        }
        stmt.bindLong(7, entity.getFlag() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FileBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(2, fileName);
        }
 
        String extension = entity.getExtension();
        if (extension != null) {
            stmt.bindString(3, extension);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(4, createTime);
        }
 
        String lastModifiedTime = entity.getLastModifiedTime();
        if (lastModifiedTime != null) {
            stmt.bindString(5, lastModifiedTime);
        }
 
        String size = entity.getSize();
        if (size != null) {
            stmt.bindString(6, size);
        }
        stmt.bindLong(7, entity.getFlag() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FileBean readEntity(Cursor cursor, int offset) {
        FileBean entity = new FileBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // fileName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // extension
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // lastModifiedTime
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // size
            cursor.getShort(offset + 6) != 0 // flag
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FileBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFileName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExtension(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreateTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLastModifiedTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSize(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFlag(cursor.getShort(offset + 6) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FileBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FileBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FileBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
