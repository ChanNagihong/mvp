package com.nagihong.mvp.part.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.nagihong.mvp.R;
import com.nagihong.mvp.base.view.BaseAppCompatActivity;
import com.nagihong.mvp.model.UserBean;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by channagihong on 6/28/17
 */

public class MainActivity extends BaseAppCompatActivity<MainPresenter> implements IMain.IView {

    @BindView(R.id.activity_main_viewpager)
    ViewPager vViewPager;

    private PagerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mAdapter = new MainPagerAdapter(getSupportFragmentManager());
        vViewPager.setAdapter(mAdapter);
    }

    @Override
    public void onAutoLoginSuccess(UserBean user) {

    }

    @Override
    public void onAutoLoginFailed(String msg) {

    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }
}
