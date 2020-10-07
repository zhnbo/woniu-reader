package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 * @author zh_o
 * @date 2020-10-06
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private Integer balance;

    private String userTel;

    private String email;

    private String sex;

    private String qq;

    private Date birthday;

    private Date registerTime;

    private Date lastLogin;

    private String description;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public User setBalance(Integer balance) {
        this.balance = balance;
        return this;
    }

    public String getUserTel() {
        return userTel;
    }

    public User setUserTel(String userTel) {
        this.userTel = userTel;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getQq() {
        return qq;
    }

    public User setQq(String qq) {
        this.qq = qq;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public User setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public User setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public User setDescription(String description) {
        this.description = description;
        return this;
    }

    public static final String ID = "id";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String BALANCE = "balance";

    public static final String USER_TEL = "user_tel";

    public static final String EMAIL = "email";

    public static final String SEX = "sex";

    public static final String QQ = "qq";

    public static final String BIRTHDAY = "birthday";

    public static final String REGISTER_TIME = "register_time";

    public static final String LAST_LOGIN = "last_login";

    public static final String DESCRIPTION = "description";

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", balance=" + balance +
        ", userTel=" + userTel +
        ", email=" + email +
        ", sex=" + sex +
        ", qq=" + qq +
        ", birthday=" + birthday +
        ", registerTime=" + registerTime +
        ", lastLogin=" + lastLogin +
        ", description=" + description +
        "}";
    }
}
