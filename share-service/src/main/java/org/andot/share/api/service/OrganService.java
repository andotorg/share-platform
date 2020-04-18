package org.andot.share.api.service;

import org.andot.share.api.dto.OrganDto;
import org.andot.share.api.entity.Organ;

import java.util.List;

/**
 * 组织服务接口
 * 用于组织创建、修改、删除、查询、分配角色
 * @author lucas
 * @date 2020-4-18
 * @since 1.0
 */
public interface OrganService {

    Organ getOrganById(Long roleId);

    List<Organ> getOrganList(String organName);

    boolean saveOrgan(Organ role);

    boolean updateOrgan(Organ role);

    boolean delOrganById(Long id);

    List<OrganDto> getOrganTree(Long organId);
}
