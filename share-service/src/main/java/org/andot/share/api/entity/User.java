package org.andot.share.api.entity;

import lombok.Data;

@Data
public class User extends BaseEntity {
    private Long userId;
    private Long xNumber;
    private String phone;
    private String password;
    private String salt;
    private Integer userType;
    private Integer onlineStatus;
}
