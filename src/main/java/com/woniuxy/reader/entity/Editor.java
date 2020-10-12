package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zh_o
 * @since 2020-10-12
 */
@ApiModel(value="Editor对象", description="")
public class Editor implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "editor_id", type = IdType.AUTO)
    private Integer editorId;

    private String editorTel;

    private String password;

    @TableLogic
    private Integer status;


    public Integer getEditorId() {
        return editorId;
    }

    public Editor setEditorId(Integer editorId) {
        this.editorId = editorId;
        return this;
    }

    public String getEditorTel() {
        return editorTel;
    }

    public Editor setEditorTel(String editorTel) {
        this.editorTel = editorTel;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Editor setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Editor setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public static final String EDITOR_ID = "editor_id";

    public static final String EDITOR_TEL = "editor_tel";

    public static final String PASSWORD = "password";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Editor{" +
        "editorId=" + editorId +
        ", editorTel=" + editorTel +
        ", password=" + password +
        ", status=" + status +
        "}";
    }
}
