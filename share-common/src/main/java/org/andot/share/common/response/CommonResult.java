package org.andot.share.common.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * 通用返回对象
 * @author lucas
 * @date 2019-12-28 21:58:09
 */
@Slf4j
@Setter
@Getter
public class CommonResult<T> {
    @ApiModelProperty(value = "状态码", notes = "200:成功 201:重复操作 401:未授权 403:禁止访问 404:未找到 302:用户或者密码错误 405:参数错误 500:服务端错误 416:账户已经注册 415:失败  414:未知错误 999:版本需要更新")
    private long code;
    private String message;
    private T data;
    private long timestamp = LocalTime.now().getLong(ChronoField.NANO_OF_DAY);

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    protected CommonResult(long code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param resultCode 错误码
     */
    public static <T> CommonResult<T> failed(ResultCode resultCode) {
        return new CommonResult<T>(resultCode.getCode(), resultCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized() {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage());
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden() {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage());
    }

    public static <T> CommonResult<T> uni(long code, String message){
        return new CommonResult<T>(code, message);
    }

    public String toJsonString(){
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            log.error("数据转换错误：{}"+e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
