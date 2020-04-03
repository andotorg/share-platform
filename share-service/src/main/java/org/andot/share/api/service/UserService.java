package org.andot.share.api.service;

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

    User getUser(Long xNumber);

    User getUser(String phone);

    XUserDetail login(String number, String password);
}
