package org.andot.share.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class JwtUserDetail {
    private List<String> roles;
    private String xNumber;
    private String username;
}
