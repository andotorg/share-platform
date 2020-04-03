package org.andot.share.common.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum UserRoleType {
    SYSADMIN(1, "系统管理员"),
    RE(2, "研究员");

    private Integer roleId;
    private String roleDescription;

    public static UserRoleType getRoleById(Integer roleId) {
        return Arrays.stream(UserRoleType.values())
                .collect(Collectors.toMap(UserRoleType::getRoleId, Function.identity())).get(roleId);
    }
}
