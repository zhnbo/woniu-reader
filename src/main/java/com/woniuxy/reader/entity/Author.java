package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
@ApiModel(value="Author对象", description="")
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "author_id", type = IdType.AUTO)
    private Integer authorId;

    private String authorTel;

    private String password;

    private String penName;

    private Double payment;

    private Integer editorId;

    private String email;

    private String sex;

    private Date authorTime;

    private String qq;

    private String name;

    private Date birthday;

    private String address;

    private String idCard;

    private String bankCard;

    private String description;

    private String level;

    @TableField(exist = false)
    private Integer bookNum;

    @TableLogic
    private Integer status;

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Author setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getAuthorTel() {
        return authorTel;
    }

    public Author setAuthorTel(String authorTel) {
        this.authorTel = authorTel;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Author setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPenName() {
        return penName;
    }

    public Author setPenName(String penName) {
        this.penName = penName;
        return this;
    }

    public Double getPayment() {
        return payment;
    }

    public Author setPayment(Double payment) {
        this.payment = payment;
        return this;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public Author setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Author setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Date getAuthorTime() {
        return authorTime;
    }

    public Author setAuthorTime(Date authorTime) {
        this.authorTime = authorTime;
        return this;
    }

    public String getQq() {
        return qq;
    }

    public Author setQq(String qq) {
        this.qq = qq;
        return this;
    }

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Author setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Author setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public Author setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getBankCard() {
        return bankCard;
    }

    public Author setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Author setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Author setLevel(String level) {
        this.level = level;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Author setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public static final String AUTHOR_ID = "author_id";

    public static final String AUTHOR_TEL = "author_tel";

    public static final String PASSWORD = "password";

    public static final String PEN_NAME = "pen_name";

    public static final String PAYMENT = "payment";

    public static final String EDITOR_ID = "editor_id";

    public static final String EMAIL = "email";

    public static final String SEX = "sex";

    public static final String AUTHOR_TIME = "author_time";

    public static final String QQ = "qq";

    public static final String NAME = "name";

    public static final String BIRTHDAY = "birthday";

    public static final String ADDRESS = "address";

    public static final String ID_CARD = "id_card";

    public static final String BANK_CARD = "bank_card";

    public static final String DESCRIPTION = "description";

    public static final String LEVEL = "level";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorTel='" + authorTel + '\'' +
                ", password='" + password + '\'' +
                ", penName='" + penName + '\'' +
                ", payment=" + payment +
                ", editorId=" + editorId +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", authorTime=" + authorTime +
                ", qq='" + qq + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", bookNum=" + bookNum +
                ", status=" + status +
                '}';
    }
}
