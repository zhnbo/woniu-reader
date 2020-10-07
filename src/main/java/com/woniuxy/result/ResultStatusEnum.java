package com.woniuxy.result;

/**
 * 状态码枚举类
 * @author zh_o
 * @date: 2020-10-06
 */
public enum ResultStatusEnum {

    /**
     * 成功
     */
    SUCCESS(200, "success"),

    /**
     * 异常
     */
    ERROR(500, "服务器异常"),

    /**
     * 资源找不到
     */
    RESOURCE_NOT_FOUND(404,"资源找不到"),

    /**
     * 凭证错误
     */
    INCORRECT_CREDENTIALS(400,"不正确的凭证"),

    /**
     * 权限不足
     */
    UNAUTHORIZED(400,"权限不足"),

    BIND_ERROR(400,"参数不合法"),
    /**
     * 账户不存在
     */
    UNKNOWN_ACCOUNT(400,"账户不存在");



    /**
     * 业务状态码
     */
    private Integer code;

    /**
     * 业务信息描述
     */
    private String message;

    /**
     * 构造器
     * @param code
     * @param message
     */
    ResultStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
