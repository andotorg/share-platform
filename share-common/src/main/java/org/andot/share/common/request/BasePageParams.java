package org.andot.share.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 基础分页参数
 * @author gavin
 */
@ApiModel("基础分页参数")
@Setter
@Getter
public class BasePageParams {
    @ApiModelProperty("一页几行")
    private int rows;
    @ApiModelProperty("第几页")
    private int page;
}
