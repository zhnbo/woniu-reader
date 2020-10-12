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
@ApiModel(value="Subscribe对象", description="")
public class Subscribe implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "subscribe_id", type = IdType.AUTO)
    private Integer subscribeId;

    private Integer chapterId;

    private Double amount;

    private Integer userId;

    private Date subscribeTime;


    public Integer getSubscribeId() {
        return subscribeId;
    }

    public Subscribe setSubscribeId(Integer subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public Subscribe setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Subscribe setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Subscribe setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public Subscribe setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
        return this;
    }

    public static final String SUBSCRIBE_ID = "subscribe_id";

    public static final String CHAPTER_ID = "chapter_id";

    public static final String AMOUNT = "amount";

    public static final String USER_ID = "user_id";

    public static final String SUBSCRIBE_TIME = "subscribe_time";

    @Override
    public String toString() {
        return "Subscribe{" +
        "subscribeId=" + subscribeId +
        ", chapterId=" + chapterId +
        ", amount=" + amount +
        ", userId=" + userId +
        ", subscribeTime=" + subscribeTime +
        "}";
    }
}
