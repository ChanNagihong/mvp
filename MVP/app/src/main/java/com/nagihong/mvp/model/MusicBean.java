package com.nagihong.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by channagihong on 27/06/2017.
 */
@Entity
public class MusicBean extends FileBean{

    @Id
    private Long id;
    private long duration;
    private String singer;
    private String lyricist;
    private String composer;
    private String album;

    @Generated(hash = 656292759)
    public MusicBean(Long id, long duration, String singer, String lyricist,
            String composer, String album) {
        this.id = id;
        this.duration = duration;
        this.singer = singer;
        this.lyricist = lyricist;
        this.composer = composer;
        this.album = album;
    }

    @Generated(hash = 1899243370)
    public MusicBean() {
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
