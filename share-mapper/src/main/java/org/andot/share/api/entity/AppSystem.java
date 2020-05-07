package org.andot.share.api.entity;

import lombok.Data;

@Data
public class AppSystem extends BaseEntity{
    private Long appSystemId;
    private String appSystemName;
    private String appSystemIcon;
    private String appSystemUrl;
    private String orderCode;
}
