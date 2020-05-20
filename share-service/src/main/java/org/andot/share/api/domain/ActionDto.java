package org.andot.share.api.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ActionDto {
    private Integer actionId;
    private String actionName;
    private Byte actionType;
    private String actionUrl;
    private Integer menuId;
    private String caption;
}
