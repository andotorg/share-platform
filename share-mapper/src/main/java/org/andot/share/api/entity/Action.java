package org.andot.share.api.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Action extends BaseEntity {
    private Integer actionId;
    private String actionName;
    private Byte actionType;
    private String actionUrl;
    private Integer menuId;
    private String caption;
    private Byte disabled;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
    private static final long serialVersionUID = 1L;
}