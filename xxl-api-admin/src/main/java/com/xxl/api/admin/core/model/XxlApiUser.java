package com.xxl.api.admin.core.model;

/**
 * Created by xuxueli on 17/3/29.
 */
public class XxlApiUser {

    private int id;             // 用户ID
    private String userName;    // 账号
    private String password;    // 密码
    private int type;           // 用户类型：0-普通用户、1-超级管理员

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
