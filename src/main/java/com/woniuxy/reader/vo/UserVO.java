package com.woniuxy.reader.vo;

/**
 * 用户 VO
 * @author zh_o
 * @date: 2020-10-06
 */
public class UserVO extends BaseVO {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                super.toString() +
                '}';
    }
}
