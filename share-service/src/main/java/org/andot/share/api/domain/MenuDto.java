package org.andot.share.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("菜單對象")
@Setter
@Getter
public class MenuDto {
    @ApiModelProperty("菜單名稱")
    private String menuName;
    @ApiModelProperty("菜單名稱")
    private String menuUrl;
    @ApiModelProperty("菜單名稱")
    private Integer menuType;
    @ApiModelProperty("菜單名稱")
    private Long menuParentId;
    @ApiModelProperty("菜單名稱")
    private String menuIcon;
    @ApiModelProperty("菜單名稱")
    private String pageUrl;
    @ApiModelProperty("菜單名稱")
    private Long appSystemId;
    @ApiModelProperty("菜單名稱")
    private String orderCode;
    @ApiModelProperty("菜單名稱")
    private Integer disabled;
}
