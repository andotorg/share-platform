package org.andot.share.common.response;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.List;

/**
 * PageHelper分页数据封装类
 * @author lucas
 * @date 2019-12-29 09:50:49
 */
@Getter
@Setter
@NoArgsConstructor
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> data;
    @ApiModelProperty(value = "状态码", notes = "200:成功 201:重复操作 401:未授权 403:禁止访问 404:未找到 302:用户或者密码错误 405:参数错误 500:服务端错误 416:账户已经注册 415:失败  414:未知错误 999:版本需要更新")
    private long code;
    private String message;
    private long timestamp = LocalTime.now().getLong(ChronoField.NANO_OF_DAY);

    protected CommonPage(long code, String message, List<T> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setData(pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
        CommonPage<T> result = new CommonPage<>();
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setData(pageInfo.getResult());
        return result;
    }

    /**
     * 失败返回结果
     * @param resultCode 错误码
     */
    public static <T> CommonPage<T> failed(ResultCode resultCode) {
        return new CommonPage<T>(resultCode.getCode(), resultCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonPage<T> failed(String message) {
        return new CommonPage<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonPage<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonPage<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonPage<T> validateFailed(String message) {
        return new CommonPage<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }
}
