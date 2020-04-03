package org.andot.share.api.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserDetail extends BaseEntity {
    private Long id;
    private Long xNumber;
    private String realName;
    private String introduction;
    private String sex;
    private Date birthday;
    private Boolean auth;
    private String domain;
}
