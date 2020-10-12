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
@ApiModel(value="Reply对象", description="")
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "reply_id", type = IdType.AUTO)
    private Integer replyId;

    private Integer bookId;

    private Integer chapterId;

    private Integer userId;

    private String replyContent;

    private Date replyDate;


    public Integer getReplyId() {
        return replyId;
    }

    public Reply setReplyId(Integer replyId) {
        this.replyId = replyId;
        return this;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Reply setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public Reply setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Reply setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public Reply setReplyContent(String replyContent) {
        this.replyContent = replyContent;
        return this;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public Reply setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
        return this;
    }

    public static final String REPLY_ID = "reply_id";

    public static final String BOOK_ID = "book_id";

    public static final String CHAPTER_ID = "chapter_id";

    public static final String USER_ID = "user_id";

    public static final String REPLY_CONTENT = "reply_content";

    public static final String REPLY_DATE = "reply_date";

    @Override
    public String toString() {
        return "Reply{" +
        "replyId=" + replyId +
        ", bookId=" + bookId +
        ", chapterId=" + chapterId +
        ", userId=" + userId +
        ", replyContent=" + replyContent +
        ", replyDate=" + replyDate +
        "}";
    }
}
