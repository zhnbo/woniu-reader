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
@ApiModel(value="Collection对象", description="")
public class Collection implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "collection_id", type = IdType.AUTO)
    private Integer collectionId;

    private Integer userId;

    private Integer bookId;

    private Date collectionTime;


    public Integer getCollectionId() {
        return collectionId;
    }

    public Collection setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Collection setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Collection setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public Collection setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
        return this;
    }

    public static final String COLLECTION_ID = "collection_id";

    public static final String USER_ID = "user_id";

    public static final String BOOK_ID = "book_id";

    public static final String COLLECTION_TIME = "collection_time";

    @Override
    public String toString() {
        return "Collection{" +
        "collectionId=" + collectionId +
        ", userId=" + userId +
        ", bookId=" + bookId +
        ", collectionTime=" + collectionTime +
        "}";
    }
}
