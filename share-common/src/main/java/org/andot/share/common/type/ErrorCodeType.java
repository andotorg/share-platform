package org.andot.share.common.type;

/**
 * 错误码
 * @author gavin
 */
public enum  ErrorCodeType {

    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 重复操作
     */
    REPEAT_OPERATE(201),
    /**
     * 未授权
     */
    UNAUTHORIZED(401),
    /**
     * 禁止访问
     */
    FORBIDDEN(403),
    /**
     * 未找到
     */
    NOT_FOUNT(404),
    /**
     * 用户或者密码错误
     */
    USERNAME_OR_PASS_ERROR(302),
    /**
     * 参数错误
     */
    PARAM_ERROR(405),
    /**
     * 服务端错误
     */
    SERVER_ERROR(500),
    /**
     * 账户已经注册
     */
    ACCOUNT_REGISTER(416),
    /**
     * 失败
     */
    FAIL(415),
    /**
     * 未知错误
     */
    ERROR(414),
    /**
     * 版本需要更新
     */
    UPDATE(999);




    private int value;
    ErrorCodeType(int value){
        this.value = value;
    }

    public int intValue(){
        return this.value;
    }
}
