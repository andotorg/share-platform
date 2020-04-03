package org.andot.share.common.response;

import org.andot.share.common.type.ErrorCodeType;

/**
 * 枚举了一些常用API操作码
 * @author lucas
 * @date 2019-12-28 21:38:09
 */
public enum ResultCode {
    SUCCESS(ErrorCodeType.SUCCESS.intValue(), "操作成功"),
    FAILED(ErrorCodeType.SERVER_ERROR.intValue(), "操作失败"),
    VALIDATE_FAILED(ErrorCodeType.PARAM_ERROR.intValue(), "参数检验失败"),
    UNAUTHORIZED(ErrorCodeType.UNAUTHORIZED.intValue(), "暂未登录或token已经过期"),
    FORBIDDEN(ErrorCodeType.FORBIDDEN.intValue(), "当前账号没有相关权限访问"),
    UPDATE(ErrorCodeType.UPDATE.intValue(), "版本需要更新");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
