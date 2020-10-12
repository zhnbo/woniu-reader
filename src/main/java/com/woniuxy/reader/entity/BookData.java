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
@ApiModel(value="BookData对象", description="")
public class BookData implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "book_data_id", type = IdType.AUTO)
    private Integer bookDataId;

    private Integer bookId;

    private Integer clickNumber;

    private Integer collection;

    private Integer subscribe;

    private Date countDate;


    public Integer getBookDataId() {
        return bookDataId;
    }

    public BookData setBookDataId(Integer bookDataId) {
        this.bookDataId = bookDataId;
        return this;
    }

    public Integer getBookId() {
        return bookId;
    }

    public BookData setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public Integer getClickNumber() {
        return clickNumber;
    }

    public BookData setClickNumber(Integer clickNumber) {
        this.clickNumber = clickNumber;
        return this;
    }

    public Integer getCollection() {
        return collection;
    }

    public BookData setCollection(Integer collection) {
        this.collection = collection;
        return this;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public BookData setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public Date getCountDate() {
        return countDate;
    }

    public BookData setCountDate(Date countDate) {
        this.countDate = countDate;
        return this;
    }

    public static final String BOOK_DATA_ID = "book_data_id";

    public static final String BOOK_ID = "book_id";

    public static final String CLICK_NUMBER = "click_number";

    public static final String COLLECTION = "collection";

    public static final String SUBSCRIBE = "subscribe";

    public static final String COUNT_DATE = "count_date";

    @Override
    public String toString() {
        return "BookData{" +
        "bookDataId=" + bookDataId +
        ", bookId=" + bookId +
        ", clickNumber=" + clickNumber +
        ", collection=" + collection +
        ", subscribe=" + subscribe +
        ", countDate=" + countDate +
        "}";
    }
}
