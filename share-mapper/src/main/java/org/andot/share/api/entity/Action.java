package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class Action extends BaseEntity {
    private Integer actionId;
    private String actionName;
    private Byte actionType;
    private String actionUrl;
    private Integer menuId;
    private String caption;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}