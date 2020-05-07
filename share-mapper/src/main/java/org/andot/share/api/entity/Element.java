package org.andot.share.api.entity;

import lombok.Data;

@Data
public class Element extends BaseEntity {
    private Long elementId;
    private Integer elementType;
    private String elementName;
    private Integer elementFlag;
}
