package org.andot.share.api.entity;

import lombok.Data;

@Data
public class MenuOperatePower extends BaseEntity {
    private Integer menuPowerId;
    private Integer powerId;
    private Integer menuId;
}