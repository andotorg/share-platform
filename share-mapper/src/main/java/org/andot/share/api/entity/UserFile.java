package org.andot.share.api.entity;

import lombok.Data;


@Data
public class UserFile {
    private Integer userFileId;
    private Integer fileId;
    private Integer userId;
}