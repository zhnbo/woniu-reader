package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    private String categoryName;

    private Date addTime;


    public Integer getCategoryId() {
        return categoryId;
    }

    public Category setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Category setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public Date getAddTime() {
        return addTime;
    }

    public Category setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }

    public static final String CATEGORY_ID = "category_id";

    public static final String CATEGORY_NAME = "category_name";

    public static final String ADD_TIME = "add_time";

    @Override
    public String toString() {
        return "Category{" +
        "categoryId=" + categoryId +
        ", categoryName=" + categoryName +
        ", addTime=" + addTime +
        "}";
    }
}
