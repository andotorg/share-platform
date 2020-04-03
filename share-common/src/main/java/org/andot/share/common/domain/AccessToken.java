package org.andot.share.common.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * token存储，登录之后返回，可以把用户信息放入data返回
 * @author lucas
 */
@Setter
@Getter
public class AccessToken<T> {
    private T data;
    private String token;
    private String prefix;
}
