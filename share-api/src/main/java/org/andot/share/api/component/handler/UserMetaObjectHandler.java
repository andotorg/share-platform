package org.andot.share.api.component.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.andot.share.api.component.utils.CurrentUserUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Component
public class UserMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "createTime", Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
        this.fillStrategy(metaObject, "createPerson", CurrentUserUtil.getUserCode());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "updateTime", Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
        this.fillStrategy(metaObject, "updatePerson", CurrentUserUtil.getUserCode());
    }
}
