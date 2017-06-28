package com.nagihong.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by channagihong on 22/06/2017.
 */
@Entity
public class UserBean {

    @Id(autoincrement = true)
    private Long id;
    private String accountId;
    private String name;
    private String avatar;
    private boolean persistentLogin;
    private long lastLoginTime;
    private String username;
    private String password;

    @Generated(hash = 1472003918)
    public UserBean(Long id, String accountId, String name, String avatar,
            boolean persistentLogin, long lastLoginTime, String username,
            String password) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.avatar = avatar;
        this.persistentLogin = persistentLogin;
        this.lastLoginTime = lastLoginTime;
        this.username = username;
        this.password = password;
    }

    @Generated(hash = 1203313951)
    public UserBean() {
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getPersistentLogin() {
        return this.persistentLogin;
    }
}
