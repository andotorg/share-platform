package org.andot.share.api.component.exception.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.andot.share.api.component.utils.CurrentUserUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "createTime", LocalDateTime.now());
        this.fillStrategy(metaObject, "createPerson", CurrentUserUtil.getUserCode());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now());
        this.fillStrategy(metaObject, "updatePerson", CurrentUserUtil.getUserCode());
    }
}
