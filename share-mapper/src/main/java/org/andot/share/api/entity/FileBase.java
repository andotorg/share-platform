package org.andot.share.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class FileBase extends BaseEntity {
    private Long fileId;
    private String fileName;
    private String fileUrl;
    private Double fileSize;
    private Integer filType;
    private String fileMemo;
}
