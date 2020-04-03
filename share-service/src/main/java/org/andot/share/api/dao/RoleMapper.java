package org.andot.share.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.andot.share.api.entity.BaseUser;
import org.andot.share.api.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends BaseMapper<Role> {
}
