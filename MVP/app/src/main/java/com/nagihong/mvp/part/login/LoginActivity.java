package com.nagihong.mvp.part.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

import com.nagihong.mvp.R;
import com.nagihong.mvp.base.view.BaseActivity;
import com.nagihong.mvp.model.UserBean;
import com.nagihong.mvp.part.main.MainActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by channagihong on 22/06/2017.
 */

public class LoginActivity extends BaseActivity<LoginPresenter> implements ILogin.IView {

    @BindView(R.id.activity_login_login)
    Button vLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @OnClick(R.id.activity_login_login)
    public void clickLogin() {
        getPresenter().login("username", "password");
    }

    @Override
    public void onLoginSuccess(UserBean user) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginFailed(String msg) {
        Toast.makeText(this, "onLoginFailed()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }
}
