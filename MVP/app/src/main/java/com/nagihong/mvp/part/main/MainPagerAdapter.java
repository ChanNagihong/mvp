package com.nagihong.mvp.part.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nagihong.mvp.base.view.BaseFragment;
import com.nagihong.mvp.part.main.documents.DocumentsFragment;
import com.nagihong.mvp.part.main.files.FilesFragment;
import com.nagihong.mvp.part.main.musics.MusicsFragment;
import com.nagihong.mvp.part.main.photos.PhotosFragment;

import java.util.HashMap;

/**
 * Created by channagihong on 6/28/17
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private HashMap<Integer, BaseFragment> mMap;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public HashMap<Integer, BaseFragment> getMap() {
        if (null == mMap) {
            mMap = new HashMap();
        }
        return mMap;
    }

    @Override
    public Fragment getItem(int position) {
        BaseFragment fragment = mMap.get(position);
        if (null == fragment) {
            switch (position) {
                case 0:
                    fragment = new FilesFragment();
                    break;
                case 1:
                    fragment = new DocumentsFragment();
                    break;
                case 2:
                    fragment = new PhotosFragment();
                    break;
                case 3:
                    fragment = new MusicsFragment();
                    break;
            }
            mMap.put(position, fragment);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
