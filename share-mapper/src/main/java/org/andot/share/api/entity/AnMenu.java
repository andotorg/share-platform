package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AnMenu extends BaseEntity {
    private Long menuId;
    private String menuName;
    private String menuUrl;
    private Integer menuType;
    private Long menuParentId;
    private String menuIcon;
    private String appSystemId;
    private String orderCode;
}