package org.andot.share.api.service;

import org.andot.share.api.entity.Action;

import java.util.List;

/**
 * 请求地址服务接口
 * 用于请求地址创建、修改、删除、查询、分配角色
 * @author lucas
 * @date 2020-4-18
 * @since 1.0
 */
public interface ActionService {

    Action getActionById(Long roleId);

    List<Action> getActionList(String actionName, String actionUrl);

    boolean saveAction(Action role);

    boolean updateAction(Action role);

    boolean delActionById(Long id);
}
