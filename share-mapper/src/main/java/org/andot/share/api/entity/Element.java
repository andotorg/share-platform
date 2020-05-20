package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Element extends BaseEntity {
    private Long elementId;
    private Integer elementType;
    private String elementName;
    private Integer elementFlag;
}
