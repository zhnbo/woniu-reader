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
@ApiModel(value="Chapter对象", description="")
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "chapter_id", type = IdType.AUTO)
    private Integer chapterId;

    private String chapterName;

    private String content;

    private Integer wordNumber;

    private Integer bookId;

    private Double amount;

    private Date updateTime;

    @TableLogic
    private Integer status;


    public Integer getChapterId() {
        return chapterId;
    }

    public Chapter setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
        return this;
    }

    public String getChapterName() {
        return chapterName;
    }

    public Chapter setChapterName(String chapterName) {
        this.chapterName = chapterName;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Chapter setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getWordNumber() {
        return wordNumber;
    }

    public Chapter setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
        return this;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Chapter setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Chapter setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Chapter setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Chapter setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public static final String CHAPTER_ID = "chapter_id";

    public static final String CHAPTER_NAME = "chapter_name";

    public static final String CONTENT = "content";

    public static final String WORD_NUMBER = "word_number";

    public static final String BOOK_ID = "book_id";

    public static final String AMOUNT = "amount";

    public static final String UPDATE_TIME = "update_time";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Chapter{" +
        "chapterId=" + chapterId +
        ", chapterName=" + chapterName +
        ", content=" + content +
        ", wordNumber=" + wordNumber +
        ", bookId=" + bookId +
        ", amount=" + amount +
        ", updateTime=" + updateTime +
        ", status=" + status +
        "}";
    }
}
