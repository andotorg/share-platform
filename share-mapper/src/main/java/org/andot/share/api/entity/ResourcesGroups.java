package org.andot.share.api.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class ResourcesGroups implements Serializable {
    private Integer resGroupId;
    private Byte resourcesType;
    private byte[] resourcesId;
    private byte[] groupsId;
}