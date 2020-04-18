package org.andot.share.api.service.impl;

import org.andot.share.api.entity.Role;
import org.andot.share.api.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @see org.andot.share.api.service.RoleService
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Override
    public Role getRoleById(Long roleId) {
        return null;
    }

    @Override
    public List<Role> getRoleList(String roleName) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    @Override
    public boolean saveRole(Role role) {
        return false;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    @Override
    public boolean updateRole(Role role) {
        return false;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    @Override
    public boolean delRoleById(Long id) {
        return false;
    }
}
