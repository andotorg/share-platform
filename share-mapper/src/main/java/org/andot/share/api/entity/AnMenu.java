package org.andot.share.api.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnMenu {
    private Long menuId;
    private String menuName;
    private String menuUrl;
    private Integer menuType;
    private Long menuParentId;
    private String menuIcon;
    private String appSystemId;
    private String orderCode;
}