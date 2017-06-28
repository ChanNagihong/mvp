package com.nagihong.mvp.api.login;

import com.nagihong.mvp.base.api.ApiResultBean;
import com.nagihong.mvp.model.UserBean;

/**
 * Created by channagihong on 25/06/2017.
 */

public class LoginResultBean extends ApiResultBean<UserBean> {

    private String accountId;
    private String name;
    private String avatar;

    private LoginRequestBean requestBean;

    public LoginRequestBean getRequestBean() {
        return requestBean;
    }

    public void setRequestBean(LoginRequestBean requestBean) {
        this.requestBean = requestBean;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    @Override
    public UserBean toLocalBean() {
        UserBean userBean = new UserBean();
        userBean.setAccountId(accountId);
        userBean.setName(name);
        userBean.setAvatar(avatar);
        userBean.setLastLoginTime(System.currentTimeMillis());
        userBean.setUsername(requestBean.getUsername());
        userBean.setPassword(requestBean.getPassword());
        userBean.setPersistentLogin(false);
        return userBean;
    }
}
