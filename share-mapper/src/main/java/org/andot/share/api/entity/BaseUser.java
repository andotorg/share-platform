package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
public class BaseUser extends BaseEntity {
    private Integer userId;
    private String username;
    private String password;
    private Byte userType;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}