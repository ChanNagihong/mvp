package com.nagihong.mvp.model;

/**
 * Created by channagihong on 22/06/2017.
 */

public class UserBean {

    private String accountId;
    private String name;
    private String avatar;
    private boolean persistentLogin;
    private long lastLoginTime;
    private String username;
    private String password;


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

    public boolean isPersistentLogin() {
        return persistentLogin;
    }

    public void setPersistentLogin(boolean persistentLogin) {
        this.persistentLogin = persistentLogin;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
