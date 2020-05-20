package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class MenuElement extends BaseEntity {
    private Integer menuElementId;
    private Integer menuId;
    private Integer elementId;
}