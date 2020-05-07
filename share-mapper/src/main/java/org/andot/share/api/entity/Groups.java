package org.andot.share.api.entity;

import lombok.Data;

@Data
public class Groups extends BaseEntity {
    private Long group_id;
    private String group_name;
    private Integer number_limit;
    private Long group_parent_id;
    private String group_memo;
}
