package org.andot.share.api.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ActionOperatePower extends BaseEntity {
    private Integer actionPowerId;
    private Integer actionId;
    private Integer operatePowerId;
    private static final long serialVersionUID = 1L;
}