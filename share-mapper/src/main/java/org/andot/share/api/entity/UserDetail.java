package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
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
