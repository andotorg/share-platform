package org.andot.share.api.service;

import org.andot.share.api.dto.UserDto;
import org.andot.share.api.dto.XUserDetail;
import org.andot.share.api.entity.User;
import org.andot.share.api.entity.UserDetail;

public interface UserService {
    /**
     * 根据 x number 获取用户信息
     * @param xNumber
     * @return
     */
    UserDetail getUserDetail(Long xNumber);

    UserDto getUser(Long xNumber);

    UserDto getUser(String phone);

    XUserDetail login(String number, String password);
}
