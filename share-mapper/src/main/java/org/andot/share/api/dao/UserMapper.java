package org.andot.share.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.andot.share.api.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
