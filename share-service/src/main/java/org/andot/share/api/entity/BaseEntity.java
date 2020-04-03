package org.andot.share.api.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Boolean disabled;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    private Date deleteTime;
    @TableField(fill = FieldFill.INSERT)
    private String createPerson;
    @TableField(fill = FieldFill.UPDATE)
    private String updatePerson;
    private String deletePerson;
}
