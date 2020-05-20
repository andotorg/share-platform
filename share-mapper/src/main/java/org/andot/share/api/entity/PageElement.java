package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PageElement extends BaseEntity {
    private Integer pageElementId;
    private String pageElementName;
    private String pageElementCode;
    private Byte pageElementType;
    private String pageElementUrl;
}