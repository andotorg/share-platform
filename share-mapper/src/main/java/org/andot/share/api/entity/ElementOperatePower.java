package org.andot.share.api.entity;

import lombok.Data;

@Data
public class ElementOperatePower extends BaseEntity {
    private Integer elementPowerId;
    private Integer operatePowerId;
    private Integer pageElementId;
}