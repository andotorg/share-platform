package org.andot.share.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.andot.share.api.entity.BaseUser;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUserMapper extends BaseMapper<BaseUser> {
}
