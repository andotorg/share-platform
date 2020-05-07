package org.andot.share.api.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseUser extends BaseEntity {
    private Integer userId;
    private String username;
    private String password;
    private Byte userType;
    private Byte disabled;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}