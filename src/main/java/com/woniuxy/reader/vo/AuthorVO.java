package com.woniuxy.reader.vo;

/**
 * @author zh_o
 * @date: 2020-10-09
 */
public class AuthorVO extends BaseVO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorVO{" +
                "name='" + name + '\'' +
                super.toString() +
                '}';
    }
}
