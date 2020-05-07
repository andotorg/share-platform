package org.andot.share.api.entity;

import lombok.Data;

@Data
public class MenuElement extends BaseEntity {
    private Integer menuElementId;
    private Integer menuId;
    private Integer elementId;
}