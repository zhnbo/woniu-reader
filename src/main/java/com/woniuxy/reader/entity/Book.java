package com.woniuxy.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
@ApiModel(value="Book对象", description="")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;

    private String bookName;

    private String image;

    private String description;

    private Integer authorId;

    private Integer categoryId;

    @TableLogic
    private Integer status;

    private Integer count;

    private Integer countDay;

    private Date createTime;

    private Date updateTime;

    private Integer flag;


    public Integer getBookId() {
        return bookId;
    }

    public Book setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Book setImage(String image) {
        this.image = image;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Book setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Book setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Book setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Book setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Book setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCountDay() {
        return countDay;
    }

    public Book setCountDay(Integer countDay) {
        this.countDay = countDay;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Book setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Book setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getFlag() {
        return flag;
    }

    public Book setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    public static final String BOOK_ID = "book_id";

    public static final String BOOK_NAME = "book_name";

    public static final String IMAGE = "image";

    public static final String DESCRIPTION = "description";

    public static final String AUTHOR_ID = "author_id";

    public static final String CATEGORY_ID = "category_id";

    public static final String STATUS = "status";

    public static final String COUNT = "count";

    public static final String COUNT_DAY = "count_day";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String FLAG = "flag";

    @Override
    public String toString() {
        return "Book{" +
        "bookId=" + bookId +
        ", bookName=" + bookName +
        ", image=" + image +
        ", description=" + description +
        ", authorId=" + authorId +
        ", categoryId=" + categoryId +
        ", status=" + status +
        ", count=" + count +
        ", countDay=" + countDay +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", flag=" + flag +
        "}";
    }
}
