package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class User extends BaseEntity {
    private Long userId;
    private Long xNumber;
    private String phone;
    private String password;
    private String salt;
    private Integer userType;
    private Integer onlineStatus;
}
