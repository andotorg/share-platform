package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class ActionOperatePower extends BaseEntity {
    private Integer actionPowerId;
    private Integer actionId;
    private Integer operatePowerId;
    private static final long serialVersionUID = 1L;
}