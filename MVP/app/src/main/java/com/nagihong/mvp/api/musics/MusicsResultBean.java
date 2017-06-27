package com.nagihong.mvp.api.musics;

import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.model.MusicBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by channagihong on 27/06/2017.
 */

public class MusicsResultBean extends ApiResultBean<List<MusicBean>> {

    private List<MusicBean> list;

    @Override
    protected List<MusicBean> toLocalBean() {
        return list;
    }

}
