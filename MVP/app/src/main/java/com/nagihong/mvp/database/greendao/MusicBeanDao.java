package com.nagihong.mvp.database.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nagihong.mvp.model.MusicBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC_BEAN".
*/
public class MusicBeanDao extends AbstractDao<MusicBean, Long> {

    public static final String TABLENAME = "MUSIC_BEAN";

    /**
     * Properties of entity MusicBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Duration = new Property(1, long.class, "duration", false, "DURATION");
        public final static Property Singer = new Property(2, String.class, "singer", false, "SINGER");
        public final static Property Lyricist = new Property(3, String.class, "lyricist", false, "LYRICIST");
        public final static Property Composer = new Property(4, String.class, "composer", false, "COMPOSER");
        public final static Property Album = new Property(5, String.class, "album", false, "ALBUM");
    }


    public MusicBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MusicBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"DURATION\" INTEGER NOT NULL ," + // 1: duration
                "\"SINGER\" TEXT," + // 2: singer
                "\"LYRICIST\" TEXT," + // 3: lyricist
                "\"COMPOSER\" TEXT," + // 4: composer
                "\"ALBUM\" TEXT);"); // 5: album
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MusicBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getDuration());
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(3, singer);
        }
 
        String lyricist = entity.getLyricist();
        if (lyricist != null) {
            stmt.bindString(4, lyricist);
        }
 
        String composer = entity.getComposer();
        if (composer != null) {
            stmt.bindString(5, composer);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(6, album);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MusicBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getDuration());
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(3, singer);
        }
 
        String lyricist = entity.getLyricist();
        if (lyricist != null) {
            stmt.bindString(4, lyricist);
        }
 
        String composer = entity.getComposer();
        if (composer != null) {
            stmt.bindString(5, composer);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(6, album);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MusicBean readEntity(Cursor cursor, int offset) {
        MusicBean entity = new MusicBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // duration
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // singer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // lyricist
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // composer
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // album
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MusicBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDuration(cursor.getLong(offset + 1));
        entity.setSinger(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLyricist(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setComposer(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAlbum(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MusicBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MusicBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MusicBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}