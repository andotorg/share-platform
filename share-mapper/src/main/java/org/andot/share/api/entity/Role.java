package org.andot.share.api.entity;

import lombok.Data;

@Data
public class Role extends BaseEntity {
    private Integer roleId;
    private String roleName;
    private String roleCode;
    private Byte roleType;
}