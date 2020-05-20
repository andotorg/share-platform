package org.andot.share.api.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OperatePower implements Serializable {
    private Integer operatePowerId;
    private String operatePowerName;
    private Byte operatePowerType;
}