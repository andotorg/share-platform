package org.andot.share.api.service;

import org.andot.share.api.dto.RoleDto;
import org.andot.share.api.entity.Role;

import java.util.List;

/**
 * 角色服务接口
 * 用于角色创建、修改、删除、查询、分配角色
 * @author lucas
 * @date 2020-4-18 11:07:27
 * @since 1.0
 */
public interface RoleService {
    /**
     * 根据角色id获取角色
     * @param roleId
     * @return
     */
    RoleDto getRoleById(Long roleId);

    /**
     * 根据角色名称查询角色列表
     * @param roleName
     * @return
     */
    List<RoleDto> getRoleList(String roleName);

    boolean saveRole(RoleDto role);

    boolean updateRole(RoleDto role);

    boolean delRoleById(Long id);
}
