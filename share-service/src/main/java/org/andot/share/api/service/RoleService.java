package org.andot.share.api.service;

import org.andot.share.api.entity.Role;

import java.util.List;

public interface RoleService {
    /**
     * 根据角色id获取角色
     * @param roleId
     * @return
     */
    Role getRoleById(Long roleId);

    /**
     * 根据角色名称查询角色列表
     * @param roleName
     * @return
     */
    List<Role> getRoleList(String roleName);
}
