package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zh_o
 * @since 2020-10-09
 */
@ApiModel(value="Manager对象", description="")
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "manager_id", type = IdType.AUTO)
    private Integer managerId;

    private String managerTel;

    private String password;

    @TableLogic
    private Integer status;


    public Integer getManagerId() {
        return managerId;
    }

    public Manager setManagerId(Integer managerId) {
        this.managerId = managerId;
        return this;
    }

    public String getManagerTel() {
        return managerTel;
    }

    public Manager setManagerTel(String managerTel) {
        this.managerTel = managerTel;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Manager setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Manager setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public static final String MANAGER_ID = "manager_id";

    public static final String MANAGER_TEL = "manager_tel";

    public static final String PASSWORD = "password";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Manager{" +
        "managerId=" + managerId +
        ", managerTel=" + managerTel +
        ", password=" + password +
        ", status=" + status +
        "}";
    }
}
