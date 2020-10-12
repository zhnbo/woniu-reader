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
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    private Integer bookId;

    private Integer chapterId;

    private String commentContent;

    private Date commentDate;

    @TableLogic
    private Integer status;


    public Integer getCommentId() {
        return commentId;
    }

    public Comment setCommentId(Integer commentId) {
        this.commentId = commentId;
        return this;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Comment setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public Comment setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
        return this;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public Comment setCommentContent(String commentContent) {
        this.commentContent = commentContent;
        return this;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public Comment setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Comment setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public static final String COMMENT_ID = "comment_id";

    public static final String BOOK_ID = "book_id";

    public static final String CHAPTER_ID = "chapter_id";

    public static final String COMMENT_CONTENT = "comment_content";

    public static final String COMMENT_DATE = "comment_date";

    public static final String STATUS = "status";

    @Override
    public String toString() {
        return "Comment{" +
        "commentId=" + commentId +
        ", bookId=" + bookId +
        ", chapterId=" + chapterId +
        ", commentContent=" + commentContent +
        ", commentDate=" + commentDate +
        ", status=" + status +
        "}";
    }
}
