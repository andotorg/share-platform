package org.andot.share.api.entity;

import lombok.Data;

@Data
public class FileBase extends BaseEntity {
    private Long fileId;
    private String fileName;
    private String fileUrl;
    private Double fileSize;
    private Integer filType;
    private String fileMemo;
}
